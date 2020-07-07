package com.aliyuncs.endpoint;

import com.aliyuncs.exceptions.ClientException;

public class UserConfigEndpointResolverTest extends EndpointResolverBase{
    @Override
    public boolean isRegionIdValid(ResolveEndpointRequest request) {
        return false;
    }

    @Override
    public String makeEndpointKey(ResolveEndpointRequest request) {
        return null;
    }

    @Override
    public String resolve(ResolveEndpointRequest request) throws ClientException {
        return "test.com";
    }
}
