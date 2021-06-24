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
public class OpsQueryDetailMetricRequest extends RpcAcsRequest<OpsQueryDetailMetricResponse> {
	   

	private String slsConfigName;

	private String analyse;

	private String endTime;

	private String exceptionTime;

	private String startTime;

	private String exceptionName;

	private String machineId;

	private String extra;

	private String logstore;

	private String auditParamStr;
	public OpsQueryDetailMetricRequest() {
		super("Ecsops", "2016-04-01", "OpsQueryDetailMetric", "ecsops");
		setMethod(MethodType.POST);
	}

	public String getSlsConfigName() {
		return this.slsConfigName;
	}

	public void setSlsConfigName(String slsConfigName) {
		this.slsConfigName = slsConfigName;
		if(slsConfigName != null){
			putQueryParameter("SlsConfigName", slsConfigName);
		}
	}

	public String getAnalyse() {
		return this.analyse;
	}

	public void setAnalyse(String analyse) {
		this.analyse = analyse;
		if(analyse != null){
			putQueryParameter("Analyse", analyse);
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

	public String getExceptionName() {
		return this.exceptionName;
	}

	public void setExceptionName(String exceptionName) {
		this.exceptionName = exceptionName;
		if(exceptionName != null){
			putQueryParameter("ExceptionName", exceptionName);
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

	public String getExtra() {
		return this.extra;
	}

	public void setExtra(String extra) {
		this.extra = extra;
		if(extra != null){
			putQueryParameter("Extra", extra);
		}
	}

	public String getLogstore() {
		return this.logstore;
	}

	public void setLogstore(String logstore) {
		this.logstore = logstore;
		if(logstore != null){
			putQueryParameter("Logstore", logstore);
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
	public Class<OpsQueryDetailMetricResponse> getResponseClass() {
		return OpsQueryDetailMetricResponse.class;
	}

}
