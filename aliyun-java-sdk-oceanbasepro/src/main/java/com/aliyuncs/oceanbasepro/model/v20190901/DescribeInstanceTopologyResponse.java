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
import com.aliyuncs.oceanbasepro.transform.v20190901.DescribeInstanceTopologyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeInstanceTopologyResponse extends AcsResponse {

	private String requestId;

	private InstanceTopology instanceTopology;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public InstanceTopology getInstanceTopology() {
		return this.instanceTopology;
	}

	public void setInstanceTopology(InstanceTopology instanceTopology) {
		this.instanceTopology = instanceTopology;
	}

	public static class InstanceTopology {

		private List<TenantsItem> tenants;

		private List<ZonesItem> zones;

		private List<ReplicasItem> replicas;

		public List<TenantsItem> getTenants() {
			return this.tenants;
		}

		public void setTenants(List<TenantsItem> tenants) {
			this.tenants = tenants;
		}

		public List<ZonesItem> getZones() {
			return this.zones;
		}

		public void setZones(List<ZonesItem> zones) {
			this.zones = zones;
		}

		public List<ReplicasItem> getReplicas() {
			return this.replicas;
		}

		public void setReplicas(List<ReplicasItem> replicas) {
			this.replicas = replicas;
		}

		public static class TenantsItem {

			private String tenantId;

			private String tenantName;

			private Float tenantCpu;

			private Float tenantMemory;

			private String tenantMode;

			private String tenantStatus;

			private String tenantDeployType;

			private Integer tenantUnitNum;

			private String primaryZoneDeployType;

			private Float tenantDiskSize;

			private Float tenantUnitCpu;

			private Float tenantUnitMemory;

			private List<TenantZonesItem> tenantZones;

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

			public Float getTenantCpu() {
				return this.tenantCpu;
			}

			public void setTenantCpu(Float tenantCpu) {
				this.tenantCpu = tenantCpu;
			}

			public Float getTenantMemory() {
				return this.tenantMemory;
			}

			public void setTenantMemory(Float tenantMemory) {
				this.tenantMemory = tenantMemory;
			}

			public String getTenantMode() {
				return this.tenantMode;
			}

			public void setTenantMode(String tenantMode) {
				this.tenantMode = tenantMode;
			}

			public String getTenantStatus() {
				return this.tenantStatus;
			}

			public void setTenantStatus(String tenantStatus) {
				this.tenantStatus = tenantStatus;
			}

			public String getTenantDeployType() {
				return this.tenantDeployType;
			}

			public void setTenantDeployType(String tenantDeployType) {
				this.tenantDeployType = tenantDeployType;
			}

			public Integer getTenantUnitNum() {
				return this.tenantUnitNum;
			}

			public void setTenantUnitNum(Integer tenantUnitNum) {
				this.tenantUnitNum = tenantUnitNum;
			}

			public String getPrimaryZoneDeployType() {
				return this.primaryZoneDeployType;
			}

			public void setPrimaryZoneDeployType(String primaryZoneDeployType) {
				this.primaryZoneDeployType = primaryZoneDeployType;
			}

			public Float getTenantDiskSize() {
				return this.tenantDiskSize;
			}

			public void setTenantDiskSize(Float tenantDiskSize) {
				this.tenantDiskSize = tenantDiskSize;
			}

			public Float getTenantUnitCpu() {
				return this.tenantUnitCpu;
			}

			public void setTenantUnitCpu(Float tenantUnitCpu) {
				this.tenantUnitCpu = tenantUnitCpu;
			}

			public Float getTenantUnitMemory() {
				return this.tenantUnitMemory;
			}

			public void setTenantUnitMemory(Float tenantUnitMemory) {
				this.tenantUnitMemory = tenantUnitMemory;
			}

			public List<TenantZonesItem> getTenantZones() {
				return this.tenantZones;
			}

			public void setTenantZones(List<TenantZonesItem> tenantZones) {
				this.tenantZones = tenantZones;
			}

			public static class TenantZonesItem {

				private String tenantZoneRole;

				private Boolean isPrimaryTenantZone;

				private String tenantZoneId;

				private String logicalZone;

				private String replicaType;

				private List<UnitsItem> units;

				public String getTenantZoneRole() {
					return this.tenantZoneRole;
				}

				public void setTenantZoneRole(String tenantZoneRole) {
					this.tenantZoneRole = tenantZoneRole;
				}

				public Boolean getIsPrimaryTenantZone() {
					return this.isPrimaryTenantZone;
				}

				public void setIsPrimaryTenantZone(Boolean isPrimaryTenantZone) {
					this.isPrimaryTenantZone = isPrimaryTenantZone;
				}

				public String getTenantZoneId() {
					return this.tenantZoneId;
				}

				public void setTenantZoneId(String tenantZoneId) {
					this.tenantZoneId = tenantZoneId;
				}

				public String getLogicalZone() {
					return this.logicalZone;
				}

				public void setLogicalZone(String logicalZone) {
					this.logicalZone = logicalZone;
				}

				public String getReplicaType() {
					return this.replicaType;
				}

				public void setReplicaType(String replicaType) {
					this.replicaType = replicaType;
				}

				public List<UnitsItem> getUnits() {
					return this.units;
				}

				public void setUnits(List<UnitsItem> units) {
					this.units = units;
				}

				public static class UnitsItem {

					private String unitId;

					private String unitStatus;

					private String nodeId;

					private Float unitCpu;

					private Float unitMemory;

					private Boolean enableMigrateUnit;

					private Boolean manualMigrate;

					private Boolean enableCancelMigrateUnit;

					private Long unitDataSize;

					private String replicaType;

					public String getUnitId() {
						return this.unitId;
					}

					public void setUnitId(String unitId) {
						this.unitId = unitId;
					}

					public String getUnitStatus() {
						return this.unitStatus;
					}

					public void setUnitStatus(String unitStatus) {
						this.unitStatus = unitStatus;
					}

					public String getNodeId() {
						return this.nodeId;
					}

					public void setNodeId(String nodeId) {
						this.nodeId = nodeId;
					}

					public Float getUnitCpu() {
						return this.unitCpu;
					}

					public void setUnitCpu(Float unitCpu) {
						this.unitCpu = unitCpu;
					}

					public Float getUnitMemory() {
						return this.unitMemory;
					}

					public void setUnitMemory(Float unitMemory) {
						this.unitMemory = unitMemory;
					}

					public Boolean getEnableMigrateUnit() {
						return this.enableMigrateUnit;
					}

					public void setEnableMigrateUnit(Boolean enableMigrateUnit) {
						this.enableMigrateUnit = enableMigrateUnit;
					}

					public Boolean getManualMigrate() {
						return this.manualMigrate;
					}

					public void setManualMigrate(Boolean manualMigrate) {
						this.manualMigrate = manualMigrate;
					}

					public Boolean getEnableCancelMigrateUnit() {
						return this.enableCancelMigrateUnit;
					}

					public void setEnableCancelMigrateUnit(Boolean enableCancelMigrateUnit) {
						this.enableCancelMigrateUnit = enableCancelMigrateUnit;
					}

					public Long getUnitDataSize() {
						return this.unitDataSize;
					}

					public void setUnitDataSize(Long unitDataSize) {
						this.unitDataSize = unitDataSize;
					}

					public String getReplicaType() {
						return this.replicaType;
					}

					public void setReplicaType(String replicaType) {
						this.replicaType = replicaType;
					}
				}
			}
		}

		public static class ZonesItem {

			private String zoneId;

			private String region;

			private String zoneDisk;

			private List<NodesItem> nodes;

			private ZoneResource zoneResource;

			public String getZoneId() {
				return this.zoneId;
			}

			public void setZoneId(String zoneId) {
				this.zoneId = zoneId;
			}

			public String getRegion() {
				return this.region;
			}

			public void setRegion(String region) {
				this.region = region;
			}

			public String getZoneDisk() {
				return this.zoneDisk;
			}

			public void setZoneDisk(String zoneDisk) {
				this.zoneDisk = zoneDisk;
			}

			public List<NodesItem> getNodes() {
				return this.nodes;
			}

			public void setNodes(List<NodesItem> nodes) {
				this.nodes = nodes;
			}

			public ZoneResource getZoneResource() {
				return this.zoneResource;
			}

			public void setZoneResource(ZoneResource zoneResource) {
				this.zoneResource = zoneResource;
			}

			public static class NodesItem {

				private String nodeId;

				private Long nodeCopyId;

				private String nodeStatus;

				private String replicaType;

				private Long fullCopyId;

				private Long readOnlyCopyId;

				private String logicalZone;

				private NodeResource nodeResource;

				public String getNodeId() {
					return this.nodeId;
				}

				public void setNodeId(String nodeId) {
					this.nodeId = nodeId;
				}

				public Long getNodeCopyId() {
					return this.nodeCopyId;
				}

				public void setNodeCopyId(Long nodeCopyId) {
					this.nodeCopyId = nodeCopyId;
				}

				public String getNodeStatus() {
					return this.nodeStatus;
				}

				public void setNodeStatus(String nodeStatus) {
					this.nodeStatus = nodeStatus;
				}

				public String getReplicaType() {
					return this.replicaType;
				}

				public void setReplicaType(String replicaType) {
					this.replicaType = replicaType;
				}

				public Long getFullCopyId() {
					return this.fullCopyId;
				}

				public void setFullCopyId(Long fullCopyId) {
					this.fullCopyId = fullCopyId;
				}

				public Long getReadOnlyCopyId() {
					return this.readOnlyCopyId;
				}

				public void setReadOnlyCopyId(Long readOnlyCopyId) {
					this.readOnlyCopyId = readOnlyCopyId;
				}

				public String getLogicalZone() {
					return this.logicalZone;
				}

				public void setLogicalZone(String logicalZone) {
					this.logicalZone = logicalZone;
				}

				public NodeResource getNodeResource() {
					return this.nodeResource;
				}

				public void setNodeResource(NodeResource nodeResource) {
					this.nodeResource = nodeResource;
				}

				public static class NodeResource {

					private Cpu cpu;

					private Memory memory;

					private DiskSize diskSize;

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

					public static class Cpu {

						private Float usedCpu;

						private Integer totalCpu;

						public Float getUsedCpu() {
							return this.usedCpu;
						}

						public void setUsedCpu(Float usedCpu) {
							this.usedCpu = usedCpu;
						}

						public Integer getTotalCpu() {
							return this.totalCpu;
						}

						public void setTotalCpu(Integer totalCpu) {
							this.totalCpu = totalCpu;
						}
					}

					public static class Memory {

						private Float usedMemory;

						private Long totalMemory;

						public Float getUsedMemory() {
							return this.usedMemory;
						}

						public void setUsedMemory(Float usedMemory) {
							this.usedMemory = usedMemory;
						}

						public Long getTotalMemory() {
							return this.totalMemory;
						}

						public void setTotalMemory(Long totalMemory) {
							this.totalMemory = totalMemory;
						}
					}

					public static class DiskSize {

						private Double totalDiskSize;

						private Double usedDiskSize;

						public Double getTotalDiskSize() {
							return this.totalDiskSize;
						}

						public void setTotalDiskSize(Double totalDiskSize) {
							this.totalDiskSize = totalDiskSize;
						}

						public Double getUsedDiskSize() {
							return this.usedDiskSize;
						}

						public void setUsedDiskSize(Double usedDiskSize) {
							this.usedDiskSize = usedDiskSize;
						}
					}
				}
			}

			public static class ZoneResource {

				private DiskSize1 diskSize1;

				public DiskSize1 getDiskSize1() {
					return this.diskSize1;
				}

				public void setDiskSize1(DiskSize1 diskSize1) {
					this.diskSize1 = diskSize1;
				}

				public static class DiskSize1 {

					private Double maxDiskUsedPercent;

					private List<String> maxDiskUsedObServer;

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
			}
		}

		public static class ReplicasItem {

			private String logicalZone;

			private Integer nodeNum;

			private String zoneLogicalName;

			private String zoneRegionName;

			private Integer zoneLogicalId;

			private String replicaType;

			private String status;

			private ReplicaResource replicaResource;

			public String getLogicalZone() {
				return this.logicalZone;
			}

			public void setLogicalZone(String logicalZone) {
				this.logicalZone = logicalZone;
			}

			public Integer getNodeNum() {
				return this.nodeNum;
			}

			public void setNodeNum(Integer nodeNum) {
				this.nodeNum = nodeNum;
			}

			public String getZoneLogicalName() {
				return this.zoneLogicalName;
			}

			public void setZoneLogicalName(String zoneLogicalName) {
				this.zoneLogicalName = zoneLogicalName;
			}

			public String getZoneRegionName() {
				return this.zoneRegionName;
			}

			public void setZoneRegionName(String zoneRegionName) {
				this.zoneRegionName = zoneRegionName;
			}

			public Integer getZoneLogicalId() {
				return this.zoneLogicalId;
			}

			public void setZoneLogicalId(Integer zoneLogicalId) {
				this.zoneLogicalId = zoneLogicalId;
			}

			public String getReplicaType() {
				return this.replicaType;
			}

			public void setReplicaType(String replicaType) {
				this.replicaType = replicaType;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public ReplicaResource getReplicaResource() {
				return this.replicaResource;
			}

			public void setReplicaResource(ReplicaResource replicaResource) {
				this.replicaResource = replicaResource;
			}

			public static class ReplicaResource {

				private Memory2 memory2;

				private DiskSize3 diskSize3;

				private Cpu4 cpu4;

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

				public Cpu4 getCpu4() {
					return this.cpu4;
				}

				public void setCpu4(Cpu4 cpu4) {
					this.cpu4 = cpu4;
				}

				public static class Memory2 {

					private Long usedMemory;

					private Long totalMemory;

					public Long getUsedMemory() {
						return this.usedMemory;
					}

					public void setUsedMemory(Long usedMemory) {
						this.usedMemory = usedMemory;
					}

					public Long getTotalMemory() {
						return this.totalMemory;
					}

					public void setTotalMemory(Long totalMemory) {
						this.totalMemory = totalMemory;
					}
				}

				public static class DiskSize3 {

					private Float usedDiskSize;

					private Long totalDiskSize;

					public Float getUsedDiskSize() {
						return this.usedDiskSize;
					}

					public void setUsedDiskSize(Float usedDiskSize) {
						this.usedDiskSize = usedDiskSize;
					}

					public Long getTotalDiskSize() {
						return this.totalDiskSize;
					}

					public void setTotalDiskSize(Long totalDiskSize) {
						this.totalDiskSize = totalDiskSize;
					}
				}

				public static class Cpu4 {

					private Integer totalCpu;

					private Integer usedCpu;

					public Integer getTotalCpu() {
						return this.totalCpu;
					}

					public void setTotalCpu(Integer totalCpu) {
						this.totalCpu = totalCpu;
					}

					public Integer getUsedCpu() {
						return this.usedCpu;
					}

					public void setUsedCpu(Integer usedCpu) {
						this.usedCpu = usedCpu;
					}
				}
			}
		}
	}

	@Override
	public DescribeInstanceTopologyResponse getInstance(UnmarshallerContext context) {
		return	DescribeInstanceTopologyResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
