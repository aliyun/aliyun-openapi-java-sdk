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
public class OpsModifyAlertAttributeRequest extends RpcAcsRequest<OpsModifyAlertAttributeResponse> {
	   

	private String owner;

	private String alertStatus;

	private String diagnosisResult;

	private String diagnosisTemplateId;

	private String extra;

	private Long alertId;

	private String auditParamStr;
	public OpsModifyAlertAttributeRequest() {
		super("Ecsops", "2016-04-01", "OpsModifyAlertAttribute", "ecsops");
		setMethod(MethodType.POST);
	}

	public String getOwner() {
		return this.owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
		if(owner != null){
			putQueryParameter("Owner", owner);
		}
	}

	public String getAlertStatus() {
		return this.alertStatus;
	}

	public void setAlertStatus(String alertStatus) {
		this.alertStatus = alertStatus;
		if(alertStatus != null){
			putQueryParameter("AlertStatus", alertStatus);
		}
	}

	public String getDiagnosisResult() {
		return this.diagnosisResult;
	}

	public void setDiagnosisResult(String diagnosisResult) {
		this.diagnosisResult = diagnosisResult;
		if(diagnosisResult != null){
			putQueryParameter("DiagnosisResult", diagnosisResult);
		}
	}

	public String getDiagnosisTemplateId() {
		return this.diagnosisTemplateId;
	}

	public void setDiagnosisTemplateId(String diagnosisTemplateId) {
		this.diagnosisTemplateId = diagnosisTemplateId;
		if(diagnosisTemplateId != null){
			putQueryParameter("DiagnosisTemplateId", diagnosisTemplateId);
		}
	}

	public String getExtra() {
		return this.extra;
	}

	public void setExtra(String extra) {
		this.extra = extra;
		if(extra != null){
			putQueryParameter("Extra", extra);
		}
	}

	public Long getAlertId() {
		return this.alertId;
	}

	public void setAlertId(Long alertId) {
		this.alertId = alertId;
		if(alertId != null){
			putQueryParameter("AlertId", alertId.toString());
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

	@Override
	public Class<OpsModifyAlertAttributeResponse> getResponseClass() {
		return OpsModifyAlertAttributeResponse.class;
	}

}
