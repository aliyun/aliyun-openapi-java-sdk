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

package com.aliyuncs.scsp.model.v20200702;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.scsp.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class TransferCallToPhoneRequest extends RpcAcsRequest<TransferCallToPhoneResponse> {
	   

	private String clientToken;

	private String instanceId;

	private String accountName;

	private String caller;

	private String callee;

	private String callId;

	private String jobId;

	private String connectionId;

	private String holdConnectionId;

	private Integer type;

	private Boolean isSingleTransfer;

	private String callerPhone;

	private String calleePhone;
	public TransferCallToPhoneRequest() {
		super("scsp", "2020-07-02", "TransferCallToPhone");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putBodyParameter("ClientToken", clientToken);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putBodyParameter("InstanceId", instanceId);
		}
	}

	public String getAccountName() {
		return this.accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
		if(accountName != null){
			putBodyParameter("AccountName", accountName);
		}
	}

	public String getCaller() {
		return this.caller;
	}

	public void setCaller(String caller) {
		this.caller = caller;
		if(caller != null){
			putBodyParameter("Caller", caller);
		}
	}

	public String getCallee() {
		return this.callee;
	}

	public void setCallee(String callee) {
		this.callee = callee;
		if(callee != null){
			putBodyParameter("Callee", callee);
		}
	}

	public String getCallId() {
		return this.callId;
	}

	public void setCallId(String callId) {
		this.callId = callId;
		if(callId != null){
			putBodyParameter("CallId", callId);
		}
	}

	public String getJobId() {
		return this.jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
		if(jobId != null){
			putBodyParameter("JobId", jobId);
		}
	}

	public String getConnectionId() {
		return this.connectionId;
	}

	public void setConnectionId(String connectionId) {
		this.connectionId = connectionId;
		if(connectionId != null){
			putBodyParameter("ConnectionId", connectionId);
		}
	}

	public String getHoldConnectionId() {
		return this.holdConnectionId;
	}

	public void setHoldConnectionId(String holdConnectionId) {
		this.holdConnectionId = holdConnectionId;
		if(holdConnectionId != null){
			putBodyParameter("HoldConnectionId", holdConnectionId);
		}
	}

	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
		if(type != null){
			putBodyParameter("Type", type.toString());
		}
	}

	public Boolean getIsSingleTransfer() {
		return this.isSingleTransfer;
	}

	public void setIsSingleTransfer(Boolean isSingleTransfer) {
		this.isSingleTransfer = isSingleTransfer;
		if(isSingleTransfer != null){
			putBodyParameter("IsSingleTransfer", isSingleTransfer.toString());
		}
	}

	public String getCallerPhone() {
		return this.callerPhone;
	}

	public void setCallerPhone(String callerPhone) {
		this.callerPhone = callerPhone;
		if(callerPhone != null){
			putBodyParameter("callerPhone", callerPhone);
		}
	}

	public String getCalleePhone() {
		return this.calleePhone;
	}

	public void setCalleePhone(String calleePhone) {
		this.calleePhone = calleePhone;
		if(calleePhone != null){
			putBodyParameter("calleePhone", calleePhone);
		}
	}

	@Override
	public Class<TransferCallToPhoneResponse> getResponseClass() {
		return TransferCallToPhoneResponse.class;
	}

}
