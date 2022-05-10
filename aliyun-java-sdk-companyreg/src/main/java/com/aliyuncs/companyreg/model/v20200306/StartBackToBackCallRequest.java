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

package com.aliyuncs.companyreg.model.v20200306;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.companyreg.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class StartBackToBackCallRequest extends RpcAcsRequest<StartBackToBackCallResponse> {
	   

	private String callCenterNumber;

	private String mobileKey;

	private String bizType;

	private String caller;

	private Long skillType;

	private String bizId;
	public StartBackToBackCallRequest() {
		super("companyreg", "2020-03-06", "StartBackToBackCall", "companyreg");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCallCenterNumber() {
		return this.callCenterNumber;
	}

	public void setCallCenterNumber(String callCenterNumber) {
		this.callCenterNumber = callCenterNumber;
		if(callCenterNumber != null){
			putQueryParameter("CallCenterNumber", callCenterNumber);
		}
	}

	public String getMobileKey() {
		return this.mobileKey;
	}

	public void setMobileKey(String mobileKey) {
		this.mobileKey = mobileKey;
		if(mobileKey != null){
			putQueryParameter("MobileKey", mobileKey);
		}
	}

	public String getBizType() {
		return this.bizType;
	}

	public void setBizType(String bizType) {
		this.bizType = bizType;
		if(bizType != null){
			putQueryParameter("BizType", bizType);
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

	public Long getSkillType() {
		return this.skillType;
	}

	public void setSkillType(Long skillType) {
		this.skillType = skillType;
		if(skillType != null){
			putQueryParameter("SkillType", skillType.toString());
		}
	}

	public String getBizId() {
		return this.bizId;
	}

	public void setBizId(String bizId) {
		this.bizId = bizId;
		if(bizId != null){
			putQueryParameter("BizId", bizId);
		}
	}

	@Override
	public Class<StartBackToBackCallResponse> getResponseClass() {
		return StartBackToBackCallResponse.class;
	}

}
