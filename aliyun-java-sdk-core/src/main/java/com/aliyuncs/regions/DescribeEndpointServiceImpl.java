package com.aliyuncs.regions;

import com.aliyuncs.AcsError;
import com.aliyuncs.auth.Credential;
import com.aliyuncs.auth.ISigner;
import com.aliyuncs.auth.ShaHmac1Singleton;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.FormatType;
import com.aliyuncs.http.HttpRequest;
import com.aliyuncs.http.HttpResponse;
import com.aliyuncs.reader.Reader;
import com.aliyuncs.reader.ReaderFactory;
import com.aliyuncs.transform.UnmarshallerContext;

import java.io.UnsupportedEncodingException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by hi.yan.li on 2016/4/26.
 */
public class DescribeEndpointServiceImpl implements DescribeEndpointService {

    private boolean isEmpty(String str) {
        return ((str == null) || (str.length() == 0));
    }

    @Override
    public DescribeEndpointResponse describeEndpoint(String regionId, String serviceCode, String endpointType,
                                                     Credential credential, LocationConfig locationConfig) {
        if (isEmpty(serviceCode)) {
            return null;
        }

        DescribeEndpointRequest request = new DescribeEndpointRequest();
        request.setAcceptFormat(FormatType.JSON);
        request.setId(regionId);
        request.setRegionId(locationConfig.getRegionId());
        request.setServiceCode(serviceCode);

        ISigner signer = ShaHmac1Singleton.INSTANCE.getInstance();
        ProductDomain domain = new ProductDomain(locationConfig.getProduct(), locationConfig.getEndpoint());

        try {
            HttpRequest httpRequest = request.signRequest(signer, credential, FormatType.JSON, domain);
            HttpResponse httpResponse = HttpResponse.getResponse(httpRequest);
            if (httpResponse.isSuccess()) {
                String data = new String(httpResponse.getContent(), "utf-8");
                DescribeEndpointResponse response = getEndpointResponse(data);
                if (response == null || isEmpty(response.getEndpoint())) {
                    return null;
                }
                return response;
            }
            AcsError error = readError(httpResponse, FormatType.JSON);
            if (500 <= httpResponse.getStatus()) {
                System.out.println("Invoke_Error, requestId:" + error.getRequestId() + "; code:" + error.getErrorCode()
                        + "; Msg" + error.getErrorMessage());
                return null;
            }
            System.out.println("Invoke_Error, requestId:" + error.getRequestId() + "; code:" + error.getErrorCode()
                    + "; Msg" + error.getErrorMessage());
            return null;
        } catch (Throwable e) {
            System.out.println("Invoke Remote Error,Msg" + e.getMessage());
            return null;
        }
    }

    private DescribeEndpointResponse getEndpointResponse(String data) throws ClientException {
        Reader reader = ReaderFactory.createInstance(FormatType.JSON);
        UnmarshallerContext context = new UnmarshallerContext();
        DescribeEndpointResponse response = new DescribeEndpointResponse();
        context.setResponseMap(reader.read(data, "DescribeEndpointResponse"));
        response.setRequestId(context.stringValue("DescribeEndpointResponse.RequestId"));
        response.setProduct(context.stringValue("DescribeEndpointResponse.SerivceCode"));
        response.setEndpoint(context.stringValue("DescribeEndpointResponse.Endpoint"));
        response.setRegionId(context.stringValue("DescribeEndpointResponse.Id"));
        return response;
    }

    private AcsError readError(HttpResponse httpResponse, FormatType format) throws ClientException {
        AcsError error = new AcsError();
        String responseEndpoint = "Error";
        Reader reader = ReaderFactory.createInstance(format);
        UnmarshallerContext context = new UnmarshallerContext();
        String stringContent = getResponseContent(httpResponse);
        context.setResponseMap(reader.read(stringContent, responseEndpoint));
        error = error.getInstance(context);
        if (httpResponse.getStatus() > 0) {
            error.setStatusCode(httpResponse.getStatus());
        }
        return error;
    }

    private String getResponseContent(HttpResponse httpResponse) throws ClientException {
        String stringContent = null;
        try {
            if (null == httpResponse.getEncoding()) {
                stringContent = new String(httpResponse.getContent());
            } else {
                stringContent = new String(httpResponse.getContent(), httpResponse.getEncoding());
            }
        } catch (UnsupportedEncodingException exp) {
            throw new ClientException("SDK.UnsupportedEncoding", "Can not parse response due to un supported encoding.");
        }
        return stringContent;
    }
}
