package com.aliyuncs.auth;

import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.http.HttpRequest;
import com.aliyuncs.http.HttpResponse;
import com.aliyuncs.http.clients.CompatibleUrlConnClient;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.io.IOException;
import java.lang.reflect.Field;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(PowerMockRunner.class)
@PrepareForTest(CompatibleUrlConnClient.class)
public class URLCredentialsProviderTest {

    @Test
    public void constructorTest() throws MalformedURLException, NoSuchFieldException, IllegalAccessException {
        URLCredentialsProvider provider;

        try {
            URLCredentialsProvider.builder().build();
            Assert.fail();
        } catch (Exception e) {
            Assert.assertEquals("Credential URI or environment variable ALIBABA_CLOUD_CREDENTIALS_URI cannot be empty.",
                    e.getMessage());
        }

        provider = URLCredentialsProvider.builder()
                .credentialsURI(new URL("http://test1"))
                .credentialsURI("http://test2")
                .readTimeout(2000)
                .connectionTimeout(2000)
                .build();
        Class<?> clazz = provider.getClass();
        Field urlField = clazz.getDeclaredField("credentialsURI");
        urlField.setAccessible(true);
        Field connectTimeoutField = clazz.getDeclaredField("connectTimeout");
        connectTimeoutField.setAccessible(true);
        Field readTimeoutField = clazz.getDeclaredField("readTimeout");
        readTimeoutField.setAccessible(true);
        Assert.assertEquals(2000, connectTimeoutField.get(provider));
        Assert.assertEquals(2000, readTimeoutField.get(provider));
        Assert.assertEquals("http://test2", ((URL) urlField.get(provider)).toString());
    }

    @Test
    public void getCredentials() throws IOException, ClientException {
        URLCredentialsProvider provider = URLCredentialsProvider.builder()
                .credentialsURI("http://test")
                .readTimeout(2000)
                .connectionTimeout(2000)
                .build();

        HttpResponse response = mock(HttpResponse.class);
        when(response.getStatus()).thenReturn(HttpURLConnection.HTTP_OK);
        String content = "{\"Code\":\"Success\",  \"AccessKeyId\":\"test\", " +
                "\"AccessKeySecret\":\"test\", \"SecurityToken\":\"test\",  \"Expiration\":\"2019-08-08T11:11:11Z\"}";
        when(response.getHttpContentString()).thenReturn(content);
        PowerMockito.mockStatic(CompatibleUrlConnClient.class);
        BDDMockito.given(CompatibleUrlConnClient.compatibleGetResponse(any(HttpRequest.class))).willReturn(response);
        BasicSessionCredentials credentials = (BasicSessionCredentials) provider.getCredentials();
        Assert.assertEquals("test", credentials.getAccessKeyId());
        Assert.assertEquals("test", credentials.getAccessKeySecret());
        Assert.assertEquals("test", credentials.getSessionToken());

        when(response.getStatus()).thenReturn(HttpURLConnection.HTTP_OK);
        content = "error";
        when(response.getHttpContentString()).thenReturn(content);
        PowerMockito.mockStatic(CompatibleUrlConnClient.class);
        BDDMockito.given(CompatibleUrlConnClient.compatibleGetResponse(any(HttpRequest.class))).willReturn(response);

        try {
            provider.getCredentials();
            Assert.fail();
        } catch (Exception e) {
            Assert.assertTrue(e.getMessage().contains("Failed to parse credentials from server: http://test\n" +
                    "HttpCode=200\n" +
                    "HttpRAWContent=error"));
        }
    }

}