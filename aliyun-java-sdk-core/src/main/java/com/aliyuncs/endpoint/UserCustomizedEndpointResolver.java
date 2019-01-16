package com.aliyuncs.endpoint;

import java.util.HashSet;
import java.util.Set;

public class UserCustomizedEndpointResolver extends EndpointResolverBase {

    private Set<String> validRegionIds;

    public UserCustomizedEndpointResolver() {
        validRegionIds = new HashSet<String>();
    }

    public void putEndpointEntry(String regionId, String productCode, String endpoint) {
        putEndpointEntry(makeEndpointKey(productCode, regionId), endpoint);
        validRegionIds.add(regionId);
    }

    @Override
    public String resolve(ResolveEndpointRequest request) {
        return fetchEndpointEntry(request);
    }

    @Override
    public String makeEndpointKey(ResolveEndpointRequest request) {
        return makeEndpointKey(request.productCode, request.regionId);
    }

    public String makeEndpointKey(String productCode, String regionId) {
        return productCode.toLowerCase() + "." + regionId.toLowerCase();
    }

    @Override
    public boolean isRegionIdValid(ResolveEndpointRequest request) {
        return validRegionIds.contains(request.regionId);
    }
}
