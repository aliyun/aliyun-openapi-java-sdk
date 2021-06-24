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
public class OpsAlarmCenterProcessTriggerRequest extends RpcAcsRequest<OpsAlarmCenterProcessTriggerResponse> {
	   

	private String userDefineParam;

	private String processorTriggerInfo;

	private String processorTriggerName;

	private String token;

	private String auditParamStr;
	public OpsAlarmCenterProcessTriggerRequest() {
		super("Ecsops", "2016-04-01", "OpsAlarmCenterProcessTrigger", "ecsops");
		setMethod(MethodType.POST);
	}

	public String getUserDefineParam() {
		return this.userDefineParam;
	}

	public void setUserDefineParam(String userDefineParam) {
		this.userDefineParam = userDefineParam;
		if(userDefineParam != null){
			putQueryParameter("UserDefineParam", userDefineParam);
		}
	}

	public String getProcessorTriggerInfo() {
		return this.processorTriggerInfo;
	}

	public void setProcessorTriggerInfo(String processorTriggerInfo) {
		this.processorTriggerInfo = processorTriggerInfo;
		if(processorTriggerInfo != null){
			putQueryParameter("ProcessorTriggerInfo", processorTriggerInfo);
		}
	}

	public String getProcessorTriggerName() {
		return this.processorTriggerName;
	}

	public void setProcessorTriggerName(String processorTriggerName) {
		this.processorTriggerName = processorTriggerName;
		if(processorTriggerName != null){
			putQueryParameter("ProcessorTriggerName", processorTriggerName);
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
	public Class<OpsAlarmCenterProcessTriggerResponse> getResponseClass() {
		return OpsAlarmCenterProcessTriggerResponse.class;
	}

}
