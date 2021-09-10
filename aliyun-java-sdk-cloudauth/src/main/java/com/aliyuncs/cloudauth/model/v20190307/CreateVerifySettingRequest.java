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

package com.aliyuncs.cloudauth.model.v20190307;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cloudauth.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateVerifySettingRequest extends RpcAcsRequest<CreateVerifySettingResponse> {
	   

	private Boolean guideStep;

	private Boolean resultStep;

	private String solution;

	private String bizName;

	private String bizType;

	private Boolean privacyStep;
	public CreateVerifySettingRequest() {
		super("Cloudauth", "2019-03-07", "CreateVerifySetting");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getGuideStep() {
		return this.guideStep;
	}

	public void setGuideStep(Boolean guideStep) {
		this.guideStep = guideStep;
		if(guideStep != null){
			putQueryParameter("GuideStep", guideStep.toString());
		}
	}

	public Boolean getResultStep() {
		return this.resultStep;
	}

	public void setResultStep(Boolean resultStep) {
		this.resultStep = resultStep;
		if(resultStep != null){
			putQueryParameter("ResultStep", resultStep.toString());
		}
	}

	public String getSolution() {
		return this.solution;
	}

	public void setSolution(String solution) {
		this.solution = solution;
		if(solution != null){
			putQueryParameter("Solution", solution);
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

	public String getBizType() {
		return this.bizType;
	}

	public void setBizType(String bizType) {
		this.bizType = bizType;
		if(bizType != null){
			putQueryParameter("BizType", bizType);
		}
	}

	public Boolean getPrivacyStep() {
		return this.privacyStep;
	}

	public void setPrivacyStep(Boolean privacyStep) {
		this.privacyStep = privacyStep;
		if(privacyStep != null){
			putQueryParameter("PrivacyStep", privacyStep.toString());
		}
	}

	@Override
	public Class<CreateVerifySettingResponse> getResponseClass() {
		return CreateVerifySettingResponse.class;
	}

}
