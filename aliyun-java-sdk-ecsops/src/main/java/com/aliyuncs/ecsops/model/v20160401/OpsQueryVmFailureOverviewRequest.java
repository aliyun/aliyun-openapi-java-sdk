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
public class OpsQueryVmFailureOverviewRequest extends RpcAcsRequest<OpsQueryVmFailureOverviewResponse> {
	   

	private String queryGroupField;

	private String endTime;

	private String startTime;

	private String gocExceptionName;

	private String regionFilterId;

	private String zoneFilterId;

	private String aliuid;

	private String bid;

	private String auditParamStr;

	private String clusterFilterId;
	public OpsQueryVmFailureOverviewRequest() {
		super("Ecsops", "2016-04-01", "OpsQueryVmFailureOverview", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getQueryGroupField() {
		return this.queryGroupField;
	}

	public void setQueryGroupField(String queryGroupField) {
		this.queryGroupField = queryGroupField;
		if(queryGroupField != null){
			putQueryParameter("QueryGroupField", queryGroupField);
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

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime);
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

	public String getRegionFilterId() {
		return this.regionFilterId;
	}

	public void setRegionFilterId(String regionFilterId) {
		this.regionFilterId = regionFilterId;
		if(regionFilterId != null){
			putQueryParameter("RegionFilterId", regionFilterId);
		}
	}

	public String getZoneFilterId() {
		return this.zoneFilterId;
	}

	public void setZoneFilterId(String zoneFilterId) {
		this.zoneFilterId = zoneFilterId;
		if(zoneFilterId != null){
			putQueryParameter("ZoneFilterId", zoneFilterId);
		}
	}

	public String getAliuid() {
		return this.aliuid;
	}

	public void setAliuid(String aliuid) {
		this.aliuid = aliuid;
		if(aliuid != null){
			putQueryParameter("Aliuid", aliuid);
		}
	}

	public String getBid() {
		return this.bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
		if(bid != null){
			putQueryParameter("Bid", bid);
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

	public String getClusterFilterId() {
		return this.clusterFilterId;
	}

	public void setClusterFilterId(String clusterFilterId) {
		this.clusterFilterId = clusterFilterId;
		if(clusterFilterId != null){
			putQueryParameter("ClusterFilterId", clusterFilterId);
		}
	}

	@Override
	public Class<OpsQueryVmFailureOverviewResponse> getResponseClass() {
		return OpsQueryVmFailureOverviewResponse.class;
	}

}
