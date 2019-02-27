package com.aliyuncs.http.clients;

import static com.aliyuncs.http.clients.CompatibleUrlConnClient.CONTENT_TYPE;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.powermock.api.mockito.PowerMockito.verifyPrivate;
import static org.powermock.api.mockito.PowerMockito.verifyStatic;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.reflect.Whitebox;

import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.http.CallBack;
import com.aliyuncs.http.FormatType;
import com.aliyuncs.http.HttpClientConfig;
import com.aliyuncs.http.HttpRequest;
import com.aliyuncs.http.HttpResponse;
import com.aliyuncs.http.MethodType;

@RunWith(PowerMockRunner.class)
@PrepareForTest(CompatibleUrlConnClient.class)
@PowerMockIgnore({ "javax.net.ssl.*" })
public class CompatibleUrlConnClientTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void constructorWithIgnoreSSLCert() throws Exception {
        HttpClientConfig config = mock(HttpClientConfig.class);
        SSLSocketFactory sslSocketFactory = mock(SSLSocketFactory.class);
        when(config.getSslSocketFactory()).thenReturn(sslSocketFactory);
        when(config.isIgnoreSSLCerts()).thenReturn(true);
        PowerMockito.mockStatic(CompatibleUrlConnClient.HttpsCertIgnoreHelper.class);
        PowerMockito.doNothing().when(CompatibleUrlConnClient.HttpsCertIgnoreHelper.class, "ignoreSSLCertificate");
        new CompatibleUrlConnClient(config);
    }

    @Test
    public void constructorWithNotIgnoreSSLCert() throws ClientException {
        HttpClientConfig config = mock(HttpClientConfig.class);
        SSLSocketFactory sslSocketFactory = mock(SSLSocketFactory.class);
        when(config.getSslSocketFactory()).thenReturn(sslSocketFactory);
        when(config.isIgnoreSSLCerts()).thenReturn(false);
        new CompatibleUrlConnClient(config);
    }

    @Test
    public void asyncInvokeTest() throws ClientException, IOException {
        thrown.expect(IllegalStateException.class);
        HttpClientConfig config = mock(HttpClientConfig.class);
        SSLSocketFactory sslSocketFactory = mock(SSLSocketFactory.class);
        when(config.getSslSocketFactory()).thenReturn(sslSocketFactory);
        when(config.isIgnoreSSLCerts()).thenReturn(false);
        CompatibleUrlConnClient client = new CompatibleUrlConnClient(config);
        HttpRequest request = mock(HttpRequest.class);
        CallBack callback = mock(CallBack.class);
        client.asyncInvoke(request, callback);
    }

    @Test
    public void ignoreSSLCertificateTest() throws Exception {
        PowerMockito.mockStatic(CompatibleUrlConnClient.HttpsCertIgnoreHelper.class);
        PowerMockito.doNothing().when(CompatibleUrlConnClient.HttpsCertIgnoreHelper.class, "ignoreSSLCertificate");
        HttpClientConfig config = mock(HttpClientConfig.class);
        SSLSocketFactory sslSocketFactory = mock(SSLSocketFactory.class);
        when(config.getSslSocketFactory()).thenReturn(sslSocketFactory);
        when(config.isIgnoreSSLCerts()).thenReturn(true);
        CompatibleUrlConnClient client = new CompatibleUrlConnClient(config);
        client.ignoreSSLCertificate();
        verifyStatic(CompatibleUrlConnClient.HttpsCertIgnoreHelper.class, times(1));

    }

    @Test
    public void restoreSSLCertificateTest() throws Exception {
        PowerMockito.mockStatic(CompatibleUrlConnClient.HttpsCertIgnoreHelper.class);
        PowerMockito.doNothing().when(CompatibleUrlConnClient.HttpsCertIgnoreHelper.class, "restoreSSLCertificate");
        HttpClientConfig config = mock(HttpClientConfig.class);
        SSLSocketFactory sslSocketFactory = mock(SSLSocketFactory.class);
        when(config.getSslSocketFactory()).thenReturn(sslSocketFactory);
        when(config.isIgnoreSSLCerts()).thenReturn(true);
        CompatibleUrlConnClient client = new CompatibleUrlConnClient(config);
        client.restoreSSLCertificate();
        verifyStatic(CompatibleUrlConnClient.HttpsCertIgnoreHelper.class, times(1));

    }

    @Test
    public void closeTest() throws Exception {
        HttpClientConfig config = mock(HttpClientConfig.class);
        SSLSocketFactory sslSocketFactory = mock(SSLSocketFactory.class);
        when(config.getSslSocketFactory()).thenReturn(sslSocketFactory);
        when(config.isIgnoreSSLCerts()).thenReturn(true);
        PowerMockito.mockStatic(CompatibleUrlConnClient.HttpsCertIgnoreHelper.class);
        PowerMockito.doNothing().when(CompatibleUrlConnClient.HttpsCertIgnoreHelper.class, "ignoreSSLCertificate");
        CompatibleUrlConnClient client = new CompatibleUrlConnClient(config);
        client.close();

    }

    @Test
    public void buildHttpConnectionNullSysUrlTest() throws Exception {
        HttpClientConfig config = mock(HttpClientConfig.class);
        SSLSocketFactory sslSocketFactory = mock(SSLSocketFactory.class);
        when(config.getSslSocketFactory()).thenReturn(sslSocketFactory);
        when(config.isIgnoreSSLCerts()).thenReturn(true);
        PowerMockito.mockStatic(CompatibleUrlConnClient.HttpsCertIgnoreHelper.class);
        PowerMockito.doNothing().when(CompatibleUrlConnClient.HttpsCertIgnoreHelper.class, "ignoreSSLCertificate");
        CompatibleUrlConnClient client = new CompatibleUrlConnClient(config);
        thrown.expect(IllegalArgumentException.class);
        HttpRequest request = mock(HttpRequest.class);
        Whitebox.invokeMethod(client, "buildHttpConnection", request);

    }

    @Test
    public void buildHttpConnectionNullSysMethodTest() throws Exception {
        HttpClientConfig config = mock(HttpClientConfig.class);
        SSLSocketFactory sslSocketFactory = mock(SSLSocketFactory.class);
        when(config.getSslSocketFactory()).thenReturn(sslSocketFactory);
        when(config.isIgnoreSSLCerts()).thenReturn(true);
        PowerMockito.mockStatic(CompatibleUrlConnClient.HttpsCertIgnoreHelper.class);
        PowerMockito.doNothing().when(CompatibleUrlConnClient.HttpsCertIgnoreHelper.class, "ignoreSSLCertificate");
        CompatibleUrlConnClient client = new CompatibleUrlConnClient(config);
        thrown.expect(IllegalArgumentException.class);
        HttpRequest request = mock(HttpRequest.class);
        when(request.getSysUrl()).thenReturn("sysUrl");
        Whitebox.invokeMethod(client, "buildHttpConnection", request);
    }

    @Test
    public void buildHttpConnectionPOSTMethodAndNullContentAndHttpsTest() throws Exception {
        HttpClientConfig config = mock(HttpClientConfig.class);
        SSLSocketFactory sslSocketFactory = mock(SSLSocketFactory.class);
        when(config.getSslSocketFactory()).thenReturn(sslSocketFactory);
        when(config.isIgnoreSSLCerts()).thenReturn(true);
        PowerMockito.mockStatic(CompatibleUrlConnClient.HttpsCertIgnoreHelper.class);
        PowerMockito.doNothing().when(CompatibleUrlConnClient.HttpsCertIgnoreHelper.class, "ignoreSSLCertificate");
        CompatibleUrlConnClient client0 = new CompatibleUrlConnClient(config);
        CompatibleUrlConnClient client = PowerMockito.spy(client0);
        Proxy proxy = Proxy.NO_PROXY;
        PowerMockito.doReturn(proxy).when(client, "getProxy", anyString(), any(HttpRequest.class));
        HttpRequest request = mock(HttpRequest.class);
        when(request.getSysMethod()).thenReturn(MethodType.POST);
        when(request.getSysUrl()).thenReturn("https://www.aliyun.com");
        when(request.getSysConnectTimeout()).thenReturn(120);
        when(request.getSysReadTimeout()).thenReturn(120);
        Map<String, String> headers = new HashMap<String, String>() {
            {
                put("header1", "value1");
                put(CONTENT_TYPE, "json");

            }
        };
        when(request.getSysHeaders()).thenReturn(headers);
        when(request.getHeaderValue(CONTENT_TYPE)).thenReturn("json");
        HttpURLConnection connection = Whitebox.invokeMethod(client, "buildHttpConnection", request);
        Assert.assertEquals(120, connection.getConnectTimeout());
        Assert.assertEquals("value1", connection.getRequestProperty("header1"));
        Assert.assertEquals("json", connection.getRequestProperty(CONTENT_TYPE));
        verifyPrivate(client, times(1)).invoke("getProxy", "HTTPS_PROXY", request);
    }

    @Test
    public void buildHttpConnectionPOSTMethodAndHttpTest() throws Exception {
        HttpClientConfig config = mock(HttpClientConfig.class);
        SSLSocketFactory sslSocketFactory = mock(SSLSocketFactory.class);
        when(config.getSslSocketFactory()).thenReturn(sslSocketFactory);
        when(config.isIgnoreSSLCerts()).thenReturn(true);
        PowerMockito.mockStatic(CompatibleUrlConnClient.HttpsCertIgnoreHelper.class);
        PowerMockito.doNothing().when(CompatibleUrlConnClient.HttpsCertIgnoreHelper.class, "ignoreSSLCertificate");
        CompatibleUrlConnClient client0 = new CompatibleUrlConnClient(config);
        CompatibleUrlConnClient client = PowerMockito.spy(client0);
        Proxy proxy = Proxy.NO_PROXY;
        PowerMockito.doReturn(proxy).when(client, "getProxy", anyString(), any(HttpRequest.class));
        HttpRequest request = mock(HttpRequest.class);
        when(request.getHttpContent()).thenReturn("content".getBytes());
        when(request.getSysMethod()).thenReturn(MethodType.POST);
        when(request.getSysUrl()).thenReturn("http://www.aliyun.com");
        when(request.getContentTypeValue(any(FormatType.class), anyString())).thenReturn("json");
        HttpURLConnection connection = Whitebox.invokeMethod(client, "buildHttpConnection", request);
        Assert.assertEquals(0, connection.getConnectTimeout());
        Assert.assertEquals(null, connection.getRequestProperty("header1"));
        verifyPrivate(client, times(1)).invoke("getProxy", "HTTP_PROXY", request);

    }

    @Test
    public void buildHttpConnectionGETMethodAndHttpsTest() throws Exception {
        HttpClientConfig config = mock(HttpClientConfig.class);
        when(config.isIgnoreSSLCerts()).thenReturn(true);
        PowerMockito.mockStatic(CompatibleUrlConnClient.HttpsCertIgnoreHelper.class);
        PowerMockito.doNothing().when(CompatibleUrlConnClient.HttpsCertIgnoreHelper.class, "ignoreSSLCertificate");
        CompatibleUrlConnClient client0 = new CompatibleUrlConnClient(config);
        CompatibleUrlConnClient client = PowerMockito.spy(client0);
        Proxy proxy = Proxy.NO_PROXY;
        PowerMockito.doReturn(proxy).when(client, "getProxy", anyString(), any(HttpRequest.class));
        HttpRequest request = mock(HttpRequest.class);
        when(request.getHttpContent()).thenReturn("content".getBytes());
        when(request.getSysMethod()).thenReturn(MethodType.POST);
        when(request.getSysUrl()).thenReturn("https://www.aliyun.com");
        when(request.getContentTypeValue(any(FormatType.class), anyString())).thenReturn(null);
        when(request.getSysConnectTimeout()).thenReturn(null);
        when(request.getSysReadTimeout()).thenReturn(null);
        HttpURLConnection connection = Whitebox.invokeMethod(client, "buildHttpConnection", request);
        Assert.assertEquals(0, connection.getConnectTimeout());
        Assert.assertEquals(null, connection.getRequestProperty("header1"));
        verifyPrivate(client, times(1)).invoke("getProxy", "HTTP_PROXY", request);
    }

    @Test
    public void buildHttpConnectionGETMethodAndNullContentTest() throws Exception {
        HttpClientConfig config = mock(HttpClientConfig.class);
        when(config.isIgnoreSSLCerts()).thenReturn(true);
        PowerMockito.mockStatic(CompatibleUrlConnClient.HttpsCertIgnoreHelper.class);
        PowerMockito.doNothing().when(CompatibleUrlConnClient.HttpsCertIgnoreHelper.class, "ignoreSSLCertificate");
        CompatibleUrlConnClient client0 = new CompatibleUrlConnClient(config);
        CompatibleUrlConnClient client = PowerMockito.spy(client0);
        Proxy proxy = Proxy.NO_PROXY;
        PowerMockito.doReturn(proxy).when(client, "getProxy", anyString(), any(HttpRequest.class));
        HttpRequest request = mock(HttpRequest.class);
        when(request.getHttpContent()).thenReturn(null);
        when(request.getSysMethod()).thenReturn(MethodType.GET);
        when(request.getSysUrl()).thenReturn("https://www.aliyun.com");
        when(request.getContentTypeValue(any(FormatType.class), anyString())).thenReturn(null);
        when(request.getSysConnectTimeout()).thenReturn(null);
        when(request.getSysReadTimeout()).thenReturn(null);
        HttpURLConnection connection = Whitebox.invokeMethod(client, "buildHttpConnection", request);
        Assert.assertEquals(0, connection.getConnectTimeout());
        Assert.assertEquals(null, connection.getRequestProperty("header1"));
        verifyPrivate(client, times(1)).invoke("getProxy", "HTTP_PROXY", request);
    }

    @Test
    public void readContentWithNullTest() throws Exception {
        HttpClientConfig config = mock(HttpClientConfig.class);
        when(config.isIgnoreSSLCerts()).thenReturn(true);
        PowerMockito.mockStatic(CompatibleUrlConnClient.HttpsCertIgnoreHelper.class);
        PowerMockito.doNothing().when(CompatibleUrlConnClient.HttpsCertIgnoreHelper.class, "ignoreSSLCertificate");
        CompatibleUrlConnClient client = new CompatibleUrlConnClient(config);
        byte[] content = Whitebox.invokeMethod(client, "readContent", null);
        Assert.assertNull(content);
    }

    @Test
    public void readContentNormalContentTest() throws Exception {
        HttpClientConfig config = mock(HttpClientConfig.class);
        when(config.isIgnoreSSLCerts()).thenReturn(true);
        PowerMockito.mockStatic(CompatibleUrlConnClient.HttpsCertIgnoreHelper.class);
        PowerMockito.doNothing().when(CompatibleUrlConnClient.HttpsCertIgnoreHelper.class, "ignoreSSLCertificate");
        CompatibleUrlConnClient client = new CompatibleUrlConnClient(config);
        InputStream inputStream = mock(InputStream.class);
        doAnswer(new Answer() {
            @Override
            public Object answer(InvocationOnMock invocationOnMock) throws Throwable {
                byte[] buffer = (byte[]) invocationOnMock.getArguments()[0];
                buffer[0] = 'a';
                buffer[1] = 'b';
                return 2;
            }
        }).doAnswer(new Answer() {
            @Override
            public Object answer(InvocationOnMock invocationOnMock) throws Throwable {
                return -1;
            }
        }).when(inputStream).read(any(byte[].class));
        byte[] content = Whitebox.invokeMethod(client, "readContent", inputStream);

        Assert.assertEquals(2, content.length);
        Assert.assertEquals('a', content[0]);
        Assert.assertEquals('b', content[1]);
    }

    @Test
    public void syncInvokeIOExceptionTest() throws Exception {
        HttpClientConfig config = mock(HttpClientConfig.class);
        when(config.isIgnoreSSLCerts()).thenReturn(true);
        PowerMockito.mockStatic(CompatibleUrlConnClient.HttpsCertIgnoreHelper.class);
        PowerMockito.doNothing().when(CompatibleUrlConnClient.HttpsCertIgnoreHelper.class, "ignoreSSLCertificate");
        CompatibleUrlConnClient client0 = new CompatibleUrlConnClient(config);
        CompatibleUrlConnClient client = PowerMockito.spy(client0);
        HttpRequest request = mock(HttpRequest.class);
        HttpURLConnection connection = mock(HttpURLConnection.class);
        doThrow(new IOException()).when(connection).connect();
        PowerMockito.doReturn(connection).when(client, "buildHttpConnection", request);
        URL url = PowerMockito.mock(URL.class);
        when(url.toString()).thenReturn("http://www.aliyun.com");
        when(connection.getURL()).thenReturn(url);
        InputStream errorStream = mock(InputStream.class);
        when(connection.getErrorStream()).thenReturn(errorStream);
        PowerMockito.doNothing().when(client, "parseHttpConn", any(HttpResponse.class), any(HttpURLConnection.class),
                any(InputStream.class));
        HttpResponse response = client.syncInvoke(request);
        verifyPrivate(client, times(1)).invoke("parseHttpConn", any(HttpResponse.class), any(HttpURLConnection.class),
                any(InputStream.class));
        Assert.assertEquals("http://www.aliyun.com", response.getSysUrl());
    }


    @Test
    public void syncInvokeNormalAndNoneMethodAndContentIsNotEmptyTest() throws Exception {
        thrown.expect(NullPointerException.class);
        HttpClientConfig config = mock(HttpClientConfig.class);
        when(config.isIgnoreSSLCerts()).thenReturn(true);
        PowerMockito.mockStatic(CompatibleUrlConnClient.HttpsCertIgnoreHelper.class);
        PowerMockito.doNothing().when(CompatibleUrlConnClient.HttpsCertIgnoreHelper.class, "ignoreSSLCertificate");
        CompatibleUrlConnClient client0 = new CompatibleUrlConnClient(config);
        CompatibleUrlConnClient client = PowerMockito.spy(client0);
        HttpRequest request = mock(HttpRequest.class);
        when(request.getHttpContent()).thenReturn("http content".getBytes());
        HttpURLConnection connection = mock(HttpURLConnection.class);
        doNothing().when(connection).connect();
        PowerMockito.doReturn(connection).when(client, "buildHttpConnection", request);
        URL url = PowerMockito.mock(URL.class);
        when(url.toString()).thenReturn("http://www.aliyun.com");
        when(connection.getURL()).thenReturn(url);
        OutputStream outputStream = mock(OutputStream.class);
        doNothing().when(outputStream).write("http content".getBytes());
        when(connection.getOutputStream()).thenReturn(outputStream);
        when(connection.getInputStream()).thenReturn(null);
        PowerMockito.doNothing().when(client, "parseHttpConn", any(HttpResponse.class), any(HttpURLConnection.class),
                any(InputStream.class));
        client.syncInvoke(request);

    }

    @Test
    public void syncInvokeNormalAndGetMethodAndContentIsNotEmptyTest() throws Exception {
        HttpClientConfig config = mock(HttpClientConfig.class);
        when(config.isIgnoreSSLCerts()).thenReturn(true);
        PowerMockito.mockStatic(CompatibleUrlConnClient.HttpsCertIgnoreHelper.class);
        PowerMockito.doNothing().when(CompatibleUrlConnClient.HttpsCertIgnoreHelper.class, "ignoreSSLCertificate");
        CompatibleUrlConnClient client0 = new CompatibleUrlConnClient(config);
        CompatibleUrlConnClient client = PowerMockito.spy(client0);
        HttpRequest request = mock(HttpRequest.class);
        when(request.getSysMethod()).thenReturn(MethodType.GET);
        when(request.getHttpContent()).thenReturn("http content".getBytes());
        HttpURLConnection connection = mock(HttpURLConnection.class);
        doNothing().when(connection).connect();
        PowerMockito.doReturn(connection).when(client, "buildHttpConnection", request);
        URL url = PowerMockito.mock(URL.class);
        when(url.toString()).thenReturn("http://www.aliyun.com");
        when(connection.getURL()).thenReturn(url);
        OutputStream outputStream = mock(OutputStream.class);
        doNothing().when(outputStream).write("http content".getBytes());
        when(connection.getOutputStream()).thenReturn(outputStream);
        when(connection.getInputStream()).thenReturn(null);
        PowerMockito.doNothing().when(client, "parseHttpConn", any(HttpResponse.class), any(HttpURLConnection.class),
                any(InputStream.class));
        HttpResponse response = client.syncInvoke(request);
        verifyPrivate(client, times(1)).invoke("parseHttpConn", any(HttpResponse.class), any(HttpURLConnection.class),
                any(InputStream.class));
        Assert.assertEquals("http://www.aliyun.com", response.getSysUrl());
        verify(outputStream, times(0)).write("http content".getBytes());

    }

    @Test
    public void syncInvokeNormalAndPostMethodAndContentIsNotEmptyTest() throws Exception {
        HttpClientConfig config = mock(HttpClientConfig.class);
        when(config.isIgnoreSSLCerts()).thenReturn(true);
        PowerMockito.mockStatic(CompatibleUrlConnClient.HttpsCertIgnoreHelper.class);
        PowerMockito.doNothing().when(CompatibleUrlConnClient.HttpsCertIgnoreHelper.class, "ignoreSSLCertificate");
        CompatibleUrlConnClient client0 = new CompatibleUrlConnClient(config);
        CompatibleUrlConnClient client = PowerMockito.spy(client0);
        HttpRequest request = mock(HttpRequest.class);
        when(request.getSysMethod()).thenReturn(MethodType.POST);
        when(request.getHttpContent()).thenReturn("http content".getBytes());
        HttpURLConnection connection = mock(HttpURLConnection.class);
        doNothing().when(connection).connect();
        PowerMockito.doReturn(connection).when(client, "buildHttpConnection", request);
        URL url = PowerMockito.mock(URL.class);
        when(url.toString()).thenReturn("http://www.aliyun.com");
        when(connection.getURL()).thenReturn(url);
        OutputStream outputStream = mock(OutputStream.class);
        doNothing().when(outputStream).write("http content".getBytes());
        when(connection.getOutputStream()).thenReturn(outputStream);
        when(connection.getInputStream()).thenReturn(null);
        PowerMockito.doNothing().when(client, "parseHttpConn", any(HttpResponse.class), any(HttpURLConnection.class),
                any(InputStream.class));
        HttpResponse response = client.syncInvoke(request);
        verifyPrivate(client, times(1)).invoke("parseHttpConn", any(HttpResponse.class), any(HttpURLConnection.class),
                any(InputStream.class));
        Assert.assertEquals("http://www.aliyun.com", response.getSysUrl());
        verify(outputStream, times(1)).write("http content".getBytes());
    }

    @Test
    public void syncInvokeNormalAndContentIsEmptyTest() throws Exception {
        HttpClientConfig config = mock(HttpClientConfig.class);
        when(config.isIgnoreSSLCerts()).thenReturn(true);
        PowerMockito.mockStatic(CompatibleUrlConnClient.HttpsCertIgnoreHelper.class);
        PowerMockito.doNothing().when(CompatibleUrlConnClient.HttpsCertIgnoreHelper.class, "ignoreSSLCertificate");
        CompatibleUrlConnClient client0 = new CompatibleUrlConnClient(config);
        CompatibleUrlConnClient client = PowerMockito.spy(client0);
        HttpRequest request = mock(HttpRequest.class);
        when(request.getSysMethod()).thenReturn(MethodType.GET);
        when(request.getHttpContent()).thenReturn("".getBytes());
        HttpURLConnection connection = mock(HttpURLConnection.class);
        doNothing().when(connection).connect();
        PowerMockito.doReturn(connection).when(client, "buildHttpConnection", request);
        URL url = PowerMockito.mock(URL.class);
        when(url.toString()).thenReturn("http://www.aliyun.com");
        when(connection.getURL()).thenReturn(url);
        when(connection.getInputStream()).thenReturn(null);
        PowerMockito.doNothing().when(client, "parseHttpConn", any(HttpResponse.class), any(HttpURLConnection.class),
                any(InputStream.class));
        HttpResponse response = client.syncInvoke(request);
        verifyPrivate(client, times(1)).invoke("parseHttpConn", any(HttpResponse.class), any(HttpURLConnection.class),
                any(InputStream.class));
        Assert.assertEquals("http://www.aliyun.com", response.getSysUrl());
    }

    @Test
    public void getProxyReturnNullTest() throws Exception {
        HttpClientConfig config = mock(HttpClientConfig.class);
        when(config.isIgnoreSSLCerts()).thenReturn(true);
        PowerMockito.mockStatic(CompatibleUrlConnClient.HttpsCertIgnoreHelper.class);
        PowerMockito.doNothing().when(CompatibleUrlConnClient.HttpsCertIgnoreHelper.class, "ignoreSSLCertificate");
        CompatibleUrlConnClient client = new CompatibleUrlConnClient(config);
        Proxy proxy = Whitebox.invokeMethod(client, "getProxy", "notExistEnv", mock(HttpRequest.class));
        Assert.assertEquals(Proxy.NO_PROXY, proxy);
    }

    @Test
    public void parseHttpConnNormalTest() throws Exception {
        HttpResponse response = mock(HttpResponse.class);
        HttpURLConnection connection = mock(HttpURLConnection.class);
        InputStream content = mock(InputStream.class);
        HttpClientConfig config = mock(HttpClientConfig.class);
        when(config.isIgnoreSSLCerts()).thenReturn(true);
        PowerMockito.mockStatic(CompatibleUrlConnClient.HttpsCertIgnoreHelper.class);
        PowerMockito.doNothing().when(CompatibleUrlConnClient.HttpsCertIgnoreHelper.class, "ignoreSSLCertificate");
        CompatibleUrlConnClient client0 = new CompatibleUrlConnClient(config);
        CompatibleUrlConnClient client = PowerMockito.spy(client0);
        when(connection.getResponseCode()).thenReturn(200);
        Map<String, List<String>> headers = new HashMap<String, List<String>>();
        headers.put(null, null);
        headers.put("header1", new ArrayList<String>() {
            {
                add("value1");
                add("value2");
            }
        });
        when(connection.getHeaderFields()).thenReturn(headers);
        when(response.getHeaderValue("Content-Type")).thenReturn("application;encode=iso");
        byte[] buff = new byte[] { 'a', 'b', 'c' };
        PowerMockito.doReturn(buff).when(client, "readContent", content);
        when(response.getSysEncoding()).thenReturn("ISO");
        when(response.getHttpContentType()).thenReturn(FormatType.RAW);
        Whitebox.invokeMethod(client, "parseHttpConn", response, connection, content);
        verify(response, times(1)).setHttpContentType(FormatType.RAW);
        verify(response, times(1)).setSysEncoding("UTF-8");
        verify(response, times(1)).setSysEncoding("ISO");
        verify(response, times(1)).setHttpContent(buff, "ISO", FormatType.RAW);
    }

    @Test
    public void parseHttpConnBuffIsNullTest() throws Exception {
        HttpResponse response = mock(HttpResponse.class);
        HttpURLConnection connection = mock(HttpURLConnection.class);
        InputStream content = mock(InputStream.class);
        HttpClientConfig config = mock(HttpClientConfig.class);
        when(config.isIgnoreSSLCerts()).thenReturn(true);
        PowerMockito.mockStatic(CompatibleUrlConnClient.HttpsCertIgnoreHelper.class);
        PowerMockito.doNothing().when(CompatibleUrlConnClient.HttpsCertIgnoreHelper.class, "ignoreSSLCertificate");
        CompatibleUrlConnClient client0 = new CompatibleUrlConnClient(config);
        CompatibleUrlConnClient client = PowerMockito.spy(client0);
        when(connection.getResponseCode()).thenReturn(200);
        Map<String, List<String>> headers = new HashMap<String, List<String>>();
        headers.put(null, null);
        headers.put("header1", new ArrayList<String>() {
            {
                add("value1");
                add("value2");
            }
        });
        when(connection.getHeaderFields()).thenReturn(headers);
        when(response.getHeaderValue("Content-Type")).thenReturn("application;encode=iso");
        byte[] buff = null;
        PowerMockito.doReturn(buff).when(client, "readContent", content);
        when(response.getSysEncoding()).thenReturn("ISO");
        when(response.getHttpContentType()).thenReturn(FormatType.RAW);
        Whitebox.invokeMethod(client, "parseHttpConn", response, connection, content);
        verify(response, times(0)).setHttpContentType(FormatType.RAW);
        verify(response, times(0)).setSysEncoding("UTF-8");
        verify(response, times(0)).setSysEncoding("ISO");
        verify(response, times(1)).setHttpContent(buff, "ISO", FormatType.RAW);

    }

    @Test
    public void parseHttpConnTypeIsNullTest() throws Exception {
        HttpResponse response = mock(HttpResponse.class);
        HttpURLConnection connection = mock(HttpURLConnection.class);
        InputStream content = mock(InputStream.class);
        HttpClientConfig config = mock(HttpClientConfig.class);
        when(config.isIgnoreSSLCerts()).thenReturn(true);
        PowerMockito.mockStatic(CompatibleUrlConnClient.HttpsCertIgnoreHelper.class);
        PowerMockito.doNothing().when(CompatibleUrlConnClient.HttpsCertIgnoreHelper.class, "ignoreSSLCertificate");
        CompatibleUrlConnClient client0 = new CompatibleUrlConnClient(config);
        CompatibleUrlConnClient client = PowerMockito.spy(client0);
        when(connection.getResponseCode()).thenReturn(200);
        Map<String, List<String>> headers = new HashMap<String, List<String>>();
        headers.put(null, null);
        headers.put("header1", new ArrayList<String>() {
            {
                add("value1");
                add("value2");
            }
        });
        when(connection.getHeaderFields()).thenReturn(headers);
        when(response.getHeaderValue("Content-Type")).thenReturn(null);
        byte[] buff = new byte[] { 'a', 'b', 'c' };
        PowerMockito.doReturn(buff).when(client, "readContent", content);
        when(response.getSysEncoding()).thenReturn("ISO");
        when(response.getHttpContentType()).thenReturn(FormatType.RAW);
        Whitebox.invokeMethod(client, "parseHttpConn", response, connection, content);
        verify(response, times(0)).setHttpContentType(FormatType.RAW);
        verify(response, times(0)).setSysEncoding("UTF-8");
        verify(response, times(0)).setSysEncoding("ISO");
        verify(response, times(1)).setHttpContent(buff, "ISO", FormatType.RAW);
    }

    @Test
    public void parseHttpConnBuffIsNullAndTypeIsNullTest() throws Exception {
        HttpResponse response = mock(HttpResponse.class);
        HttpURLConnection connection = mock(HttpURLConnection.class);
        InputStream content = mock(InputStream.class);
        HttpClientConfig config = mock(HttpClientConfig.class);
        when(config.isIgnoreSSLCerts()).thenReturn(true);
        PowerMockito.mockStatic(CompatibleUrlConnClient.HttpsCertIgnoreHelper.class);
        PowerMockito.doNothing().when(CompatibleUrlConnClient.HttpsCertIgnoreHelper.class, "ignoreSSLCertificate");
        CompatibleUrlConnClient client0 = new CompatibleUrlConnClient(config);
        CompatibleUrlConnClient client = PowerMockito.spy(client0);
        when(connection.getResponseCode()).thenReturn(200);
        Map<String, List<String>> headers = new HashMap<String, List<String>>();
        headers.put(null, null);
        headers.put("header1", new ArrayList<String>() {
            {
                add("value1");
                add("value2");
            }
        });
        when(connection.getHeaderFields()).thenReturn(headers);
        when(response.getHeaderValue("Content-Type")).thenReturn(null);
        PowerMockito.doReturn(null).when(client, "readContent", content);
        when(response.getSysEncoding()).thenReturn("ISO");
        when(response.getHttpContentType()).thenReturn(FormatType.RAW);
        Whitebox.invokeMethod(client, "parseHttpConn", response, connection, content);
        verify(response, times(0)).setHttpContentType(FormatType.RAW);
        verify(response, times(0)).setSysEncoding("UTF-8");
        verify(response, times(0)).setSysEncoding("ISO");
        verify(response, times(1)).setHttpContent(null, "ISO", FormatType.RAW);
    }

    @Test
    public void parseHttpConnNoUserEncodingTest() throws Exception {
        HttpResponse response = mock(HttpResponse.class);
        HttpURLConnection connection = mock(HttpURLConnection.class);
        InputStream content = mock(InputStream.class);
        HttpClientConfig config = mock(HttpClientConfig.class);
        when(config.isIgnoreSSLCerts()).thenReturn(true);
        PowerMockito.mockStatic(CompatibleUrlConnClient.HttpsCertIgnoreHelper.class);
        PowerMockito.doNothing().when(CompatibleUrlConnClient.HttpsCertIgnoreHelper.class, "ignoreSSLCertificate");
        CompatibleUrlConnClient client0 = new CompatibleUrlConnClient(config);
        CompatibleUrlConnClient client = PowerMockito.spy(client0);
        when(connection.getResponseCode()).thenReturn(200);
        Map<String, List<String>> headers = new HashMap<String, List<String>>();
        headers.put(null, null);
        headers.put("header1", new ArrayList<String>() {
            {
                add("value1");
                add("value2");
            }
        });
        when(connection.getHeaderFields()).thenReturn(headers);
        when(response.getHeaderValue("Content-Type")).thenReturn("application;json;utf8");
        byte[] buff = new byte[] { 'a', 'b', 'c' };
        PowerMockito.doReturn(buff).when(client, "readContent", content);
        when(response.getSysEncoding()).thenReturn("ISO");
        when(response.getHttpContentType()).thenReturn(FormatType.RAW);
        Whitebox.invokeMethod(client, "parseHttpConn", response, connection, content);
        verify(response, times(1)).setHttpContentType(FormatType.RAW);
        verify(response, times(1)).setSysEncoding("UTF-8");
        verify(response, times(1)).setHttpContent(buff, "ISO", FormatType.RAW);
    }

    @Test
    public void parseHttpConnNoUserEncodingTest1() throws Exception {
        HttpResponse response = mock(HttpResponse.class);
        HttpURLConnection connection = mock(HttpURLConnection.class);
        InputStream content = mock(InputStream.class);
        HttpClientConfig config = mock(HttpClientConfig.class);
        when(config.isIgnoreSSLCerts()).thenReturn(true);
        PowerMockito.mockStatic(CompatibleUrlConnClient.HttpsCertIgnoreHelper.class);
        PowerMockito.doNothing().when(CompatibleUrlConnClient.HttpsCertIgnoreHelper.class, "ignoreSSLCertificate");
        CompatibleUrlConnClient client0 = new CompatibleUrlConnClient(config);
        CompatibleUrlConnClient client = PowerMockito.spy(client0);
        when(connection.getResponseCode()).thenReturn(200);
        Map<String, List<String>> headers = new HashMap<String, List<String>>();
        headers.put(null, null);
        headers.put("header1", new ArrayList<String>() {
            {
                add("value1");
                add("value2");
            }
        });
        when(connection.getHeaderFields()).thenReturn(headers);
        when(response.getHeaderValue("Content-Type")).thenReturn("application");
        byte[] buff = new byte[] { 'a', 'b', 'c' };
        PowerMockito.doReturn(buff).when(client, "readContent", content);
        when(response.getSysEncoding()).thenReturn("ISO");
        when(response.getHttpContentType()).thenReturn(FormatType.RAW);
        Whitebox.invokeMethod(client, "parseHttpConn", response, connection, content);
        verify(response, times(1)).setHttpContentType(FormatType.RAW);
        verify(response, times(1)).setSysEncoding("UTF-8");
        verify(response, times(1)).setHttpContent(buff, "ISO", FormatType.RAW);
    }

    @Test
    public void HttpsCertIgnoreHelperVerifyTest() {
        CompatibleUrlConnClient.HttpsCertIgnoreHelper httpsCertIgnoreHelper = new CompatibleUrlConnClient.HttpsCertIgnoreHelper();
        Assert.assertTrue(httpsCertIgnoreHelper.verify("www.aliyun.com", mock(SSLSession.class)));
    }

    @Test
    public void HttpsCertIgnoreHelperCheckClientTrustedTest() throws CertificateException {
        CompatibleUrlConnClient.HttpsCertIgnoreHelper httpsCertIgnoreHelper = new CompatibleUrlConnClient.HttpsCertIgnoreHelper();
        httpsCertIgnoreHelper.checkClientTrusted(null, null);
    }

    @Test
    public void HttpsCertIgnoreHelperCheckServerTrustedTest() throws CertificateException {
        CompatibleUrlConnClient.HttpsCertIgnoreHelper httpsCertIgnoreHelper = new CompatibleUrlConnClient.HttpsCertIgnoreHelper();
        httpsCertIgnoreHelper.checkServerTrusted(null, null);
    }

    @Test
    public void HttpsCertIgnoreHelperGetAcceptedIssuersTest() {
        CompatibleUrlConnClient.HttpsCertIgnoreHelper httpsCertIgnoreHelper = new CompatibleUrlConnClient.HttpsCertIgnoreHelper();
        Assert.assertNull(httpsCertIgnoreHelper.getAcceptedIssuers());
    }

    @Test
    public void HttpsCertIgnoreHelperIgnoreSSLCertificateTest() {
        PowerMockito.mockStatic(HttpsURLConnection.class);
        CompatibleUrlConnClient.HttpsCertIgnoreHelper.ignoreSSLCertificate();
        CompatibleUrlConnClient.HttpsCertIgnoreHelper.ignoreSSLCertificate();
        verifyStatic(HttpsURLConnection.class, times(1));
        HttpsURLConnection.getDefaultSSLSocketFactory();
    }

    @Test
    public void HttpsCertIgnoreHelperIgnoreAndRestoreSSLCertificateTest() {
        PowerMockito.mockStatic(HttpsURLConnection.class);
        CompatibleUrlConnClient.HttpsCertIgnoreHelper.restoreSSLCertificate();
        CompatibleUrlConnClient.HttpsCertIgnoreHelper.ignoreSSLCertificate();
        CompatibleUrlConnClient.HttpsCertIgnoreHelper.restoreSSLCertificate();
        verifyStatic(HttpsURLConnection.class, times(1));
        HttpsURLConnection.getDefaultSSLSocketFactory();

    }

}
