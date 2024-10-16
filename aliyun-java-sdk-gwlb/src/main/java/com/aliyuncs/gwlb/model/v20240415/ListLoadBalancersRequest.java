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

package com.aliyuncs.gwlb.model.v20240415;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListLoadBalancersRequest extends RpcAcsRequest<ListLoadBalancersResponse> {
	   

	private List<String> loadBalancerNames;

	private List<String> loadBalancerIds;

	private Integer skip;

	private String addressIpVersion;

	private String resourceGroupId;

	private List<String> zoneIds;

	private String nextToken;

	private List<String> vpcIds;

	private List<Tag> tag;

	private String loadBalancerBusinessStatus;

	private String loadBalancerStatus;

	private Integer maxResults;
	public ListLoadBalancersRequest() {
		super("Gwlb", "2024-04-15", "ListLoadBalancers");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public List<String> getLoadBalancerNames() {
		return this.loadBalancerNames;
	}

	public void setLoadBalancerNames(List<String> loadBalancerNames) {
		this.loadBalancerNames = loadBalancerNames;	
		if (loadBalancerNames != null) {
			for (int depth1 = 0; depth1 < loadBalancerNames.size(); depth1++) {
				putBodyParameter("LoadBalancerNames." + (depth1 + 1) , loadBalancerNames.get(depth1));
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
				putBodyParameter("LoadBalancerIds." + (depth1 + 1) , loadBalancerIds.get(depth1));
			}
		}	
	}

	public Integer getSkip() {
		return this.skip;
	}

	public void setSkip(Integer skip) {
		this.skip = skip;
		if(skip != null){
			putBodyParameter("Skip", skip.toString());
		}
	}

	public String getAddressIpVersion() {
		return this.addressIpVersion;
	}

	public void setAddressIpVersion(String addressIpVersion) {
		this.addressIpVersion = addressIpVersion;
		if(addressIpVersion != null){
			putBodyParameter("AddressIpVersion", addressIpVersion);
		}
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if(resourceGroupId != null){
			putBodyParameter("ResourceGroupId", resourceGroupId);
		}
	}

	public List<String> getZoneIds() {
		return this.zoneIds;
	}

	public void setZoneIds(List<String> zoneIds) {
		this.zoneIds = zoneIds;	
		if (zoneIds != null) {
			for (int depth1 = 0; depth1 < zoneIds.size(); depth1++) {
				putBodyParameter("ZoneIds." + (depth1 + 1) , zoneIds.get(depth1));
			}
		}	
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
		if(nextToken != null){
			putBodyParameter("NextToken", nextToken);
		}
	}

	public List<String> getVpcIds() {
		return this.vpcIds;
	}

	public void setVpcIds(List<String> vpcIds) {
		this.vpcIds = vpcIds;	
		if (vpcIds != null) {
			for (int depth1 = 0; depth1 < vpcIds.size(); depth1++) {
				putBodyParameter("VpcIds." + (depth1 + 1) , vpcIds.get(depth1));
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
					
						putBodyParameter("Tag." + (depth1 + 1) + ".Key" , tag.get(depth1).getKey());
						putBodyParameter("Tag." + (depth1 + 1) + ".Value" , tag.get(depth1).getValue());
				}
			}
		}	
	}

	public String getLoadBalancerBusinessStatus() {
		return this.loadBalancerBusinessStatus;
	}

	public void setLoadBalancerBusinessStatus(String loadBalancerBusinessStatus) {
		this.loadBalancerBusinessStatus = loadBalancerBusinessStatus;
		if(loadBalancerBusinessStatus != null){
			putBodyParameter("LoadBalancerBusinessStatus", loadBalancerBusinessStatus);
		}
	}

	public String getLoadBalancerStatus() {
		return this.loadBalancerStatus;
	}

	public void setLoadBalancerStatus(String loadBalancerStatus) {
		this.loadBalancerStatus = loadBalancerStatus;
		if(loadBalancerStatus != null){
			putBodyParameter("LoadBalancerStatus", loadBalancerStatus);
		}
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
		if(maxResults != null){
			putBodyParameter("MaxResults", maxResults.toString());
		}
	}

	public static class Tag {

		private String key;

		private String value;

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}
	}

	@Override
	public Class<ListLoadBalancersResponse> getResponseClass() {
		return ListLoadBalancersResponse.class;
	}

}
