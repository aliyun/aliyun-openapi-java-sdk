package com.aliyuncs.batchcompute.transform.v20151111;

import com.aliyuncs.batchcompute.model.v20151111.GetAvailableResourceResponse;
import com.aliyuncs.batchcompute.pojo.v20151111.AvailableResource;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.HttpResponse;
import com.aliyuncs.transform.UnmarshallerContext;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
public class GetAvailableResourceResponseUnmarshaller {
    public static GetAvailableResourceResponse unmarshall(GetAvailableResourceResponse getAvailableResourceResponse, UnmarshallerContext context) throws ServerException {

        HttpResponse httpResponse = context.getHttpResponse();
        getAvailableResourceResponse.setHttpResponse(httpResponse);

        try {
            String body = new String(httpResponse.getHttpContent(), httpResponse.getEncoding());

            ObjectMapper mapper = new ObjectMapper();
            AvailableResource availableResource = mapper.readValue(body, AvailableResource.class);

            getAvailableResourceResponse.setAvailableResource(availableResource);
        } catch (UnsupportedEncodingException e) {
            throw new ServerException("API.EncodeError", "encode response body error",getAvailableResourceResponse.getRequestId());
        } catch (IOException e) {
            throw new ServerException("API.EncodeError", "encode response body error",getAvailableResourceResponse.getRequestId());
        }
        return getAvailableResourceResponse;
    }
}
