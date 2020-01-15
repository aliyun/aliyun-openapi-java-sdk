package com.aliyuncs.endpoint;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.InputStream;
import java.util.*;

public class LocalConfigRegionalEndpointResolver extends EndpointResolverBase {

    protected static final String ENDPOINT_JSON = "endpoints.json";
    private Set<String> validRegionIds = new HashSet<String>();
    private Map<String, String> locationCodeMapping = new HashMap<String, String>();
    private JsonObject regionalEndpointData;
    protected static final JsonObject ENDPOINTS_JSON;

    static {
        Scanner scanner = null;
        try {
            ClassLoader classLoader = LocalConfigRegionalEndpointResolver.class.getClassLoader();
            InputStream is = classLoader.getResourceAsStream(ENDPOINT_JSON);
            scanner = new Scanner(is, "UTF-8");
            scanner.useDelimiter("\0");
            String jsonStr = scanner.hasNext() ? scanner.next() : "";
            ENDPOINTS_JSON = (new JsonParser()).parse(jsonStr).getAsJsonObject();
        } finally {
            if (null != scanner) {
                scanner.close();
            }
        }
    }

    public LocalConfigRegionalEndpointResolver() {
        initLocalConfig(ENDPOINTS_JSON);
    }

    public LocalConfigRegionalEndpointResolver(String configJsonStr) {
        // For testability
        JsonObject obj = (new JsonParser()).parse(configJsonStr).getAsJsonObject();
        initLocalConfig(obj);
    }

    private void initLocalConfig(JsonObject obj) {
        initRegionalEndpointData(obj);
        initRegionIds(obj);
        initLocationCodeMapping(obj);
    }

    private void initRegionalEndpointData(JsonObject obj) {
        if (!obj.has("regional_endpoints")) {
            return;
        }
        regionalEndpointData = obj.get("regional_endpoints").getAsJsonObject();
        JsonObject regionalEndpoints = obj.get("regional_endpoints").getAsJsonObject();
        Set<String> regionalEndpointsKeySet = new HashSet<String>();
        for (Map.Entry<String, JsonElement> entry : regionalEndpoints.entrySet()) {
            regionalEndpointsKeySet.add(entry.getKey());
        }
        for (String normalizedProductCode : regionalEndpointsKeySet) {
            JsonObject productData = regionalEndpoints.get(normalizedProductCode).getAsJsonObject();
            Set<String> productDataKeySet = new HashSet<String>();
            for (Map.Entry<String, JsonElement> entry : productData.entrySet()) {
                productDataKeySet.add(entry.getKey());
            }
            for (String regionId : productDataKeySet) {
                String endpoint = productData.get(regionId).getAsString();
                putEndpointEntry(makeEndpointKey(normalizedProductCode, regionId), endpoint);
            }
        }
    }

    protected void initRegionIds(JsonObject obj) {
        if (!obj.has("regions")) {
            return;
        }
        JsonArray regions = obj.get("regions").getAsJsonArray();
        for (JsonElement regionData : regions) {
            validRegionIds.add(regionData.getAsString());
        }
    }

    protected void initLocationCodeMapping(JsonObject obj) {
        if (!obj.has("location_code_mapping")) {
            return;
        }
        JsonObject mappingData = obj.get("location_code_mapping").getAsJsonObject();
        Set<String> keySet = new HashSet<String>();
        for (Map.Entry<String, JsonElement> entry : mappingData.entrySet()) {
            keySet.add(entry.getKey());
        }
        for (String productCode : keySet) {
            String locationServiceCode = mappingData.get(productCode).getAsString();
            locationCodeMapping.put(productCode, locationServiceCode);
        }
    }

    protected String getNormalizedProductCode(String productCode) {
        String productCodeLower = productCode.toLowerCase();
        if (locationCodeMapping.containsKey(productCodeLower)) {
            return locationCodeMapping.get(productCodeLower);
        }
        return productCodeLower;
    }

    @Override
    public String resolve(ResolveEndpointRequest request) {
        if (request.isOpenApiEndpoint()) {
            return fetchEndpointEntry(request);
        } else {
            return null;
        }
    }

    @Override
    public String makeEndpointKey(ResolveEndpointRequest request) {
        return makeEndpointKey(request.productCodeLower, request.regionId);
    }

    public String makeEndpointKey(String productCodeLower, String regionId) {
        return getNormalizedProductCode(productCodeLower) + "." + regionId.toLowerCase();
    }

    @Override
    public boolean isRegionIdValid(ResolveEndpointRequest request) {
        return validRegionIds.contains(request.regionId);
    }

    @Override
    public Set<String> getValidRegionIdsByProduct(String productCodeLower) {
        String code = getNormalizedProductCode(productCodeLower);
        if (regionalEndpointData != null && regionalEndpointData.has(code)) {
            JsonObject regionalEndpoints = regionalEndpointData.get(code).getAsJsonObject();
            Set<String> validRegionIdsByProduct = new HashSet<String>();
            for (Map.Entry<String, JsonElement> entry : regionalEndpoints.entrySet()) {
                validRegionIdsByProduct.add(entry.getKey());
            }
            return validRegionIdsByProduct;
        }
        return null;
    }

    @Override
    public boolean isProductCodeValid(ResolveEndpointRequest request) {
        ResolveEndpointRequest request2 = new ResolveEndpointRequest(
                request.regionId,
                getNormalizedProductCode(request.productCode),
                null,
                null
        );
        return super.isProductCodeValid(request2);
    }
}
