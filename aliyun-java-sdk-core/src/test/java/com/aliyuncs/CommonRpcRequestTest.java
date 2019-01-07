package com.aliyuncs;

import com.aliyuncs.auth.BasicSessionCredentials;
import com.aliyuncs.auth.BearerTokenCredentials;
import com.aliyuncs.auth.KeyPairCredentials;
import com.aliyuncs.auth.Signer;
import com.aliyuncs.http.FormatType;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.regions.ProductDomain;
import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CommonRpcRequestTest {
    @Test
    public void acsRequestTest() {
        CommonRpcRequest acsRequest = new CommonRpcRequest("test");
        Assert.assertEquals("test", acsRequest.getBizProduct());
        Assert.assertEquals("Java/2.0.0", acsRequest.getHeaderValue("x-sdk-client"));
        Assert.assertEquals("normal", acsRequest.getHeaderValue("x-sdk-invoke-type"));
    }

    @Test
    public void acsRequestGetSetTest() throws UnsupportedEncodingException, InvalidKeyException, NoSuchAlgorithmException {
        CommonRpcRequest acsRequest = new CommonRpcRequest("test", "test", "test",
                "locationProduct", "endpointType");
        Assert.assertEquals("test", acsRequest.getBizVersion());
        Assert.assertEquals("test", acsRequest.getBizActionName());
        Assert.assertEquals("locationProduct", acsRequest.getBizLocationProduct());
        Assert.assertEquals("endpointType", acsRequest.getBizEndpointType());

        acsRequest.setSysRegionId("hangzhou");
        Assert.assertEquals("hangzhou", acsRequest.getBizRegionId());

        acsRequest.setSecurityToken("token");
        Assert.assertEquals("token", acsRequest.getSecurityToken());

        acsRequest.setAcceptFormat(FormatType.JSON);
        Assert.assertTrue(FormatType.JSON == acsRequest.getBizAcceptFormat());
        Assert.assertEquals("application/json", acsRequest.getHeaderValue("Accept"));

        acsRequest.setSysProtocol(ProtocolType.HTTP);
        Assert.assertTrue(ProtocolType.HTTP == acsRequest.getBizProtocol());

        acsRequest.setSysEndpoint("endPonit");
        Assert.assertTrue(acsRequest.getBizProductDomain() instanceof ProductDomain);

        acsRequest.putQueryParameter("test", "test");
        acsRequest.putQueryParameter("objectTest", 8);
        acsRequest.putQueryParameter("nullTest", null);
        Map<String, String> map = acsRequest.getBizQueryParameters();
        Assert.assertEquals("test", map.get("test"));
        Assert.assertEquals("8", map.get("objectTest"));
        Assert.assertNull(map.get("nullTest"));

        acsRequest.putDomainParameter("test", "test");
        acsRequest.putDomainParameter("objectTest", 8);
        map = acsRequest.getBizDomainParameters();
        Assert.assertEquals("test", map.get("test"));
        Assert.assertEquals("8", map.get("objectTest"));

        acsRequest.putBodyParameter("test", "test");
        acsRequest.putBodyParameter("objectTest", 8);
        map = acsRequest.getBizBodyParameters();
        Assert.assertEquals("test", map.get("test"));
        Assert.assertEquals("8", map.get("objectTest"));
    }

    @Test
    public void concatQueryStringTest() throws UnsupportedEncodingException {
        Assert.assertNull(CommonRpcRequest.concatQueryString(null));

        Map<String, String> map = new HashMap<String, String>();
        map.put("test", "test");
        String str = CommonRpcRequest.concatQueryString(map);
        Assert.assertEquals("test=test", str);
    }

    @Test
    public void commonRpcRequestTest() {
        CommonRpcRequest commonRpcRequest = new CommonRpcRequest("test", "test", "test",
                "locationProduct");
        Assert.assertEquals("test", commonRpcRequest.getBizProduct());
        Assert.assertEquals("test", commonRpcRequest.getBizVersion());
        Assert.assertEquals("test", commonRpcRequest.getBizActionName());
        Assert.assertEquals("locationProduct", commonRpcRequest.getBizLocationProduct());

        commonRpcRequest = new CommonRpcRequest("test", "test", "test");
        Assert.assertEquals("test", commonRpcRequest.getBizProduct());
        Assert.assertEquals("test", commonRpcRequest.getBizVersion());
        Assert.assertEquals("test", commonRpcRequest.getBizActionName());
    }

    @Test
    public void getResponseClassTest() {
        CommonRpcRequest commonRpcRequest = new CommonRpcRequest("test");
        Assert.assertTrue(CommonResponse.class == commonRpcRequest.getResponseClass());
    }

    @Test
    public void rpcAcsRequestGetSetTest() {
        CommonRpcRequest commonRpcRequest = new CommonRpcRequest("test");
        Map<String, String> map = commonRpcRequest.getBizQueryParameters();
        commonRpcRequest.setSysSecurityToken("token");
        Assert.assertEquals("token", commonRpcRequest.getBizSecurityToken());
        Assert.assertEquals("token", map.get("SecurityToken"));

        commonRpcRequest.setSysAcceptFormat(FormatType.JSON);
        Assert.assertTrue(FormatType.JSON == commonRpcRequest.getBizAcceptFormat());
        Assert.assertEquals("JSON", map.get("Format"));

        commonRpcRequest.setSysVersion("version");
        Assert.assertEquals("version", commonRpcRequest.getBizVersion());
        Assert.assertEquals("version", map.get("Version"));

        commonRpcRequest.setSysActionName("action");
        Assert.assertEquals("action", commonRpcRequest.getBizActionName());
        Assert.assertEquals("action", map.get("Action"));
    }

    @Test
    public void composeUrlTest() throws UnsupportedEncodingException {
        CommonRpcRequest commonRpcRequest = new CommonRpcRequest("test");
        commonRpcRequest.setSysProtocol(ProtocolType.HTTP);
        Map<String, String> map = new HashMap<String, String>(2);
        map.put("test", "test");
        String url = commonRpcRequest.composeUrl("test", map);
        Assert.assertEquals("http://test/?test=test", url);
    }

    @Test
    public void signRequestTest() throws UnsupportedEncodingException, InvalidKeyException {
        CommonRpcRequest commonRpcRequest = new CommonRpcRequest("test");
        commonRpcRequest.setSysProtocol(ProtocolType.HTTP);
        Signer signer = mock(Signer.class);
        BasicSessionCredentials credentials = mock(BasicSessionCredentials.class);
        when(credentials.getAccessKeyId()).thenReturn("testId");
        when(credentials.getAccessKeySecret()).thenReturn("testSecret");
        when(credentials.getSessionToken()).thenReturn("token");
        ProductDomain domain = mock(ProductDomain.class);
        when(domain.getDomianName()).thenReturn("testDomain");
        commonRpcRequest.signRequest(signer, credentials, FormatType.JSON, domain);
        Assert.assertTrue(commonRpcRequest.getBizUrl().contains("http"));
        Assert.assertTrue(commonRpcRequest.getBizUrl().contains("testDomain"));
        Assert.assertTrue(commonRpcRequest.getBizUrl().contains("SecurityToken=token"));
        Assert.assertTrue(commonRpcRequest.getBizUrl().contains("Format=JSON"));
        Assert.assertTrue(commonRpcRequest.getBizUrl().contains("AccessKeyId=testId"));

        commonRpcRequest = new CommonRpcRequest("test");
        commonRpcRequest.setSysProtocol(ProtocolType.HTTP);
        BearerTokenCredentials bearerTokenCredentials = mock(BearerTokenCredentials.class);
        when(bearerTokenCredentials.getBearerToken()).thenReturn("token");
        commonRpcRequest.putBodyParameter("test", "test");
        commonRpcRequest.setHttpContentType(FormatType.JSON);
        commonRpcRequest.signRequest(signer, bearerTokenCredentials, FormatType.JSON, domain);
        Assert.assertTrue(commonRpcRequest.getBizUrl().contains("BearerToken=token"));
        Map<String, String> map = commonRpcRequest.getBizBodyParameters();
        Assert.assertEquals("test", map.get("test"));

        commonRpcRequest = new CommonRpcRequest("test");
        commonRpcRequest.setSysProtocol(ProtocolType.HTTP);
        KeyPairCredentials keyPairCredentials = mock(KeyPairCredentials.class);
        commonRpcRequest.putBodyParameter("test", "xml");
        commonRpcRequest.setHttpContentType(FormatType.XML);
        commonRpcRequest.signRequest(signer, keyPairCredentials, FormatType.JSON, domain);
        map = commonRpcRequest.getBizBodyParameters();
        Assert.assertEquals("xml", map.get("test"));

        commonRpcRequest.setHttpContentType(FormatType.FORM);
        commonRpcRequest.signRequest(signer, keyPairCredentials, FormatType.JSON, domain);
        commonRpcRequest.putBodyParameter("test", "Form");
        Assert.assertEquals("Form", map.get("test"));
    }
}
