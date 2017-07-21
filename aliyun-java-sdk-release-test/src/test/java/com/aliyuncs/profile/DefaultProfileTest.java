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

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;

import com.aliyuncs.regions.Endpoint;
import com.aliyuncs.regions.ProductDomain;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DefaultProfileTest {

    @Test
    public void testProfileCredential() {
        IClientProfile iprofile = DefaultProfile.getProfile("cn-beijing", "testid", "testsecret");
        assertEquals("cn-beijing", iprofile.getRegionId());
        assertEquals("testid", iprofile.getCredential().getAccessKeyId());
        assertEquals("testsecret", iprofile.getCredential().getAccessSecret());
    }

    @Test
    public void testAddEndpoint() throws Exception {
        try {
            IClientProfile clientProfile = DefaultProfile.getProfile();
            clientProfile.getEndpoints("cn-beijing", "Rds");
            Method method = DefaultProfile.class.getDeclaredMethod("addEndpoint", String.class, String.class,
                String.class, String.class);
            method.setAccessible(true);
            method.invoke(DefaultProfile.class, "cn-beijing", "cn-beijing", "Oss", "oss-admin.aliyuncs.com");
            List<Endpoint> endpoints = clientProfile.getEndpoints("cn-beijing", "Oss");
            boolean success = false;
            for (Endpoint endpoint : endpoints) {
                if ("cn-beijing".equals(endpoint.getName())) {
                    ProductDomain productDomain = getProductDomain(endpoint.getProductDomains(),
                        "oss-admin.aliyuncs.com", "Oss");
                    String regionId = getRegionId(endpoint.getRegionIds(), "cn-beijing");
                    if (null != productDomain && null != regionId) {
                        success = true;
                    }
                }
            }
            Assert.assertTrue(success);
        } catch (Exception e) {
            Assert.fail();
        }
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
    public void testUpdateEndpoint() {
        try {
            Set<String> regions = new HashSet<String>();

            List<ProductDomain> productDomains = new ArrayList<ProductDomain>();
            productDomains.add(new ProductDomain("Ecs", "ecs.aliyuncs.com"));
            productDomains.add(new ProductDomain("Rds", "rds.aliyuncs.com"));
            productDomains.add(new ProductDomain("Oss", "oss.aliyuncs.com"));

            Endpoint endpoint = new Endpoint("cn-hangzhou", regions, productDomains);

            Method method = DefaultProfile.class.getDeclaredMethod("updateEndpoint", String.class, String.class,
                String.class, Endpoint.class);
            method.setAccessible(true);

            method.invoke(DefaultProfile.class, "cn-hangzhou", "Oss", "oss-admin.aliyuncs.com", endpoint);

            Method method_findProductDomain = DefaultProfile.class.getDeclaredMethod("findProductDomain", List.class,
                String.class);
            method_findProductDomain.setAccessible(true);
            ProductDomain productDomain = (ProductDomain)method_findProductDomain.invoke(DefaultProfile.class,
                productDomains, "Oss");
            Assert.assertTrue("Oss".equals(productDomain.getProductName()));
            Assert.assertTrue("oss-admin.aliyuncs.com".equals(productDomain.getDomianName()));

            productDomain = (ProductDomain)method_findProductDomain.invoke(DefaultProfile.class, productDomains, "Oss");
            Assert.assertTrue("Oss".equals(productDomain.getProductName()));
            Assert.assertTrue("oss-admin.aliyuncs.com".equals(productDomain.getDomianName()));

            Assert.assertTrue("cn-hangzhou".equals(endpoint.getName()));

        } catch (Exception e) {
            Assert.fail();
        }
    }

    @Test
    public void testFindEndpointByName() {
        try {
            DefaultProfile.addEndpoint("cn-hangzhou", "cn-hangzhou", "Ecs", "ecs-cn-hangzhou.aliyuncs.com");
            DefaultProfile.addEndpoint("cn-hangzhou", "cn-beijing", "Ecs", "ecs-cn-hangzhou.aliyuncs.com");
            DefaultProfile.addEndpoint("cn-hangzhou", "cn-shanghai", "Ecs", "ecs-cn-hangzhou.aliyuncs.com");
            Method method = DefaultProfile.class.getDeclaredMethod("findEndpointByRegionId", String.class);
            method.setAccessible(true);

            Endpoint endpoint = (Endpoint)method.invoke(DefaultProfile.class, "cn-hangzhou");
            Assert.assertTrue("cn-hangzhou".equals(endpoint.getName()));

        } catch (Exception e) {
            Assert.fail();
        }
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
