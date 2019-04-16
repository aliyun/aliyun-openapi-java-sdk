package com.aliyuncs.utils;

import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.http.HttpRequest;
import com.aliyuncs.http.HttpResponse;
import com.aliyuncs.http.MethodType;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;

import static com.aliyuncs.utils.LogUtils.DEFAULT_LOG_FORMAT;
import static org.mockito.Mockito.*;

@RunWith(PowerMockRunner.class)
@PrepareForTest({LogUtils.class, InetAddress.class})
public class LogUtilsTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    private HttpRequest createMockHttpRequest(String url, MethodType methodType, String reqBody, ClientException e, Map<String, String> headers) throws ClientException {
        HttpRequest httpRequest = mock(HttpRequest.class);
        when(httpRequest.getSysUrl()).thenReturn(url);
        when(httpRequest.getSysMethod()).thenReturn(methodType);
        if (null != e) {
            doThrow(e).when(httpRequest).getHttpContentString();
        } else {
            when(httpRequest.getHttpContentString()).thenReturn(reqBody);
        }
        when(httpRequest.getSysHeaders()).thenReturn(headers);
        return httpRequest;
    }

    private HttpResponse createMockHttpResponse(int status, String reasonPhrase, String resBody, ClientException e, Map<String, String> headers) throws ClientException {
        HttpResponse httpResponse = mock(HttpResponse.class);
        when(httpResponse.getStatus()).thenReturn(status);
        when(httpResponse.getReasonPhrase()).thenReturn(reasonPhrase);
        if (null != e) {
            doThrow(e).when(httpResponse).getHttpContentString();
        } else {
            when(httpResponse.getHttpContentString()).thenReturn(resBody);
        }
        when(httpResponse.getReasonPhrase()).thenReturn(reasonPhrase);
        when(httpResponse.getSysHeaders()).thenReturn(headers);
        return httpResponse;
    }

    private void mockLogUtils() {
        PowerMockito.mockStatic(LogUtils.class);
        BDDMockito.given(LogUtils.getLocalHostName()).willReturn("host name");
        BDDMockito.given(LogUtils.utcNow()).willReturn("utc now time");
        BDDMockito.given(LogUtils.localeNow()).willReturn("locale now time");

    }

    @Test
    public void logUnitConstructorWithCompleteURL() throws ClientException {
        Map<String, String> reqHeaders = new HashMap<String, String>();
        reqHeaders.put("reqHeaderKey1", "reqHeaderValue1");
        Map<String, String> resHeaders = new HashMap<String, String>();
        reqHeaders.put("resHeaderKey1", "resHeaderValue1");
        HttpRequest httpRequest = createMockHttpRequest("http://www.aliyun.com/path?query=ecs#ref", MethodType.POST, "req body", null, reqHeaders);
        HttpResponse httpResponse = createMockHttpResponse(200, "OK", "res body", null, resHeaders);
        mockLogUtils();
        LogUtils.LogUnit logUnit = new LogUtils.LogUnit(httpRequest, httpResponse);
        Assert.assertEquals("utc now time", logUnit.getTs());
        Assert.assertEquals("/path?query=ecs#ref", logUnit.getTarget());
        Assert.assertEquals("200", logUnit.getCode());
        Assert.assertEquals("OK", logUnit.getPhrase());
        Assert.assertEquals("req body", logUnit.getReqBody());
        Assert.assertEquals("locale now time", logUnit.getTime());
    }

    @Test
    public void logUnitConstructorWithCompleteURLAndNonePhrase() throws ClientException {
        Map<String, String> reqHeaders = new HashMap<String, String>();
        reqHeaders.put("reqHeaderKey1", "reqHeaderValue1");
        Map<String, String> resHeaders = new HashMap<String, String>();
        reqHeaders.put("resHeaderKey1", "resHeaderValue1");
        HttpRequest httpRequest = createMockHttpRequest("http://www.aliyun.com/path?query=ecs#ref", MethodType.POST, "req body", null, reqHeaders);
        HttpResponse httpResponse = createMockHttpResponse(200, null, "res body", null, resHeaders);
        mockLogUtils();
        LogUtils.LogUnit logUnit = new LogUtils.LogUnit(httpRequest, httpResponse);
        Assert.assertEquals("utc now time", logUnit.getTs());
        Assert.assertEquals("/path?query=ecs#ref", logUnit.getTarget());
        Assert.assertEquals("200", logUnit.getCode());
        Assert.assertEquals("", logUnit.getPhrase());
        Assert.assertEquals("req body", logUnit.getReqBody());
        Assert.assertEquals("locale now time", logUnit.getTime());
    }

    @Test
    public void logUnitConstructorWithUnCompleteURLAndNonePhrase() throws ClientException {
        Map<String, String> reqHeaders = new HashMap<String, String>();
        reqHeaders.put("reqHeaderKey1", "reqHeaderValue1");
        Map<String, String> resHeaders = new HashMap<String, String>();
        reqHeaders.put("resHeaderKey1", "resHeaderValue1");
        HttpRequest httpRequest = createMockHttpRequest("http://www.aliyun.com", MethodType.POST, "req body", null, reqHeaders);
        HttpResponse httpResponse = createMockHttpResponse(200, null, "res body", null, resHeaders);
        mockLogUtils();
        LogUtils.LogUnit logUnit = new LogUtils.LogUnit(httpRequest, httpResponse);
        Assert.assertEquals("utc now time", logUnit.getTs());
        Assert.assertEquals("", logUnit.getTarget());
        Assert.assertEquals("200", logUnit.getCode());
        Assert.assertEquals("", logUnit.getPhrase());
        Assert.assertEquals("req body", logUnit.getReqBody());
        Assert.assertEquals("locale now time", logUnit.getTime());
    }

    @Test
    public void logUnitConstructorWithErrorURL() throws ClientException {
        Map<String, String> reqHeaders = new HashMap<String, String>();
        reqHeaders.put("reqHeaderKey1", "reqHeaderValue1");
        Map<String, String> resHeaders = new HashMap<String, String>();
        reqHeaders.put("resHeaderKey1", "resHeaderValue1");
        HttpRequest httpRequest = createMockHttpRequest("mock exception://www.aliyun.com/path?query=ecs#ref",
                MethodType.POST, "req body", null, reqHeaders);
        HttpResponse httpResponse = createMockHttpResponse(200, "OK", "res body",
                null, resHeaders);
        mockLogUtils();
        LogUtils.LogUnit logUnit = new LogUtils.LogUnit(httpRequest, httpResponse);
        Assert.assertEquals("utc now time", logUnit.getTs());
        Assert.assertEquals(null, logUnit.getTarget());
        Assert.assertEquals("200", logUnit.getCode());
        Assert.assertEquals("OK", logUnit.getPhrase());
        Assert.assertEquals("req body", logUnit.getReqBody());
        Assert.assertEquals("locale now time", logUnit.getTime());
    }

    @Test
    public void logUnitConstructorWithExceptionBody() throws ClientException {
        Map<String, String> reqHeaders = new HashMap<String, String>();
        reqHeaders.put("reqHeaderKey1", "reqHeaderValue1");
        ClientException exception = mock(ClientException.class);
        HttpRequest httpRequest = createMockHttpRequest("http://www.aliyun.com/path?query=ecs#ref",
                MethodType.POST, "req body", exception, reqHeaders);
        mockLogUtils();
        LogUtils.LogUnit logUnit = new LogUtils.LogUnit(httpRequest, null);
        Assert.assertEquals("utc now time", logUnit.getTs());
        Assert.assertEquals("www.aliyun.com", logUnit.getHost());
        Assert.assertEquals("/path?query=ecs#ref", logUnit.getTarget());
        Assert.assertEquals("locale now time", logUnit.getTime());
    }

    @Test
    public void logUnitGetSetTest() throws ClientException {
        Map<String, String> reqHeaders = new HashMap<String, String>();
        reqHeaders.put("reqHeaderKey1", "reqHeaderValue1");
        Map<String, String> resHeaders = new HashMap<String, String>();
        reqHeaders.put("resHeaderKey1", "resHeaderValue1");
        HttpRequest httpRequest = createMockHttpRequest("http://www.aliyun.com/path?query=ecs#ref",
                MethodType.POST, "req body", null, reqHeaders);
        HttpResponse httpResponse = createMockHttpResponse(200, "OK", "res body",
                null, resHeaders);
        mockLogUtils();
        LogUtils.LogUnit logUnit = new LogUtils.LogUnit(httpRequest, httpResponse);
        HttpRequest request = mock(HttpRequest.class);
        logUnit.setHttpRequest(request);
        Assert.assertEquals(request, logUnit.getHttpRequest());

        HttpResponse response = mock(HttpResponse.class);
        logUnit.setHttpResponse(response);
        Assert.assertEquals(response, logUnit.getHttpResponse());

        logUnit.setMethod("post");
        Assert.assertEquals("post", logUnit.getMethod());

        logUnit.setUrl("test url");
        Assert.assertEquals("test url", logUnit.getUrl());

        logUnit.setVersion("1.1");
        Assert.assertEquals("1.1", logUnit.getVersion());

        logUnit.setHostname("host name");
        Assert.assertEquals("host name", logUnit.getHostname());

        logUnit.setReqHeaders("req headers");
        Assert.assertEquals("req headers", logUnit.getReqHeaders());

        logUnit.setResHeaders("res headers");
        Assert.assertEquals("res headers", logUnit.getResHeaders());

        logUnit.setResBody("res body");
        Assert.assertEquals("res body", logUnit.getResBody());

        logUnit.setPid("pid");
        Assert.assertEquals("pid", logUnit.getPid());

        logUnit.setCost("100ms");
        Assert.assertEquals("100ms", logUnit.getCost());

        logUnit.setStartTime("start time");
        Assert.assertEquals("start time", logUnit.getStartTime());

        logUnit.setTs("ts time");
        Assert.assertEquals("ts time", logUnit.getTs());

        logUnit.setHost("host");
        Assert.assertEquals("host", logUnit.getHost());

        logUnit.setTarget("target");
        Assert.assertEquals("target", logUnit.getTarget());

        logUnit.setCode("200");
        Assert.assertEquals("200", logUnit.getCode());

        logUnit.setPhrase("OK");
        Assert.assertEquals("OK", logUnit.getPhrase());

        logUnit.setReqBody("req body");
        Assert.assertEquals("req body", logUnit.getReqBody());

        logUnit.setTime("now");
        Assert.assertEquals("now", logUnit.getTime());
    }

    @Test
    public void logUtilsConstructor() {
        Assert.assertNotNull(new LogUtils());
    }

    @Test
    public void utcNowTest() {
        Assert.assertNotNull(LogUtils.utcNow());
    }

    @Test
    public void localeNowTest() {
        Assert.assertNotNull(LogUtils.localeNow());
    }

    @Test
    public void getCurrentPID() {
        Assert.assertNotNull(LogUtils.getCurrentPID());
    }

    @Test
    public void getLocalHostName() throws UnknownHostException {
        PowerMockito.mockStatic(InetAddress.class);
        BDDMockito.given(InetAddress.getLocalHost()).willThrow(UnknownHostException.class);
        String localHostName = LogUtils.getLocalHostName();
        Assert.assertEquals("unknown host name", localHostName);
    }

    @Test
    public void createLogUnitTest() throws ClientException {
        Map<String, String> reqHeaders = new HashMap<String, String>();
        reqHeaders.put("reqHeaderKey1", "reqHeaderValue1");
        Map<String, String> resHeaders = new HashMap<String, String>();
        reqHeaders.put("resHeaderKey1", "resHeaderValue1");
        HttpRequest httpRequest = createMockHttpRequest("http://www.aliyun.com/path?query=ecs#ref",
                MethodType.POST, "req body", null, reqHeaders);
        HttpResponse httpResponse = createMockHttpResponse(200, "OK", "res body",
                null, resHeaders);
        Assert.assertNotNull(LogUtils.createLogUnit(httpRequest, httpResponse));
    }

    @Test
    public void fillContentTest() throws ClientException {
        String format = DEFAULT_LOG_FORMAT +
                " {req_header_exist} {req_header_nonExist} {res_header_exist} {res_header_nonExist}";
        Map<String, String> reqHeaders = new HashMap<String, String>();
        reqHeaders.put("reqHeader", "reqValue");
        Map<String, String> resHeaders = new HashMap<String, String>();
        resHeaders.put("resHeader", "resValue");
        LogUtils.LogUnit logUnit = mock(LogUtils.LogUnit.class);
        when(logUnit.getMethod()).thenReturn("POST");
        when(logUnit.getUrl()).thenReturn("https://www.aliyun.com/path#ref");
        when(logUnit.getVersion()).thenReturn("1.1");
        when(logUnit.getError()).thenReturn("testError");
        when(logUnit.getCode()).thenReturn("200");
        when(logUnit.getCost()).thenReturn("100ms");
        when(logUnit.getHostname()).thenReturn("host name");
        when(logUnit.getPid()).thenReturn("pid");
        when(logUnit.getReqHeaders()).thenReturn(reqHeaders.toString());
        when(logUnit.getResHeaders()).thenReturn(resHeaders.toString());
        HttpRequest httpRequest = mock(HttpRequest.class);
        when(httpRequest.toString()).thenReturn("httpRequest string");
        when(httpRequest.getHeaderValue("exist")).thenReturn("req_header_exist");
        HttpResponse httpResponse = mock(HttpResponse.class);
        when(httpResponse.toString()).thenReturn("httpResponse string");
        when(httpResponse.getHeaderValue("exist")).thenReturn("res_header_exist");
        when(logUnit.getHttpRequest()).thenReturn(httpRequest);
        when(logUnit.getHttpResponse()).thenReturn(httpResponse);
        when(logUnit.getTs()).thenReturn("ts");
        when(logUnit.getHost()).thenReturn("host");
        when(logUnit.getTarget()).thenReturn("target");
        when(logUnit.getPhrase()).thenReturn("OK");
        when(logUnit.getReqBody()).thenReturn("req body");
        when(logUnit.getResBody()).thenReturn("res body");
        when(logUnit.getStartTime()).thenReturn("start time");
        when(logUnit.getTime()).thenReturn("time");
        Assert.assertEquals("POST https://www.aliyun.com/path#ref HTTP/1.1 200 100ms host name pid testError" +
                " req_header_exist {req_header_nonExist} res_header_exist {res_header_nonExist}",
                LogUtils.fillContent(format, logUnit));
    }

}
