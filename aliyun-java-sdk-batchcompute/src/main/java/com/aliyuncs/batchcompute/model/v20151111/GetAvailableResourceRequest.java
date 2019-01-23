package com.aliyuncs.batchcompute.model.v20151111;

import com.aliyuncs.batchcompute.main.v20151111.BatchComputeRequest;
import com.aliyuncs.http.MethodType;

public class GetAvailableResourceRequest extends BatchComputeRequest<GetAvailableResourceResponse> {
    public GetAvailableResourceRequest() {
        super("BatchCompute", "2015-11-11", "GetAvailableResource");
        setUriPattern("/available");
        setMethod(MethodType.GET);
    }

    @Override
    public Class<GetAvailableResourceResponse> getResponseClass() {
        return GetAvailableResourceResponse.class;
    }
}
