package com.aliyuncs.endpoint;

import com.aliyuncs.exceptions.ClientException;

public class UserVpcEndpointResolver extends EndpointResolverBase {

    @Override
    public boolean isRegionIdValid(ResolveEndpointRequest request) {
        return request.regionId != null;
    }

    @Override
    public boolean isProductCodeValid(ResolveEndpointRequest request) {
        return request.productCode != null;
    }

    @Override
    String makeEndpointKey(ResolveEndpointRequest request) {
        return null;
    }

    @Override
    public String resolve(ResolveEndpointRequest request) throws ClientException {
        String productCode = request.productCode.toLowerCase();
        String regionId = request.regionId.toLowerCase();
        return String.format("%s-vpc.%s.aliyuncs.com", productCode, regionId);
    }
}
