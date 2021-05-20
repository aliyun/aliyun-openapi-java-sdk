package com.aliyuncs;

import com.aliyuncs.auth.AlibabaCloudCredentials;
import com.aliyuncs.auth.Credential;
import com.aliyuncs.auth.LegacyCredentials;
import com.aliyuncs.auth.Signer;
import com.aliyuncs.auth.sts.AssumeRoleRequest;
import com.aliyuncs.ecs.v20140526.model.DescribeRegionsResponse;
import com.aliyuncs.endpoint.DefaultEndpointResolver;
import com.aliyuncs.endpoint.ResolveEndpointRequest;
import com.aliyuncs.endpoint.location.model.v20150612.DescribeEndpointsResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ErrorCodeConstant;
import com.aliyuncs.exceptions.ErrorMessageConstant;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.*;
import com.aliyuncs.http.clients.ApacheHttpClient;
import com.aliyuncs.http.clients.CompatibleUrlConnClient;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.regions.ProductDomain;
import com.aliyuncs.utils.LogUtils;
import io.opentracing.*;
import io.opentracing.noop.NoopTracerFactory;
import io.opentracing.propagation.Format;
import io.opentracing.propagation.TextMap;
import io.opentracing.util.GlobalTracer;
import io.opentracing.util.ThreadLocalScopeManager;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.slf4j.Logger;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.SocketTimeoutException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

import static org.mockito.ArgumentMatchers.isNull;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.mock;

@PowerMockIgnore("javax.net.ssl.*")
@RunWith(PowerMockRunner.class)
@PrepareForTest({HttpUtil.class, LogUtils.class})
public class DefaultAcsClientTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @SuppressWarnings("deprecation")
    @Test
    public void testConstructor() throws ClientException, IOException {
        DefaultAcsClient client = new DefaultAcsClient();
        Assert.assertTrue(DefaultProfile.getProfile() == client.getProfile());
        client = new DefaultAcsClient("cn-test");
        Assert.assertEquals("cn-test", client.getProfile().getRegionId());
        Assert.assertEquals("ApacheHttpClient",
                client.getUserAgentConfig().getSysUserAgentsMap().get("HTTPClient"));
    }

    @SuppressWarnings("deprecation")
    @Test
    public void testConstructorWithProfile() throws ClientException, IOException {
        Credential credential = mock(Credential.class);
        when(credential.getSecurityToken()).thenReturn(null);
        DefaultProfile profile = mock(DefaultProfile.class);
        when(profile.getCredential()).thenReturn(credential);
        DefaultAcsClient client = new DefaultAcsClient(profile);
        Assert.assertTrue(profile == client.getProfile());
        Assert.assertTrue(ApacheHttpClient.class.equals(client.getHttpClient().getClass()));
    }

    @SuppressWarnings("deprecation")
    @Test
    public void testConstructorWithProfileAndCredentials() throws ClientException, IOException {
        DefaultProfile profile = mock(DefaultProfile.class);
        LegacyCredentials legacyCredentials = new LegacyCredentials(new Credential());
        DefaultAcsClient client = new DefaultAcsClient(profile, legacyCredentials);
        Assert.assertTrue(profile == client.getProfile());
    }

    @SuppressWarnings("deprecation")
    @Test
    public void testGetSetHttpClient() throws ClientException, IOException {
        Credential credential = mock(Credential.class);
        when(credential.getSecurityToken()).thenReturn(null);
        DefaultProfile profile = mock(DefaultProfile.class);
        when(profile.getCredential()).thenReturn(credential);
        DefaultAcsClient client = new DefaultAcsClient(profile);
        Assert.assertNotNull(client.getHttpClient());
        client.setHttpClient(client.getHttpClient());
        Assert.assertNotNull(client.getHttpClient());
    }

    @SuppressWarnings("deprecation")
    @Test
    public void testIsAutoRetry() {
        Credential credential = mock(Credential.class);
        when(credential.getSecurityToken()).thenReturn(null);
        DefaultProfile profile = mock(DefaultProfile.class);
        when(profile.getCredential()).thenReturn(credential);
        DefaultAcsClient client = new DefaultAcsClient(profile);
        Assert.assertTrue(client.isAutoRetry());
        client.setAutoRetry(false);
        Assert.assertFalse(client.isAutoRetry());
    }

    @SuppressWarnings("deprecation")
    @Test
    public void testMaxRetryNumber() {
        Credential credential = mock(Credential.class);
        when(credential.getSecurityToken()).thenReturn(null);
        DefaultProfile profile = mock(DefaultProfile.class);
        when(profile.getCredential()).thenReturn(credential);
        DefaultAcsClient client = new DefaultAcsClient(profile);
        Assert.assertTrue(3 == client.getMaxRetryNumber());
        client.setMaxRetryNumber(1);
        Assert.assertTrue(1 == client.getMaxRetryNumber());
    }

    @SuppressWarnings("deprecation")
    @Test
    public void testShutdownWithApacheHttpClient() {
        Credential credential = mock(Credential.class);
        when(credential.getSecurityToken()).thenReturn(null);
        DefaultProfile profile = mock(DefaultProfile.class);
        when(profile.getCredential()).thenReturn(credential);
        DefaultAcsClient client = new DefaultAcsClient(profile);
        DefaultAcsClient spyClient = Mockito.spy(client);
        spyClient.shutdown();
        verify(spyClient, Mockito.times(1)).shutdown();
    }

    @SuppressWarnings("deprecation")
    @Test
    public void testShutdownWithCompatibleHttpClient() {
        Credential credential = mock(Credential.class);
        when(credential.getSecurityToken()).thenReturn(null);
        DefaultProfile profile = mock(DefaultProfile.class);
        when(profile.getCredential()).thenReturn(credential);
        HttpClientConfig clientConfig = HttpClientConfig.getDefault();
        clientConfig.setCompatibleMode(true);
        when(profile.getHttpClientConfig()).thenReturn(clientConfig);
        DefaultAcsClient client = new DefaultAcsClient(profile);
        DefaultAcsClient spyClient = Mockito.spy(client);
        spyClient.shutdown();
        // check httpClient type
        Assert.assertTrue(CompatibleUrlConnClient.class.equals(client.getHttpClient().getClass()));
        verify(spyClient, Mockito.times(1)).shutdown();
        Assert.assertNull(spyClient.getHttpClient());
    }

    @SuppressWarnings("deprecation")
    private DefaultAcsClient initDefaultAcsClient() throws NoSuchFieldException, SecurityException,
            IllegalArgumentException, IllegalAccessException, ClientException {
        Credential credential = mock(Credential.class);
        when(credential.getSecurityToken()).thenReturn(null);
        DefaultProfile profile = mock(DefaultProfile.class);
        when(profile.getCredential()).thenReturn(credential);
        DefaultAcsClient client = new DefaultAcsClient(profile);
        Field httpClient = client.getClass().getDeclaredField("httpClient");
        httpClient.setAccessible(true);
        CompatibleUrlConnClient compatibleUrlConnClient = mock(CompatibleUrlConnClient.class);
        httpClient.set(client, compatibleUrlConnClient);
        HttpClientConfig httpClientConfig = mock(HttpClientConfig.class);
        when(httpClientConfig.getProtocolType()).thenReturn(ProtocolType.HTTP);
        when(profile.getHttpClientConfig()).thenReturn(httpClientConfig);
        PowerMockito.mockStatic(HttpUtil.class);
        BDDMockito.given(HttpUtil.debugHttpRequest(any(HttpRequest.class))).willReturn(null);
        BDDMockito.given(HttpUtil.debugHttpResponse(any(HttpResponse.class))).willReturn(null);
        return client;
    }

    private DefaultAcsClient initDefaultAcsClientWithLogger(Logger logger) throws NoSuchFieldException, SecurityException,
            IllegalArgumentException, IllegalAccessException, ClientException {
        Credential credential = mock(Credential.class);
        when(credential.getSecurityToken()).thenReturn(null);
        DefaultProfile profile = mock(DefaultProfile.class);
        when(profile.getCredential()).thenReturn(credential);
        when(profile.getLogFormat()).thenReturn(LogUtils.DEFAULT_LOG_FORMAT);
        when(profile.getLogger()).thenReturn(logger);
        LogUtils.LogUnit logUnit = mock(LogUtils.LogUnit.class);
        PowerMockito.mockStatic(LogUtils.class);
        BDDMockito.given(LogUtils.createLogUnit(any(HttpRequest.class), any(HttpResponse.class))).willReturn(logUnit);
        BDDMockito.given(LogUtils.fillContent(LogUtils.DEFAULT_LOG_FORMAT, logUnit)).willReturn("log content");
        DefaultAcsClient client = new DefaultAcsClient(profile);
        Field httpClient = client.getClass().getDeclaredField("httpClient");
        httpClient.setAccessible(true);
        CompatibleUrlConnClient compatibleUrlConnClient = mock(CompatibleUrlConnClient.class);
        httpClient.set(client, compatibleUrlConnClient);
        HttpClientConfig httpClientConfig = mock(HttpClientConfig.class);
        when(httpClientConfig.getProtocolType()).thenReturn(ProtocolType.HTTP);
        when(profile.getHttpClientConfig()).thenReturn(httpClientConfig);
        PowerMockito.mockStatic(HttpUtil.class);
        BDDMockito.given(HttpUtil.debugHttpRequest(any(HttpRequest.class))).willReturn(null);
        BDDMockito.given(HttpUtil.debugHttpResponse(any(HttpResponse.class))).willReturn(null);
        return client;
    }

    private IHttpClient getHttpClient(DefaultAcsClient client) throws NoSuchFieldException, SecurityException,
            IllegalArgumentException, IllegalAccessException {
        Field httpClient = client.getClass().getDeclaredField("httpClient");
        httpClient.setAccessible(true);
        return (IHttpClient) httpClient.get(client);
    }

    @SuppressWarnings("rawtypes")
    private AcsRequest initRequest(Class<? extends AcsResponse> responseClass) {
        AcsRequest request = mock(AcsRequest.class);
        when(request.getSysProduct()).thenReturn("product");
        when(request.getSysLocationProduct()).thenReturn("locationProduct");
        when(request.getSysEndpointType()).thenReturn("endpointType");
        Mockito.doReturn(ProtocolType.HTTP).when(request).getSysProtocol();
        when(request.getSysAcceptFormat()).thenReturn(FormatType.JSON);
        when(request.getResponseClass()).thenReturn(responseClass);
        return request;
    }

    private HttpResponse initHttpResponse() throws ClientException {
        HttpResponse response = mock(HttpResponse.class);
        when(response.isSuccess()).thenReturn(true);
        when(response.getHttpContentType()).thenReturn(FormatType.XML);
        String httpContentString = "<?xml version=\"1.0\" encoding=\"utf-8\"?><DescribeRegionsResponse>"
                + "<RequestId>RequestId</RequestId>" + "<Regions>" + "<Region>" + "<RegionId>RegionId</RegionId>"
                + "<LocalName>LocalName</LocalName>" + "</Region>" + "<Region>" + "<RegionId>RegionId</RegionId>"
                + "<LocalName>LocalName</LocalName>" + "</Region>" + "</Regions>" + "</DescribeRegionsResponse>";
        when(response.getHttpContentString()).thenReturn(httpContentString);
        return response;
    }

    @Test
    public void testRestoreSSLCertificate() throws NoSuchFieldException, SecurityException, IllegalArgumentException,
            IllegalAccessException, ClientException {
        DefaultAcsClient client = initDefaultAcsClient();
        client.restoreSSLCertificate();
        client.ignoreSSLCertificate();
        verify(getHttpClient(client), Mockito.times(1)).ignoreSSLCertificate();
        verify(getHttpClient(client), Mockito.times(1)).restoreSSLCertificate();
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    @Test
    public void testGetAcsResponse() throws NoSuchFieldException, SecurityException, IllegalArgumentException,
            IllegalAccessException, ClientException, IOException {
        DefaultAcsClient client = initDefaultAcsClient();
        DefaultEndpointResolver endpointResolver = mock(DefaultEndpointResolver.class);
        client.setEndpointResolver(endpointResolver);
        Mockito.doReturn("endpoint").when(endpointResolver).resolve(Mockito.any(ResolveEndpointRequest.class));
        HttpResponse response = initHttpResponse();
        Mockito.doReturn(response).when(getHttpClient(client)).syncInvoke((HttpRequest) isNull());
        Mockito.doReturn("http://test.domain").when(response).getSysUrl();
        AcsRequest request = initRequest(DescribeEndpointsResponse.class);

        Assert.assertTrue(client.getAcsResponse(request) instanceof DescribeEndpointsResponse);
        when(request.getResponseClass()).thenReturn(DescribeRegionsResponse.class);
        Assert.assertTrue(client.getAcsResponse(request) instanceof DescribeRegionsResponse);

        Assert.assertTrue(client.getAcsResponse(request, true, 3) instanceof DescribeRegionsResponse);
        Assert.assertTrue(client.getAcsResponse(request, client.getProfile()) instanceof DescribeRegionsResponse);
        Assert.assertTrue(client.getAcsResponse(request, "regionId", client.getProfile()
                .getCredential()) instanceof DescribeRegionsResponse);
        Assert.assertTrue(client.getAcsResponse(request, "regionId") instanceof DescribeRegionsResponse);

        when(request.getSysRegionId()).thenReturn("regionId");
        Assert.assertTrue(client.getAcsResponse(request, "regionId") instanceof DescribeRegionsResponse);
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    @Test
    public void testDoActionBranch() throws ClientException, IOException, IllegalArgumentException,
            IllegalAccessException, NoSuchFieldException, SecurityException {
        DefaultAcsClient client = initDefaultAcsClient();
        HttpResponse response = mock(HttpResponse.class);
        Mockito.doReturn(response).when(getHttpClient(client)).syncInvoke((HttpRequest) isNull());
        Mockito.doReturn("http://test.domain").when(response).getSysUrl();
        DefaultEndpointResolver endpointResolver = mock(DefaultEndpointResolver.class);
        client.setEndpointResolver(endpointResolver);
        Mockito.doReturn("endpoint").when(endpointResolver).resolve(Mockito.any(ResolveEndpointRequest.class));
        AcsRequest request = initRequest(DescribeEndpointsResponse.class);
        when(request.getSysAcceptFormat()).thenReturn(FormatType.JSON);
        when(request.getSysProductDomain()).thenReturn(new ProductDomain("productName", "domainName"));
        when(request.getSysProtocol()).thenReturn(null);
        Assert.assertTrue(client.doAction(request) instanceof HttpResponse);
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    @Test
    public void testDoActionWithLoggerBranch() throws ClientException, IOException, IllegalArgumentException,
            IllegalAccessException, NoSuchFieldException, SecurityException {
        Logger logger = mock(Logger.class);
        String logContent = "log content";
        doNothing().when(logger).info(logContent);
        DefaultAcsClient client = initDefaultAcsClientWithLogger(logger);
        HttpResponse response = mock(HttpResponse.class);
        Mockito.doReturn(response).when(getHttpClient(client)).syncInvoke((HttpRequest) isNull());
        Mockito.doReturn("http://test.domain").when(response).getSysUrl();
        DefaultEndpointResolver endpointResolver = mock(DefaultEndpointResolver.class);
        client.setEndpointResolver(endpointResolver);
        Mockito.doReturn("endpoint").when(endpointResolver).resolve(Mockito.any(ResolveEndpointRequest.class));
        AcsRequest request = initRequest(DescribeEndpointsResponse.class);
        when(request.getSysAcceptFormat()).thenReturn(FormatType.JSON);
        when(request.getSysProductDomain()).thenReturn(new ProductDomain("productName", "domainName"));
        when(request.getSysProtocol()).thenReturn(null);
        Assert.assertTrue(client.doAction(request) instanceof HttpResponse);
        verify(logger, Mockito.times(1)).info(logContent);
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    @Test
    public void testDoActionWithLoggerExceptionBranch() throws ClientException, IOException, IllegalArgumentException,
            IllegalAccessException, NoSuchFieldException, SecurityException {
        Logger logger = mock(Logger.class);
        String logContent = "log content";
        doThrow(new RuntimeException("mock exception")).when(logger).info(logContent);
        DefaultAcsClient client = initDefaultAcsClientWithLogger(logger);
        HttpResponse response = mock(HttpResponse.class);
        Mockito.doReturn(response).when(getHttpClient(client)).syncInvoke((HttpRequest) isNull());
        Mockito.doReturn("http://test.domain").when(response).getSysUrl();
        DefaultEndpointResolver endpointResolver = mock(DefaultEndpointResolver.class);
        client.setEndpointResolver(endpointResolver);
        Mockito.doReturn("endpoint").when(endpointResolver).resolve(Mockito.any(ResolveEndpointRequest.class));
        AcsRequest request = initRequest(DescribeEndpointsResponse.class);
        when(request.getSysAcceptFormat()).thenReturn(FormatType.JSON);
        when(request.getSysProductDomain()).thenReturn(new ProductDomain("productName", "domainName"));
        when(request.getSysProtocol()).thenReturn(null);
        Assert.assertTrue(client.doAction(request) instanceof HttpResponse);
        verify(logger, Mockito.times(1)).info(logContent);
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    @Test
    public void testGetAcsResponseNoProfile() throws ClientException, IOException, IllegalArgumentException,
            IllegalAccessException, NoSuchFieldException, SecurityException {
        DefaultAcsClient client = initDefaultAcsClient();
        Field clientProfile = client.getClass().getDeclaredField("clientProfile");
        clientProfile.setAccessible(true);
        clientProfile.set(client, null);
        AcsRequest request = mock(AcsRequest.class);
        thrown.expect(ClientException.class);
        thrown.expectMessage("SDK.InvalidProfile : No active profile found.");
        client.getAcsResponse(request);
    }

    @SuppressWarnings({"deprecation", "unchecked", "rawtypes"})
    @Test
    public void testReadResponseUnmarshaller() throws ClientException, IOException, IllegalArgumentException,
            IllegalAccessException, NoSuchFieldException, SecurityException {
        Credential credential = mock(Credential.class);
        when(credential.getSecurityToken()).thenReturn(null);
        DefaultProfile profile = mock(DefaultProfile.class);
        when(profile.getCredential()).thenReturn(credential);
        DefaultAcsClient client = new DefaultAcsClient(profile);
        DefaultAcsClient spyClient = Mockito.spy(client);
        Field field = client.getClass().getDeclaredField("clientProfile");
        field.setAccessible(true);
        field.set(spyClient, profile);
        HttpClientConfig httpClientConfig = mock(HttpClientConfig.class);
        when(profile.getHttpClientConfig()).thenReturn(httpClientConfig);
        AcsRequest request = initRequest(DescribeRegionsResponse.class);
        HttpResponse response = initHttpResponse();
        Mockito.doReturn(response).when(spyClient).doAction(request);

        when(httpClientConfig.isCompatibleMode()).thenReturn(false);
        Assert.assertTrue(spyClient.getAcsResponse(request) instanceof DescribeRegionsResponse);

        when(httpClientConfig.isCompatibleMode()).thenReturn(true);
        Assert.assertTrue(spyClient.getAcsResponse(request) instanceof DescribeRegionsResponse);

        when(request.getResponseClass()).thenReturn(DescribeEndpointsResponse.class);
        Assert.assertTrue(spyClient.getAcsResponse(request) instanceof DescribeEndpointsResponse);

        when(httpClientConfig.isCompatibleMode()).thenReturn(false);
        Assert.assertTrue(spyClient.getAcsResponse(request) instanceof DescribeEndpointsResponse);
    }

    @SuppressWarnings({"deprecation", "rawtypes", "unchecked"})
    @Test
    public void testReadResponseClientException() throws ClientException {
        Credential credential = mock(Credential.class);
        when(credential.getSecurityToken()).thenReturn(null);
        DefaultProfile profile = mock(DefaultProfile.class);
        when(profile.getCredential()).thenReturn(credential);
        DefaultAcsClient client = new DefaultAcsClient(profile);
        DefaultAcsClient spyClient = Mockito.spy(client);
        HttpResponse response = initHttpResponse();
        AcsRequest request = initRequest(DescribeRegionsResponse.class);
        Mockito.doReturn(String.class).when(request).getResponseClass();
        Mockito.doReturn(response).when(spyClient).doAction(request);

        thrown.expect(ClientException.class);
        thrown.expectMessage("SDK.InvalidResponseClass : Unable to allocate " + String.class.getName() + " class");
        spyClient.getAcsResponse(request);
    }

    static class TestResponse extends CommonResponse {
        @Override
        public boolean checkShowJsonItemName() {
            return false;
        }
    }

    @SuppressWarnings({"unchecked", "rawtypes", "deprecation"})
    @Test
    public void testReadResponseForHideArrayItem() throws ClientException {
        Credential credential = mock(Credential.class);
        when(credential.getSecurityToken()).thenReturn(null);
        DefaultProfile profile = mock(DefaultProfile.class);
        when(profile.getCredential()).thenReturn(credential);
        DefaultAcsClient client = new DefaultAcsClient(profile);
        DefaultAcsClient spyClient = Mockito.spy(client);
        HttpResponse response = initHttpResponse();
        AcsRequest request = initRequest(TestResponse.class);
        Mockito.doReturn(response).when(spyClient).doAction(request);

        Assert.assertTrue(spyClient.getAcsResponse(request) instanceof TestResponse);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Test
    public void testGetAcsResponseInvalidServerResponseException() throws NoSuchFieldException, SecurityException,
            IllegalArgumentException, IllegalAccessException, ClientException, IOException {
        DefaultAcsClient client = initDefaultAcsClient();

        DefaultEndpointResolver endpointResolver = mock(DefaultEndpointResolver.class);
        client.setEndpointResolver(endpointResolver);
        Mockito.doReturn("endpoint").when(endpointResolver).resolve(Mockito.any(ResolveEndpointRequest.class));
        HttpResponse response = mock(HttpResponse.class);
        when(response.isSuccess()).thenReturn(true);
        when(response.getHttpContentType()).thenReturn(FormatType.XML);
        when(response.getHttpContentString()).thenReturn(null);
        Mockito.doReturn("http://test.domain").when(response).getSysUrl();
        Mockito.doReturn(response).when(getHttpClient(client)).syncInvoke((HttpRequest) isNull());
        AcsRequest request = initRequest(DescribeEndpointsResponse.class);

        thrown.expect(ClientException.class);
        thrown.expectMessage(ErrorCodeConstant.SDK_INVALID_SERVER_RESPONSE + " : "
                + ErrorMessageConstant.SERVER_RESPONSE_HTTP_BODY_EMPTY);
        client.getAcsResponse(request);
    }

    @SuppressWarnings({"unchecked", "rawtypes", "deprecation"})
    @Test
    public void testDoActionEndpointTestabilityException() throws ClientException, IOException,
            IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {
        Credential credential = mock(Credential.class);
        when(credential.getSecurityToken()).thenReturn(null);
        DefaultProfile profile = mock(DefaultProfile.class);
        when(profile.getCredential()).thenReturn(credential);
        DefaultAcsClient client = new DefaultAcsClient(profile);
        DefaultEndpointResolver endpointResolver = mock(DefaultEndpointResolver.class);
        client.setEndpointResolver(endpointResolver);
        String endPoint = "endpoint-test.exception.com";
        Mockito.doReturn(endPoint).when(endpointResolver).resolve(Mockito.any(ResolveEndpointRequest.class));
        AcsRequest request = initRequest(DescribeEndpointsResponse.class);
        thrown.expect(ClientException.class);
        thrown.expectMessage(ErrorCodeConstant.SDK_ENDPOINT_TESTABILITY + " : " + endPoint);
        client.doAction(request);
    }

    @Test
    public void doActionTest() throws ClientException {
        System.setProperty("alibabacloud.accessKeyId", "test");
        System.setProperty("alibabacloud.accessKeyIdSecret", "test");
        DefaultAcsClient client = new DefaultAcsClient("test");
        DefaultEndpointResolver endpointResolver = mock(DefaultEndpointResolver.class);
        client.setEndpointResolver(endpointResolver);
        String endPoint = "endpoint-test.exception.com";
        Mockito.doReturn(endPoint).when(endpointResolver).resolve(Mockito.any(ResolveEndpointRequest.class));
        AcsRequest request = initRequest(DescribeEndpointsResponse.class);
        thrown.expect(ClientException.class);
        thrown.expectMessage(ErrorCodeConstant.SDK_ENDPOINT_TESTABILITY + " : " + endPoint);
        client.doAction(request);
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    @Test
    public void testDoActionSocketTimeoutException() throws ClientException, IOException, IllegalArgumentException,
            IllegalAccessException, NoSuchFieldException, SecurityException {
        DefaultAcsClient client = initDefaultAcsClient();
        AcsRequest request = initRequest(DescribeEndpointsResponse.class);
        DefaultEndpointResolver endpointResolver = mock(DefaultEndpointResolver.class);
        client.setEndpointResolver(endpointResolver);
        Mockito.doReturn("endpoint").when(endpointResolver).resolve(Mockito.any(ResolveEndpointRequest.class));
        Mockito.doThrow(new SocketTimeoutException()).when(getHttpClient(client)).syncInvoke((HttpRequest) isNull());
        Mockito.doReturn("test").when(request).getSysUrl();
        thrown.expect(ClientException.class);
        thrown.expectMessage("SDK.ReadTimeout : " +
                "SocketTimeoutException has occurred on a socket read or accept.The url is test");
        client.doAction(request);
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    @Test
    public void testDoActionIOException() throws ClientException, IOException, IllegalArgumentException,
            IllegalAccessException, NoSuchFieldException, SecurityException {
        DefaultAcsClient client = initDefaultAcsClient();
        AcsRequest request = initRequest(DescribeEndpointsResponse.class);
        DefaultEndpointResolver endpointResolver = mock(DefaultEndpointResolver.class);
        client.setEndpointResolver(endpointResolver);
        Mockito.doReturn("endpoint").when(endpointResolver).resolve(Mockito.any(ResolveEndpointRequest.class));
        Mockito.doReturn(ProtocolType.HTTP).when(request).getSysProtocol();
        Mockito.doThrow(new IOException()).when(getHttpClient(client)).syncInvoke((HttpRequest) isNull());
        Mockito.doReturn("test").when(request).getSysUrl();
        thrown.expect(ClientException.class);
        thrown.expectMessage("SDK.ServerUnreachable : Server unreachable: connection test failed");
        client.doAction(request);
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    @Test
    public void testDoActionInvalidKeyException() throws ClientException, IOException, IllegalArgumentException,
            IllegalAccessException, NoSuchFieldException, SecurityException, NoSuchAlgorithmException, InvalidKeyException {
        DefaultAcsClient client = initDefaultAcsClient();
        AcsRequest request = initRequest(DescribeEndpointsResponse.class);
        Mockito.doThrow(InvalidKeyException.class).when(request).signRequest(any(Signer.class), any(AlibabaCloudCredentials.class), any(FormatType.class), any(ProductDomain.class));
        DefaultEndpointResolver endpointResolver = mock(DefaultEndpointResolver.class);
        client.setEndpointResolver(endpointResolver);
        Mockito.doReturn("endpoint").when(endpointResolver).resolve(Mockito.any(ResolveEndpointRequest.class));
        thrown.expect(ClientException.class);
        thrown.expectMessage("SDK.InvalidAccessSecret : Specified access secret is not valid.");
        client.doAction(request);
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    @Test
    public void testDoActionNoSuchAlgorithmException() throws ClientException, IOException, IllegalArgumentException,
            IllegalAccessException, NoSuchFieldException, SecurityException, NoSuchAlgorithmException, InvalidKeyException {
        DefaultAcsClient client = initDefaultAcsClient();
        AcsRequest request = initRequest(DescribeEndpointsResponse.class);
        Mockito.doThrow(NoSuchAlgorithmException.class).when(request).signRequest(any(Signer.class), any(AlibabaCloudCredentials.class), any(FormatType.class), any(ProductDomain.class));
        DefaultEndpointResolver endpointResolver = mock(DefaultEndpointResolver.class);
        client.setEndpointResolver(endpointResolver);
        Mockito.doReturn("endpoint").when(endpointResolver).resolve(Mockito.any(ResolveEndpointRequest.class));
        thrown.expect(ClientException.class);
        thrown.expectMessage("SDK.InvalidMD5Algorithm : MD5 hash is not supported by client side.");
        client.doAction(request);
    }

    @SuppressWarnings({"unchecked", "rawtypes", "deprecation"})
    @Test
    public void testGetCommonResponse() throws ClientException, IllegalArgumentException, SecurityException {
        Credential credential = mock(Credential.class);
        when(credential.getSecurityToken()).thenReturn(null);
        DefaultProfile profile = mock(DefaultProfile.class);
        when(profile.getCredential()).thenReturn(credential);
        DefaultAcsClient client = new DefaultAcsClient(profile);
        DefaultAcsClient spyClient = Mockito.spy(client);
        HttpResponse response = mock(HttpResponse.class);
        CommonRequest commonRequest = mock(CommonRequest.class);
        AcsRequest request = mock(AcsRequest.class);
        when(commonRequest.buildRequest()).thenReturn(request);
        Mockito.doReturn(response).when(spyClient).doAction(request);
        when(response.isSuccess()).thenReturn(true);
        Assert.assertTrue(spyClient.getCommonResponse(commonRequest) instanceof CommonResponse);
    }

    @SuppressWarnings({"unchecked", "rawtypes", "deprecation"})
    @Test
    public void testGetCommonResponseServerException() throws ClientException, IOException, IllegalArgumentException,
            IllegalAccessException, NoSuchFieldException, SecurityException {
        Credential credential = mock(Credential.class);
        when(credential.getSecurityToken()).thenReturn(null);
        DefaultProfile profile = mock(DefaultProfile.class);
        when(profile.getCredential()).thenReturn(credential);
        DefaultAcsClient client = new DefaultAcsClient(profile);
        DefaultAcsClient spyClient = Mockito.spy(client);
        HttpResponse response = mock(HttpResponse.class);
        CommonRequest commonRequest = mock(CommonRequest.class);
        AcsRequest request = mock(AcsRequest.class);
        when(commonRequest.buildRequest()).thenReturn(request);
        Mockito.doReturn(response).when(spyClient).doAction(request);
        when(response.isSuccess()).thenReturn(false);
        when(response.getHttpContentType()).thenReturn(FormatType.XML);
        when(response.getHttpContentString()).thenReturn(makeAcsErrorXML("", "", "500", "ServerException", ""));
        when(response.getStatus()).thenReturn(500);
        thrown.expect(ServerException.class);
        spyClient.getCommonResponse(commonRequest);
    }

    @SuppressWarnings({"unchecked", "rawtypes", "deprecation"})
    @Test
    public void testGetCommonResponseClientException() throws ClientException, IOException, IllegalArgumentException,
            IllegalAccessException, NoSuchFieldException, SecurityException {
        Credential credential = mock(Credential.class);
        when(credential.getSecurityToken()).thenReturn(null);
        DefaultProfile profile = mock(DefaultProfile.class);
        when(profile.getCredential()).thenReturn(credential);
        DefaultAcsClient client = new DefaultAcsClient(profile);
        DefaultAcsClient spyClient = Mockito.spy(client);
        HttpResponse response = mock(HttpResponse.class);
        CommonRequest commonRequest = mock(CommonRequest.class);
        AcsRequest request = mock(AcsRequest.class);
        when(commonRequest.buildRequest()).thenReturn(request);
        Mockito.doReturn(response).when(spyClient).doAction(request);

        when(response.isSuccess()).thenReturn(false);
        when(response.getHttpContentType()).thenReturn(FormatType.XML);
        when(response.getHttpContentString()).thenReturn(makeAcsErrorXML("", "", "500", "ServerException", ""));
        when(response.getStatus()).thenReturn(404);
        thrown.expect(ClientException.class);
        spyClient.getCommonResponse(commonRequest);
    }

    private String makeAcsErrorXML(String requestId, String hostId, String code, String message, String recommend) {
        return String.format("<Error><RequestId>%s</RequestId><HostId>%s</HostId><Code>%s</Code>"
                        + "<Message><![CDATA[%s]]></Message><Recommend><![CDATA[%s]]></Recommend></Error>", requestId, hostId,
                code, message, recommend);
    }

    @SuppressWarnings({"unchecked", "rawtypes", "deprecation"})
    @Test
    public void testResponseServerExceptionError() throws ClientException {
        Credential credential = mock(Credential.class);
        when(credential.getSecurityToken()).thenReturn(null);
        DefaultProfile profile = mock(DefaultProfile.class);
        when(profile.getCredential()).thenReturn(credential);
        DefaultAcsClient client = new DefaultAcsClient(profile);
        DefaultAcsClient spyClient = Mockito.spy(client);
        HttpResponse response = mock(HttpResponse.class);
        when(response.getStatus()).thenReturn(500);
        when(response.getHttpContentType()).thenReturn(FormatType.XML);
        when(response.getHttpContentString()).thenReturn(makeAcsErrorXML("", "", "500", "ServerException", ""));
        AcsRequest request = mock(AcsRequest.class);
        Mockito.doReturn(response).when(spyClient).doAction(request);
        thrown.expect(ServerException.class);
        thrown.expectMessage("500 : ServerException");
        spyClient.getAcsResponse(request);
    }

    @SuppressWarnings({"unchecked", "rawtypes", "deprecation"})
    @Test
    public void testResponseNotIncompleteSignatureError() throws ClientException {
        Credential credential = mock(Credential.class);
        when(credential.getSecurityToken()).thenReturn(null);
        DefaultProfile profile = mock(DefaultProfile.class);
        when(profile.getCredential()).thenReturn(credential);
        DefaultAcsClient client = new DefaultAcsClient(profile);
        DefaultAcsClient spyClient = Mockito.spy(client);
        HttpResponse response = mock(HttpResponse.class);
        when(response.getStatus()).thenReturn(400);
        when(response.getHttpContentType()).thenReturn(FormatType.XML);
        when(response.getHttpContentString()).thenReturn(makeAcsErrorXML("", "", "Not IncompleteSignature",
                "ClientException", ""));
        AcsRequest request = mock(AcsRequest.class);
        Mockito.doReturn(response).when(spyClient).doAction(request);
        thrown.expect(ClientException.class);
        thrown.expectMessage("Not IncompleteSignature : ClientException");
        spyClient.getAcsResponse(request);
    }

    @SuppressWarnings({"unchecked", "rawtypes", "deprecation"})
    @Test
    public void testResponseInvalidAccessKeySecretError() throws ClientException {
        Credential credential = mock(Credential.class);
        when(credential.getSecurityToken()).thenReturn(null);
        DefaultProfile profile = mock(DefaultProfile.class);
        when(profile.getCredential()).thenReturn(credential);
        DefaultAcsClient client = new DefaultAcsClient(profile);
        DefaultAcsClient spyClient = Mockito.spy(client);
        HttpResponse response = mock(HttpResponse.class);
        when(response.getStatus()).thenReturn(400);
        when(response.getHttpContentType()).thenReturn(FormatType.XML);
        AcsRequest request = mock(AcsRequest.class);
        request.strToSign = "GET&%2F%3DDescriat%3DXML%26";
        String errorMessage = "signature does not conform to standards. server string to sign is:" + request.strToSign;
        when(response.getHttpContentString()).thenReturn(makeAcsErrorXML("", "", "IncompleteSignature",
                errorMessage, ""));
        Mockito.doReturn(response).when(spyClient).doAction(request);
        thrown.expect(ClientException.class);
        thrown.expectMessage("SDK.InvalidAccessKeySecret : Specified Access Key Secret is not valid.");
        spyClient.getAcsResponse(request);
    }

    @SuppressWarnings({"unchecked", "rawtypes", "deprecation"})
    @Test
    public void testResponseSignatureNullError() throws ClientException {
        Credential credential = mock(Credential.class);
        when(credential.getSecurityToken()).thenReturn(null);
        DefaultProfile profile = mock(DefaultProfile.class);
        when(profile.getCredential()).thenReturn(credential);
        DefaultAcsClient client = new DefaultAcsClient(profile);
        DefaultAcsClient spyClient = Mockito.spy(client);
        HttpResponse response = mock(HttpResponse.class);
        when(response.getStatus()).thenReturn(400);
        when(response.getHttpContentType()).thenReturn(FormatType.XML);
        AcsRequest request = mock(AcsRequest.class);
        request.strToSign = "GET&%2F&scribeInstancesDXML%26";
        String errorMessage = "signature does not conform to standards. server sgn is:" + request.strToSign;
        when(response.getHttpContentString()).thenReturn(makeAcsErrorXML("", "", "IncompleteSignature",
                errorMessage, ""));
        Mockito.doReturn(response).when(spyClient).doAction(request);
        thrown.expect(ClientException.class);
        thrown.expectMessage("IncompleteSignature : " + errorMessage);
        spyClient.getAcsResponse(request);
    }

    @SuppressWarnings({"unchecked", "rawtypes", "deprecation"})
    @Test
    public void testResponseSignatureError() throws ClientException {
        Credential credential = mock(Credential.class);
        when(credential.getSecurityToken()).thenReturn(null);
        DefaultProfile profile = mock(DefaultProfile.class);
        when(profile.getCredential()).thenReturn(credential);
        DefaultAcsClient client = new DefaultAcsClient(profile);
        HttpResponse response = mock(HttpResponse.class);
        DefaultAcsClient spyClient = Mockito.spy(client);
        when(response.getStatus()).thenReturn(400);
        when(response.getHttpContentType()).thenReturn(FormatType.XML);
        AcsRequest request = mock(AcsRequest.class);
        request.strToSign = "GET&%2F&Action%3DDescribeInances%26Format%3DXML%26";
        String errorMessage = "signature does not conform to standards. server string to sign is:Error Signature";
        when(response.getHttpContentString()).thenReturn(makeAcsErrorXML("", "", "IncompleteSignature",
                errorMessage, ""));
        Mockito.doReturn(response).when(spyClient).doAction(request);
        thrown.expect(ClientException.class);
        thrown.expectMessage("IncompleteSignature : " + errorMessage);
        spyClient.getAcsResponse(request);
    }

    @Test
    public void testResponseSignatureDoesNotMatch() throws ClientException {
        Credential credential = mock(Credential.class);
        when(credential.getSecurityToken()).thenReturn(null);
        DefaultProfile profile = mock(DefaultProfile.class);
        when(profile.getCredential()).thenReturn(credential);
        DefaultAcsClient client = new DefaultAcsClient(profile);
        HttpResponse response = mock(HttpResponse.class);
        DefaultAcsClient spyClient = Mockito.spy(client);
        when(response.getStatus()).thenReturn(400);
        when(response.getHttpContentType()).thenReturn(FormatType.XML);
        AcsRequest request = mock(AcsRequest.class);
        request.strToSign = "GET&%2F&Action%3DDescribeInances%26Format%3DXML%26";
        String errorMessage = "signature does not conform to standards. server string to sign is:Error Signature";
        when(response.getHttpContentString()).thenReturn(makeAcsErrorXML("", "", "SignatureDoesNotMatch",
                errorMessage, ""));
        Mockito.doReturn(response).when(spyClient).doAction(request);
        thrown.expect(ClientException.class);
        thrown.expectMessage("SignatureDoesNotMatch : " + errorMessage);
        spyClient.getAcsResponse(request);
    }

    @SuppressWarnings({"unchecked", "rawtypes", "deprecation"})
    @Test
    public void testResponseStringContentNull() throws ClientException {
        Credential credential = mock(Credential.class);
        when(credential.getSecurityToken()).thenReturn(null);
        DefaultProfile profile = mock(DefaultProfile.class);
        when(profile.getCredential()).thenReturn(credential);
        DefaultAcsClient client = new DefaultAcsClient(profile);
        HttpResponse response = mock(HttpResponse.class);
        DefaultAcsClient spyClient = Mockito.spy(client);
        when(response.getStatus()).thenReturn(400);
        when(response.getHttpContentType()).thenReturn(FormatType.XML);
        AcsRequest request = mock(AcsRequest.class);
        request.strToSign = "GET&%2F&ssddddfgfK";
        when(response.getHttpContentString()).thenReturn(null);
        Mockito.doReturn(response).when(spyClient).doAction(request);
        thrown.expect(ClientException.class);
        thrown.expectMessage(" : ");
        spyClient.getAcsResponse(request);
    }

    @Test
    public void userAgentConfigTest() {
        Credential credential = mock(Credential.class);
        when(credential.getSecurityToken()).thenReturn(null);
        DefaultProfile profile = mock(DefaultProfile.class);
        when(profile.getCredential()).thenReturn(credential);
        DefaultAcsClient client = new DefaultAcsClient(profile);
        client.appendUserAgent("test", "1.2.2");
        client.appendUserAgent("test", "1.2.3");
        client.appendUserAgent("order", "1.2.2");
        String userAgent = UserAgentConfig.resolve(null, client.getUserAgentConfig());
        String resultStr = UserAgentConfig.getDefaultMessage()
                + " HTTPClient/ApacheHttpClient test/1.2.3 order/1.2.2";
        Assert.assertEquals(resultStr, userAgent);
    }

    @Test
    public void doActionWithProxyTest() throws ClientException {
        HttpClientConfig config = new HttpClientConfig();
        config.setCompatibleMode(true);
        DefaultProfile profile = DefaultProfile.getProfile("test", "test", "test");
        profile.setHttpClientConfig(config);
        DefaultAcsClient client = new DefaultAcsClient(profile);
        client.doActionWithProxy(ProtocolType.HTTP, "test", null);
        Assert.assertNull(config.getHttpProxy());

        client.doActionWithProxy(ProtocolType.HTTP, "test", "test");
        Assert.assertEquals(config.getHttpProxy(), "test");

        client.doActionWithProxy(ProtocolType.HTTPS, null, null);
        Assert.assertNull(config.getHttpsProxy());

        client.doActionWithProxy(ProtocolType.HTTPS, "test", null);
        Assert.assertEquals(config.getHttpsProxy(), "test");
    }

    @Test
    public void doActionWithIgnoreSSL() throws ClientException {
        DefaultAcsClient client = new DefaultAcsClient("test");
        CommonRpcRequest request = new CommonRpcRequest("test");
        client.doActionWithIgnoreSSL(request, false);
        Assert.assertFalse(request.isIgnoreSSLCerts());

        client.doActionWithIgnoreSSL(request, true);
        Assert.assertTrue(request.isIgnoreSSLCerts());
    }

    @Test
    public void doUseTrace() throws Exception {
        DefaultAcsClient client = initDefaultAcsClient();
        GlobalTracer.registerIfAbsent(initTracer());
        HttpResponse response = mock(HttpResponse.class);
        Mockito.doReturn(response).when(getHttpClient(client)).syncInvoke((HttpRequest) isNull());
        Mockito.doReturn("http://test.domain").when(response).getSysUrl();
        DefaultEndpointResolver endpointResolver = mock(DefaultEndpointResolver.class);
        client.setEndpointResolver(endpointResolver);
        Mockito.doReturn("endpoint").when(endpointResolver).resolve(Mockito.any(ResolveEndpointRequest.class));
        AcsRequest request = initRequest(TestResponse.class);
        Assert.assertTrue(client.doAction(request) instanceof HttpResponse);
        verify(request).putHeaderParameter(eq("test1"), eq("test1"));
    }

    @Test
    public void parseAcsResponseTest() throws Exception {
        HttpResponse httpResponse = new HttpResponse();
        httpResponse.setHttpContentType(FormatType.RAW);
        httpResponse.setHttpContent("test".getBytes("UTF-8"), "UTF-8", FormatType.RAW);
        Method parseAcsResponse = DefaultAcsClient.class.getDeclaredMethod("parseAcsResponse", AcsRequest.class,
                HttpResponse.class);
        parseAcsResponse.setAccessible(true);
        AssumeRoleRequest roleRequest = new AssumeRoleRequest();
        try {
            parseAcsResponse.invoke(new DefaultAcsClient(DefaultProfile.getProfile("test",
                    "test", "test")), roleRequest, httpResponse);
            Assert.fail();
        } catch (Exception e) {
            Assert.assertEquals("Server response has a bad format type: RAW;\nThe original return is: test;\n" +
                            "The original header is: {Content-Type=application/octet-stream};",
                    e.getCause().getLocalizedMessage());
        }
    }

    @Test
    public void doCloseTrace() throws Exception {
        DefaultAcsClient client = initDefaultAcsClient();
        Mockito.doReturn(true).when(client.getProfile()).isCloseTrace();
        GlobalTracer.registerIfAbsent(initTracer());
        HttpResponse response = mock(HttpResponse.class);
        Mockito.doReturn(response).when(getHttpClient(client)).syncInvoke((HttpRequest) isNull());
        Mockito.doReturn("http://test.domain").when(response).getSysUrl();
        DefaultEndpointResolver endpointResolver = mock(DefaultEndpointResolver.class);
        client.setEndpointResolver(endpointResolver);
        Mockito.doReturn("endpoint").when(endpointResolver).resolve(Mockito.any(ResolveEndpointRequest.class));
        AcsRequest request = initRequest(TestResponse.class);
        Assert.assertTrue(client.doAction(request) instanceof HttpResponse);
    }

    private Tracer initTracer() {
        Tracer tracer = new Tracer() {
            ScopeManager scopeManager = new ThreadLocalScopeManager();

            @Override
            public ScopeManager scopeManager() {
                return scopeManager;
            }

            @Override
            public Span activeSpan() {
                return scopeManager.activeSpan();
            }

            @Override
            public Scope activateSpan(Span span) {
                return scopeManager.activate(span);
            }

            @Override
            public SpanBuilder buildSpan(String operationName) {
                return NoopTracerFactory.create().buildSpan(operationName);
            }

            @Override
            public <C> void inject(SpanContext spanContext, Format<C> format, C carrier) {
                TextMap textMap = (TextMap) carrier;
                textMap.put("test1", "test1");
            }

            @Override
            public <C> SpanContext extract(Format<C> format, C carrier) {
                return null;
            }

            @Override
            public void close() {

            }
        };
        return tracer;
    }

    @Test
    public void testNullDefaultClient() throws ClientException {
        DefaultAcsClient client = new DefaultAcsClient();
        Assert.assertTrue(null != client);
    }
}
