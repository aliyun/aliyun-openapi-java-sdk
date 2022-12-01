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
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeInstancesResponse.Data.Resource;
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
			data.setMaintainTime(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].MaintainTime"));
			data.setDeployType(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].DeployType"));
			data.setPayType(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].PayType"));
			data.setDiskSize(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].DiskSize"));
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

			List<String> availableZones = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeInstancesResponse.Instances["+ i +"].AvailableZones.Length"); j++) {
				availableZones.add(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].AvailableZones["+ j +"]"));
			}
			data.setAvailableZones(availableZones);

			List<String> securityIps = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeInstancesResponse.Instances["+ i +"].SecurityIps.Length"); j++) {
				securityIps.add(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].SecurityIps["+ j +"]"));
			}
			data.setSecurityIps(securityIps);

			Resource resource = new Resource();
			resource.setUnitCount(_ctx.longValue("DescribeInstancesResponse.Instances["+ i +"].Resource.UnitCount"));

			Cpu cpu = new Cpu();
			cpu.setTotalCpu(_ctx.longValue("DescribeInstancesResponse.Instances["+ i +"].Resource.Cpu.TotalCpu"));
			cpu.setUsedCpu(_ctx.longValue("DescribeInstancesResponse.Instances["+ i +"].Resource.Cpu.UsedCpu"));
			cpu.setUnitCpu(_ctx.longValue("DescribeInstancesResponse.Instances["+ i +"].Resource.Cpu.UnitCpu"));
			resource.setCpu(cpu);

			Memory memory = new Memory();
			memory.setTotalMemory(_ctx.longValue("DescribeInstancesResponse.Instances["+ i +"].Resource.Memory.TotalMemory"));
			memory.setUsedMemory(_ctx.longValue("DescribeInstancesResponse.Instances["+ i +"].Resource.Memory.UsedMemory"));
			memory.setUnitMemory(_ctx.longValue("DescribeInstancesResponse.Instances["+ i +"].Resource.Memory.UnitMemory"));
			resource.setMemory(memory);

			DiskSize diskSize = new DiskSize();
			diskSize.setTotalDiskSize(_ctx.longValue("DescribeInstancesResponse.Instances["+ i +"].Resource.DiskSize.TotalDiskSize"));
			diskSize.setUsedDiskSize(_ctx.longValue("DescribeInstancesResponse.Instances["+ i +"].Resource.DiskSize.UsedDiskSize"));
			diskSize.setUnitDiskSize(_ctx.longValue("DescribeInstancesResponse.Instances["+ i +"].Resource.DiskSize.UnitDiskSize"));
			resource.setDiskSize(diskSize);
			data.setResource(resource);

			instances.add(data);
		}
		describeInstancesResponse.setInstances(instances);
	 
	 	return describeInstancesResponse;
	}
}