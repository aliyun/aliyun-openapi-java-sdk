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
public class ModifyBeebotIntentLgfRequest extends RpcAcsRequest<ModifyBeebotIntentLgfResponse> {
	   

	private Long lgfId;

	private String scriptId;

	private String instanceId;

	@SerializedName("lgfDefinition")
	private LgfDefinition lgfDefinition;
	public ModifyBeebotIntentLgfRequest() {
		super("OutboundBot", "2019-12-26", "ModifyBeebotIntentLgf", "outboundbot");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getLgfId() {
		return this.lgfId;
	}

	public void setLgfId(Long lgfId) {
		this.lgfId = lgfId;
		if(lgfId != null){
			putQueryParameter("LgfId", lgfId.toString());
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

	public LgfDefinition getLgfDefinition() {
		return this.lgfDefinition;
	}

	public void setLgfDefinition(LgfDefinition lgfDefinition) {
		this.lgfDefinition = lgfDefinition;	
		if (lgfDefinition != null) {
			putQueryParameter("LgfDefinition" , new Gson().toJson(lgfDefinition));
		}	
	}

	public static class LgfDefinition {

		@SerializedName("RuleText")
		private String ruleText;

		@SerializedName("IntentId")
		private Long intentId;

		public String getRuleText() {
			return this.ruleText;
		}

		public void setRuleText(String ruleText) {
			this.ruleText = ruleText;
		}

		public Long getIntentId() {
			return this.intentId;
		}

		public void setIntentId(Long intentId) {
			this.intentId = intentId;
		}
	}

	@Override
	public Class<ModifyBeebotIntentLgfResponse> getResponseClass() {
		return ModifyBeebotIntentLgfResponse.class;
	}

}
