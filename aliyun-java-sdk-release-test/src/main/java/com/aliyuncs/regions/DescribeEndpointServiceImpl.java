package com.aliyuncs.regions;

import java.io.UnsupportedEncodingException;

import com.aliyuncs.AcsError;
import com.aliyuncs.auth.Credential;
import com.aliyuncs.auth.ISigner;
import com.aliyuncs.auth.ShaHmac1Singleton;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.http.FormatType;
import com.aliyuncs.http.HttpRequest;
import com.aliyuncs.http.HttpResponse;
import com.aliyuncs.reader.Reader;
import com.aliyuncs.reader.ReaderFactory;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * Created by hi.yan.li on 2016/4/26.
 */
public class DescribeEndpointServiceImpl implements DescribeEndpointService {
    private static final String DEFAULT_ENDPOINT_TYPE = "openAPI";

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
        request.setLocationProduct(serviceCode);
        request.setSecurityToken(credential.getSecurityToken());
        if (isEmpty(endpointType)) {
            endpointType = DEFAULT_ENDPOINT_TYPE;
        }
        request.setEndpointType(endpointType);

        ISigner signer = ShaHmac1Singleton.INSTANCE.getInstance();
        ProductDomain domain = new ProductDomain(locationConfig.getProduct(), locationConfig.getEndpoint());

        try {
            HttpRequest httpRequest = request.signRequest(signer, credential, FormatType.JSON, domain);
            HttpResponse httpResponse = HttpResponse.getResponse(httpRequest);
            if (httpResponse.isSuccess()) {
                String data = new String(httpResponse.getHttpContent(), "utf-8");
                DescribeEndpointResponse response = getEndpointResponse(data, endpointType);
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

    private DescribeEndpointResponse getEndpointResponse(String data, String endpointType) throws ClientException {
        Reader reader = ReaderFactory.createInstance(FormatType.JSON);
        UnmarshallerContext context = new UnmarshallerContext();

        context.setResponseMap(reader.read(data, "DescribeEndpointsResponse"));

        int endpointsLength = context.lengthValue("DescribeEndpointsResponse.Endpoints.Length");
        for (int i = 0; i < endpointsLength; i++) {
            if (endpointType.equalsIgnoreCase(context
                .stringValue("DescribeEndpointsResponse.Endpoints[" + i + "].Type"))) {
                DescribeEndpointResponse response = new DescribeEndpointResponse();

                response.setRequestId(context.stringValue("DescribeEndpointsResponse.RequestId"));
                response.setProduct(context.stringValue("DescribeEndpointsResponse.Endpoints[" + i + "].SerivceCode"));
                response.setEndpoint(context.stringValue("DescribeEndpointsResponse.Endpoints[" + i + "].Endpoint"));
                response.setRegionId(context.stringValue("DescribeEndpointsResponse.Endpoints[" + i + "].Id"));
                return response;
            }
        }
        return null;
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
                stringContent = new String(httpResponse.getHttpContent());
            } else {
                stringContent = new String(httpResponse.getHttpContent(), httpResponse.getEncoding());
            }
        } catch (UnsupportedEncodingException exp) {
            throw new ClientException("SDK.UnsupportedEncoding",
                "Can not parse response due to un supported encoding.");
        }
        return stringContent;
    }
}
