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

package com.aliyuncs.outboundbot.model.v20191226;

import com.aliyuncs.RpcAcsRequest;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.outboundbot.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateBeebotIntentUserSayRequest extends RpcAcsRequest<CreateBeebotIntentUserSayResponse> {
	   

	private String scriptId;

	private String instanceId;

	@SerializedName("userSayDefinition")
	private UserSayDefinition userSayDefinition;
	public CreateBeebotIntentUserSayRequest() {
		super("OutboundBot", "2019-12-26", "CreateBeebotIntentUserSay", "outboundbot");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getScriptId() {
		return this.scriptId;
	}

	public void setScriptId(String scriptId) {
		this.scriptId = scriptId;
		if(scriptId != null){
			putQueryParameter("ScriptId", scriptId);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public UserSayDefinition getUserSayDefinition() {
		return this.userSayDefinition;
	}

	public void setUserSayDefinition(UserSayDefinition userSayDefinition) {
		this.userSayDefinition = userSayDefinition;	
		if (userSayDefinition != null) {
			putQueryParameter("UserSayDefinition" , new Gson().toJson(userSayDefinition));
		}	
	}

	public static class UserSayDefinition {

		@SerializedName("IntentId")
		private Long intentId;

		@SerializedName("Content")
		private String content;

		public Long getIntentId() {
			return this.intentId;
		}

		public void setIntentId(Long intentId) {
			this.intentId = intentId;
		}

		public String getContent() {
			return this.content;
		}

		public void setContent(String content) {
			this.content = content;
		}
	}

	@Override
	public Class<CreateBeebotIntentUserSayResponse> getResponseClass() {
		return CreateBeebotIntentUserSayResponse.class;
	}

}
