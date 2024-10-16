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
public class ListServerGroupsRequest extends RpcAcsRequest<ListServerGroupsResponse> {
	   

	private List<String> serverGroupNames;

	private Integer skip;

	private String resourceGroupId;

	private String nextToken;

	private List<Tag> tag;

	private List<String> serverGroupIds;

	private String serverGroupType;

	private String vpcId;

	private Integer maxResults;
	public ListServerGroupsRequest() {
		super("Gwlb", "2024-04-15", "ListServerGroups");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public List<String> getServerGroupNames() {
		return this.serverGroupNames;
	}

	public void setServerGroupNames(List<String> serverGroupNames) {
		this.serverGroupNames = serverGroupNames;	
		if (serverGroupNames != null) {
			for (int depth1 = 0; depth1 < serverGroupNames.size(); depth1++) {
				putBodyParameter("ServerGroupNames." + (depth1 + 1) , serverGroupNames.get(depth1));
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

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if(resourceGroupId != null){
			putBodyParameter("ResourceGroupId", resourceGroupId);
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

	public List<String> getServerGroupIds() {
		return this.serverGroupIds;
	}

	public void setServerGroupIds(List<String> serverGroupIds) {
		this.serverGroupIds = serverGroupIds;	
		if (serverGroupIds != null) {
			for (int depth1 = 0; depth1 < serverGroupIds.size(); depth1++) {
				putBodyParameter("ServerGroupIds." + (depth1 + 1) , serverGroupIds.get(depth1));
			}
		}	
	}

	public String getServerGroupType() {
		return this.serverGroupType;
	}

	public void setServerGroupType(String serverGroupType) {
		this.serverGroupType = serverGroupType;
		if(serverGroupType != null){
			putBodyParameter("ServerGroupType", serverGroupType);
		}
	}

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
		if(vpcId != null){
			putBodyParameter("VpcId", vpcId);
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
	public Class<ListServerGroupsResponse> getResponseClass() {
		return ListServerGroupsResponse.class;
	}

}
