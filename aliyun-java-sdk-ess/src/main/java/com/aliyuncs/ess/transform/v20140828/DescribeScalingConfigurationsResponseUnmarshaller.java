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

package com.aliyuncs.ess.transform.v20140828;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ess.model.v20140828.DescribeScalingConfigurationsResponse;
import com.aliyuncs.ess.model.v20140828.DescribeScalingConfigurationsResponse.ScalingConfiguration;
import com.aliyuncs.ess.model.v20140828.DescribeScalingConfigurationsResponse.ScalingConfiguration.DataDisk;
import com.aliyuncs.ess.model.v20140828.DescribeScalingConfigurationsResponse.ScalingConfiguration.SpotPriceModel;
import com.aliyuncs.ess.model.v20140828.DescribeScalingConfigurationsResponse.ScalingConfiguration.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeScalingConfigurationsResponseUnmarshaller {

	public static DescribeScalingConfigurationsResponse unmarshall(DescribeScalingConfigurationsResponse describeScalingConfigurationsResponse, UnmarshallerContext _ctx) {
		
		describeScalingConfigurationsResponse.setRequestId(_ctx.stringValue("DescribeScalingConfigurationsResponse.RequestId"));
		describeScalingConfigurationsResponse.setTotalCount(_ctx.integerValue("DescribeScalingConfigurationsResponse.TotalCount"));
		describeScalingConfigurationsResponse.setPageNumber(_ctx.integerValue("DescribeScalingConfigurationsResponse.PageNumber"));
		describeScalingConfigurationsResponse.setPageSize(_ctx.integerValue("DescribeScalingConfigurationsResponse.PageSize"));

		List<ScalingConfiguration> scalingConfigurations = new ArrayList<ScalingConfiguration>();
		for (int i = 0; i < _ctx.lengthValue("DescribeScalingConfigurationsResponse.ScalingConfigurations.Length"); i++) {
			ScalingConfiguration scalingConfiguration = new ScalingConfiguration();
			scalingConfiguration.setScalingConfigurationId(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].ScalingConfigurationId"));
			scalingConfiguration.setScalingConfigurationName(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].ScalingConfigurationName"));
			scalingConfiguration.setScalingGroupId(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].ScalingGroupId"));
			scalingConfiguration.setInstanceName(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InstanceName"));
			scalingConfiguration.setImageId(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].ImageId"));
			scalingConfiguration.setImageName(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].ImageName"));
			scalingConfiguration.setHostName(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].HostName"));
			scalingConfiguration.setInstanceType(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InstanceType"));
			scalingConfiguration.setCpu(_ctx.integerValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Cpu"));
			scalingConfiguration.setMemory(_ctx.integerValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Memory"));
			scalingConfiguration.setInstanceGeneration(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InstanceGeneration"));
			scalingConfiguration.setSecurityGroupId(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].SecurityGroupId"));
			scalingConfiguration.setIoOptimized(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].IoOptimized"));
			scalingConfiguration.setInternetChargeType(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InternetChargeType"));
			scalingConfiguration.setInternetMaxBandwidthIn(_ctx.integerValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InternetMaxBandwidthIn"));
			scalingConfiguration.setInternetMaxBandwidthOut(_ctx.integerValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InternetMaxBandwidthOut"));
			scalingConfiguration.setSystemDiskCategory(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].SystemDiskCategory"));
			scalingConfiguration.setSystemDiskSize(_ctx.integerValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].SystemDiskSize"));
			scalingConfiguration.setSystemDiskName(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].SystemDiskName"));
			scalingConfiguration.setSystemDiskDescription(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].SystemDiskDescription"));
			scalingConfiguration.setSystemDiskAutoSnapshotPolicyId(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].SystemDiskAutoSnapshotPolicyId"));
			scalingConfiguration.setLifecycleState(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].LifecycleState"));
			scalingConfiguration.setCreationTime(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].CreationTime"));
			scalingConfiguration.setLoadBalancerWeight(_ctx.integerValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].LoadBalancerWeight"));
			scalingConfiguration.setUserData(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].UserData"));
			scalingConfiguration.setKeyPairName(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].KeyPairName"));
			scalingConfiguration.setRamRoleName(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].RamRoleName"));
			scalingConfiguration.setDeploymentSetId(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].DeploymentSetId"));
			scalingConfiguration.setSecurityEnhancementStrategy(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].SecurityEnhancementStrategy"));
			scalingConfiguration.setSpotStrategy(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].SpotStrategy"));
			scalingConfiguration.setPasswordInherit(_ctx.booleanValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].PasswordInherit"));
			scalingConfiguration.setResourceGroupId(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].ResourceGroupId"));
			scalingConfiguration.setHpcClusterId(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].HpcClusterId"));
			scalingConfiguration.setInstanceDescription(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InstanceDescription"));
			scalingConfiguration.setIpv6AddressCount(_ctx.integerValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Ipv6AddressCount"));

			List<String> instanceTypes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InstanceTypes.Length"); j++) {
				instanceTypes.add(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InstanceTypes["+ j +"]"));
			}
			scalingConfiguration.setInstanceTypes(instanceTypes);

			List<String> securityGroupIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].SecurityGroupIds.Length"); j++) {
				securityGroupIds.add(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].SecurityGroupIds["+ j +"]"));
			}
			scalingConfiguration.setSecurityGroupIds(securityGroupIds);

			List<DataDisk> dataDisks = new ArrayList<DataDisk>();
			for (int j = 0; j < _ctx.lengthValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].DataDisks.Length"); j++) {
				DataDisk dataDisk = new DataDisk();
				dataDisk.setSize(_ctx.integerValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].DataDisks["+ j +"].Size"));
				dataDisk.setCategory(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].DataDisks["+ j +"].Category"));
				dataDisk.setSnapshotId(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].DataDisks["+ j +"].SnapshotId"));
				dataDisk.setDevice(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].DataDisks["+ j +"].Device"));
				dataDisk.setDeleteWithInstance(_ctx.booleanValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].DataDisks["+ j +"].DeleteWithInstance"));
				dataDisk.setEncrypted(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].DataDisks["+ j +"].Encrypted"));
				dataDisk.setKMSKeyId(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].DataDisks["+ j +"].KMSKeyId"));
				dataDisk.setDiskName(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].DataDisks["+ j +"].DiskName"));
				dataDisk.setDescription(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].DataDisks["+ j +"].Description"));
				dataDisk.setAutoSnapshotPolicyId(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].DataDisks["+ j +"].AutoSnapshotPolicyId"));

				dataDisks.add(dataDisk);
			}
			scalingConfiguration.setDataDisks(dataDisks);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Tags["+ j +"].Key"));
				tag.setValue(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Tags["+ j +"].Value"));

				tags.add(tag);
			}
			scalingConfiguration.setTags(tags);

			List<SpotPriceModel> spotPriceLimit = new ArrayList<SpotPriceModel>();
			for (int j = 0; j < _ctx.lengthValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].SpotPriceLimit.Length"); j++) {
				SpotPriceModel spotPriceModel = new SpotPriceModel();
				spotPriceModel.setInstanceType(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].SpotPriceLimit["+ j +"].InstanceType"));
				spotPriceModel.setPriceLimit(_ctx.floatValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].SpotPriceLimit["+ j +"].PriceLimit"));

				spotPriceLimit.add(spotPriceModel);
			}
			scalingConfiguration.setSpotPriceLimit(spotPriceLimit);

			scalingConfigurations.add(scalingConfiguration);
		}
		describeScalingConfigurationsResponse.setScalingConfigurations(scalingConfigurations);
	 
	 	return describeScalingConfigurationsResponse;
	}
}