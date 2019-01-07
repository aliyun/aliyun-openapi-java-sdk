package com.aliyuncs.endpoint;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public abstract class EndpointResolverBase implements EndpointResolver {
    Map<String, String> endpointsData;

    public EndpointResolverBase() {
        endpointsData = new HashMap<String, String>();
    }

    public String fetchEndpointEntry(ResolveEndpointRequest request) {
        String key = makeEndpointKey(request);
        if (endpointsData.containsKey(key)) {
            return endpointsData.get(key);
        } else {
            return null;
        }
    }

    public void putEndpointEntry(String key, String endpoint) {
        endpointsData.put(key, endpoint);
    }

    public boolean isProductCodeValid(ResolveEndpointRequest request) {
        for (String key : endpointsData.keySet()) {
            if (key.startsWith(request.productCodeLower)) {
                return true;
            }
        }
        return false;
    }

    abstract public boolean isRegionIdValid(ResolveEndpointRequest request);

    abstract String makeEndpointKey(ResolveEndpointRequest request);

    public Set<String> getValidRegionIdsByProduct(String productCode) {
        // Only local config can tell
        return null;
    }
}
