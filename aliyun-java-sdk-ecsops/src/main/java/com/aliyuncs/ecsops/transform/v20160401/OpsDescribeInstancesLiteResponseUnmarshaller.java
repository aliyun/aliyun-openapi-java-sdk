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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeInstancesLiteResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeInstancesLiteResponse.Instance;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeInstancesLiteResponse.Instance.Disk;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeInstancesLiteResponseUnmarshaller {

	public static OpsDescribeInstancesLiteResponse unmarshall(OpsDescribeInstancesLiteResponse opsDescribeInstancesLiteResponse, UnmarshallerContext _ctx) {
		
		opsDescribeInstancesLiteResponse.setRequestId(_ctx.stringValue("OpsDescribeInstancesLiteResponse.RequestId"));
		opsDescribeInstancesLiteResponse.setTotalCount(_ctx.integerValue("OpsDescribeInstancesLiteResponse.TotalCount"));
		opsDescribeInstancesLiteResponse.setPageSize(_ctx.integerValue("OpsDescribeInstancesLiteResponse.PageSize"));
		opsDescribeInstancesLiteResponse.setPageNumber(_ctx.integerValue("OpsDescribeInstancesLiteResponse.PageNumber"));

		List<Instance> instances = new ArrayList<Instance>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeInstancesLiteResponse.Instances.Length"); i++) {
			Instance instance = new Instance();
			instance.setVpcId(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].VpcId"));
			instance.setSerialNumber(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].SerialNumber"));
			instance.setNatIp(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].NatIp"));
			instance.setVncPort(_ctx.integerValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].VncPort"));
			instance.setIntranetTx(_ctx.integerValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].IntranetTx"));
			instance.setSpotStrategy(_ctx.integerValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].SpotStrategy"));
			instance.setDeviceAvailable(_ctx.booleanValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].DeviceAvailable"));
			instance.setPublicIpAddress(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].PublicIpAddress"));
			instance.setEipAddress(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].EipAddress"));
			instance.setNcId(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].NcId"));
			instance.setInstanceName(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].InstanceName"));
			instance.setInstanceNetworkType(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].InstanceNetworkType"));
			instance.setInternetRx(_ctx.integerValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].InternetRx"));
			instance.setPlatform(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].Platform"));
			instance.setEipBandwidth(_ctx.integerValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].EipBandwidth"));
			instance.setOSName(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].OSName"));
			instance.setImageId(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].ImageId"));
			instance.setClusterId(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].ClusterId"));
			instance.setGPUSpec(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].GPUSpec"));
			instance.setInnerIpAddress(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].InnerIpAddress"));
			instance.setGPUAmount(_ctx.integerValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].GPUAmount"));
			instance.setInstanceId(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].InstanceId"));
			instance.setEipAllocationId(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].EipAllocationId"));
			instance.setResourceOwnerId(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].ResourceOwnerId"));
			instance.setImageName(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].ImageName"));
			instance.setZoneId(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].ZoneId"));
			instance.setVswId(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].VswId"));
			instance.setBusinessStatus(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].BusinessStatus"));
			instance.setOSType(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].OSType"));
			instance.setStatus(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].Status"));
			instance.setSystemDeviceCategory(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].SystemDeviceCategory"));
			instance.setInternetTx(_ctx.integerValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].InternetTx"));
			instance.setVncHost(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].VncHost"));
			instance.setNcIp(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].NcIp"));
			instance.setBid(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].Bid"));
			instance.setDescription(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].Description"));
			instance.setRackId(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].RackId"));
			instance.setMemory(_ctx.integerValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].Memory"));
			instance.setCreatedTime(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].CreatedTime"));
			instance.setVlanId(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].VlanId"));
			instance.setHostname(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].Hostname"));
			instance.setRegionId(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].RegionId"));
			instance.setIoOptimized(_ctx.booleanValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].IoOptimized"));
			instance.setCpu(_ctx.integerValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].Cpu"));
			instance.setHouyiStatus(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].HouyiStatus"));
			instance.setIntranetRx(_ctx.integerValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].IntranetRx"));

			List<String> securityGroupIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].SecurityGroupIds.Length"); j++) {
				securityGroupIds.add(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].SecurityGroupIds["+ j +"]"));
			}
			instance.setSecurityGroupIds(securityGroupIds);

			List<Disk> disks = new ArrayList<Disk>();
			for (int j = 0; j < _ctx.lengthValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].Disks.Length"); j++) {
				Disk disk = new Disk();
				disk.setStatus(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].Disks["+ j +"].Status"));
				disk.setActive(_ctx.booleanValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].Disks["+ j +"].Active"));
				disk.setHouyiDiskId(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].Disks["+ j +"].HouyiDiskId"));
				disk.setEnableAutoSnapshot(_ctx.booleanValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].Disks["+ j +"].EnableAutoSnapshot"));
				disk.setDiskType(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].Disks["+ j +"].DiskType"));
				disk.setBootable(_ctx.booleanValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].Disks["+ j +"].Bootable"));
				disk.setDiskId(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].Disks["+ j +"].DiskId"));
				disk.setBid(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].Disks["+ j +"].Bid"));
				disk.setDeleteAutoSnapshot(_ctx.booleanValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].Disks["+ j +"].DeleteAutoSnapshot"));
				disk.setDiskDesc(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].Disks["+ j +"].DiskDesc"));
				disk.setDiskCategory(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].Disks["+ j +"].DiskCategory"));
				disk.setDevice(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].Disks["+ j +"].Device"));
				disk.setDiskName(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].Disks["+ j +"].DiskName"));
				disk.setPortable(_ctx.booleanValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].Disks["+ j +"].Portable"));
				disk.setImageId(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].Disks["+ j +"].ImageId"));
				disk.setDeleteWithInstance(_ctx.booleanValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].Disks["+ j +"].DeleteWithInstance"));
				disk.setClusterId(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].Disks["+ j +"].ClusterId"));
				disk.setDiskSize(_ctx.integerValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].Disks["+ j +"].DiskSize"));
				disk.setInstanceId(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].Disks["+ j +"].InstanceId"));
				disk.setIopsSize(_ctx.integerValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].Disks["+ j +"].IopsSize"));
				disk.setRegionId(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].Disks["+ j +"].RegionId"));
				disk.setResourceOwnerId(_ctx.longValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].Disks["+ j +"].ResourceOwnerId"));
				disk.setSnapshotId(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].Disks["+ j +"].SnapshotId"));
				disk.setZoneId(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].Disks["+ j +"].ZoneId"));
				disk.setBusinessStatus(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].Disks["+ j +"].BusinessStatus"));
				disk.setProductCode(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].Disks["+ j +"].ProductCode"));

				disks.add(disk);
			}
			instance.setDisks(disks);

			instances.add(instance);
		}
		opsDescribeInstancesLiteResponse.setInstances(instances);
	 
	 	return opsDescribeInstancesLiteResponse;
	}
}