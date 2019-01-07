package com.aliyuncs.endpoint;

public class ResolveEndpointRequest {

    public static final String ENDPOINT_TYPE_INNER = "innerAPI";
    public static final String ENDPOINT_TYPE_OPEN = "openAPI";

    public String productCode = null;
    public String regionId = null;
    public String endpointType = null;
    public String locationServiceCode = null;
    public String productCodeLower = null;

    public ResolveEndpointRequest(String regionId, String productCode,
                                  String locationServiceCode, String endpointType) {

        this.regionId = regionId;
        this.productCode = productCode;
        this.productCodeLower = productCode.toLowerCase();

        if (endpointType == null || endpointType.length() == 0) {
            endpointType = ENDPOINT_TYPE_OPEN;
        }

        this.endpointType = endpointType;
        this.locationServiceCode = locationServiceCode;

    }

    public boolean isOpenApiEndpoint() {
        return ENDPOINT_TYPE_OPEN.equals(endpointType);
    }
}
