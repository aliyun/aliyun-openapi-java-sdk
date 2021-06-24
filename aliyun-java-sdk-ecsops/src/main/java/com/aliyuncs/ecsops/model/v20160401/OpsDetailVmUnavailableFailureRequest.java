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
public class OpsDetailVmUnavailableFailureRequest extends RpcAcsRequest<OpsDetailVmUnavailableFailureResponse> {
	   

	private String detailType;

	private String startTime;

	private Integer pageNumber;

	private String groupDirects;

	private Integer pageSize;

	private String zoneFilterId;

	private String aliuid;

	private String migratedFlag;

	private String endTime;

	private String ncIp;

	private String gocExceptionName;

	private String instanceId;

	private String groupFields;

	private String regionFilterId;

	private String orderDirects;

	private String bid;

	private String orderFields;

	private String auditParamStr;

	private String clusterFilterId;
	public OpsDetailVmUnavailableFailureRequest() {
		super("Ecsops", "2016-04-01", "OpsDetailVmUnavailableFailure", "ecsops");
		setMethod(MethodType.POST);
	}

	public String getDetailType() {
		return this.detailType;
	}

	public void setDetailType(String detailType) {
		this.detailType = detailType;
		if(detailType != null){
			putQueryParameter("DetailType", detailType);
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

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public String getGroupDirects() {
		return this.groupDirects;
	}

	public void setGroupDirects(String groupDirects) {
		this.groupDirects = groupDirects;
		if(groupDirects != null){
			putQueryParameter("GroupDirects", groupDirects);
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

	public String getMigratedFlag() {
		return this.migratedFlag;
	}

	public void setMigratedFlag(String migratedFlag) {
		this.migratedFlag = migratedFlag;
		if(migratedFlag != null){
			putQueryParameter("MigratedFlag", migratedFlag);
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

	public String getGroupFields() {
		return this.groupFields;
	}

	public void setGroupFields(String groupFields) {
		this.groupFields = groupFields;
		if(groupFields != null){
			putQueryParameter("GroupFields", groupFields);
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

	public String getOrderDirects() {
		return this.orderDirects;
	}

	public void setOrderDirects(String orderDirects) {
		this.orderDirects = orderDirects;
		if(orderDirects != null){
			putQueryParameter("OrderDirects", orderDirects);
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

	public String getOrderFields() {
		return this.orderFields;
	}

	public void setOrderFields(String orderFields) {
		this.orderFields = orderFields;
		if(orderFields != null){
			putQueryParameter("OrderFields", orderFields);
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
	public Class<OpsDetailVmUnavailableFailureResponse> getResponseClass() {
		return OpsDetailVmUnavailableFailureResponse.class;
	}

}
