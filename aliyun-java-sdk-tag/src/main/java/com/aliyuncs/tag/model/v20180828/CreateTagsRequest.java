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

package com.aliyuncs.tag.model.v20180828;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.tag.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateTagsRequest extends RpcAcsRequest<CreateTagsResponse> {
	   

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private List<TagKeyValueParamList> tagKeyValueParamLists;
	public CreateTagsRequest() {
		super("Tag", "2018-08-28", "CreateTags", "tag");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public List<TagKeyValueParamList> getTagKeyValueParamLists() {
		return this.tagKeyValueParamLists;
	}

	public void setTagKeyValueParamLists(List<TagKeyValueParamList> tagKeyValueParamLists) {
		this.tagKeyValueParamLists = tagKeyValueParamLists;	
		if (tagKeyValueParamLists != null) {
			for (int depth1 = 0; depth1 < tagKeyValueParamLists.size(); depth1++) {
				putQueryParameter("TagKeyValueParamList." + (depth1 + 1) + ".Key" , tagKeyValueParamLists.get(depth1).getKey());
				if (tagKeyValueParamLists.get(depth1).getTagValueParamLists() != null) {
					for (int depth2 = 0; depth2 < tagKeyValueParamLists.get(depth1).getTagValueParamLists().size(); depth2++) {
						putQueryParameter("TagKeyValueParamList." + (depth1 + 1) + ".TagValueParamList." + (depth2 + 1) + ".Value" , tagKeyValueParamLists.get(depth1).getTagValueParamLists().get(depth2).getValue());
						putQueryParameter("TagKeyValueParamList." + (depth1 + 1) + ".TagValueParamList." + (depth2 + 1) + ".Description" , tagKeyValueParamLists.get(depth1).getTagValueParamLists().get(depth2).getDescription());
					}
				}
				putQueryParameter("TagKeyValueParamList." + (depth1 + 1) + ".Description" , tagKeyValueParamLists.get(depth1).getDescription());
			}
		}	
	}

	public static class TagKeyValueParamList {

		private String key;

		private List<TagValueParamList> tagValueParamLists;

		private String description;

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public List<TagValueParamList> getTagValueParamLists() {
			return this.tagValueParamLists;
		}

		public void setTagValueParamLists(List<TagValueParamList> tagValueParamLists) {
			this.tagValueParamLists = tagValueParamLists;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public static class TagValueParamList {

			private String value;

			private String description;

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}
		}
	}

	@Override
	public Class<CreateTagsResponse> getResponseClass() {
		return CreateTagsResponse.class;
	}

}
