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

package com.aliyuncs.das.model.v20200116;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.das.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyAutoScalingConfigRequest extends RpcAcsRequest<ModifyAutoScalingConfigResponse> {
	   

	private Bandwidth bandwidth;

	private Resource resource;

	private Storage storage;

	private Spec spec;

	private String instanceId;

	private Shard shard;
	public ModifyAutoScalingConfigRequest() {
		super("DAS", "2020-01-16", "ModifyAutoScalingConfig");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Bandwidth getBandwidth() {
		return this.bandwidth;
	}

	public void setBandwidth(Bandwidth bandwidth) {
		this.bandwidth = bandwidth;	
		if (bandwidth != null) {
			
				putQueryParameter("Bandwidth.ObservationWindowSize" , bandwidth.getObservationWindowSize());
				putQueryParameter("Bandwidth.Upgrade" , bandwidth.getUpgrade());
				putQueryParameter("Bandwidth.Apply" , bandwidth.getApply());
				putQueryParameter("Bandwidth.BandwidthUsageLowerThreshold" , bandwidth.getBandwidthUsageLowerThreshold());
				putQueryParameter("Bandwidth.Downgrade" , bandwidth.getDowngrade());
				putQueryParameter("Bandwidth.BandwidthUsageUpperThreshold" , bandwidth.getBandwidthUsageUpperThreshold());
		}	
	}

	public Resource getResource() {
		return this.resource;
	}

	public void setResource(Resource resource) {
		this.resource = resource;	
		if (resource != null) {
			
				putQueryParameter("Resource.Apply" , resource.getApply());
				putQueryParameter("Resource.Enable" , resource.getEnable());
				putQueryParameter("Resource.UpgradeObservationWindowSize" , resource.getUpgradeObservationWindowSize());
				putQueryParameter("Resource.DowngradeObservationWindowSize" , resource.getDowngradeObservationWindowSize());
				putQueryParameter("Resource.CpuUsageUpperThreshold" , resource.getCpuUsageUpperThreshold());
		}	
	}

	public Storage getStorage() {
		return this.storage;
	}

	public void setStorage(Storage storage) {
		this.storage = storage;	
		if (storage != null) {
			
				putQueryParameter("Storage.Upgrade" , storage.getUpgrade());
				putQueryParameter("Storage.Apply" , storage.getApply());
				putQueryParameter("Storage.MaxStorage" , storage.getMaxStorage());
				putQueryParameter("Storage.DiskUsageUpperThreshold" , storage.getDiskUsageUpperThreshold());
		}	
	}

	public Spec getSpec() {
		return this.spec;
	}

	public void setSpec(Spec spec) {
		this.spec = spec;	
		if (spec != null) {
			
				putQueryParameter("Spec.ObservationWindowSize" , spec.getObservationWindowSize());
				putQueryParameter("Spec.MaxSpec" , spec.getMaxSpec());
				putQueryParameter("Spec.Upgrade" , spec.getUpgrade());
				putQueryParameter("Spec.Apply" , spec.getApply());
				putQueryParameter("Spec.MemUsageUpperThreshold" , spec.getMemUsageUpperThreshold());
				putQueryParameter("Spec.CoolDownTime" , spec.getCoolDownTime());
				putQueryParameter("Spec.CpuUsageUpperThreshold" , spec.getCpuUsageUpperThreshold());
				putQueryParameter("Spec.MaxReadOnlyNodes" , spec.getMaxReadOnlyNodes());
				putQueryParameter("Spec.Downgrade" , spec.getDowngrade());
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

	public Shard getShard() {
		return this.shard;
	}

	public void setShard(Shard shard) {
		this.shard = shard;	
		if (shard != null) {
			
				putQueryParameter("Shard.Upgrade" , shard.getUpgrade());
				putQueryParameter("Shard.Apply" , shard.getApply());
				putQueryParameter("Shard.MemUsageUpperThreshold" , shard.getMemUsageUpperThreshold());
				putQueryParameter("Shard.MinShards" , shard.getMinShards());
				putQueryParameter("Shard.UpgradeObservationWindowSize" , shard.getUpgradeObservationWindowSize());
				putQueryParameter("Shard.DowngradeObservationWindowSize" , shard.getDowngradeObservationWindowSize());
				putQueryParameter("Shard.MemUsageLowerThreshold" , shard.getMemUsageLowerThreshold());
				putQueryParameter("Shard.MaxShards" , shard.getMaxShards());
				putQueryParameter("Shard.Downgrade" , shard.getDowngrade());
		}	
	}

	public static class Bandwidth {

		private String observationWindowSize;

		private Boolean upgrade;

		private Boolean apply;

		private Integer bandwidthUsageLowerThreshold;

		private Boolean downgrade;

		private Integer bandwidthUsageUpperThreshold;

		public String getObservationWindowSize() {
			return this.observationWindowSize;
		}

		public void setObservationWindowSize(String observationWindowSize) {
			this.observationWindowSize = observationWindowSize;
		}

		public Boolean getUpgrade() {
			return this.upgrade;
		}

		public void setUpgrade(Boolean upgrade) {
			this.upgrade = upgrade;
		}

		public Boolean getApply() {
			return this.apply;
		}

		public void setApply(Boolean apply) {
			this.apply = apply;
		}

		public Integer getBandwidthUsageLowerThreshold() {
			return this.bandwidthUsageLowerThreshold;
		}

		public void setBandwidthUsageLowerThreshold(Integer bandwidthUsageLowerThreshold) {
			this.bandwidthUsageLowerThreshold = bandwidthUsageLowerThreshold;
		}

		public Boolean getDowngrade() {
			return this.downgrade;
		}

		public void setDowngrade(Boolean downgrade) {
			this.downgrade = downgrade;
		}

		public Integer getBandwidthUsageUpperThreshold() {
			return this.bandwidthUsageUpperThreshold;
		}

		public void setBandwidthUsageUpperThreshold(Integer bandwidthUsageUpperThreshold) {
			this.bandwidthUsageUpperThreshold = bandwidthUsageUpperThreshold;
		}
	}

	public static class Resource {

		private Boolean apply;

		private Boolean enable;

		private String upgradeObservationWindowSize;

		private String downgradeObservationWindowSize;

		private Integer cpuUsageUpperThreshold;

		public Boolean getApply() {
			return this.apply;
		}

		public void setApply(Boolean apply) {
			this.apply = apply;
		}

		public Boolean getEnable() {
			return this.enable;
		}

		public void setEnable(Boolean enable) {
			this.enable = enable;
		}

		public String getUpgradeObservationWindowSize() {
			return this.upgradeObservationWindowSize;
		}

		public void setUpgradeObservationWindowSize(String upgradeObservationWindowSize) {
			this.upgradeObservationWindowSize = upgradeObservationWindowSize;
		}

		public String getDowngradeObservationWindowSize() {
			return this.downgradeObservationWindowSize;
		}

		public void setDowngradeObservationWindowSize(String downgradeObservationWindowSize) {
			this.downgradeObservationWindowSize = downgradeObservationWindowSize;
		}

		public Integer getCpuUsageUpperThreshold() {
			return this.cpuUsageUpperThreshold;
		}

		public void setCpuUsageUpperThreshold(Integer cpuUsageUpperThreshold) {
			this.cpuUsageUpperThreshold = cpuUsageUpperThreshold;
		}
	}

	public static class Storage {

		private Boolean upgrade;

		private Boolean apply;

		private Integer maxStorage;

		private Integer diskUsageUpperThreshold;

		public Boolean getUpgrade() {
			return this.upgrade;
		}

		public void setUpgrade(Boolean upgrade) {
			this.upgrade = upgrade;
		}

		public Boolean getApply() {
			return this.apply;
		}

		public void setApply(Boolean apply) {
			this.apply = apply;
		}

		public Integer getMaxStorage() {
			return this.maxStorage;
		}

		public void setMaxStorage(Integer maxStorage) {
			this.maxStorage = maxStorage;
		}

		public Integer getDiskUsageUpperThreshold() {
			return this.diskUsageUpperThreshold;
		}

		public void setDiskUsageUpperThreshold(Integer diskUsageUpperThreshold) {
			this.diskUsageUpperThreshold = diskUsageUpperThreshold;
		}
	}

	public static class Spec {

		private String observationWindowSize;

		private String maxSpec;

		private Boolean upgrade;

		private Boolean apply;

		private Integer memUsageUpperThreshold;

		private String coolDownTime;

		private Integer cpuUsageUpperThreshold;

		private Integer maxReadOnlyNodes;

		private Boolean downgrade;

		public String getObservationWindowSize() {
			return this.observationWindowSize;
		}

		public void setObservationWindowSize(String observationWindowSize) {
			this.observationWindowSize = observationWindowSize;
		}

		public String getMaxSpec() {
			return this.maxSpec;
		}

		public void setMaxSpec(String maxSpec) {
			this.maxSpec = maxSpec;
		}

		public Boolean getUpgrade() {
			return this.upgrade;
		}

		public void setUpgrade(Boolean upgrade) {
			this.upgrade = upgrade;
		}

		public Boolean getApply() {
			return this.apply;
		}

		public void setApply(Boolean apply) {
			this.apply = apply;
		}

		public Integer getMemUsageUpperThreshold() {
			return this.memUsageUpperThreshold;
		}

		public void setMemUsageUpperThreshold(Integer memUsageUpperThreshold) {
			this.memUsageUpperThreshold = memUsageUpperThreshold;
		}

		public String getCoolDownTime() {
			return this.coolDownTime;
		}

		public void setCoolDownTime(String coolDownTime) {
			this.coolDownTime = coolDownTime;
		}

		public Integer getCpuUsageUpperThreshold() {
			return this.cpuUsageUpperThreshold;
		}

		public void setCpuUsageUpperThreshold(Integer cpuUsageUpperThreshold) {
			this.cpuUsageUpperThreshold = cpuUsageUpperThreshold;
		}

		public Integer getMaxReadOnlyNodes() {
			return this.maxReadOnlyNodes;
		}

		public void setMaxReadOnlyNodes(Integer maxReadOnlyNodes) {
			this.maxReadOnlyNodes = maxReadOnlyNodes;
		}

		public Boolean getDowngrade() {
			return this.downgrade;
		}

		public void setDowngrade(Boolean downgrade) {
			this.downgrade = downgrade;
		}
	}

	public static class Shard {

		private Boolean upgrade;

		private Boolean apply;

		private Integer memUsageUpperThreshold;

		private Integer minShards;

		private String upgradeObservationWindowSize;

		private String downgradeObservationWindowSize;

		private Integer memUsageLowerThreshold;

		private Integer maxShards;

		private Boolean downgrade;

		public Boolean getUpgrade() {
			return this.upgrade;
		}

		public void setUpgrade(Boolean upgrade) {
			this.upgrade = upgrade;
		}

		public Boolean getApply() {
			return this.apply;
		}

		public void setApply(Boolean apply) {
			this.apply = apply;
		}

		public Integer getMemUsageUpperThreshold() {
			return this.memUsageUpperThreshold;
		}

		public void setMemUsageUpperThreshold(Integer memUsageUpperThreshold) {
			this.memUsageUpperThreshold = memUsageUpperThreshold;
		}

		public Integer getMinShards() {
			return this.minShards;
		}

		public void setMinShards(Integer minShards) {
			this.minShards = minShards;
		}

		public String getUpgradeObservationWindowSize() {
			return this.upgradeObservationWindowSize;
		}

		public void setUpgradeObservationWindowSize(String upgradeObservationWindowSize) {
			this.upgradeObservationWindowSize = upgradeObservationWindowSize;
		}

		public String getDowngradeObservationWindowSize() {
			return this.downgradeObservationWindowSize;
		}

		public void setDowngradeObservationWindowSize(String downgradeObservationWindowSize) {
			this.downgradeObservationWindowSize = downgradeObservationWindowSize;
		}

		public Integer getMemUsageLowerThreshold() {
			return this.memUsageLowerThreshold;
		}

		public void setMemUsageLowerThreshold(Integer memUsageLowerThreshold) {
			this.memUsageLowerThreshold = memUsageLowerThreshold;
		}

		public Integer getMaxShards() {
			return this.maxShards;
		}

		public void setMaxShards(Integer maxShards) {
			this.maxShards = maxShards;
		}

		public Boolean getDowngrade() {
			return this.downgrade;
		}

		public void setDowngrade(Boolean downgrade) {
			this.downgrade = downgrade;
		}
	}

	@Override
	public Class<ModifyAutoScalingConfigResponse> getResponseClass() {
		return ModifyAutoScalingConfigResponse.class;
	}

}
