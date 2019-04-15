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

package com.aliyuncs.ecsinc.model.v20160314;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DescribeResourcesBySystemTagRequest extends RpcAcsRequest<DescribeResourcesBySystemTagResponse> {
	
	public DescribeResourcesBySystemTagRequest() {
		super("EcsInc", "2016-03-14", "DescribeResourcesBySystemTag", "ecs", "innerAPI");
	}

	private Long resourceOwnerId;

	private String ownerBid;

	private Long ownerUid;

	private String tagValue;

	private String resourceOwnerAccount;

	private Long ownerId;

	private String resourceType;

	private String relatedKey;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getOwnerBid() {
		return this.ownerBid;
	}

	public void setOwnerBid(String ownerBid) {
		this.ownerBid = ownerBid;
		if(ownerBid != null){
			putQueryParameter("OwnerBid", ownerBid);
		}
	}

	public Long getOwnerUid() {
		return this.ownerUid;
	}

	public void setOwnerUid(Long ownerUid) {
		this.ownerUid = ownerUid;
		if(ownerUid != null){
			putQueryParameter("OwnerUid", ownerUid.toString());
		}
	}

	public String getTagValue() {
		return this.tagValue;
	}

	public void setTagValue(String tagValue) {
		this.tagValue = tagValue;
		if(tagValue != null){
			putQueryParameter("TagValue", tagValue);
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

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
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

	public String getRelatedKey() {
		return this.relatedKey;
	}

	public void setRelatedKey(String relatedKey) {
		this.relatedKey = relatedKey;
		if(relatedKey != null){
			putQueryParameter("RelatedKey", relatedKey);
		}
	}

	@Override
	public Class<DescribeResourcesBySystemTagResponse> getResponseClass() {
		return DescribeResourcesBySystemTagResponse.class;
	}

}
