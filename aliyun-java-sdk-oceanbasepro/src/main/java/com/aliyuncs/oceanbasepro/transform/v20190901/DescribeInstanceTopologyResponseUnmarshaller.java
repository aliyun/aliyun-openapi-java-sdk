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
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeInstanceTopologyResponse.InstanceTopology.TenantsItem;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeInstanceTopologyResponse.InstanceTopology.TenantsItem.TenantZonesItem;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeInstanceTopologyResponse.InstanceTopology.TenantsItem.TenantZonesItem.UnitsItem;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeInstanceTopologyResponse.InstanceTopology.ZonesItem;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeInstanceTopologyResponse.InstanceTopology.ZonesItem.NodesItem;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeInstanceTopologyResponse.InstanceTopology.ZonesItem.NodesItem.NodeResourceItem;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeInstanceTopologyResponse.InstanceTopology.ZonesItem.NodesItem.NodeResourceItem.Cpu;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeInstanceTopologyResponse.InstanceTopology.ZonesItem.NodesItem.NodeResourceItem.DiskSize;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeInstanceTopologyResponse.InstanceTopology.ZonesItem.NodesItem.NodeResourceItem.Memory;
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

			List<TenantZonesItem> tenantZones = new ArrayList<TenantZonesItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeInstanceTopologyResponse.InstanceTopology.Tenants["+ i +"].TenantZones.Length"); j++) {
				TenantZonesItem tenantZonesItem = new TenantZonesItem();
				tenantZonesItem.setTenantZoneRole(_ctx.stringValue("DescribeInstanceTopologyResponse.InstanceTopology.Tenants["+ i +"].TenantZones["+ j +"].TenantZoneRole"));
				tenantZonesItem.setIsPrimaryTenantZone(_ctx.stringValue("DescribeInstanceTopologyResponse.InstanceTopology.Tenants["+ i +"].TenantZones["+ j +"].IsPrimaryTenantZone"));
				tenantZonesItem.setTenantZoneId(_ctx.stringValue("DescribeInstanceTopologyResponse.InstanceTopology.Tenants["+ i +"].TenantZones["+ j +"].TenantZoneId"));

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

				List<NodeResourceItem> nodeResource = new ArrayList<NodeResourceItem>();
				for (int k = 0; k < _ctx.lengthValue("DescribeInstanceTopologyResponse.InstanceTopology.Zones["+ i +"].Nodes["+ j +"].NodeResource.Length"); k++) {
					NodeResourceItem nodeResourceItem = new NodeResourceItem();

					Cpu cpu = new Cpu();
					cpu.setUsedCpu(_ctx.floatValue("DescribeInstanceTopologyResponse.InstanceTopology.Zones["+ i +"].Nodes["+ j +"].NodeResource["+ k +"].Cpu.UsedCpu"));
					cpu.setTotalCpu(_ctx.integerValue("DescribeInstanceTopologyResponse.InstanceTopology.Zones["+ i +"].Nodes["+ j +"].NodeResource["+ k +"].Cpu.TotalCpu"));
					nodeResourceItem.setCpu(cpu);

					Memory memory = new Memory();
					memory.setUsedMemory(_ctx.floatValue("DescribeInstanceTopologyResponse.InstanceTopology.Zones["+ i +"].Nodes["+ j +"].NodeResource["+ k +"].Memory.UsedMemory"));
					memory.setTotalMemory(_ctx.longValue("DescribeInstanceTopologyResponse.InstanceTopology.Zones["+ i +"].Nodes["+ j +"].NodeResource["+ k +"].Memory.TotalMemory"));
					nodeResourceItem.setMemory(memory);

					DiskSize diskSize = new DiskSize();
					diskSize.setTotalDiskSize(_ctx.doubleValue("DescribeInstanceTopologyResponse.InstanceTopology.Zones["+ i +"].Nodes["+ j +"].NodeResource["+ k +"].DiskSize.TotalDiskSize"));
					diskSize.setUsedDiskSize(_ctx.doubleValue("DescribeInstanceTopologyResponse.InstanceTopology.Zones["+ i +"].Nodes["+ j +"].NodeResource["+ k +"].DiskSize.UsedDiskSize"));
					nodeResourceItem.setDiskSize(diskSize);

					nodeResource.add(nodeResourceItem);
				}
				nodesItem.setNodeResource(nodeResource);

				nodes.add(nodesItem);
			}
			zonesItem.setNodes(nodes);

			zones.add(zonesItem);
		}
		instanceTopology.setZones(zones);
		describeInstanceTopologyResponse.setInstanceTopology(instanceTopology);
	 
	 	return describeInstanceTopologyResponse;
	}
}