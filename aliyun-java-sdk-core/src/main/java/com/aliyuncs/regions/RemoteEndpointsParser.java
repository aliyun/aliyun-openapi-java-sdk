package com.aliyuncs.regions;

import com.aliyuncs.auth.Credential;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class RemoteEndpointsParser implements IEndpointsProvider {

    private ConcurrentMap<String, List<Endpoint>> endpointMap = new ConcurrentHashMap<String, List<Endpoint>>();

    private DescribeEndpointService               describeEndpointService;

    public void setDescribeEndpointService(DescribeEndpointService describeEndpointService) {
        this.describeEndpointService = describeEndpointService;
    }

    public static RemoteEndpointsParser initRemoteEndpointsParser() {
        RemoteEndpointsParser parser = new RemoteEndpointsParser();
        parser.setDescribeEndpointService(new DescribeEndpointServiceImpl());
        return parser;
    }

    @Override
    public List<Endpoint> getEndpoints() throws ClientException {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<Endpoint> getEndpoints(String regionId, String serviceCode, String endpointType, Credential credential,
                                       LocationConfig locationConfig) throws ClientException {
        List<Endpoint> endpoints = endpointMap.get(serviceCode);
        if (endpoints != null) {
            return endpoints;
        }

        DescribeEndpointResponse response = describeEndpointService.describeEndpoint(regionId, serviceCode,
                endpointType, credential, locationConfig);
        if (response == null) {
            return endpoints;
        }
        Set<String> regionIds = new HashSet<String>();
        regionIds.add(response.getRegionId());

        List<ProductDomain> productDomainList = Arrays.asList(new ProductDomain(response.getProduct(), response
                .getEndpoint()));
        Endpoint endpoint = new Endpoint(response.getRegionId(), regionIds, productDomainList);
        endpoints = Arrays.asList(endpoint);
        endpointMap.putIfAbsent(serviceCode, endpoints);
        return endpoints;
    }

    public static void main(String[] args) throws ClientException {

        IClientProfile profile= DefaultProfile.getProfile("cn-qingdao", "account", "secret");
        List<Endpoint> list =  profile.getEndpoints("Ecs", "ecs", "");
        System.out.println(list.get(0));

    }

}
