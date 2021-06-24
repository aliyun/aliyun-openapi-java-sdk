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
public class OpsStatisticOpsRuleRequest extends RpcAcsRequest<OpsStatisticOpsRuleResponse> {
	   

	private String opsActionName;

	private String endTime;

	private String startTime;

	private String opsRuleName;

	private String auditParamStr;
	public OpsStatisticOpsRuleRequest() {
		super("Ecsops", "2016-04-01", "OpsStatisticOpsRule", "ecsops");
		setMethod(MethodType.POST);
	}

	public String getOpsActionName() {
		return this.opsActionName;
	}

	public void setOpsActionName(String opsActionName) {
		this.opsActionName = opsActionName;
		if(opsActionName != null){
			putQueryParameter("OpsActionName", opsActionName);
		}
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("EndTime", endTime);
		}
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime);
		}
	}

	public String getOpsRuleName() {
		return this.opsRuleName;
	}

	public void setOpsRuleName(String opsRuleName) {
		this.opsRuleName = opsRuleName;
		if(opsRuleName != null){
			putQueryParameter("OpsRuleName", opsRuleName);
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
	public Class<OpsStatisticOpsRuleResponse> getResponseClass() {
		return OpsStatisticOpsRuleResponse.class;
	}

}
