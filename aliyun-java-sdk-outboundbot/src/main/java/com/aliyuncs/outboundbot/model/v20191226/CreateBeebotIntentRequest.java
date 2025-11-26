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
public class CreateBeebotIntentRequest extends RpcAcsRequest<CreateBeebotIntentResponse> {
	   

	@SerializedName("intentDefinition")
	private IntentDefinition intentDefinition;

	private String scriptId;

	private String instanceId;
	public CreateBeebotIntentRequest() {
		super("OutboundBot", "2019-12-26", "CreateBeebotIntent", "outboundbot");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public IntentDefinition getIntentDefinition() {
		return this.intentDefinition;
	}

	public void setIntentDefinition(IntentDefinition intentDefinition) {
		this.intentDefinition = intentDefinition;	
		if (intentDefinition != null) {
			putQueryParameter("IntentDefinition" , new Gson().toJson(intentDefinition));
		}	
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

	public static class IntentDefinition {

		@SerializedName("AliasName")
		private String aliasName;

		@SerializedName("IntentName")
		private String intentName;

		public String getAliasName() {
			return this.aliasName;
		}

		public void setAliasName(String aliasName) {
			this.aliasName = aliasName;
		}

		public String getIntentName() {
			return this.intentName;
		}

		public void setIntentName(String intentName) {
			this.intentName = intentName;
		}
	}

	@Override
	public Class<CreateBeebotIntentResponse> getResponseClass() {
		return CreateBeebotIntentResponse.class;
	}

}
