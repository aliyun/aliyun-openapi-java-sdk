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
public class OpsAddDrillEventRequest extends RpcAcsRequest<OpsAddDrillEventResponse> {
	   

	private String drillStartTime;

	private String machineIds;

	private String drillRegion;

	private String drillEndTime;

	private String drillReason;

	private String clusters;

	private String auditParamStr;
	public OpsAddDrillEventRequest() {
		super("Ecsops", "2016-04-01", "OpsAddDrillEvent", "ecsops");
		setMethod(MethodType.POST);
	}

	public String getDrillStartTime() {
		return this.drillStartTime;
	}

	public void setDrillStartTime(String drillStartTime) {
		this.drillStartTime = drillStartTime;
		if(drillStartTime != null){
			putQueryParameter("DrillStartTime", drillStartTime);
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

	public String getDrillRegion() {
		return this.drillRegion;
	}

	public void setDrillRegion(String drillRegion) {
		this.drillRegion = drillRegion;
		if(drillRegion != null){
			putQueryParameter("DrillRegion", drillRegion);
		}
	}

	public String getDrillEndTime() {
		return this.drillEndTime;
	}

	public void setDrillEndTime(String drillEndTime) {
		this.drillEndTime = drillEndTime;
		if(drillEndTime != null){
			putQueryParameter("DrillEndTime", drillEndTime);
		}
	}

	public String getDrillReason() {
		return this.drillReason;
	}

	public void setDrillReason(String drillReason) {
		this.drillReason = drillReason;
		if(drillReason != null){
			putQueryParameter("DrillReason", drillReason);
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
	public Class<OpsAddDrillEventResponse> getResponseClass() {
		return OpsAddDrillEventResponse.class;
	}

}
