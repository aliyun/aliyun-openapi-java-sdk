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

package com.aliyuncs.alb.model.v20200616;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.alb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListLoadBalancersRequest extends RpcAcsRequest<ListLoadBalancersResponse> {
	   

	private List<String> loadBalancerNames;

	private List<String> loadBalancerIds;

	private String resourceGroupId;

	private String nextToken;

	private String loadBalancerBussinessStatus;

	private String addressType;

	private List<String> vpcIds;

	private List<Tag> tag;

	private String loadBalancerStatus;

	private Integer maxResults;

	private String zoneId;

	private String payType;
	public ListLoadBalancersRequest() {
		super("Alb", "2020-06-16", "ListLoadBalancers", "alb");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getLoadBalancerNames() {
		return this.loadBalancerNames;
	}

	public void setLoadBalancerNames(List<String> loadBalancerNames) {
		this.loadBalancerNames = loadBalancerNames;	
		if (loadBalancerNames != null) {
			for (int depth1 = 0; depth1 < loadBalancerNames.size(); depth1++) {
				putQueryParameter("LoadBalancerNames." + (depth1 + 1) , loadBalancerNames.get(depth1));
			}
		}	
	}

	public List<String> getLoadBalancerIds() {
		return this.loadBalancerIds;
	}

	public void setLoadBalancerIds(List<String> loadBalancerIds) {
		this.loadBalancerIds = loadBalancerIds;	
		if (loadBalancerIds != null) {
			for (int depth1 = 0; depth1 < loadBalancerIds.size(); depth1++) {
				putQueryParameter("LoadBalancerIds." + (depth1 + 1) , loadBalancerIds.get(depth1));
			}
		}	
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if(resourceGroupId != null){
			putQueryParameter("ResourceGroupId", resourceGroupId);
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

	public String getLoadBalancerBussinessStatus() {
		return this.loadBalancerBussinessStatus;
	}

	public void setLoadBalancerBussinessStatus(String loadBalancerBussinessStatus) {
		this.loadBalancerBussinessStatus = loadBalancerBussinessStatus;
		if(loadBalancerBussinessStatus != null){
			putQueryParameter("LoadBalancerBussinessStatus", loadBalancerBussinessStatus);
		}
	}

	public String getAddressType() {
		return this.addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
		if(addressType != null){
			putQueryParameter("AddressType", addressType);
		}
	}

	public List<String> getVpcIds() {
		return this.vpcIds;
	}

	public void setVpcIds(List<String> vpcIds) {
		this.vpcIds = vpcIds;	
		if (vpcIds != null) {
			for (int depth1 = 0; depth1 < vpcIds.size(); depth1++) {
				putQueryParameter("VpcIds." + (depth1 + 1) , vpcIds.get(depth1));
			}
		}	
	}

	public List<Tag> getTag() {
		return this.tag;
	}

	public void setTag(List<Tag> tag) {
		this.tag = tag;	
		if (tag != null) {
			for (int depth1 = 0; depth1 < tag.size(); depth1++) {
				if (tag.get(depth1) != null) {
					
						putQueryParameter("Tag." + (depth1 + 1) + ".Value" , tag.get(depth1).getValue());
						putQueryParameter("Tag." + (depth1 + 1) + ".Key" , tag.get(depth1).getKey());
				}
			}
		}	
	}

	public String getLoadBalancerStatus() {
		return this.loadBalancerStatus;
	}

	public void setLoadBalancerStatus(String loadBalancerStatus) {
		this.loadBalancerStatus = loadBalancerStatus;
		if(loadBalancerStatus != null){
			putQueryParameter("LoadBalancerStatus", loadBalancerStatus);
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

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
		if(zoneId != null){
			putQueryParameter("ZoneId", zoneId);
		}
	}

	public String getPayType() {
		return this.payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
		if(payType != null){
			putQueryParameter("PayType", payType);
		}
	}

	public static class Tag {

		private String value;

		private String key;

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}
	}

	@Override
	public Class<ListLoadBalancersResponse> getResponseClass() {
		return ListLoadBalancersResponse.class;
	}

}
