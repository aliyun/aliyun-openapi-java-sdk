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

package com.aliyuncs.phoenixsp_inner.model.v20160805;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class RiskControlRequest extends RpcAcsRequest<RiskControlResponse> {
	
	public RiskControlRequest() {
		super("Phoenixsp-inner", "2016-08-05", "RiskControl");
	}

	private String reason;

	private String riskCondition;

	private Long aliuid;

	private String operation;

	private String token;

	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
		if(reason != null){
			putQueryParameter("Reason", reason);
		}
	}

	public String getRiskCondition() {
		return this.riskCondition;
	}

	public void setRiskCondition(String riskCondition) {
		this.riskCondition = riskCondition;
		if(riskCondition != null){
			putQueryParameter("RiskCondition", riskCondition);
		}
	}

	public Long getAliuid() {
		return this.aliuid;
	}

	public void setAliuid(Long aliuid) {
		this.aliuid = aliuid;
		if(aliuid != null){
			putQueryParameter("Aliuid", aliuid.toString());
		}
	}

	public String getOperation() {
		return this.operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
		if(operation != null){
			putQueryParameter("Operation", operation);
		}
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
		if(token != null){
			putQueryParameter("Token", token);
		}
	}

	@Override
	public Class<RiskControlResponse> getResponseClass() {
		return RiskControlResponse.class;
	}

}
