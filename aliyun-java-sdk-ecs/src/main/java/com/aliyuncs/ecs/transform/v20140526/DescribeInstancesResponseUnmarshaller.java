/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.ecs.transform.v20140526;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20140526.DescribeInstancesResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeInstancesResponse.Instance;
import com.aliyuncs.ecs.model.v20140526.DescribeInstancesResponse.Instance.EipAddress;
import com.aliyuncs.ecs.model.v20140526.DescribeInstancesResponse.Instance.LockReason;
import com.aliyuncs.ecs.model.v20140526.DescribeInstancesResponse.Instance.Status;
import com.aliyuncs.ecs.model.v20140526.DescribeInstancesResponse.Instance.Tag;
import com.aliyuncs.ecs.model.v20140526.DescribeInstancesResponse.Instance.VpcAttributes;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstancesResponseUnmarshaller {

	public static DescribeInstancesResponse unmarshall(DescribeInstancesResponse describeInstancesResponse, UnmarshallerContext context) {

		describeInstancesResponse.setRequestId(context.stringValue("DescribeInstancesResponse.RequestId"));
		describeInstancesResponse.setTotalCount(context.integerValue("DescribeInstancesResponse.TotalCount"));
		describeInstancesResponse.setPageNumber(context.integerValue("DescribeInstancesResponse.PageNumber"));
		describeInstancesResponse.setPageSize(context.integerValue("DescribeInstancesResponse.PageSize"));

		List<Instance> instancesList = new ArrayList<Instance>();
		for (int i = 0; i < context.lengthValue("DescribeInstancesResponse.Instances.Length"); i++) {
			Instance instance = new Instance();
			instance.setInstanceId(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].InstanceId"));
			instance.setInstanceName(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].InstanceName"));
			instance.setDescription(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].Description"));
			instance.setImageId(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].ImageId"));
			instance.setOSName(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].OSName"));
			instance.setOSType(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].OSType"));
			instance.setRegionId(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].RegionId"));
			instance.setZoneId(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].ZoneId"));
			instance.setClusterId(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].ClusterId"));
			instance.setInstanceType(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].InstanceType"));
			instance.setCpu(context.integerValue("DescribeInstancesResponse.Instances["+ i +"].Cpu"));
			instance.setMemory(context.integerValue("DescribeInstancesResponse.Instances["+ i +"].Memory"));
			instance.setHostName(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].HostName"));
			instance.setStatus(Status.getEnum(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].Status")));
			instance.setSerialNumber(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].SerialNumber"));
			instance.setInternetChargeType(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].InternetChargeType"));
			instance.setInternetMaxBandwidthIn(context.integerValue("DescribeInstancesResponse.Instances["+ i +"].InternetMaxBandwidthIn"));
			instance.setInternetMaxBandwidthOut(context.integerValue("DescribeInstancesResponse.Instances["+ i +"].InternetMaxBandwidthOut"));
			instance.setVlanId(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].VlanId"));
			instance.setCreationTime(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].CreationTime"));
			instance.setInstanceNetworkType(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].InstanceNetworkType"));
			instance.setInstanceChargeType(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].InstanceChargeType"));
			instance.setExpiredTime(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].ExpiredTime"));
			instance.setAutoReleaseTime(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].AutoReleaseTime"));
			instance.setIoOptimized(context.booleanValue("DescribeInstancesResponse.Instances["+ i +"].IoOptimized"));
			instance.setDeviceAvailable(context.booleanValue("DescribeInstancesResponse.Instances["+ i +"].DeviceAvailable"));
			instance.setInstanceTypeFamily(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].InstanceTypeFamily"));
			instance.setLocalStorageCapacity(context.longValue("DescribeInstancesResponse.Instances["+ i +"].LocalStorageCapacity"));
			instance.setLocalStorageAmount(context.integerValue("DescribeInstancesResponse.Instances["+ i +"].LocalStorageAmount"));
			instance.setGPUAmount(context.integerValue("DescribeInstancesResponse.Instances["+ i +"].GPUAmount"));
			instance.setGPUSpec(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].GPUSpec"));
			instance.setSpotStrategy(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].SpotStrategy"));
			instance.setKeyPairName(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].KeyPairName"));

			List<String> securityGroupIds = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("DescribeInstancesResponse.Instances["+ i +"].SecurityGroupIds.Length"); j++) {
				securityGroupIds.add(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].SecurityGroupIds["+ j +"]"));
			}
			instance.setSecurityGroupIds(securityGroupIds);

			List<String> publicIpAddress = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("DescribeInstancesResponse.Instances["+ i +"].PublicIpAddress.Length"); j++) {
				publicIpAddress.add(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].PublicIpAddress["+ j +"]"));
			}
			instance.setPublicIpAddress(publicIpAddress);

			List<String> innerIpAddress = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("DescribeInstancesResponse.Instances["+ i +"].InnerIpAddress.Length"); j++) {
				innerIpAddress.add(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].InnerIpAddress["+ j +"]"));
			}
			instance.setInnerIpAddress(innerIpAddress);

			VpcAttributes vpcAttributes = new VpcAttributes();
			vpcAttributes.setVpcId(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].VpcAttributes.VpcId"));
			vpcAttributes.setVSwitchId(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].VpcAttributes.VSwitchId"));
			vpcAttributes.setNatIpAddress(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].VpcAttributes.NatIpAddress"));

			List<String> privateIpAddress = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("DescribeInstancesResponse.Instances["+ i +"].VpcAttributes.PrivateIpAddress.Length"); j++) {
				privateIpAddress.add(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].VpcAttributes.PrivateIpAddress["+ j +"]"));
			}
			vpcAttributes.setPrivateIpAddress(privateIpAddress);
			instance.setVpcAttributes(vpcAttributes);

			EipAddress eipAddress = new EipAddress();
			eipAddress.setAllocationId(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].EipAddress.AllocationId"));
			eipAddress.setIpAddress(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].EipAddress.IpAddress"));
			eipAddress.setBandwidth(context.integerValue("DescribeInstancesResponse.Instances["+ i +"].EipAddress.Bandwidth"));
			eipAddress.setInternetChargeType(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].EipAddress.InternetChargeType"));
			eipAddress.setIsSupportUnassociate(context.booleanValue("DescribeInstancesResponse.Instances["+ i +"].EipAddress.IsSupportUnassociate"));
			instance.setEipAddress(eipAddress);

			List<LockReason> operationLocksList = new ArrayList<LockReason>();
			for (int j = 0; j < context.lengthValue("DescribeInstancesResponse.Instances["+ i +"].OperationLocks.Length"); j++) {
				LockReason lockReason = new LockReason();
				lockReason.setLockReason(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].OperationLocks["+ j +"].LockReason"));
				lockReason.setLockMsg(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].OperationLocks["+ j +"].LockMsg"));

				operationLocksList.add(lockReason);
			}
			instance.setOperationLocks(operationLocksList);

			List<Tag> tagsList = new ArrayList<Tag>();
			for (int j = 0; j < context.lengthValue("DescribeInstancesResponse.Instances["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setTagKey(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].Tags["+ j +"].TagKey"));
				tag.setTagValue(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].Tags["+ j +"].TagValue"));

				tagsList.add(tag);
			}
			instance.setTags(tagsList);

			instancesList.add(instance);
		}
		describeInstancesResponse.setInstances(instancesList);

		return describeInstancesResponse;
	}
}