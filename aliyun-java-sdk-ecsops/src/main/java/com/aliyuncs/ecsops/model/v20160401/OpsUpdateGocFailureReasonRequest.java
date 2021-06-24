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
public class OpsUpdateGocFailureReasonRequest extends RpcAcsRequest<OpsUpdateGocFailureReasonResponse> {
	   

	private String reason;

	private String endTime;

	private String exceptionTime;

	private String startTime;

	private String ncIp;

	private String gocExceptionName;

	private String instanceId;

	private String extensionInfo;

	private String auditParamStr;
	public OpsUpdateGocFailureReasonRequest() {
		super("Ecsops", "2016-04-01", "OpsUpdateGocFailureReason", "ecsops");
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

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("EndTime", endTime);
		}
	}

	public String getExceptionTime() {
		return this.exceptionTime;
	}

	public void setExceptionTime(String exceptionTime) {
		this.exceptionTime = exceptionTime;
		if(exceptionTime != null){
			putQueryParameter("ExceptionTime", exceptionTime);
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

	public String getNcIp() {
		return this.ncIp;
	}

	public void setNcIp(String ncIp) {
		this.ncIp = ncIp;
		if(ncIp != null){
			putQueryParameter("NcIp", ncIp);
		}
	}

	public String getGocExceptionName() {
		return this.gocExceptionName;
	}

	public void setGocExceptionName(String gocExceptionName) {
		this.gocExceptionName = gocExceptionName;
		if(gocExceptionName != null){
			putQueryParameter("GocExceptionName", gocExceptionName);
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

	public String getExtensionInfo() {
		return this.extensionInfo;
	}

	public void setExtensionInfo(String extensionInfo) {
		this.extensionInfo = extensionInfo;
		if(extensionInfo != null){
			putQueryParameter("ExtensionInfo", extensionInfo);
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
	public Class<OpsUpdateGocFailureReasonResponse> getResponseClass() {
		return OpsUpdateGocFailureReasonResponse.class;
	}

}
