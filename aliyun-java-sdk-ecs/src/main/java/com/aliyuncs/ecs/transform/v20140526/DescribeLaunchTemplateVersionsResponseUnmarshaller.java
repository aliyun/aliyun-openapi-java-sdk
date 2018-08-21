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

import com.aliyuncs.ecs.model.v20140526.DescribeLaunchTemplateVersionsResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSet;
import com.aliyuncs.ecs.model.v20140526.DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSet.LaunchTemplateData;
import com.aliyuncs.ecs.model.v20140526.DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSet.LaunchTemplateData.DataDisk;
import com.aliyuncs.ecs.model.v20140526.DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSet.LaunchTemplateData.InstanceTag;
import com.aliyuncs.ecs.model.v20140526.DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSet.LaunchTemplateData.NetworkInterface;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLaunchTemplateVersionsResponseUnmarshaller {

	public static DescribeLaunchTemplateVersionsResponse unmarshall(DescribeLaunchTemplateVersionsResponse describeLaunchTemplateVersionsResponse, UnmarshallerContext context) {
		
		describeLaunchTemplateVersionsResponse.setRequestId(context.stringValue("DescribeLaunchTemplateVersionsResponse.RequestId"));
		describeLaunchTemplateVersionsResponse.setTotalCount(context.integerValue("DescribeLaunchTemplateVersionsResponse.TotalCount"));
		describeLaunchTemplateVersionsResponse.setPageNumber(context.integerValue("DescribeLaunchTemplateVersionsResponse.PageNumber"));
		describeLaunchTemplateVersionsResponse.setPageSize(context.integerValue("DescribeLaunchTemplateVersionsResponse.PageSize"));

		List<LaunchTemplateVersionSet> launchTemplateVersionSets = new ArrayList<LaunchTemplateVersionSet>();
		for (int i = 0; i < context.lengthValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets.Length"); i++) {
			LaunchTemplateVersionSet launchTemplateVersionSet = new LaunchTemplateVersionSet();
			launchTemplateVersionSet.setCreateTime(context.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].CreateTime"));
			launchTemplateVersionSet.setModifiedTime(context.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].ModifiedTime"));
			launchTemplateVersionSet.setLaunchTemplateId(context.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateId"));
			launchTemplateVersionSet.setLaunchTemplateName(context.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateName"));
			launchTemplateVersionSet.setDefaultVersion(context.booleanValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].DefaultVersion"));
			launchTemplateVersionSet.setVersionNumber(context.longValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].VersionNumber"));
			launchTemplateVersionSet.setVersionDescription(context.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].VersionDescription"));
			launchTemplateVersionSet.setCreatedBy(context.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].CreatedBy"));

			LaunchTemplateData launchTemplateData = new LaunchTemplateData();
			launchTemplateData.setImageId(context.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.ImageId"));
			launchTemplateData.setImageOwnerAlias(context.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.ImageOwnerAlias"));
			launchTemplateData.setInstanceType(context.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.InstanceType"));
			launchTemplateData.setSecurityGroupId(context.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.SecurityGroupId"));
			launchTemplateData.setVpcId(context.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.VpcId"));
			launchTemplateData.setVSwitchId(context.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.VSwitchId"));
			launchTemplateData.setInstanceName(context.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.InstanceName"));
			launchTemplateData.setDescription(context.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.Description"));
			launchTemplateData.setInternetMaxBandwidthIn(context.integerValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.InternetMaxBandwidthIn"));
			launchTemplateData.setInternetMaxBandwidthOut(context.integerValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.InternetMaxBandwidthOut"));
			launchTemplateData.setHostName(context.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.HostName"));
			launchTemplateData.setZoneId(context.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.ZoneId"));
			launchTemplateData.setSystemDiskSize(context.integerValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.SystemDisk.Size"));
			launchTemplateData.setSystemDiskCategory(context.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.SystemDisk.Category"));
			launchTemplateData.setSystemDiskDiskName(context.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.SystemDisk.DiskName"));
			launchTemplateData.setSystemDiskDescription(context.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.SystemDisk.Description"));
			launchTemplateData.setSystemDiskIops(context.integerValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.SystemDisk.Iops"));
			launchTemplateData.setIoOptimized(context.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.IoOptimized"));
			launchTemplateData.setInstanceChargeType(context.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.InstanceChargeType"));
			launchTemplateData.setPeriod(context.integerValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.Period"));
			launchTemplateData.setInternetChargeType(context.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.InternetChargeType"));
			launchTemplateData.setEnableVmOsConfig(context.booleanValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.EnableVmOsConfig"));
			launchTemplateData.setNetworkType(context.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.NetworkType"));
			launchTemplateData.setUserData(context.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.UserData"));
			launchTemplateData.setKeyPairName(context.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.KeyPairName"));
			launchTemplateData.setRamRoleName(context.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.RamRoleName"));
			launchTemplateData.setAutoReleaseTime(context.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.AutoReleaseTime"));
			launchTemplateData.setSpotStrategy(context.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.SpotStrategy"));
			launchTemplateData.setSpotPriceLimit(context.floatValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.SpotPriceLimit"));
			launchTemplateData.setSpotDuration(context.integerValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.SpotDuration"));
			launchTemplateData.setResourceGroupId(context.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.ResourceGroupId"));
			launchTemplateData.setSecurityEnhancementStrategy(context.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.SecurityEnhancementStrategy"));

			List<DataDisk> dataDisks = new ArrayList<DataDisk>();
			for (int j = 0; j < context.lengthValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.DataDisks.Length"); j++) {
				DataDisk dataDisk = new DataDisk();
				dataDisk.setSize(context.integerValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.DataDisks["+ j +"].Size"));
				dataDisk.setSnapshotId(context.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.DataDisks["+ j +"].SnapshotId"));
				dataDisk.setCategory(context.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.DataDisks["+ j +"].Category"));
				dataDisk.setEncrypted(context.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.DataDisks["+ j +"].Encrypted"));
				dataDisk.setDiskName(context.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.DataDisks["+ j +"].DiskName"));
				dataDisk.setDescription(context.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.DataDisks["+ j +"].Description"));
				dataDisk.setDeleteWithInstance(context.booleanValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.DataDisks["+ j +"].DeleteWithInstance"));

				dataDisks.add(dataDisk);
			}
			launchTemplateData.setDataDisks(dataDisks);

			List<NetworkInterface> networkInterfaces = new ArrayList<NetworkInterface>();
			for (int j = 0; j < context.lengthValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.NetworkInterfaces.Length"); j++) {
				NetworkInterface networkInterface = new NetworkInterface();
				networkInterface.setPrimaryIpAddress(context.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.NetworkInterfaces["+ j +"].PrimaryIpAddress"));
				networkInterface.setVSwitchId(context.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.NetworkInterfaces["+ j +"].VSwitchId"));
				networkInterface.setSecurityGroupId(context.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.NetworkInterfaces["+ j +"].SecurityGroupId"));
				networkInterface.setNetworkInterfaceName(context.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.NetworkInterfaces["+ j +"].NetworkInterfaceName"));
				networkInterface.setDescription(context.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.NetworkInterfaces["+ j +"].Description"));

				networkInterfaces.add(networkInterface);
			}
			launchTemplateData.setNetworkInterfaces(networkInterfaces);

			List<InstanceTag> tags = new ArrayList<InstanceTag>();
			for (int j = 0; j < context.lengthValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.Tags.Length"); j++) {
				InstanceTag instanceTag = new InstanceTag();
				instanceTag.setKey(context.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.Tags["+ j +"].Key"));
				instanceTag.setValue(context.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.Tags["+ j +"].Value"));

				tags.add(instanceTag);
			}
			launchTemplateData.setTags(tags);
			launchTemplateVersionSet.setLaunchTemplateData(launchTemplateData);

			launchTemplateVersionSets.add(launchTemplateVersionSet);
		}
		describeLaunchTemplateVersionsResponse.setLaunchTemplateVersionSets(launchTemplateVersionSets);
	 
	 	return describeLaunchTemplateVersionsResponse;
	}
}