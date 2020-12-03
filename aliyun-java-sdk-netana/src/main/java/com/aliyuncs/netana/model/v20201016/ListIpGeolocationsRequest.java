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

package com.aliyuncs.netana.model.v20201016;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.netana.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListIpGeolocationsRequest extends RpcAcsRequest<ListIpGeolocationsResponse> {
	   

	private Long resourceOwnerId;

	private String ipv4Prefix;

	private String countryCode;

	private String cityCode;

	private String nextToken;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private String resourcePoolName;

	private Integer maxResults;
	public ListIpGeolocationsRequest() {
		super("Netana", "2020-10-16", "ListIpGeolocations", "netana");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getIpv4Prefix() {
		return this.ipv4Prefix;
	}

	public void setIpv4Prefix(String ipv4Prefix) {
		this.ipv4Prefix = ipv4Prefix;
		if(ipv4Prefix != null){
			putQueryParameter("Ipv4Prefix", ipv4Prefix);
		}
	}

	public String getCountryCode() {
		return this.countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
		if(countryCode != null){
			putQueryParameter("CountryCode", countryCode);
		}
	}

	public String getCityCode() {
		return this.cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
		if(cityCode != null){
			putQueryParameter("CityCode", cityCode);
		}
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
		if(nextToken != null){
			putQueryParameter("NextToken", nextToken);
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getResourcePoolName() {
		return this.resourcePoolName;
	}

	public void setResourcePoolName(String resourcePoolName) {
		this.resourcePoolName = resourcePoolName;
		if(resourcePoolName != null){
			putQueryParameter("ResourcePoolName", resourcePoolName);
		}
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
		if(maxResults != null){
			putQueryParameter("MaxResults", maxResults.toString());
		}
	}

	@Override
	public Class<ListIpGeolocationsResponse> getResponseClass() {
		return ListIpGeolocationsResponse.class;
	}

}
