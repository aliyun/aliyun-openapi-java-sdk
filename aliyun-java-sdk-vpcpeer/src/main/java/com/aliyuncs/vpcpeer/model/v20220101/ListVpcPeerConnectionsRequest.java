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

package com.aliyuncs.vpcpeer.model.v20220101;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vpcpeer.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListVpcPeerConnectionsRequest extends RpcAcsRequest<ListVpcPeerConnectionsResponse> {
	   

	private String resourceGroupId;

	private String nextToken;

	private List<Tags> tagss;

	private String instanceId;

	private List<String> vpcId;

	private String name;

	private Integer maxResults;
	public ListVpcPeerConnectionsRequest() {
		super("VpcPeer", "2022-01-01", "ListVpcPeerConnections", "vpcpeer");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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
			putBodyParameter("NextToken", nextToken);
		}
	}

	public List<Tags> getTagss() {
		return this.tagss;
	}

	public void setTagss(List<Tags> tagss) {
		this.tagss = tagss;	
		if (tagss != null) {
			for (int depth1 = 0; depth1 < tagss.size(); depth1++) {
				putQueryParameter("Tags." + (depth1 + 1) + ".Key" , tagss.get(depth1).getKey());
				putQueryParameter("Tags." + (depth1 + 1) + ".Value" , tagss.get(depth1).getValue());
			}
		}	
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putBodyParameter("InstanceId", instanceId);
		}
	}

	public List<String> getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(List<String> vpcId) {
		this.vpcId = vpcId;	
		if (vpcId != null) {
			String vpcIdArrVal = "";
			for(int depth1 = 0; depth1 < vpcId.size(); depth1++) {
				vpcIdArrVal += vpcId.get(depth1) + ",";
			}
			if (vpcIdArrVal.length() > 0) {
				vpcIdArrVal = vpcIdArrVal.substring(0, vpcIdArrVal.length() - 1);
			}
			putBodyParameter("VpcId" , vpcIdArrVal);
		}	
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putBodyParameter("Name", name);
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

	public static class Tags {

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
	public Class<ListVpcPeerConnectionsResponse> getResponseClass() {
		return ListVpcPeerConnectionsResponse.class;
	}

}
