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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.outboundbot.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyScriptVoiceConfigRequest extends RpcAcsRequest<ModifyScriptVoiceConfigResponse> {
	   

	private String type;

	private String scriptId;

	private String scriptVoiceConfigId;

	private String instanceId;

	private String scriptWaveformRelation;
	public ModifyScriptVoiceConfigRequest() {
		super("OutboundBot", "2019-12-26", "ModifyScriptVoiceConfig", "outboundbot");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getScriptId() {
		return this.scriptId;
	}

	public void setScriptId(String scriptId) {
		this.scriptId = scriptId;
		if(scriptId != null){
			putQueryParameter("ScriptId", scriptId);
		}
	}

	public String getScriptVoiceConfigId() {
		return this.scriptVoiceConfigId;
	}

	public void setScriptVoiceConfigId(String scriptVoiceConfigId) {
		this.scriptVoiceConfigId = scriptVoiceConfigId;
		if(scriptVoiceConfigId != null){
			putQueryParameter("ScriptVoiceConfigId", scriptVoiceConfigId);
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

	public String getScriptWaveformRelation() {
		return this.scriptWaveformRelation;
	}

	public void setScriptWaveformRelation(String scriptWaveformRelation) {
		this.scriptWaveformRelation = scriptWaveformRelation;
		if(scriptWaveformRelation != null){
			putQueryParameter("ScriptWaveformRelation", scriptWaveformRelation);
		}
	}

	@Override
	public Class<ModifyScriptVoiceConfigResponse> getResponseClass() {
		return ModifyScriptVoiceConfigResponse.class;
	}

}
