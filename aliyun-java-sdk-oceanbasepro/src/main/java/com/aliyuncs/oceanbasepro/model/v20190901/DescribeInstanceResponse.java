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

		private String instanceRole;

		private String nodeNum;

		private String replicaMode;

		private Boolean isolationOptimization;

		private Boolean enableIsolationOptimization;

		private Boolean inTempCapacityStatus;

		private Boolean dataDiskAutoScale;

		private Boolean enableProxyService;

		private String proxyServiceStatus;

		private String proxyClusterId;

		private String cpuArchitecture;

		private String unitSpec;

		private Integer sharedUnitNumLimit;

		private Integer exclusiveUnitNumLimit;

		private Boolean enableReadOnlyReplica;

		private Boolean enableReadOnlyReplicaManagement;

		private String primaryInstance;

		private String primaryRegion;

		private String specType;

		private Boolean allowModifyInternetAddressConnectionLimit;

		private Boolean allowCreateProxySqlFirewallRule;

		private List<String> availableZones;

		private List<String> zones;

		private Resource resource;

		private TenantCreatable tenantCreatable;

		private DataDiskAutoScaleConfig dataDiskAutoScaleConfig;

		private ReadOnlyResource readOnlyResource;

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

		public String getInstanceRole() {
			return this.instanceRole;
		}

		public void setInstanceRole(String instanceRole) {
			this.instanceRole = instanceRole;
		}

		public String getNodeNum() {
			return this.nodeNum;
		}

		public void setNodeNum(String nodeNum) {
			this.nodeNum = nodeNum;
		}

		public String getReplicaMode() {
			return this.replicaMode;
		}

		public void setReplicaMode(String replicaMode) {
			this.replicaMode = replicaMode;
		}

		public Boolean getIsolationOptimization() {
			return this.isolationOptimization;
		}

		public void setIsolationOptimization(Boolean isolationOptimization) {
			this.isolationOptimization = isolationOptimization;
		}

		public Boolean getEnableIsolationOptimization() {
			return this.enableIsolationOptimization;
		}

		public void setEnableIsolationOptimization(Boolean enableIsolationOptimization) {
			this.enableIsolationOptimization = enableIsolationOptimization;
		}

		public Boolean getInTempCapacityStatus() {
			return this.inTempCapacityStatus;
		}

		public void setInTempCapacityStatus(Boolean inTempCapacityStatus) {
			this.inTempCapacityStatus = inTempCapacityStatus;
		}

		public Boolean getDataDiskAutoScale() {
			return this.dataDiskAutoScale;
		}

		public void setDataDiskAutoScale(Boolean dataDiskAutoScale) {
			this.dataDiskAutoScale = dataDiskAutoScale;
		}

		public Boolean getEnableProxyService() {
			return this.enableProxyService;
		}

		public void setEnableProxyService(Boolean enableProxyService) {
			this.enableProxyService = enableProxyService;
		}

		public String getProxyServiceStatus() {
			return this.proxyServiceStatus;
		}

		public void setProxyServiceStatus(String proxyServiceStatus) {
			this.proxyServiceStatus = proxyServiceStatus;
		}

		public String getProxyClusterId() {
			return this.proxyClusterId;
		}

		public void setProxyClusterId(String proxyClusterId) {
			this.proxyClusterId = proxyClusterId;
		}

		public String getCpuArchitecture() {
			return this.cpuArchitecture;
		}

		public void setCpuArchitecture(String cpuArchitecture) {
			this.cpuArchitecture = cpuArchitecture;
		}

		public String getUnitSpec() {
			return this.unitSpec;
		}

		public void setUnitSpec(String unitSpec) {
			this.unitSpec = unitSpec;
		}

		public Integer getSharedUnitNumLimit() {
			return this.sharedUnitNumLimit;
		}

		public void setSharedUnitNumLimit(Integer sharedUnitNumLimit) {
			this.sharedUnitNumLimit = sharedUnitNumLimit;
		}

		public Integer getExclusiveUnitNumLimit() {
			return this.exclusiveUnitNumLimit;
		}

		public void setExclusiveUnitNumLimit(Integer exclusiveUnitNumLimit) {
			this.exclusiveUnitNumLimit = exclusiveUnitNumLimit;
		}

		public Boolean getEnableReadOnlyReplica() {
			return this.enableReadOnlyReplica;
		}

		public void setEnableReadOnlyReplica(Boolean enableReadOnlyReplica) {
			this.enableReadOnlyReplica = enableReadOnlyReplica;
		}

		public Boolean getEnableReadOnlyReplicaManagement() {
			return this.enableReadOnlyReplicaManagement;
		}

		public void setEnableReadOnlyReplicaManagement(Boolean enableReadOnlyReplicaManagement) {
			this.enableReadOnlyReplicaManagement = enableReadOnlyReplicaManagement;
		}

		public String getPrimaryInstance() {
			return this.primaryInstance;
		}

		public void setPrimaryInstance(String primaryInstance) {
			this.primaryInstance = primaryInstance;
		}

		public String getPrimaryRegion() {
			return this.primaryRegion;
		}

		public void setPrimaryRegion(String primaryRegion) {
			this.primaryRegion = primaryRegion;
		}

		public String getSpecType() {
			return this.specType;
		}

		public void setSpecType(String specType) {
			this.specType = specType;
		}

		public Boolean getAllowModifyInternetAddressConnectionLimit() {
			return this.allowModifyInternetAddressConnectionLimit;
		}

		public void setAllowModifyInternetAddressConnectionLimit(Boolean allowModifyInternetAddressConnectionLimit) {
			this.allowModifyInternetAddressConnectionLimit = allowModifyInternetAddressConnectionLimit;
		}

		public Boolean getAllowCreateProxySqlFirewallRule() {
			return this.allowCreateProxySqlFirewallRule;
		}

		public void setAllowCreateProxySqlFirewallRule(Boolean allowCreateProxySqlFirewallRule) {
			this.allowCreateProxySqlFirewallRule = allowCreateProxySqlFirewallRule;
		}

		public List<String> getAvailableZones() {
			return this.availableZones;
		}

		public void setAvailableZones(List<String> availableZones) {
			this.availableZones = availableZones;
		}

		public List<String> getZones() {
			return this.zones;
		}

		public void setZones(List<String> zones) {
			this.zones = zones;
		}

		public Resource getResource() {
			return this.resource;
		}

		public void setResource(Resource resource) {
			this.resource = resource;
		}

		public TenantCreatable getTenantCreatable() {
			return this.tenantCreatable;
		}

		public void setTenantCreatable(TenantCreatable tenantCreatable) {
			this.tenantCreatable = tenantCreatable;
		}

		public DataDiskAutoScaleConfig getDataDiskAutoScaleConfig() {
			return this.dataDiskAutoScaleConfig;
		}

		public void setDataDiskAutoScaleConfig(DataDiskAutoScaleConfig dataDiskAutoScaleConfig) {
			this.dataDiskAutoScaleConfig = dataDiskAutoScaleConfig;
		}

		public ReadOnlyResource getReadOnlyResource() {
			return this.readOnlyResource;
		}

		public void setReadOnlyResource(ReadOnlyResource readOnlyResource) {
			this.readOnlyResource = readOnlyResource;
		}

		public static class Resource {

			private Long unitCount;

			private Cpu cpu;

			private Memory memory;

			private DiskSize diskSize;

			private LogDiskSize logDiskSize;

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

			public LogDiskSize getLogDiskSize() {
				return this.logDiskSize;
			}

			public void setLogDiskSize(LogDiskSize logDiskSize) {
				this.logDiskSize = logDiskSize;
			}

			public CapacityUnit getCapacityUnit() {
				return this.capacityUnit;
			}

			public void setCapacityUnit(CapacityUnit capacityUnit) {
				this.capacityUnit = capacityUnit;
			}

			public static class Cpu {

				private Long totalCpu;

				private Long usedCpu;

				private Long unitCpu;

				private Long originalTotalCpu;

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

				public Long getOriginalTotalCpu() {
					return this.originalTotalCpu;
				}

				public void setOriginalTotalCpu(Long originalTotalCpu) {
					this.originalTotalCpu = originalTotalCpu;
				}
			}

			public static class Memory {

				private Long totalMemory;

				private Long usedMemory;

				private Long unitMemory;

				private Long originalTotalMemory;

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

				public Long getOriginalTotalMemory() {
					return this.originalTotalMemory;
				}

				public void setOriginalTotalMemory(Long originalTotalMemory) {
					this.originalTotalMemory = originalTotalMemory;
				}
			}

			public static class DiskSize {

				private Long totalDiskSize;

				private Long usedDiskSize;

				private Long unitDiskSize;

				private Double dataUsedSize;

				private Double maxDiskUsedPercent;

				private Long originalTotalDiskSize;

				private Double maxDiskSize;

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

				public Long getOriginalTotalDiskSize() {
					return this.originalTotalDiskSize;
				}

				public void setOriginalTotalDiskSize(Long originalTotalDiskSize) {
					this.originalTotalDiskSize = originalTotalDiskSize;
				}

				public Double getMaxDiskSize() {
					return this.maxDiskSize;
				}

				public void setMaxDiskSize(Double maxDiskSize) {
					this.maxDiskSize = maxDiskSize;
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

				private String logAssignedSize;

				private String maxLogAssignedPercent;

				private Integer originalTotalDiskSize;

				private List<String> maxLogAssignedObServer;

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

				public String getLogAssignedSize() {
					return this.logAssignedSize;
				}

				public void setLogAssignedSize(String logAssignedSize) {
					this.logAssignedSize = logAssignedSize;
				}

				public String getMaxLogAssignedPercent() {
					return this.maxLogAssignedPercent;
				}

				public void setMaxLogAssignedPercent(String maxLogAssignedPercent) {
					this.maxLogAssignedPercent = maxLogAssignedPercent;
				}

				public Integer getOriginalTotalDiskSize() {
					return this.originalTotalDiskSize;
				}

				public void setOriginalTotalDiskSize(Integer originalTotalDiskSize) {
					this.originalTotalDiskSize = originalTotalDiskSize;
				}

				public List<String> getMaxLogAssignedObServer() {
					return this.maxLogAssignedObServer;
				}

				public void setMaxLogAssignedObServer(List<String> maxLogAssignedObServer) {
					this.maxLogAssignedObServer = maxLogAssignedObServer;
				}
			}

			public static class CapacityUnit {

				private Integer maxCapacityUnit;

				private Integer minCapacityUnit;

				private String usedCapacityUnit;

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

				public String getUsedCapacityUnit() {
					return this.usedCapacityUnit;
				}

				public void setUsedCapacityUnit(String usedCapacityUnit) {
					this.usedCapacityUnit = usedCapacityUnit;
				}
			}
		}

		public static class TenantCreatable {

			private Boolean enableCreateTenant;

			private String disableCreateTenantReason;

			public Boolean getEnableCreateTenant() {
				return this.enableCreateTenant;
			}

			public void setEnableCreateTenant(Boolean enableCreateTenant) {
				this.enableCreateTenant = enableCreateTenant;
			}

			public String getDisableCreateTenantReason() {
				return this.disableCreateTenantReason;
			}

			public void setDisableCreateTenantReason(String disableCreateTenantReason) {
				this.disableCreateTenantReason = disableCreateTenantReason;
			}
		}

		public static class DataDiskAutoScaleConfig {

			private Boolean autoScale;

			private Long upperbound;

			private Long upperThreshold;

			private Long upperMergeThreshold;

			private Long maxDiskSize;

			private Long scaleStepInNormal;

			private Long scaleStepInMerge;

			private String upperScaleStrategy;

			private String upperScaleStep;

			public Boolean getAutoScale() {
				return this.autoScale;
			}

			public void setAutoScale(Boolean autoScale) {
				this.autoScale = autoScale;
			}

			public Long getUpperbound() {
				return this.upperbound;
			}

			public void setUpperbound(Long upperbound) {
				this.upperbound = upperbound;
			}

			public Long getUpperThreshold() {
				return this.upperThreshold;
			}

			public void setUpperThreshold(Long upperThreshold) {
				this.upperThreshold = upperThreshold;
			}

			public Long getUpperMergeThreshold() {
				return this.upperMergeThreshold;
			}

			public void setUpperMergeThreshold(Long upperMergeThreshold) {
				this.upperMergeThreshold = upperMergeThreshold;
			}

			public Long getMaxDiskSize() {
				return this.maxDiskSize;
			}

			public void setMaxDiskSize(Long maxDiskSize) {
				this.maxDiskSize = maxDiskSize;
			}

			public Long getScaleStepInNormal() {
				return this.scaleStepInNormal;
			}

			public void setScaleStepInNormal(Long scaleStepInNormal) {
				this.scaleStepInNormal = scaleStepInNormal;
			}

			public Long getScaleStepInMerge() {
				return this.scaleStepInMerge;
			}

			public void setScaleStepInMerge(Long scaleStepInMerge) {
				this.scaleStepInMerge = scaleStepInMerge;
			}

			public String getUpperScaleStrategy() {
				return this.upperScaleStrategy;
			}

			public void setUpperScaleStrategy(String upperScaleStrategy) {
				this.upperScaleStrategy = upperScaleStrategy;
			}

			public String getUpperScaleStep() {
				return this.upperScaleStep;
			}

			public void setUpperScaleStep(String upperScaleStep) {
				this.upperScaleStep = upperScaleStep;
			}
		}

		public static class ReadOnlyResource {

			private Long unitCount;

			private Cpu1 cpu1;

			private Memory2 memory2;

			private DiskSize3 diskSize3;

			private LogDiskSize4 logDiskSize4;

			private CapacityUnit5 capacityUnit5;

			public Long getUnitCount() {
				return this.unitCount;
			}

			public void setUnitCount(Long unitCount) {
				this.unitCount = unitCount;
			}

			public Cpu1 getCpu1() {
				return this.cpu1;
			}

			public void setCpu1(Cpu1 cpu1) {
				this.cpu1 = cpu1;
			}

			public Memory2 getMemory2() {
				return this.memory2;
			}

			public void setMemory2(Memory2 memory2) {
				this.memory2 = memory2;
			}

			public DiskSize3 getDiskSize3() {
				return this.diskSize3;
			}

			public void setDiskSize3(DiskSize3 diskSize3) {
				this.diskSize3 = diskSize3;
			}

			public LogDiskSize4 getLogDiskSize4() {
				return this.logDiskSize4;
			}

			public void setLogDiskSize4(LogDiskSize4 logDiskSize4) {
				this.logDiskSize4 = logDiskSize4;
			}

			public CapacityUnit5 getCapacityUnit5() {
				return this.capacityUnit5;
			}

			public void setCapacityUnit5(CapacityUnit5 capacityUnit5) {
				this.capacityUnit5 = capacityUnit5;
			}

			public static class Cpu1 {

				private Long totalCpu;

				private Long usedCpu;

				private Long unitCpu;

				private Long originalTotalCpu;

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

				public Long getOriginalTotalCpu() {
					return this.originalTotalCpu;
				}

				public void setOriginalTotalCpu(Long originalTotalCpu) {
					this.originalTotalCpu = originalTotalCpu;
				}
			}

			public static class Memory2 {

				private Long totalMemory;

				private Long usedMemory;

				private Long unitMemory;

				private Long originalTotalMemory;

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

				public Long getOriginalTotalMemory() {
					return this.originalTotalMemory;
				}

				public void setOriginalTotalMemory(Long originalTotalMemory) {
					this.originalTotalMemory = originalTotalMemory;
				}
			}

			public static class DiskSize3 {

				private Long totalDiskSize;

				private Long usedDiskSize;

				private Long unitDiskSize;

				private Double dataUsedSize;

				private Double maxDiskUsedPercent;

				private Long originalTotalDiskSize;

				private Double maxDiskSize;

				private List<String> maxDiskUsedObServer6;

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

				public Long getOriginalTotalDiskSize() {
					return this.originalTotalDiskSize;
				}

				public void setOriginalTotalDiskSize(Long originalTotalDiskSize) {
					this.originalTotalDiskSize = originalTotalDiskSize;
				}

				public Double getMaxDiskSize() {
					return this.maxDiskSize;
				}

				public void setMaxDiskSize(Double maxDiskSize) {
					this.maxDiskSize = maxDiskSize;
				}

				public List<String> getMaxDiskUsedObServer6() {
					return this.maxDiskUsedObServer6;
				}

				public void setMaxDiskUsedObServer6(List<String> maxDiskUsedObServer6) {
					this.maxDiskUsedObServer6 = maxDiskUsedObServer6;
				}
			}

			public static class LogDiskSize4 {

				private Long totalDiskSize;

				private Long unitDiskSize;

				private String logAssignedSize;

				private String maxLogAssignedPercent;

				private List<String> maxLogAssignedObServer7;

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

				public String getLogAssignedSize() {
					return this.logAssignedSize;
				}

				public void setLogAssignedSize(String logAssignedSize) {
					this.logAssignedSize = logAssignedSize;
				}

				public String getMaxLogAssignedPercent() {
					return this.maxLogAssignedPercent;
				}

				public void setMaxLogAssignedPercent(String maxLogAssignedPercent) {
					this.maxLogAssignedPercent = maxLogAssignedPercent;
				}

				public List<String> getMaxLogAssignedObServer7() {
					return this.maxLogAssignedObServer7;
				}

				public void setMaxLogAssignedObServer7(List<String> maxLogAssignedObServer7) {
					this.maxLogAssignedObServer7 = maxLogAssignedObServer7;
				}
			}

			public static class CapacityUnit5 {

				private Integer maxCapacityUnit;

				private Integer minCapacityUnit;

				private String usedCapacityUnit;

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

				public String getUsedCapacityUnit() {
					return this.usedCapacityUnit;
				}

				public void setUsedCapacityUnit(String usedCapacityUnit) {
					this.usedCapacityUnit = usedCapacityUnit;
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
