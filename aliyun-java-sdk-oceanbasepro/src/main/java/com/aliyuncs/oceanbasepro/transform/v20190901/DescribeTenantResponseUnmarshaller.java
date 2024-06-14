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

import com.aliyuncs.oceanbasepro.model.v20190901.DescribeTenantResponse;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeTenantResponse.Tenant;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeTenantResponse.Tenant.ReadOnlyResource;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeTenantResponse.Tenant.ReadOnlyResource.CapacityUnit4;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeTenantResponse.Tenant.ReadOnlyResource.Cpu1;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeTenantResponse.Tenant.ReadOnlyResource.DiskSize3;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeTenantResponse.Tenant.ReadOnlyResource.LogDiskSize5;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeTenantResponse.Tenant.ReadOnlyResource.Memory2;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeTenantResponse.Tenant.TenantConnectionsItem;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeTenantResponse.Tenant.TenantResource;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeTenantResponse.Tenant.TenantResource.CapacityUnit;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeTenantResponse.Tenant.TenantResource.Cpu;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeTenantResponse.Tenant.TenantResource.DiskSize;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeTenantResponse.Tenant.TenantResource.LogDiskSize;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeTenantResponse.Tenant.TenantResource.Memory;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeTenantResponse.Tenant.TenantZonesItem;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeTenantResponse.Tenant.TenantZonesItem.TenantZoneReplicasItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTenantResponseUnmarshaller {

	public static DescribeTenantResponse unmarshall(DescribeTenantResponse describeTenantResponse, UnmarshallerContext _ctx) {
		
		describeTenantResponse.setRequestId(_ctx.stringValue("DescribeTenantResponse.RequestId"));

		Tenant tenant = new Tenant();
		tenant.setTenantId(_ctx.stringValue("DescribeTenantResponse.Tenant.TenantId"));
		tenant.setTenantName(_ctx.stringValue("DescribeTenantResponse.Tenant.TenantName"));
		tenant.setTenantMode(_ctx.stringValue("DescribeTenantResponse.Tenant.TenantMode"));
		tenant.setVpcId(_ctx.stringValue("DescribeTenantResponse.Tenant.VpcId"));
		tenant.setStatus(_ctx.stringValue("DescribeTenantResponse.Tenant.Status"));
		tenant.setEnableInternetAddressService(_ctx.booleanValue("DescribeTenantResponse.Tenant.EnableInternetAddressService"));
		tenant.setPrimaryZone(_ctx.stringValue("DescribeTenantResponse.Tenant.PrimaryZone"));
		tenant.setDeployType(_ctx.stringValue("DescribeTenantResponse.Tenant.DeployType"));
		tenant.setDeployMode(_ctx.stringValue("DescribeTenantResponse.Tenant.DeployMode"));
		tenant.setDescription(_ctx.stringValue("DescribeTenantResponse.Tenant.Description"));
		tenant.setCreateTime(_ctx.stringValue("DescribeTenantResponse.Tenant.CreateTime"));
		tenant.setClogServiceStatus(_ctx.stringValue("DescribeTenantResponse.Tenant.ClogServiceStatus"));
		tenant.setEnableClogService(_ctx.booleanValue("DescribeTenantResponse.Tenant.EnableClogService"));
		tenant.setCharset(_ctx.stringValue("DescribeTenantResponse.Tenant.Charset"));
		tenant.setCollation(_ctx.stringValue("DescribeTenantResponse.Tenant.Collation"));
		tenant.setPrimaryZoneDeployType(_ctx.stringValue("DescribeTenantResponse.Tenant.PrimaryZoneDeployType"));
		tenant.setMasterIntranetAddressZone(_ctx.stringValue("DescribeTenantResponse.Tenant.MasterIntranetAddressZone"));
		tenant.setPayType(_ctx.stringValue("DescribeTenantResponse.Tenant.PayType"));
		tenant.setInstanceType(_ctx.stringValue("DescribeTenantResponse.Tenant.InstanceType"));
		tenant.setSeries(_ctx.stringValue("DescribeTenantResponse.Tenant.Series"));
		tenant.setDiskType(_ctx.stringValue("DescribeTenantResponse.Tenant.DiskType"));
		tenant.setEnableReadWriteSplit(_ctx.booleanValue("DescribeTenantResponse.Tenant.EnableReadWriteSplit"));
		tenant.setEnableParallelQuery(_ctx.booleanValue("DescribeTenantResponse.Tenant.EnableParallelQuery"));
		tenant.setMaxParallelQueryDegree(_ctx.longValue("DescribeTenantResponse.Tenant.MaxParallelQueryDegree"));
		tenant.setEnableBinlogService(_ctx.booleanValue("DescribeTenantResponse.Tenant.EnableBinlogService"));
		tenant.setTimeZone(_ctx.stringValue("DescribeTenantResponse.Tenant.TimeZone"));
		tenant.setDataMergeTime(_ctx.stringValue("DescribeTenantResponse.Tenant.DataMergeTime"));
		tenant.setEnableReadOnlyReplica(_ctx.booleanValue("DescribeTenantResponse.Tenant.EnableReadOnlyReplica"));
		tenant.setRecycleBinStatus(_ctx.stringValue("DescribeTenantResponse.Tenant.RecycleBinStatus"));
		tenant.setLowerCaseTableNames(_ctx.stringValue("DescribeTenantResponse.Tenant.LowerCaseTableNames"));
		tenant.setVersion(_ctx.stringValue("DescribeTenantResponse.Tenant.Version"));

		List<String> availableZones = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTenantResponse.Tenant.AvailableZones.Length"); i++) {
			availableZones.add(_ctx.stringValue("DescribeTenantResponse.Tenant.AvailableZones["+ i +"]"));
		}
		tenant.setAvailableZones(availableZones);

		TenantResource tenantResource = new TenantResource();
		tenantResource.setUnitNum(_ctx.integerValue("DescribeTenantResponse.Tenant.TenantResource.UnitNum"));

		Cpu cpu = new Cpu();
		cpu.setUsedCpu(_ctx.floatValue("DescribeTenantResponse.Tenant.TenantResource.Cpu.UsedCpu"));
		cpu.setTotalCpu(_ctx.floatValue("DescribeTenantResponse.Tenant.TenantResource.Cpu.TotalCpu"));
		cpu.setUnitCpu(_ctx.floatValue("DescribeTenantResponse.Tenant.TenantResource.Cpu.UnitCpu"));
		tenantResource.setCpu(cpu);

		Memory memory = new Memory();
		memory.setUsedMemory(_ctx.floatValue("DescribeTenantResponse.Tenant.TenantResource.Memory.UsedMemory"));
		memory.setTotalMemory(_ctx.floatValue("DescribeTenantResponse.Tenant.TenantResource.Memory.TotalMemory"));
		memory.setUnitMemory(_ctx.floatValue("DescribeTenantResponse.Tenant.TenantResource.Memory.UnitMemory"));
		tenantResource.setMemory(memory);

		DiskSize diskSize = new DiskSize();
		diskSize.setUsedDiskSize(_ctx.floatValue("DescribeTenantResponse.Tenant.TenantResource.DiskSize.UsedDiskSize"));
		tenantResource.setDiskSize(diskSize);

		CapacityUnit capacityUnit = new CapacityUnit();
		capacityUnit.setMaxCapacityUnit(_ctx.integerValue("DescribeTenantResponse.Tenant.TenantResource.CapacityUnit.MaxCapacityUnit"));
		capacityUnit.setMinCapacityUnit(_ctx.integerValue("DescribeTenantResponse.Tenant.TenantResource.CapacityUnit.MinCapacityUnit"));
		capacityUnit.setUsedCapacit(_ctx.integerValue("DescribeTenantResponse.Tenant.TenantResource.CapacityUnit.UsedCapacit"));
		tenantResource.setCapacityUnit(capacityUnit);

		LogDiskSize logDiskSize = new LogDiskSize();
		logDiskSize.setTotalLogDisk(_ctx.integerValue("DescribeTenantResponse.Tenant.TenantResource.LogDiskSize.TotalLogDisk"));
		logDiskSize.setUnitLogDisk(_ctx.integerValue("DescribeTenantResponse.Tenant.TenantResource.LogDiskSize.UnitLogDisk"));
		tenantResource.setLogDiskSize(logDiskSize);
		tenant.setTenantResource(tenantResource);

		ReadOnlyResource readOnlyResource = new ReadOnlyResource();
		readOnlyResource.setUnitNum(_ctx.integerValue("DescribeTenantResponse.Tenant.ReadOnlyResource.UnitNum"));

		Cpu1 cpu1 = new Cpu1();
		cpu1.setUsedCpu(_ctx.floatValue("DescribeTenantResponse.Tenant.ReadOnlyResource.Cpu.UsedCpu"));
		cpu1.setTotalCpu(_ctx.floatValue("DescribeTenantResponse.Tenant.ReadOnlyResource.Cpu.TotalCpu"));
		cpu1.setUnitCpu(_ctx.floatValue("DescribeTenantResponse.Tenant.ReadOnlyResource.Cpu.UnitCpu"));
		readOnlyResource.setCpu1(cpu1);

		Memory2 memory2 = new Memory2();
		memory2.setUsedMemory(_ctx.floatValue("DescribeTenantResponse.Tenant.ReadOnlyResource.Memory.UsedMemory"));
		memory2.setTotalMemory(_ctx.floatValue("DescribeTenantResponse.Tenant.ReadOnlyResource.Memory.TotalMemory"));
		memory2.setUnitMemory(_ctx.floatValue("DescribeTenantResponse.Tenant.ReadOnlyResource.Memory.UnitMemory"));
		readOnlyResource.setMemory2(memory2);

		DiskSize3 diskSize3 = new DiskSize3();
		diskSize3.setUsedDiskSize(_ctx.floatValue("DescribeTenantResponse.Tenant.ReadOnlyResource.DiskSize.UsedDiskSize"));
		readOnlyResource.setDiskSize3(diskSize3);

		CapacityUnit4 capacityUnit4 = new CapacityUnit4();
		capacityUnit4.setMaxCapacityUnit(_ctx.integerValue("DescribeTenantResponse.Tenant.ReadOnlyResource.CapacityUnit.MaxCapacityUnit"));
		capacityUnit4.setMinCapacityUnit(_ctx.integerValue("DescribeTenantResponse.Tenant.ReadOnlyResource.CapacityUnit.MinCapacityUnit"));
		capacityUnit4.setUsedCapacit(_ctx.integerValue("DescribeTenantResponse.Tenant.ReadOnlyResource.CapacityUnit.UsedCapacit"));
		readOnlyResource.setCapacityUnit4(capacityUnit4);

		LogDiskSize5 logDiskSize5 = new LogDiskSize5();
		logDiskSize5.setTotalLogDisk(_ctx.integerValue("DescribeTenantResponse.Tenant.ReadOnlyResource.LogDiskSize.TotalLogDisk"));
		logDiskSize5.setUnitLogDisk(_ctx.integerValue("DescribeTenantResponse.Tenant.ReadOnlyResource.LogDiskSize.UnitLogDisk"));
		readOnlyResource.setLogDiskSize5(logDiskSize5);
		tenant.setReadOnlyResource(readOnlyResource);

		List<TenantConnectionsItem> tenantConnections = new ArrayList<TenantConnectionsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTenantResponse.Tenant.TenantConnections.Length"); i++) {
			TenantConnectionsItem tenantConnectionsItem = new TenantConnectionsItem();
			tenantConnectionsItem.setIntranetAddress(_ctx.stringValue("DescribeTenantResponse.Tenant.TenantConnections["+ i +"].IntranetAddress"));
			tenantConnectionsItem.setIntranetPort(_ctx.integerValue("DescribeTenantResponse.Tenant.TenantConnections["+ i +"].IntranetPort"));
			tenantConnectionsItem.setInternetAddress(_ctx.stringValue("DescribeTenantResponse.Tenant.TenantConnections["+ i +"].InternetAddress"));
			tenantConnectionsItem.setInternetPort(_ctx.integerValue("DescribeTenantResponse.Tenant.TenantConnections["+ i +"].InternetPort"));
			tenantConnectionsItem.setVpcId(_ctx.stringValue("DescribeTenantResponse.Tenant.TenantConnections["+ i +"].VpcId"));
			tenantConnectionsItem.setVSwitchId(_ctx.stringValue("DescribeTenantResponse.Tenant.TenantConnections["+ i +"].VSwitchId"));
			tenantConnectionsItem.setIntranetAddressMasterZoneId(_ctx.stringValue("DescribeTenantResponse.Tenant.TenantConnections["+ i +"].IntranetAddressMasterZoneId"));
			tenantConnectionsItem.setIntranetAddressSlaveZoneId(_ctx.stringValue("DescribeTenantResponse.Tenant.TenantConnections["+ i +"].IntranetAddressSlaveZoneId"));
			tenantConnectionsItem.setIntranetAddressStatus(_ctx.stringValue("DescribeTenantResponse.Tenant.TenantConnections["+ i +"].IntranetAddressStatus"));
			tenantConnectionsItem.setInternetAddressStatus(_ctx.stringValue("DescribeTenantResponse.Tenant.TenantConnections["+ i +"].InternetAddressStatus"));
			tenantConnectionsItem.setTransactionSplit(_ctx.booleanValue("DescribeTenantResponse.Tenant.TenantConnections["+ i +"].TransactionSplit"));
			tenantConnectionsItem.setAddressType(_ctx.stringValue("DescribeTenantResponse.Tenant.TenantConnections["+ i +"].AddressType"));
			tenantConnectionsItem.setEnableTransactionSplit(_ctx.booleanValue("DescribeTenantResponse.Tenant.TenantConnections["+ i +"].EnableTransactionSplit"));
			tenantConnectionsItem.setParallelQueryDegree(_ctx.longValue("DescribeTenantResponse.Tenant.TenantConnections["+ i +"].ParallelQueryDegree"));
			tenantConnectionsItem.setTenantEndpointId(_ctx.stringValue("DescribeTenantResponse.Tenant.TenantConnections["+ i +"].TenantEndpointId"));
			tenantConnectionsItem.setMaxConnectionNum(_ctx.longValue("DescribeTenantResponse.Tenant.TenantConnections["+ i +"].MaxConnectionNum"));
			tenantConnectionsItem.setConnectionReplicaType(_ctx.stringValue("DescribeTenantResponse.Tenant.TenantConnections["+ i +"].ConnectionReplicaType"));
			tenantConnectionsItem.setProxyClusterId(_ctx.stringValue("DescribeTenantResponse.Tenant.TenantConnections["+ i +"].ProxyClusterId"));
			tenantConnectionsItem.setMaxConnectionLimit(_ctx.longValue("DescribeTenantResponse.Tenant.TenantConnections["+ i +"].MaxConnectionLimit"));
			tenantConnectionsItem.setInternetMaxConnectionLimit(_ctx.longValue("DescribeTenantResponse.Tenant.TenantConnections["+ i +"].InternetMaxConnectionLimit"));
			tenantConnectionsItem.setIntranetRpcPort(_ctx.integerValue("DescribeTenantResponse.Tenant.TenantConnections["+ i +"].IntranetRpcPort"));
			tenantConnectionsItem.setInternetMaxConnectionNum(_ctx.longValue("DescribeTenantResponse.Tenant.TenantConnections["+ i +"].InternetMaxConnectionNum"));
			tenantConnectionsItem.setInternetRpcPort(_ctx.integerValue("DescribeTenantResponse.Tenant.TenantConnections["+ i +"].InternetRpcPort"));

			List<String> connectionZones = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeTenantResponse.Tenant.TenantConnections["+ i +"].ConnectionZones.Length"); j++) {
				connectionZones.add(_ctx.stringValue("DescribeTenantResponse.Tenant.TenantConnections["+ i +"].ConnectionZones["+ j +"]"));
			}
			tenantConnectionsItem.setConnectionZones(connectionZones);

			List<String> connectionLogicalZones = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeTenantResponse.Tenant.TenantConnections["+ i +"].ConnectionLogicalZones.Length"); j++) {
				connectionLogicalZones.add(_ctx.stringValue("DescribeTenantResponse.Tenant.TenantConnections["+ i +"].ConnectionLogicalZones["+ j +"]"));
			}
			tenantConnectionsItem.setConnectionLogicalZones(connectionLogicalZones);

			tenantConnections.add(tenantConnectionsItem);
		}
		tenant.setTenantConnections(tenantConnections);

		List<TenantZonesItem> tenantZones = new ArrayList<TenantZonesItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTenantResponse.Tenant.TenantZones.Length"); i++) {
			TenantZonesItem tenantZonesItem = new TenantZonesItem();
			tenantZonesItem.setTenantZoneId(_ctx.stringValue("DescribeTenantResponse.Tenant.TenantZones["+ i +"].TenantZoneId"));
			tenantZonesItem.setRegion(_ctx.stringValue("DescribeTenantResponse.Tenant.TenantZones["+ i +"].Region"));
			tenantZonesItem.setTenantZoneRole(_ctx.stringValue("DescribeTenantResponse.Tenant.TenantZones["+ i +"].TenantZoneRole"));

			List<TenantZoneReplicasItem> tenantZoneReplicas = new ArrayList<TenantZoneReplicasItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeTenantResponse.Tenant.TenantZones["+ i +"].TenantZoneReplicas.Length"); j++) {
				TenantZoneReplicasItem tenantZoneReplicasItem = new TenantZoneReplicasItem();
				tenantZoneReplicasItem.setZoneReplicaType(_ctx.stringValue("DescribeTenantResponse.Tenant.TenantZones["+ i +"].TenantZoneReplicas["+ j +"].ZoneReplicaType"));
				tenantZoneReplicasItem.setZoneNodes(_ctx.stringValue("DescribeTenantResponse.Tenant.TenantZones["+ i +"].TenantZoneReplicas["+ j +"].ZoneNodes"));
				tenantZoneReplicasItem.setLogicZoneName(_ctx.stringValue("DescribeTenantResponse.Tenant.TenantZones["+ i +"].TenantZoneReplicas["+ j +"].LogicZoneName"));
				tenantZoneReplicasItem.setZoneCopyId(_ctx.integerValue("DescribeTenantResponse.Tenant.TenantZones["+ i +"].TenantZoneReplicas["+ j +"].ZoneCopyId"));
				tenantZoneReplicasItem.setFullCopyId(_ctx.integerValue("DescribeTenantResponse.Tenant.TenantZones["+ i +"].TenantZoneReplicas["+ j +"].FullCopyId"));
				tenantZoneReplicasItem.setReadOnlyCopyId(_ctx.stringValue("DescribeTenantResponse.Tenant.TenantZones["+ i +"].TenantZoneReplicas["+ j +"].ReadOnlyCopyId"));

				tenantZoneReplicas.add(tenantZoneReplicasItem);
			}
			tenantZonesItem.setTenantZoneReplicas(tenantZoneReplicas);

			tenantZones.add(tenantZonesItem);
		}
		tenant.setTenantZones(tenantZones);
		describeTenantResponse.setTenant(tenant);
	 
	 	return describeTenantResponse;
	}
}