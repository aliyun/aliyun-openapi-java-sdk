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
package com.aliyuncs.profile;

import static org.junit.Assert.assertEquals;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.aliyuncs.regions.ProductDomain;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;

import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DefaultProfileTest {

    @SuppressWarnings("deprecation")
    @Test
    public void testProfileCredential() {
        IClientProfile iprofile = DefaultProfile.getProfile("cn-beijing", "testid", "testsecret");
        assertEquals("cn-beijing", iprofile.getRegionId());
        assertEquals("testid", iprofile.getCredential().getAccessKeyId());
        assertEquals("testsecret", iprofile.getCredential().getAccessSecret());
    }

    private String getRegionId(Set<String> regionIds, String regionId) {
        for (String r : regionIds) {
            if (r.equals(regionId)) {
                return r;
            }
        }
        return null;
    }

    private ProductDomain getProductDomain(List<ProductDomain> productDomains, String domainName, String productName) {
        for (ProductDomain productDomain : productDomains) {
            if (domainName.equals(productDomain.getDomianName()) && productName.equals(
                productDomain.getProductName())) {
                return productDomain;
            }
        }
        return null;
    }


    @Test
    public void testFindProductDomain() {
        try {
            List<ProductDomain> productDomains = new ArrayList<ProductDomain>();
            productDomains.add(new ProductDomain("Ecs", "ecs.aliyuncs.com"));
            productDomains.add(new ProductDomain("Rds", "rds.aliyuncs.com"));
            productDomains.add(new ProductDomain("Ocs", "ocs.aliyuncs.com"));

            Method method = DefaultProfile.class.getDeclaredMethod("findProductDomain", List.class, String.class);
            method.setAccessible(true);
            ProductDomain productDomain = (ProductDomain)method.invoke(DefaultProfile.class, productDomains, "Ecs");
            Assert.assertTrue("Ecs".equals(productDomain.getProductName()));
            Assert.assertTrue("ecs.aliyuncs.com".equals(productDomain.getDomianName()));
        } catch (Exception e) {
            Assert.fail();
        }
    }

}
