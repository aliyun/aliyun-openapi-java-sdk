package com.aliyuncs;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.FormatType;
import com.aliyuncs.http.HttpClientFactory;
import com.aliyuncs.http.HttpResponse;
import com.aliyuncs.profile.DefaultProfile;

@RunWith(PowerMockRunner.class)
@PrepareForTest(HttpClientFactory.class)
public class DefaultAcsClientTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    private String makeAcsErrorXML(String requestId, String hostId, String code, String message, String recommend) {
        return String.format(
                "<Error><RequestId>%s</RequestId><HostId>%s</HostId><Code>%s</Code>"
                        + "<Message><![CDATA[%s]]></Message><Recommend><![CDATA[%s]]></Recommend></Error>",
                requestId, hostId, code, message, recommend);
    }

    @Test
    public void testResponseServerExceptionError() throws ClientException {
        DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou", "accessKeyId", "secret");
        DefaultAcsClient client = new DefaultAcsClient(profile);
        DefaultAcsClient spyClient = Mockito.spy(client);
        HttpResponse response = Mockito.mock(HttpResponse.class);
        Mockito.when(response.getHttpContentType()).thenReturn(FormatType.XML);
        Mockito.when(response.getHttpContentString()).thenReturn(makeAcsErrorXML("", "", "code", "message", ""));
        Mockito.when(response.getStatus()).thenReturn(500);
        AcsRequest request = Mockito.mock(AcsRequest.class);
        Mockito.doReturn(response).when(spyClient).doAction(request);
        try {
            spyClient.getAcsResponse(request);
        } catch (Exception ex) {
            Assert.assertTrue(ex instanceof ServerException);
            Assert.assertEquals("code : message\r\nRequestId : ", ex.getMessage());
            return;
        }
        Assert.fail();
    }

    @Test
    public void testResponseNotIncompleteSignatureError() throws ClientException {
        DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou", "accessKeyId", "secret");
        DefaultAcsClient client = new DefaultAcsClient(profile);
        DefaultAcsClient spyClient = Mockito.spy(client);
        HttpResponse response = Mockito.mock(HttpResponse.class);
        Mockito.when(response.getHttpContentType()).thenReturn(FormatType.XML);
        Mockito.when(response.getHttpContentString()).thenReturn(makeAcsErrorXML("", "", "code", "message", ""));
        Mockito.when(response.getStatus()).thenReturn(401);
        AcsRequest request = Mockito.mock(AcsRequest.class);
        Mockito.doReturn(response).when(spyClient).doAction(request);
        try {
            spyClient.getAcsResponse(request);
        } catch (Exception ex) {
            Assert.assertTrue(ex instanceof ClientException);
            Assert.assertEquals("code : message\r\nRequestId : ", ex.getMessage());
            return;
        }
        Assert.fail();
    }

    @Test
    public void testResponseInvalidAccessKeySecretError() throws ClientException {
        DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou", "accessKeyId", "secret");
        DefaultAcsClient client = new DefaultAcsClient(profile);
        DefaultAcsClient spyClient = Mockito.spy(client);
        HttpResponse response = Mockito.mock(HttpResponse.class);
        Mockito.when(response.getHttpContentType()).thenReturn(FormatType.XML);
        AcsRequest request = Mockito.mock(AcsRequest.class);
        request.strToSign = "GET&%2F&AccessKeyId%3DLTAIZO43hvW2RzvK%26Action%3DDescribeInstances%26Format%3DXML%26";
        String message = "signature does not conform to standards. server string to sign is:" + request.strToSign;
        Mockito.when(response.getHttpContentString())
                .thenReturn(makeAcsErrorXML("", "", "IncompleteSignature", message, ""));
        Mockito.when(response.getStatus()).thenReturn(401);
        Mockito.doReturn(response).when(spyClient).doAction(request);
        try {
            spyClient.getAcsResponse(request);
        } catch (Exception ex) {
            Assert.assertTrue(ex instanceof ClientException);
            Assert.assertEquals(
                    "SDK.InvalidAccessKeySecret : Specified Access Key Secret is not valid.\r\nRequestId : ",
                    ex.getMessage());
            return;
        }
        Assert.fail();
    }

    @Test
    public void testResponseSignatureNullError() throws ClientException {
        DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou", "accessKeyId", "secret");
        DefaultAcsClient client = new DefaultAcsClient(profile);
        DefaultAcsClient spyClient = Mockito.spy(client);
        HttpResponse response = Mockito.mock(HttpResponse.class);
        Mockito.when(response.getHttpContentType()).thenReturn(FormatType.XML);
        AcsRequest request = Mockito.mock(AcsRequest.class);
        request.strToSign = "GET&%2F&AccessKeyId%3DLTAIZO43hvW2RzvK%26Action%3DDescribeInstances%26Format%3DXML%26";
        String message = "signature does not conform to standards. server string to sign is???:" + request.strToSign;
        Mockito.when(response.getHttpContentString())
                .thenReturn(makeAcsErrorXML("", "", "IncompleteSignature", message, ""));
        Mockito.when(response.getStatus()).thenReturn(401);
        Mockito.doReturn(response).when(spyClient).doAction(request);
        try {
            spyClient.getAcsResponse(request);
        } catch (Exception ex) {
            Assert.assertTrue(ex instanceof ClientException);
            Assert.assertEquals("IncompleteSignature : " + message + "\r\nRequestId : ", ex.getMessage());
            return;
        }
        Assert.fail();
    }

    @Test
    public void testResponseSignatureError() throws ClientException {
        DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou", "accessKeyId", "secret");
        DefaultAcsClient client = new DefaultAcsClient(profile);
        DefaultAcsClient spyClient = Mockito.spy(client);
        HttpResponse response = Mockito.mock(HttpResponse.class);
        Mockito.when(response.getHttpContentType()).thenReturn(FormatType.XML);
        AcsRequest request = Mockito.mock(AcsRequest.class);
        request.strToSign = "client_string_to_sign";
        String message = "signature does not conform to standards. server string to sign is: server_string_to_sign"
                + request.strToSign;
        Mockito.when(response.getHttpContentString())
                .thenReturn(makeAcsErrorXML("", "", "IncompleteSignature", message, ""));
        Mockito.when(response.getStatus()).thenReturn(401);
        Mockito.doReturn(response).when(spyClient).doAction(request);
        try {
            spyClient.getAcsResponse(request);
        } catch (Exception ex) {
            Assert.assertTrue(ex instanceof ClientException);
            Assert.assertEquals("IncompleteSignature : " + message + "\r\nRequestId : ", ex.getMessage());
            return;
        }
        Assert.fail();
    }
}
