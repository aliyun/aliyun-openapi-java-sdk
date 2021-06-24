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

package com.aliyuncs.ecsops.model.v20160401;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class OpsModifyWarningInfoRequest extends RpcAcsRequest<OpsModifyWarningInfoResponse> {
	   

	private String note;

	private String operator;

	private String warningInfoId;

	private String auditParamStr;

	private Integer status;

	private String operatorName;
	public OpsModifyWarningInfoRequest() {
		super("Ecsops", "2016-04-01", "OpsModifyWarningInfo", "ecsops");
		setMethod(MethodType.POST);
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
		if(note != null){
			putQueryParameter("Note", note);
		}
	}

	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
		if(operator != null){
			putQueryParameter("Operator", operator);
		}
	}

	public String getWarningInfoId() {
		return this.warningInfoId;
	}

	public void setWarningInfoId(String warningInfoId) {
		this.warningInfoId = warningInfoId;
		if(warningInfoId != null){
			putQueryParameter("WarningInfoId", warningInfoId);
		}
	}

	public String getAuditParamStr() {
		return this.auditParamStr;
	}

	public void setAuditParamStr(String auditParamStr) {
		this.auditParamStr = auditParamStr;
		if(auditParamStr != null){
			putQueryParameter("AuditParamStr", auditParamStr);
		}
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status.toString());
		}
	}

	public String getOperatorName() {
		return this.operatorName;
	}

	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
		if(operatorName != null){
			putQueryParameter("OperatorName", operatorName);
		}
	}

	@Override
	public Class<OpsModifyWarningInfoResponse> getResponseClass() {
		return OpsModifyWarningInfoResponse.class;
	}

}
