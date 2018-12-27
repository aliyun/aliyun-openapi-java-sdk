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

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public abstract class EndpointResolverBase implements EndpointResolver {
    Map<String, String> endpointsData;

    public EndpointResolverBase() {
        endpointsData = new HashMap<String, String>();
    }

    public String fetchEndpointEntry(ResolveEndpointRequest request)  {
        String key = makeEndpointKey(request);
        if (endpointsData.containsKey(key)) {
            return endpointsData.get(key);
        } else {
            return null;
        }
    }

    public void putEndpointEntry(String key, String endpoint) {
        endpointsData.put(key, endpoint);
    }

    public boolean isProductCodeValid(ResolveEndpointRequest request) {
        for (String key : endpointsData.keySet()) {
            if (key.startsWith(request.productCodeLower)) {
                return true;
            }
        }
        return false;
    }

    abstract public boolean isRegionIdValid(ResolveEndpointRequest request);

    abstract String makeEndpointKey(ResolveEndpointRequest request);

    public Set<String> getValidRegionIdsByProduct(String productCode) {
        // Only local config can tell
        return null;
    }
}
