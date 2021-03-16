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
import com.aliyuncs.ecsops.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class OpsQueryRuleChangeOpsImpactRequest extends RpcAcsRequest<OpsQueryRuleChangeOpsImpactResponse> {
	   

	private String endTime;

	private String startTime;

	private String token;

	private String alarmConfigContent;

	private String alarmConfigClassType;

	private String auditParamStr;
	public OpsQueryRuleChangeOpsImpactRequest() {
		super("Ecsops", "2016-04-01", "OpsQueryRuleChangeOpsImpact", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
		if(token != null){
			putQueryParameter("Token", token);
		}
	}

	public String getAlarmConfigContent() {
		return this.alarmConfigContent;
	}

	public void setAlarmConfigContent(String alarmConfigContent) {
		this.alarmConfigContent = alarmConfigContent;
		if(alarmConfigContent != null){
			putQueryParameter("AlarmConfigContent", alarmConfigContent);
		}
	}

	public String getAlarmConfigClassType() {
		return this.alarmConfigClassType;
	}

	public void setAlarmConfigClassType(String alarmConfigClassType) {
		this.alarmConfigClassType = alarmConfigClassType;
		if(alarmConfigClassType != null){
			putQueryParameter("AlarmConfigClassType", alarmConfigClassType);
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
	public Class<OpsQueryRuleChangeOpsImpactResponse> getResponseClass() {
		return OpsQueryRuleChangeOpsImpactResponse.class;
	}

}
