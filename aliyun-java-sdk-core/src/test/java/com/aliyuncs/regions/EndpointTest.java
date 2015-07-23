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
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class EndpointTest {

	@Test
	public void  findProductDomainTest()  {
		String name = "hangzhou";
		String region = "cn-hangzhou";
		String product = "Ecs";
		String domain = "ecs.aliyuncs.com";
		
		List<Endpoint> endpoints = new ArrayList<Endpoint>();
		Set<String> regions = new HashSet<String>();
		regions.add(region);
		
		List<ProductDomain> productDomains = new ArrayList<ProductDomain>();
		productDomains.add(new ProductDomain(product, domain));
		
		Endpoint endpoint = new Endpoint(name, regions, productDomains);
		endpoints.add(endpoint);
		
		ProductDomain productDomain = Endpoint.findProductDomain(region, product, endpoints);
		Assert.assertNotNull(productDomain);
		Assert.assertTrue(product.equals(productDomain.getProductName()));
		Assert.assertTrue(domain.equals(productDomain.getDomianName()));
	}
}
