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

package com.aliyuncs.aiccs.model.v20191015;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.aiccs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class MakeDoubleCallRequest extends RpcAcsRequest<MakeDoubleCallResponse> {
	   

	private String instanceId;

	private String servicerPhone;

	private String accountName;

	private String outboundCallNumber;

	private String bizData;

	private String memberPhone;
	public MakeDoubleCallRequest() {
		super("aiccs", "2019-10-15", "MakeDoubleCall");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getServicerPhone() {
		return this.servicerPhone;
	}

	public void setServicerPhone(String servicerPhone) {
		this.servicerPhone = servicerPhone;
		if(servicerPhone != null){
			putQueryParameter("ServicerPhone", servicerPhone);
		}
	}

	public String getAccountName() {
		return this.accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
		if(accountName != null){
			putQueryParameter("AccountName", accountName);
		}
	}

	public String getOutboundCallNumber() {
		return this.outboundCallNumber;
	}

	public void setOutboundCallNumber(String outboundCallNumber) {
		this.outboundCallNumber = outboundCallNumber;
		if(outboundCallNumber != null){
			putQueryParameter("OutboundCallNumber", outboundCallNumber);
		}
	}

	public String getBizData() {
		return this.bizData;
	}

	public void setBizData(String bizData) {
		this.bizData = bizData;
		if(bizData != null){
			putQueryParameter("BizData", bizData);
		}
	}

	public String getMemberPhone() {
		return this.memberPhone;
	}

	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
		if(memberPhone != null){
			putQueryParameter("MemberPhone", memberPhone);
		}
	}

	@Override
	public Class<MakeDoubleCallResponse> getResponseClass() {
		return MakeDoubleCallResponse.class;
	}

}
