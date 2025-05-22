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

package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.DescribeRCInstanceAttributeResponse;
import com.aliyuncs.rds.model.v20140815.DescribeRCInstanceAttributeResponse.DataDisk;
import com.aliyuncs.rds.model.v20140815.DescribeRCInstanceAttributeResponse.DedicatedHostAttribute;
import com.aliyuncs.rds.model.v20140815.DescribeRCInstanceAttributeResponse.EipAddress;
import com.aliyuncs.rds.model.v20140815.DescribeRCInstanceAttributeResponse.LockReason;
import com.aliyuncs.rds.model.v20140815.DescribeRCInstanceAttributeResponse.SystemDisk;
import com.aliyuncs.rds.model.v20140815.DescribeRCInstanceAttributeResponse.Tag;
import com.aliyuncs.rds.model.v20140815.DescribeRCInstanceAttributeResponse.VpcAttributes;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRCInstanceAttributeResponseUnmarshaller {

	public static DescribeRCInstanceAttributeResponse unmarshall(DescribeRCInstanceAttributeResponse describeRCInstanceAttributeResponse, UnmarshallerContext _ctx) {
		
		describeRCInstanceAttributeResponse.setRequestId(_ctx.stringValue("DescribeRCInstanceAttributeResponse.RequestId"));
		describeRCInstanceAttributeResponse.setClusterId(_ctx.stringValue("DescribeRCInstanceAttributeResponse.ClusterId"));
		describeRCInstanceAttributeResponse.setCpu(_ctx.integerValue("DescribeRCInstanceAttributeResponse.Cpu"));
		describeRCInstanceAttributeResponse.setCreationTime(_ctx.stringValue("DescribeRCInstanceAttributeResponse.CreationTime"));
		describeRCInstanceAttributeResponse.setCreditSpecification(_ctx.stringValue("DescribeRCInstanceAttributeResponse.CreditSpecification"));
		describeRCInstanceAttributeResponse.setDeploymentSetId(_ctx.stringValue("DescribeRCInstanceAttributeResponse.DeploymentSetId"));
		describeRCInstanceAttributeResponse.setDescription(_ctx.stringValue("DescribeRCInstanceAttributeResponse.Description"));
		describeRCInstanceAttributeResponse.setDiskType(_ctx.stringValue("DescribeRCInstanceAttributeResponse.DiskType"));
		describeRCInstanceAttributeResponse.setEcsInstanceType(_ctx.stringValue("DescribeRCInstanceAttributeResponse.EcsInstanceType"));
		describeRCInstanceAttributeResponse.setEnableJumboFrame(_ctx.booleanValue("DescribeRCInstanceAttributeResponse.EnableJumboFrame"));
		describeRCInstanceAttributeResponse.setExpiredTime(_ctx.stringValue("DescribeRCInstanceAttributeResponse.ExpiredTime"));
		describeRCInstanceAttributeResponse.setHostName(_ctx.stringValue("DescribeRCInstanceAttributeResponse.HostName"));
		describeRCInstanceAttributeResponse.setHostType(_ctx.stringValue("DescribeRCInstanceAttributeResponse.HostType"));
		describeRCInstanceAttributeResponse.setImageId(_ctx.stringValue("DescribeRCInstanceAttributeResponse.ImageId"));
		describeRCInstanceAttributeResponse.setInstanceId(_ctx.stringValue("DescribeRCInstanceAttributeResponse.InstanceId"));
		describeRCInstanceAttributeResponse.setInstanceName(_ctx.stringValue("DescribeRCInstanceAttributeResponse.InstanceName"));
		describeRCInstanceAttributeResponse.setInstanceNetworkType(_ctx.stringValue("DescribeRCInstanceAttributeResponse.InstanceNetworkType"));
		describeRCInstanceAttributeResponse.setInstanceType(_ctx.stringValue("DescribeRCInstanceAttributeResponse.InstanceType"));
		describeRCInstanceAttributeResponse.setInternetChargeType(_ctx.stringValue("DescribeRCInstanceAttributeResponse.InternetChargeType"));
		describeRCInstanceAttributeResponse.setInternetMaxBandwidthIn(_ctx.integerValue("DescribeRCInstanceAttributeResponse.InternetMaxBandwidthIn"));
		describeRCInstanceAttributeResponse.setInternetMaxBandwidthOut(_ctx.integerValue("DescribeRCInstanceAttributeResponse.InternetMaxBandwidthOut"));
		describeRCInstanceAttributeResponse.setIoOptimized(_ctx.stringValue("DescribeRCInstanceAttributeResponse.IoOptimized"));
		describeRCInstanceAttributeResponse.setKeyPairName(_ctx.stringValue("DescribeRCInstanceAttributeResponse.KeyPairName"));
		describeRCInstanceAttributeResponse.setMemory(_ctx.integerValue("DescribeRCInstanceAttributeResponse.Memory"));
		describeRCInstanceAttributeResponse.setRegionId(_ctx.stringValue("DescribeRCInstanceAttributeResponse.RegionId"));
		describeRCInstanceAttributeResponse.setSerialNumber(_ctx.stringValue("DescribeRCInstanceAttributeResponse.SerialNumber"));
		describeRCInstanceAttributeResponse.setStatus(_ctx.stringValue("DescribeRCInstanceAttributeResponse.Status"));
		describeRCInstanceAttributeResponse.setStoppedMode(_ctx.stringValue("DescribeRCInstanceAttributeResponse.StoppedMode"));
		describeRCInstanceAttributeResponse.setVlanId(_ctx.stringValue("DescribeRCInstanceAttributeResponse.VlanId"));
		describeRCInstanceAttributeResponse.setZoneId(_ctx.stringValue("DescribeRCInstanceAttributeResponse.ZoneId"));
		describeRCInstanceAttributeResponse.setResourceGroupId(_ctx.stringValue("DescribeRCInstanceAttributeResponse.ResourceGroupId"));
		describeRCInstanceAttributeResponse.setInstanceChargeType(_ctx.stringValue("DescribeRCInstanceAttributeResponse.InstanceChargeType"));
		describeRCInstanceAttributeResponse.setDbType(_ctx.stringValue("DescribeRCInstanceAttributeResponse.DbType"));
		describeRCInstanceAttributeResponse.setSpotStrategy(_ctx.stringValue("DescribeRCInstanceAttributeResponse.SpotStrategy"));
		describeRCInstanceAttributeResponse.setCreateMode(_ctx.integerValue("DescribeRCInstanceAttributeResponse.CreateMode"));
		describeRCInstanceAttributeResponse.setAutoRenew(_ctx.booleanValue("DescribeRCInstanceAttributeResponse.AutoRenew"));

		List<String> innerIpAddress = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRCInstanceAttributeResponse.InnerIpAddress.Length"); i++) {
			innerIpAddress.add(_ctx.stringValue("DescribeRCInstanceAttributeResponse.InnerIpAddress["+ i +"]"));
		}
		describeRCInstanceAttributeResponse.setInnerIpAddress(innerIpAddress);

		List<String> publicIpAddress = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRCInstanceAttributeResponse.PublicIpAddress.Length"); i++) {
			publicIpAddress.add(_ctx.stringValue("DescribeRCInstanceAttributeResponse.PublicIpAddress["+ i +"]"));
		}
		describeRCInstanceAttributeResponse.setPublicIpAddress(publicIpAddress);

		List<String> securityGroupIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRCInstanceAttributeResponse.SecurityGroupIds.Length"); i++) {
			securityGroupIds.add(_ctx.stringValue("DescribeRCInstanceAttributeResponse.SecurityGroupIds["+ i +"]"));
		}
		describeRCInstanceAttributeResponse.setSecurityGroupIds(securityGroupIds);

		DedicatedHostAttribute dedicatedHostAttribute = new DedicatedHostAttribute();
		dedicatedHostAttribute.setDedicatedHostId(_ctx.stringValue("DescribeRCInstanceAttributeResponse.DedicatedHostAttribute.DedicatedHostId"));
		dedicatedHostAttribute.setDedicatedHostName(_ctx.stringValue("DescribeRCInstanceAttributeResponse.DedicatedHostAttribute.DedicatedHostName"));
		describeRCInstanceAttributeResponse.setDedicatedHostAttribute(dedicatedHostAttribute);

		EipAddress eipAddress = new EipAddress();
		eipAddress.setAllocationId(_ctx.stringValue("DescribeRCInstanceAttributeResponse.EipAddress.AllocationId"));
		eipAddress.setBandwidth(_ctx.integerValue("DescribeRCInstanceAttributeResponse.EipAddress.Bandwidth"));
		eipAddress.setInternetChargeType(_ctx.stringValue("DescribeRCInstanceAttributeResponse.EipAddress.InternetChargeType"));
		eipAddress.setIpAddress(_ctx.stringValue("DescribeRCInstanceAttributeResponse.EipAddress.IpAddress"));
		describeRCInstanceAttributeResponse.setEipAddress(eipAddress);

		VpcAttributes vpcAttributes = new VpcAttributes();
		vpcAttributes.setNatIpAddress(_ctx.stringValue("DescribeRCInstanceAttributeResponse.VpcAttributes.NatIpAddress"));
		vpcAttributes.setVSwitchId(_ctx.stringValue("DescribeRCInstanceAttributeResponse.VpcAttributes.VSwitchId"));
		vpcAttributes.setVpcId(_ctx.stringValue("DescribeRCInstanceAttributeResponse.VpcAttributes.VpcId"));

		List<String> privateIpAddress = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRCInstanceAttributeResponse.VpcAttributes.PrivateIpAddress.Length"); i++) {
			privateIpAddress.add(_ctx.stringValue("DescribeRCInstanceAttributeResponse.VpcAttributes.PrivateIpAddress["+ i +"]"));
		}
		vpcAttributes.setPrivateIpAddress(privateIpAddress);
		describeRCInstanceAttributeResponse.setVpcAttributes(vpcAttributes);

		SystemDisk systemDisk = new SystemDisk();
		systemDisk.setSystemDiskSize(_ctx.longValue("DescribeRCInstanceAttributeResponse.SystemDisk.SystemDiskSize"));
		systemDisk.setSystemDiskCategory(_ctx.stringValue("DescribeRCInstanceAttributeResponse.SystemDisk.SystemDiskCategory"));
		systemDisk.setSystemDiskPerformanceLevel(_ctx.stringValue("DescribeRCInstanceAttributeResponse.SystemDisk.SystemDiskPerformanceLevel"));
		systemDisk.setDeleteWithInstance(_ctx.booleanValue("DescribeRCInstanceAttributeResponse.SystemDisk.DeleteWithInstance"));
		systemDisk.setEncrypted(_ctx.stringValue("DescribeRCInstanceAttributeResponse.SystemDisk.Encrypted"));
		describeRCInstanceAttributeResponse.setSystemDisk(systemDisk);

		List<DataDisk> dataDisks = new ArrayList<DataDisk>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRCInstanceAttributeResponse.DataDisks.Length"); i++) {
			DataDisk dataDisk = new DataDisk();
			dataDisk.setCategory(_ctx.stringValue("DescribeRCInstanceAttributeResponse.DataDisks["+ i +"].Category"));
			dataDisk.setDeleteWithInstance(_ctx.booleanValue("DescribeRCInstanceAttributeResponse.DataDisks["+ i +"].DeleteWithInstance"));
			dataDisk.setEncrypted(_ctx.stringValue("DescribeRCInstanceAttributeResponse.DataDisks["+ i +"].Encrypted"));
			dataDisk.setPerformanceLevel(_ctx.stringValue("DescribeRCInstanceAttributeResponse.DataDisks["+ i +"].PerformanceLevel"));
			dataDisk.setSize(_ctx.longValue("DescribeRCInstanceAttributeResponse.DataDisks["+ i +"].Size"));

			dataDisks.add(dataDisk);
		}
		describeRCInstanceAttributeResponse.setDataDisks(dataDisks);

		List<Tag> tags = new ArrayList<Tag>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRCInstanceAttributeResponse.Tags.Length"); i++) {
			Tag tag = new Tag();
			tag.setResourceId(_ctx.stringValue("DescribeRCInstanceAttributeResponse.Tags["+ i +"].ResourceId"));
			tag.setResourceType(_ctx.stringValue("DescribeRCInstanceAttributeResponse.Tags["+ i +"].ResourceType"));
			tag.setTagKey(_ctx.stringValue("DescribeRCInstanceAttributeResponse.Tags["+ i +"].TagKey"));
			tag.setTagValue(_ctx.stringValue("DescribeRCInstanceAttributeResponse.Tags["+ i +"].TagValue"));

			tags.add(tag);
		}
		describeRCInstanceAttributeResponse.setTags(tags);

		List<LockReason> operationLocks = new ArrayList<LockReason>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRCInstanceAttributeResponse.OperationLocks.Length"); i++) {
			LockReason lockReason = new LockReason();
			lockReason.setLockReason(_ctx.stringValue("DescribeRCInstanceAttributeResponse.OperationLocks["+ i +"].LockReason"));

			operationLocks.add(lockReason);
		}
		describeRCInstanceAttributeResponse.setOperationLocks(operationLocks);
	 
	 	return describeRCInstanceAttributeResponse;
	}
}