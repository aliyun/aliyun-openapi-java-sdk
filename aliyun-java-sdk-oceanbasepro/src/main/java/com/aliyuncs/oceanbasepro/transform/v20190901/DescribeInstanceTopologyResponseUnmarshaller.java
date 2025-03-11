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

package com.aliyuncs.oceanbasepro.transform.v20190901;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.oceanbasepro.model.v20190901.DescribeInstanceTopologyResponse;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeInstanceTopologyResponse.InstanceTopology;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeInstanceTopologyResponse.InstanceTopology.ReplicasItem;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeInstanceTopologyResponse.InstanceTopology.ReplicasItem.ReplicaResource;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeInstanceTopologyResponse.InstanceTopology.ReplicasItem.ReplicaResource.Cpu4;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeInstanceTopologyResponse.InstanceTopology.ReplicasItem.ReplicaResource.DiskSize3;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeInstanceTopologyResponse.InstanceTopology.ReplicasItem.ReplicaResource.Memory2;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeInstanceTopologyResponse.InstanceTopology.TenantsItem;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeInstanceTopologyResponse.InstanceTopology.TenantsItem.TenantZonesItem;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeInstanceTopologyResponse.InstanceTopology.TenantsItem.TenantZonesItem.UnitsItem;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeInstanceTopologyResponse.InstanceTopology.ZonesItem;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeInstanceTopologyResponse.InstanceTopology.ZonesItem.NodesItem;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeInstanceTopologyResponse.InstanceTopology.ZonesItem.NodesItem.NodeResource;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeInstanceTopologyResponse.InstanceTopology.ZonesItem.NodesItem.NodeResource.Cpu;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeInstanceTopologyResponse.InstanceTopology.ZonesItem.NodesItem.NodeResource.DiskSize;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeInstanceTopologyResponse.InstanceTopology.ZonesItem.NodesItem.NodeResource.Memory;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeInstanceTopologyResponse.InstanceTopology.ZonesItem.ZoneResource;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeInstanceTopologyResponse.InstanceTopology.ZonesItem.ZoneResource.DiskSize1;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceTopologyResponseUnmarshaller {

	public static DescribeInstanceTopologyResponse unmarshall(DescribeInstanceTopologyResponse describeInstanceTopologyResponse, UnmarshallerContext _ctx) {
		
		describeInstanceTopologyResponse.setRequestId(_ctx.stringValue("DescribeInstanceTopologyResponse.RequestId"));

		InstanceTopology instanceTopology = new InstanceTopology();

		List<TenantsItem> tenants = new ArrayList<TenantsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceTopologyResponse.InstanceTopology.Tenants.Length"); i++) {
			TenantsItem tenantsItem = new TenantsItem();
			tenantsItem.setTenantId(_ctx.stringValue("DescribeInstanceTopologyResponse.InstanceTopology.Tenants["+ i +"].TenantId"));
			tenantsItem.setTenantName(_ctx.stringValue("DescribeInstanceTopologyResponse.InstanceTopology.Tenants["+ i +"].TenantName"));
			tenantsItem.setTenantCpu(_ctx.floatValue("DescribeInstanceTopologyResponse.InstanceTopology.Tenants["+ i +"].TenantCpu"));
			tenantsItem.setTenantMemory(_ctx.floatValue("DescribeInstanceTopologyResponse.InstanceTopology.Tenants["+ i +"].TenantMemory"));
			tenantsItem.setTenantMode(_ctx.stringValue("DescribeInstanceTopologyResponse.InstanceTopology.Tenants["+ i +"].TenantMode"));
			tenantsItem.setTenantStatus(_ctx.stringValue("DescribeInstanceTopologyResponse.InstanceTopology.Tenants["+ i +"].TenantStatus"));
			tenantsItem.setTenantDeployType(_ctx.stringValue("DescribeInstanceTopologyResponse.InstanceTopology.Tenants["+ i +"].TenantDeployType"));
			tenantsItem.setTenantUnitNum(_ctx.integerValue("DescribeInstanceTopologyResponse.InstanceTopology.Tenants["+ i +"].TenantUnitNum"));
			tenantsItem.setPrimaryZoneDeployType(_ctx.stringValue("DescribeInstanceTopologyResponse.InstanceTopology.Tenants["+ i +"].PrimaryZoneDeployType"));
			tenantsItem.setTenantDiskSize(_ctx.floatValue("DescribeInstanceTopologyResponse.InstanceTopology.Tenants["+ i +"].TenantDiskSize"));
			tenantsItem.setTenantUnitCpu(_ctx.floatValue("DescribeInstanceTopologyResponse.InstanceTopology.Tenants["+ i +"].TenantUnitCpu"));
			tenantsItem.setTenantUnitMemory(_ctx.floatValue("DescribeInstanceTopologyResponse.InstanceTopology.Tenants["+ i +"].TenantUnitMemory"));

			List<TenantZonesItem> tenantZones = new ArrayList<TenantZonesItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeInstanceTopologyResponse.InstanceTopology.Tenants["+ i +"].TenantZones.Length"); j++) {
				TenantZonesItem tenantZonesItem = new TenantZonesItem();
				tenantZonesItem.setTenantZoneRole(_ctx.stringValue("DescribeInstanceTopologyResponse.InstanceTopology.Tenants["+ i +"].TenantZones["+ j +"].TenantZoneRole"));
				tenantZonesItem.setIsPrimaryTenantZone(_ctx.booleanValue("DescribeInstanceTopologyResponse.InstanceTopology.Tenants["+ i +"].TenantZones["+ j +"].IsPrimaryTenantZone"));
				tenantZonesItem.setTenantZoneId(_ctx.stringValue("DescribeInstanceTopologyResponse.InstanceTopology.Tenants["+ i +"].TenantZones["+ j +"].TenantZoneId"));
				tenantZonesItem.setLogicalZone(_ctx.stringValue("DescribeInstanceTopologyResponse.InstanceTopology.Tenants["+ i +"].TenantZones["+ j +"].LogicalZone"));
				tenantZonesItem.setReplicaType(_ctx.stringValue("DescribeInstanceTopologyResponse.InstanceTopology.Tenants["+ i +"].TenantZones["+ j +"].ReplicaType"));
				tenantZonesItem.setReadOnlyReplicaType(_ctx.stringValue("DescribeInstanceTopologyResponse.InstanceTopology.Tenants["+ i +"].TenantZones["+ j +"].ReadOnlyReplicaType"));

				List<UnitsItem> units = new ArrayList<UnitsItem>();
				for (int k = 0; k < _ctx.lengthValue("DescribeInstanceTopologyResponse.InstanceTopology.Tenants["+ i +"].TenantZones["+ j +"].Units.Length"); k++) {
					UnitsItem unitsItem = new UnitsItem();
					unitsItem.setUnitId(_ctx.stringValue("DescribeInstanceTopologyResponse.InstanceTopology.Tenants["+ i +"].TenantZones["+ j +"].Units["+ k +"].UnitId"));
					unitsItem.setUnitStatus(_ctx.stringValue("DescribeInstanceTopologyResponse.InstanceTopology.Tenants["+ i +"].TenantZones["+ j +"].Units["+ k +"].UnitStatus"));
					unitsItem.setNodeId(_ctx.stringValue("DescribeInstanceTopologyResponse.InstanceTopology.Tenants["+ i +"].TenantZones["+ j +"].Units["+ k +"].NodeId"));
					unitsItem.setUnitCpu(_ctx.floatValue("DescribeInstanceTopologyResponse.InstanceTopology.Tenants["+ i +"].TenantZones["+ j +"].Units["+ k +"].UnitCpu"));
					unitsItem.setUnitMemory(_ctx.floatValue("DescribeInstanceTopologyResponse.InstanceTopology.Tenants["+ i +"].TenantZones["+ j +"].Units["+ k +"].UnitMemory"));
					unitsItem.setEnableMigrateUnit(_ctx.booleanValue("DescribeInstanceTopologyResponse.InstanceTopology.Tenants["+ i +"].TenantZones["+ j +"].Units["+ k +"].EnableMigrateUnit"));
					unitsItem.setManualMigrate(_ctx.booleanValue("DescribeInstanceTopologyResponse.InstanceTopology.Tenants["+ i +"].TenantZones["+ j +"].Units["+ k +"].ManualMigrate"));
					unitsItem.setEnableCancelMigrateUnit(_ctx.booleanValue("DescribeInstanceTopologyResponse.InstanceTopology.Tenants["+ i +"].TenantZones["+ j +"].Units["+ k +"].EnableCancelMigrateUnit"));
					unitsItem.setUnitDataSize(_ctx.longValue("DescribeInstanceTopologyResponse.InstanceTopology.Tenants["+ i +"].TenantZones["+ j +"].Units["+ k +"].UnitDataSize"));
					unitsItem.setReplicaType(_ctx.stringValue("DescribeInstanceTopologyResponse.InstanceTopology.Tenants["+ i +"].TenantZones["+ j +"].Units["+ k +"].ReplicaType"));

					units.add(unitsItem);
				}
				tenantZonesItem.setUnits(units);

				tenantZones.add(tenantZonesItem);
			}
			tenantsItem.setTenantZones(tenantZones);

			tenants.add(tenantsItem);
		}
		instanceTopology.setTenants(tenants);

		List<ZonesItem> zones = new ArrayList<ZonesItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceTopologyResponse.InstanceTopology.Zones.Length"); i++) {
			ZonesItem zonesItem = new ZonesItem();
			zonesItem.setZoneId(_ctx.stringValue("DescribeInstanceTopologyResponse.InstanceTopology.Zones["+ i +"].ZoneId"));
			zonesItem.setRegion(_ctx.stringValue("DescribeInstanceTopologyResponse.InstanceTopology.Zones["+ i +"].Region"));
			zonesItem.setZoneDisk(_ctx.stringValue("DescribeInstanceTopologyResponse.InstanceTopology.Zones["+ i +"].ZoneDisk"));

			ZoneResource zoneResource = new ZoneResource();

			DiskSize1 diskSize1 = new DiskSize1();
			diskSize1.setMaxDiskUsedPercent(_ctx.doubleValue("DescribeInstanceTopologyResponse.InstanceTopology.Zones["+ i +"].ZoneResource.DiskSize.MaxDiskUsedPercent"));

			List<String> maxDiskUsedObServer = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeInstanceTopologyResponse.InstanceTopology.Zones["+ i +"].ZoneResource.DiskSize.MaxDiskUsedObServer.Length"); j++) {
				maxDiskUsedObServer.add(_ctx.stringValue("DescribeInstanceTopologyResponse.InstanceTopology.Zones["+ i +"].ZoneResource.DiskSize.MaxDiskUsedObServer["+ j +"]"));
			}
			diskSize1.setMaxDiskUsedObServer(maxDiskUsedObServer);
			zoneResource.setDiskSize1(diskSize1);
			zonesItem.setZoneResource(zoneResource);

			List<NodesItem> nodes = new ArrayList<NodesItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeInstanceTopologyResponse.InstanceTopology.Zones["+ i +"].Nodes.Length"); j++) {
				NodesItem nodesItem = new NodesItem();
				nodesItem.setNodeId(_ctx.stringValue("DescribeInstanceTopologyResponse.InstanceTopology.Zones["+ i +"].Nodes["+ j +"].NodeId"));
				nodesItem.setNodeCopyId(_ctx.longValue("DescribeInstanceTopologyResponse.InstanceTopology.Zones["+ i +"].Nodes["+ j +"].NodeCopyId"));
				nodesItem.setNodeStatus(_ctx.stringValue("DescribeInstanceTopologyResponse.InstanceTopology.Zones["+ i +"].Nodes["+ j +"].NodeStatus"));
				nodesItem.setReplicaType(_ctx.stringValue("DescribeInstanceTopologyResponse.InstanceTopology.Zones["+ i +"].Nodes["+ j +"].ReplicaType"));
				nodesItem.setFullCopyId(_ctx.longValue("DescribeInstanceTopologyResponse.InstanceTopology.Zones["+ i +"].Nodes["+ j +"].FullCopyId"));
				nodesItem.setReadOnlyCopyId(_ctx.longValue("DescribeInstanceTopologyResponse.InstanceTopology.Zones["+ i +"].Nodes["+ j +"].ReadOnlyCopyId"));
				nodesItem.setLogicalZone(_ctx.stringValue("DescribeInstanceTopologyResponse.InstanceTopology.Zones["+ i +"].Nodes["+ j +"].LogicalZone"));
				nodesItem.setReadOnlyReplicaType(_ctx.stringValue("DescribeInstanceTopologyResponse.InstanceTopology.Zones["+ i +"].Nodes["+ j +"].ReadOnlyReplicaType"));

				NodeResource nodeResource = new NodeResource();

				Cpu cpu = new Cpu();
				cpu.setUsedCpu(_ctx.floatValue("DescribeInstanceTopologyResponse.InstanceTopology.Zones["+ i +"].Nodes["+ j +"].NodeResource.Cpu.UsedCpu"));
				cpu.setTotalCpu(_ctx.integerValue("DescribeInstanceTopologyResponse.InstanceTopology.Zones["+ i +"].Nodes["+ j +"].NodeResource.Cpu.TotalCpu"));
				nodeResource.setCpu(cpu);

				Memory memory = new Memory();
				memory.setUsedMemory(_ctx.floatValue("DescribeInstanceTopologyResponse.InstanceTopology.Zones["+ i +"].Nodes["+ j +"].NodeResource.Memory.UsedMemory"));
				memory.setTotalMemory(_ctx.longValue("DescribeInstanceTopologyResponse.InstanceTopology.Zones["+ i +"].Nodes["+ j +"].NodeResource.Memory.TotalMemory"));
				nodeResource.setMemory(memory);

				DiskSize diskSize = new DiskSize();
				diskSize.setTotalDiskSize(_ctx.doubleValue("DescribeInstanceTopologyResponse.InstanceTopology.Zones["+ i +"].Nodes["+ j +"].NodeResource.DiskSize.TotalDiskSize"));
				diskSize.setUsedDiskSize(_ctx.doubleValue("DescribeInstanceTopologyResponse.InstanceTopology.Zones["+ i +"].Nodes["+ j +"].NodeResource.DiskSize.UsedDiskSize"));
				nodeResource.setDiskSize(diskSize);
				nodesItem.setNodeResource(nodeResource);

				nodes.add(nodesItem);
			}
			zonesItem.setNodes(nodes);

			zones.add(zonesItem);
		}
		instanceTopology.setZones(zones);

		List<ReplicasItem> replicas = new ArrayList<ReplicasItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceTopologyResponse.InstanceTopology.Replicas.Length"); i++) {
			ReplicasItem replicasItem = new ReplicasItem();
			replicasItem.setLogicalZone(_ctx.stringValue("DescribeInstanceTopologyResponse.InstanceTopology.Replicas["+ i +"].LogicalZone"));
			replicasItem.setNodeNum(_ctx.integerValue("DescribeInstanceTopologyResponse.InstanceTopology.Replicas["+ i +"].NodeNum"));
			replicasItem.setZoneLogicalName(_ctx.stringValue("DescribeInstanceTopologyResponse.InstanceTopology.Replicas["+ i +"].ZoneLogicalName"));
			replicasItem.setZoneRegionName(_ctx.stringValue("DescribeInstanceTopologyResponse.InstanceTopology.Replicas["+ i +"].ZoneRegionName"));
			replicasItem.setZoneLogicalId(_ctx.integerValue("DescribeInstanceTopologyResponse.InstanceTopology.Replicas["+ i +"].ZoneLogicalId"));
			replicasItem.setReplicaType(_ctx.stringValue("DescribeInstanceTopologyResponse.InstanceTopology.Replicas["+ i +"].ReplicaType"));
			replicasItem.setStatus(_ctx.stringValue("DescribeInstanceTopologyResponse.InstanceTopology.Replicas["+ i +"].Status"));
			replicasItem.setReadOnlyReplicaType(_ctx.stringValue("DescribeInstanceTopologyResponse.InstanceTopology.Replicas["+ i +"].ReadOnlyReplicaType"));

			ReplicaResource replicaResource = new ReplicaResource();

			Memory2 memory2 = new Memory2();
			memory2.setUsedMemory(_ctx.longValue("DescribeInstanceTopologyResponse.InstanceTopology.Replicas["+ i +"].ReplicaResource.Memory.UsedMemory"));
			memory2.setTotalMemory(_ctx.longValue("DescribeInstanceTopologyResponse.InstanceTopology.Replicas["+ i +"].ReplicaResource.Memory.TotalMemory"));
			replicaResource.setMemory2(memory2);

			DiskSize3 diskSize3 = new DiskSize3();
			diskSize3.setUsedDiskSize(_ctx.floatValue("DescribeInstanceTopologyResponse.InstanceTopology.Replicas["+ i +"].ReplicaResource.DiskSize.UsedDiskSize"));
			diskSize3.setTotalDiskSize(_ctx.longValue("DescribeInstanceTopologyResponse.InstanceTopology.Replicas["+ i +"].ReplicaResource.DiskSize.TotalDiskSize"));
			replicaResource.setDiskSize3(diskSize3);

			Cpu4 cpu4 = new Cpu4();
			cpu4.setTotalCpu(_ctx.integerValue("DescribeInstanceTopologyResponse.InstanceTopology.Replicas["+ i +"].ReplicaResource.Cpu.TotalCpu"));
			cpu4.setUsedCpu(_ctx.integerValue("DescribeInstanceTopologyResponse.InstanceTopology.Replicas["+ i +"].ReplicaResource.Cpu.UsedCpu"));
			replicaResource.setCpu4(cpu4);
			replicasItem.setReplicaResource(replicaResource);

			replicas.add(replicasItem);
		}
		instanceTopology.setReplicas(replicas);
		describeInstanceTopologyResponse.setInstanceTopology(instanceTopology);
	 
	 	return describeInstanceTopologyResponse;
	}
}