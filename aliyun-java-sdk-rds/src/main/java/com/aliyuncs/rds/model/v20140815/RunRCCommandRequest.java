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

package com.aliyuncs.rds.model.v20140815;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import java.util.Map;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.rds.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class RunRCCommandRequest extends RpcAcsRequest<RunRCCommandResponse> {
	   

	@SerializedName("resourceTags")
	private List<ResourceTags> resourceTags;

	private String containerName;

	private String clientToken;

	private String workingDir;

	private String description;

	private String type;

	private String commandContent;

	private Long timeout;

	private String frequency;

	private String resourceGroupId;

	private String contentEncoding;

	private String repeatMode;

	private String windowsPasswordName;

	private Boolean keepCommand;

	@SerializedName("tags")
	private List<Tags> tags;

	private String terminationMode;

	@SerializedName("instanceIds")
	private List<String> instanceIds;

	private String name;

	private String containerId;

	@SerializedName("parameters")
	private Map<String,String> parameters;

	private Boolean enableParameter;

	private String username;

	private String launcher;
	public RunRCCommandRequest() {
		super("Rds", "2014-08-15", "RunRCCommand", "rds");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<ResourceTags> getResourceTags() {
		return this.resourceTags;
	}

	public void setResourceTags(List<ResourceTags> resourceTags) {
		this.resourceTags = resourceTags;	
		if (resourceTags != null) {
			putQueryParameter("ResourceTags" , new Gson().toJson(resourceTags));
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

	public String getWorkingDir() {
		return this.workingDir;
	}

	public void setWorkingDir(String workingDir) {
		this.workingDir = workingDir;
		if(workingDir != null){
			putQueryParameter("WorkingDir", workingDir);
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

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type);
		}
	}

	public String getCommandContent() {
		return this.commandContent;
	}

	public void setCommandContent(String commandContent) {
		this.commandContent = commandContent;
		if(commandContent != null){
			putQueryParameter("CommandContent", commandContent);
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

	public String getContentEncoding() {
		return this.contentEncoding;
	}

	public void setContentEncoding(String contentEncoding) {
		this.contentEncoding = contentEncoding;
		if(contentEncoding != null){
			putQueryParameter("ContentEncoding", contentEncoding);
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

	public String getWindowsPasswordName() {
		return this.windowsPasswordName;
	}

	public void setWindowsPasswordName(String windowsPasswordName) {
		this.windowsPasswordName = windowsPasswordName;
		if(windowsPasswordName != null){
			putQueryParameter("WindowsPasswordName", windowsPasswordName);
		}
	}

	public Boolean getKeepCommand() {
		return this.keepCommand;
	}

	public void setKeepCommand(Boolean keepCommand) {
		this.keepCommand = keepCommand;
		if(keepCommand != null){
			putQueryParameter("KeepCommand", keepCommand.toString());
		}
	}

	public List<Tags> getTags() {
		return this.tags;
	}

	public void setTags(List<Tags> tags) {
		this.tags = tags;	
		if (tags != null) {
			putQueryParameter("Tags" , new Gson().toJson(tags));
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

	public List<String> getInstanceIds() {
		return this.instanceIds;
	}

	public void setInstanceIds(List<String> instanceIds) {
		this.instanceIds = instanceIds;	
		if (instanceIds != null) {
			putQueryParameter("InstanceIds" , new Gson().toJson(instanceIds));
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

	public String getContainerId() {
		return this.containerId;
	}

	public void setContainerId(String containerId) {
		this.containerId = containerId;
		if(containerId != null){
			putQueryParameter("ContainerId", containerId);
		}
	}

	public Map<String,String> getParameters() {
		return this.parameters;
	}

	public void setParameters(Map<String,String> parameters) {
		this.parameters = parameters;	
		if (parameters != null) {
			putQueryParameter("Parameters" , new Gson().toJson(parameters));
		}	
	}

	public Boolean getEnableParameter() {
		return this.enableParameter;
	}

	public void setEnableParameter(Boolean enableParameter) {
		this.enableParameter = enableParameter;
		if(enableParameter != null){
			putQueryParameter("EnableParameter", enableParameter.toString());
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

	public String getLauncher() {
		return this.launcher;
	}

	public void setLauncher(String launcher) {
		this.launcher = launcher;
		if(launcher != null){
			putQueryParameter("Launcher", launcher);
		}
	}

	public static class ResourceTags {

		@SerializedName("Value")
		private String value;

		@SerializedName("Key")
		private String key;

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}
	}

	public static class Tags {

		@SerializedName("Value")
		private String value;

		@SerializedName("Key")
		private String key;

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}
	}

	@Override
	public Class<RunRCCommandResponse> getResponseClass() {
		return RunRCCommandResponse.class;
	}

}
