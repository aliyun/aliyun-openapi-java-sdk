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

			public List<TenantZonesItem> getTenantZones() {
				return this.tenantZones;
			}

			public void setTenantZones(List<TenantZonesItem> tenantZones) {
				this.tenantZones = tenantZones;
			}

			public static class TenantZonesItem {

				private String tenantZoneRole;

				private String isPrimaryTenantZone;

				private String tenantZoneId;

				private List<UnitsItem> units;

				public String getTenantZoneRole() {
					return this.tenantZoneRole;
				}

				public void setTenantZoneRole(String tenantZoneRole) {
					this.tenantZoneRole = tenantZoneRole;
				}

				public String getIsPrimaryTenantZone() {
					return this.isPrimaryTenantZone;
				}

				public void setIsPrimaryTenantZone(String isPrimaryTenantZone) {
					this.isPrimaryTenantZone = isPrimaryTenantZone;
				}

				public String getTenantZoneId() {
					return this.tenantZoneId;
				}

				public void setTenantZoneId(String tenantZoneId) {
					this.tenantZoneId = tenantZoneId;
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

				private List<NodeResourceItem> nodeResource;

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

				public List<NodeResourceItem> getNodeResource() {
					return this.nodeResource;
				}

				public void setNodeResource(List<NodeResourceItem> nodeResource) {
					this.nodeResource = nodeResource;
				}

				public static class NodeResourceItem {

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
