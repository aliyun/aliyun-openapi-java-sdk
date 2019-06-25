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

	public static DescribeScalingConfigurationsResponse unmarshall(DescribeScalingConfigurationsResponse describeScalingConfigurationsResponse, UnmarshallerContext context) {
		
		describeScalingConfigurationsResponse.setRequestId(context.stringValue("DescribeScalingConfigurationsResponse.RequestId"));
		describeScalingConfigurationsResponse.setTotalCount(context.integerValue("DescribeScalingConfigurationsResponse.TotalCount"));
		describeScalingConfigurationsResponse.setPageNumber(context.integerValue("DescribeScalingConfigurationsResponse.PageNumber"));
		describeScalingConfigurationsResponse.setPageSize(context.integerValue("DescribeScalingConfigurationsResponse.PageSize"));

		List<ScalingConfiguration> scalingConfigurations = new ArrayList<ScalingConfiguration>();
		for (int i = 0; i < context.lengthValue("DescribeScalingConfigurationsResponse.ScalingConfigurations.Length"); i++) {
			ScalingConfiguration scalingConfiguration = new ScalingConfiguration();
			scalingConfiguration.setScalingConfigurationId(context.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].ScalingConfigurationId"));
			scalingConfiguration.setScalingConfigurationName(context.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].ScalingConfigurationName"));
			scalingConfiguration.setScalingGroupId(context.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].ScalingGroupId"));
			scalingConfiguration.setInstanceName(context.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InstanceName"));
			scalingConfiguration.setImageId(context.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].ImageId"));
			scalingConfiguration.setImageName(context.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].ImageName"));
			scalingConfiguration.setHostName(context.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].HostName"));
			scalingConfiguration.setInstanceType(context.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InstanceType"));
			scalingConfiguration.setCpu(context.integerValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Cpu"));
			scalingConfiguration.setMemory(context.integerValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Memory"));
			scalingConfiguration.setInstanceGeneration(context.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InstanceGeneration"));
			scalingConfiguration.setSecurityGroupId(context.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].SecurityGroupId"));
			scalingConfiguration.setIoOptimized(context.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].IoOptimized"));
			scalingConfiguration.setInternetChargeType(context.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InternetChargeType"));
			scalingConfiguration.setInternetMaxBandwidthIn(context.integerValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InternetMaxBandwidthIn"));
			scalingConfiguration.setInternetMaxBandwidthOut(context.integerValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InternetMaxBandwidthOut"));
			scalingConfiguration.setSystemDiskCategory(context.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].SystemDiskCategory"));
			scalingConfiguration.setSystemDiskSize(context.integerValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].SystemDiskSize"));
			scalingConfiguration.setSystemDiskName(context.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].SystemDiskName"));
			scalingConfiguration.setSystemDiskDescription(context.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].SystemDiskDescription"));
			scalingConfiguration.setLifecycleState(context.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].LifecycleState"));
			scalingConfiguration.setCreationTime(context.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].CreationTime"));
			scalingConfiguration.setLoadBalancerWeight(context.integerValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].LoadBalancerWeight"));
			scalingConfiguration.setUserData(context.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].UserData"));
			scalingConfiguration.setKeyPairName(context.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].KeyPairName"));
			scalingConfiguration.setRamRoleName(context.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].RamRoleName"));
			scalingConfiguration.setDeploymentSetId(context.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].DeploymentSetId"));
			scalingConfiguration.setSecurityEnhancementStrategy(context.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].SecurityEnhancementStrategy"));
			scalingConfiguration.setSpotStrategy(context.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].SpotStrategy"));
			scalingConfiguration.setPasswordInherit(context.booleanValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].PasswordInherit"));
			scalingConfiguration.setResourceGroupId(context.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].ResourceGroupId"));
			scalingConfiguration.setHpcClusterId(context.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].HpcClusterId"));
			scalingConfiguration.setInstanceDescription(context.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InstanceDescription"));

			List<String> instanceTypes = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InstanceTypes.Length"); j++) {
				instanceTypes.add(context.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InstanceTypes["+ j +"]"));
			}
			scalingConfiguration.setInstanceTypes(instanceTypes);

			List<String> securityGroupIds = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].SecurityGroupIds.Length"); j++) {
				securityGroupIds.add(context.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].SecurityGroupIds["+ j +"]"));
			}
			scalingConfiguration.setSecurityGroupIds(securityGroupIds);

			List<DataDisk> dataDisks = new ArrayList<DataDisk>();
			for (int j = 0; j < context.lengthValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].DataDisks.Length"); j++) {
				DataDisk dataDisk = new DataDisk();
				dataDisk.setSize(context.integerValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].DataDisks["+ j +"].Size"));
				dataDisk.setCategory(context.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].DataDisks["+ j +"].Category"));
				dataDisk.setSnapshotId(context.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].DataDisks["+ j +"].SnapshotId"));
				dataDisk.setDevice(context.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].DataDisks["+ j +"].Device"));
				dataDisk.setDeleteWithInstance(context.booleanValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].DataDisks["+ j +"].DeleteWithInstance"));
				dataDisk.setEncrypted(context.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].DataDisks["+ j +"].Encrypted"));
				dataDisk.setKMSKeyId(context.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].DataDisks["+ j +"].KMSKeyId"));
				dataDisk.setDiskName(context.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].DataDisks["+ j +"].DiskName"));
				dataDisk.setDescription(context.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].DataDisks["+ j +"].Description"));

				dataDisks.add(dataDisk);
			}
			scalingConfiguration.setDataDisks(dataDisks);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < context.lengthValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(context.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Tags["+ j +"].Key"));
				tag.setValue(context.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Tags["+ j +"].Value"));

				tags.add(tag);
			}
			scalingConfiguration.setTags(tags);

			List<SpotPriceModel> spotPriceLimit = new ArrayList<SpotPriceModel>();
			for (int j = 0; j < context.lengthValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].SpotPriceLimit.Length"); j++) {
				SpotPriceModel spotPriceModel = new SpotPriceModel();
				spotPriceModel.setInstanceType(context.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].SpotPriceLimit["+ j +"].InstanceType"));
				spotPriceModel.setPriceLimit(context.floatValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].SpotPriceLimit["+ j +"].PriceLimit"));

				spotPriceLimit.add(spotPriceModel);
			}
			scalingConfiguration.setSpotPriceLimit(spotPriceLimit);

			scalingConfigurations.add(scalingConfiguration);
		}
		describeScalingConfigurationsResponse.setScalingConfigurations(scalingConfigurations);
	 
	 	return describeScalingConfigurationsResponse;
	}
}