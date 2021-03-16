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
		opsDescribeInstancesLiteResponse.setPageNumber(_ctx.integerValue("OpsDescribeInstancesLiteResponse.PageNumber"));
		opsDescribeInstancesLiteResponse.setPageSize(_ctx.integerValue("OpsDescribeInstancesLiteResponse.PageSize"));

		List<Instance> instances = new ArrayList<Instance>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeInstancesLiteResponse.Instances.Length"); i++) {
			Instance instance = new Instance();
			instance.setInstanceId(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].InstanceId"));
			instance.setSerialNumber(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].SerialNumber"));
			instance.setInstanceName(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].InstanceName"));
			instance.setDescription(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].Description"));
			instance.setRegionId(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].RegionId"));
			instance.setZoneId(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].ZoneId"));
			instance.setClusterId(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].ClusterId"));
			instance.setBid(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].Bid"));
			instance.setResourceOwnerId(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].ResourceOwnerId"));
			instance.setHostname(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].Hostname"));
			instance.setStatus(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].Status"));
			instance.setBusinessStatus(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].BusinessStatus"));
			instance.setHouyiStatus(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].HouyiStatus"));
			instance.setInnerIpAddress(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].InnerIpAddress"));
			instance.setPublicIpAddress(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].PublicIpAddress"));
			instance.setImageId(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].ImageId"));
			instance.setImageName(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].ImageName"));
			instance.setOSName(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].OSName"));
			instance.setOSType(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].OSType"));
			instance.setCpu(_ctx.integerValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].Cpu"));
			instance.setMemory(_ctx.integerValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].Memory"));
			instance.setIntranetRx(_ctx.integerValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].IntranetRx"));
			instance.setIntranetTx(_ctx.integerValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].IntranetTx"));
			instance.setInternetRx(_ctx.integerValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].InternetRx"));
			instance.setInternetTx(_ctx.integerValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].InternetTx"));
			instance.setSystemDeviceCategory(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].SystemDeviceCategory"));
			instance.setCreatedTime(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].CreatedTime"));
			instance.setVpcId(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].VpcId"));
			instance.setVswId(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].VswId"));
			instance.setNatIp(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].NatIp"));
			instance.setEipAddress(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].EipAddress"));
			instance.setEipAllocationId(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].EipAllocationId"));
			instance.setEipBandwidth(_ctx.integerValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].EipBandwidth"));
			instance.setInstanceNetworkType(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].InstanceNetworkType"));
			instance.setIoOptimized(_ctx.booleanValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].IoOptimized"));
			instance.setDeviceAvailable(_ctx.booleanValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].DeviceAvailable"));
			instance.setVlanId(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].VlanId"));
			instance.setNcId(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].NcId"));
			instance.setNcIp(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].NcIp"));
			instance.setRackId(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].RackId"));
			instance.setVncHost(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].VncHost"));
			instance.setVncPort(_ctx.integerValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].VncPort"));
			instance.setGPUAmount(_ctx.integerValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].GPUAmount"));
			instance.setGPUSpec(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].GPUSpec"));
			instance.setPlatform(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].Platform"));
			instance.setSpotStrategy(_ctx.integerValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].SpotStrategy"));

			List<String> securityGroupIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].SecurityGroupIds.Length"); j++) {
				securityGroupIds.add(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].SecurityGroupIds["+ j +"]"));
			}
			instance.setSecurityGroupIds(securityGroupIds);

			List<Disk> disks = new ArrayList<Disk>();
			for (int j = 0; j < _ctx.lengthValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].Disks.Length"); j++) {
				Disk disk = new Disk();
				disk.setResourceOwnerId(_ctx.longValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].Disks["+ j +"].ResourceOwnerId"));
				disk.setBid(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].Disks["+ j +"].Bid"));
				disk.setDiskId(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].Disks["+ j +"].DiskId"));
				disk.setHouyiDiskId(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].Disks["+ j +"].HouyiDiskId"));
				disk.setDiskType(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].Disks["+ j +"].DiskType"));
				disk.setDiskCategory(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].Disks["+ j +"].DiskCategory"));
				disk.setStatus(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].Disks["+ j +"].Status"));
				disk.setRegionId(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].Disks["+ j +"].RegionId"));
				disk.setZoneId(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].Disks["+ j +"].ZoneId"));
				disk.setClusterId(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].Disks["+ j +"].ClusterId"));
				disk.setDiskName(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].Disks["+ j +"].DiskName"));
				disk.setDiskDesc(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].Disks["+ j +"].DiskDesc"));
				disk.setDiskSize(_ctx.integerValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].Disks["+ j +"].DiskSize"));
				disk.setActive(_ctx.booleanValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].Disks["+ j +"].Active"));
				disk.setBootable(_ctx.booleanValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].Disks["+ j +"].Bootable"));
				disk.setPortable(_ctx.booleanValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].Disks["+ j +"].Portable"));
				disk.setImageId(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].Disks["+ j +"].ImageId"));
				disk.setSnapshotId(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].Disks["+ j +"].SnapshotId"));
				disk.setInstanceId(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].Disks["+ j +"].InstanceId"));
				disk.setDevice(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].Disks["+ j +"].Device"));
				disk.setDeleteWithInstance(_ctx.booleanValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].Disks["+ j +"].DeleteWithInstance"));
				disk.setDeleteAutoSnapshot(_ctx.booleanValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].Disks["+ j +"].DeleteAutoSnapshot"));
				disk.setEnableAutoSnapshot(_ctx.booleanValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].Disks["+ j +"].EnableAutoSnapshot"));
				disk.setBusinessStatus(_ctx.stringValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].Disks["+ j +"].BusinessStatus"));
				disk.setIopsSize(_ctx.integerValue("OpsDescribeInstancesLiteResponse.Instances["+ i +"].Disks["+ j +"].IopsSize"));
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