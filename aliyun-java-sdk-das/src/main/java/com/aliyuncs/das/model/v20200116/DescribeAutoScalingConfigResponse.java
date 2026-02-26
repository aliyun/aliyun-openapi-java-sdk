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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.das.transform.v20200116.DescribeAutoScalingConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAutoScalingConfigResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private String success;

	private Data data;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Spec spec;

		private Storage storage;

		private Resource resource;

		private Shard shard;

		private Bandwidth bandwidth;

		public Spec getSpec() {
			return this.spec;
		}

		public void setSpec(Spec spec) {
			this.spec = spec;
		}

		public Storage getStorage() {
			return this.storage;
		}

		public void setStorage(Storage storage) {
			this.storage = storage;
		}

		public Resource getResource() {
			return this.resource;
		}

		public void setResource(Resource resource) {
			this.resource = resource;
		}

		public Shard getShard() {
			return this.shard;
		}

		public void setShard(Shard shard) {
			this.shard = shard;
		}

		public Bandwidth getBandwidth() {
			return this.bandwidth;
		}

		public void setBandwidth(Bandwidth bandwidth) {
			this.bandwidth = bandwidth;
		}

		public static class Spec {

			private Boolean upgrade;

			private Integer cpuUsageUpperThreshold;

			private Integer memUsageUpperThreshold;

			private String maxSpec;

			private Integer maxReadOnlyNodes;

			private String observationWindowSize;

			private String coolDownTime;

			private Boolean downgrade;

			public Boolean getUpgrade() {
				return this.upgrade;
			}

			public void setUpgrade(Boolean upgrade) {
				this.upgrade = upgrade;
			}

			public Integer getCpuUsageUpperThreshold() {
				return this.cpuUsageUpperThreshold;
			}

			public void setCpuUsageUpperThreshold(Integer cpuUsageUpperThreshold) {
				this.cpuUsageUpperThreshold = cpuUsageUpperThreshold;
			}

			public Integer getMemUsageUpperThreshold() {
				return this.memUsageUpperThreshold;
			}

			public void setMemUsageUpperThreshold(Integer memUsageUpperThreshold) {
				this.memUsageUpperThreshold = memUsageUpperThreshold;
			}

			public String getMaxSpec() {
				return this.maxSpec;
			}

			public void setMaxSpec(String maxSpec) {
				this.maxSpec = maxSpec;
			}

			public Integer getMaxReadOnlyNodes() {
				return this.maxReadOnlyNodes;
			}

			public void setMaxReadOnlyNodes(Integer maxReadOnlyNodes) {
				this.maxReadOnlyNodes = maxReadOnlyNodes;
			}

			public String getObservationWindowSize() {
				return this.observationWindowSize;
			}

			public void setObservationWindowSize(String observationWindowSize) {
				this.observationWindowSize = observationWindowSize;
			}

			public String getCoolDownTime() {
				return this.coolDownTime;
			}

			public void setCoolDownTime(String coolDownTime) {
				this.coolDownTime = coolDownTime;
			}

			public Boolean getDowngrade() {
				return this.downgrade;
			}

			public void setDowngrade(Boolean downgrade) {
				this.downgrade = downgrade;
			}
		}

		public static class Storage {

			private Boolean upgrade;

			private Integer diskUsageUpperThreshold;

			private Integer maxStorage;

			public Boolean getUpgrade() {
				return this.upgrade;
			}

			public void setUpgrade(Boolean upgrade) {
				this.upgrade = upgrade;
			}

			public Integer getDiskUsageUpperThreshold() {
				return this.diskUsageUpperThreshold;
			}

			public void setDiskUsageUpperThreshold(Integer diskUsageUpperThreshold) {
				this.diskUsageUpperThreshold = diskUsageUpperThreshold;
			}

			public Integer getMaxStorage() {
				return this.maxStorage;
			}

			public void setMaxStorage(Integer maxStorage) {
				this.maxStorage = maxStorage;
			}
		}

		public static class Resource {

			private Boolean enable;

			private Integer cpuUsageUpperThreshold;

			private Integer cpuStep;

			private String upgradeObservationWindowSize;

			private String downgradeObservationWindowSize;

			public Boolean getEnable() {
				return this.enable;
			}

			public void setEnable(Boolean enable) {
				this.enable = enable;
			}

			public Integer getCpuUsageUpperThreshold() {
				return this.cpuUsageUpperThreshold;
			}

			public void setCpuUsageUpperThreshold(Integer cpuUsageUpperThreshold) {
				this.cpuUsageUpperThreshold = cpuUsageUpperThreshold;
			}

			public Integer getCpuStep() {
				return this.cpuStep;
			}

			public void setCpuStep(Integer cpuStep) {
				this.cpuStep = cpuStep;
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
		}

		public static class Shard {

			private Boolean upgrade;

			private Integer memUsageUpperThreshold;

			private Integer maxShards;

			private String upgradeObservationWindowSize;

			private Boolean downgrade;

			private Integer memUsageLowerThreshold;

			private Integer minShards;

			private String downgradeObservationWindowSize;

			public Boolean getUpgrade() {
				return this.upgrade;
			}

			public void setUpgrade(Boolean upgrade) {
				this.upgrade = upgrade;
			}

			public Integer getMemUsageUpperThreshold() {
				return this.memUsageUpperThreshold;
			}

			public void setMemUsageUpperThreshold(Integer memUsageUpperThreshold) {
				this.memUsageUpperThreshold = memUsageUpperThreshold;
			}

			public Integer getMaxShards() {
				return this.maxShards;
			}

			public void setMaxShards(Integer maxShards) {
				this.maxShards = maxShards;
			}

			public String getUpgradeObservationWindowSize() {
				return this.upgradeObservationWindowSize;
			}

			public void setUpgradeObservationWindowSize(String upgradeObservationWindowSize) {
				this.upgradeObservationWindowSize = upgradeObservationWindowSize;
			}

			public Boolean getDowngrade() {
				return this.downgrade;
			}

			public void setDowngrade(Boolean downgrade) {
				this.downgrade = downgrade;
			}

			public Integer getMemUsageLowerThreshold() {
				return this.memUsageLowerThreshold;
			}

			public void setMemUsageLowerThreshold(Integer memUsageLowerThreshold) {
				this.memUsageLowerThreshold = memUsageLowerThreshold;
			}

			public Integer getMinShards() {
				return this.minShards;
			}

			public void setMinShards(Integer minShards) {
				this.minShards = minShards;
			}

			public String getDowngradeObservationWindowSize() {
				return this.downgradeObservationWindowSize;
			}

			public void setDowngradeObservationWindowSize(String downgradeObservationWindowSize) {
				this.downgradeObservationWindowSize = downgradeObservationWindowSize;
			}
		}

		public static class Bandwidth {

			private Boolean upgrade;

			private Integer bandwidthUsageUpperThreshold;

			private String observationWindowSize;

			private Boolean downgrade;

			private Integer bandwidthUsageLowerThreshold;

			public Boolean getUpgrade() {
				return this.upgrade;
			}

			public void setUpgrade(Boolean upgrade) {
				this.upgrade = upgrade;
			}

			public Integer getBandwidthUsageUpperThreshold() {
				return this.bandwidthUsageUpperThreshold;
			}

			public void setBandwidthUsageUpperThreshold(Integer bandwidthUsageUpperThreshold) {
				this.bandwidthUsageUpperThreshold = bandwidthUsageUpperThreshold;
			}

			public String getObservationWindowSize() {
				return this.observationWindowSize;
			}

			public void setObservationWindowSize(String observationWindowSize) {
				this.observationWindowSize = observationWindowSize;
			}

			public Boolean getDowngrade() {
				return this.downgrade;
			}

			public void setDowngrade(Boolean downgrade) {
				this.downgrade = downgrade;
			}

			public Integer getBandwidthUsageLowerThreshold() {
				return this.bandwidthUsageLowerThreshold;
			}

			public void setBandwidthUsageLowerThreshold(Integer bandwidthUsageLowerThreshold) {
				this.bandwidthUsageLowerThreshold = bandwidthUsageLowerThreshold;
			}
		}
	}

	@Override
	public DescribeAutoScalingConfigResponse getInstance(UnmarshallerContext context) {
		return	DescribeAutoScalingConfigResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
