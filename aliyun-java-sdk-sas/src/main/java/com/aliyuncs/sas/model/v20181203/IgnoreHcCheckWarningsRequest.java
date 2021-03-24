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

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class IgnoreHcCheckWarningsRequest extends RpcAcsRequest<IgnoreHcCheckWarningsResponse> {
	   

	private String reason;

	private String checkIds;

	private String riskId;

	private Long type;

	private String sourceIp;

	private String checkWarningIds;
	public IgnoreHcCheckWarningsRequest() {
		super("Sas", "2018-12-03", "IgnoreHcCheckWarnings", "sas");
		setMethod(MethodType.POST);
	}

	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
		if(reason != null){
			putQueryParameter("Reason", reason);
		}
	}

	public String getCheckIds() {
		return this.checkIds;
	}

	public void setCheckIds(String checkIds) {
		this.checkIds = checkIds;
		if(checkIds != null){
			putQueryParameter("CheckIds", checkIds);
		}
	}

	public String getRiskId() {
		return this.riskId;
	}

	public void setRiskId(String riskId) {
		this.riskId = riskId;
		if(riskId != null){
			putQueryParameter("RiskId", riskId);
		}
	}

	public Long getType() {
		return this.type;
	}

	public void setType(Long type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type.toString());
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

	public String getCheckWarningIds() {
		return this.checkWarningIds;
	}

	public void setCheckWarningIds(String checkWarningIds) {
		this.checkWarningIds = checkWarningIds;
		if(checkWarningIds != null){
			putQueryParameter("CheckWarningIds", checkWarningIds);
		}
	}

	@Override
	public Class<IgnoreHcCheckWarningsResponse> getResponseClass() {
		return IgnoreHcCheckWarningsResponse.class;
	}

}
