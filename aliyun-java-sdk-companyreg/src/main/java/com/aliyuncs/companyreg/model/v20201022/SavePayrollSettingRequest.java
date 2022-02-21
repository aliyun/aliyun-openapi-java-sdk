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

package com.aliyuncs.companyreg.model.v20201022;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.companyreg.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SavePayrollSettingRequest extends RpcAcsRequest<SavePayrollSettingResponse> {
	   

	private String bizId;

	private String payrollAutoGrantRule;

	private String payrollGrantMode;
	public SavePayrollSettingRequest() {
		super("companyreg", "2020-10-22", "SavePayrollSetting");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getPayrollAutoGrantRule() {
		return this.payrollAutoGrantRule;
	}

	public void setPayrollAutoGrantRule(String payrollAutoGrantRule) {
		this.payrollAutoGrantRule = payrollAutoGrantRule;
		if(payrollAutoGrantRule != null){
			putQueryParameter("PayrollAutoGrantRule", payrollAutoGrantRule);
		}
	}

	public String getPayrollGrantMode() {
		return this.payrollGrantMode;
	}

	public void setPayrollGrantMode(String payrollGrantMode) {
		this.payrollGrantMode = payrollGrantMode;
		if(payrollGrantMode != null){
			putQueryParameter("PayrollGrantMode", payrollGrantMode);
		}
	}

	@Override
	public Class<SavePayrollSettingResponse> getResponseClass() {
		return SavePayrollSettingResponse.class;
	}

}
