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
		describeLaunchTemplateVersionsResponse.setTotalCount(_ctx.integerValue("DescribeLaunchTemplateVersionsResponse.TotalCount"));
		describeLaunchTemplateVersionsResponse.setPageNumber(_ctx.integerValue("DescribeLaunchTemplateVersionsResponse.PageNumber"));
		describeLaunchTemplateVersionsResponse.setPageSize(_ctx.integerValue("DescribeLaunchTemplateVersionsResponse.PageSize"));

		List<LaunchTemplateVersionSet> launchTemplateVersionSets = new ArrayList<LaunchTemplateVersionSet>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets.Length"); i++) {
			LaunchTemplateVersionSet launchTemplateVersionSet = new LaunchTemplateVersionSet();
			launchTemplateVersionSet.setCreateTime(_ctx.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].CreateTime"));
			launchTemplateVersionSet.setModifiedTime(_ctx.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].ModifiedTime"));
			launchTemplateVersionSet.setLaunchTemplateId(_ctx.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateId"));
			launchTemplateVersionSet.setLaunchTemplateName(_ctx.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateName"));
			launchTemplateVersionSet.setDefaultVersion(_ctx.booleanValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].DefaultVersion"));
			launchTemplateVersionSet.setVersionNumber(_ctx.longValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].VersionNumber"));
			launchTemplateVersionSet.setVersionDescription(_ctx.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].VersionDescription"));
			launchTemplateVersionSet.setCreatedBy(_ctx.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].CreatedBy"));

			LaunchTemplateData launchTemplateData = new LaunchTemplateData();
			launchTemplateData.setImageId(_ctx.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.ImageId"));
			launchTemplateData.setImageOwnerAlias(_ctx.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.ImageOwnerAlias"));
			launchTemplateData.setPasswordInherit(_ctx.booleanValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.PasswordInherit"));
			launchTemplateData.setInstanceType(_ctx.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.InstanceType"));
			launchTemplateData.setSecurityGroupId(_ctx.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.SecurityGroupId"));
			launchTemplateData.setVpcId(_ctx.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.VpcId"));
			launchTemplateData.setVSwitchId(_ctx.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.VSwitchId"));
			launchTemplateData.setInstanceName(_ctx.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.InstanceName"));
			launchTemplateData.setDescription(_ctx.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.Description"));
			launchTemplateData.setInternetMaxBandwidthIn(_ctx.integerValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.InternetMaxBandwidthIn"));
			launchTemplateData.setInternetMaxBandwidthOut(_ctx.integerValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.InternetMaxBandwidthOut"));
			launchTemplateData.setHostName(_ctx.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.HostName"));
			launchTemplateData.setZoneId(_ctx.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.ZoneId"));
			launchTemplateData.setSystemDiskSize(_ctx.integerValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.SystemDisk.Size"));
			launchTemplateData.setSystemDiskCategory(_ctx.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.SystemDisk.Category"));
			launchTemplateData.setSystemDiskDiskName(_ctx.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.SystemDisk.DiskName"));
			launchTemplateData.setSystemDiskDescription(_ctx.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.SystemDisk.Description"));
			launchTemplateData.setSystemDiskIops(_ctx.integerValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.SystemDisk.Iops"));
			launchTemplateData.setIoOptimized(_ctx.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.IoOptimized"));
			launchTemplateData.setInstanceChargeType(_ctx.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.InstanceChargeType"));
			launchTemplateData.setPeriod(_ctx.integerValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.Period"));
			launchTemplateData.setInternetChargeType(_ctx.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.InternetChargeType"));
			launchTemplateData.setEnableVmOsConfig(_ctx.booleanValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.EnableVmOsConfig"));
			launchTemplateData.setNetworkType(_ctx.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.NetworkType"));
			launchTemplateData.setUserData(_ctx.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.UserData"));
			launchTemplateData.setKeyPairName(_ctx.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.KeyPairName"));
			launchTemplateData.setRamRoleName(_ctx.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.RamRoleName"));
			launchTemplateData.setAutoReleaseTime(_ctx.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.AutoReleaseTime"));
			launchTemplateData.setSpotStrategy(_ctx.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.SpotStrategy"));
			launchTemplateData.setSpotPriceLimit(_ctx.floatValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.SpotPriceLimit"));
			launchTemplateData.setSpotDuration(_ctx.integerValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.SpotDuration"));
			launchTemplateData.setResourceGroupId(_ctx.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.ResourceGroupId"));
			launchTemplateData.setSecurityEnhancementStrategy(_ctx.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.SecurityEnhancementStrategy"));

			List<DataDisk> dataDisks = new ArrayList<DataDisk>();
			for (int j = 0; j < _ctx.lengthValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.DataDisks.Length"); j++) {
				DataDisk dataDisk = new DataDisk();
				dataDisk.setSize(_ctx.integerValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.DataDisks["+ j +"].Size"));
				dataDisk.setSnapshotId(_ctx.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.DataDisks["+ j +"].SnapshotId"));
				dataDisk.setCategory(_ctx.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.DataDisks["+ j +"].Category"));
				dataDisk.setEncrypted(_ctx.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.DataDisks["+ j +"].Encrypted"));
				dataDisk.setDiskName(_ctx.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.DataDisks["+ j +"].DiskName"));
				dataDisk.setDescription(_ctx.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.DataDisks["+ j +"].Description"));
				dataDisk.setDeleteWithInstance(_ctx.booleanValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.DataDisks["+ j +"].DeleteWithInstance"));
				dataDisk.setDevice(_ctx.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.DataDisks["+ j +"].Device"));

				dataDisks.add(dataDisk);
			}
			launchTemplateData.setDataDisks(dataDisks);

			List<NetworkInterface> networkInterfaces = new ArrayList<NetworkInterface>();
			for (int j = 0; j < _ctx.lengthValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.NetworkInterfaces.Length"); j++) {
				NetworkInterface networkInterface = new NetworkInterface();
				networkInterface.setPrimaryIpAddress(_ctx.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.NetworkInterfaces["+ j +"].PrimaryIpAddress"));
				networkInterface.setVSwitchId(_ctx.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.NetworkInterfaces["+ j +"].VSwitchId"));
				networkInterface.setSecurityGroupId(_ctx.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.NetworkInterfaces["+ j +"].SecurityGroupId"));
				networkInterface.setNetworkInterfaceName(_ctx.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.NetworkInterfaces["+ j +"].NetworkInterfaceName"));
				networkInterface.setDescription(_ctx.stringValue("DescribeLaunchTemplateVersionsResponse.LaunchTemplateVersionSets["+ i +"].LaunchTemplateData.NetworkInterfaces["+ j +"].Description"));

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