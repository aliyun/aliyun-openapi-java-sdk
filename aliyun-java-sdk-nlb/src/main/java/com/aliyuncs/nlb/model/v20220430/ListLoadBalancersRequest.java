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

package com.aliyuncs.nlb.model.v20220430;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.nlb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListLoadBalancersRequest extends RpcAcsRequest<ListLoadBalancersResponse> {
	   

	private List<String> loadBalancerNamess;

	private List<String> loadBalancerIdss;

	private String addressIpVersion;

	private String resourceGroupId;

	private String nextToken;

	private String dNSName;

	private String addressType;

	private List<Tag> tag;

	private List<String> vpcIdss;

	private String loadBalancerBusinessStatus;

	private String loadBalancerStatus;

	private String loadBalancerType;

	private String zoneId;

	private Integer maxResults;

	private String ipv6AddressType;
	public ListLoadBalancersRequest() {
		super("Nlb", "2022-04-30", "ListLoadBalancers", "nlb");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getLoadBalancerNamess() {
		return this.loadBalancerNamess;
	}

	public void setLoadBalancerNamess(List<String> loadBalancerNamess) {
		this.loadBalancerNamess = loadBalancerNamess;	
		if (loadBalancerNamess != null) {
			for (int i = 0; i < loadBalancerNamess.size(); i++) {
				putQueryParameter("LoadBalancerNames." + (i + 1) , loadBalancerNamess.get(i));
			}
		}	
	}

	public List<String> getLoadBalancerIdss() {
		return this.loadBalancerIdss;
	}

	public void setLoadBalancerIdss(List<String> loadBalancerIdss) {
		this.loadBalancerIdss = loadBalancerIdss;	
		if (loadBalancerIdss != null) {
			for (int i = 0; i < loadBalancerIdss.size(); i++) {
				putQueryParameter("LoadBalancerIds." + (i + 1) , loadBalancerIdss.get(i));
			}
		}	
	}

	public String getAddressIpVersion() {
		return this.addressIpVersion;
	}

	public void setAddressIpVersion(String addressIpVersion) {
		this.addressIpVersion = addressIpVersion;
		if(addressIpVersion != null){
			putQueryParameter("AddressIpVersion", addressIpVersion);
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

	public String getDNSName() {
		return this.dNSName;
	}

	public void setDNSName(String dNSName) {
		this.dNSName = dNSName;
		if(dNSName != null){
			putQueryParameter("DNSName", dNSName);
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

	public List<Tag> getTag() {
		return this.tag;
	}

	public void setTag(List<Tag> tag) {
		this.tag = tag;	
		if (tag != null) {
			for (int depth1 = 0; depth1 < tag.size(); depth1++) {
				if (tag.get(depth1) != null) {
					
						putQueryParameter("Tag." + (depth1 + 1) + ".Key" , tag.get(depth1).getKey());
						putQueryParameter("Tag." + (depth1 + 1) + ".Value" , tag.get(depth1).getValue());
				}
			}
		}	
	}

	public List<String> getVpcIdss() {
		return this.vpcIdss;
	}

	public void setVpcIdss(List<String> vpcIdss) {
		this.vpcIdss = vpcIdss;	
		if (vpcIdss != null) {
			for (int i = 0; i < vpcIdss.size(); i++) {
				putQueryParameter("VpcIds." + (i + 1) , vpcIdss.get(i));
			}
		}	
	}

	public String getLoadBalancerBusinessStatus() {
		return this.loadBalancerBusinessStatus;
	}

	public void setLoadBalancerBusinessStatus(String loadBalancerBusinessStatus) {
		this.loadBalancerBusinessStatus = loadBalancerBusinessStatus;
		if(loadBalancerBusinessStatus != null){
			putQueryParameter("LoadBalancerBusinessStatus", loadBalancerBusinessStatus);
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

	public String getLoadBalancerType() {
		return this.loadBalancerType;
	}

	public void setLoadBalancerType(String loadBalancerType) {
		this.loadBalancerType = loadBalancerType;
		if(loadBalancerType != null){
			putQueryParameter("LoadBalancerType", loadBalancerType);
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

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
		if(maxResults != null){
			putQueryParameter("MaxResults", maxResults.toString());
		}
	}

	public String getIpv6AddressType() {
		return this.ipv6AddressType;
	}

	public void setIpv6AddressType(String ipv6AddressType) {
		this.ipv6AddressType = ipv6AddressType;
		if(ipv6AddressType != null){
			putQueryParameter("Ipv6AddressType", ipv6AddressType);
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
