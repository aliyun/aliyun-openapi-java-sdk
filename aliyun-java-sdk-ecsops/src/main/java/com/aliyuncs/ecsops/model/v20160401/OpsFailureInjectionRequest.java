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
public class OpsFailureInjectionRequest extends RpcAcsRequest<OpsFailureInjectionResponse> {
	   

	private Boolean dryRun;

	private Boolean recovery;

	private String failureType;

	private String machineType;

	private String machineId;

	private Integer failureDuration;

	private String injectionTime;

	private String auditParamStr;
	public OpsFailureInjectionRequest() {
		super("Ecsops", "2016-04-01", "OpsFailureInjection", "ecsops");
		setMethod(MethodType.POST);
	}

	public Boolean getDryRun() {
		return this.dryRun;
	}

	public void setDryRun(Boolean dryRun) {
		this.dryRun = dryRun;
		if(dryRun != null){
			putQueryParameter("DryRun", dryRun.toString());
		}
	}

	public Boolean getRecovery() {
		return this.recovery;
	}

	public void setRecovery(Boolean recovery) {
		this.recovery = recovery;
		if(recovery != null){
			putQueryParameter("Recovery", recovery.toString());
		}
	}

	public String getFailureType() {
		return this.failureType;
	}

	public void setFailureType(String failureType) {
		this.failureType = failureType;
		if(failureType != null){
			putQueryParameter("FailureType", failureType);
		}
	}

	public String getMachineType() {
		return this.machineType;
	}

	public void setMachineType(String machineType) {
		this.machineType = machineType;
		if(machineType != null){
			putQueryParameter("MachineType", machineType);
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

	public Integer getFailureDuration() {
		return this.failureDuration;
	}

	public void setFailureDuration(Integer failureDuration) {
		this.failureDuration = failureDuration;
		if(failureDuration != null){
			putQueryParameter("FailureDuration", failureDuration.toString());
		}
	}

	public String getInjectionTime() {
		return this.injectionTime;
	}

	public void setInjectionTime(String injectionTime) {
		this.injectionTime = injectionTime;
		if(injectionTime != null){
			putQueryParameter("InjectionTime", injectionTime);
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
	public Class<OpsFailureInjectionResponse> getResponseClass() {
		return OpsFailureInjectionResponse.class;
	}

}
