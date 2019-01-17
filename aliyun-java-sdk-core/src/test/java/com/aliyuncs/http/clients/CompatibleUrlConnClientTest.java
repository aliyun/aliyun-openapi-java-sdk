package com.aliyuncs.http.clients;

import com.aliyuncs.auth.RoaSignatureComposer;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.http.CallBack;
import com.aliyuncs.http.HttpClientConfig;
import com.aliyuncs.http.HttpRequest;
import com.aliyuncs.http.MethodType;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.reflect.Whitebox;

import javax.net.ssl.SSLSocketFactory;


import java.io.IOException;

import java.net.Proxy;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

import static com.aliyuncs.http.clients.CompatibleUrlConnClient.CONTENT_TYPE;
import static org.mockito.Mockito.*;

import static org.powermock.api.mockito.PowerMockito.verifyStatic;

@RunWith(PowerMockRunner.class)
@PrepareForTest(CompatibleUrlConnClient.class)
@PowerMockIgnore({"javax.net.ssl.*"})
public class CompatibleUrlConnClientTest {
    @Test
    public void test(){

    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();


    @Test
    public void constructorWithIgnoreSSLCert() throws Exception {
        HttpClientConfig config = mock(HttpClientConfig.class);
        SSLSocketFactory sslSocketFactory = mock(SSLSocketFactory.class);
        when(config.getSslSocketFactory()).thenReturn(sslSocketFactory);
        when(config.isIgnoreSSLCerts()).thenReturn(true);
        PowerMockito.mockStatic(CompatibleUrlConnClient.HttpsCertIgnoreHelper.class);
        PowerMockito.doNothing().when(CompatibleUrlConnClient.HttpsCertIgnoreHelper.class,"ignoreSSLCertificate");
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
        client.asyncInvoke(request,callback);
    }
    
    @Test
    public void ignoreSSLCertificateTest() throws Exception {
        PowerMockito.mockStatic(CompatibleUrlConnClient.HttpsCertIgnoreHelper.class);
        PowerMockito.doNothing().when(CompatibleUrlConnClient.HttpsCertIgnoreHelper.class,"ignoreSSLCertificate");
        HttpClientConfig config = mock(HttpClientConfig.class);
        SSLSocketFactory sslSocketFactory = mock(SSLSocketFactory.class);
        when(config.getSslSocketFactory()).thenReturn(sslSocketFactory);
        when(config.isIgnoreSSLCerts()).thenReturn(true);
        CompatibleUrlConnClient client = new CompatibleUrlConnClient(config);
        client.ignoreSSLCertificate();
        verifyStatic(CompatibleUrlConnClient.HttpsCertIgnoreHelper.class,Mockito.times(1));


    }

    @Test
    public void restoreSSLCertificateTest() throws Exception {
        PowerMockito.mockStatic(CompatibleUrlConnClient.HttpsCertIgnoreHelper.class);
        PowerMockito.doNothing().when(CompatibleUrlConnClient.HttpsCertIgnoreHelper.class,"restoreSSLCertificate");
        HttpClientConfig config = mock(HttpClientConfig.class);
        SSLSocketFactory sslSocketFactory = mock(SSLSocketFactory.class);
        when(config.getSslSocketFactory()).thenReturn(sslSocketFactory);
        when(config.isIgnoreSSLCerts()).thenReturn(true);
        CompatibleUrlConnClient client = new CompatibleUrlConnClient(config);
        client.restoreSSLCertificate();
        verifyStatic(CompatibleUrlConnClient.HttpsCertIgnoreHelper.class,Mockito.times(1));


    }

    @Test
    public void closeTest() throws Exception {
        HttpClientConfig config = mock(HttpClientConfig.class);
        SSLSocketFactory sslSocketFactory = mock(SSLSocketFactory.class);
        when(config.getSslSocketFactory()).thenReturn(sslSocketFactory);
        when(config.isIgnoreSSLCerts()).thenReturn(true);
        PowerMockito.mockStatic(CompatibleUrlConnClient.HttpsCertIgnoreHelper.class);
        PowerMockito.doNothing().when(CompatibleUrlConnClient.HttpsCertIgnoreHelper.class,"ignoreSSLCertificate");
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
        PowerMockito.doNothing().when(CompatibleUrlConnClient.HttpsCertIgnoreHelper.class,"ignoreSSLCertificate");
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
        PowerMockito.doNothing().when(CompatibleUrlConnClient.HttpsCertIgnoreHelper.class,"ignoreSSLCertificate");
        CompatibleUrlConnClient client = new CompatibleUrlConnClient(config);
        thrown.expect(IllegalArgumentException.class);
        HttpRequest request = mock(HttpRequest.class);
        when(request.getSysUrl()).thenReturn("sysUrl");
        Whitebox.invokeMethod(client, "buildHttpConnection", request);
    }

    @Test
    public void buildHttpConnectionPOSTMethodAndNullContentTest() throws Exception {
        HttpClientConfig config = mock(HttpClientConfig.class);
        SSLSocketFactory sslSocketFactory = mock(SSLSocketFactory.class);
        when(sslSocketFactory.createSocket()).thenReturn(new Socket(Proxy.NO_PROXY));
        when(config.getSslSocketFactory()).thenReturn(sslSocketFactory);
        when(config.isIgnoreSSLCerts()).thenReturn(true);
        PowerMockito.mockStatic(CompatibleUrlConnClient.HttpsCertIgnoreHelper.class);
        PowerMockito.doNothing().when(CompatibleUrlConnClient.HttpsCertIgnoreHelper.class,"ignoreSSLCertificate");
        CompatibleUrlConnClient client = new CompatibleUrlConnClient(config);
        //CompatibleUrlConnClient client = Mockito.spy(client0);
        //Proxy proxy = Proxy.NO_PROXY;
        //PowerMockito.doReturn(proxy).when(client, "getProxy", anyString(),any(HttpRequest.class));
        //thrown.expect(IllegalArgumentException.class);
        HttpRequest request = mock(HttpRequest.class);
        when(request.getSysMethod()).thenReturn(MethodType.POST);
        //when(request.getHttpContent()).thenReturn("http content".getBytes());
        when(request.getSysUrl()).thenReturn("http://www.aliyun.com");
        when(request.getSysConnectTimeout()).thenReturn(120);
        when(request.getSysReadTimeout()).thenReturn(120);
        Map<String,String> headers = new HashMap<String, String>(){{
            put("header1","value1");
            put(CONTENT_TYPE,"json");

        }};
        Whitebox.invokeMethod(client, "buildHttpConnection", request);

        //verifyPrivate()
    }

    @Test
    public void syncInvokeTest() throws Exception {
        HttpClientConfig config = mock(HttpClientConfig.class);
        SSLSocketFactory sslSocketFactory = mock(SSLSocketFactory.class);
        when(sslSocketFactory.createSocket()).thenReturn(new Socket(Proxy.NO_PROXY));
        when(config.getSslSocketFactory()).thenReturn(sslSocketFactory);
        when(config.isIgnoreSSLCerts()).thenReturn(true);
        PowerMockito.mockStatic(CompatibleUrlConnClient.HttpsCertIgnoreHelper.class);
        PowerMockito.doNothing().when(CompatibleUrlConnClient.HttpsCertIgnoreHelper.class,"ignoreSSLCertificate");
        CompatibleUrlConnClient client = new CompatibleUrlConnClient(config);
        //CompatibleUrlConnClient client = Mockito.spy(client0);
        //Proxy proxy = Proxy.NO_PROXY;
        //PowerMockito.doReturn(proxy).when(client, "getProxy", anyString(),any(HttpRequest.class));
        //thrown.expect(IllegalArgumentException.class);
        HttpRequest request = mock(HttpRequest.class);
        when(request.getSysMethod()).thenReturn(MethodType.POST);
        //when(request.getHttpContent()).thenReturn("http content".getBytes());
        when(request.getSysUrl()).thenReturn("http://www.aliyun.com");
        when(request.getSysConnectTimeout()).thenReturn(120);
        when(request.getSysReadTimeout()).thenReturn(120);
        Map<String,String> headers = new HashMap<String, String>(){{
            put("header1","value1");
            put(CONTENT_TYPE,"json");

        }};
        Whitebox.invokeMethod(client, "buildHttpConnection", request);

        //verifyPrivate()
    }





}
