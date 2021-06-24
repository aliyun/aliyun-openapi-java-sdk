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
public class OpsQueryDiagnoseFeedbackInfoRequest extends RpcAcsRequest<OpsQueryDiagnoseFeedbackInfoResponse> {
	   

	private String srcExceptionTime;

	private String srcExceptionName;

	private String ncIp;

	private String machineId;

	private String srcExceptionReason;

	private String srcExceptionType;

	private String auditParamStr;
	public OpsQueryDiagnoseFeedbackInfoRequest() {
		super("Ecsops", "2016-04-01", "OpsQueryDiagnoseFeedbackInfo", "ecsops");
		setMethod(MethodType.POST);
	}

	public String getSrcExceptionTime() {
		return this.srcExceptionTime;
	}

	public void setSrcExceptionTime(String srcExceptionTime) {
		this.srcExceptionTime = srcExceptionTime;
		if(srcExceptionTime != null){
			putQueryParameter("SrcExceptionTime", srcExceptionTime);
		}
	}

	public String getSrcExceptionName() {
		return this.srcExceptionName;
	}

	public void setSrcExceptionName(String srcExceptionName) {
		this.srcExceptionName = srcExceptionName;
		if(srcExceptionName != null){
			putQueryParameter("SrcExceptionName", srcExceptionName);
		}
	}

	public String getNcIp() {
		return this.ncIp;
	}

	public void setNcIp(String ncIp) {
		this.ncIp = ncIp;
		if(ncIp != null){
			putQueryParameter("ncIp", ncIp);
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

	public String getSrcExceptionReason() {
		return this.srcExceptionReason;
	}

	public void setSrcExceptionReason(String srcExceptionReason) {
		this.srcExceptionReason = srcExceptionReason;
		if(srcExceptionReason != null){
			putQueryParameter("SrcExceptionReason", srcExceptionReason);
		}
	}

	public String getSrcExceptionType() {
		return this.srcExceptionType;
	}

	public void setSrcExceptionType(String srcExceptionType) {
		this.srcExceptionType = srcExceptionType;
		if(srcExceptionType != null){
			putQueryParameter("SrcExceptionType", srcExceptionType);
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
	public Class<OpsQueryDiagnoseFeedbackInfoResponse> getResponseClass() {
		return OpsQueryDiagnoseFeedbackInfoResponse.class;
	}

}
