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

package com.aliyuncs.cr.model.v20181201;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateEventCenterRuleRequest extends RpcAcsRequest<UpdateEventCenterRuleResponse> {
	   

	private String eventScope;

	private String ruleName;

	private String eventChannel;

	private String repoTagFilterPattern;

	private String instanceId;

	private String eventConfig;

	@SerializedName("repoNames")
	private List<String> repoNames;

	private String eventType;

	private String ruleId;

	@SerializedName("namespaces")
	private List<String> namespaces;
	public UpdateEventCenterRuleRequest() {
		super("cr", "2018-12-01", "UpdateEventCenterRule", "acr");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getEventScope() {
		return this.eventScope;
	}

	public void setEventScope(String eventScope) {
		this.eventScope = eventScope;
		if(eventScope != null){
			putQueryParameter("EventScope", eventScope);
		}
	}

	public String getRuleName() {
		return this.ruleName;
	}

	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
		if(ruleName != null){
			putQueryParameter("RuleName", ruleName);
		}
	}

	public String getEventChannel() {
		return this.eventChannel;
	}

	public void setEventChannel(String eventChannel) {
		this.eventChannel = eventChannel;
		if(eventChannel != null){
			putQueryParameter("EventChannel", eventChannel);
		}
	}

	public String getRepoTagFilterPattern() {
		return this.repoTagFilterPattern;
	}

	public void setRepoTagFilterPattern(String repoTagFilterPattern) {
		this.repoTagFilterPattern = repoTagFilterPattern;
		if(repoTagFilterPattern != null){
			putQueryParameter("RepoTagFilterPattern", repoTagFilterPattern);
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

	public String getEventConfig() {
		return this.eventConfig;
	}

	public void setEventConfig(String eventConfig) {
		this.eventConfig = eventConfig;
		if(eventConfig != null){
			putQueryParameter("EventConfig", eventConfig);
		}
	}

	public List<String> getRepoNames() {
		return this.repoNames;
	}

	public void setRepoNames(List<String> repoNames) {
		this.repoNames = repoNames;	
		if (repoNames != null) {
			putQueryParameter("RepoNames" , new Gson().toJson(repoNames));
		}	
	}

	public String getEventType() {
		return this.eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
		if(eventType != null){
			putQueryParameter("EventType", eventType);
		}
	}

	public String getRuleId() {
		return this.ruleId;
	}

	public void setRuleId(String ruleId) {
		this.ruleId = ruleId;
		if(ruleId != null){
			putQueryParameter("RuleId", ruleId);
		}
	}

	public List<String> getNamespaces() {
		return this.namespaces;
	}

	public void setNamespaces(List<String> namespaces) {
		this.namespaces = namespaces;	
		if (namespaces != null) {
			putQueryParameter("Namespaces" , new Gson().toJson(namespaces));
		}	
	}

	@Override
	public Class<UpdateEventCenterRuleResponse> getResponseClass() {
		return UpdateEventCenterRuleResponse.class;
	}

}
