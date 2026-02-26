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

import com.aliyuncs.oceanbasepro.model.v20190901.DescribeInstancesResponse;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeInstancesResponse.Data;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeInstancesResponse.Data.DataDiskAutoScaleConfig;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeInstancesResponse.Data.MigrationInfo;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeInstancesResponse.Data.MigrationInfo.CheckResult;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeInstancesResponse.Data.Resource;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeInstancesResponse.Data.Resource.CapacityUnit;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeInstancesResponse.Data.Resource.Cpu;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeInstancesResponse.Data.Resource.DiskSize;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeInstancesResponse.Data.Resource.Memory;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstancesResponseUnmarshaller {

	public static DescribeInstancesResponse unmarshall(DescribeInstancesResponse describeInstancesResponse, UnmarshallerContext _ctx) {
		
		describeInstancesResponse.setRequestId(_ctx.stringValue("DescribeInstancesResponse.RequestId"));
		describeInstancesResponse.setTotalCount(_ctx.integerValue("DescribeInstancesResponse.TotalCount"));

		List<Data> instances = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstancesResponse.Instances.Length"); i++) {
			Data data = new Data();
			data.setVpcId(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].VpcId"));
			data.setCommodityCode(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].CommodityCode"));
			data.setExpireTime(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].ExpireTime"));
			data.setState(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].State"));
			data.setInstanceClass(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].InstanceClass"));
			data.setCreateTime(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].CreateTime"));
			data.setDeployMode(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].DeployMode"));
			data.setCpuArchitecture(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].CpuArchitecture"));
			data.setMaintainTime(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].MaintainTime"));
			data.setDeployType(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].DeployType"));
			data.setPayType(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].PayType"));
			data.setDiskSize(_ctx.longValue("DescribeInstancesResponse.Instances["+ i +"].DiskSize"));
			data.setDiskType(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].DiskType"));
			data.setInstanceId(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].InstanceId"));
			data.setExpireSeconds(_ctx.integerValue("DescribeInstancesResponse.Instances["+ i +"].ExpireSeconds"));
			data.setMem(_ctx.longValue("DescribeInstancesResponse.Instances["+ i +"].Mem"));
			data.setEnableUpgradeNodes(_ctx.booleanValue("DescribeInstancesResponse.Instances["+ i +"].EnableUpgradeNodes"));
			data.setCpu(_ctx.integerValue("DescribeInstancesResponse.Instances["+ i +"].Cpu"));
			data.setVersion(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].Version"));
			data.setInstanceName(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].InstanceName"));
			data.setSeries(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].Series"));
			data.setUsedDiskSize(_ctx.longValue("DescribeInstancesResponse.Instances["+ i +"].UsedDiskSize"));
			data.setResourceGroupId(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].ResourceGroupId"));
			data.setInstanceType(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].InstanceType"));
			data.setInstanceRole(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].InstanceRole"));
			data.setInTempCapacityStatus(_ctx.booleanValue("DescribeInstancesResponse.Instances["+ i +"].InTempCapacityStatus"));
			data.setEnableReadOnlyReplicaManagement(_ctx.booleanValue("DescribeInstancesResponse.Instances["+ i +"].EnableReadOnlyReplicaManagement"));
			data.setSpecType(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].SpecType"));
			data.setObRpmVersion(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].ObRpmVersion"));
			data.setReplicaMode(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].ReplicaMode"));
			data.setMigratable(_ctx.booleanValue("DescribeInstancesResponse.Instances["+ i +"].Migratable"));
			data.setIops(_ctx.integerValue("DescribeInstancesResponse.Instances["+ i +"].Iops"));

			List<String> availableZones = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeInstancesResponse.Instances["+ i +"].AvailableZones.Length"); j++) {
				availableZones.add(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].AvailableZones["+ j +"]"));
			}
			data.setAvailableZones(availableZones);

			Resource resource = new Resource();
			resource.setUnitCount(_ctx.longValue("DescribeInstancesResponse.Instances["+ i +"].Resource.UnitCount"));

			Cpu cpu = new Cpu();
			cpu.setTotalCpu(_ctx.doubleValue("DescribeInstancesResponse.Instances["+ i +"].Resource.Cpu.TotalCpu"));
			cpu.setUsedCpu(_ctx.doubleValue("DescribeInstancesResponse.Instances["+ i +"].Resource.Cpu.UsedCpu"));
			cpu.setUnitCpu(_ctx.doubleValue("DescribeInstancesResponse.Instances["+ i +"].Resource.Cpu.UnitCpu"));
			cpu.setOriginalTotalCpu(_ctx.doubleValue("DescribeInstancesResponse.Instances["+ i +"].Resource.Cpu.OriginalTotalCpu"));
			resource.setCpu(cpu);

			Memory memory = new Memory();
			memory.setTotalMemory(_ctx.doubleValue("DescribeInstancesResponse.Instances["+ i +"].Resource.Memory.TotalMemory"));
			memory.setUsedMemory(_ctx.longValue("DescribeInstancesResponse.Instances["+ i +"].Resource.Memory.UsedMemory"));
			memory.setUnitMemory(_ctx.longValue("DescribeInstancesResponse.Instances["+ i +"].Resource.Memory.UnitMemory"));
			memory.setOriginalTotalMemory(_ctx.doubleValue("DescribeInstancesResponse.Instances["+ i +"].Resource.Memory.OriginalTotalMemory"));
			resource.setMemory(memory);

			DiskSize diskSize = new DiskSize();
			diskSize.setTotalDiskSize(_ctx.doubleValue("DescribeInstancesResponse.Instances["+ i +"].Resource.DiskSize.TotalDiskSize"));
			diskSize.setUsedDiskSize(_ctx.longValue("DescribeInstancesResponse.Instances["+ i +"].Resource.DiskSize.UsedDiskSize"));
			diskSize.setUnitDiskSize(_ctx.doubleValue("DescribeInstancesResponse.Instances["+ i +"].Resource.DiskSize.UnitDiskSize"));
			diskSize.setOriginalTotalDiskSize(_ctx.doubleValue("DescribeInstancesResponse.Instances["+ i +"].Resource.DiskSize.OriginalTotalDiskSize"));
			resource.setDiskSize(diskSize);

			CapacityUnit capacityUnit = new CapacityUnit();
			capacityUnit.setMaxCapacityUnit(_ctx.integerValue("DescribeInstancesResponse.Instances["+ i +"].Resource.CapacityUnit.MaxCapacityUnit"));
			capacityUnit.setMinCapacityUnit(_ctx.integerValue("DescribeInstancesResponse.Instances["+ i +"].Resource.CapacityUnit.MinCapacityUnit"));
			capacityUnit.setUsedCapacityUnit(_ctx.integerValue("DescribeInstancesResponse.Instances["+ i +"].Resource.CapacityUnit.UsedCapacityUnit"));
			resource.setCapacityUnit(capacityUnit);
			data.setResource(resource);

			DataDiskAutoScaleConfig dataDiskAutoScaleConfig = new DataDiskAutoScaleConfig();
			dataDiskAutoScaleConfig.setAutoScale(_ctx.booleanValue("DescribeInstancesResponse.Instances["+ i +"].DataDiskAutoScaleConfig.AutoScale"));
			dataDiskAutoScaleConfig.setUpperbound(_ctx.doubleValue("DescribeInstancesResponse.Instances["+ i +"].DataDiskAutoScaleConfig.Upperbound"));
			dataDiskAutoScaleConfig.setUpperThreshold(_ctx.doubleValue("DescribeInstancesResponse.Instances["+ i +"].DataDiskAutoScaleConfig.UpperThreshold"));
			dataDiskAutoScaleConfig.setUpperMergeThreshold(_ctx.doubleValue("DescribeInstancesResponse.Instances["+ i +"].DataDiskAutoScaleConfig.UpperMergeThreshold"));
			dataDiskAutoScaleConfig.setMaxDiskSize(_ctx.longValue("DescribeInstancesResponse.Instances["+ i +"].DataDiskAutoScaleConfig.MaxDiskSize"));
			dataDiskAutoScaleConfig.setScaleStepInNormal(_ctx.doubleValue("DescribeInstancesResponse.Instances["+ i +"].DataDiskAutoScaleConfig.ScaleStepInNormal"));
			dataDiskAutoScaleConfig.setScaleStepInMerge(_ctx.doubleValue("DescribeInstancesResponse.Instances["+ i +"].DataDiskAutoScaleConfig.ScaleStepInMerge"));
			dataDiskAutoScaleConfig.setUpperScaleStrategy(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].DataDiskAutoScaleConfig.UpperScaleStrategy"));
			data.setDataDiskAutoScaleConfig(dataDiskAutoScaleConfig);

			MigrationInfo migrationInfo = new MigrationInfo();
			migrationInfo.setMigratable(_ctx.booleanValue("DescribeInstancesResponse.Instances["+ i +"].MigrationInfo.Migratable"));

			CheckResult checkResult = new CheckResult();
			checkResult.setLevel(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].MigrationInfo.CheckResult.Level"));
			checkResult.setCode(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].MigrationInfo.CheckResult.Code"));
			checkResult.setCodeName(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].MigrationInfo.CheckResult.CodeName"));
			checkResult.setModule(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].MigrationInfo.CheckResult.Module"));
			checkResult.setModuleName(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].MigrationInfo.CheckResult.ModuleName"));
			checkResult.setSubModule(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].MigrationInfo.CheckResult.SubModule"));
			checkResult.setSubModuleName(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].MigrationInfo.CheckResult.SubModuleName"));
			migrationInfo.setCheckResult(checkResult);
			data.setMigrationInfo(migrationInfo);

			instances.add(data);
		}
		describeInstancesResponse.setInstances(instances);
	 
	 	return describeInstancesResponse;
	}
}