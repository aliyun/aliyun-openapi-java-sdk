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
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class StartTerminalSessionRequest extends RpcAcsRequest<StartTerminalSessionResponse> {
	   

	private Long resourceOwnerId;

	private String commandLine;

	@SerializedName("encryptionOptions")
	private EncryptionOptions encryptionOptions;

	private String targetServer;

	private String connectionType;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private List<String> instanceIds;

	private Integer portNumber;

	private String passwordName;

	private String username;
	public StartTerminalSessionRequest() {
		super("Ecs", "2014-05-26", "StartTerminalSession", "ecs");
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

	public String getCommandLine() {
		return this.commandLine;
	}

	public void setCommandLine(String commandLine) {
		this.commandLine = commandLine;
		if(commandLine != null){
			putQueryParameter("CommandLine", commandLine);
		}
	}

	public EncryptionOptions getEncryptionOptions() {
		return this.encryptionOptions;
	}

	public void setEncryptionOptions(EncryptionOptions encryptionOptions) {
		this.encryptionOptions = encryptionOptions;	
		if (encryptionOptions != null) {
			putQueryParameter("EncryptionOptions" , new Gson().toJson(encryptionOptions));
		}	
	}

	public String getTargetServer() {
		return this.targetServer;
	}

	public void setTargetServer(String targetServer) {
		this.targetServer = targetServer;
		if(targetServer != null){
			putQueryParameter("TargetServer", targetServer);
		}
	}

	public String getConnectionType() {
		return this.connectionType;
	}

	public void setConnectionType(String connectionType) {
		this.connectionType = connectionType;
		if(connectionType != null){
			putQueryParameter("ConnectionType", connectionType);
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

	public List<String> getInstanceIds() {
		return this.instanceIds;
	}

	public void setInstanceIds(List<String> instanceIds) {
		this.instanceIds = instanceIds;	
		if (instanceIds != null) {
			for (int i = 0; i < instanceIds.size(); i++) {
				putQueryParameter("InstanceId." + (i + 1) , instanceIds.get(i));
			}
		}	
	}

	public Integer getPortNumber() {
		return this.portNumber;
	}

	public void setPortNumber(Integer portNumber) {
		this.portNumber = portNumber;
		if(portNumber != null){
			putQueryParameter("PortNumber", portNumber.toString());
		}
	}

	public String getPasswordName() {
		return this.passwordName;
	}

	public void setPasswordName(String passwordName) {
		this.passwordName = passwordName;
		if(passwordName != null){
			putQueryParameter("PasswordName", passwordName);
		}
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
		if(username != null){
			putQueryParameter("Username", username);
		}
	}

	public static class EncryptionOptions {

		@SerializedName("Enabled")
		private Boolean enabled;

		@SerializedName("KMSKeyId")
		private String kMSKeyId;

		@SerializedName("Mode")
		private String mode;

		public Boolean getEnabled() {
			return this.enabled;
		}

		public void setEnabled(Boolean enabled) {
			this.enabled = enabled;
		}

		public String getKMSKeyId() {
			return this.kMSKeyId;
		}

		public void setKMSKeyId(String kMSKeyId) {
			this.kMSKeyId = kMSKeyId;
		}

		public String getMode() {
			return this.mode;
		}

		public void setMode(String mode) {
			this.mode = mode;
		}
	}

	@Override
	public Class<StartTerminalSessionResponse> getResponseClass() {
		return StartTerminalSessionResponse.class;
	}

}
