package com.aliyuncs;

import com.aliyuncs.auth.AlibabaCloudCredentials;
import com.aliyuncs.auth.BasicCredentials;
import com.aliyuncs.auth.BasicSessionCredentials;
import com.aliyuncs.auth.Credential;
import com.aliyuncs.auth.SignatureVersion;
import com.aliyuncs.auth.Signer;
import com.aliyuncs.auth.signers.SignatureAlgorithm;
import com.aliyuncs.http.HttpRequest;
import com.aliyuncs.http.HttpResponse;
import com.aliyuncs.http.IHttpClient;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.profile.DefaultProfile;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.ArgumentCaptor;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;
import java.net.URI;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Map;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class SignatureV2Test {

    @Test
    public void defaultAndExplicitSha1Requests() throws Exception {
        for (boolean rpc : new boolean[]{true, false}) {
            for (MethodType method : new MethodType[]{MethodType.GET, MethodType.POST}) {
                for (boolean sts : new boolean[]{false, true}) {
                    for (int configuration = 0; configuration < 3; configuration++) {
                        AlibabaCloudCredentials credentials = sts
                                ? new BasicSessionCredentials("test-key", "test-secret", "test-token")
                                : new BasicCredentials("test-key", "test-secret");
                        DefaultAcsClient client = client(credentials);
                        AcsRequest<AcsResponse> request = request(rpc, method);
                        if (configuration == 1) {
                            client.setSignatureAlgorithm(SignatureAlgorithm.HMAC_SHA1);
                        } else if (configuration == 2) {
                            request.setSysSignatureAlgorithm(SignatureAlgorithm.HMAC_SHA1);
                        }
                        client.doAction(request);
                        assertV2Request(client, request, rpc, sts, configuration != 0);
                    }
                }
            }
        }
    }

    @Test
    public void requestAlgorithmOverridesClientAlgorithm() throws Exception {
        DefaultAcsClient client = client(new BasicCredentials("test-key", "test-secret"));
        client.setSignatureAlgorithm(SignatureAlgorithm.HMAC_SHA1);
        AcsRequest<AcsResponse> request = request(true, MethodType.GET);
        request.setSysSignatureAlgorithm(SignatureAlgorithm.ACS3_HMAC_SHA256);
        client.doAction(request);
        assertV2Request(client, request, true, false, false);
    }

    @Test
    public void legacyCredentialOverloadUsesSelectedAlgorithm() throws Exception {
        for (boolean sha1 : new boolean[]{false, true}) {
            DefaultAcsClient client = client(new BasicCredentials("test-key", "test-secret"));
            if (sha1) {
                client.setSignatureAlgorithm(SignatureAlgorithm.HMAC_SHA1);
            }
            AcsRequest<AcsResponse> request = request(true, MethodType.GET);
            client.doAction(request, "cn-hangzhou", new Credential("test-key", "test-secret"));
            assertV2Request(client, request, true, false, sha1);
        }
    }

    @Test
    public void v3StillUsesExistingProtocolAndHexSignature() throws Exception {
        for (boolean rpc : new boolean[]{true, false}) {
            DefaultAcsClient client = client(new BasicCredentials("test-key", "test-secret"));
            client.setSignatureVersion(SignatureVersion.V3);
            Assert.assertEquals(SignatureAlgorithm.ACS3_HMAC_SHA256, client.getSignatureAlgorithm());
            AcsRequest<AcsResponse> request = request(rpc, MethodType.POST);
            client.doAction(request);
            HttpRequest sent = sentRequest(client);
            String stringToSign = request.getSysStrToSign();
            if (rpc) {
                stringToSign = "ACS3-HMAC-SHA256\n" + hex(MessageDigest.getInstance("SHA-256")
                        .digest(stringToSign.getBytes("UTF-8")));
            }
            Assert.assertTrue(sent.getSysHeaders().get("Authorization").startsWith(
                    "ACS3-HMAC-SHA256 Credential=test-key,Signature="
                            + hex(hmac("HmacSHA256", stringToSign, "test-secret")) + ",SignedHeaders="));
            Assert.assertNotNull(sent.getSysHeaders().get("x-acs-content-sha256"));
        }
    }

    @Test
    public void sha256MatchesRfc4231Vector() {
        Signer signer = Signer.getSigner(new BasicCredentials("test-key", "unused"));
        Assert.assertEquals(DatatypeConverter.printBase64Binary(DatatypeConverter.parseHexBinary(
                "B0344C61D8DB38535CA8AFCEAF0BF12B881DC200C9833DA726E9376C2E32CFF7")),
                signer.signString("Hi There", "\013\013\013\013\013\013\013\013\013\013"
                        + "\013\013\013\013\013\013\013\013\013\013"));
        Assert.assertNull(signer.getSignerType());
        Assert.assertNull(signer.getContent());
    }

    private DefaultAcsClient client(AlibabaCloudCredentials credentials) throws Exception {
        DefaultAcsClient client = new DefaultAcsClient(DefaultProfile.getProfile("cn-hangzhou"), credentials);
        IHttpClient httpClient = mock(IHttpClient.class);
        HttpResponse response = new HttpResponse();
        response.setStatus(200);
        when(httpClient.syncInvoke(any(HttpRequest.class))).thenReturn(response);
        client.setHttpClient(httpClient);
        return client;
    }

    private AcsRequest<AcsResponse> request(boolean rpc, MethodType method) {
        AcsRequest<AcsResponse> request;
        if (rpc) {
            request = new RpcAcsRequest<AcsResponse>("Ecs", "2014-05-26", "DescribeRegions") {
                @Override
                public Class<AcsResponse> getResponseClass() {
                    return AcsResponse.class;
                }
            };
        } else {
            RoaAcsRequest<AcsResponse> roa = new RoaAcsRequest<AcsResponse>("CS", "2015-12-15", "DescribeRegions") {
                @Override
                public Class<AcsResponse> getResponseClass() {
                    return AcsResponse.class;
                }
            };
            roa.setSysUriPattern("/regions");
            request = roa;
        }
        request.setSysMethod(method);
        request.setSysProtocol(ProtocolType.HTTPS);
        request.setSysEndpoint("example.test");
        return request;
    }

    private void assertV2Request(DefaultAcsClient client, AcsRequest<AcsResponse> request,
                                 boolean rpc, boolean sts, boolean sha1) throws Exception {
        HttpRequest sent = sentRequest(client);
        String expected = DatatypeConverter.printBase64Binary(hmac(sha1 ? "HmacSHA1" : "HmacSHA256",
                request.getSysStrToSign(), "test-secret" + (rpc ? "&" : "")));
        if (rpc) {
            Map<String, String> query = new HashMap<String, String>();
            for (String pair : new URI(sent.getSysUrl()).getRawQuery().split("&")) {
                String[] parts = pair.split("=", 2);
                query.put(URLDecoder.decode(parts[0], "UTF-8"), URLDecoder.decode(parts[1], "UTF-8"));
            }
            Assert.assertEquals(sha1 ? "HMAC-SHA1" : "HMAC-SHA256", query.get("SignatureMethod"));
            Assert.assertEquals("1.0", query.get("SignatureVersion"));
            Assert.assertEquals(expected, query.get("Signature"));
            Assert.assertEquals(sts ? "test-token" : null, query.get("SecurityToken"));
        } else {
            Assert.assertEquals(sha1 ? "HMAC-SHA1" : "HMAC-SHA256", sent.getSysHeaders().get("x-acs-signature-method"));
            Assert.assertEquals("1.0", sent.getSysHeaders().get("x-acs-signature-version"));
            Assert.assertEquals("acs test-key:" + expected, sent.getSysHeaders().get("Authorization"));
            Assert.assertEquals(sts ? "test-token" : null, sent.getSysHeaders().get("x-acs-security-token"));
        }
    }

    private HttpRequest sentRequest(DefaultAcsClient client) throws Exception {
        ArgumentCaptor<HttpRequest> capture = ArgumentCaptor.forClass(HttpRequest.class);
        verify(client.getHttpClient()).syncInvoke(capture.capture());
        return capture.getValue();
    }

    private byte[] hmac(String algorithm, String value, String secret) throws Exception {
        Mac mac = Mac.getInstance(algorithm);
        mac.init(new SecretKeySpec(secret.getBytes("UTF-8"), algorithm));
        return mac.doFinal(value.getBytes("UTF-8"));
    }

    private String hex(byte[] value) {
        return DatatypeConverter.printHexBinary(value).toLowerCase(java.util.Locale.ROOT);
    }
}
