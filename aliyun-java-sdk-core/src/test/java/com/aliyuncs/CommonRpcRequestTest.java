package com.aliyuncs;

import com.aliyuncs.auth.BasicSessionCredentials;
import com.aliyuncs.auth.BearerTokenCredentials;
import com.aliyuncs.auth.KeyPairCredentials;
import com.aliyuncs.auth.Signer;
import com.aliyuncs.http.FormatType;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.UserAgentConfig;
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
        Assert.assertEquals("test", acsRequest.getSysProduct());
        Assert.assertEquals("Java/2.0.0", acsRequest.getHeaderValue("x-sdk-client"));
        Assert.assertEquals("normal", acsRequest.getHeaderValue("x-sdk-invoke-type"));
    }

    @Test
    public void acsRequestUserConfigTest() {
        CommonRpcRequest acsRequest = new CommonRpcRequest("test");
        acsRequest.appendUserAgent("test", "1.2.2");
        acsRequest.appendUserAgent("user", "1.2.2");
        acsRequest.appendUserAgent("user", "1.3.3");
        String agent = UserAgentConfig.resolve(acsRequest.getSysUserAgentConfig(), null);
        String resultStr = UserAgentConfig.getDefaultMessage() + " test/1.2.2 user/1.3.3";
        Assert.assertEquals(resultStr, agent);
    }

    @Test
    public void acsRequestGetSetTest() throws UnsupportedEncodingException, InvalidKeyException, NoSuchAlgorithmException {
        CommonRpcRequest acsRequest = new CommonRpcRequest("test", "test", "test",
                "locationProduct", "endpointType");
        Assert.assertEquals("test", acsRequest.getSysVersion());
        Assert.assertEquals("test", acsRequest.getSysActionName());
        Assert.assertEquals("locationProduct", acsRequest.getSysLocationProduct());
        Assert.assertEquals("endpointType", acsRequest.getSysEndpointType());

        Map<String, String> param = new HashMap<String, String>();
        acsRequest.setParameter(null, null, null);
        acsRequest.setParameter(param, null, null);
        acsRequest.setParameter(param, null, "value");
        acsRequest.setParameter(param, "name", null);
        Assert.assertNull(param.get("name"));

        acsRequest.setSysRegionId("hangzhou");
        Assert.assertEquals("hangzhou", acsRequest.getSysRegionId());

        acsRequest.setSecurityToken("token");
        Assert.assertEquals("token", acsRequest.getSecurityToken());

        acsRequest.setAcceptFormat(FormatType.JSON);
        Assert.assertTrue(FormatType.JSON == acsRequest.getSysAcceptFormat());
        Assert.assertEquals("application/json", acsRequest.getHeaderValue("Accept"));

        acsRequest.setSysProtocol(ProtocolType.HTTP);
        Assert.assertTrue(ProtocolType.HTTP == acsRequest.getSysProtocol());

        acsRequest.setSysEndpoint("endPonit");
        Assert.assertTrue(acsRequest.getSysProductDomain() instanceof ProductDomain);

        acsRequest.putQueryParameter("test", "test");
        acsRequest.putQueryParameter("objectTest", 8);
        acsRequest.putQueryParameter("nullTest", null);
        Map<String, String> map = acsRequest.getSysQueryParameters();
        Assert.assertEquals("test", map.get("test"));
        Assert.assertEquals("8", map.get("objectTest"));
        Assert.assertNull(map.get("nullTest"));

        acsRequest.putDomainParameter("test", "test");
        acsRequest.putDomainParameter("objectTest", 8);
        map = acsRequest.getSysDomainParameters();
        Assert.assertEquals("test", map.get("test"));
        Assert.assertEquals("8", map.get("objectTest"));

        acsRequest.putBodyParameter("test", "test");
        acsRequest.putBodyParameter("objectTest", 8);
        map = acsRequest.getSysBodyParameters();
        Assert.assertEquals("test", map.get("test"));
        Assert.assertEquals("8", map.get("objectTest"));
    }

    @Test
    public void deprecatedGetSetTest() throws UnsupportedEncodingException, InvalidKeyException, NoSuchAlgorithmException {
        CommonRpcRequest acsRequest = new CommonRpcRequest("test", "test", "test",
                "locationProduct", "endpointType");
        Assert.assertEquals("test", acsRequest.getProduct());
        acsRequest.setRegionId("hangzhou");
        Assert.assertEquals("hangzhou", acsRequest.getRegionId());

        acsRequest.setSecurityToken("token");
        Assert.assertEquals("token", acsRequest.getSecurityToken());

        acsRequest.setAcceptFormat(FormatType.JSON);
        Assert.assertTrue(FormatType.JSON == acsRequest.getAcceptFormat());
        Assert.assertEquals("application/json", acsRequest.getHeaderValue("Accept"));

        acsRequest.setProtocol(ProtocolType.HTTP);
        Assert.assertTrue(ProtocolType.HTTP == acsRequest.getProtocol());

        acsRequest.setEndpoint("endPonit");
        Assert.assertTrue(acsRequest.getProductDomain() instanceof ProductDomain);

        acsRequest.putQueryParameter("test", "test");
        acsRequest.putQueryParameter("objectTest", 8);
        acsRequest.putQueryParameter("nullTest", null);
        Map<String, String> map = acsRequest.getQueryParameters();
        Assert.assertEquals("test", map.get("test"));
        Assert.assertEquals("8", map.get("objectTest"));
        Assert.assertNull(map.get("nullTest"));

        acsRequest.putDomainParameter("test", "test");
        acsRequest.putDomainParameter("objectTest", 8);
        map = acsRequest.getDomainParameters();
        Assert.assertEquals("test", map.get("test"));
        Assert.assertEquals("8", map.get("objectTest"));

        acsRequest.putBodyParameter("test", "test");
        acsRequest.putBodyParameter("objectTest", 8);
        map = acsRequest.getBodyParameters();
        Assert.assertEquals("test", map.get("test"));
        Assert.assertEquals("8", map.get("objectTest"));

        acsRequest.setActionName("test");
        Assert.assertEquals("test", acsRequest.getActionName());

        acsRequest.setEndpointType("test");
        Assert.assertEquals("test", acsRequest.getEndpointType());

        acsRequest.setLocationProduct("test");
        Assert.assertEquals("test", acsRequest.getLocationProduct());
        Assert.assertEquals("test", acsRequest.getSysQueryParameters().get("ServiceCode"));
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
        Assert.assertEquals("test", commonRpcRequest.getSysProduct());
        Assert.assertEquals("test", commonRpcRequest.getSysVersion());
        Assert.assertEquals("test", commonRpcRequest.getSysActionName());
        Assert.assertEquals("locationProduct", commonRpcRequest.getSysLocationProduct());

        commonRpcRequest = new CommonRpcRequest("test", "test", "test");
        Assert.assertEquals("test", commonRpcRequest.getSysProduct());
        Assert.assertEquals("test", commonRpcRequest.getSysVersion());
        Assert.assertEquals("test", commonRpcRequest.getSysActionName());
    }

    @Test
    public void getResponseClassTest() {
        CommonRpcRequest commonRpcRequest = new CommonRpcRequest("test");
        Assert.assertTrue(CommonResponse.class == commonRpcRequest.getResponseClass());
    }

    @Test
    public void rpcAcsRequestGetSetTest() {
        CommonRpcRequest commonRpcRequest = new CommonRpcRequest("test");
        Map<String, String> map = commonRpcRequest.getSysQueryParameters();
        commonRpcRequest.setSysSecurityToken("token");
        Assert.assertEquals("token", commonRpcRequest.getSysSecurityToken());
        Assert.assertEquals("token", map.get("SecurityToken"));

        commonRpcRequest.setSysAcceptFormat(FormatType.JSON);
        Assert.assertTrue(FormatType.JSON == commonRpcRequest.getSysAcceptFormat());
        Assert.assertEquals("JSON", map.get("Format"));

        commonRpcRequest.setSysVersion("version");
        Assert.assertEquals("version", commonRpcRequest.getSysVersion());
        Assert.assertEquals("version", map.get("Version"));

        commonRpcRequest.setSysActionName("action");
        Assert.assertEquals("action", commonRpcRequest.getSysActionName());
        Assert.assertEquals("action", map.get("Action"));
    }

    @Test
    public void composeUrlTest() throws UnsupportedEncodingException {
        CommonRpcRequest commonRpcRequest = new CommonRpcRequest("test");
        commonRpcRequest.setSysProtocol(ProtocolType.HTTP);
        String url = commonRpcRequest.composeUrl("test/?", null);
        Assert.assertEquals("http://test/?Format=JSON", url);

        Map<String, String> map = new HashMap<String, String>(2);
        map.put("test", "test");
        url = commonRpcRequest.composeUrl("test", map);
        Assert.assertEquals("http://test/?test=test", url);
    }

    @Test
    public void signRequestTest() throws UnsupportedEncodingException, InvalidKeyException, NoSuchAlgorithmException {
        AcsRequest commonRpcRequest = new CommonRpcRequest("test");
        commonRpcRequest.setSysProtocol(ProtocolType.HTTP);
        ProductDomain domain = mock(ProductDomain.class);
        when(domain.getDomainName()).thenReturn("testDomain");
        Signer signer = mock(Signer.class);
        BasicSessionCredentials credentials = mock(BasicSessionCredentials.class);
        commonRpcRequest.signRequest(null, null, FormatType.JSON, domain);
        commonRpcRequest.signRequest(null, credentials, FormatType.JSON, domain);
        commonRpcRequest.signRequest(signer, null, FormatType.JSON, domain);
        Assert.assertTrue(commonRpcRequest.getSysUrl().contains("testDomain"));

        when(credentials.getAccessKeyId()).thenReturn("testId");
        when(credentials.getAccessKeySecret()).thenReturn("testSecret");
        when(credentials.getSessionToken()).thenReturn("token");
        commonRpcRequest.signRequest(signer, credentials, FormatType.JSON, domain);
        Assert.assertTrue(commonRpcRequest.getSysUrl().contains("http"));
        Assert.assertTrue(commonRpcRequest.getSysUrl().contains("testDomain"));
        Assert.assertTrue(commonRpcRequest.getSysUrl().contains("SecurityToken=token"));
        Assert.assertTrue(commonRpcRequest.getSysUrl().contains("Format=JSON"));
        Assert.assertTrue(commonRpcRequest.getSysUrl().contains("AccessKeyId=testId"));

        commonRpcRequest.putQueryParameter("SecurityToken", "test");
        when(credentials.getSessionToken()).thenReturn(null);
        commonRpcRequest.signRequest(signer, credentials, FormatType.JSON, domain);
        Assert.assertFalse(commonRpcRequest.getSysUrl().contains("SecurityToken=token"));

        commonRpcRequest = new CommonRpcRequest("test");
        commonRpcRequest.setSysProtocol(ProtocolType.HTTP);
        BearerTokenCredentials bearerTokenCredentials = mock(BearerTokenCredentials.class);
        when(bearerTokenCredentials.getBearerToken()).thenReturn("token");
        commonRpcRequest.putBodyParameter("test", "test");
        commonRpcRequest.setHttpContentType(FormatType.JSON);
        commonRpcRequest.signRequest(signer, bearerTokenCredentials, FormatType.JSON, domain);
        Assert.assertTrue(commonRpcRequest.getSysUrl().contains("BearerToken=token"));
        Map<String, String> map = commonRpcRequest.getSysBodyParameters();
        Assert.assertEquals("test", map.get("test"));

        commonRpcRequest.putQueryParameter("BearerToken", "test");
        when(bearerTokenCredentials.getBearerToken()).thenReturn(null);
        commonRpcRequest.signRequest(signer, bearerTokenCredentials, FormatType.JSON, domain);
        Assert.assertFalse(commonRpcRequest.getSysUrl().contains("BearerToken=token"));

        commonRpcRequest = new CommonRpcRequest("test");
        commonRpcRequest.setSysProtocol(ProtocolType.HTTP);
        KeyPairCredentials keyPairCredentials = mock(KeyPairCredentials.class);
        commonRpcRequest.putBodyParameter("test", "xml");
        commonRpcRequest.setHttpContentType(FormatType.XML);
        commonRpcRequest.signRequest(signer, keyPairCredentials, FormatType.JSON, domain);
        map = commonRpcRequest.getSysBodyParameters();
        Assert.assertEquals("xml", map.get("test"));

        commonRpcRequest.setHttpContentType(FormatType.FORM);
        commonRpcRequest.signRequest(signer, keyPairCredentials, FormatType.JSON, domain);
        commonRpcRequest.putBodyParameter("test", "Form");
        Assert.assertEquals("Form", map.get("test"));
    }
}
