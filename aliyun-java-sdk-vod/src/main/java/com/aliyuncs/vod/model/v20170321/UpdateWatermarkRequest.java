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
public class UpdateWatermarkRequest extends RpcAcsRequest<UpdateWatermarkResponse> {
	
	public UpdateWatermarkRequest() {
		super("vod", "2017-03-21", "UpdateWatermark");
	}

	private String watermarkId;

	private Long resourceOwnerId;

	private String resourceOwnerAccount;

	private String name;

	private Long ownerId;

	private String watermarkConfig;

	public String getWatermarkId() {
		return this.watermarkId;
	}

	public void setWatermarkId(String watermarkId) {
		this.watermarkId = watermarkId;
		if(watermarkId != null){
			putQueryParameter("WatermarkId", watermarkId);
		}
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

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
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

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getWatermarkConfig() {
		return this.watermarkConfig;
	}

	public void setWatermarkConfig(String watermarkConfig) {
		this.watermarkConfig = watermarkConfig;
		if(watermarkConfig != null){
			putQueryParameter("WatermarkConfig", watermarkConfig);
		}
	}

	@Override
	public Class<UpdateWatermarkResponse> getResponseClass() {
		return UpdateWatermarkResponse.class;
	}

}
