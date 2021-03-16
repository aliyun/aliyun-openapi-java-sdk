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
public class OpsRealtimeDetectByScriptRequest extends RpcAcsRequest<OpsRealtimeDetectByScriptResponse> {
	   

	private String detectConfig;

	private Boolean sync;

	private String ncIp;

	private String machineId;

	private String taskUids;

	private String detectName;

	private Boolean ignoreEnable;

	private Boolean includeHost;

	private String auditParamStr;
	public OpsRealtimeDetectByScriptRequest() {
		super("Ecsops", "2016-04-01", "OpsRealtimeDetectByScript", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDetectConfig() {
		return this.detectConfig;
	}

	public void setDetectConfig(String detectConfig) {
		this.detectConfig = detectConfig;
		if(detectConfig != null){
			putQueryParameter("DetectConfig", detectConfig);
		}
	}

	public Boolean getSync() {
		return this.sync;
	}

	public void setSync(Boolean sync) {
		this.sync = sync;
		if(sync != null){
			putQueryParameter("Sync", sync.toString());
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

	public String getMachineId() {
		return this.machineId;
	}

	public void setMachineId(String machineId) {
		this.machineId = machineId;
		if(machineId != null){
			putQueryParameter("MachineId", machineId);
		}
	}

	public String getTaskUids() {
		return this.taskUids;
	}

	public void setTaskUids(String taskUids) {
		this.taskUids = taskUids;
		if(taskUids != null){
			putQueryParameter("TaskUids", taskUids);
		}
	}

	public String getDetectName() {
		return this.detectName;
	}

	public void setDetectName(String detectName) {
		this.detectName = detectName;
		if(detectName != null){
			putQueryParameter("DetectName", detectName);
		}
	}

	public Boolean getIgnoreEnable() {
		return this.ignoreEnable;
	}

	public void setIgnoreEnable(Boolean ignoreEnable) {
		this.ignoreEnable = ignoreEnable;
		if(ignoreEnable != null){
			putQueryParameter("IgnoreEnable", ignoreEnable.toString());
		}
	}

	public Boolean getIncludeHost() {
		return this.includeHost;
	}

	public void setIncludeHost(Boolean includeHost) {
		this.includeHost = includeHost;
		if(includeHost != null){
			putQueryParameter("IncludeHost", includeHost.toString());
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
	public Class<OpsRealtimeDetectByScriptResponse> getResponseClass() {
		return OpsRealtimeDetectByScriptResponse.class;
	}

}
