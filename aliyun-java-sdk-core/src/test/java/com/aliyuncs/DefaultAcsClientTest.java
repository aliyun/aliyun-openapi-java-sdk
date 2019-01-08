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
import com.aliyuncs.http.HttpClientFactory;
import com.aliyuncs.http.HttpResponse;
import com.aliyuncs.profile.DefaultProfile;

@RunWith(PowerMockRunner.class)
@PrepareForTest(HttpClientFactory.class)
public class DefaultAcsClientTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testResponseServerExceptionError() throws ClientException {
        DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou", "accessKeyId", "secret");
        DefaultAcsClient client = new DefaultAcsClient(profile);
        HttpResponse baseResponse = Mockito.mock(HttpResponse.class);
        AcsRequest request = Mockito.mock(AcsRequest.class);
        AcsError error = Mockito.mock(AcsError.class);
        Mockito.when(baseResponse.getStatus()).thenReturn(500);
        Mockito.when(error.getErrorCode()).thenReturn("500");
        Mockito.when(error.getErrorMessage()).thenReturn("ServerException");
        thrown.expect(ServerException.class);
        thrown.expectMessage("500 : ServerException");
        client.distinguishError(request, error, baseResponse);
    }

    @Test
    public void testResponseNotIncompleteSignatureError() throws ClientException {
        DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou", "accessKeyId", "secret");
        DefaultAcsClient client = new DefaultAcsClient(profile);
        HttpResponse baseResponse = Mockito.mock(HttpResponse.class);
        AcsRequest request = Mockito.mock(AcsRequest.class);
        AcsError error = Mockito.mock(AcsError.class);
        Mockito.when(baseResponse.getStatus()).thenReturn(401);
        Mockito.when(error.getErrorCode()).thenReturn("Not IncompleteSignature");
        Mockito.when(error.getErrorMessage()).thenReturn("ClientException");
        thrown.expect(ClientException.class);
        thrown.expectMessage("Not IncompleteSignature : ClientException");
        client.distinguishError(request, error, baseResponse);
    }

    @Test
    public void testResponseInvalidAccessKeySecretError() throws ClientException {
        DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou", "accessKeyId", "secret");
        DefaultAcsClient client = new DefaultAcsClient(profile);
        HttpResponse baseResponse = Mockito.mock(HttpResponse.class);
        AcsRequest request = Mockito.mock(AcsRequest.class);
        AcsError error = Mockito.mock(AcsError.class);
        Mockito.when(baseResponse.getStatus()).thenReturn(401);
        Mockito.when(error.getErrorCode()).thenReturn("IncompleteSignature");
        request.strToSign = "GET&%2F&AccessKeyId%3DLTAIZO43hvW2RzvK%26Action%3DDescribeInstances%26Format%3DXML%26";
        String errorMessage = "signature does not conform to standards. server string to sign is:" + request.strToSign;
        Mockito.when(error.getErrorMessage()).thenReturn(errorMessage);
        thrown.expect(ClientException.class);
        thrown.expectMessage("InvalidAccessKeySecret : Specified Access Key Secret is not valid.");
        client.distinguishError(request, error, baseResponse);

    }

    @Test
    public void testResponseSignatureNullError() throws ClientException {
        DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou", "accessKeyId", "secret");
        DefaultAcsClient client = new DefaultAcsClient(profile);
        HttpResponse baseResponse = Mockito.mock(HttpResponse.class);
        Mockito.when(baseResponse.getStatus()).thenReturn(401);
        AcsRequest request = Mockito.mock(AcsRequest.class);
        AcsError error = Mockito.mock(AcsError.class);
        Mockito.when(error.getErrorCode()).thenReturn("IncompleteSignature");
        request.strToSign = "GET&%2F&AccessKeyId%3DLTAIZO43hvW2RzvK%26Action%3DDescribeInstances%26Format%3DXML%26";
        String errorMessage = "signature does not conform to standards. server sgn is:" + request.strToSign;
        Mockito.when(error.getErrorMessage()).thenReturn(errorMessage);
        thrown.expect(ClientException.class);
        thrown.expectMessage("IncompleteSignature : " + errorMessage);
        client.distinguishError(request, error, baseResponse);

    }

    @Test
    public void testResponseSignatureError() throws ClientException {
        DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou", "accessKeyId", "secret");
        DefaultAcsClient client = new DefaultAcsClient(profile);
        HttpResponse baseResponse = Mockito.mock(HttpResponse.class);
        Mockito.when(baseResponse.getStatus()).thenReturn(401);
        AcsRequest request = Mockito.mock(AcsRequest.class);
        AcsError error = Mockito.mock(AcsError.class);
        Mockito.when(error.getErrorCode()).thenReturn("IncompleteSignature");
        request.strToSign = "GET&%2F&AccessKeyId%3DLTAIZO43hvW2RzvK%26Action%3DDescribeInstances%26Format%3DXML%26";
        String errorMessage = "signature does not conform to standards. server string to sign is:Error Signature";
        Mockito.when(error.getErrorMessage()).thenReturn(errorMessage);
        thrown.expect(ClientException.class);
        thrown.expectMessage("IncompleteSignature : " + errorMessage);
        client.distinguishError(request, error, baseResponse);
    }
}
