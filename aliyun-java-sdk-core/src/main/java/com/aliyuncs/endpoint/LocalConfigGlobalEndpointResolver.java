package com.aliyuncs.endpoint;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LocalConfigGlobalEndpointResolver extends LocalConfigRegionalEndpointResolver {

    public LocalConfigGlobalEndpointResolver() {
        initLocalConfig(LocalConfigRegionalEndpointResolver.ENDPOINTS_JSON);
    }

    public LocalConfigGlobalEndpointResolver(String configJsonStr) {
        // For testability
        JsonObject obj = (new JsonParser()).parse(configJsonStr).getAsJsonObject();
        initLocalConfig(obj);
    }

    protected void initLocalConfig(JsonObject obj) {
        initGlobalEndpointData(obj);
        initRegionIds(obj);
        initLocationCodeMapping(obj);
    }

    private void initGlobalEndpointData(JsonObject obj) {
        if (!obj.has("global_endpoints")) {
            return;
        }
        JsonObject globalEndpoints = obj.get("global_endpoints").getAsJsonObject();
        Set<String> globalEndpointsKeySet = new HashSet<String>();
        for (Map.Entry<String, JsonElement> entry : globalEndpoints.entrySet()) {
            globalEndpointsKeySet.add(entry.getKey());
        }
        for (String locationServiceCode : globalEndpointsKeySet) {
            String endpoint = globalEndpoints.get(locationServiceCode).getAsString();
            putEndpointEntry(makeEndpointKey(locationServiceCode), endpoint);
        }
    }

    @Override
    public String resolve(ResolveEndpointRequest request) {
        if (request.isOpenApiEndpoint() && isRegionIdValid(request)) {
            return fetchEndpointEntry(request);
        } else {
            return null;
        }
    }

    @Override
    public String makeEndpointKey(ResolveEndpointRequest request) {
        return makeEndpointKey(request.productCodeLower);
    }

    public String makeEndpointKey(String productCodeLower) {
        return getNormalizedProductCode(productCodeLower);
    }
}
