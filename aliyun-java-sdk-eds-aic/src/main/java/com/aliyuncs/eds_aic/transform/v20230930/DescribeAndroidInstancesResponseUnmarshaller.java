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

package com.aliyuncs.eds_aic.transform.v20230930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eds_aic.model.v20230930.DescribeAndroidInstancesResponse;
import com.aliyuncs.eds_aic.model.v20230930.DescribeAndroidInstancesResponse.Data;
import com.aliyuncs.eds_aic.model.v20230930.DescribeAndroidInstancesResponse.Data.AppManagePolicy;
import com.aliyuncs.eds_aic.model.v20230930.DescribeAndroidInstancesResponse.Data.BizTagsItem;
import com.aliyuncs.eds_aic.model.v20230930.DescribeAndroidInstancesResponse.Data.DisksItem;
import com.aliyuncs.eds_aic.model.v20230930.DescribeAndroidInstancesResponse.Data.DisplayConfig;
import com.aliyuncs.eds_aic.model.v20230930.DescribeAndroidInstancesResponse.Data.PhoneDataInfo;
import com.aliyuncs.eds_aic.model.v20230930.DescribeAndroidInstancesResponse.Data.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAndroidInstancesResponseUnmarshaller {

	public static DescribeAndroidInstancesResponse unmarshall(DescribeAndroidInstancesResponse describeAndroidInstancesResponse, UnmarshallerContext _ctx) {
		
		describeAndroidInstancesResponse.setRequestId(_ctx.stringValue("DescribeAndroidInstancesResponse.RequestId"));
		describeAndroidInstancesResponse.setTotalCount(_ctx.integerValue("DescribeAndroidInstancesResponse.TotalCount"));
		describeAndroidInstancesResponse.setNextToken(_ctx.stringValue("DescribeAndroidInstancesResponse.NextToken"));

		List<Data> instanceModel = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAndroidInstancesResponse.InstanceModel.Length"); i++) {
			Data data = new Data();
			data.setAndroidInstanceGroupId(_ctx.stringValue("DescribeAndroidInstancesResponse.InstanceModel["+ i +"].AndroidInstanceGroupId"));
			data.setAndroidInstanceGroupName(_ctx.stringValue("DescribeAndroidInstancesResponse.InstanceModel["+ i +"].AndroidInstanceGroupName"));
			data.setAndroidInstanceId(_ctx.stringValue("DescribeAndroidInstancesResponse.InstanceModel["+ i +"].AndroidInstanceId"));
			data.setAndroidInstanceName(_ctx.stringValue("DescribeAndroidInstancesResponse.InstanceModel["+ i +"].AndroidInstanceName"));
			data.setAndroidInstanceStatus(_ctx.stringValue("DescribeAndroidInstancesResponse.InstanceModel["+ i +"].AndroidInstanceStatus"));
			data.setNetworkInterfaceIp(_ctx.stringValue("DescribeAndroidInstancesResponse.InstanceModel["+ i +"].NetworkInterfaceIp"));
			data.setInstalledAppList(_ctx.stringValue("DescribeAndroidInstancesResponse.InstanceModel["+ i +"].InstalledAppList"));
			data.setAuthorizedUserId(_ctx.stringValue("DescribeAndroidInstancesResponse.InstanceModel["+ i +"].AuthorizedUserId"));
			data.setBindUserId(_ctx.stringValue("DescribeAndroidInstancesResponse.InstanceModel["+ i +"].BindUserId"));
			data.setPersistentAppInstanceId(_ctx.stringValue("DescribeAndroidInstancesResponse.InstanceModel["+ i +"].PersistentAppInstanceId"));
			data.setAppInstanceId(_ctx.stringValue("DescribeAndroidInstancesResponse.InstanceModel["+ i +"].AppInstanceId"));
			data.setKeyPairId(_ctx.stringValue("DescribeAndroidInstancesResponse.InstanceModel["+ i +"].KeyPairId"));
			data.setGmtCreate(_ctx.stringValue("DescribeAndroidInstancesResponse.InstanceModel["+ i +"].GmtCreate"));
			data.setGmtModified(_ctx.stringValue("DescribeAndroidInstancesResponse.InstanceModel["+ i +"].GmtModified"));
			data.setAppInstanceGroupId(_ctx.stringValue("DescribeAndroidInstancesResponse.InstanceModel["+ i +"].AppInstanceGroupId"));
			data.setRegionId(_ctx.stringValue("DescribeAndroidInstancesResponse.InstanceModel["+ i +"].RegionId"));
			data.setRate(_ctx.integerValue("DescribeAndroidInstancesResponse.InstanceModel["+ i +"].Rate"));
			data.setErrorCode(_ctx.stringValue("DescribeAndroidInstancesResponse.InstanceModel["+ i +"].ErrorCode"));
			data.setRenderingType(_ctx.stringValue("DescribeAndroidInstancesResponse.InstanceModel["+ i +"].RenderingType"));
			data.setInstanceType(_ctx.stringValue("DescribeAndroidInstancesResponse.InstanceModel["+ i +"].InstanceType"));
			data.setChargeType(_ctx.stringValue("DescribeAndroidInstancesResponse.InstanceModel["+ i +"].ChargeType"));
			data.setGmtExpired(_ctx.stringValue("DescribeAndroidInstancesResponse.InstanceModel["+ i +"].GmtExpired"));
			data.setPolicyGroupId(_ctx.stringValue("DescribeAndroidInstancesResponse.InstanceModel["+ i +"].PolicyGroupId"));
			data.setOfficeSiteId(_ctx.stringValue("DescribeAndroidInstancesResponse.InstanceModel["+ i +"].OfficeSiteId"));
			data.setVSwitchId(_ctx.stringValue("DescribeAndroidInstancesResponse.InstanceModel["+ i +"].VSwitchId"));
			data.setMemory(_ctx.integerValue("DescribeAndroidInstancesResponse.InstanceModel["+ i +"].Memory"));
			data.setCpu(_ctx.stringValue("DescribeAndroidInstancesResponse.InstanceModel["+ i +"].Cpu"));
			data.setImageVersion(_ctx.stringValue("DescribeAndroidInstancesResponse.InstanceModel["+ i +"].ImageVersion"));
			data.setPublicIpAddress(_ctx.stringValue("DescribeAndroidInstancesResponse.InstanceModel["+ i +"].PublicIpAddress"));
			data.setSessionStatus(_ctx.stringValue("DescribeAndroidInstancesResponse.InstanceModel["+ i +"].SessionStatus"));
			data.setNetworkInterfaceIpv6Address(_ctx.stringValue("DescribeAndroidInstancesResponse.InstanceModel["+ i +"].NetworkInterfaceIpv6Address"));
			data.setPublicIpv6Address(_ctx.stringValue("DescribeAndroidInstancesResponse.InstanceModel["+ i +"].PublicIpv6Address"));
			data.setImageId(_ctx.stringValue("DescribeAndroidInstancesResponse.InstanceModel["+ i +"].ImageId"));
			data.setQosRuleId(_ctx.stringValue("DescribeAndroidInstancesResponse.InstanceModel["+ i +"].QosRuleId"));
			data.setZoneId(_ctx.stringValue("DescribeAndroidInstancesResponse.InstanceModel["+ i +"].ZoneId"));
			data.setStreamMode(_ctx.integerValue("DescribeAndroidInstancesResponse.InstanceModel["+ i +"].StreamMode"));
			data.setNetworkType(_ctx.stringValue("DescribeAndroidInstancesResponse.InstanceModel["+ i +"].NetworkType"));
			data.setBandwidthPackageType(_ctx.stringValue("DescribeAndroidInstancesResponse.InstanceModel["+ i +"].BandwidthPackageType"));
			data.setBandwidthPackageId(_ctx.stringValue("DescribeAndroidInstancesResponse.InstanceModel["+ i +"].BandwidthPackageId"));
			data.setUpBandwidthLimit(_ctx.integerValue("DescribeAndroidInstancesResponse.InstanceModel["+ i +"].UpBandwidthLimit"));
			data.setDownBandwidthLimit(_ctx.integerValue("DescribeAndroidInstancesResponse.InstanceModel["+ i +"].DownBandwidthLimit"));
			data.setServerType(_ctx.stringValue("DescribeAndroidInstancesResponse.InstanceModel["+ i +"].ServerType"));

			DisplayConfig displayConfig = new DisplayConfig();
			displayConfig.setResolutionHeight(_ctx.integerValue("DescribeAndroidInstancesResponse.InstanceModel["+ i +"].DisplayConfig.ResolutionHeight"));
			displayConfig.setResolutionWidth(_ctx.integerValue("DescribeAndroidInstancesResponse.InstanceModel["+ i +"].DisplayConfig.ResolutionWidth"));
			displayConfig.setDpi(_ctx.integerValue("DescribeAndroidInstancesResponse.InstanceModel["+ i +"].DisplayConfig.Dpi"));
			displayConfig.setFps(_ctx.integerValue("DescribeAndroidInstancesResponse.InstanceModel["+ i +"].DisplayConfig.Fps"));
			displayConfig.setLockResolution(_ctx.stringValue("DescribeAndroidInstancesResponse.InstanceModel["+ i +"].DisplayConfig.LockResolution"));
			data.setDisplayConfig(displayConfig);

			AppManagePolicy appManagePolicy = new AppManagePolicy();
			appManagePolicy.setAppManagePolicyId(_ctx.stringValue("DescribeAndroidInstancesResponse.InstanceModel["+ i +"].AppManagePolicy.AppManagePolicyId"));
			appManagePolicy.setAppManagePolicyName(_ctx.stringValue("DescribeAndroidInstancesResponse.InstanceModel["+ i +"].AppManagePolicy.AppManagePolicyName"));
			data.setAppManagePolicy(appManagePolicy);

			PhoneDataInfo phoneDataInfo = new PhoneDataInfo();
			phoneDataInfo.setPhoneDataId(_ctx.stringValue("DescribeAndroidInstancesResponse.InstanceModel["+ i +"].PhoneDataInfo.PhoneDataId"));
			phoneDataInfo.setPhoneDataVolume(_ctx.integerValue("DescribeAndroidInstancesResponse.InstanceModel["+ i +"].PhoneDataInfo.PhoneDataVolume"));
			data.setPhoneDataInfo(phoneDataInfo);

			List<DisksItem> disks = new ArrayList<DisksItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAndroidInstancesResponse.InstanceModel["+ i +"].Disks.Length"); j++) {
				DisksItem disksItem = new DisksItem();
				disksItem.setDiskType(_ctx.stringValue("DescribeAndroidInstancesResponse.InstanceModel["+ i +"].Disks["+ j +"].DiskType"));
				disksItem.setDiskSize(_ctx.integerValue("DescribeAndroidInstancesResponse.InstanceModel["+ i +"].Disks["+ j +"].DiskSize"));

				disks.add(disksItem);
			}
			data.setDisks(disks);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAndroidInstancesResponse.InstanceModel["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(_ctx.stringValue("DescribeAndroidInstancesResponse.InstanceModel["+ i +"].Tags["+ j +"].Key"));
				tag.setValue(_ctx.stringValue("DescribeAndroidInstancesResponse.InstanceModel["+ i +"].Tags["+ j +"].Value"));

				tags.add(tag);
			}
			data.setTags(tags);

			List<BizTagsItem> bizTags = new ArrayList<BizTagsItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAndroidInstancesResponse.InstanceModel["+ i +"].BizTags.Length"); j++) {
				BizTagsItem bizTagsItem = new BizTagsItem();
				bizTagsItem.setValue(_ctx.stringValue("DescribeAndroidInstancesResponse.InstanceModel["+ i +"].BizTags["+ j +"].Value"));
				bizTagsItem.setKey(_ctx.stringValue("DescribeAndroidInstancesResponse.InstanceModel["+ i +"].BizTags["+ j +"].Key"));

				bizTags.add(bizTagsItem);
			}
			data.setBizTags(bizTags);

			instanceModel.add(data);
		}
		describeAndroidInstancesResponse.setInstanceModel(instanceModel);
	 
	 	return describeAndroidInstancesResponse;
	}
}