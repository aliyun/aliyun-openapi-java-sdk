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

package com.aliyuncs.ecs.transform.v20140526;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20140526.DescribeInstancesResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeInstancesResponse.Instance;
import com.aliyuncs.ecs.model.v20140526.DescribeInstancesResponse.Instance.CpuOptions;
import com.aliyuncs.ecs.model.v20140526.DescribeInstancesResponse.Instance.DedicatedHostAttribute;
import com.aliyuncs.ecs.model.v20140526.DescribeInstancesResponse.Instance.DedicatedInstanceAttribute;
import com.aliyuncs.ecs.model.v20140526.DescribeInstancesResponse.Instance.EcsCapacityReservationAttr;
import com.aliyuncs.ecs.model.v20140526.DescribeInstancesResponse.Instance.EipAddress;
import com.aliyuncs.ecs.model.v20140526.DescribeInstancesResponse.Instance.LockReason;
import com.aliyuncs.ecs.model.v20140526.DescribeInstancesResponse.Instance.NetworkInterface;
import com.aliyuncs.ecs.model.v20140526.DescribeInstancesResponse.Instance.Tag;
import com.aliyuncs.ecs.model.v20140526.DescribeInstancesResponse.Instance.VpcAttributes;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstancesResponseUnmarshaller {

	public static DescribeInstancesResponse unmarshall(DescribeInstancesResponse describeInstancesResponse, UnmarshallerContext _ctx) {
		
		describeInstancesResponse.setRequestId(_ctx.stringValue("DescribeInstancesResponse.RequestId"));
		describeInstancesResponse.setTotalCount(_ctx.integerValue("DescribeInstancesResponse.TotalCount"));
		describeInstancesResponse.setPageNumber(_ctx.integerValue("DescribeInstancesResponse.PageNumber"));
		describeInstancesResponse.setPageSize(_ctx.integerValue("DescribeInstancesResponse.PageSize"));

		List<Instance> instances = new ArrayList<Instance>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstancesResponse.Instances.Length"); i++) {
			Instance instance = new Instance();
			instance.setInstanceId(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].InstanceId"));
			instance.setInstanceName(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].InstanceName"));
			instance.setDescription(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].Description"));
			instance.setImageId(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].ImageId"));
			instance.setOSName(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].OSName"));
			instance.setOSNameEn(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].OSNameEn"));
			instance.setOSType(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].OSType"));
			instance.setRegionId(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].RegionId"));
			instance.setZoneId(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].ZoneId"));
			instance.setClusterId(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].ClusterId"));
			instance.setInstanceType(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].InstanceType"));
			instance.setCpu(_ctx.integerValue("DescribeInstancesResponse.Instances["+ i +"].Cpu"));
			instance.setMemory(_ctx.integerValue("DescribeInstancesResponse.Instances["+ i +"].Memory"));
			instance.setHostName(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].HostName"));
			instance.setDeploymentSetId(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].DeploymentSetId"));
			instance.setStatus(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].Status"));
			instance.setSerialNumber(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].SerialNumber"));
			instance.setInternetChargeType(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].InternetChargeType"));
			instance.setInternetMaxBandwidthIn(_ctx.integerValue("DescribeInstancesResponse.Instances["+ i +"].InternetMaxBandwidthIn"));
			instance.setInternetMaxBandwidthOut(_ctx.integerValue("DescribeInstancesResponse.Instances["+ i +"].InternetMaxBandwidthOut"));
			instance.setVlanId(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].VlanId"));
			instance.setCreationTime(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].CreationTime"));
			instance.setStartTime(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].StartTime"));
			instance.setInstanceNetworkType(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].InstanceNetworkType"));
			instance.setInstanceChargeType(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].InstanceChargeType"));
			instance.setSaleCycle(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].SaleCycle"));
			instance.setExpiredTime(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].ExpiredTime"));
			instance.setAutoReleaseTime(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].AutoReleaseTime"));
			instance.setIoOptimized(_ctx.booleanValue("DescribeInstancesResponse.Instances["+ i +"].IoOptimized"));
			instance.setDeviceAvailable(_ctx.booleanValue("DescribeInstancesResponse.Instances["+ i +"].DeviceAvailable"));
			instance.setInstanceTypeFamily(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].InstanceTypeFamily"));
			instance.setLocalStorageCapacity(_ctx.longValue("DescribeInstancesResponse.Instances["+ i +"].LocalStorageCapacity"));
			instance.setLocalStorageAmount(_ctx.integerValue("DescribeInstancesResponse.Instances["+ i +"].LocalStorageAmount"));
			instance.setGPUAmount(_ctx.integerValue("DescribeInstancesResponse.Instances["+ i +"].GPUAmount"));
			instance.setGPUSpec(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].GPUSpec"));
			instance.setSpotStrategy(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].SpotStrategy"));
			instance.setSpotPriceLimit(_ctx.floatValue("DescribeInstancesResponse.Instances["+ i +"].SpotPriceLimit"));
			instance.setResourceGroupId(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].ResourceGroupId"));
			instance.setKeyPairName(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].KeyPairName"));
			instance.setRecyclable(_ctx.booleanValue("DescribeInstancesResponse.Instances["+ i +"].Recyclable"));
			instance.setHpcClusterId(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].HpcClusterId"));
			instance.setStoppedMode(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].StoppedMode"));
			instance.setCreditSpecification(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].CreditSpecification"));
			instance.setDeletionProtection(_ctx.booleanValue("DescribeInstancesResponse.Instances["+ i +"].DeletionProtection"));

			List<String> securityGroupIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeInstancesResponse.Instances["+ i +"].SecurityGroupIds.Length"); j++) {
				securityGroupIds.add(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].SecurityGroupIds["+ j +"]"));
			}
			instance.setSecurityGroupIds(securityGroupIds);

			List<String> publicIpAddress = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeInstancesResponse.Instances["+ i +"].PublicIpAddress.Length"); j++) {
				publicIpAddress.add(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].PublicIpAddress["+ j +"]"));
			}
			instance.setPublicIpAddress(publicIpAddress);

			List<String> innerIpAddress = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeInstancesResponse.Instances["+ i +"].InnerIpAddress.Length"); j++) {
				innerIpAddress.add(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].InnerIpAddress["+ j +"]"));
			}
			instance.setInnerIpAddress(innerIpAddress);

			List<String> rdmaIpAddress = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeInstancesResponse.Instances["+ i +"].RdmaIpAddress.Length"); j++) {
				rdmaIpAddress.add(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].RdmaIpAddress["+ j +"]"));
			}
			instance.setRdmaIpAddress(rdmaIpAddress);

			VpcAttributes vpcAttributes = new VpcAttributes();
			vpcAttributes.setVpcId(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].VpcAttributes.VpcId"));
			vpcAttributes.setVSwitchId(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].VpcAttributes.VSwitchId"));
			vpcAttributes.setNatIpAddress(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].VpcAttributes.NatIpAddress"));

			List<String> privateIpAddress = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeInstancesResponse.Instances["+ i +"].VpcAttributes.PrivateIpAddress.Length"); j++) {
				privateIpAddress.add(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].VpcAttributes.PrivateIpAddress["+ j +"]"));
			}
			vpcAttributes.setPrivateIpAddress(privateIpAddress);
			instance.setVpcAttributes(vpcAttributes);

			EipAddress eipAddress = new EipAddress();
			eipAddress.setAllocationId(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].EipAddress.AllocationId"));
			eipAddress.setIpAddress(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].EipAddress.IpAddress"));
			eipAddress.setBandwidth(_ctx.integerValue("DescribeInstancesResponse.Instances["+ i +"].EipAddress.Bandwidth"));
			eipAddress.setInternetChargeType(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].EipAddress.InternetChargeType"));
			eipAddress.setIsSupportUnassociate(_ctx.booleanValue("DescribeInstancesResponse.Instances["+ i +"].EipAddress.IsSupportUnassociate"));
			instance.setEipAddress(eipAddress);

			DedicatedHostAttribute dedicatedHostAttribute = new DedicatedHostAttribute();
			dedicatedHostAttribute.setDedicatedHostId(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].DedicatedHostAttribute.DedicatedHostId"));
			dedicatedHostAttribute.setDedicatedHostName(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].DedicatedHostAttribute.DedicatedHostName"));
			instance.setDedicatedHostAttribute(dedicatedHostAttribute);

			EcsCapacityReservationAttr ecsCapacityReservationAttr = new EcsCapacityReservationAttr();
			ecsCapacityReservationAttr.setCapacityReservationId(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].EcsCapacityReservationAttr.CapacityReservationId"));
			ecsCapacityReservationAttr.setCapacityReservationPreference(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].EcsCapacityReservationAttr.CapacityReservationPreference"));
			instance.setEcsCapacityReservationAttr(ecsCapacityReservationAttr);

			DedicatedInstanceAttribute dedicatedInstanceAttribute = new DedicatedInstanceAttribute();
			dedicatedInstanceAttribute.setTenancy(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].DedicatedInstanceAttribute.Tenancy"));
			dedicatedInstanceAttribute.setAffinity(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].DedicatedInstanceAttribute.Affinity"));
			instance.setDedicatedInstanceAttribute(dedicatedInstanceAttribute);

			CpuOptions cpuOptions = new CpuOptions();
			cpuOptions.setCoreCount(_ctx.integerValue("DescribeInstancesResponse.Instances["+ i +"].CpuOptions.CoreCount"));
			cpuOptions.setThreadsPerCore(_ctx.integerValue("DescribeInstancesResponse.Instances["+ i +"].CpuOptions.ThreadsPerCore"));
			cpuOptions.setNuma(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].CpuOptions.Numa"));
			instance.setCpuOptions(cpuOptions);

			List<NetworkInterface> networkInterfaces = new ArrayList<NetworkInterface>();
			for (int j = 0; j < _ctx.lengthValue("DescribeInstancesResponse.Instances["+ i +"].NetworkInterfaces.Length"); j++) {
				NetworkInterface networkInterface = new NetworkInterface();
				networkInterface.setNetworkInterfaceId(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].NetworkInterfaces["+ j +"].NetworkInterfaceId"));
				networkInterface.setMacAddress(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].NetworkInterfaces["+ j +"].MacAddress"));
				networkInterface.setPrimaryIpAddress(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].NetworkInterfaces["+ j +"].PrimaryIpAddress"));

				networkInterfaces.add(networkInterface);
			}
			instance.setNetworkInterfaces(networkInterfaces);

			List<LockReason> operationLocks = new ArrayList<LockReason>();
			for (int j = 0; j < _ctx.lengthValue("DescribeInstancesResponse.Instances["+ i +"].OperationLocks.Length"); j++) {
				LockReason lockReason = new LockReason();
				lockReason.setLockReason(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].OperationLocks["+ j +"].LockReason"));
				lockReason.setLockMsg(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].OperationLocks["+ j +"].LockMsg"));

				operationLocks.add(lockReason);
			}
			instance.setOperationLocks(operationLocks);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeInstancesResponse.Instances["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setTagKey(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].Tags["+ j +"].TagKey"));
				tag.setTagValue(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].Tags["+ j +"].TagValue"));

				tags.add(tag);
			}
			instance.setTags(tags);

			instances.add(instance);
		}
		describeInstancesResponse.setInstances(instances);
	 
	 	return describeInstancesResponse;
	}
}