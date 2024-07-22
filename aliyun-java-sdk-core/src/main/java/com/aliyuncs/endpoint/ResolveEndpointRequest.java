package com.aliyuncs.endpoint;

import com.aliyuncs.utils.StringUtils;

import java.util.HashMap;

public class ResolveEndpointRequest {

    public static final String ENDPOINT_TYPE_INNER = "innerAPI";
    public static final String ENDPOINT_TYPE_OPEN = "openAPI";

    public String productCode;
    public String regionId;
    public String endpointType;
    public String locationServiceCode;
    public String productCodeLower;
    public HashMap<String, String> productEndpointMap = null;
    public String productEndpointRegional = null;
    public String productNetwork = "public";
    public String productSuffix = "";

    public ResolveEndpointRequest(String regionId, String productCode,
                                  String locationServiceCode, String endpointType) {

        this.regionId = regionId;
        this.productCode = productCode;
        this.productCodeLower = productCode.toLowerCase();

        if (StringUtils.isEmpty(endpointType)) {
            endpointType = ENDPOINT_TYPE_OPEN;
        }

        this.endpointType = endpointType;
        this.locationServiceCode = locationServiceCode;
    }

    public boolean isOpenApiEndpoint() {
        return ENDPOINT_TYPE_OPEN.equals(endpointType);
    }

    public void setProductEndpointMap(HashMap<String, String> productEndpointMap) {
        this.productEndpointMap = productEndpointMap;
    }

    public void setProductEndpointRegional(String productEndpointRegional) {
        this.productEndpointRegional = productEndpointRegional;
    }

    public void setProductNetwork(String productNetwork) {
        this.productNetwork = productNetwork;
    }

    public void setProductSuffix(String suffix) {
        this.productSuffix = suffix;
    }
}
