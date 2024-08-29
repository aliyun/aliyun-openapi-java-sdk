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
public class CreateIntentRequest extends RpcAcsRequest<CreateIntentResponse> {
	   

	private String utterances;

	private String keywords;

	private String intentDescription;

	private String scriptId;

	private String instanceId;

	private String intentName;
	public CreateIntentRequest() {
		super("OutboundBot", "2019-12-26", "CreateIntent", "outboundbot");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getUtterances() {
		return this.utterances;
	}

	public void setUtterances(String utterances) {
		this.utterances = utterances;
		if(utterances != null){
			putQueryParameter("Utterances", utterances);
		}
	}

	public String getKeywords() {
		return this.keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
		if(keywords != null){
			putQueryParameter("Keywords", keywords);
		}
	}

	public String getIntentDescription() {
		return this.intentDescription;
	}

	public void setIntentDescription(String intentDescription) {
		this.intentDescription = intentDescription;
		if(intentDescription != null){
			putQueryParameter("IntentDescription", intentDescription);
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

	public String getIntentName() {
		return this.intentName;
	}

	public void setIntentName(String intentName) {
		this.intentName = intentName;
		if(intentName != null){
			putQueryParameter("IntentName", intentName);
		}
	}

	@Override
	public Class<CreateIntentResponse> getResponseClass() {
		return CreateIntentResponse.class;
	}

}
