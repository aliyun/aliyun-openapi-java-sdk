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

/**
 * @author auto create
 * @version 
 */
public class ModifyDeploymentSetAttributeRequest extends RpcAcsRequest<ModifyDeploymentSetAttributeResponse> {
	
	public ModifyDeploymentSetAttributeRequest() {
		super("Ecs", "2014-05-26", "ModifyDeploymentSetAttribute", "ecs");
	}

	private String deploymentSetId;

	private Long resourceOwnerId;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private String description;

	private String deploymentSetName;

	private Long ownerId;

	public String getDeploymentSetId() {
		return this.deploymentSetId;
	}

	public void setDeploymentSetId(String deploymentSetId) {
		this.deploymentSetId = deploymentSetId;
		if(deploymentSetId != null){
			putQueryParameter("DeploymentSetId", deploymentSetId);
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

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getDeploymentSetName() {
		return this.deploymentSetName;
	}

	public void setDeploymentSetName(String deploymentSetName) {
		this.deploymentSetName = deploymentSetName;
		if(deploymentSetName != null){
			putQueryParameter("DeploymentSetName", deploymentSetName);
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

	@Override
	public Class<ModifyDeploymentSetAttributeResponse> getResponseClass() {
		return ModifyDeploymentSetAttributeResponse.class;
	}

}
