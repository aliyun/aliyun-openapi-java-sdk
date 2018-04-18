package com.aliyuncs.regions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.aliyuncs.auth.Credential;
import com.aliyuncs.exceptions.ClientException;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

@SuppressWarnings("deprecation")
public class LocationServiceEndpointResolver implements EndpointResolver {

    private DescribeEndpointService describeEndpointService;

    private Map<String, String> serviceCodeMap = new HashMap<String, String>();

    public LocationServiceEndpointResolver() {
        JsonObject endpointData = (new JsonParser()).parse(EndpointConfig.ENDPOINT_PROFILE).getAsJsonObject();
        for (JsonElement productDataObj : endpointData.get("products").getAsJsonArray()) {
            JsonObject productData = productDataObj.getAsJsonObject();
            String popCode = productData.get("code").getAsString();
            String serviceCode = productData.get("location_service_code").getAsString();
            if (popCode != null && popCode.length() > 0 && serviceCode != null && serviceCode.length() > 0) {
                serviceCodeMap.put(popCode.toLowerCase(), serviceCode);
            }
        }
    }

    public void setDescribeEndpointService(DescribeEndpointService describeEndpointService) {
        this.describeEndpointService = describeEndpointService;
    }

    public static LocationServiceEndpointResolver initRemoteEndpointsParser() {
        LocationServiceEndpointResolver parser = new LocationServiceEndpointResolver();
        parser.setDescribeEndpointService(new DescribeEndpointServiceImpl());
        return parser;
    }

    @Override
    public Endpoint getEndpoint(String regionId, String product) throws ClientException {
        throw new UnsupportedOperationException();
    }

    @Override
    public Endpoint getEndpoint(String regionId, String product, String serviceCode, String endpointType,
                                Credential credential, LocationConfig locationConfig) throws ClientException {
        if (serviceCode == null) {
            serviceCode = serviceCodeMap.get(product.toLowerCase());
            if (serviceCode == null) {
                return null;
            }
        }
        Endpoint endpoint = null;

        DescribeEndpointResponse response = describeEndpointService.describeEndpoint(regionId, serviceCode,
            endpointType, credential, locationConfig);
        if (response == null) {
            return endpoint;
        }
        Set<String> regionIds = new HashSet<String>();
        regionIds.add(regionId);

        List<ProductDomain> productDomainList = new ArrayList<ProductDomain>();
        productDomainList.add(new ProductDomain(product, response.getEndpoint()));

        endpoint = new Endpoint(response.getRegionId(), regionIds, productDomainList);
        return endpoint;
    }

}
