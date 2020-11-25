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
public class RunCommandRequest extends RpcAcsRequest<RunCommandResponse> {
	   

	private Long resourceOwnerId;

	private String workingDir;

	private String description;

	private String type;

	private String commandContent;

	private Long timeout;

	private String frequency;

	private String contentEncoding;

	private Boolean keepCommand;

	private Boolean timed;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private List<String> instanceIds;

	private String name;

	private Map<Object,Object> parameters;

	private Boolean enableParameter;
	public RunCommandRequest() {
		super("Ecs", "2014-05-26", "RunCommand", "ecs");
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

	public String getContentEncoding() {
		return this.contentEncoding;
	}

	public void setContentEncoding(String contentEncoding) {
		this.contentEncoding = contentEncoding;
		if(contentEncoding != null){
			putQueryParameter("ContentEncoding", contentEncoding);
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

	public Boolean getTimed() {
		return this.timed;
	}

	public void setTimed(Boolean timed) {
		this.timed = timed;
		if(timed != null){
			putQueryParameter("Timed", timed.toString());
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
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

	public Boolean getEnableParameter() {
		return this.enableParameter;
	}

	public void setEnableParameter(Boolean enableParameter) {
		this.enableParameter = enableParameter;
		if(enableParameter != null){
			putQueryParameter("EnableParameter", enableParameter.toString());
		}
	}

	@Override
	public Class<RunCommandResponse> getResponseClass() {
		return RunCommandResponse.class;
	}

}
