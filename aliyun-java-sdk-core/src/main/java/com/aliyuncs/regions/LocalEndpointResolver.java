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
package com.aliyuncs.regions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.aliyuncs.auth.Credential;

import com.aliyuncs.exceptions.ClientException;
import org.json.JSONObject;

public class LocalEndpointResolver implements EndpointResolver {

    Map<String, EndpointData> endpointDataMap = new HashMap<String, EndpointData>();

    public LocalEndpointResolver() {
        JSONObject endpointData = new JSONObject(EndpointConfig.ENDPOINT_PROFILE);
        for (Object productDataObj : endpointData.getJSONArray("products")) {
            JSONObject productData = (JSONObject)productDataObj;
            EndpointData data = new EndpointData();
            data.setProduct(productData.getString("code"));
            data.setGlobalEndpoint(productData.getString("global_endpoint"));
            for (Object regionalDataObj : productData.getJSONArray("regional_endpoints")) {
                JSONObject regionalData = (JSONObject)regionalDataObj;
                data.getRegionalEndpoint().put(regionalData.getString("region"), regionalData.getString("endpoint"));
            }
            endpointDataMap.put(data.getProduct(), data);
        }
    }

    @Override
    public Endpoint getEndpoint(String region, String product) throws ClientException {

        EndpointData endpointData = this.endpointDataMap.get(product);

        if (endpointData == null) {
            return null;
        }

        // get regional endpoint
        if (endpointData.getRegionalEndpoint().containsKey(region)) {
            String endpoint = endpointData.getRegionalEndpoint().get(region);
            return packageToEndpoint(product, region, endpoint);
        }

        // get global endpoint
        if (endpointData.getGlobalEndpoint() != null && endpointData.getGlobalEndpoint().length() > 0) {
            return packageToEndpoint(product, region, endpointData.getGlobalEndpoint());
        }

        return null;

    }

    public Endpoint packageToEndpoint(String product, String regionId, String endpoint) {
        Set<String> regionIds = new HashSet<String>();
        regionIds.add(regionId);
        List<ProductDomain> productDomainList = new ArrayList<ProductDomain>();
        productDomainList.add(new ProductDomain(product, endpoint));
        Endpoint result = new Endpoint(regionId, regionIds, productDomainList);
        return result;
    }

    @Override
    public Endpoint getEndpoint(String region, String product, String serviceCode, String endpointType,
                                Credential credential, LocationConfig locationConfig) throws ClientException {
        throw new UnsupportedOperationException();
    }

    private class EndpointData {
        private String product;
        private String globalEndpoint;
        private Map<String, String> regionalEndpoint = new HashMap<String, String>();

        public String getProduct() {
            return product;
        }

        public void setProduct(String product) {
            this.product = product;
        }

        public String getGlobalEndpoint() {
            return globalEndpoint;
        }

        public void setGlobalEndpoint(String globalEndpoint) {
            this.globalEndpoint = globalEndpoint;
        }

        public Map<String, String> getRegionalEndpoint() {
            return regionalEndpoint;
        }

        public void setRegionalEndpoint(Map<String, String> regionalEndpoint) {
            this.regionalEndpoint = regionalEndpoint;
        }
    }

}
