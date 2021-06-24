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

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeInstancesResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeInstancesResponse.Instance;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeInstancesResponse.Instance.Disk;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeInstancesResponseUnmarshaller {

	public static OpsDescribeInstancesResponse unmarshall(OpsDescribeInstancesResponse opsDescribeInstancesResponse, UnmarshallerContext _ctx) {
		
		opsDescribeInstancesResponse.setRequestId(_ctx.stringValue("OpsDescribeInstancesResponse.RequestId"));
		opsDescribeInstancesResponse.setTotalCount(_ctx.integerValue("OpsDescribeInstancesResponse.TotalCount"));
		opsDescribeInstancesResponse.setPageSize(_ctx.integerValue("OpsDescribeInstancesResponse.PageSize"));
		opsDescribeInstancesResponse.setPageNumber(_ctx.integerValue("OpsDescribeInstancesResponse.PageNumber"));

		List<Instance> instances = new ArrayList<Instance>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeInstancesResponse.Instances.Length"); i++) {
			Instance instance = new Instance();
			instance.setVpcId(_ctx.stringValue("OpsDescribeInstancesResponse.Instances["+ i +"].VpcId"));
			instance.setNatIp(_ctx.stringValue("OpsDescribeInstancesResponse.Instances["+ i +"].NatIp"));
			instance.setInstanceChargeType(_ctx.integerValue("OpsDescribeInstancesResponse.Instances["+ i +"].InstanceChargeType"));
			instance.setVncPort(_ctx.integerValue("OpsDescribeInstancesResponse.Instances["+ i +"].VncPort"));
			instance.setIntranetTx(_ctx.integerValue("OpsDescribeInstancesResponse.Instances["+ i +"].IntranetTx"));
			instance.setSpotStrategy(_ctx.integerValue("OpsDescribeInstancesResponse.Instances["+ i +"].SpotStrategy"));
			instance.setDeviceAvailable(_ctx.booleanValue("OpsDescribeInstancesResponse.Instances["+ i +"].DeviceAvailable"));
			instance.setPublicIpAddress(_ctx.stringValue("OpsDescribeInstancesResponse.Instances["+ i +"].PublicIpAddress"));
			instance.setEipAddress(_ctx.stringValue("OpsDescribeInstancesResponse.Instances["+ i +"].EipAddress"));
			instance.setNcId(_ctx.stringValue("OpsDescribeInstancesResponse.Instances["+ i +"].NcId"));
			instance.setInstanceName(_ctx.stringValue("OpsDescribeInstancesResponse.Instances["+ i +"].InstanceName"));
			instance.setInstanceNetworkType(_ctx.stringValue("OpsDescribeInstancesResponse.Instances["+ i +"].InstanceNetworkType"));
			instance.setInternetRx(_ctx.integerValue("OpsDescribeInstancesResponse.Instances["+ i +"].InternetRx"));
			instance.setPlatform(_ctx.stringValue("OpsDescribeInstancesResponse.Instances["+ i +"].Platform"));
			instance.setEipBandwidth(_ctx.integerValue("OpsDescribeInstancesResponse.Instances["+ i +"].EipBandwidth"));
			instance.setOSName(_ctx.stringValue("OpsDescribeInstancesResponse.Instances["+ i +"].OSName"));
			instance.setImageId(_ctx.stringValue("OpsDescribeInstancesResponse.Instances["+ i +"].ImageId"));
			instance.setClusterId(_ctx.stringValue("OpsDescribeInstancesResponse.Instances["+ i +"].ClusterId"));
			instance.setGPUSpec(_ctx.stringValue("OpsDescribeInstancesResponse.Instances["+ i +"].GPUSpec"));
			instance.setInnerIpAddress(_ctx.stringValue("OpsDescribeInstancesResponse.Instances["+ i +"].InnerIpAddress"));
			instance.setGPUAmount(_ctx.integerValue("OpsDescribeInstancesResponse.Instances["+ i +"].GPUAmount"));
			instance.setInstanceId(_ctx.stringValue("OpsDescribeInstancesResponse.Instances["+ i +"].InstanceId"));
			instance.setEipAllocationId(_ctx.stringValue("OpsDescribeInstancesResponse.Instances["+ i +"].EipAllocationId"));
			instance.setResourceOwnerId(_ctx.stringValue("OpsDescribeInstancesResponse.Instances["+ i +"].ResourceOwnerId"));
			instance.setImageName(_ctx.stringValue("OpsDescribeInstancesResponse.Instances["+ i +"].ImageName"));
			instance.setZoneId(_ctx.stringValue("OpsDescribeInstancesResponse.Instances["+ i +"].ZoneId"));
			instance.setVswId(_ctx.stringValue("OpsDescribeInstancesResponse.Instances["+ i +"].VswId"));
			instance.setBusinessStatus(_ctx.stringValue("OpsDescribeInstancesResponse.Instances["+ i +"].BusinessStatus"));
			instance.setOSType(_ctx.stringValue("OpsDescribeInstancesResponse.Instances["+ i +"].OSType"));
			instance.setStatus(_ctx.stringValue("OpsDescribeInstancesResponse.Instances["+ i +"].Status"));
			instance.setSystemDeviceCategory(_ctx.stringValue("OpsDescribeInstancesResponse.Instances["+ i +"].SystemDeviceCategory"));
			instance.setInternetTx(_ctx.integerValue("OpsDescribeInstancesResponse.Instances["+ i +"].InternetTx"));
			instance.setEipInternetChargeType(_ctx.integerValue("OpsDescribeInstancesResponse.Instances["+ i +"].EipInternetChargeType"));
			instance.setVncHost(_ctx.stringValue("OpsDescribeInstancesResponse.Instances["+ i +"].VncHost"));
			instance.setNcIp(_ctx.stringValue("OpsDescribeInstancesResponse.Instances["+ i +"].NcIp"));
			instance.setBid(_ctx.stringValue("OpsDescribeInstancesResponse.Instances["+ i +"].Bid"));
			instance.setDescription(_ctx.stringValue("OpsDescribeInstancesResponse.Instances["+ i +"].Description"));
			instance.setRackId(_ctx.stringValue("OpsDescribeInstancesResponse.Instances["+ i +"].RackId"));
			instance.setMemory(_ctx.integerValue("OpsDescribeInstancesResponse.Instances["+ i +"].Memory"));
			instance.setCreatedTime(_ctx.stringValue("OpsDescribeInstancesResponse.Instances["+ i +"].CreatedTime"));
			instance.setVlanId(_ctx.stringValue("OpsDescribeInstancesResponse.Instances["+ i +"].VlanId"));
			instance.setHostname(_ctx.stringValue("OpsDescribeInstancesResponse.Instances["+ i +"].Hostname"));
			instance.setRegionId(_ctx.stringValue("OpsDescribeInstancesResponse.Instances["+ i +"].RegionId"));
			instance.setIoOptimized(_ctx.booleanValue("OpsDescribeInstancesResponse.Instances["+ i +"].IoOptimized"));
			instance.setCpu(_ctx.integerValue("OpsDescribeInstancesResponse.Instances["+ i +"].Cpu"));
			instance.setHouyiStatus(_ctx.stringValue("OpsDescribeInstancesResponse.Instances["+ i +"].HouyiStatus"));
			instance.setIntranetRx(_ctx.integerValue("OpsDescribeInstancesResponse.Instances["+ i +"].IntranetRx"));
			instance.setStopBehavior(_ctx.stringValue("OpsDescribeInstancesResponse.Instances["+ i +"].StopBehavior"));
			instance.setCreditSpecification(_ctx.stringValue("OpsDescribeInstancesResponse.Instances["+ i +"].CreditSpecification"));
			instance.setAutoReleaseTime(_ctx.stringValue("OpsDescribeInstancesResponse.Instances["+ i +"].AutoReleaseTime"));
			instance.setMac(_ctx.stringValue("OpsDescribeInstancesResponse.Instances["+ i +"].Mac"));
			instance.setExpiredStopTime(_ctx.stringValue("OpsDescribeInstancesResponse.Instances["+ i +"].ExpiredStopTime"));
			instance.setExpiredTime(_ctx.stringValue("OpsDescribeInstancesResponse.Instances["+ i +"].ExpiredTime"));
			instance.setExpectReleaseTime(_ctx.stringValue("OpsDescribeInstancesResponse.Instances["+ i +"].ExpectReleaseTime"));
			instance.setSerialNumber(_ctx.stringValue("OpsDescribeInstancesResponse.Instances["+ i +"].SerialNumber"));
			instance.setId(_ctx.stringValue("OpsDescribeInstancesResponse.Instances["+ i +"].Id"));
			instance.setSpotPriceLimit(_ctx.stringValue("OpsDescribeInstancesResponse.Instances["+ i +"].SpotPriceLimit"));
			instance.setSpotDiscountLimit(_ctx.integerValue("OpsDescribeInstancesResponse.Instances["+ i +"].SpotDiscountLimit"));
			instance.setSpotInterruptionBehavior(_ctx.stringValue("OpsDescribeInstancesResponse.Instances["+ i +"].SpotInterruptionBehavior"));

			List<String> securityGroupIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsDescribeInstancesResponse.Instances["+ i +"].SecurityGroupIds.Length"); j++) {
				securityGroupIds.add(_ctx.stringValue("OpsDescribeInstancesResponse.Instances["+ i +"].SecurityGroupIds["+ j +"]"));
			}
			instance.setSecurityGroupIds(securityGroupIds);

			List<Disk> disks = new ArrayList<Disk>();
			for (int j = 0; j < _ctx.lengthValue("OpsDescribeInstancesResponse.Instances["+ i +"].Disks.Length"); j++) {
				Disk disk = new Disk();
				disk.setStatus(_ctx.stringValue("OpsDescribeInstancesResponse.Instances["+ i +"].Disks["+ j +"].Status"));
				disk.setActive(_ctx.booleanValue("OpsDescribeInstancesResponse.Instances["+ i +"].Disks["+ j +"].Active"));
				disk.setHouyiDiskId(_ctx.stringValue("OpsDescribeInstancesResponse.Instances["+ i +"].Disks["+ j +"].HouyiDiskId"));
				disk.setEnableAutoSnapshot(_ctx.booleanValue("OpsDescribeInstancesResponse.Instances["+ i +"].Disks["+ j +"].EnableAutoSnapshot"));
				disk.setDiskType(_ctx.stringValue("OpsDescribeInstancesResponse.Instances["+ i +"].Disks["+ j +"].DiskType"));
				disk.setBootable(_ctx.booleanValue("OpsDescribeInstancesResponse.Instances["+ i +"].Disks["+ j +"].Bootable"));
				disk.setDiskId(_ctx.stringValue("OpsDescribeInstancesResponse.Instances["+ i +"].Disks["+ j +"].DiskId"));
				disk.setBid(_ctx.stringValue("OpsDescribeInstancesResponse.Instances["+ i +"].Disks["+ j +"].Bid"));
				disk.setDeleteAutoSnapshot(_ctx.booleanValue("OpsDescribeInstancesResponse.Instances["+ i +"].Disks["+ j +"].DeleteAutoSnapshot"));
				disk.setDiskDesc(_ctx.stringValue("OpsDescribeInstancesResponse.Instances["+ i +"].Disks["+ j +"].DiskDesc"));
				disk.setDiskCategory(_ctx.stringValue("OpsDescribeInstancesResponse.Instances["+ i +"].Disks["+ j +"].DiskCategory"));
				disk.setDevice(_ctx.stringValue("OpsDescribeInstancesResponse.Instances["+ i +"].Disks["+ j +"].Device"));
				disk.setDiskName(_ctx.stringValue("OpsDescribeInstancesResponse.Instances["+ i +"].Disks["+ j +"].DiskName"));
				disk.setPortable(_ctx.booleanValue("OpsDescribeInstancesResponse.Instances["+ i +"].Disks["+ j +"].Portable"));
				disk.setImageId(_ctx.stringValue("OpsDescribeInstancesResponse.Instances["+ i +"].Disks["+ j +"].ImageId"));
				disk.setDeleteWithInstance(_ctx.booleanValue("OpsDescribeInstancesResponse.Instances["+ i +"].Disks["+ j +"].DeleteWithInstance"));
				disk.setClusterId(_ctx.stringValue("OpsDescribeInstancesResponse.Instances["+ i +"].Disks["+ j +"].ClusterId"));
				disk.setDiskSize(_ctx.integerValue("OpsDescribeInstancesResponse.Instances["+ i +"].Disks["+ j +"].DiskSize"));
				disk.setInstanceId(_ctx.stringValue("OpsDescribeInstancesResponse.Instances["+ i +"].Disks["+ j +"].InstanceId"));
				disk.setIopsSize(_ctx.integerValue("OpsDescribeInstancesResponse.Instances["+ i +"].Disks["+ j +"].IopsSize"));
				disk.setRegionId(_ctx.stringValue("OpsDescribeInstancesResponse.Instances["+ i +"].Disks["+ j +"].RegionId"));
				disk.setResourceOwnerId(_ctx.longValue("OpsDescribeInstancesResponse.Instances["+ i +"].Disks["+ j +"].ResourceOwnerId"));
				disk.setSnapshotId(_ctx.stringValue("OpsDescribeInstancesResponse.Instances["+ i +"].Disks["+ j +"].SnapshotId"));
				disk.setZoneId(_ctx.stringValue("OpsDescribeInstancesResponse.Instances["+ i +"].Disks["+ j +"].ZoneId"));
				disk.setBusinessStatus(_ctx.stringValue("OpsDescribeInstancesResponse.Instances["+ i +"].Disks["+ j +"].BusinessStatus"));
				disk.setProductCode(_ctx.stringValue("OpsDescribeInstancesResponse.Instances["+ i +"].Disks["+ j +"].ProductCode"));

				disks.add(disk);
			}
			instance.setDisks(disks);

			instances.add(instance);
		}
		opsDescribeInstancesResponse.setInstances(instances);
	 
	 	return opsDescribeInstancesResponse;
	}
}