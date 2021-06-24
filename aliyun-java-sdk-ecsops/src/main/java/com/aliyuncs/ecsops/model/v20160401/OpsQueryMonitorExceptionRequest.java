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
public class OpsQueryMonitorExceptionRequest extends RpcAcsRequest<OpsQueryMonitorExceptionResponse> {
	   

	private Integer timeRange;

	private Boolean expert;

	private String exceptionTime;

	private String exceptionName;

	private Boolean notify;

	private String machineId;

	private String auditParamStr;
	public OpsQueryMonitorExceptionRequest() {
		super("Ecsops", "2016-04-01", "OpsQueryMonitorException", "ecsops");
		setMethod(MethodType.POST);
	}

	public Integer getTimeRange() {
		return this.timeRange;
	}

	public void setTimeRange(Integer timeRange) {
		this.timeRange = timeRange;
		if(timeRange != null){
			putQueryParameter("TimeRange", timeRange.toString());
		}
	}

	public Boolean getExpert() {
		return this.expert;
	}

	public void setExpert(Boolean expert) {
		this.expert = expert;
		if(expert != null){
			putQueryParameter("Expert", expert.toString());
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

	public String getExceptionName() {
		return this.exceptionName;
	}

	public void setExceptionName(String exceptionName) {
		this.exceptionName = exceptionName;
		if(exceptionName != null){
			putQueryParameter("ExceptionName", exceptionName);
		}
	}

	public Boolean getNotify() {
		return this.notify;
	}

	public void setNotify(Boolean notify) {
		this.notify = notify;
		if(notify != null){
			putQueryParameter("Notify", notify.toString());
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
	public Class<OpsQueryMonitorExceptionResponse> getResponseClass() {
		return OpsQueryMonitorExceptionResponse.class;
	}

}
