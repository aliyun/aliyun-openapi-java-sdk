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

package com.aliyuncs.cams.model.v20200606;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cams.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateConversationalAutomationRequest extends RpcAcsRequest<UpdateConversationalAutomationResponse> {
	   

	private Long resourceOwnerId;

	private String phoneNumber;

	private Boolean enableWelcomeMessage;

	@SerializedName("commands")
	private List<Commands> commands;

	@SerializedName("prompts")
	private List<String> prompts;

	private String resourceOwnerAccount;

	private Long ownerId;

	private String custSpaceId;
	public UpdateConversationalAutomationRequest() {
		super("cams", "2020-06-06", "UpdateConversationalAutomation", "cams");
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

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		if(phoneNumber != null){
			putQueryParameter("PhoneNumber", phoneNumber);
		}
	}

	public Boolean getEnableWelcomeMessage() {
		return this.enableWelcomeMessage;
	}

	public void setEnableWelcomeMessage(Boolean enableWelcomeMessage) {
		this.enableWelcomeMessage = enableWelcomeMessage;
		if(enableWelcomeMessage != null){
			putQueryParameter("EnableWelcomeMessage", enableWelcomeMessage.toString());
		}
	}

	public List<Commands> getCommands() {
		return this.commands;
	}

	public void setCommands(List<Commands> commands) {
		this.commands = commands;	
		if (commands != null) {
			putQueryParameter("Commands" , new Gson().toJson(commands));
		}	
	}

	public List<String> getPrompts() {
		return this.prompts;
	}

	public void setPrompts(List<String> prompts) {
		this.prompts = prompts;	
		if (prompts != null) {
			putQueryParameter("Prompts" , new Gson().toJson(prompts));
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

	public String getCustSpaceId() {
		return this.custSpaceId;
	}

	public void setCustSpaceId(String custSpaceId) {
		this.custSpaceId = custSpaceId;
		if(custSpaceId != null){
			putQueryParameter("CustSpaceId", custSpaceId);
		}
	}

	public static class Commands {

		@SerializedName("CommandDescription")
		private String commandDescription;

		@SerializedName("CommandName")
		private String commandName;

		public String getCommandDescription() {
			return this.commandDescription;
		}

		public void setCommandDescription(String commandDescription) {
			this.commandDescription = commandDescription;
		}

		public String getCommandName() {
			return this.commandName;
		}

		public void setCommandName(String commandName) {
			this.commandName = commandName;
		}
	}

	@Override
	public Class<UpdateConversationalAutomationResponse> getResponseClass() {
		return UpdateConversationalAutomationResponse.class;
	}

}
