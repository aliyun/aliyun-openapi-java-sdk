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

package com.aliyuncs.ehpc.model.v20180412;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ehpc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ApplyNodesRequest extends RpcAcsRequest<ApplyNodesResponse> {
	   

	private String imageId;

	private Integer memory;

	private String systemDiskLevel;

	private Boolean allocatePublicAddress;

	private Integer internetMaxBandWidthOut;

	private String resourceAmountType;

	private Boolean strictResourceProvision;

	private String systemDiskType;

	private Integer cores;

	private Integer systemDiskSize;

	private List<ZoneInfos> zoneInfoss;

	private String hostNamePrefix;

	private Float computeSpotPriceLimit;

	private String clusterId;

	private String computeSpotStrategy;

	private String hostNameSuffix;

	private String priorityStrategy;

	private String instanceFamilyLevel;

	private String internetChargeType;

	private List<InstanceTypeModel> instanceTypeModels;

	private Integer internetMaxBandWidthIn;

	private Integer targetCapacity;

	private Boolean strictSatisfiedTargetCapacity;
	public ApplyNodesRequest() {
		super("EHPC", "2018-04-12", "ApplyNodes");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getImageId() {
		return this.imageId;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
		if(imageId != null){
			putQueryParameter("ImageId", imageId);
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

	public String getSystemDiskLevel() {
		return this.systemDiskLevel;
	}

	public void setSystemDiskLevel(String systemDiskLevel) {
		this.systemDiskLevel = systemDiskLevel;
		if(systemDiskLevel != null){
			putQueryParameter("SystemDiskLevel", systemDiskLevel);
		}
	}

	public Boolean getAllocatePublicAddress() {
		return this.allocatePublicAddress;
	}

	public void setAllocatePublicAddress(Boolean allocatePublicAddress) {
		this.allocatePublicAddress = allocatePublicAddress;
		if(allocatePublicAddress != null){
			putQueryParameter("AllocatePublicAddress", allocatePublicAddress.toString());
		}
	}

	public Integer getInternetMaxBandWidthOut() {
		return this.internetMaxBandWidthOut;
	}

	public void setInternetMaxBandWidthOut(Integer internetMaxBandWidthOut) {
		this.internetMaxBandWidthOut = internetMaxBandWidthOut;
		if(internetMaxBandWidthOut != null){
			putQueryParameter("InternetMaxBandWidthOut", internetMaxBandWidthOut.toString());
		}
	}

	public String getResourceAmountType() {
		return this.resourceAmountType;
	}

	public void setResourceAmountType(String resourceAmountType) {
		this.resourceAmountType = resourceAmountType;
		if(resourceAmountType != null){
			putQueryParameter("ResourceAmountType", resourceAmountType);
		}
	}

	public Boolean getStrictResourceProvision() {
		return this.strictResourceProvision;
	}

	public void setStrictResourceProvision(Boolean strictResourceProvision) {
		this.strictResourceProvision = strictResourceProvision;
		if(strictResourceProvision != null){
			putQueryParameter("StrictResourceProvision", strictResourceProvision.toString());
		}
	}

	public String getSystemDiskType() {
		return this.systemDiskType;
	}

	public void setSystemDiskType(String systemDiskType) {
		this.systemDiskType = systemDiskType;
		if(systemDiskType != null){
			putQueryParameter("SystemDiskType", systemDiskType);
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

	public Integer getSystemDiskSize() {
		return this.systemDiskSize;
	}

	public void setSystemDiskSize(Integer systemDiskSize) {
		this.systemDiskSize = systemDiskSize;
		if(systemDiskSize != null){
			putQueryParameter("SystemDiskSize", systemDiskSize.toString());
		}
	}

	public List<ZoneInfos> getZoneInfoss() {
		return this.zoneInfoss;
	}

	public void setZoneInfoss(List<ZoneInfos> zoneInfoss) {
		this.zoneInfoss = zoneInfoss;	
		if (zoneInfoss != null) {
			for (int depth1 = 0; depth1 < zoneInfoss.size(); depth1++) {
				putQueryParameter("ZoneInfos." + (depth1 + 1) + ".VSwitchId" , zoneInfoss.get(depth1).getVSwitchId());
				putQueryParameter("ZoneInfos." + (depth1 + 1) + ".ZoneId" , zoneInfoss.get(depth1).getZoneId());
			}
		}	
	}

	public String getHostNamePrefix() {
		return this.hostNamePrefix;
	}

	public void setHostNamePrefix(String hostNamePrefix) {
		this.hostNamePrefix = hostNamePrefix;
		if(hostNamePrefix != null){
			putQueryParameter("HostNamePrefix", hostNamePrefix);
		}
	}

	public Float getComputeSpotPriceLimit() {
		return this.computeSpotPriceLimit;
	}

	public void setComputeSpotPriceLimit(Float computeSpotPriceLimit) {
		this.computeSpotPriceLimit = computeSpotPriceLimit;
		if(computeSpotPriceLimit != null){
			putQueryParameter("ComputeSpotPriceLimit", computeSpotPriceLimit.toString());
		}
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putQueryParameter("ClusterId", clusterId);
		}
	}

	public String getComputeSpotStrategy() {
		return this.computeSpotStrategy;
	}

	public void setComputeSpotStrategy(String computeSpotStrategy) {
		this.computeSpotStrategy = computeSpotStrategy;
		if(computeSpotStrategy != null){
			putQueryParameter("ComputeSpotStrategy", computeSpotStrategy);
		}
	}

	public String getHostNameSuffix() {
		return this.hostNameSuffix;
	}

	public void setHostNameSuffix(String hostNameSuffix) {
		this.hostNameSuffix = hostNameSuffix;
		if(hostNameSuffix != null){
			putQueryParameter("HostNameSuffix", hostNameSuffix);
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

	public String getInternetChargeType() {
		return this.internetChargeType;
	}

	public void setInternetChargeType(String internetChargeType) {
		this.internetChargeType = internetChargeType;
		if(internetChargeType != null){
			putQueryParameter("InternetChargeType", internetChargeType);
		}
	}

	public List<InstanceTypeModel> getInstanceTypeModels() {
		return this.instanceTypeModels;
	}

	public void setInstanceTypeModels(List<InstanceTypeModel> instanceTypeModels) {
		this.instanceTypeModels = instanceTypeModels;	
		if (instanceTypeModels != null) {
			for (int depth1 = 0; depth1 < instanceTypeModels.size(); depth1++) {
				putQueryParameter("InstanceTypeModel." + (depth1 + 1) + ".MaxPrice" , instanceTypeModels.get(depth1).getMaxPrice());
				putQueryParameter("InstanceTypeModel." + (depth1 + 1) + ".TargetImageId" , instanceTypeModels.get(depth1).getTargetImageId());
				putQueryParameter("InstanceTypeModel." + (depth1 + 1) + ".InstanceType" , instanceTypeModels.get(depth1).getInstanceType());
			}
		}	
	}

	public Integer getInternetMaxBandWidthIn() {
		return this.internetMaxBandWidthIn;
	}

	public void setInternetMaxBandWidthIn(Integer internetMaxBandWidthIn) {
		this.internetMaxBandWidthIn = internetMaxBandWidthIn;
		if(internetMaxBandWidthIn != null){
			putQueryParameter("InternetMaxBandWidthIn", internetMaxBandWidthIn.toString());
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

	public Boolean getStrictSatisfiedTargetCapacity() {
		return this.strictSatisfiedTargetCapacity;
	}

	public void setStrictSatisfiedTargetCapacity(Boolean strictSatisfiedTargetCapacity) {
		this.strictSatisfiedTargetCapacity = strictSatisfiedTargetCapacity;
		if(strictSatisfiedTargetCapacity != null){
			putQueryParameter("StrictSatisfiedTargetCapacity", strictSatisfiedTargetCapacity.toString());
		}
	}

	public static class ZoneInfos {

		private String vSwitchId;

		private String zoneId;

		public String getVSwitchId() {
			return this.vSwitchId;
		}

		public void setVSwitchId(String vSwitchId) {
			this.vSwitchId = vSwitchId;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}
	}

	public static class InstanceTypeModel {

		private Float maxPrice;

		private String targetImageId;

		private String instanceType;

		public Float getMaxPrice() {
			return this.maxPrice;
		}

		public void setMaxPrice(Float maxPrice) {
			this.maxPrice = maxPrice;
		}

		public String getTargetImageId() {
			return this.targetImageId;
		}

		public void setTargetImageId(String targetImageId) {
			this.targetImageId = targetImageId;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}
	}

	@Override
	public Class<ApplyNodesResponse> getResponseClass() {
		return ApplyNodesResponse.class;
	}

}
