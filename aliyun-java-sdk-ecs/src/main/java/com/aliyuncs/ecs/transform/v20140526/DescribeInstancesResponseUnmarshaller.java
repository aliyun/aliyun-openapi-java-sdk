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
import com.aliyuncs.ecs.model.v20140526.DescribeInstancesResponse.Instance.HibernationOptions;
import com.aliyuncs.ecs.model.v20140526.DescribeInstancesResponse.Instance.LockReason;
import com.aliyuncs.ecs.model.v20140526.DescribeInstancesResponse.Instance.MetadataOptions;
import com.aliyuncs.ecs.model.v20140526.DescribeInstancesResponse.Instance.NetworkInterface;
import com.aliyuncs.ecs.model.v20140526.DescribeInstancesResponse.Instance.NetworkInterface.Ipv6Set;
import com.aliyuncs.ecs.model.v20140526.DescribeInstancesResponse.Instance.NetworkInterface.PrivateIpSet;
import com.aliyuncs.ecs.model.v20140526.DescribeInstancesResponse.Instance.Tag;
import com.aliyuncs.ecs.model.v20140526.DescribeInstancesResponse.Instance.VpcAttributes;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstancesResponseUnmarshaller {

	public static DescribeInstancesResponse unmarshall(DescribeInstancesResponse describeInstancesResponse, UnmarshallerContext _ctx) {
		
		describeInstancesResponse.setRequestId(_ctx.stringValue("DescribeInstancesResponse.RequestId"));
		describeInstancesResponse.setNextToken(_ctx.stringValue("DescribeInstancesResponse.NextToken"));
		describeInstancesResponse.setPageSize(_ctx.integerValue("DescribeInstancesResponse.PageSize"));
		describeInstancesResponse.setPageNumber(_ctx.integerValue("DescribeInstancesResponse.PageNumber"));
		describeInstancesResponse.setTotalCount(_ctx.integerValue("DescribeInstancesResponse.TotalCount"));

		List<Instance> instances = new ArrayList<Instance>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstancesResponse.Instances.Length"); i++) {
			Instance instance = new Instance();
			instance.setCreationTime(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].CreationTime"));
			instance.setSerialNumber(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].SerialNumber"));
			instance.setStatus(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].Status"));
			instance.setDeploymentSetId(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].DeploymentSetId"));
			instance.setKeyPairName(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].KeyPairName"));
			instance.setSaleCycle(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].SaleCycle"));
			instance.setSpotStrategy(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].SpotStrategy"));
			instance.setDeviceAvailable(_ctx.booleanValue("DescribeInstancesResponse.Instances["+ i +"].DeviceAvailable"));
			instance.setLocalStorageCapacity(_ctx.longValue("DescribeInstancesResponse.Instances["+ i +"].LocalStorageCapacity"));
			instance.setDescription(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].Description"));
			instance.setSpotDuration(_ctx.integerValue("DescribeInstancesResponse.Instances["+ i +"].SpotDuration"));
			instance.setInstanceNetworkType(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].InstanceNetworkType"));
			instance.setInstanceName(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].InstanceName"));
			instance.setOSNameEn(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].OSNameEn"));
			instance.setHpcClusterId(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].HpcClusterId"));
			instance.setSpotPriceLimit(_ctx.floatValue("DescribeInstancesResponse.Instances["+ i +"].SpotPriceLimit"));
			instance.setMemory(_ctx.integerValue("DescribeInstancesResponse.Instances["+ i +"].Memory"));
			instance.setOSName(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].OSName"));
			instance.setDeploymentSetGroupNo(_ctx.integerValue("DescribeInstancesResponse.Instances["+ i +"].DeploymentSetGroupNo"));
			instance.setImageId(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].ImageId"));
			instance.setVlanId(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].VlanId"));
			instance.setClusterId(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].ClusterId"));
			instance.setGPUSpec(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].GPUSpec"));
			instance.setAutoReleaseTime(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].AutoReleaseTime"));
			instance.setDeletionProtection(_ctx.booleanValue("DescribeInstancesResponse.Instances["+ i +"].DeletionProtection"));
			instance.setStoppedMode(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].StoppedMode"));
			instance.setGPUAmount(_ctx.integerValue("DescribeInstancesResponse.Instances["+ i +"].GPUAmount"));
			instance.setHostName(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].HostName"));
			instance.setInstanceId(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].InstanceId"));
			instance.setInternetMaxBandwidthOut(_ctx.integerValue("DescribeInstancesResponse.Instances["+ i +"].InternetMaxBandwidthOut"));
			instance.setInternetMaxBandwidthIn(_ctx.integerValue("DescribeInstancesResponse.Instances["+ i +"].InternetMaxBandwidthIn"));
			instance.setInstanceType(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].InstanceType"));
			instance.setInstanceChargeType(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].InstanceChargeType"));
			instance.setRegionId(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].RegionId"));
			instance.setIoOptimized(_ctx.booleanValue("DescribeInstancesResponse.Instances["+ i +"].IoOptimized"));
			instance.setStartTime(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].StartTime"));
			instance.setCpu(_ctx.integerValue("DescribeInstancesResponse.Instances["+ i +"].Cpu"));
			instance.setLocalStorageAmount(_ctx.integerValue("DescribeInstancesResponse.Instances["+ i +"].LocalStorageAmount"));
			instance.setExpiredTime(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].ExpiredTime"));
			instance.setResourceGroupId(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].ResourceGroupId"));
			instance.setInternetChargeType(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].InternetChargeType"));
			instance.setZoneId(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].ZoneId"));
			instance.setRecyclable(_ctx.booleanValue("DescribeInstancesResponse.Instances["+ i +"].Recyclable"));
			instance.setISP(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].ISP"));
			instance.setCreditSpecification(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].CreditSpecification"));
			instance.setInstanceTypeFamily(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].InstanceTypeFamily"));
			instance.setOSType(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].OSType"));

			List<String> rdmaIpAddress = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeInstancesResponse.Instances["+ i +"].RdmaIpAddress.Length"); j++) {
				rdmaIpAddress.add(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].RdmaIpAddress["+ j +"]"));
			}
			instance.setRdmaIpAddress(rdmaIpAddress);

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

			VpcAttributes vpcAttributes = new VpcAttributes();
			vpcAttributes.setVpcId(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].VpcAttributes.VpcId"));
			vpcAttributes.setNatIpAddress(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].VpcAttributes.NatIpAddress"));
			vpcAttributes.setVSwitchId(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].VpcAttributes.VSwitchId"));

			List<String> privateIpAddress = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeInstancesResponse.Instances["+ i +"].VpcAttributes.PrivateIpAddress.Length"); j++) {
				privateIpAddress.add(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].VpcAttributes.PrivateIpAddress["+ j +"]"));
			}
			vpcAttributes.setPrivateIpAddress(privateIpAddress);
			instance.setVpcAttributes(vpcAttributes);

			EipAddress eipAddress = new EipAddress();
			eipAddress.setIsSupportUnassociate(_ctx.booleanValue("DescribeInstancesResponse.Instances["+ i +"].EipAddress.IsSupportUnassociate"));
			eipAddress.setInternetChargeType(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].EipAddress.InternetChargeType"));
			eipAddress.setIpAddress(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].EipAddress.IpAddress"));
			eipAddress.setBandwidth(_ctx.integerValue("DescribeInstancesResponse.Instances["+ i +"].EipAddress.Bandwidth"));
			eipAddress.setAllocationId(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].EipAddress.AllocationId"));
			instance.setEipAddress(eipAddress);

			HibernationOptions hibernationOptions = new HibernationOptions();
			hibernationOptions.setConfigured(_ctx.booleanValue("DescribeInstancesResponse.Instances["+ i +"].HibernationOptions.Configured"));
			instance.setHibernationOptions(hibernationOptions);

			DedicatedHostAttribute dedicatedHostAttribute = new DedicatedHostAttribute();
			dedicatedHostAttribute.setDedicatedHostId(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].DedicatedHostAttribute.DedicatedHostId"));
			dedicatedHostAttribute.setDedicatedHostName(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].DedicatedHostAttribute.DedicatedHostName"));
			dedicatedHostAttribute.setDedicatedHostClusterId(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].DedicatedHostAttribute.DedicatedHostClusterId"));
			instance.setDedicatedHostAttribute(dedicatedHostAttribute);

			EcsCapacityReservationAttr ecsCapacityReservationAttr = new EcsCapacityReservationAttr();
			ecsCapacityReservationAttr.setCapacityReservationPreference(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].EcsCapacityReservationAttr.CapacityReservationPreference"));
			ecsCapacityReservationAttr.setCapacityReservationId(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].EcsCapacityReservationAttr.CapacityReservationId"));
			instance.setEcsCapacityReservationAttr(ecsCapacityReservationAttr);

			DedicatedInstanceAttribute dedicatedInstanceAttribute = new DedicatedInstanceAttribute();
			dedicatedInstanceAttribute.setAffinity(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].DedicatedInstanceAttribute.Affinity"));
			dedicatedInstanceAttribute.setTenancy(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].DedicatedInstanceAttribute.Tenancy"));
			instance.setDedicatedInstanceAttribute(dedicatedInstanceAttribute);

			CpuOptions cpuOptions = new CpuOptions();
			cpuOptions.setNuma(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].CpuOptions.Numa"));
			cpuOptions.setCoreCount(_ctx.integerValue("DescribeInstancesResponse.Instances["+ i +"].CpuOptions.CoreCount"));
			cpuOptions.setThreadsPerCore(_ctx.integerValue("DescribeInstancesResponse.Instances["+ i +"].CpuOptions.ThreadsPerCore"));
			instance.setCpuOptions(cpuOptions);

			MetadataOptions metadataOptions = new MetadataOptions();
			metadataOptions.setHttpEndpoint(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].MetadataOptions.HttpEndpoint"));
			metadataOptions.setHttpPutResponseHopLimit(_ctx.integerValue("DescribeInstancesResponse.Instances["+ i +"].MetadataOptions.HttpPutResponseHopLimit"));
			metadataOptions.setHttpTokens(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].MetadataOptions.HttpTokens"));
			instance.setMetadataOptions(metadataOptions);

			List<NetworkInterface> networkInterfaces = new ArrayList<NetworkInterface>();
			for (int j = 0; j < _ctx.lengthValue("DescribeInstancesResponse.Instances["+ i +"].NetworkInterfaces.Length"); j++) {
				NetworkInterface networkInterface = new NetworkInterface();
				networkInterface.setType(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].NetworkInterfaces["+ j +"].Type"));
				networkInterface.setMacAddress(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].NetworkInterfaces["+ j +"].MacAddress"));
				networkInterface.setPrimaryIpAddress(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].NetworkInterfaces["+ j +"].PrimaryIpAddress"));
				networkInterface.setNetworkInterfaceId(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].NetworkInterfaces["+ j +"].NetworkInterfaceId"));

				List<PrivateIpSet> privateIpSets = new ArrayList<PrivateIpSet>();
				for (int k = 0; k < _ctx.lengthValue("DescribeInstancesResponse.Instances["+ i +"].NetworkInterfaces["+ j +"].PrivateIpSets.Length"); k++) {
					PrivateIpSet privateIpSet = new PrivateIpSet();
					privateIpSet.setPrivateIpAddress(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].NetworkInterfaces["+ j +"].PrivateIpSets["+ k +"].PrivateIpAddress"));
					privateIpSet.setPrimary(_ctx.booleanValue("DescribeInstancesResponse.Instances["+ i +"].NetworkInterfaces["+ j +"].PrivateIpSets["+ k +"].Primary"));

					privateIpSets.add(privateIpSet);
				}
				networkInterface.setPrivateIpSets(privateIpSets);

				List<Ipv6Set> ipv6Sets = new ArrayList<Ipv6Set>();
				for (int k = 0; k < _ctx.lengthValue("DescribeInstancesResponse.Instances["+ i +"].NetworkInterfaces["+ j +"].Ipv6Sets.Length"); k++) {
					Ipv6Set ipv6Set = new Ipv6Set();
					ipv6Set.setIpv6Address(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].NetworkInterfaces["+ j +"].Ipv6Sets["+ k +"].Ipv6Address"));

					ipv6Sets.add(ipv6Set);
				}
				networkInterface.setIpv6Sets(ipv6Sets);

				networkInterfaces.add(networkInterface);
			}
			instance.setNetworkInterfaces(networkInterfaces);

			List<LockReason> operationLocks = new ArrayList<LockReason>();
			for (int j = 0; j < _ctx.lengthValue("DescribeInstancesResponse.Instances["+ i +"].OperationLocks.Length"); j++) {
				LockReason lockReason = new LockReason();
				lockReason.setLockMsg(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].OperationLocks["+ j +"].LockMsg"));
				lockReason.setLockReason(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].OperationLocks["+ j +"].LockReason"));

				operationLocks.add(lockReason);
			}
			instance.setOperationLocks(operationLocks);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeInstancesResponse.Instances["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setTagValue(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].Tags["+ j +"].TagValue"));
				tag.setTagKey(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].Tags["+ j +"].TagKey"));

				tags.add(tag);
			}
			instance.setTags(tags);

			instances.add(instance);
		}
		describeInstancesResponse.setInstances(instances);
	 
	 	return describeInstancesResponse;
	}
}