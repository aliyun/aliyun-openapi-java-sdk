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
public class ModifyInstanceRequest extends RpcAcsRequest<ModifyInstanceResponse> {
	   

	private Integer maxConcurrentConversation;

	private String instanceId;

	private String instanceName;

	private String callCenterInstanceId;

	private String instanceDescription;
	public ModifyInstanceRequest() {
		super("OutboundBot", "2019-12-26", "ModifyInstance", "outboundbot");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getMaxConcurrentConversation() {
		return this.maxConcurrentConversation;
	}

	public void setMaxConcurrentConversation(Integer maxConcurrentConversation) {
		this.maxConcurrentConversation = maxConcurrentConversation;
		if(maxConcurrentConversation != null){
			putQueryParameter("MaxConcurrentConversation", maxConcurrentConversation.toString());
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

	public String getInstanceName() {
		return this.instanceName;
	}

	public void setInstanceName(String instanceName) {
		this.instanceName = instanceName;
		if(instanceName != null){
			putQueryParameter("InstanceName", instanceName);
		}
	}

	public String getCallCenterInstanceId() {
		return this.callCenterInstanceId;
	}

	public void setCallCenterInstanceId(String callCenterInstanceId) {
		this.callCenterInstanceId = callCenterInstanceId;
		if(callCenterInstanceId != null){
			putQueryParameter("CallCenterInstanceId", callCenterInstanceId);
		}
	}

	public String getInstanceDescription() {
		return this.instanceDescription;
	}

	public void setInstanceDescription(String instanceDescription) {
		this.instanceDescription = instanceDescription;
		if(instanceDescription != null){
			putQueryParameter("InstanceDescription", instanceDescription);
		}
	}

	@Override
	public Class<ModifyInstanceResponse> getResponseClass() {
		return ModifyInstanceResponse.class;
	}

}
