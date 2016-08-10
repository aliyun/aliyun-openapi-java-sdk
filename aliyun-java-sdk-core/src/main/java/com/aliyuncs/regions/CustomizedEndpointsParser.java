package com.aliyuncs.regions;

import com.aliyuncs.auth.Credential;
import com.aliyuncs.exceptions.ClientException;

import java.util.*;

public class CustomizedEndpointsParser implements IEndpointsProvider {
    private List<Endpoint> endpoints;

    public void setEndpoints(List<Endpoint> endpoints) {
        this.endpoints = endpoints;
    }

    @Override
    public List<Endpoint> getEndpoints() throws ClientException {
        return this.endpoints;
    }

    @Override
    public List<Endpoint> getEndpoints(String region, String product, String endpointType, Credential credential,
                                       LocationConfig locationConfig) throws ClientException {
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

        parser.setEndpoints(Arrays.asList(endpoint));
        return parser;
    }
}
