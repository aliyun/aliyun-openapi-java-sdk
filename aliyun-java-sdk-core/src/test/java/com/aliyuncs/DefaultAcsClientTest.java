package com.aliyuncs;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
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
        Mockito.when(response.getStatus()).thenReturn(500);
        Mockito.when(response.getHttpContentType()).thenReturn(FormatType.XML);
        Mockito.when(response.getHttpContentString()).thenReturn(makeAcsErrorXML("", "", "500", "ServerException", ""));
        AcsRequest request = Mockito.mock(AcsRequest.class);
        Mockito.doReturn(response).when(spyClient).doAction(request);
        thrown.expect(ServerException.class);
        thrown.expectMessage("500 : ServerException");
        spyClient.getAcsResponse(request);
    }

    @Test
    public void testResponseNotIncompleteSignatureError() throws ClientException {
        DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou", "accessKeyId", "secret");
        DefaultAcsClient client = new DefaultAcsClient(profile);
        DefaultAcsClient spyClient = Mockito.spy(client);
        HttpResponse response = Mockito.mock(HttpResponse.class);
        Mockito.when(response.getStatus()).thenReturn(401);
        Mockito.when(response.getHttpContentType()).thenReturn(FormatType.XML);
        Mockito.when(response.getHttpContentString()).thenReturn(makeAcsErrorXML("", "", "Not IncompleteSignature", "ClientException", ""));
        AcsRequest request = Mockito.mock(AcsRequest.class);
        Mockito.doReturn(response).when(spyClient).doAction(request);
        thrown.expect(ClientException.class);
        thrown.expectMessage("Not IncompleteSignature : ClientException");
        spyClient.getAcsResponse(request);
    }

    @Test
    public void testResponseInvalidAccessKeySecretError() throws ClientException {
        DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou", "accessKeyId", "secret");
        DefaultAcsClient client = new DefaultAcsClient(profile);
        DefaultAcsClient spyClient = Mockito.spy(client);
        HttpResponse response = Mockito.mock(HttpResponse.class);
        Mockito.when(response.getStatus()).thenReturn(401);
        Mockito.when(response.getHttpContentType()).thenReturn(FormatType.XML);
        AcsRequest request = Mockito.mock(AcsRequest.class);
        request.strToSign = "GET&%2F&AccessKeyId%3DLTAIZO43hvW2RzvK%26Action%3DDescribeInstances%26Format%3DXML%26";
        String errorMessage = "signature does not conform to standards. server string to sign is:" + request.strToSign;
        Mockito.when(response.getHttpContentString()).thenReturn(makeAcsErrorXML("", "", "IncompleteSignature", errorMessage, ""));
        Mockito.doReturn(response).when(spyClient).doAction(request);
        thrown.expect(ClientException.class);
        thrown.expectMessage("SDK.InvalidAccessKeySecret : Specified Access Key Secret is not valid.");
        spyClient.getAcsResponse(request);
    }

    @Test
    public void testResponseSignatureNullError() throws ClientException {
        DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou", "accessKeyId", "secret");
        DefaultAcsClient client = new DefaultAcsClient(profile);
        DefaultAcsClient spyClient = Mockito.spy(client);
        HttpResponse response = Mockito.mock(HttpResponse.class);
        Mockito.when(response.getStatus()).thenReturn(401);
        Mockito.when(response.getHttpContentType()).thenReturn(FormatType.XML);
        AcsRequest request = Mockito.mock(AcsRequest.class);
        request.strToSign = "GET&%2F&AccessKeyId%3DLTAIZO43hvW2RzvK%26Action%3DDescribeInstances%26Format%3DXML%26";
        String errorMessage = "signature does not conform to standards. server sgn is:" + request.strToSign;
        Mockito.when(response.getHttpContentString()).thenReturn(makeAcsErrorXML("", "", "IncompleteSignature", errorMessage, ""));
        Mockito.doReturn(response).when(spyClient).doAction(request);
        thrown.expect(ClientException.class);
        thrown.expectMessage("IncompleteSignature : " + errorMessage);
        spyClient.getAcsResponse(request);
    }

    @Test
    public void testResponseSignatureError() throws ClientException {
        DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou", "accessKeyId", "secret");
        DefaultAcsClient client = new DefaultAcsClient(profile);
        HttpResponse response = Mockito.mock(HttpResponse.class);
        DefaultAcsClient spyClient = Mockito.spy(client);
        Mockito.when(response.getStatus()).thenReturn(401);
        Mockito.when(response.getHttpContentType()).thenReturn(FormatType.XML);
        AcsRequest request = Mockito.mock(AcsRequest.class);
        request.strToSign = "GET&%2F&AccessKeyId%3DLTAIZO43hvW2RzvK%26Action%3DDescribeInstances%26Format%3DXML%26";
        String errorMessage = "signature does not conform to standards. server string to sign is:Error Signature";
        Mockito.when(response.getHttpContentString()).thenReturn(makeAcsErrorXML("", "", "IncompleteSignature", errorMessage, ""));
        Mockito.doReturn(response).when(spyClient).doAction(request);
        thrown.expect(ClientException.class);
        thrown.expectMessage("IncompleteSignature : " + errorMessage);
        spyClient.getAcsResponse(request);
    }
}
