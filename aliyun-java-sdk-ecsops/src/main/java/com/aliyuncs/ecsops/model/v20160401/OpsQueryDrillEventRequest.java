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
public class OpsQueryDrillEventRequest extends RpcAcsRequest<OpsQueryDrillEventResponse> {
	   

	private String endTime;

	private String startTime;

	private String machineIds;

	private Integer pageNumber;

	private Integer pageSize;

	private String drillReason;

	private String clusters;

	private String auditParamStr;
	public OpsQueryDrillEventRequest() {
		super("Ecsops", "2016-04-01", "OpsQueryDrillEvent", "ecsops");
		setMethod(MethodType.POST);
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

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime);
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

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
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
	public Class<OpsQueryDrillEventResponse> getResponseClass() {
		return OpsQueryDrillEventResponse.class;
	}

}
