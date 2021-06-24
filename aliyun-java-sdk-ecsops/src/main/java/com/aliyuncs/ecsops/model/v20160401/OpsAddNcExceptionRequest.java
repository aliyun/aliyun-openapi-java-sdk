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
public class OpsAddNcExceptionRequest extends RpcAcsRequest<OpsAddNcExceptionResponse> {
	   

	private String reason;

	private String warningValue;

	private String ncIps;

	private String exceptionName;

	private String token;

	private String warningKey;

	private String machineId;

	private String extensionData;

	private String auditParamStr;
	public OpsAddNcExceptionRequest() {
		super("Ecsops", "2016-04-01", "OpsAddNcException", "ecsops");
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

	public String getWarningValue() {
		return this.warningValue;
	}

	public void setWarningValue(String warningValue) {
		this.warningValue = warningValue;
		if(warningValue != null){
			putQueryParameter("WarningValue", warningValue);
		}
	}

	public String getNcIps() {
		return this.ncIps;
	}

	public void setNcIps(String ncIps) {
		this.ncIps = ncIps;
		if(ncIps != null){
			putQueryParameter("NcIps", ncIps);
		}
	}

	public String getExceptionName() {
		return this.exceptionName;
	}

	public void setExceptionName(String exceptionName) {
		this.exceptionName = exceptionName;
		if(exceptionName != null){
			putQueryParameter("ExceptionName", exceptionName);
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

	public String getWarningKey() {
		return this.warningKey;
	}

	public void setWarningKey(String warningKey) {
		this.warningKey = warningKey;
		if(warningKey != null){
			putQueryParameter("WarningKey", warningKey);
		}
	}

	public String getMachineId() {
		return this.machineId;
	}

	public void setMachineId(String machineId) {
		this.machineId = machineId;
		if(machineId != null){
			putQueryParameter("MachineId", machineId);
		}
	}

	public String getExtensionData() {
		return this.extensionData;
	}

	public void setExtensionData(String extensionData) {
		this.extensionData = extensionData;
		if(extensionData != null){
			putQueryParameter("ExtensionData", extensionData);
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
	public Class<OpsAddNcExceptionResponse> getResponseClass() {
		return OpsAddNcExceptionResponse.class;
	}

}
