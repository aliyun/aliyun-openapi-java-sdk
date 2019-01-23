package com.aliyuncs.batchcompute.model.v20151111;

import com.aliyuncs.batchcompute.main.v20151111.BatchComputeResponse;
import com.aliyuncs.batchcompute.pojo.v20151111.AvailableResource;
import com.aliyuncs.batchcompute.transform.v20151111.GetAvailableResourceResponseUnmarshaller;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.transform.UnmarshallerContext;

public class GetAvailableResourceResponse extends BatchComputeResponse {

    private AvailableResource availableResource;

    public AvailableResource getAvailableResource() {
        return availableResource;
    }

    public void setAvailableResource(AvailableResource availableResource) {
        this.availableResource = availableResource;
    }
    @Override
    public GetAvailableResourceResponse getInstance(UnmarshallerContext context) throws ServerException {
        return	GetAvailableResourceResponseUnmarshaller.unmarshall(this, context);
    }
}
