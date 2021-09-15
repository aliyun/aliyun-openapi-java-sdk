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
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLaunchTemplateVersionsResponseUnmarshaller {

	public static DescribeLaunchTemplateVersionsResponse unmarshall(DescribeLaunchTemplateVersionsResponse describeLaunchTemplateVersionsResponse, UnmarshallerContext _ctx) {
		
		describeLaunchTemplateVersionsResponse.setRequestId(_ctx.stringValue("DescribeLaunchTemplateVersionsResponse.RequestId"));
		describeLaunchTemplateVersionsResponse.setPageSize(_ctx.integerValue("DescribeLaunchTemplateVersionsResponse.PageSize"));
		describeLaunchTemplateVersionsResponse.setPageNumber(_ctx.integerValue("DescribeLaunchTemplateVersionsResponse.PageNumber"));
		describeLaunchTemplateVersionsResponse.setTotalCount(_ctx.integerValue("DescribeLaunchTemplateVersionsResponse.TotalCount"));

		List<LaunchTemplateVersionSet> launchTemplateVersionSets = new ArrayList<LaunchTemplateVersionSet>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets.Length"); i++) {
			LaunchTemplateVersionSet launchTemplateVersionSet = new LaunchTemplateVersionSet();
			launchTemplateVersionSet.setLaunchTemplateName(_ctx.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateName"));
			launchTemplateVersionSet.setDefaultVersion(_ctx.booleanValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].DefaultVersion"));
			launchTemplateVersionSet.setVersionNumber(_ctx.longValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].VersionNumber"));
			launchTemplateVersionSet.setModifiedTime(_ctx.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].ModifiedTime"));
			launchTemplateVersionSet.setLaunchTemplateId(_ctx.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateId"));
			launchTemplateVersionSet.setCreateTime(_ctx.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].CreateTime"));
			launchTemplateVersionSet.setCreatedBy(_ctx.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].CreatedBy"));
			launchTemplateVersionSet.setVersionDescription(_ctx.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].VersionDescription"));

			LaunchTemplateData launchTemplateData = new LaunchTemplateData();
			launchTemplateData.setDeploymentSetId(_ctx.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.DeploymentSetId"));
			launchTemplateData.setVpcId(_ctx.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.VpcId"));
			launchTemplateData.setSystemDiskPerformanceLevel(_ctx.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.SystemDisk.PerformanceLevel"));
			launchTemplateData.setKeyPairName(_ctx.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.KeyPairName"));
			launchTemplateData.setSecurityGroupId(_ctx.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.SecurityGroupId"));
			launchTemplateData.setNetworkType(_ctx.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.NetworkType"));
			launchTemplateData.setSpotStrategy(_ctx.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.SpotStrategy"));
			launchTemplateData.setEnableVmOsConfig(_ctx.booleanValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.EnableVmOsConfig"));
			launchTemplateData.setDescription(_ctx.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.Description"));
			launchTemplateData.setSpotDuration(_ctx.integerValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.SpotDuration"));
			launchTemplateData.setInstanceName(_ctx.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.InstanceName"));
			launchTemplateData.setSecurityEnhancementStrategy(_ctx.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.SecurityEnhancementStrategy"));
			launchTemplateData.setUserData(_ctx.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.UserData"));
			launchTemplateData.setSystemDiskDiskName(_ctx.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.SystemDisk.DiskName"));
			launchTemplateData.setSystemDiskSize(_ctx.integerValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.SystemDisk.Size"));
			launchTemplateData.setSpotPriceLimit(_ctx.floatValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.SpotPriceLimit"));
			launchTemplateData.setPasswordInherit(_ctx.booleanValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.PasswordInherit"));
			launchTemplateData.setPrivateIpAddress(_ctx.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.PrivateIpAddress"));
			launchTemplateData.setImageId(_ctx.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.ImageId"));
			launchTemplateData.setSystemDiskDeleteWithInstance(_ctx.booleanValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.SystemDisk.DeleteWithInstance"));
			launchTemplateData.setSystemDiskCategory(_ctx.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.SystemDisk.Category"));
			launchTemplateData.setAutoReleaseTime(_ctx.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.AutoReleaseTime"));
			launchTemplateData.setSystemDiskDescription(_ctx.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.SystemDisk.Description"));
			launchTemplateData.setImageOwnerAlias(_ctx.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.ImageOwnerAlias"));
			launchTemplateData.setHostName(_ctx.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.HostName"));
			launchTemplateData.setSystemDiskIops(_ctx.integerValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.SystemDisk.Iops"));
			launchTemplateData.setInternetMaxBandwidthOut(_ctx.integerValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.InternetMaxBandwidthOut"));
			launchTemplateData.setInternetMaxBandwidthIn(_ctx.integerValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.InternetMaxBandwidthIn"));
			launchTemplateData.setInstanceType(_ctx.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.InstanceType"));
			launchTemplateData.setPeriod(_ctx.integerValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.Period"));
			launchTemplateData.setInstanceChargeType(_ctx.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.InstanceChargeType"));
			launchTemplateData.setIoOptimized(_ctx.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.IoOptimized"));
			launchTemplateData.setRamRoleName(_ctx.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.RamRoleName"));
			launchTemplateData.setVSwitchId(_ctx.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.VSwitchId"));
			launchTemplateData.setResourceGroupId(_ctx.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.ResourceGroupId"));
			launchTemplateData.setInternetChargeType(_ctx.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.InternetChargeType"));
			launchTemplateData.setZoneId(_ctx.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.ZoneId"));

			List<String> securityGroupIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.SecurityGroupIds.Length"); j++) {
				securityGroupIds.add(_ctx.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.SecurityGroupIds["+ j +"]"));
			}
			launchTemplateData.setSecurityGroupIds(securityGroupIds);

			List<DataDisk> dataDisks = new ArrayList<DataDisk>();
			for (int j = 0; j < _ctx.lengthValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.DataDisks.Length"); j++) {
				DataDisk dataDisk = new DataDisk();
				dataDisk.setPerformanceLevel(_ctx.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.DataDisks["+ j +"].PerformanceLevel"));
				dataDisk.setDescription(_ctx.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.DataDisks["+ j +"].Description"));
				dataDisk.setSnapshotId(_ctx.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.DataDisks["+ j +"].SnapshotId"));
				dataDisk.setDevice(_ctx.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.DataDisks["+ j +"].Device"));
				dataDisk.setSize(_ctx.integerValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.DataDisks["+ j +"].Size"));
				dataDisk.setDiskName(_ctx.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.DataDisks["+ j +"].DiskName"));
				dataDisk.setCategory(_ctx.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.DataDisks["+ j +"].Category"));
				dataDisk.setDeleteWithInstance(_ctx.booleanValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.DataDisks["+ j +"].DeleteWithInstance"));
				dataDisk.setEncrypted(_ctx.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.DataDisks["+ j +"].Encrypted"));

				dataDisks.add(dataDisk);
			}
			launchTemplateData.setDataDisks(dataDisks);

			List<NetworkInterface> networkInterfaces = new ArrayList<NetworkInterface>();
			for (int j = 0; j < _ctx.lengthValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.NetworkInterfaces.Length"); j++) {
				NetworkInterface networkInterface = new NetworkInterface();
				networkInterface.setNetworkInterfaceName(_ctx.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.NetworkInterfaces["+ j +"].NetworkInterfaceName"));
				networkInterface.setVSwitchId(_ctx.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.NetworkInterfaces["+ j +"].VSwitchId"));
				networkInterface.setDescription(_ctx.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.NetworkInterfaces["+ j +"].Description"));
				networkInterface.setPrimaryIpAddress(_ctx.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.NetworkInterfaces["+ j +"].PrimaryIpAddress"));
				networkInterface.setSecurityGroupId(_ctx.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.NetworkInterfaces["+ j +"].SecurityGroupId"));

				List<String> securityGroupIds1 = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.NetworkInterfaces["+ j +"].SecurityGroupIds.Length"); k++) {
					securityGroupIds1.add(_ctx.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.NetworkInterfaces["+ j +"].SecurityGroupIds["+ k +"]"));
				}
				networkInterface.setSecurityGroupIds1(securityGroupIds1);

				networkInterfaces.add(networkInterface);
			}
			launchTemplateData.setNetworkInterfaces(networkInterfaces);

			List<InstanceTag> tags = new ArrayList<InstanceTag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.Tags.Length"); j++) {
				InstanceTag instanceTag = new InstanceTag();
				instanceTag.setKey(_ctx.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.Tags["+ j +"].Key"));
				instanceTag.setValue(_ctx.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.Tags["+ j +"].Value"));

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