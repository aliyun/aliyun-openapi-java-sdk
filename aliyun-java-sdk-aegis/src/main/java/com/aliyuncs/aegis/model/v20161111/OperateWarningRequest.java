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

package com.aliyuncs.aegis.model.v20161111;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class OperateWarningRequest extends RpcAcsRequest<OperateWarningResponse> {
	
	public OperateWarningRequest() {
		super("aegis", "2016-11-11", "OperateWarning", "vipaegis");
	}

	private String reason;

	private String sourceIp;

	private String operateType;

	private String riskWarningIds;

	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
		if(reason != null){
			putQueryParameter("Reason", reason);
		}
	}

	public String getSourceIp() {
		return this.sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
		if(sourceIp != null){
			putQueryParameter("SourceIp", sourceIp);
		}
	}

	public String getOperateType() {
		return this.operateType;
	}

	public void setOperateType(String operateType) {
		this.operateType = operateType;
		if(operateType != null){
			putQueryParameter("OperateType", operateType);
		}
	}

	public String getRiskWarningIds() {
		return this.riskWarningIds;
	}

	public void setRiskWarningIds(String riskWarningIds) {
		this.riskWarningIds = riskWarningIds;
		if(riskWarningIds != null){
			putQueryParameter("RiskWarningIds", riskWarningIds);
		}
	}

	@Override
	public Class<OperateWarningResponse> getResponseClass() {
		return OperateWarningResponse.class;
	}

}
