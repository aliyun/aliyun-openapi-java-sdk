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
public class InnerCopyImageAtSameRegionRequest extends RpcAcsRequest<InnerCopyImageAtSameRegionResponse> {
	
	public InnerCopyImageAtSameRegionRequest() {
		super("EcsInc", "2016-03-14", "InnerCopyImageAtSameRegion", "ecs", "innerAPI");
	}

	private Long resourceOwnerId;

	private String imageId;

	private String resourceOwnerAccount;

	private String toImageName;

	private Long ownerId;

	private String toImageDesc;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getImageId() {
		return this.imageId;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
		if(imageId != null){
			putQueryParameter("ImageId", imageId);
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

	public String getToImageName() {
		return this.toImageName;
	}

	public void setToImageName(String toImageName) {
		this.toImageName = toImageName;
		if(toImageName != null){
			putQueryParameter("ToImageName", toImageName);
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

	public String getToImageDesc() {
		return this.toImageDesc;
	}

	public void setToImageDesc(String toImageDesc) {
		this.toImageDesc = toImageDesc;
		if(toImageDesc != null){
			putQueryParameter("ToImageDesc", toImageDesc);
		}
	}

	@Override
	public Class<InnerCopyImageAtSameRegionResponse> getResponseClass() {
		return InnerCopyImageAtSameRegionResponse.class;
	}

}
