package com.aliyuncs.regions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.aliyuncs.auth.Credential;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;

public class RemoteEndpointsParser implements IEndpointsProvider {

    private DescribeEndpointService describeEndpointService;

    public void setDescribeEndpointService(DescribeEndpointService describeEndpointService) {
        this.describeEndpointService = describeEndpointService;
    }

    public static RemoteEndpointsParser initRemoteEndpointsParser() {
        RemoteEndpointsParser parser = new RemoteEndpointsParser();
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
            return null;
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

    public static void main(String[] args) throws ClientException {

        IClientProfile profile = DefaultProfile.getProfile("cn-qingdao", "account", "secret");
        List<Endpoint> list = profile.getEndpoints("Ecs", "cn-qingdao", "ecs", "");
        System.out.println(list.get(0));

    }

}
