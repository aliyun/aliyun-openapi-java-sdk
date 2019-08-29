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

package com.aliyuncs.cbn.model.v20170912;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.cbn.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UntagResourcesRequest extends RpcAcsRequest<UntagResourcesResponse> {
	
	public UntagResourcesRequest() {
		super("Cbn", "2017-09-12", "UntagResources", "cbn");
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private Long resourceOwnerId;

	private List<String> resourceIds;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long tagOwnerUid;

	private String tagOwnerBid;

	private Long ownerId;

	private List<String> tagKeys;

	private String resourceType;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
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

	public Long getTagOwnerUid() {
		return this.tagOwnerUid;
	}

	public void setTagOwnerUid(Long tagOwnerUid) {
		this.tagOwnerUid = tagOwnerUid;
		if(tagOwnerUid != null){
			putQueryParameter("TagOwnerUid", tagOwnerUid.toString());
		}
	}

	public String getTagOwnerBid() {
		return this.tagOwnerBid;
	}

	public void setTagOwnerBid(String tagOwnerBid) {
		this.tagOwnerBid = tagOwnerBid;
		if(tagOwnerBid != null){
			putQueryParameter("TagOwnerBid", tagOwnerBid);
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

	public List<String> getTagKeys() {
		return this.tagKeys;
	}

	public void setTagKeys(List<String> tagKeys) {
		this.tagKeys = tagKeys;	
		if (tagKeys != null) {
			for (int i = 0; i < tagKeys.size(); i++) {
				putQueryParameter("TagKey." + (i + 1) , tagKeys.get(i));
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

	@Override
	public Class<UntagResourcesResponse> getResponseClass() {
		return UntagResourcesResponse.class;
	}

}
