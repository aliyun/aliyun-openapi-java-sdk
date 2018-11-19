/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.aliyuncs.endpoint;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.exceptions.ClientException;

import java.util.ArrayList;
import java.util.List;

public class DefaultEndpointResolver implements EndpointResolver {

    public static UserCustomizedEndpointResolver predefinedEndpointResolver = new UserCustomizedEndpointResolver();
    private UserCustomizedEndpointResolver userCustomizedEndpointResolver;
    private EndpointResolver insideEndpointResolver;

    public DefaultEndpointResolver(
            DefaultAcsClient client,
            String userConfig,
            boolean usingInternalLocationService) {
        userCustomizedEndpointResolver = new UserCustomizedEndpointResolver();
        List<EndpointResolverBase> resolverChain = new ArrayList<EndpointResolverBase>();

        // The order is very IMPORTANT!
        resolverChain.add(predefinedEndpointResolver);
        resolverChain.add(userCustomizedEndpointResolver);
        if (userConfig == null) {
            resolverChain.add(new LocalConfigRegionalEndpointResolver());
            resolverChain.add(new LocalConfigGlobalEndpointResolver());
        } else {
            resolverChain.add(new LocalConfigRegionalEndpointResolver(userConfig));
            resolverChain.add(new LocalConfigGlobalEndpointResolver(userConfig));
        }

        if (usingInternalLocationService) {
            resolverChain.add(new InternalLocationServiceEndpointResolver(client));
        } else {
            resolverChain.add(new LocationServiceEndpointResolver(client));
        }

        insideEndpointResolver = new ChainedEndpointResolver(resolverChain);
    }

    public DefaultEndpointResolver(DefaultAcsClient client) {
        this(client, null, false);
    }

    public DefaultEndpointResolver(DefaultAcsClient client, boolean usingInternalLocationService) {
        this(client, null, usingInternalLocationService);
    }

    public String resolve(ResolveEndpointRequest request) throws ClientException {
        return this.insideEndpointResolver.resolve(request);
    }

    public void putEndpointEntry(String regionId, String productCode, String endpoint) {
        this.userCustomizedEndpointResolver.putEndpointEntry(regionId, productCode, endpoint);
    }
}
