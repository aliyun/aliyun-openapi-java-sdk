package com.aliyuncs.v5.endpoint;

import com.aliyuncs.v5.DefaultAcsClient;
import com.aliyuncs.v5.exceptions.ClientException;
import com.aliyuncs.v5.profile.DefaultProfile;
import com.aliyuncs.v5.profile.IClientProfile;

import java.util.ArrayList;
import java.util.List;

public class DefaultEndpointResolver implements EndpointResolver {

    public static UserCustomizedEndpointResolver predefinedEndpointResolver = new UserCustomizedEndpointResolver();
    private UserCustomizedEndpointResolver userCustomizedEndpointResolver;
    private EndpointResolver insideEndpointResolver;

    public DefaultEndpointResolver(
            DefaultAcsClient client,
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

        if (profile.isUsingInternalLocationService()) {
            resolverChain.add(new InternalLocationServiceEndpointResolver(client));
        } else {
            resolverChain.add(new LocationServiceEndpointResolver(client));
        }

        insideEndpointResolver = new ChainedEndpointResolver(resolverChain);
    }

    public DefaultEndpointResolver(DefaultAcsClient client) {
        this(client, null, DefaultProfile.getProfile(null));
    }

    public DefaultEndpointResolver(DefaultAcsClient client, IClientProfile profile) {
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