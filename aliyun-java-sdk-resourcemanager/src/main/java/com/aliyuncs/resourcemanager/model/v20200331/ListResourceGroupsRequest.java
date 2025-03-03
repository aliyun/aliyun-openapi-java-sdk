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

package com.aliyuncs.resourcemanager.model.v20200331;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.resourcemanager.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListResourceGroupsRequest extends RpcAcsRequest<ListResourceGroupsResponse> {
	   

	private Integer pageNumber;

	private String resourceGroupId;

	private Integer pageSize;

	private List<Tag> tag;

	private List<String> resourceGroupIds;

	private Boolean includeTags;

	private String displayName;

	private String name;

	private String status;
	public ListResourceGroupsRequest() {
		super("ResourceManager", "2020-03-31", "ListResourceGroups", "resourcemanager");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
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

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
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

	public List<String> getResourceGroupIds() {
		return this.resourceGroupIds;
	}

	public void setResourceGroupIds(List<String> resourceGroupIds) {
		this.resourceGroupIds = resourceGroupIds;	
		if (resourceGroupIds != null) {
			for (int depth1 = 0; depth1 < resourceGroupIds.size(); depth1++) {
				putQueryParameter("ResourceGroupIds." + (depth1 + 1) , resourceGroupIds.get(depth1));
			}
		}	
	}

	public Boolean getIncludeTags() {
		return this.includeTags;
	}

	public void setIncludeTags(Boolean includeTags) {
		this.includeTags = includeTags;
		if(includeTags != null){
			putQueryParameter("IncludeTags", includeTags.toString());
		}
	}

	public String getDisplayName() {
		return this.displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
		if(displayName != null){
			putQueryParameter("DisplayName", displayName);
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

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status);
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
	public Class<ListResourceGroupsResponse> getResponseClass() {
		return ListResourceGroupsResponse.class;
	}

}
