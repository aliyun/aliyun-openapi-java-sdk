package com.aliyuncs;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import com.aliyuncs.auth.AlibabaCloudCredentials;
import com.aliyuncs.auth.BasicSessionCredentials;
import com.aliyuncs.auth.BearerTokenCredentials;
import com.aliyuncs.auth.HmacSHA1Signer;
import com.aliyuncs.auth.RoaSignatureComposer;
import com.aliyuncs.http.FormatType;
import com.aliyuncs.http.HttpRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.regions.ProductDomain;

@RunWith(PowerMockRunner.class)
@PrepareForTest(RoaSignatureComposer.class)
public class CommonRoaRequestTest {

    @Test
    public void testRoaAcsRequestConstructor() {
        RoaAcsRequest request = new CommonRoaRequest("ecs");
        Assert.assertTrue(request.getBizAcceptFormat() == FormatType.JSON);
        Assert.assertEquals("ecs", request.getBizProduct());

        Assert.assertNull(request.getBizVersion());
        Assert.assertNull(request.getBizActionName());
        request = new CommonRoaRequest("ecs", "1.0", "action");
        Assert.assertTrue(request.getBizAcceptFormat() == FormatType.JSON);
        Assert.assertEquals("ecs", request.getBizProduct());
        Assert.assertEquals("1.0", request.getBizVersion());
        Assert.assertEquals("action", request.getBizActionName());

        Assert.assertNull(request.getLocationProduct());
        request = new CommonRoaRequest("ecs", "1.1", "action", "locationProduct");
        Assert.assertTrue(request.getBizAcceptFormat() == FormatType.JSON);
        Assert.assertEquals("ecs", request.getBizProduct());
        Assert.assertEquals("1.1", request.getBizVersion());
        Assert.assertEquals("action", request.getBizActionName());
        Assert.assertEquals("locationProduct", request.getLocationProduct());

        Assert.assertNull(request.getEndpointType());
        request = new CommonRoaRequest("ecs", "1.2", "action", "locationProduct", "endpointType");
        Assert.assertTrue(request.getBizAcceptFormat() == FormatType.JSON);
        Assert.assertEquals("ecs", request.getBizProduct());
        Assert.assertEquals("1.2", request.getBizVersion());
        Assert.assertEquals("action", request.getBizActionName());
        Assert.assertEquals("locationProduct", request.getLocationProduct());
        Assert.assertEquals("endpointType", request.getEndpointType());
    }

    @Test
    public void testGetResponseClass() {
        RoaAcsRequest request = new CommonRoaRequest("ecs");
        Assert.assertTrue(request.getResponseClass() == CommonResponse.class);
    }

    @Test
    public void testGetSet() {
        RoaAcsRequest request = new CommonRoaRequest("ecs");
        Assert.assertNull(request.getBizUriPattern());
        request.setSysUriPattern("uriPattern");
        Assert.assertEquals("uriPattern", request.getBizUriPattern());
        Assert.assertEquals("uriPattern", request.getUriPattern());

        Assert.assertNull(request.getSecurityToken());
        request.setSecurityToken("securityToken");
        Assert.assertEquals("securityToken", request.getSecurityToken());
        request.setSysSecurityToken("sysSecurityToken");
        Assert.assertEquals("sysSecurityToken", request.getSecurityToken());

        Assert.assertNull(request.getVersion());
        request.setSysVersion("1.1");
        Assert.assertEquals("1.1", request.getVersion());
        request.setVersion("1.2");
        Assert.assertEquals("1.2", request.getVersion());

        Assert.assertTrue(request.getBizPathParameters().isEmpty());
        request.putPathParameter("pathParamterString", "test");
        request.putPathParameter("pathParamterObject", Integer.valueOf(1));
        Assert.assertTrue(request.getPathParameters().size() == 2);
    }

    @Test
    public void testComposeUrl() throws UnsupportedEncodingException {
        RoaAcsRequest request = new CommonRoaRequest("ecs");
        request.setProtocol(ProtocolType.HTTPS);
        request.setSysUriPattern("uriPattern");
        PowerMockito.mockStatic(RoaSignatureComposer.class);
        BDDMockito.given(
                RoaSignatureComposer.replaceOccupiedParameters(request.getUriPattern(), request.getPathParameters()))
                .willReturn("static");
        Assert.assertEquals("https://cn-beijingstatic", request.composeUrl("cn-beijing", null));

        BDDMockito.given(
                RoaSignatureComposer.replaceOccupiedParameters(request.getUriPattern(), request.getPathParameters()))
                .willReturn("static?123");
        Assert.assertEquals("https://cn-beijingstatic?123", request.composeUrl("cn-beijing", null));
    }

    @Test
    public void testSignRequest()
            throws InvalidKeyException, IllegalStateException, UnsupportedEncodingException, NoSuchAlgorithmException {

        RoaSignatureComposer composer = Mockito.mock(RoaSignatureComposer.class);
        PowerMockito.mockStatic(RoaSignatureComposer.class);
        BDDMockito.given(RoaSignatureComposer.getComposer()).willReturn(composer);
        CommonRoaRequest request = new CommonRoaRequest("ecs");
        request.setMethod(MethodType.POST);
        request.setProtocol(ProtocolType.HTTPS);
        request.setHttpContentType(FormatType.JSON);
        request.putBodyParameter("test", "test");

        Mockito.when(composer.composeStringToSign(Mockito.any(MethodType.class), Mockito.any(String.class),
                Mockito.any(HmacSHA1Signer.class), Mockito.any(Map.class), Mockito.any(Map.class),
                Mockito.any(Map.class))).thenReturn("strToSign");

        BasicSessionCredentials credentials = Mockito.mock(BasicSessionCredentials.class);
        Mockito.when(credentials.getAccessKeyId()).thenReturn("accessKeyId");
        Mockito.when(credentials.getSessionToken()).thenReturn("sessionToken");
        ProductDomain productDomain = Mockito.mock(ProductDomain.class);
        HmacSHA1Signer signer = Mockito.mock(HmacSHA1Signer.class);
        Mockito.when(signer.signString(Mockito.anyString(), Mockito.any(AlibabaCloudCredentials.class)))
                .thenReturn("signature");

        Assert.assertTrue(
                request.signRequest(signer, credentials, FormatType.JSON, productDomain) instanceof HttpRequest);

        request.setHttpContentType(FormatType.XML);
        Assert.assertTrue(
                request.signRequest(signer, credentials, FormatType.JSON, productDomain) instanceof HttpRequest);
        request.setHttpContentType(FormatType.FORM);
        Assert.assertTrue(
                request.signRequest(signer, credentials, FormatType.JSON, productDomain) instanceof HttpRequest);

        BearerTokenCredentials bearerCredentials = Mockito.mock(BearerTokenCredentials.class);
        Mockito.when(bearerCredentials.getBearerToken()).thenReturn("bearerToken");
        Assert.assertTrue(
                request.signRequest(signer, bearerCredentials, FormatType.JSON, productDomain) instanceof HttpRequest);
    }

}
