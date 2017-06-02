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

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Endpoint {
    private String name = null;
    private Set<String> regionIds = null;
    private List<ProductDomain> productDomains = null;

    public Endpoint(String name, Set<String> regionIds, List<ProductDomain> productDomains) {
        this.name = name;
        this.regionIds = regionIds;
        this.productDomains = productDomains;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<String> getRegionIds() {
        return regionIds;
    }

    public void setRegionIds(Set<String> regionIds) {
        this.regionIds = regionIds;
    }

    public List<ProductDomain> getProductDomains() {
        return productDomains;
    }

    public void setProductDomains(List<ProductDomain> productDomains) {
        this.productDomains = productDomains;
    }

    public static ProductDomain findProductDomain(String regionId, String product, List<Endpoint> endpoints) {
        if (null == regionId || null == product || null == endpoints) {
            return null;
        }
        for (Endpoint endpoint : endpoints) {
            if (endpoint.getRegionIds().contains(regionId)) {
                ProductDomain domain = findProductDomainByProduct(endpoint.getProductDomains(), product);
                return domain;
            }
        }
        return null;
    }

    private static ProductDomain findProductDomainByProduct(List<ProductDomain> productDomains, String product) {
        if (null == productDomains) {
            return null;
        }
        for (ProductDomain productDomain : productDomains) {
            if (product.equalsIgnoreCase(productDomain.getProductName())) {
                return productDomain;
            }
        }
        return null;
    }
}
