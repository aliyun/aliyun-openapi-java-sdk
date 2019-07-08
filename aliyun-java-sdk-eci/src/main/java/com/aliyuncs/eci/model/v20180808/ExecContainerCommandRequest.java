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

package com.aliyuncs.eci.model.v20180808;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ExecContainerCommandRequest extends RpcAcsRequest<ExecContainerCommandResponse> {
	
	public ExecContainerCommandRequest() {
		super("Eci", "2018-08-08", "ExecContainerCommand", "eci");
	}

	private Long resourceOwnerId;

	private String containerName;

	private String containerGroupId;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private String command;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getContainerName() {
		return this.containerName;
	}

	public void setContainerName(String containerName) {
		this.containerName = containerName;
		if(containerName != null){
			putQueryParameter("ContainerName", containerName);
		}
	}

	public String getContainerGroupId() {
		return this.containerGroupId;
	}

	public void setContainerGroupId(String containerGroupId) {
		this.containerGroupId = containerGroupId;
		if(containerGroupId != null){
			putQueryParameter("ContainerGroupId", containerGroupId);
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

	public String getCommand() {
		return this.command;
	}

	public void setCommand(String command) {
		this.command = command;
		if(command != null){
			putQueryParameter("Command", command);
		}
	}

	@Override
	public Class<ExecContainerCommandResponse> getResponseClass() {
		return ExecContainerCommandResponse.class;
	}

}
