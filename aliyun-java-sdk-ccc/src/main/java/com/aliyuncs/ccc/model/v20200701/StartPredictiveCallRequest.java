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

package com.aliyuncs.ccc.model.v20200701;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ccc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class StartPredictiveCallRequest extends RpcAcsRequest<StartPredictiveCallResponse> {
	   

	private String contactFlowId;

	private String callee;

	private String maskedCallee;

	private String contactFlowVariables;

	private String tags;

	private Integer timeoutSeconds;

	private String caller;

	private String instanceId;

	private String skillGroupId;
	public StartPredictiveCallRequest() {
		super("CCC", "2020-07-01", "StartPredictiveCall", "CCC");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getContactFlowId() {
		return this.contactFlowId;
	}

	public void setContactFlowId(String contactFlowId) {
		this.contactFlowId = contactFlowId;
		if(contactFlowId != null){
			putQueryParameter("ContactFlowId", contactFlowId);
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

	public String getMaskedCallee() {
		return this.maskedCallee;
	}

	public void setMaskedCallee(String maskedCallee) {
		this.maskedCallee = maskedCallee;
		if(maskedCallee != null){
			putQueryParameter("MaskedCallee", maskedCallee);
		}
	}

	public String getContactFlowVariables() {
		return this.contactFlowVariables;
	}

	public void setContactFlowVariables(String contactFlowVariables) {
		this.contactFlowVariables = contactFlowVariables;
		if(contactFlowVariables != null){
			putQueryParameter("ContactFlowVariables", contactFlowVariables);
		}
	}

	public String getTags() {
		return this.tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
		if(tags != null){
			putQueryParameter("Tags", tags);
		}
	}

	public Integer getTimeoutSeconds() {
		return this.timeoutSeconds;
	}

	public void setTimeoutSeconds(Integer timeoutSeconds) {
		this.timeoutSeconds = timeoutSeconds;
		if(timeoutSeconds != null){
			putQueryParameter("TimeoutSeconds", timeoutSeconds.toString());
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

	public String getSkillGroupId() {
		return this.skillGroupId;
	}

	public void setSkillGroupId(String skillGroupId) {
		this.skillGroupId = skillGroupId;
		if(skillGroupId != null){
			putQueryParameter("SkillGroupId", skillGroupId);
		}
	}

	@Override
	public Class<StartPredictiveCallResponse> getResponseClass() {
		return StartPredictiveCallResponse.class;
	}

}
