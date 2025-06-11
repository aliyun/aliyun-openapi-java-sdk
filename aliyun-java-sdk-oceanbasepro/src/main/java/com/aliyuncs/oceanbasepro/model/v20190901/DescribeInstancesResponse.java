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
import com.aliyuncs.oceanbasepro.transform.v20190901.DescribeInstancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeInstancesResponse extends AcsResponse {

	private Integer totalCount;

	private String requestId;

	private List<Data> instances;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Data> getInstances() {
		return this.instances;
	}

	public void setInstances(List<Data> instances) {
		this.instances = instances;
	}

	public static class Data {

		private String vpcId;

		private String commodityCode;

		private String expireTime;

		private String state;

		private String instanceClass;

		private String createTime;

		private String deployMode;

		private String cpuArchitecture;

		private String maintainTime;

		private String deployType;

		private String payType;

		private Long diskSize;

		private String diskType;

		private String instanceId;

		private Integer expireSeconds;

		private Long mem;

		private Boolean enableUpgradeNodes;

		private Integer cpu;

		private String version;

		private String instanceName;

		private String series;

		private Long usedDiskSize;

		private String resourceGroupId;

		private String instanceType;

		private String instanceRole;

		private Boolean inTempCapacityStatus;

		private Boolean enableReadOnlyReplicaManagement;

		private String specType;

		private String obRpmVersion;

		private String replicaMode;

		private Boolean migratable;

		private List<String> availableZones;

		private Resource resource;

		private DataDiskAutoScaleConfig dataDiskAutoScaleConfig;

		private MigrationInfo migrationInfo;

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getCommodityCode() {
			return this.commodityCode;
		}

		public void setCommodityCode(String commodityCode) {
			this.commodityCode = commodityCode;
		}

		public String getExpireTime() {
			return this.expireTime;
		}

		public void setExpireTime(String expireTime) {
			this.expireTime = expireTime;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getInstanceClass() {
			return this.instanceClass;
		}

		public void setInstanceClass(String instanceClass) {
			this.instanceClass = instanceClass;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getDeployMode() {
			return this.deployMode;
		}

		public void setDeployMode(String deployMode) {
			this.deployMode = deployMode;
		}

		public String getCpuArchitecture() {
			return this.cpuArchitecture;
		}

		public void setCpuArchitecture(String cpuArchitecture) {
			this.cpuArchitecture = cpuArchitecture;
		}

		public String getMaintainTime() {
			return this.maintainTime;
		}

		public void setMaintainTime(String maintainTime) {
			this.maintainTime = maintainTime;
		}

		public String getDeployType() {
			return this.deployType;
		}

		public void setDeployType(String deployType) {
			this.deployType = deployType;
		}

		public String getPayType() {
			return this.payType;
		}

		public void setPayType(String payType) {
			this.payType = payType;
		}

		public Long getDiskSize() {
			return this.diskSize;
		}

		public void setDiskSize(Long diskSize) {
			this.diskSize = diskSize;
		}

		public String getDiskType() {
			return this.diskType;
		}

		public void setDiskType(String diskType) {
			this.diskType = diskType;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public Integer getExpireSeconds() {
			return this.expireSeconds;
		}

		public void setExpireSeconds(Integer expireSeconds) {
			this.expireSeconds = expireSeconds;
		}

		public Long getMem() {
			return this.mem;
		}

		public void setMem(Long mem) {
			this.mem = mem;
		}

		public Boolean getEnableUpgradeNodes() {
			return this.enableUpgradeNodes;
		}

		public void setEnableUpgradeNodes(Boolean enableUpgradeNodes) {
			this.enableUpgradeNodes = enableUpgradeNodes;
		}

		public Integer getCpu() {
			return this.cpu;
		}

		public void setCpu(Integer cpu) {
			this.cpu = cpu;
		}

		public String getVersion() {
			return this.version;
		}

		public void setVersion(String version) {
			this.version = version;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public String getSeries() {
			return this.series;
		}

		public void setSeries(String series) {
			this.series = series;
		}

		public Long getUsedDiskSize() {
			return this.usedDiskSize;
		}

		public void setUsedDiskSize(Long usedDiskSize) {
			this.usedDiskSize = usedDiskSize;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public String getInstanceRole() {
			return this.instanceRole;
		}

		public void setInstanceRole(String instanceRole) {
			this.instanceRole = instanceRole;
		}

		public Boolean getInTempCapacityStatus() {
			return this.inTempCapacityStatus;
		}

		public void setInTempCapacityStatus(Boolean inTempCapacityStatus) {
			this.inTempCapacityStatus = inTempCapacityStatus;
		}

		public Boolean getEnableReadOnlyReplicaManagement() {
			return this.enableReadOnlyReplicaManagement;
		}

		public void setEnableReadOnlyReplicaManagement(Boolean enableReadOnlyReplicaManagement) {
			this.enableReadOnlyReplicaManagement = enableReadOnlyReplicaManagement;
		}

		public String getSpecType() {
			return this.specType;
		}

		public void setSpecType(String specType) {
			this.specType = specType;
		}

		public String getObRpmVersion() {
			return this.obRpmVersion;
		}

		public void setObRpmVersion(String obRpmVersion) {
			this.obRpmVersion = obRpmVersion;
		}

		public String getReplicaMode() {
			return this.replicaMode;
		}

		public void setReplicaMode(String replicaMode) {
			this.replicaMode = replicaMode;
		}

		public Boolean getMigratable() {
			return this.migratable;
		}

		public void setMigratable(Boolean migratable) {
			this.migratable = migratable;
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

		public DataDiskAutoScaleConfig getDataDiskAutoScaleConfig() {
			return this.dataDiskAutoScaleConfig;
		}

		public void setDataDiskAutoScaleConfig(DataDiskAutoScaleConfig dataDiskAutoScaleConfig) {
			this.dataDiskAutoScaleConfig = dataDiskAutoScaleConfig;
		}

		public MigrationInfo getMigrationInfo() {
			return this.migrationInfo;
		}

		public void setMigrationInfo(MigrationInfo migrationInfo) {
			this.migrationInfo = migrationInfo;
		}

		public static class Resource {

			private Long unitCount;

			private Cpu cpu;

			private Memory memory;

			private DiskSize diskSize;

			private CapacityUnit capacityUnit;

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

			public CapacityUnit getCapacityUnit() {
				return this.capacityUnit;
			}

			public void setCapacityUnit(CapacityUnit capacityUnit) {
				this.capacityUnit = capacityUnit;
			}

			public static class Cpu {

				private Double totalCpu;

				private Double usedCpu;

				private Double unitCpu;

				private Double originalTotalCpu;

				public Double getTotalCpu() {
					return this.totalCpu;
				}

				public void setTotalCpu(Double totalCpu) {
					this.totalCpu = totalCpu;
				}

				public Double getUsedCpu() {
					return this.usedCpu;
				}

				public void setUsedCpu(Double usedCpu) {
					this.usedCpu = usedCpu;
				}

				public Double getUnitCpu() {
					return this.unitCpu;
				}

				public void setUnitCpu(Double unitCpu) {
					this.unitCpu = unitCpu;
				}

				public Double getOriginalTotalCpu() {
					return this.originalTotalCpu;
				}

				public void setOriginalTotalCpu(Double originalTotalCpu) {
					this.originalTotalCpu = originalTotalCpu;
				}
			}

			public static class Memory {

				private Double totalMemory;

				private Long usedMemory;

				private Long unitMemory;

				private Double originalTotalMemory;

				public Double getTotalMemory() {
					return this.totalMemory;
				}

				public void setTotalMemory(Double totalMemory) {
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

				public Double getOriginalTotalMemory() {
					return this.originalTotalMemory;
				}

				public void setOriginalTotalMemory(Double originalTotalMemory) {
					this.originalTotalMemory = originalTotalMemory;
				}
			}

			public static class DiskSize {

				private Double totalDiskSize;

				private Long usedDiskSize;

				private Double unitDiskSize;

				private Double originalTotalDiskSize;

				public Double getTotalDiskSize() {
					return this.totalDiskSize;
				}

				public void setTotalDiskSize(Double totalDiskSize) {
					this.totalDiskSize = totalDiskSize;
				}

				public Long getUsedDiskSize() {
					return this.usedDiskSize;
				}

				public void setUsedDiskSize(Long usedDiskSize) {
					this.usedDiskSize = usedDiskSize;
				}

				public Double getUnitDiskSize() {
					return this.unitDiskSize;
				}

				public void setUnitDiskSize(Double unitDiskSize) {
					this.unitDiskSize = unitDiskSize;
				}

				public Double getOriginalTotalDiskSize() {
					return this.originalTotalDiskSize;
				}

				public void setOriginalTotalDiskSize(Double originalTotalDiskSize) {
					this.originalTotalDiskSize = originalTotalDiskSize;
				}
			}

			public static class CapacityUnit {

				private Integer maxCapacityUnit;

				private Integer minCapacityUnit;

				private Integer usedCapacityUnit;

				public Integer getMaxCapacityUnit() {
					return this.maxCapacityUnit;
				}

				public void setMaxCapacityUnit(Integer maxCapacityUnit) {
					this.maxCapacityUnit = maxCapacityUnit;
				}

				public Integer getMinCapacityUnit() {
					return this.minCapacityUnit;
				}

				public void setMinCapacityUnit(Integer minCapacityUnit) {
					this.minCapacityUnit = minCapacityUnit;
				}

				public Integer getUsedCapacityUnit() {
					return this.usedCapacityUnit;
				}

				public void setUsedCapacityUnit(Integer usedCapacityUnit) {
					this.usedCapacityUnit = usedCapacityUnit;
				}
			}
		}

		public static class DataDiskAutoScaleConfig {

			private Boolean autoScale;

			private Double upperbound;

			private Double upperThreshold;

			private Double upperMergeThreshold;

			private Long maxDiskSize;

			private Double scaleStepInNormal;

			private Double scaleStepInMerge;

			private String upperScaleStrategy;

			public Boolean getAutoScale() {
				return this.autoScale;
			}

			public void setAutoScale(Boolean autoScale) {
				this.autoScale = autoScale;
			}

			public Double getUpperbound() {
				return this.upperbound;
			}

			public void setUpperbound(Double upperbound) {
				this.upperbound = upperbound;
			}

			public Double getUpperThreshold() {
				return this.upperThreshold;
			}

			public void setUpperThreshold(Double upperThreshold) {
				this.upperThreshold = upperThreshold;
			}

			public Double getUpperMergeThreshold() {
				return this.upperMergeThreshold;
			}

			public void setUpperMergeThreshold(Double upperMergeThreshold) {
				this.upperMergeThreshold = upperMergeThreshold;
			}

			public Long getMaxDiskSize() {
				return this.maxDiskSize;
			}

			public void setMaxDiskSize(Long maxDiskSize) {
				this.maxDiskSize = maxDiskSize;
			}

			public Double getScaleStepInNormal() {
				return this.scaleStepInNormal;
			}

			public void setScaleStepInNormal(Double scaleStepInNormal) {
				this.scaleStepInNormal = scaleStepInNormal;
			}

			public Double getScaleStepInMerge() {
				return this.scaleStepInMerge;
			}

			public void setScaleStepInMerge(Double scaleStepInMerge) {
				this.scaleStepInMerge = scaleStepInMerge;
			}

			public String getUpperScaleStrategy() {
				return this.upperScaleStrategy;
			}

			public void setUpperScaleStrategy(String upperScaleStrategy) {
				this.upperScaleStrategy = upperScaleStrategy;
			}
		}

		public static class MigrationInfo {

			private Boolean migratable;

			private CheckResult checkResult;

			public Boolean getMigratable() {
				return this.migratable;
			}

			public void setMigratable(Boolean migratable) {
				this.migratable = migratable;
			}

			public CheckResult getCheckResult() {
				return this.checkResult;
			}

			public void setCheckResult(CheckResult checkResult) {
				this.checkResult = checkResult;
			}

			public static class CheckResult {

				private String level;

				private String code;

				private String codeName;

				private String module;

				private String moduleName;

				private String subModule;

				private String subModuleName;

				public String getLevel() {
					return this.level;
				}

				public void setLevel(String level) {
					this.level = level;
				}

				public String getCode() {
					return this.code;
				}

				public void setCode(String code) {
					this.code = code;
				}

				public String getCodeName() {
					return this.codeName;
				}

				public void setCodeName(String codeName) {
					this.codeName = codeName;
				}

				public String getModule() {
					return this.module;
				}

				public void setModule(String module) {
					this.module = module;
				}

				public String getModuleName() {
					return this.moduleName;
				}

				public void setModuleName(String moduleName) {
					this.moduleName = moduleName;
				}

				public String getSubModule() {
					return this.subModule;
				}

				public void setSubModule(String subModule) {
					this.subModule = subModule;
				}

				public String getSubModuleName() {
					return this.subModuleName;
				}

				public void setSubModuleName(String subModuleName) {
					this.subModuleName = subModuleName;
				}
			}
		}
	}

	@Override
	public DescribeInstancesResponse getInstance(UnmarshallerContext context) {
		return	DescribeInstancesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
