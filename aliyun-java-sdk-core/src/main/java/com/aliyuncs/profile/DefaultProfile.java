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

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.aliyuncs.auth.Credential;
import com.aliyuncs.auth.ICredentialProvider;
import com.aliyuncs.auth.ISigner;
import com.aliyuncs.auth.ShaHmac1;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.http.FormatType;
import com.aliyuncs.regions.Endpoint;
import com.aliyuncs.regions.IEndpointsProvider;
import com.aliyuncs.regions.InternalEndpointsParser;
import com.aliyuncs.regions.ProductDomain;

public class DefaultProfile implements IClientProfile {

	private static DefaultProfile profile = null;
	private static List<Endpoint> endpoints = null;
	
	private Credential credential = null;
	private String regionId = null;
	private FormatType acceptFormat = null;
	private ISigner isigner = null;
	private IEndpointsProvider iendpoints = null;
	private ICredentialProvider icredential = null;
	
	private DefaultProfile() {
		this.iendpoints = new InternalEndpointsParser();
	}
	
	private DefaultProfile(String region, Credential creden) {
		iendpoints = new InternalEndpointsParser();
		credential = creden;
		regionId = region;
	}
	
	private DefaultProfile(ICredentialProvider icredential) {
		this.icredential = icredential;
		this.iendpoints = new InternalEndpointsParser();
	}
	
	private DefaultProfile(String region, ICredentialProvider icredential) {
		regionId = region;
		this.icredential = icredential;
		this.iendpoints = new InternalEndpointsParser();
	}
	
	private DefaultProfile(ICredentialProvider icredential, String region, FormatType format) {
		regionId = region;
		acceptFormat = format;
		this.icredential = icredential;
		this.iendpoints = new InternalEndpointsParser();
	}
	
	public synchronized ISigner getSigner() {
		if (null == isigner)
			isigner = new ShaHmac1();
		return isigner;
	}

	public synchronized String getRegionId() {
		return regionId;
	}

	public synchronized FormatType getFormat() {
		return acceptFormat;
	}

	public synchronized Credential getCredential() {
		if (null == credential && null != icredential)
			credential = icredential.fresh();
		return credential;
	}

	public synchronized List<Endpoint> getEndpoints() throws ClientException {
		if (null == endpoints)
			endpoints = iendpoints.getEndpoints();
		return endpoints;
	}

	public synchronized static DefaultProfile getProfile() {
		if (null == profile)
			profile = new DefaultProfile();
		
		return profile;
	}
	
	public synchronized static DefaultProfile getProfile(String regionId, ICredentialProvider icredential) {
		profile = new DefaultProfile(regionId, icredential);
		return profile;
	}
	
	public synchronized static DefaultProfile getProfile(String regionId, String accessKeyId, String secret) {
		Credential creden = new Credential(accessKeyId, secret);
		profile = new DefaultProfile(regionId, creden);
		return profile;
	}

	public synchronized static void addEndpoint(String endpointName, String regionId, String product, String domain) throws ClientException {
		if(null == endpoints){
			endpoints = getProfile().getEndpoints();
		}
		Endpoint endpoint = findEndpointByRegionId(regionId);
		if(null == endpoint){
			addEndpoint_(endpointName, regionId, product, domain);
		} else {
			updateEndpoint(regionId, product, domain, endpoint); 
		}
	}

	private static void addEndpoint_(String endpointName, String regionId, String product, String domain) {
		Set<String> regions = new HashSet<String>();
		regions.add(regionId);
		
		List<ProductDomain> productDomains = new ArrayList<ProductDomain>();
		productDomains.add(new ProductDomain(product, domain));
		Endpoint endpoint = new Endpoint(endpointName, regions, productDomains);
		endpoints.add(endpoint);
	}

	private static void updateEndpoint(String regionId, String product, String domain, Endpoint endpoint) {
		Set<String> regionIds = endpoint.getRegionIds();
		regionIds.add(regionId);
		
		List<ProductDomain> productDomains = endpoint.getProductDomains();
		ProductDomain productDomain = findProductDomain(productDomains, product);
		if(null == productDomain){
			productDomains.add(new ProductDomain(product, domain));
		}
		else {
			productDomain.setDomianName(domain);
		}
	}
	
	private static Endpoint findEndpointByRegionId(String regionId) {
		for (Endpoint endpoint : endpoints) {
			if(endpoint.getRegionIds().contains(regionId)){
				return endpoint;
			}
		}
		return null;
	}
	
	private static ProductDomain findProductDomain(List<ProductDomain> productDomains, String product){
		for (ProductDomain productDomain : productDomains) {
			if(productDomain.getProductName().equals(product)){
				return productDomain;
			}
		}
		return null;
	}


}
