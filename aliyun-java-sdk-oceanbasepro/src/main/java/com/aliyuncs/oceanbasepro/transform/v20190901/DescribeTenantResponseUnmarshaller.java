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
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeTenantResponse.Tenant.TenantConnectionsItem;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeTenantResponse.Tenant.TenantResource;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeTenantResponse.Tenant.TenantResource.Cpu;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeTenantResponse.Tenant.TenantResource.DiskSize;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeTenantResponse.Tenant.TenantResource.Memory;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeTenantResponse.Tenant.TenantZonesItem;
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
		tenant.setEnableBinlogService(_ctx.booleanValue("DescribeTenantResponse.Tenant.EnableBinlogService"));

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
		tenant.setTenantResource(tenantResource);

		List<TenantConnectionsItem> tenantConnections = new ArrayList<TenantConnectionsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTenantResponse.Tenant.TenantConnections.Length"); i++) {
			TenantConnectionsItem tenantConnectionsItem = new TenantConnectionsItem();
			tenantConnectionsItem.setConnectionRole(_ctx.stringValue("DescribeTenantResponse.Tenant.TenantConnections["+ i +"].ConnectionRole"));
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

			List<String> connectionZones = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeTenantResponse.Tenant.TenantConnections["+ i +"].ConnectionZones.Length"); j++) {
				connectionZones.add(_ctx.stringValue("DescribeTenantResponse.Tenant.TenantConnections["+ i +"].ConnectionZones["+ j +"]"));
			}
			tenantConnectionsItem.setConnectionZones(connectionZones);

			tenantConnections.add(tenantConnectionsItem);
		}
		tenant.setTenantConnections(tenantConnections);

		List<TenantZonesItem> tenantZones = new ArrayList<TenantZonesItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTenantResponse.Tenant.TenantZones.Length"); i++) {
			TenantZonesItem tenantZonesItem = new TenantZonesItem();
			tenantZonesItem.setTenantZoneId(_ctx.stringValue("DescribeTenantResponse.Tenant.TenantZones["+ i +"].TenantZoneId"));
			tenantZonesItem.setRegion(_ctx.stringValue("DescribeTenantResponse.Tenant.TenantZones["+ i +"].Region"));
			tenantZonesItem.setTenantZoneRole(_ctx.stringValue("DescribeTenantResponse.Tenant.TenantZones["+ i +"].TenantZoneRole"));

			tenantZones.add(tenantZonesItem);
		}
		tenant.setTenantZones(tenantZones);
		describeTenantResponse.setTenant(tenant);
	 
	 	return describeTenantResponse;
	}
}