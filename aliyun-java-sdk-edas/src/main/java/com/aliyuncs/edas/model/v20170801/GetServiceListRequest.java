/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.edas.model.v20170801;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.edas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetServiceListRequest extends RoaAcsRequest<GetServiceListResponse> {
	   

	private String serviceType;

	private String side;

	private String origin;

	private String searchType;

	private String namespace;

	private String region;

	private String searchValue;
	public GetServiceListRequest() {
		super("Edas", "2017-08-01", "GetServiceList", "edas");
		setUriPattern("/pop/sp/api/mseForOam/getServiceList");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getServiceType() {
		return this.serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
		if(serviceType != null){
			putQueryParameter("serviceType", serviceType);
		}
	}

	public String getSide() {
		return this.side;
	}

	public void setSide(String side) {
		this.side = side;
		if(side != null){
			putQueryParameter("side", side);
		}
	}

	public String getOrigin() {
		return this.origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
		if(origin != null){
			putQueryParameter("origin", origin);
		}
	}

	public String getSearchType() {
		return this.searchType;
	}

	public void setSearchType(String searchType) {
		this.searchType = searchType;
		if(searchType != null){
			putQueryParameter("searchType", searchType);
		}
	}

	public String getNamespace() {
		return this.namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
		if(namespace != null){
			putQueryParameter("namespace", namespace);
		}
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
		if(region != null){
			putQueryParameter("region", region);
		}
	}

	public String getSearchValue() {
		return this.searchValue;
	}

	public void setSearchValue(String searchValue) {
		this.searchValue = searchValue;
		if(searchValue != null){
			putQueryParameter("searchValue", searchValue);
		}
	}

	@Override
	public Class<GetServiceListResponse> getResponseClass() {
		return GetServiceListResponse.class;
	}

}
