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

package com.aliyuncs.hbase.transform.v20190101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hbase.model.v20190101.DescribeInstanceResponse;
import com.aliyuncs.hbase.model.v20190101.DescribeInstanceResponse.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceResponseUnmarshaller {

	public static DescribeInstanceResponse unmarshall(DescribeInstanceResponse describeInstanceResponse, UnmarshallerContext _ctx) {
		
		describeInstanceResponse.setRequestId(_ctx.stringValue("DescribeInstanceResponse.RequestId"));
		describeInstanceResponse.setVpcId(_ctx.stringValue("DescribeInstanceResponse.VpcId"));
		describeInstanceResponse.setStatus(_ctx.stringValue("DescribeInstanceResponse.Status"));
		describeInstanceResponse.setEncryptionType(_ctx.stringValue("DescribeInstanceResponse.EncryptionType"));
		describeInstanceResponse.setModuleId(_ctx.integerValue("DescribeInstanceResponse.ModuleId"));
		describeInstanceResponse.setVswitchId(_ctx.stringValue("DescribeInstanceResponse.VswitchId"));
		describeInstanceResponse.setBackupStatus(_ctx.stringValue("DescribeInstanceResponse.BackupStatus"));
		describeInstanceResponse.setPayType(_ctx.stringValue("DescribeInstanceResponse.PayType"));
		describeInstanceResponse.setCoreDiskType(_ctx.stringValue("DescribeInstanceResponse.CoreDiskType"));
		describeInstanceResponse.setMasterNodeCount(_ctx.integerValue("DescribeInstanceResponse.MasterNodeCount"));
		describeInstanceResponse.setNetworkType(_ctx.stringValue("DescribeInstanceResponse.NetworkType"));
		describeInstanceResponse.setCreatedTimeUTC(_ctx.stringValue("DescribeInstanceResponse.CreatedTimeUTC"));
		describeInstanceResponse.setColdStorageSize(_ctx.integerValue("DescribeInstanceResponse.ColdStorageSize"));
		describeInstanceResponse.setParentId(_ctx.stringValue("DescribeInstanceResponse.ParentId"));
		describeInstanceResponse.setIsLatestVersion(_ctx.booleanValue("DescribeInstanceResponse.IsLatestVersion"));
		describeInstanceResponse.setExpireTimeUTC(_ctx.stringValue("DescribeInstanceResponse.ExpireTimeUTC"));
		describeInstanceResponse.setInstanceName(_ctx.stringValue("DescribeInstanceResponse.InstanceName"));
		describeInstanceResponse.setMasterInstanceType(_ctx.stringValue("DescribeInstanceResponse.MasterInstanceType"));
		describeInstanceResponse.setCoreInstanceType(_ctx.stringValue("DescribeInstanceResponse.CoreInstanceType"));
		describeInstanceResponse.setEncryptionKey(_ctx.stringValue("DescribeInstanceResponse.EncryptionKey"));
		describeInstanceResponse.setCreatedTime(_ctx.stringValue("DescribeInstanceResponse.CreatedTime"));
		describeInstanceResponse.setCoreDiskSize(_ctx.integerValue("DescribeInstanceResponse.CoreDiskSize"));
		describeInstanceResponse.setClusterId(_ctx.stringValue("DescribeInstanceResponse.ClusterId"));
		describeInstanceResponse.setExpireTime(_ctx.stringValue("DescribeInstanceResponse.ExpireTime"));
		describeInstanceResponse.setMaintainStartTime(_ctx.stringValue("DescribeInstanceResponse.MaintainStartTime"));
		describeInstanceResponse.setConfirmMaintainTime(_ctx.stringValue("DescribeInstanceResponse.ConfirmMaintainTime"));
		describeInstanceResponse.setIsHa(_ctx.booleanValue("DescribeInstanceResponse.IsHa"));
		describeInstanceResponse.setMaintainEndTime(_ctx.stringValue("DescribeInstanceResponse.MaintainEndTime"));
		describeInstanceResponse.setInstanceId(_ctx.stringValue("DescribeInstanceResponse.InstanceId"));
		describeInstanceResponse.setColdStorageStatus(_ctx.stringValue("DescribeInstanceResponse.ColdStorageStatus"));
		describeInstanceResponse.setIsDeletionProtection(_ctx.booleanValue("DescribeInstanceResponse.IsDeletionProtection"));
		describeInstanceResponse.setMinorVersion(_ctx.stringValue("DescribeInstanceResponse.MinorVersion"));
		describeInstanceResponse.setRegionId(_ctx.stringValue("DescribeInstanceResponse.RegionId"));
		describeInstanceResponse.setMasterDiskSize(_ctx.integerValue("DescribeInstanceResponse.MasterDiskSize"));
		describeInstanceResponse.setMasterDiskType(_ctx.stringValue("DescribeInstanceResponse.MasterDiskType"));
		describeInstanceResponse.setNeedUpgrade(_ctx.booleanValue("DescribeInstanceResponse.NeedUpgrade"));
		describeInstanceResponse.setIsMultiModel(_ctx.booleanValue("DescribeInstanceResponse.IsMultiModel"));
		describeInstanceResponse.setAutoRenewal(_ctx.booleanValue("DescribeInstanceResponse.AutoRenewal"));
		describeInstanceResponse.setClusterType(_ctx.stringValue("DescribeInstanceResponse.ClusterType"));
		describeInstanceResponse.setResourceGroupId(_ctx.stringValue("DescribeInstanceResponse.ResourceGroupId"));
		describeInstanceResponse.setClusterName(_ctx.stringValue("DescribeInstanceResponse.ClusterName"));
		describeInstanceResponse.setZoneId(_ctx.stringValue("DescribeInstanceResponse.ZoneId"));
		describeInstanceResponse.setDuration(_ctx.integerValue("DescribeInstanceResponse.Duration"));
		describeInstanceResponse.setModuleStackVersion(_ctx.stringValue("DescribeInstanceResponse.ModuleStackVersion"));
		describeInstanceResponse.setEngine(_ctx.stringValue("DescribeInstanceResponse.Engine"));
		describeInstanceResponse.setMajorVersion(_ctx.stringValue("DescribeInstanceResponse.MajorVersion"));
		describeInstanceResponse.setCoreDiskCount(_ctx.stringValue("DescribeInstanceResponse.CoreDiskCount"));
		describeInstanceResponse.setTaskProgress(_ctx.stringValue("DescribeInstanceResponse.TaskProgress"));
		describeInstanceResponse.setCoreNodeCount(_ctx.integerValue("DescribeInstanceResponse.CoreNodeCount"));

		List<String> needUpgradeComps = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceResponse.NeedUpgradeComps.Length"); i++) {
			needUpgradeComps.add(_ctx.stringValue("DescribeInstanceResponse.NeedUpgradeComps["+ i +"]"));
		}
		describeInstanceResponse.setNeedUpgradeComps(needUpgradeComps);

		List<Tag> tags = new ArrayList<Tag>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceResponse.Tags.Length"); i++) {
			Tag tag = new Tag();
			tag.setKey(_ctx.stringValue("DescribeInstanceResponse.Tags["+ i +"].Key"));
			tag.setValue(_ctx.stringValue("DescribeInstanceResponse.Tags["+ i +"].Value"));

			tags.add(tag);
		}
		describeInstanceResponse.setTags(tags);
	 
	 	return describeInstanceResponse;
	}
}