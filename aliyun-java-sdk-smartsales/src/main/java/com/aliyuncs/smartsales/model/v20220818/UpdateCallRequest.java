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

package com.aliyuncs.smartsales.model.v20220818;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdateCallRequest extends RpcAcsRequest<UpdateCallResponse> {
	   

	private Long callId;

	private String clueStatusRemark;

	private String agentKey;

	private Integer businessResult;

	private String customCallId;
	public UpdateCallRequest() {
		super("SmartSales", "2022-08-18", "UpdateCall");
		setMethod(MethodType.POST);
	}

	public Long getCallId() {
		return this.callId;
	}

	public void setCallId(Long callId) {
		this.callId = callId;
		if(callId != null){
			putQueryParameter("CallId", callId.toString());
		}
	}

	public String getClueStatusRemark() {
		return this.clueStatusRemark;
	}

	public void setClueStatusRemark(String clueStatusRemark) {
		this.clueStatusRemark = clueStatusRemark;
		if(clueStatusRemark != null){
			putQueryParameter("ClueStatusRemark", clueStatusRemark);
		}
	}

	public String getAgentKey() {
		return this.agentKey;
	}

	public void setAgentKey(String agentKey) {
		this.agentKey = agentKey;
		if(agentKey != null){
			putQueryParameter("AgentKey", agentKey);
		}
	}

	public Integer getBusinessResult() {
		return this.businessResult;
	}

	public void setBusinessResult(Integer businessResult) {
		this.businessResult = businessResult;
		if(businessResult != null){
			putQueryParameter("BusinessResult", businessResult.toString());
		}
	}

	public String getCustomCallId() {
		return this.customCallId;
	}

	public void setCustomCallId(String customCallId) {
		this.customCallId = customCallId;
		if(customCallId != null){
			putQueryParameter("CustomCallId", customCallId);
		}
	}

	@Override
	public Class<UpdateCallResponse> getResponseClass() {
		return UpdateCallResponse.class;
	}

}
