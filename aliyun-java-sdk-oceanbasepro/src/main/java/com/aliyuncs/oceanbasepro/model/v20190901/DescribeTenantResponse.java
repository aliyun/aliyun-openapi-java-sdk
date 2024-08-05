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
import com.aliyuncs.oceanbasepro.transform.v20190901.DescribeTenantResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeTenantResponse extends AcsResponse {

	private String requestId;

	private Tenant tenant;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Tenant getTenant() {
		return this.tenant;
	}

	public void setTenant(Tenant tenant) {
		this.tenant = tenant;
	}

	public static class Tenant {

		private String tenantId;

		private String tenantName;

		private String tenantMode;

		private String vpcId;

		private String status;

		private Boolean enableInternetAddressService;

		private String primaryZone;

		private String deployType;

		private String deployMode;

		private String description;

		private String createTime;

		private String clogServiceStatus;

		private Boolean enableClogService;

		private String charset;

		private String collation;

		private String primaryZoneDeployType;

		private String masterIntranetAddressZone;

		private String payType;

		private String instanceType;

		private String series;

		private String diskType;

		private Boolean enableReadWriteSplit;

		private Boolean enableParallelQuery;

		private Long maxParallelQueryDegree;

		private Boolean enableBinlogService;

		private String timeZone;

		private String dataMergeTime;

		private Boolean enableReadOnlyReplica;

		private String recycleBinStatus;

		private Integer lowerCaseTableNames;

		private String version;

		private List<TenantConnectionsItem> tenantConnections;

		private List<TenantZonesItem> tenantZones;

		private List<String> availableZones;

		private TenantResource tenantResource;

		private ReadOnlyResource readOnlyResource;

		public String getTenantId() {
			return this.tenantId;
		}

		public void setTenantId(String tenantId) {
			this.tenantId = tenantId;
		}

		public String getTenantName() {
			return this.tenantName;
		}

		public void setTenantName(String tenantName) {
			this.tenantName = tenantName;
		}

		public String getTenantMode() {
			return this.tenantMode;
		}

		public void setTenantMode(String tenantMode) {
			this.tenantMode = tenantMode;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Boolean getEnableInternetAddressService() {
			return this.enableInternetAddressService;
		}

		public void setEnableInternetAddressService(Boolean enableInternetAddressService) {
			this.enableInternetAddressService = enableInternetAddressService;
		}

		public String getPrimaryZone() {
			return this.primaryZone;
		}

		public void setPrimaryZone(String primaryZone) {
			this.primaryZone = primaryZone;
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

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getClogServiceStatus() {
			return this.clogServiceStatus;
		}

		public void setClogServiceStatus(String clogServiceStatus) {
			this.clogServiceStatus = clogServiceStatus;
		}

		public Boolean getEnableClogService() {
			return this.enableClogService;
		}

		public void setEnableClogService(Boolean enableClogService) {
			this.enableClogService = enableClogService;
		}

		public String getCharset() {
			return this.charset;
		}

		public void setCharset(String charset) {
			this.charset = charset;
		}

		public String getCollation() {
			return this.collation;
		}

		public void setCollation(String collation) {
			this.collation = collation;
		}

		public String getPrimaryZoneDeployType() {
			return this.primaryZoneDeployType;
		}

		public void setPrimaryZoneDeployType(String primaryZoneDeployType) {
			this.primaryZoneDeployType = primaryZoneDeployType;
		}

		public String getMasterIntranetAddressZone() {
			return this.masterIntranetAddressZone;
		}

		public void setMasterIntranetAddressZone(String masterIntranetAddressZone) {
			this.masterIntranetAddressZone = masterIntranetAddressZone;
		}

		public String getPayType() {
			return this.payType;
		}

		public void setPayType(String payType) {
			this.payType = payType;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public String getSeries() {
			return this.series;
		}

		public void setSeries(String series) {
			this.series = series;
		}

		public String getDiskType() {
			return this.diskType;
		}

		public void setDiskType(String diskType) {
			this.diskType = diskType;
		}

		public Boolean getEnableReadWriteSplit() {
			return this.enableReadWriteSplit;
		}

		public void setEnableReadWriteSplit(Boolean enableReadWriteSplit) {
			this.enableReadWriteSplit = enableReadWriteSplit;
		}

		public Boolean getEnableParallelQuery() {
			return this.enableParallelQuery;
		}

		public void setEnableParallelQuery(Boolean enableParallelQuery) {
			this.enableParallelQuery = enableParallelQuery;
		}

		public Long getMaxParallelQueryDegree() {
			return this.maxParallelQueryDegree;
		}

		public void setMaxParallelQueryDegree(Long maxParallelQueryDegree) {
			this.maxParallelQueryDegree = maxParallelQueryDegree;
		}

		public Boolean getEnableBinlogService() {
			return this.enableBinlogService;
		}

		public void setEnableBinlogService(Boolean enableBinlogService) {
			this.enableBinlogService = enableBinlogService;
		}

		public String getTimeZone() {
			return this.timeZone;
		}

		public void setTimeZone(String timeZone) {
			this.timeZone = timeZone;
		}

		public String getDataMergeTime() {
			return this.dataMergeTime;
		}

		public void setDataMergeTime(String dataMergeTime) {
			this.dataMergeTime = dataMergeTime;
		}

		public Boolean getEnableReadOnlyReplica() {
			return this.enableReadOnlyReplica;
		}

		public void setEnableReadOnlyReplica(Boolean enableReadOnlyReplica) {
			this.enableReadOnlyReplica = enableReadOnlyReplica;
		}

		public String getRecycleBinStatus() {
			return this.recycleBinStatus;
		}

		public void setRecycleBinStatus(String recycleBinStatus) {
			this.recycleBinStatus = recycleBinStatus;
		}

		public Integer getLowerCaseTableNames() {
			return this.lowerCaseTableNames;
		}

		public void setLowerCaseTableNames(Integer lowerCaseTableNames) {
			this.lowerCaseTableNames = lowerCaseTableNames;
		}

		public String getVersion() {
			return this.version;
		}

		public void setVersion(String version) {
			this.version = version;
		}

		public List<TenantConnectionsItem> getTenantConnections() {
			return this.tenantConnections;
		}

		public void setTenantConnections(List<TenantConnectionsItem> tenantConnections) {
			this.tenantConnections = tenantConnections;
		}

		public List<TenantZonesItem> getTenantZones() {
			return this.tenantZones;
		}

		public void setTenantZones(List<TenantZonesItem> tenantZones) {
			this.tenantZones = tenantZones;
		}

		public List<String> getAvailableZones() {
			return this.availableZones;
		}

		public void setAvailableZones(List<String> availableZones) {
			this.availableZones = availableZones;
		}

		public TenantResource getTenantResource() {
			return this.tenantResource;
		}

		public void setTenantResource(TenantResource tenantResource) {
			this.tenantResource = tenantResource;
		}

		public ReadOnlyResource getReadOnlyResource() {
			return this.readOnlyResource;
		}

		public void setReadOnlyResource(ReadOnlyResource readOnlyResource) {
			this.readOnlyResource = readOnlyResource;
		}

		public static class TenantConnectionsItem {

			private String intranetAddress;

			private Integer intranetPort;

			private String internetAddress;

			private Integer internetPort;

			private String vpcId;

			private String vSwitchId;

			private String intranetAddressMasterZoneId;

			private String intranetAddressSlaveZoneId;

			private String intranetAddressStatus;

			private String internetAddressStatus;

			private Boolean transactionSplit;

			private String addressType;

			private Boolean enableTransactionSplit;

			private Long parallelQueryDegree;

			private String tenantEndpointId;

			private Long maxConnectionNum;

			private String connectionReplicaType;

			private String proxyClusterId;

			private Long maxConnectionLimit;

			private Long internetMaxConnectionLimit;

			private Integer intranetRpcPort;

			private Long internetMaxConnectionNum;

			private Integer internetRpcPort;

			private List<String> connectionZones;

			private List<String> connectionLogicalZones;

			public String getIntranetAddress() {
				return this.intranetAddress;
			}

			public void setIntranetAddress(String intranetAddress) {
				this.intranetAddress = intranetAddress;
			}

			public Integer getIntranetPort() {
				return this.intranetPort;
			}

			public void setIntranetPort(Integer intranetPort) {
				this.intranetPort = intranetPort;
			}

			public String getInternetAddress() {
				return this.internetAddress;
			}

			public void setInternetAddress(String internetAddress) {
				this.internetAddress = internetAddress;
			}

			public Integer getInternetPort() {
				return this.internetPort;
			}

			public void setInternetPort(Integer internetPort) {
				this.internetPort = internetPort;
			}

			public String getVpcId() {
				return this.vpcId;
			}

			public void setVpcId(String vpcId) {
				this.vpcId = vpcId;
			}

			public String getVSwitchId() {
				return this.vSwitchId;
			}

			public void setVSwitchId(String vSwitchId) {
				this.vSwitchId = vSwitchId;
			}

			public String getIntranetAddressMasterZoneId() {
				return this.intranetAddressMasterZoneId;
			}

			public void setIntranetAddressMasterZoneId(String intranetAddressMasterZoneId) {
				this.intranetAddressMasterZoneId = intranetAddressMasterZoneId;
			}

			public String getIntranetAddressSlaveZoneId() {
				return this.intranetAddressSlaveZoneId;
			}

			public void setIntranetAddressSlaveZoneId(String intranetAddressSlaveZoneId) {
				this.intranetAddressSlaveZoneId = intranetAddressSlaveZoneId;
			}

			public String getIntranetAddressStatus() {
				return this.intranetAddressStatus;
			}

			public void setIntranetAddressStatus(String intranetAddressStatus) {
				this.intranetAddressStatus = intranetAddressStatus;
			}

			public String getInternetAddressStatus() {
				return this.internetAddressStatus;
			}

			public void setInternetAddressStatus(String internetAddressStatus) {
				this.internetAddressStatus = internetAddressStatus;
			}

			public Boolean getTransactionSplit() {
				return this.transactionSplit;
			}

			public void setTransactionSplit(Boolean transactionSplit) {
				this.transactionSplit = transactionSplit;
			}

			public String getAddressType() {
				return this.addressType;
			}

			public void setAddressType(String addressType) {
				this.addressType = addressType;
			}

			public Boolean getEnableTransactionSplit() {
				return this.enableTransactionSplit;
			}

			public void setEnableTransactionSplit(Boolean enableTransactionSplit) {
				this.enableTransactionSplit = enableTransactionSplit;
			}

			public Long getParallelQueryDegree() {
				return this.parallelQueryDegree;
			}

			public void setParallelQueryDegree(Long parallelQueryDegree) {
				this.parallelQueryDegree = parallelQueryDegree;
			}

			public String getTenantEndpointId() {
				return this.tenantEndpointId;
			}

			public void setTenantEndpointId(String tenantEndpointId) {
				this.tenantEndpointId = tenantEndpointId;
			}

			public Long getMaxConnectionNum() {
				return this.maxConnectionNum;
			}

			public void setMaxConnectionNum(Long maxConnectionNum) {
				this.maxConnectionNum = maxConnectionNum;
			}

			public String getConnectionReplicaType() {
				return this.connectionReplicaType;
			}

			public void setConnectionReplicaType(String connectionReplicaType) {
				this.connectionReplicaType = connectionReplicaType;
			}

			public String getProxyClusterId() {
				return this.proxyClusterId;
			}

			public void setProxyClusterId(String proxyClusterId) {
				this.proxyClusterId = proxyClusterId;
			}

			public Long getMaxConnectionLimit() {
				return this.maxConnectionLimit;
			}

			public void setMaxConnectionLimit(Long maxConnectionLimit) {
				this.maxConnectionLimit = maxConnectionLimit;
			}

			public Long getInternetMaxConnectionLimit() {
				return this.internetMaxConnectionLimit;
			}

			public void setInternetMaxConnectionLimit(Long internetMaxConnectionLimit) {
				this.internetMaxConnectionLimit = internetMaxConnectionLimit;
			}

			public Integer getIntranetRpcPort() {
				return this.intranetRpcPort;
			}

			public void setIntranetRpcPort(Integer intranetRpcPort) {
				this.intranetRpcPort = intranetRpcPort;
			}

			public Long getInternetMaxConnectionNum() {
				return this.internetMaxConnectionNum;
			}

			public void setInternetMaxConnectionNum(Long internetMaxConnectionNum) {
				this.internetMaxConnectionNum = internetMaxConnectionNum;
			}

			public Integer getInternetRpcPort() {
				return this.internetRpcPort;
			}

			public void setInternetRpcPort(Integer internetRpcPort) {
				this.internetRpcPort = internetRpcPort;
			}

			public List<String> getConnectionZones() {
				return this.connectionZones;
			}

			public void setConnectionZones(List<String> connectionZones) {
				this.connectionZones = connectionZones;
			}

			public List<String> getConnectionLogicalZones() {
				return this.connectionLogicalZones;
			}

			public void setConnectionLogicalZones(List<String> connectionLogicalZones) {
				this.connectionLogicalZones = connectionLogicalZones;
			}
		}

		public static class TenantZonesItem {

			private String tenantZoneId;

			private String region;

			private String tenantZoneRole;

			private List<TenantZoneReplicasItem> tenantZoneReplicas;

			public String getTenantZoneId() {
				return this.tenantZoneId;
			}

			public void setTenantZoneId(String tenantZoneId) {
				this.tenantZoneId = tenantZoneId;
			}

			public String getRegion() {
				return this.region;
			}

			public void setRegion(String region) {
				this.region = region;
			}

			public String getTenantZoneRole() {
				return this.tenantZoneRole;
			}

			public void setTenantZoneRole(String tenantZoneRole) {
				this.tenantZoneRole = tenantZoneRole;
			}

			public List<TenantZoneReplicasItem> getTenantZoneReplicas() {
				return this.tenantZoneReplicas;
			}

			public void setTenantZoneReplicas(List<TenantZoneReplicasItem> tenantZoneReplicas) {
				this.tenantZoneReplicas = tenantZoneReplicas;
			}

			public static class TenantZoneReplicasItem {

				private String zoneReplicaType;

				private String zoneNodes;

				private String logicZoneName;

				private Integer zoneCopyId;

				private Integer fullCopyId;

				private String readOnlyCopyId;

				public String getZoneReplicaType() {
					return this.zoneReplicaType;
				}

				public void setZoneReplicaType(String zoneReplicaType) {
					this.zoneReplicaType = zoneReplicaType;
				}

				public String getZoneNodes() {
					return this.zoneNodes;
				}

				public void setZoneNodes(String zoneNodes) {
					this.zoneNodes = zoneNodes;
				}

				public String getLogicZoneName() {
					return this.logicZoneName;
				}

				public void setLogicZoneName(String logicZoneName) {
					this.logicZoneName = logicZoneName;
				}

				public Integer getZoneCopyId() {
					return this.zoneCopyId;
				}

				public void setZoneCopyId(Integer zoneCopyId) {
					this.zoneCopyId = zoneCopyId;
				}

				public Integer getFullCopyId() {
					return this.fullCopyId;
				}

				public void setFullCopyId(Integer fullCopyId) {
					this.fullCopyId = fullCopyId;
				}

				public String getReadOnlyCopyId() {
					return this.readOnlyCopyId;
				}

				public void setReadOnlyCopyId(String readOnlyCopyId) {
					this.readOnlyCopyId = readOnlyCopyId;
				}
			}
		}

		public static class TenantResource {

			private Integer unitNum;

			private Cpu cpu;

			private Memory memory;

			private DiskSize diskSize;

			private CapacityUnit capacityUnit;

			private LogDiskSize logDiskSize;

			public Integer getUnitNum() {
				return this.unitNum;
			}

			public void setUnitNum(Integer unitNum) {
				this.unitNum = unitNum;
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

			public LogDiskSize getLogDiskSize() {
				return this.logDiskSize;
			}

			public void setLogDiskSize(LogDiskSize logDiskSize) {
				this.logDiskSize = logDiskSize;
			}

			public static class Cpu {

				private Float usedCpu;

				private Float totalCpu;

				private Float unitCpu;

				public Float getUsedCpu() {
					return this.usedCpu;
				}

				public void setUsedCpu(Float usedCpu) {
					this.usedCpu = usedCpu;
				}

				public Float getTotalCpu() {
					return this.totalCpu;
				}

				public void setTotalCpu(Float totalCpu) {
					this.totalCpu = totalCpu;
				}

				public Float getUnitCpu() {
					return this.unitCpu;
				}

				public void setUnitCpu(Float unitCpu) {
					this.unitCpu = unitCpu;
				}
			}

			public static class Memory {

				private Float usedMemory;

				private Float totalMemory;

				private Float unitMemory;

				public Float getUsedMemory() {
					return this.usedMemory;
				}

				public void setUsedMemory(Float usedMemory) {
					this.usedMemory = usedMemory;
				}

				public Float getTotalMemory() {
					return this.totalMemory;
				}

				public void setTotalMemory(Float totalMemory) {
					this.totalMemory = totalMemory;
				}

				public Float getUnitMemory() {
					return this.unitMemory;
				}

				public void setUnitMemory(Float unitMemory) {
					this.unitMemory = unitMemory;
				}
			}

			public static class DiskSize {

				private Float usedDiskSize;

				public Float getUsedDiskSize() {
					return this.usedDiskSize;
				}

				public void setUsedDiskSize(Float usedDiskSize) {
					this.usedDiskSize = usedDiskSize;
				}
			}

			public static class CapacityUnit {

				private Integer maxCapacityUnit;

				private Integer minCapacityUnit;

				private Integer usedCapacit;

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

				public Integer getUsedCapacit() {
					return this.usedCapacit;
				}

				public void setUsedCapacit(Integer usedCapacit) {
					this.usedCapacit = usedCapacit;
				}
			}

			public static class LogDiskSize {

				private Integer totalLogDisk;

				private Integer unitLogDisk;

				public Integer getTotalLogDisk() {
					return this.totalLogDisk;
				}

				public void setTotalLogDisk(Integer totalLogDisk) {
					this.totalLogDisk = totalLogDisk;
				}

				public Integer getUnitLogDisk() {
					return this.unitLogDisk;
				}

				public void setUnitLogDisk(Integer unitLogDisk) {
					this.unitLogDisk = unitLogDisk;
				}
			}
		}

		public static class ReadOnlyResource {

			private Integer unitNum;

			private Cpu1 cpu1;

			private Memory2 memory2;

			private DiskSize3 diskSize3;

			private CapacityUnit4 capacityUnit4;

			private LogDiskSize5 logDiskSize5;

			public Integer getUnitNum() {
				return this.unitNum;
			}

			public void setUnitNum(Integer unitNum) {
				this.unitNum = unitNum;
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

			public CapacityUnit4 getCapacityUnit4() {
				return this.capacityUnit4;
			}

			public void setCapacityUnit4(CapacityUnit4 capacityUnit4) {
				this.capacityUnit4 = capacityUnit4;
			}

			public LogDiskSize5 getLogDiskSize5() {
				return this.logDiskSize5;
			}

			public void setLogDiskSize5(LogDiskSize5 logDiskSize5) {
				this.logDiskSize5 = logDiskSize5;
			}

			public static class Cpu1 {

				private Float usedCpu;

				private Float totalCpu;

				private Float unitCpu;

				public Float getUsedCpu() {
					return this.usedCpu;
				}

				public void setUsedCpu(Float usedCpu) {
					this.usedCpu = usedCpu;
				}

				public Float getTotalCpu() {
					return this.totalCpu;
				}

				public void setTotalCpu(Float totalCpu) {
					this.totalCpu = totalCpu;
				}

				public Float getUnitCpu() {
					return this.unitCpu;
				}

				public void setUnitCpu(Float unitCpu) {
					this.unitCpu = unitCpu;
				}
			}

			public static class Memory2 {

				private Float usedMemory;

				private Float totalMemory;

				private Float unitMemory;

				public Float getUsedMemory() {
					return this.usedMemory;
				}

				public void setUsedMemory(Float usedMemory) {
					this.usedMemory = usedMemory;
				}

				public Float getTotalMemory() {
					return this.totalMemory;
				}

				public void setTotalMemory(Float totalMemory) {
					this.totalMemory = totalMemory;
				}

				public Float getUnitMemory() {
					return this.unitMemory;
				}

				public void setUnitMemory(Float unitMemory) {
					this.unitMemory = unitMemory;
				}
			}

			public static class DiskSize3 {

				private Float usedDiskSize;

				public Float getUsedDiskSize() {
					return this.usedDiskSize;
				}

				public void setUsedDiskSize(Float usedDiskSize) {
					this.usedDiskSize = usedDiskSize;
				}
			}

			public static class CapacityUnit4 {

				private Integer maxCapacityUnit;

				private Integer minCapacityUnit;

				private Integer usedCapacit;

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

				public Integer getUsedCapacit() {
					return this.usedCapacit;
				}

				public void setUsedCapacit(Integer usedCapacit) {
					this.usedCapacit = usedCapacit;
				}
			}

			public static class LogDiskSize5 {

				private Integer totalLogDisk;

				private Integer unitLogDisk;

				public Integer getTotalLogDisk() {
					return this.totalLogDisk;
				}

				public void setTotalLogDisk(Integer totalLogDisk) {
					this.totalLogDisk = totalLogDisk;
				}

				public Integer getUnitLogDisk() {
					return this.unitLogDisk;
				}

				public void setUnitLogDisk(Integer unitLogDisk) {
					this.unitLogDisk = unitLogDisk;
				}
			}
		}
	}

	@Override
	public DescribeTenantResponse getInstance(UnmarshallerContext context) {
		return	DescribeTenantResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
