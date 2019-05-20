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

package com.aliyuncs.cloudcallcenter.model.v20170705;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DialRequest extends RpcAcsRequest<DialResponse> {
	
	public DialRequest() {
		super("CloudCallCenter", "2017-07-05", "Dial", "CloudCallCenter", "innerAPI");
	}

	private String contactFlowId;

	private String bizName;

	private String callee;

	private String routingStrategy;

	private String caller;

	private String instanceId;

	private String provider;

	private String appId;

	private String appToken;

	private String tag;

	private String scenarioId;

	private String contactFlowName;

	private String taskId;

	private String cabInstanceId;

	public String getContactFlowId() {
		return this.contactFlowId;
	}

	public void setContactFlowId(String contactFlowId) {
		this.contactFlowId = contactFlowId;
		if(contactFlowId != null){
			putQueryParameter("ContactFlowId", contactFlowId);
		}
	}

	public String getBizName() {
		return this.bizName;
	}

	public void setBizName(String bizName) {
		this.bizName = bizName;
		if(bizName != null){
			putQueryParameter("BizName", bizName);
		}
	}

	public String getCallee() {
		return this.callee;
	}

	public void setCallee(String callee) {
		this.callee = callee;
		if(callee != null){
			putQueryParameter("Callee", callee);
		}
	}

	public String getRoutingStrategy() {
		return this.routingStrategy;
	}

	public void setRoutingStrategy(String routingStrategy) {
		this.routingStrategy = routingStrategy;
		if(routingStrategy != null){
			putQueryParameter("RoutingStrategy", routingStrategy);
		}
	}

	public String getCaller() {
		return this.caller;
	}

	public void setCaller(String caller) {
		this.caller = caller;
		if(caller != null){
			putQueryParameter("Caller", caller);
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

	public String getProvider() {
		return this.provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
		if(provider != null){
			putQueryParameter("Provider", provider);
		}
	}

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
		if(appId != null){
			putQueryParameter("AppId", appId);
		}
	}

	public String getAppToken() {
		return this.appToken;
	}

	public void setAppToken(String appToken) {
		this.appToken = appToken;
		if(appToken != null){
			putQueryParameter("AppToken", appToken);
		}
	}

	public String getTag() {
		return this.tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
		if(tag != null){
			putQueryParameter("Tag", tag);
		}
	}

	public String getScenarioId() {
		return this.scenarioId;
	}

	public void setScenarioId(String scenarioId) {
		this.scenarioId = scenarioId;
		if(scenarioId != null){
			putQueryParameter("ScenarioId", scenarioId);
		}
	}

	public String getContactFlowName() {
		return this.contactFlowName;
	}

	public void setContactFlowName(String contactFlowName) {
		this.contactFlowName = contactFlowName;
		if(contactFlowName != null){
			putQueryParameter("ContactFlowName", contactFlowName);
		}
	}

	public String getTaskId() {
		return this.taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
		if(taskId != null){
			putQueryParameter("TaskId", taskId);
		}
	}

	public String getCabInstanceId() {
		return this.cabInstanceId;
	}

	public void setCabInstanceId(String cabInstanceId) {
		this.cabInstanceId = cabInstanceId;
		if(cabInstanceId != null){
			putQueryParameter("CabInstanceId", cabInstanceId);
		}
	}

	@Override
	public Class<DialResponse> getResponseClass() {
		return DialResponse.class;
	}

}
