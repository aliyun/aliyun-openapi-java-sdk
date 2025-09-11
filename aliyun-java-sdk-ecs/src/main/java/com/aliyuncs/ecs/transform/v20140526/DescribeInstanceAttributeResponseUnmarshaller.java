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

import com.aliyuncs.ecs.model.v20140526.DescribeInstanceAttributeResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeInstanceAttributeResponse.DedicatedHostAttribute;
import com.aliyuncs.ecs.model.v20140526.DescribeInstanceAttributeResponse.EipAddress;
import com.aliyuncs.ecs.model.v20140526.DescribeInstanceAttributeResponse.LockReason;
import com.aliyuncs.ecs.model.v20140526.DescribeInstanceAttributeResponse.NetworkOptions;
import com.aliyuncs.ecs.model.v20140526.DescribeInstanceAttributeResponse.VpcAttributes;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceAttributeResponseUnmarshaller {

	public static DescribeInstanceAttributeResponse unmarshall(DescribeInstanceAttributeResponse describeInstanceAttributeResponse, UnmarshallerContext _ctx) {
		
		describeInstanceAttributeResponse.setRequestId(_ctx.stringValue("DescribeInstanceAttributeResponse.RequestId"));
		describeInstanceAttributeResponse.setStatus(_ctx.stringValue("DescribeInstanceAttributeResponse.Status"));
		describeInstanceAttributeResponse.setSerialNumber(_ctx.stringValue("DescribeInstanceAttributeResponse.SerialNumber"));
		describeInstanceAttributeResponse.setCreationTime(_ctx.stringValue("DescribeInstanceAttributeResponse.CreationTime"));
		describeInstanceAttributeResponse.setDescription(_ctx.stringValue("DescribeInstanceAttributeResponse.Description"));
		describeInstanceAttributeResponse.setInstanceName(_ctx.stringValue("DescribeInstanceAttributeResponse.InstanceName"));
		describeInstanceAttributeResponse.setInstanceNetworkType(_ctx.stringValue("DescribeInstanceAttributeResponse.InstanceNetworkType"));
		describeInstanceAttributeResponse.setMemory(_ctx.integerValue("DescribeInstanceAttributeResponse.Memory"));
		describeInstanceAttributeResponse.setImageId(_ctx.stringValue("DescribeInstanceAttributeResponse.ImageId"));
		describeInstanceAttributeResponse.setClusterId(_ctx.stringValue("DescribeInstanceAttributeResponse.ClusterId"));
		describeInstanceAttributeResponse.setVlanId(_ctx.stringValue("DescribeInstanceAttributeResponse.VlanId"));
		describeInstanceAttributeResponse.setStoppedMode(_ctx.stringValue("DescribeInstanceAttributeResponse.StoppedMode"));
		describeInstanceAttributeResponse.setHostName(_ctx.stringValue("DescribeInstanceAttributeResponse.HostName"));
		describeInstanceAttributeResponse.setInstanceId(_ctx.stringValue("DescribeInstanceAttributeResponse.InstanceId"));
		describeInstanceAttributeResponse.setInstanceType(_ctx.stringValue("DescribeInstanceAttributeResponse.InstanceType"));
		describeInstanceAttributeResponse.setInternetMaxBandwidthIn(_ctx.integerValue("DescribeInstanceAttributeResponse.InternetMaxBandwidthIn"));
		describeInstanceAttributeResponse.setInternetMaxBandwidthOut(_ctx.integerValue("DescribeInstanceAttributeResponse.InternetMaxBandwidthOut"));
		describeInstanceAttributeResponse.setRegionId(_ctx.stringValue("DescribeInstanceAttributeResponse.RegionId"));
		describeInstanceAttributeResponse.setInstanceChargeType(_ctx.stringValue("DescribeInstanceAttributeResponse.InstanceChargeType"));
		describeInstanceAttributeResponse.setIoOptimized(_ctx.stringValue("DescribeInstanceAttributeResponse.IoOptimized"));
		describeInstanceAttributeResponse.setCpu(_ctx.integerValue("DescribeInstanceAttributeResponse.Cpu"));
		describeInstanceAttributeResponse.setExpiredTime(_ctx.stringValue("DescribeInstanceAttributeResponse.ExpiredTime"));
		describeInstanceAttributeResponse.setZoneId(_ctx.stringValue("DescribeInstanceAttributeResponse.ZoneId"));
		describeInstanceAttributeResponse.setInternetChargeType(_ctx.stringValue("DescribeInstanceAttributeResponse.InternetChargeType"));
		describeInstanceAttributeResponse.setCreditSpecification(_ctx.stringValue("DescribeInstanceAttributeResponse.CreditSpecification"));
		describeInstanceAttributeResponse.setEnableJumboFrame(_ctx.booleanValue("DescribeInstanceAttributeResponse.EnableJumboFrame"));
		describeInstanceAttributeResponse.setEnableNetworkEncryption(_ctx.booleanValue("DescribeInstanceAttributeResponse.EnableNetworkEncryption"));

		List<String> securityGroupIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceAttributeResponse.SecurityGroupIds.Length"); i++) {
			securityGroupIds.add(_ctx.stringValue("DescribeInstanceAttributeResponse.SecurityGroupIds["+ i +"]"));
		}
		describeInstanceAttributeResponse.setSecurityGroupIds(securityGroupIds);

		List<String> publicIpAddress = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceAttributeResponse.PublicIpAddress.Length"); i++) {
			publicIpAddress.add(_ctx.stringValue("DescribeInstanceAttributeResponse.PublicIpAddress["+ i +"]"));
		}
		describeInstanceAttributeResponse.setPublicIpAddress(publicIpAddress);

		List<String> innerIpAddress = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceAttributeResponse.InnerIpAddress.Length"); i++) {
			innerIpAddress.add(_ctx.stringValue("DescribeInstanceAttributeResponse.InnerIpAddress["+ i +"]"));
		}
		describeInstanceAttributeResponse.setInnerIpAddress(innerIpAddress);

		VpcAttributes vpcAttributes = new VpcAttributes();
		vpcAttributes.setVpcId(_ctx.stringValue("DescribeInstanceAttributeResponse.VpcAttributes.VpcId"));
		vpcAttributes.setNatIpAddress(_ctx.stringValue("DescribeInstanceAttributeResponse.VpcAttributes.NatIpAddress"));
		vpcAttributes.setVSwitchId(_ctx.stringValue("DescribeInstanceAttributeResponse.VpcAttributes.VSwitchId"));

		List<String> privateIpAddress = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceAttributeResponse.VpcAttributes.PrivateIpAddress.Length"); i++) {
			privateIpAddress.add(_ctx.stringValue("DescribeInstanceAttributeResponse.VpcAttributes.PrivateIpAddress["+ i +"]"));
		}
		vpcAttributes.setPrivateIpAddress(privateIpAddress);
		describeInstanceAttributeResponse.setVpcAttributes(vpcAttributes);

		EipAddress eipAddress = new EipAddress();
		eipAddress.setInternetChargeType(_ctx.stringValue("DescribeInstanceAttributeResponse.EipAddress.InternetChargeType"));
		eipAddress.setIpAddress(_ctx.stringValue("DescribeInstanceAttributeResponse.EipAddress.IpAddress"));
		eipAddress.setBandwidth(_ctx.integerValue("DescribeInstanceAttributeResponse.EipAddress.Bandwidth"));
		eipAddress.setAllocationId(_ctx.stringValue("DescribeInstanceAttributeResponse.EipAddress.AllocationId"));
		describeInstanceAttributeResponse.setEipAddress(eipAddress);

		DedicatedHostAttribute dedicatedHostAttribute = new DedicatedHostAttribute();
		dedicatedHostAttribute.setDedicatedHostName(_ctx.stringValue("DescribeInstanceAttributeResponse.DedicatedHostAttribute.DedicatedHostName"));
		dedicatedHostAttribute.setDedicatedHostId(_ctx.stringValue("DescribeInstanceAttributeResponse.DedicatedHostAttribute.DedicatedHostId"));
		describeInstanceAttributeResponse.setDedicatedHostAttribute(dedicatedHostAttribute);

		NetworkOptions networkOptions = new NetworkOptions();
		networkOptions.setEnableJumboFrame(_ctx.booleanValue("DescribeInstanceAttributeResponse.NetworkOptions.EnableJumboFrame"));
		networkOptions.setEnableNetworkEncryption(_ctx.booleanValue("DescribeInstanceAttributeResponse.NetworkOptions.EnableNetworkEncryption"));
		networkOptions.setBandwidthWeighting(_ctx.stringValue("DescribeInstanceAttributeResponse.NetworkOptions.BandwidthWeighting"));
		describeInstanceAttributeResponse.setNetworkOptions(networkOptions);

		List<LockReason> operationLocks = new ArrayList<LockReason>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceAttributeResponse.OperationLocks.Length"); i++) {
			LockReason lockReason = new LockReason();
			lockReason.setLockReason(_ctx.stringValue("DescribeInstanceAttributeResponse.OperationLocks["+ i +"].LockReason"));

			operationLocks.add(lockReason);
		}
		describeInstanceAttributeResponse.setOperationLocks(operationLocks);
	 
	 	return describeInstanceAttributeResponse;
	}
}