package com.aliyuncs.regions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.aliyuncs.auth.Credential;
import com.aliyuncs.exceptions.ClientException;

public class CustomizedEndpointsParser implements IEndpointsProvider {
    private Endpoint endpoint;

    public void setEndpoint(Endpoint endpoint) {
        this.endpoint = endpoint;
    }

    @Override
    public Endpoint getEndpoint(String regionId, String product) throws ClientException {
        if (endpoint != null) {
            for (String region : endpoint.getRegionIds()) {
                if (region.equals(regionId)) {
                    for (ProductDomain productDomain : endpoint.getProductDomains()) {
                        if (productDomain.getProductName().equals(product)) {
                            return this.endpoint;
                        }
                    }
                }
            }
        }
        return null;
    }

    @Override
    public Endpoint getEndpoint(String region, String product, String serviceCode, String endpointType,
                                Credential credential, LocationConfig locationConfig) throws ClientException {
        throw new UnsupportedOperationException();
    }

    public static CustomizedEndpointsParser initParser(String regionId, Map<String, String> productDomainMap) {
        CustomizedEndpointsParser parser = new CustomizedEndpointsParser();
        if (regionId == null || regionId.length() == 0 || productDomainMap == null) {
            return null;
        }
        Set<String> regionIds = new HashSet<String>();
        regionIds.add(regionId);
        List<ProductDomain> productDomainList = new ArrayList<ProductDomain>();
        for (String productName : productDomainMap.keySet()) {
            productDomainList.add(new ProductDomain(productName, productDomainMap.get(productName)));
        }
        Endpoint endpoint = new Endpoint(regionId, regionIds, productDomainList);
        parser.setEndpoint(endpoint);
        return parser;
    }
}
