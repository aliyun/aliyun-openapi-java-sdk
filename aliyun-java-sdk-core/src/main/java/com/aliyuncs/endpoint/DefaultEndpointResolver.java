package com.aliyuncs.endpoint;

import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;
import com.aliyuncs.utils.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class DefaultEndpointResolver implements EndpointResolver {

    public static UserCustomizedEndpointResolver predefinedEndpointResolver = new UserCustomizedEndpointResolver();
    private UserCustomizedEndpointResolver userCustomizedEndpointResolver;
    private EndpointResolver insideEndpointResolver;

    public DefaultEndpointResolver(
            IAcsClient client,
            String userConfig,
            IClientProfile profile) {
        userCustomizedEndpointResolver = new UserCustomizedEndpointResolver();
        EndpointResolverRules endpointResolverRules = new EndpointResolverRules();
        List<EndpointResolverBase> resolverChain = new ArrayList<EndpointResolverBase>();

        // The order is very IMPORTANT!
        resolverChain.add(predefinedEndpointResolver);
        resolverChain.add(userCustomizedEndpointResolver);
        if (profile.isUsingVpcEndpoint()) {
            resolverChain.add(new UserVpcEndpointResolver());
        }
        resolverChain.add(endpointResolverRules);
        if (userConfig == null) {
            resolverChain.add(new LocalConfigRegionalEndpointResolver());
            resolverChain.add(new LocalConfigGlobalEndpointResolver());
        } else {
            resolverChain.add(new LocalConfigRegionalEndpointResolver(userConfig));
            resolverChain.add(new LocalConfigGlobalEndpointResolver(userConfig));
        }

        String locationServiceEndpoint = profile.getLocationServiceEndpoint();
        String locationServiceApiVersion = profile.getLocationServiceApiVersion();
        if (!StringUtils.isEmpty(locationServiceEndpoint) && !StringUtils.isEmpty(locationServiceApiVersion)) {
            resolverChain.add(new LocationServiceEndpointResolver(client,
                    locationServiceEndpoint,
                    locationServiceApiVersion));
        } else if (profile.isUsingInternalLocationService()) {
            resolverChain.add(new LocationServiceEndpointResolver(client,
                    "location-inner.aliyuncs.com",
                    "2015-12-25"));
        } else {
            resolverChain.add(new LocationServiceEndpointResolver(client));
        }

        insideEndpointResolver = new ChainedEndpointResolver(resolverChain);
    }

    public DefaultEndpointResolver(IAcsClient client) {
        this(client, null, DefaultProfile.getProfile(null));
    }

    public DefaultEndpointResolver(IAcsClient client, IClientProfile profile) {
        this(client, null, profile);
    }

    @Override
    public String resolve(ResolveEndpointRequest request) throws ClientException {
        return this.insideEndpointResolver.resolve(request);
    }

    public void putEndpointEntry(String regionId, String productCode, String endpoint) {
        this.userCustomizedEndpointResolver.putEndpointEntry(regionId, productCode, endpoint);
    }
}