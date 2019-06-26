package com.aliyuncs.endpoint;

import java.util.Iterator;
import java.util.HashMap;

public class EndpointResolverRules extends EndpointResolverBase {
    private Boolean validRegionId = false;
    private HashMap<String, String> productEndpointMap = null;
    private String productEndpointRegional = null;
    private String productNetwork = "public";
    private String productSuffix = "";

    @Override
    public String resolve(ResolveEndpointRequest request) {
        this.productEndpointMap = request.productEndpointMap;
        this.productEndpointRegional = request.productEndpointRegional;
        this.productNetwork = request.productNetwork;
        this.productSuffix = request.productSuffix;
        return getEndpoint(request.productCode, request.regionId);
    }

    @Override
    public String makeEndpointKey(ResolveEndpointRequest request) {
        return makeEndpointKey(request.productCode, request.regionId);
    }

    public String makeEndpointKey(String productCode, String regionId) {
        return productCode.toLowerCase() + "." + regionId.toLowerCase();
    }

    private String getEndpoint(String productCode, String regionId) {
        if (this.productEndpointRegional != null && this.productEndpointMap != null) {
            Iterator<HashMap.Entry<String, String>> entries = this.productEndpointMap.entrySet().iterator();
            while (entries.hasNext()) {
                HashMap.Entry<String, String> entry = entries.next();
                if (entry.getKey() == regionId) {
                    return entry.getValue();
                }
            }
            String endpoint = "";
            if (this.productEndpointRegional == "regional") {
                endpoint = "<product_id><suffix><network>.<region_id>.aliyuncs.com";
                endpoint = endpoint.replace("<region_id>", regionId.toLowerCase());
            } else {
                endpoint = "<product_id><suffix><network>.aliyuncs.com";
            }
            if (this.productSuffix == null || this.productSuffix.equals("")) {
                endpoint = endpoint.replace("<suffix>", "");
            } else {
                endpoint = endpoint.replace("<suffix>", "-" + this.productSuffix.toLowerCase());
            }
            if (this.productNetwork == "public" || this.productNetwork == "") {
                endpoint = endpoint.replace("<network>", "");
            } else {
                endpoint = endpoint.replace("<network>", "-" + this.productNetwork.toLowerCase());
            }

            endpoint = endpoint.replace("<product_id>", productCode.toLowerCase());
            this.validRegionId = true;
            return endpoint;
        }
        return null;
    }

    @Override
    public boolean isRegionIdValid(ResolveEndpointRequest request) {
        return this.validRegionId;
    }
}
