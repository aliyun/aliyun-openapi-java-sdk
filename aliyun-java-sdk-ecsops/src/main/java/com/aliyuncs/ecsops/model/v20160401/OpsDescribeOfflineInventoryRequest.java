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
public class OpsDescribeOfflineInventoryRequest extends RpcAcsRequest<OpsDescribeOfflineInventoryResponse> {
	   

	private String operator;

	private Integer capacity;

	private String nextToken;

	private Integer pageSize;

	private String instanceType;

	private String networkArch;

	private String idc;

	private String ncType;

	private String zoneId;

	private Integer periodDay;

	private String auditParamStr;
	public OpsDescribeOfflineInventoryRequest() {
		super("Ecsops", "2016-04-01", "OpsDescribeOfflineInventory", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
		if(operator != null){
			putQueryParameter("Operator", operator);
		}
	}

	public Integer getCapacity() {
		return this.capacity;
	}

	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
		if(capacity != null){
			putQueryParameter("Capacity", capacity.toString());
		}
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
		if(nextToken != null){
			putQueryParameter("NextToken", nextToken);
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

	public String getInstanceType() {
		return this.instanceType;
	}

	public void setInstanceType(String instanceType) {
		this.instanceType = instanceType;
		if(instanceType != null){
			putQueryParameter("InstanceType", instanceType);
		}
	}

	public String getNetworkArch() {
		return this.networkArch;
	}

	public void setNetworkArch(String networkArch) {
		this.networkArch = networkArch;
		if(networkArch != null){
			putQueryParameter("NetworkArch", networkArch);
		}
	}

	public String getIdc() {
		return this.idc;
	}

	public void setIdc(String idc) {
		this.idc = idc;
		if(idc != null){
			putQueryParameter("Idc", idc);
		}
	}

	public String getNcType() {
		return this.ncType;
	}

	public void setNcType(String ncType) {
		this.ncType = ncType;
		if(ncType != null){
			putQueryParameter("NcType", ncType);
		}
	}

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
		if(zoneId != null){
			putQueryParameter("ZoneId", zoneId);
		}
	}

	public Integer getPeriodDay() {
		return this.periodDay;
	}

	public void setPeriodDay(Integer periodDay) {
		this.periodDay = periodDay;
		if(periodDay != null){
			putQueryParameter("PeriodDay", periodDay.toString());
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
	public Class<OpsDescribeOfflineInventoryResponse> getResponseClass() {
		return OpsDescribeOfflineInventoryResponse.class;
	}

}
