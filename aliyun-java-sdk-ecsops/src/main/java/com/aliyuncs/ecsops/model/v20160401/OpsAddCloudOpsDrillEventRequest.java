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
public class OpsAddCloudOpsDrillEventRequest extends RpcAcsRequest<OpsAddCloudOpsDrillEventResponse> {
	   

	private String startTime;

	private String title;

	private String key;

	private String clusters;

	private String endTime;

	private String machineIds;

	private String submitEmpNo;

	private String exceptionType;

	private String auditParamStr;
	public OpsAddCloudOpsDrillEventRequest() {
		super("Ecsops", "2016-04-01", "OpsAddCloudOpsDrillEvent", "ecsops");
		setMethod(MethodType.POST);
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

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
		if(title != null){
			putQueryParameter("Title", title);
		}
	}

	public String getKey() {
		return this.key;
	}

	public void setKey(String key) {
		this.key = key;
		if(key != null){
			putQueryParameter("Key", key);
		}
	}

	public String getClusters() {
		return this.clusters;
	}

	public void setClusters(String clusters) {
		this.clusters = clusters;
		if(clusters != null){
			putQueryParameter("Clusters", clusters);
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

	public String getMachineIds() {
		return this.machineIds;
	}

	public void setMachineIds(String machineIds) {
		this.machineIds = machineIds;
		if(machineIds != null){
			putQueryParameter("MachineIds", machineIds);
		}
	}

	public String getSubmitEmpNo() {
		return this.submitEmpNo;
	}

	public void setSubmitEmpNo(String submitEmpNo) {
		this.submitEmpNo = submitEmpNo;
		if(submitEmpNo != null){
			putQueryParameter("SubmitEmpNo", submitEmpNo);
		}
	}

	public String getExceptionType() {
		return this.exceptionType;
	}

	public void setExceptionType(String exceptionType) {
		this.exceptionType = exceptionType;
		if(exceptionType != null){
			putQueryParameter("ExceptionType", exceptionType);
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
	public Class<OpsAddCloudOpsDrillEventResponse> getResponseClass() {
		return OpsAddCloudOpsDrillEventResponse.class;
	}

}
