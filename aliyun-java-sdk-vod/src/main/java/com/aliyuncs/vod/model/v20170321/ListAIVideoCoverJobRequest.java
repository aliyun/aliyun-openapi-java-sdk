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

package com.aliyuncs.vod.model.v20170321;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ListAIVideoCoverJobRequest extends RpcAcsRequest<ListAIVideoCoverJobResponse> {
	
	public ListAIVideoCoverJobRequest() {
		super("vod", "2017-03-21", "ListAIVideoCoverJob", "vod");
	}

	private String resourceOwnerId;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private String aIVideoCoverJobIds;

	private String ownerId;

	public String getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(String resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId);
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

	public String getAIVideoCoverJobIds() {
		return this.aIVideoCoverJobIds;
	}

	public void setAIVideoCoverJobIds(String aIVideoCoverJobIds) {
		this.aIVideoCoverJobIds = aIVideoCoverJobIds;
		if(aIVideoCoverJobIds != null){
			putQueryParameter("AIVideoCoverJobIds", aIVideoCoverJobIds);
		}
	}

	public String getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId);
		}
	}

	@Override
	public Class<ListAIVideoCoverJobResponse> getResponseClass() {
		return ListAIVideoCoverJobResponse.class;
	}

}
