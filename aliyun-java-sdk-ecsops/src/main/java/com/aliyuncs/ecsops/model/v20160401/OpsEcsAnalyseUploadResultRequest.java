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
public class OpsEcsAnalyseUploadResultRequest extends RpcAcsRequest<OpsEcsAnalyseUploadResultResponse> {
	   

	private String scriptResult;

	private String scriptName;

	private String operator;

	private String scriptText;

	private String workOrderId;

	private String instanceId;

	private String caseId;

	private String auditParamStr;
	public OpsEcsAnalyseUploadResultRequest() {
		super("Ecsops", "2016-04-01", "OpsEcsAnalyseUploadResult", "ecsops");
		setMethod(MethodType.POST);
	}

	public String getScriptResult() {
		return this.scriptResult;
	}

	public void setScriptResult(String scriptResult) {
		this.scriptResult = scriptResult;
		if(scriptResult != null){
			putQueryParameter("ScriptResult", scriptResult);
		}
	}

	public String getScriptName() {
		return this.scriptName;
	}

	public void setScriptName(String scriptName) {
		this.scriptName = scriptName;
		if(scriptName != null){
			putQueryParameter("ScriptName", scriptName);
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

	public String getScriptText() {
		return this.scriptText;
	}

	public void setScriptText(String scriptText) {
		this.scriptText = scriptText;
		if(scriptText != null){
			putQueryParameter("ScriptText", scriptText);
		}
	}

	public String getWorkOrderId() {
		return this.workOrderId;
	}

	public void setWorkOrderId(String workOrderId) {
		this.workOrderId = workOrderId;
		if(workOrderId != null){
			putQueryParameter("WorkOrderId", workOrderId);
		}
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

	public String getCaseId() {
		return this.caseId;
	}

	public void setCaseId(String caseId) {
		this.caseId = caseId;
		if(caseId != null){
			putQueryParameter("CaseId", caseId);
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
	public Class<OpsEcsAnalyseUploadResultResponse> getResponseClass() {
		return OpsEcsAnalyseUploadResultResponse.class;
	}

}
