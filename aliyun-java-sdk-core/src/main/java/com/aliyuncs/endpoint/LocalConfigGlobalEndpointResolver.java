package com.aliyuncs.endpoint;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class LocalConfigGlobalEndpointResolver extends LocalConfigRegionalEndpointResolver {

    public LocalConfigGlobalEndpointResolver() {
        JsonObject obj = readLocalConfigAsJsonObject();
        initLocalConfig(obj);
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
        for (String locationServiceCode : globalEndpoints.keySet()) {
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
