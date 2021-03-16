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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecsops.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeResourcePlanningRequest extends RpcAcsRequest<OpsDescribeResourcePlanningResponse> {
	   

	private String bizRegionId;

	private Integer memory;

	private String ioOptimized;

	private String networkType;

	private String expectedTimeBegin;

	private Integer cores;

	private Long aliUid;

	private String instanceChargeType;

	private String targetResourceType;

	private String priorityStrategy;

	private String instanceFamilyLevel;

	private List<String> zoneIds;

	private String expectedTimeEnd;

	private List<InstanceTypeModel> instanceTypeModels;

	private Integer targetCapacity;

	private String auditParamStr;
	public OpsDescribeResourcePlanningRequest() {
		super("Ecsops", "2016-04-01", "OpsDescribeResourcePlanning", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getBizRegionId() {
		return this.bizRegionId;
	}

	public void setBizRegionId(String bizRegionId) {
		this.bizRegionId = bizRegionId;
		if(bizRegionId != null){
			putQueryParameter("BizRegionId", bizRegionId);
		}
	}

	public Integer getMemory() {
		return this.memory;
	}

	public void setMemory(Integer memory) {
		this.memory = memory;
		if(memory != null){
			putQueryParameter("Memory", memory.toString());
		}
	}

	public String getIoOptimized() {
		return this.ioOptimized;
	}

	public void setIoOptimized(String ioOptimized) {
		this.ioOptimized = ioOptimized;
		if(ioOptimized != null){
			putQueryParameter("IoOptimized", ioOptimized);
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

	public String getExpectedTimeBegin() {
		return this.expectedTimeBegin;
	}

	public void setExpectedTimeBegin(String expectedTimeBegin) {
		this.expectedTimeBegin = expectedTimeBegin;
		if(expectedTimeBegin != null){
			putQueryParameter("ExpectedTimeBegin", expectedTimeBegin);
		}
	}

	public Integer getCores() {
		return this.cores;
	}

	public void setCores(Integer cores) {
		this.cores = cores;
		if(cores != null){
			putQueryParameter("Cores", cores.toString());
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

	public String getInstanceChargeType() {
		return this.instanceChargeType;
	}

	public void setInstanceChargeType(String instanceChargeType) {
		this.instanceChargeType = instanceChargeType;
		if(instanceChargeType != null){
			putQueryParameter("InstanceChargeType", instanceChargeType);
		}
	}

	public String getTargetResourceType() {
		return this.targetResourceType;
	}

	public void setTargetResourceType(String targetResourceType) {
		this.targetResourceType = targetResourceType;
		if(targetResourceType != null){
			putQueryParameter("TargetResourceType", targetResourceType);
		}
	}

	public String getPriorityStrategy() {
		return this.priorityStrategy;
	}

	public void setPriorityStrategy(String priorityStrategy) {
		this.priorityStrategy = priorityStrategy;
		if(priorityStrategy != null){
			putQueryParameter("PriorityStrategy", priorityStrategy);
		}
	}

	public String getInstanceFamilyLevel() {
		return this.instanceFamilyLevel;
	}

	public void setInstanceFamilyLevel(String instanceFamilyLevel) {
		this.instanceFamilyLevel = instanceFamilyLevel;
		if(instanceFamilyLevel != null){
			putQueryParameter("InstanceFamilyLevel", instanceFamilyLevel);
		}
	}

	public List<String> getZoneIds() {
		return this.zoneIds;
	}

	public void setZoneIds(List<String> zoneIds) {
		this.zoneIds = zoneIds;	
		if (zoneIds != null) {
			for (int i = 0; i < zoneIds.size(); i++) {
				putQueryParameter("ZoneId." + (i + 1) , zoneIds.get(i));
			}
		}	
	}

	public String getExpectedTimeEnd() {
		return this.expectedTimeEnd;
	}

	public void setExpectedTimeEnd(String expectedTimeEnd) {
		this.expectedTimeEnd = expectedTimeEnd;
		if(expectedTimeEnd != null){
			putQueryParameter("ExpectedTimeEnd", expectedTimeEnd);
		}
	}

	public List<InstanceTypeModel> getInstanceTypeModels() {
		return this.instanceTypeModels;
	}

	public void setInstanceTypeModels(List<InstanceTypeModel> instanceTypeModels) {
		this.instanceTypeModels = instanceTypeModels;	
		if (instanceTypeModels != null) {
			for (int depth1 = 0; depth1 < instanceTypeModels.size(); depth1++) {
				putQueryParameter("InstanceTypeModel." + (depth1 + 1) + ".InstanceType" , instanceTypeModels.get(depth1).getInstanceType());
				putQueryParameter("InstanceTypeModel." + (depth1 + 1) + ".WeightCapacity" , instanceTypeModels.get(depth1).getWeightCapacity());
			}
		}	
	}

	public Integer getTargetCapacity() {
		return this.targetCapacity;
	}

	public void setTargetCapacity(Integer targetCapacity) {
		this.targetCapacity = targetCapacity;
		if(targetCapacity != null){
			putQueryParameter("TargetCapacity", targetCapacity.toString());
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

	public static class InstanceTypeModel {

		private String instanceType;

		private Float weightCapacity;

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public Float getWeightCapacity() {
			return this.weightCapacity;
		}

		public void setWeightCapacity(Float weightCapacity) {
			this.weightCapacity = weightCapacity;
		}
	}

	@Override
	public Class<OpsDescribeResourcePlanningResponse> getResponseClass() {
		return OpsDescribeResourcePlanningResponse.class;
	}

}
