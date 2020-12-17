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

package com.aliyuncs.ecs.model.v20140526;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListTagResourcesRequest extends RpcAcsRequest<ListTagResourcesResponse> {
	   

	private Long resourceOwnerId;

	private String nextToken;

	private List<Tag> tags;

	private List<String> resourceIds;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private List<TagFilter> tagFilters;

	private String resourceType;
	public ListTagResourcesRequest() {
		super("Ecs", "2014-05-26", "ListTagResources", "ecs");
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

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
		if(nextToken != null){
			putQueryParameter("NextToken", nextToken);
		}
	}

	public List<Tag> getTags() {
		return this.tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;	
		if (tags != null) {
			for (int depth1 = 0; depth1 < tags.size(); depth1++) {
				putQueryParameter("Tag." + (depth1 + 1) + ".Key" , tags.get(depth1).getKey());
				putQueryParameter("Tag." + (depth1 + 1) + ".Value" , tags.get(depth1).getValue());
			}
		}	
	}

	public List<String> getResourceIds() {
		return this.resourceIds;
	}

	public void setResourceIds(List<String> resourceIds) {
		this.resourceIds = resourceIds;	
		if (resourceIds != null) {
			for (int i = 0; i < resourceIds.size(); i++) {
				putQueryParameter("ResourceId." + (i + 1) , resourceIds.get(i));
			}
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

	public List<TagFilter> getTagFilters() {
		return this.tagFilters;
	}

	public void setTagFilters(List<TagFilter> tagFilters) {
		this.tagFilters = tagFilters;	
		if (tagFilters != null) {
			for (int depth1 = 0; depth1 < tagFilters.size(); depth1++) {
				putQueryParameter("TagFilter." + (depth1 + 1) + ".TagKey" , tagFilters.get(depth1).getTagKey());
				if (tagFilters.get(depth1).getTagValuess() != null) {
					for (int i = 0; i < tagFilters.get(depth1).getTagValuess().size(); i++) {
						putQueryParameter("TagFilter." + (depth1 + 1) + ".TagValues." + (i + 1) , tagFilters.get(depth1).getTagValuess().get(i));
					}
				}
			}
		}	
	}

	public String getResourceType() {
		return this.resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
		if(resourceType != null){
			putQueryParameter("ResourceType", resourceType);
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

	public static class TagFilter {

		private String tagKey;

		private List<String> tagValuess;

		public String getTagKey() {
			return this.tagKey;
		}

		public void setTagKey(String tagKey) {
			this.tagKey = tagKey;
		}

		public List<String> getTagValuess() {
			return this.tagValuess;
		}

		public void setTagValuess(List<String> tagValuess) {
			this.tagValuess = tagValuess;
		}
	}

	@Override
	public Class<ListTagResourcesResponse> getResponseClass() {
		return ListTagResourcesResponse.class;
	}

}
