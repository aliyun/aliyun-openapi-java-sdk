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

package com.aliyuncs.oceanbasepro.model.v20190901;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.oceanbasepro.transform.v20190901.DescribeInstanceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeInstanceResponse extends AcsResponse {

	private String requestId;

	private Instance instance;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Instance getInstance() {
		return this.instance;
	}

	public void setInstance(Instance instance) {
		this.instance = instance;
	}

	public static class Instance {

		private String instanceId;

		private String instanceName;

		private String instanceClass;

		private String series;

		private String payType;

		private String createTime;

		private String expireTime;

		private String version;

		private String deployType;

		private String deployMode;

		private String diskType;

		private String maintainTime;

		private String dataMergeTime;

		private Boolean autoRenewal;

		private Boolean isTrustEcs;

		private String status;

		private Boolean autoUpgradeObVersion;

		private String obRpmVersion;

		private Boolean isLatestObVersion;

		private Boolean enableUpgradeLogDisk;

		private List<String> availableZones;

		private Resource resource;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public String getInstanceClass() {
			return this.instanceClass;
		}

		public void setInstanceClass(String instanceClass) {
			this.instanceClass = instanceClass;
		}

		public String getSeries() {
			return this.series;
		}

		public void setSeries(String series) {
			this.series = series;
		}

		public String getPayType() {
			return this.payType;
		}

		public void setPayType(String payType) {
			this.payType = payType;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getExpireTime() {
			return this.expireTime;
		}

		public void setExpireTime(String expireTime) {
			this.expireTime = expireTime;
		}

		public String getVersion() {
			return this.version;
		}

		public void setVersion(String version) {
			this.version = version;
		}

		public String getDeployType() {
			return this.deployType;
		}

		public void setDeployType(String deployType) {
			this.deployType = deployType;
		}

		public String getDeployMode() {
			return this.deployMode;
		}

		public void setDeployMode(String deployMode) {
			this.deployMode = deployMode;
		}

		public String getDiskType() {
			return this.diskType;
		}

		public void setDiskType(String diskType) {
			this.diskType = diskType;
		}

		public String getMaintainTime() {
			return this.maintainTime;
		}

		public void setMaintainTime(String maintainTime) {
			this.maintainTime = maintainTime;
		}

		public String getDataMergeTime() {
			return this.dataMergeTime;
		}

		public void setDataMergeTime(String dataMergeTime) {
			this.dataMergeTime = dataMergeTime;
		}

		public Boolean getAutoRenewal() {
			return this.autoRenewal;
		}

		public void setAutoRenewal(Boolean autoRenewal) {
			this.autoRenewal = autoRenewal;
		}

		public Boolean getIsTrustEcs() {
			return this.isTrustEcs;
		}

		public void setIsTrustEcs(Boolean isTrustEcs) {
			this.isTrustEcs = isTrustEcs;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Boolean getAutoUpgradeObVersion() {
			return this.autoUpgradeObVersion;
		}

		public void setAutoUpgradeObVersion(Boolean autoUpgradeObVersion) {
			this.autoUpgradeObVersion = autoUpgradeObVersion;
		}

		public String getObRpmVersion() {
			return this.obRpmVersion;
		}

		public void setObRpmVersion(String obRpmVersion) {
			this.obRpmVersion = obRpmVersion;
		}

		public Boolean getIsLatestObVersion() {
			return this.isLatestObVersion;
		}

		public void setIsLatestObVersion(Boolean isLatestObVersion) {
			this.isLatestObVersion = isLatestObVersion;
		}

		public Boolean getEnableUpgradeLogDisk() {
			return this.enableUpgradeLogDisk;
		}

		public void setEnableUpgradeLogDisk(Boolean enableUpgradeLogDisk) {
			this.enableUpgradeLogDisk = enableUpgradeLogDisk;
		}

		public List<String> getAvailableZones() {
			return this.availableZones;
		}

		public void setAvailableZones(List<String> availableZones) {
			this.availableZones = availableZones;
		}

		public Resource getResource() {
			return this.resource;
		}

		public void setResource(Resource resource) {
			this.resource = resource;
		}

		public static class Resource {

			private Long unitCount;

			private Cpu cpu;

			private Memory memory;

			private DiskSize diskSize;

			private LogDiskSize logDiskSize;

			public Long getUnitCount() {
				return this.unitCount;
			}

			public void setUnitCount(Long unitCount) {
				this.unitCount = unitCount;
			}

			public Cpu getCpu() {
				return this.cpu;
			}

			public void setCpu(Cpu cpu) {
				this.cpu = cpu;
			}

			public Memory getMemory() {
				return this.memory;
			}

			public void setMemory(Memory memory) {
				this.memory = memory;
			}

			public DiskSize getDiskSize() {
				return this.diskSize;
			}

			public void setDiskSize(DiskSize diskSize) {
				this.diskSize = diskSize;
			}

			public LogDiskSize getLogDiskSize() {
				return this.logDiskSize;
			}

			public void setLogDiskSize(LogDiskSize logDiskSize) {
				this.logDiskSize = logDiskSize;
			}

			public static class Cpu {

				private Long totalCpu;

				private Long usedCpu;

				private Long unitCpu;

				public Long getTotalCpu() {
					return this.totalCpu;
				}

				public void setTotalCpu(Long totalCpu) {
					this.totalCpu = totalCpu;
				}

				public Long getUsedCpu() {
					return this.usedCpu;
				}

				public void setUsedCpu(Long usedCpu) {
					this.usedCpu = usedCpu;
				}

				public Long getUnitCpu() {
					return this.unitCpu;
				}

				public void setUnitCpu(Long unitCpu) {
					this.unitCpu = unitCpu;
				}
			}

			public static class Memory {

				private Long totalMemory;

				private Long usedMemory;

				private Long unitMemory;

				public Long getTotalMemory() {
					return this.totalMemory;
				}

				public void setTotalMemory(Long totalMemory) {
					this.totalMemory = totalMemory;
				}

				public Long getUsedMemory() {
					return this.usedMemory;
				}

				public void setUsedMemory(Long usedMemory) {
					this.usedMemory = usedMemory;
				}

				public Long getUnitMemory() {
					return this.unitMemory;
				}

				public void setUnitMemory(Long unitMemory) {
					this.unitMemory = unitMemory;
				}
			}

			public static class DiskSize {

				private Long totalDiskSize;

				private Long usedDiskSize;

				private Long unitDiskSize;

				private Double dataUsedSize;

				private Double maxDiskUsedPercent;

				private List<String> maxDiskUsedObServer;

				public Long getTotalDiskSize() {
					return this.totalDiskSize;
				}

				public void setTotalDiskSize(Long totalDiskSize) {
					this.totalDiskSize = totalDiskSize;
				}

				public Long getUsedDiskSize() {
					return this.usedDiskSize;
				}

				public void setUsedDiskSize(Long usedDiskSize) {
					this.usedDiskSize = usedDiskSize;
				}

				public Long getUnitDiskSize() {
					return this.unitDiskSize;
				}

				public void setUnitDiskSize(Long unitDiskSize) {
					this.unitDiskSize = unitDiskSize;
				}

				public Double getDataUsedSize() {
					return this.dataUsedSize;
				}

				public void setDataUsedSize(Double dataUsedSize) {
					this.dataUsedSize = dataUsedSize;
				}

				public Double getMaxDiskUsedPercent() {
					return this.maxDiskUsedPercent;
				}

				public void setMaxDiskUsedPercent(Double maxDiskUsedPercent) {
					this.maxDiskUsedPercent = maxDiskUsedPercent;
				}

				public List<String> getMaxDiskUsedObServer() {
					return this.maxDiskUsedObServer;
				}

				public void setMaxDiskUsedObServer(List<String> maxDiskUsedObServer) {
					this.maxDiskUsedObServer = maxDiskUsedObServer;
				}
			}

			public static class LogDiskSize {

				private Long totalDiskSize;

				private Long unitDiskSize;

				public Long getTotalDiskSize() {
					return this.totalDiskSize;
				}

				public void setTotalDiskSize(Long totalDiskSize) {
					this.totalDiskSize = totalDiskSize;
				}

				public Long getUnitDiskSize() {
					return this.unitDiskSize;
				}

				public void setUnitDiskSize(Long unitDiskSize) {
					this.unitDiskSize = unitDiskSize;
				}
			}
		}
	}

	@Override
	public DescribeInstanceResponse getInstance(UnmarshallerContext context) {
		return	DescribeInstanceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
