package com.aliyuncs.auth;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.http.HttpRequest;
import com.aliyuncs.http.HttpResponse;
import com.aliyuncs.http.clients.CompatibleUrlConnClient;

@RunWith(PowerMockRunner.class)
@PrepareForTest(CompatibleUrlConnClient.class)
public class ECSMetadataServiceCredentialsFetcherTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void test() throws MalformedURLException {
        String url = "http://1abfwefwe/f\\fwe000))00.100.100.200/latest/meta-data/ram/security-credentials//"
                + "%%http:///\\  ```////~!@#$%^&*()_+|:<>?|MN";
        new URL(url);
    }

    @Test
    public void constructorTest() {
        ECSMetadataServiceCredentialsFetcher fetcher = new ECSMetadataServiceCredentialsFetcher();
        Assert.assertNotNull(fetcher);
    }

    @Test
    public void setNullRoleName() {
        thrown.expect(NullPointerException.class);
        ECSMetadataServiceCredentialsFetcher fetcher = new ECSMetadataServiceCredentialsFetcher();
        Assert.assertNotNull(fetcher);
        fetcher.setRoleName(null);
    }

    @Test
    public void setNormalRoleName() {
        ECSMetadataServiceCredentialsFetcher fetcher = new ECSMetadataServiceCredentialsFetcher();
        Assert.assertNotNull(fetcher);
        fetcher.setRoleName("role");
    }

    @Test
    public void withECSMetadataServiceHostTest() {
        ECSMetadataServiceCredentialsFetcher fetcher = new ECSMetadataServiceCredentialsFetcher();
        String host = "127.0.0.1";
        fetcher.withECSMetadataServiceHost(host);
    }

    @Test
    public void withConnectionTimeoutTest() {
        ECSMetadataServiceCredentialsFetcher fetcher = new ECSMetadataServiceCredentialsFetcher();
        int timeout = 1000;
        fetcher.withConnectionTimeout(timeout);
    }

    @Test
    public void getMetadataNormal() throws IOException, ClientException {
        HttpResponse response = mock(HttpResponse.class);
        when(response.getStatus()).thenReturn(HttpURLConnection.HTTP_OK);
        String content = "content";
        when(response.getHttpContent()).thenReturn(content.getBytes());
        PowerMockito.mockStatic(CompatibleUrlConnClient.class);
        BDDMockito.given(CompatibleUrlConnClient.compatibleGetResponse(any(HttpRequest.class))).willReturn(response);
        ECSMetadataServiceCredentialsFetcher fetcher = new ECSMetadataServiceCredentialsFetcher();
        fetcher.setRoleName("role");
        String res = fetcher.getMetadata();
        Assert.assertEquals(content, res);
    }

    @Test
    public void getMetadataThrowClientException1() throws IOException, ClientException {
        thrown.expect(ClientException.class);
        PowerMockito.mockStatic(CompatibleUrlConnClient.class);
        BDDMockito.given(CompatibleUrlConnClient.compatibleGetResponse(any(HttpRequest.class))).willThrow(
                new ClientException("client exception"));
        ECSMetadataServiceCredentialsFetcher fetcher = new ECSMetadataServiceCredentialsFetcher();
        fetcher.setRoleName("role");
        fetcher.getMetadata();
    }

    @Test
    public void getMetadataThrowClientException2() throws IOException, ClientException {
        thrown.expect(ClientException.class);
        HttpResponse response = mock(HttpResponse.class);
        when(response.getStatus()).thenReturn(HttpURLConnection.HTTP_BAD_REQUEST);
        String content = "content";
        when(response.getHttpContent()).thenReturn(content.getBytes());
        PowerMockito.mockStatic(CompatibleUrlConnClient.class);
        BDDMockito.given(CompatibleUrlConnClient.compatibleGetResponse(any(HttpRequest.class))).willReturn(response);
        ECSMetadataServiceCredentialsFetcher fetcher = new ECSMetadataServiceCredentialsFetcher();
        fetcher.setRoleName("role");
        fetcher.getMetadata();
    }

    @Test
    public void fetchNormal() throws IOException, ClientException {
        HttpResponse response = mock(HttpResponse.class);
        when(response.getStatus()).thenReturn(HttpURLConnection.HTTP_OK);
        String content = "{\"Code\":\"Success\",\"AccessKeyId\":\"ak\",\"AccessKeySecret\":\"sk\","
                + "\"SecurityToken\":\"token\",\"Expiration\":\"2020-11-11 11:11:11\"}";
        when(response.getHttpContent()).thenReturn(content.getBytes());
        PowerMockito.mockStatic(CompatibleUrlConnClient.class);
        BDDMockito.given(CompatibleUrlConnClient.compatibleGetResponse(any(HttpRequest.class))).willReturn(response);
        ECSMetadataServiceCredentialsFetcher fetcher = new ECSMetadataServiceCredentialsFetcher();
        fetcher.setRoleName("role");
        InstanceProfileCredentials credentials = fetcher.fetch();
        Assert.assertEquals("ak", credentials.getAccessKeyId());
    }

    @Test
    public void fetchThrowClientException1MissCode() throws IOException, ClientException {
        thrown.expect(ClientException.class);
        HttpResponse response = mock(HttpResponse.class);
        when(response.getStatus()).thenReturn(HttpURLConnection.HTTP_OK);
        String content = "{\"AccessKeyId\":\"ak\",\"AccessKeySecret\":\"sk\",\"SecurityToken\":\"token\","
                + "\"Expiration\":\"2020-11-11 11:11:11\"}";
        when(response.getHttpContent()).thenReturn(content.getBytes());
        PowerMockito.mockStatic(CompatibleUrlConnClient.class);
        BDDMockito.given(CompatibleUrlConnClient.compatibleGetResponse(any(HttpRequest.class))).willReturn(response);
        ECSMetadataServiceCredentialsFetcher fetcher = new ECSMetadataServiceCredentialsFetcher();
        fetcher.setRoleName("role");
        fetcher.fetch();
    }

    @Test
    public void fetchThrowClientException1MissAK() throws IOException, ClientException {
        thrown.expect(ClientException.class);
        HttpResponse response = mock(HttpResponse.class);
        when(response.getStatus()).thenReturn(HttpURLConnection.HTTP_OK);
        String content = "{\"Code\":\"Success\",\"AccessKeySecret\":\"sk\",\"SecurityToken\":\"token\","
                + "\"Expiration\":\"2020-11-11 11:11:11\"}";
        when(response.getHttpContent()).thenReturn(content.getBytes());
        PowerMockito.mockStatic(CompatibleUrlConnClient.class);
        BDDMockito.given(CompatibleUrlConnClient.compatibleGetResponse(any(HttpRequest.class))).willReturn(response);
        ECSMetadataServiceCredentialsFetcher fetcher = new ECSMetadataServiceCredentialsFetcher();
        fetcher.setRoleName("role");
        fetcher.fetch();
    }

    @Test
    public void fetchThrowClientException1MissSK() throws IOException, ClientException {
        thrown.expect(ClientException.class);
        HttpResponse response = mock(HttpResponse.class);
        when(response.getStatus()).thenReturn(HttpURLConnection.HTTP_OK);
        String content = "{\"Code\":\"Success\",\"AccessKeyId\":\"ak\",\"SecurityToken\":\"token\","
                + "\"Expiration\":\"2020-11-11 11:11:11\"}";
        when(response.getHttpContent()).thenReturn(content.getBytes());
        PowerMockito.mockStatic(CompatibleUrlConnClient.class);
        BDDMockito.given(CompatibleUrlConnClient.compatibleGetResponse(any(HttpRequest.class))).willReturn(response);
        ECSMetadataServiceCredentialsFetcher fetcher = new ECSMetadataServiceCredentialsFetcher();
        fetcher.setRoleName("role");
        fetcher.fetch();
    }

    @Test
    public void fetchThrowClientException1MissToken() throws IOException, ClientException {
        thrown.expect(ClientException.class);
        HttpResponse response = mock(HttpResponse.class);
        when(response.getStatus()).thenReturn(HttpURLConnection.HTTP_OK);
        String content = "{\"Code\":\"Success\",\"AccessKeyId\":\"ak\",\"AccessKeySecret\":\"sk\","
                + "\"Expiration\":\"2020-11-11 11:11:11\"}";
        when(response.getHttpContent()).thenReturn(content.getBytes());
        PowerMockito.mockStatic(CompatibleUrlConnClient.class);
        BDDMockito.given(CompatibleUrlConnClient.compatibleGetResponse(any(HttpRequest.class))).willReturn(response);
        ECSMetadataServiceCredentialsFetcher fetcher = new ECSMetadataServiceCredentialsFetcher();
        fetcher.setRoleName("role");
        fetcher.fetch();
    }

    @Test
    public void fetchThrowClientException1MissExpiration() throws IOException, ClientException {
        thrown.expect(ClientException.class);
        HttpResponse response = mock(HttpResponse.class);
        when(response.getStatus()).thenReturn(HttpURLConnection.HTTP_OK);
        String content = "{\"Code\":\"Success\",\"AccessKeyId\":\"ak\",\"AccessKeySecret\":\"sk\","
                + "\"SecurityToken\":\"token\"}";
        when(response.getHttpContent()).thenReturn(content.getBytes());
        PowerMockito.mockStatic(CompatibleUrlConnClient.class);
        BDDMockito.given(CompatibleUrlConnClient.compatibleGetResponse(any(HttpRequest.class))).willReturn(response);
        ECSMetadataServiceCredentialsFetcher fetcher = new ECSMetadataServiceCredentialsFetcher();
        fetcher.setRoleName("role");
        fetcher.fetch();
    }

    @Test
    public void fetchThrowClientException2() throws IOException, ClientException {
        thrown.expect(ClientException.class);
        HttpResponse response = mock(HttpResponse.class);
        when(response.getStatus()).thenReturn(HttpURLConnection.HTTP_OK);
        String content = "{\"Code\":\"Failed\",\"AccessKeyId\":\"ak\",\"AccessKeySecret\":\"sk\","
                + "\"SecurityToken\":\"token\",\"Expiration\":\"2020-11-11 11:11:11\"}";
        when(response.getHttpContent()).thenReturn(content.getBytes());
        PowerMockito.mockStatic(CompatibleUrlConnClient.class);
        BDDMockito.given(CompatibleUrlConnClient.compatibleGetResponse(any(HttpRequest.class))).willReturn(response);
        ECSMetadataServiceCredentialsFetcher fetcher = new ECSMetadataServiceCredentialsFetcher();
        fetcher.setRoleName("role");
        fetcher.fetch();
    }

    @Test
    public void fetch3TimesNormal() throws IOException, ClientException {
        HttpResponse response = mock(HttpResponse.class);
        when(response.getStatus()).thenReturn(HttpURLConnection.HTTP_OK);
        String content = "{\"Code\":\"Success\",\"AccessKeyId\":\"ak\",\"AccessKeySecret\":\"sk\","
                + "\"SecurityToken\":\"token\",\"Expiration\":\"2020-11-11 11:11:11\"}";
        when(response.getHttpContent()).thenReturn(content.getBytes());
        PowerMockito.mockStatic(CompatibleUrlConnClient.class);
        BDDMockito.given(CompatibleUrlConnClient.compatibleGetResponse(any(HttpRequest.class))).willReturn(response);
        ECSMetadataServiceCredentialsFetcher fetcher = new ECSMetadataServiceCredentialsFetcher();
        fetcher.setRoleName("role");
        InstanceProfileCredentials credentials = fetcher.fetch(3);
        Assert.assertEquals("ak", credentials.getAccessKeyId());
    }

    @Test
    public void fetch3TimesThrowClientException() throws IOException, ClientException {
        thrown.expect(ClientException.class);
        HttpResponse response = mock(HttpResponse.class);
        when(response.getStatus()).thenReturn(HttpURLConnection.HTTP_OK);
        String content = "{\"Code\":\"Failed\",\"AccessKeyId\":\"ak\",\"AccessKeySecret\":\"sk\","
                + "\"SecurityToken\":\"token\",\"Expiration\":\"2020-11-11 11:11:11\"}";
        when(response.getHttpContent()).thenReturn(content.getBytes());
        PowerMockito.mockStatic(CompatibleUrlConnClient.class);
        BDDMockito.given(CompatibleUrlConnClient.compatibleGetResponse(any(HttpRequest.class))).willReturn(response);
        ECSMetadataServiceCredentialsFetcher fetcher = new ECSMetadataServiceCredentialsFetcher();
        fetcher.setRoleName("role");
        fetcher.fetch(3);
    }

    @Test
    public void fetch3TimesThrowClientException2() throws IOException, ClientException {
        thrown.expect(ClientException.class);
        ECSMetadataServiceCredentialsFetcher fetcher = new ECSMetadataServiceCredentialsFetcher();
        fetcher.setRoleName("role");
        fetcher.fetch(-1);
    }
}
