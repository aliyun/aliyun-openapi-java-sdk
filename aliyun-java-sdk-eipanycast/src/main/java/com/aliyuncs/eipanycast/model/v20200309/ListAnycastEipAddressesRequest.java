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

package com.aliyuncs.eipanycast.model.v20200309;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.eipanycast.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListAnycastEipAddressesRequest extends RpcAcsRequest<ListAnycastEipAddressesResponse> {
	   

	private String businessStatus;

	private String serviceLocation;

	private String anycastEipAddress;

	private String nextToken;

	private String internetChargeType;

	private String anycastId;

	private String name;

	private List<String> bindInstanceIdss;

	private Integer maxResults;

	private String instanceChargeType;

	private String status;
	public ListAnycastEipAddressesRequest() {
		super("Eipanycast", "2020-03-09", "ListAnycastEipAddresses", "eipanycast");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getBusinessStatus() {
		return this.businessStatus;
	}

	public void setBusinessStatus(String businessStatus) {
		this.businessStatus = businessStatus;
		if(businessStatus != null){
			putQueryParameter("BusinessStatus", businessStatus);
		}
	}

	public String getServiceLocation() {
		return this.serviceLocation;
	}

	public void setServiceLocation(String serviceLocation) {
		this.serviceLocation = serviceLocation;
		if(serviceLocation != null){
			putQueryParameter("ServiceLocation", serviceLocation);
		}
	}

	public String getAnycastEipAddress() {
		return this.anycastEipAddress;
	}

	public void setAnycastEipAddress(String anycastEipAddress) {
		this.anycastEipAddress = anycastEipAddress;
		if(anycastEipAddress != null){
			putQueryParameter("AnycastEipAddress", anycastEipAddress);
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

	public String getInternetChargeType() {
		return this.internetChargeType;
	}

	public void setInternetChargeType(String internetChargeType) {
		this.internetChargeType = internetChargeType;
		if(internetChargeType != null){
			putQueryParameter("InternetChargeType", internetChargeType);
		}
	}

	public String getAnycastId() {
		return this.anycastId;
	}

	public void setAnycastId(String anycastId) {
		this.anycastId = anycastId;
		if(anycastId != null){
			putQueryParameter("AnycastId", anycastId);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public List<String> getBindInstanceIdss() {
		return this.bindInstanceIdss;
	}

	public void setBindInstanceIdss(List<String> bindInstanceIdss) {
		this.bindInstanceIdss = bindInstanceIdss;	
		if (bindInstanceIdss != null) {
			for (int i = 0; i < bindInstanceIdss.size(); i++) {
				putQueryParameter("BindInstanceIds." + (i + 1) , bindInstanceIdss.get(i));
			}
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

	public String getInstanceChargeType() {
		return this.instanceChargeType;
	}

	public void setInstanceChargeType(String instanceChargeType) {
		this.instanceChargeType = instanceChargeType;
		if(instanceChargeType != null){
			putQueryParameter("InstanceChargeType", instanceChargeType);
		}
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status);
		}
	}

	@Override
	public Class<ListAnycastEipAddressesResponse> getResponseClass() {
		return ListAnycastEipAddressesResponse.class;
	}

}
