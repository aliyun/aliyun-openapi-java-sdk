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

import com.aliyuncs.ecs.model.v20140526.DescribeInstanceAttributeResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeInstanceAttributeResponse.EipAddress;
import com.aliyuncs.ecs.model.v20140526.DescribeInstanceAttributeResponse.LockReason;
import com.aliyuncs.ecs.model.v20140526.DescribeInstanceAttributeResponse.Status;
import com.aliyuncs.ecs.model.v20140526.DescribeInstanceAttributeResponse.VpcAttributes;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceAttributeResponseUnmarshaller {

	public static DescribeInstanceAttributeResponse unmarshall(DescribeInstanceAttributeResponse describeInstanceAttributeResponse, UnmarshallerContext context) {
		
		describeInstanceAttributeResponse.setRequestId(context.stringValue("DescribeInstanceAttributeResponse.RequestId"));
		describeInstanceAttributeResponse.setInstanceId(context.stringValue("DescribeInstanceAttributeResponse.InstanceId"));
		describeInstanceAttributeResponse.setInstanceName(context.stringValue("DescribeInstanceAttributeResponse.InstanceName"));
		describeInstanceAttributeResponse.setImageId(context.stringValue("DescribeInstanceAttributeResponse.ImageId"));
		describeInstanceAttributeResponse.setRegionId(context.stringValue("DescribeInstanceAttributeResponse.RegionId"));
		describeInstanceAttributeResponse.setZoneId(context.stringValue("DescribeInstanceAttributeResponse.ZoneId"));
		describeInstanceAttributeResponse.setClusterId(context.stringValue("DescribeInstanceAttributeResponse.ClusterId"));
		describeInstanceAttributeResponse.setInstanceType(context.stringValue("DescribeInstanceAttributeResponse.InstanceType"));
		describeInstanceAttributeResponse.setCpu(context.integerValue("DescribeInstanceAttributeResponse.Cpu"));
		describeInstanceAttributeResponse.setMemory(context.integerValue("DescribeInstanceAttributeResponse.Memory"));
		describeInstanceAttributeResponse.setHostName(context.stringValue("DescribeInstanceAttributeResponse.HostName"));
		describeInstanceAttributeResponse.setStatus(Status.getEnum(context.stringValue("DescribeInstanceAttributeResponse.Status")));
		describeInstanceAttributeResponse.setInternetChargeType(context.stringValue("DescribeInstanceAttributeResponse.InternetChargeType"));
		describeInstanceAttributeResponse.setInternetMaxBandwidthIn(context.integerValue("DescribeInstanceAttributeResponse.InternetMaxBandwidthIn"));
		describeInstanceAttributeResponse.setInternetMaxBandwidthOut(context.integerValue("DescribeInstanceAttributeResponse.InternetMaxBandwidthOut"));
		describeInstanceAttributeResponse.setVlanId(context.stringValue("DescribeInstanceAttributeResponse.VlanId"));
		describeInstanceAttributeResponse.setSerialNumber(context.stringValue("DescribeInstanceAttributeResponse.SerialNumber"));
		describeInstanceAttributeResponse.setCreationTime(context.stringValue("DescribeInstanceAttributeResponse.CreationTime"));
		describeInstanceAttributeResponse.setDescription(context.stringValue("DescribeInstanceAttributeResponse.Description"));
		describeInstanceAttributeResponse.setInstanceNetworkType(context.stringValue("DescribeInstanceAttributeResponse.InstanceNetworkType"));
		describeInstanceAttributeResponse.setIoOptimized(context.stringValue("DescribeInstanceAttributeResponse.IoOptimized"));
		describeInstanceAttributeResponse.setInstanceChargeType(context.stringValue("DescribeInstanceAttributeResponse.InstanceChargeType"));
		describeInstanceAttributeResponse.setExpiredTime(context.stringValue("DescribeInstanceAttributeResponse.ExpiredTime"));

		List<String> securityGroupIds = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeInstanceAttributeResponse.SecurityGroupIds.Length"); i++) {
			securityGroupIds.add(context.stringValue("DescribeInstanceAttributeResponse.SecurityGroupIds["+ i +"]"));
		}
		describeInstanceAttributeResponse.setSecurityGroupIds(securityGroupIds);

		List<String> publicIpAddress = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeInstanceAttributeResponse.PublicIpAddress.Length"); i++) {
			publicIpAddress.add(context.stringValue("DescribeInstanceAttributeResponse.PublicIpAddress["+ i +"]"));
		}
		describeInstanceAttributeResponse.setPublicIpAddress(publicIpAddress);

		List<String> innerIpAddress = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeInstanceAttributeResponse.InnerIpAddress.Length"); i++) {
			innerIpAddress.add(context.stringValue("DescribeInstanceAttributeResponse.InnerIpAddress["+ i +"]"));
		}
		describeInstanceAttributeResponse.setInnerIpAddress(innerIpAddress);

		VpcAttributes vpcAttributes = new VpcAttributes();
		vpcAttributes.setVpcId(context.stringValue("DescribeInstanceAttributeResponse.VpcAttributes.VpcId"));
		vpcAttributes.setVSwitchId(context.stringValue("DescribeInstanceAttributeResponse.VpcAttributes.VSwitchId"));
		vpcAttributes.setNatIpAddress(context.stringValue("DescribeInstanceAttributeResponse.VpcAttributes.NatIpAddress"));

		List<String> privateIpAddress = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeInstanceAttributeResponse.VpcAttributes.PrivateIpAddress.Length"); i++) {
			privateIpAddress.add(context.stringValue("DescribeInstanceAttributeResponse.VpcAttributes.PrivateIpAddress["+ i +"]"));
		}
		vpcAttributes.setPrivateIpAddress(privateIpAddress);
		describeInstanceAttributeResponse.setVpcAttributes(vpcAttributes);

		EipAddress eipAddress = new EipAddress();
		eipAddress.setAllocationId(context.stringValue("DescribeInstanceAttributeResponse.EipAddress.AllocationId"));
		eipAddress.setIpAddress(context.stringValue("DescribeInstanceAttributeResponse.EipAddress.IpAddress"));
		eipAddress.setBandwidth(context.integerValue("DescribeInstanceAttributeResponse.EipAddress.Bandwidth"));
		eipAddress.setInternetChargeType(context.stringValue("DescribeInstanceAttributeResponse.EipAddress.InternetChargeType"));
		describeInstanceAttributeResponse.setEipAddress(eipAddress);

		List<LockReason> operationLocks = new ArrayList<LockReason>();
		for (int i = 0; i < context.lengthValue("DescribeInstanceAttributeResponse.OperationLocks.Length"); i++) {
			LockReason lockReason = new LockReason();
			lockReason.setLockReason(context.stringValue("DescribeInstanceAttributeResponse.OperationLocks["+ i +"].LockReason"));

			operationLocks.add(lockReason);
		}
		describeInstanceAttributeResponse.setOperationLocks(operationLocks);
	 
	 	return describeInstanceAttributeResponse;
	}
}