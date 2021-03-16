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
public class OpsDescribeSpotInstancesRequest extends RpcAcsRequest<OpsDescribeSpotInstancesResponse> {
	   

	private Boolean ioOptimized;

	private String networkType;

	private Integer pageNumber;

	private Integer pageSize;

	private String instanceType;

	private Long aliUid;

	private Boolean isRecycling;

	private String izIds;

	private String instanceTypeFamily;

	private String createTimeFrom;

	private Integer spotStrategy;

	private Boolean isReachTermination;

	private String instanceIds;

	private String createTimeTo;

	private String zoneId;

	private String izId;

	private String auditParamStr;
	public OpsDescribeSpotInstancesRequest() {
		super("Ecsops", "2016-04-01", "OpsDescribeSpotInstances", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getIoOptimized() {
		return this.ioOptimized;
	}

	public void setIoOptimized(Boolean ioOptimized) {
		this.ioOptimized = ioOptimized;
		if(ioOptimized != null){
			putQueryParameter("IoOptimized", ioOptimized.toString());
		}
	}

	public String getNetworkType() {
		return this.networkType;
	}

	public void setNetworkType(String networkType) {
		this.networkType = networkType;
		if(networkType != null){
			putQueryParameter("NetworkType", networkType);
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

	public String getInstanceType() {
		return this.instanceType;
	}

	public void setInstanceType(String instanceType) {
		this.instanceType = instanceType;
		if(instanceType != null){
			putQueryParameter("InstanceType", instanceType);
		}
	}

	public Long getAliUid() {
		return this.aliUid;
	}

	public void setAliUid(Long aliUid) {
		this.aliUid = aliUid;
		if(aliUid != null){
			putQueryParameter("AliUid", aliUid.toString());
		}
	}

	public Boolean getIsRecycling() {
		return this.isRecycling;
	}

	public void setIsRecycling(Boolean isRecycling) {
		this.isRecycling = isRecycling;
		if(isRecycling != null){
			putQueryParameter("IsRecycling", isRecycling.toString());
		}
	}

	public String getIzIds() {
		return this.izIds;
	}

	public void setIzIds(String izIds) {
		this.izIds = izIds;
		if(izIds != null){
			putQueryParameter("IzIds", izIds);
		}
	}

	public String getInstanceTypeFamily() {
		return this.instanceTypeFamily;
	}

	public void setInstanceTypeFamily(String instanceTypeFamily) {
		this.instanceTypeFamily = instanceTypeFamily;
		if(instanceTypeFamily != null){
			putQueryParameter("InstanceTypeFamily", instanceTypeFamily);
		}
	}

	public String getCreateTimeFrom() {
		return this.createTimeFrom;
	}

	public void setCreateTimeFrom(String createTimeFrom) {
		this.createTimeFrom = createTimeFrom;
		if(createTimeFrom != null){
			putQueryParameter("CreateTimeFrom", createTimeFrom);
		}
	}

	public Integer getSpotStrategy() {
		return this.spotStrategy;
	}

	public void setSpotStrategy(Integer spotStrategy) {
		this.spotStrategy = spotStrategy;
		if(spotStrategy != null){
			putQueryParameter("SpotStrategy", spotStrategy.toString());
		}
	}

	public Boolean getIsReachTermination() {
		return this.isReachTermination;
	}

	public void setIsReachTermination(Boolean isReachTermination) {
		this.isReachTermination = isReachTermination;
		if(isReachTermination != null){
			putQueryParameter("IsReachTermination", isReachTermination.toString());
		}
	}

	public String getInstanceIds() {
		return this.instanceIds;
	}

	public void setInstanceIds(String instanceIds) {
		this.instanceIds = instanceIds;
		if(instanceIds != null){
			putQueryParameter("InstanceIds", instanceIds);
		}
	}

	public String getCreateTimeTo() {
		return this.createTimeTo;
	}

	public void setCreateTimeTo(String createTimeTo) {
		this.createTimeTo = createTimeTo;
		if(createTimeTo != null){
			putQueryParameter("CreateTimeTo", createTimeTo);
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

	public String getIzId() {
		return this.izId;
	}

	public void setIzId(String izId) {
		this.izId = izId;
		if(izId != null){
			putQueryParameter("IzId", izId);
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
	public Class<OpsDescribeSpotInstancesResponse> getResponseClass() {
		return OpsDescribeSpotInstancesResponse.class;
	}

}
