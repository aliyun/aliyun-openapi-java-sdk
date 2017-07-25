package com.aliyuncs.regions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.aliyuncs.auth.Credential;
import com.aliyuncs.exceptions.ClientException;

public class MockRemoteEndpointsParser implements IEndpointsProvider {

    @Override
    public Endpoint getEndpoint(String region, String product) throws ClientException {
        Set<String> regionIds = new HashSet<String>();
        regionIds.add(region);
        
        ProductDomain productDomain = new ProductDomain(product, product.toLowerCase() + "." + region + ".aliyuncs.com");
        List<ProductDomain> productDomains = new ArrayList<ProductDomain>();
        productDomains.add(productDomain);
        
        Endpoint endpoint = new Endpoint(region, regionIds, productDomains);
        return endpoint;
    }

    @Override
    public Endpoint getEndpoint(String region, String product, String serviceCode, String endpointType,
                                Credential credential, LocationConfig locationConfig)
            throws ClientException {
        Set<String> regionIds = new HashSet<String>();
        regionIds.add(region);
        
        ProductDomain productDomain = new ProductDomain(product, product.toLowerCase() + "." + region + ".aliyuncs.com");
        List<ProductDomain> productDomains = new ArrayList<ProductDomain>();
        productDomains.add(productDomain);
        
        Endpoint endpoint = new Endpoint(region, regionIds, productDomains);
        return endpoint;
    }

}
