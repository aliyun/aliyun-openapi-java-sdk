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
import java.util.Map;
import com.google.gson.Gson;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class InvokeCommandRequest extends RpcAcsRequest<InvokeCommandResponse> {
	   

	private Long resourceOwnerId;

	private String commandId;

	private String frequency;

	private String resourceGroupId;

	private String repeatMode;

	private List<Tag> tags;

	private Boolean timed;

	private Long ownerId;

	private List<String> instanceIds;

	private String containerId;

	private Map<Object,Object> parameters;

	private String launcher;

	private String containerName;

	private String clientToken;

	private Long timeout;

	private String windowsPasswordName;

	private List<ResourceTag> resourceTags;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private String terminationMode;

	private String username;
	public InvokeCommandRequest() {
		super("Ecs", "2014-05-26", "InvokeCommand", "ecs");
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

	public String getCommandId() {
		return this.commandId;
	}

	public void setCommandId(String commandId) {
		this.commandId = commandId;
		if(commandId != null){
			putQueryParameter("CommandId", commandId);
		}
	}

	public String getFrequency() {
		return this.frequency;
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
		if(frequency != null){
			putQueryParameter("Frequency", frequency);
		}
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if(resourceGroupId != null){
			putQueryParameter("ResourceGroupId", resourceGroupId);
		}
	}

	public String getRepeatMode() {
		return this.repeatMode;
	}

	public void setRepeatMode(String repeatMode) {
		this.repeatMode = repeatMode;
		if(repeatMode != null){
			putQueryParameter("RepeatMode", repeatMode);
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

	public Boolean getTimed() {
		return this.timed;
	}

	public void setTimed(Boolean timed) {
		this.timed = timed;
		if(timed != null){
			putQueryParameter("Timed", timed.toString());
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

	public String getContainerId() {
		return this.containerId;
	}

	public void setContainerId(String containerId) {
		this.containerId = containerId;
		if(containerId != null){
			putQueryParameter("ContainerId", containerId);
		}
	}

	public Map<Object,Object> getParameters() {
		return this.parameters;
	}

	public void setParameters(Map<Object,Object> parameters) {
		this.parameters = parameters;
		if(parameters != null){
			putQueryParameter("Parameters", new Gson().toJson(parameters));
		}
	}

	public String getLauncher() {
		return this.launcher;
	}

	public void setLauncher(String launcher) {
		this.launcher = launcher;
		if(launcher != null){
			putQueryParameter("Launcher", launcher);
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

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public Long getTimeout() {
		return this.timeout;
	}

	public void setTimeout(Long timeout) {
		this.timeout = timeout;
		if(timeout != null){
			putQueryParameter("Timeout", timeout.toString());
		}
	}

	public String getWindowsPasswordName() {
		return this.windowsPasswordName;
	}

	public void setWindowsPasswordName(String windowsPasswordName) {
		this.windowsPasswordName = windowsPasswordName;
		if(windowsPasswordName != null){
			putQueryParameter("WindowsPasswordName", windowsPasswordName);
		}
	}

	public List<ResourceTag> getResourceTags() {
		return this.resourceTags;
	}

	public void setResourceTags(List<ResourceTag> resourceTags) {
		this.resourceTags = resourceTags;	
		if (resourceTags != null) {
			for (int depth1 = 0; depth1 < resourceTags.size(); depth1++) {
				putQueryParameter("ResourceTag." + (depth1 + 1) + ".Key" , resourceTags.get(depth1).getKey());
				putQueryParameter("ResourceTag." + (depth1 + 1) + ".Value" , resourceTags.get(depth1).getValue());
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

	public String getTerminationMode() {
		return this.terminationMode;
	}

	public void setTerminationMode(String terminationMode) {
		this.terminationMode = terminationMode;
		if(terminationMode != null){
			putQueryParameter("TerminationMode", terminationMode);
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

	public static class ResourceTag {

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

	@Override
	public Class<InvokeCommandResponse> getResponseClass() {
		return InvokeCommandResponse.class;
	}

}
