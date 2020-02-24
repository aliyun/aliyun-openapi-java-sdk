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
		describeInstanceResponse.setInstanceId(_ctx.stringValue("DescribeInstanceResponse.InstanceId"));
		describeInstanceResponse.setInstanceName(_ctx.stringValue("DescribeInstanceResponse.InstanceName"));
		describeInstanceResponse.setStatus(_ctx.stringValue("DescribeInstanceResponse.Status"));
		describeInstanceResponse.setPayType(_ctx.stringValue("DescribeInstanceResponse.PayType"));
		describeInstanceResponse.setCreatedTime(_ctx.stringValue("DescribeInstanceResponse.CreatedTime"));
		describeInstanceResponse.setExpireTime(_ctx.stringValue("DescribeInstanceResponse.ExpireTime"));
		describeInstanceResponse.setMajorVersion(_ctx.stringValue("DescribeInstanceResponse.MajorVersion"));
		describeInstanceResponse.setMinorVersion(_ctx.stringValue("DescribeInstanceResponse.MinorVersion"));
		describeInstanceResponse.setEngine(_ctx.stringValue("DescribeInstanceResponse.Engine"));
		describeInstanceResponse.setIsHa(_ctx.booleanValue("DescribeInstanceResponse.IsHa"));
		describeInstanceResponse.setNetworkType(_ctx.stringValue("DescribeInstanceResponse.NetworkType"));
		describeInstanceResponse.setVpcId(_ctx.stringValue("DescribeInstanceResponse.VpcId"));
		describeInstanceResponse.setVswitchId(_ctx.stringValue("DescribeInstanceResponse.VswitchId"));
		describeInstanceResponse.setMasterInstanceType(_ctx.stringValue("DescribeInstanceResponse.MasterInstanceType"));
		describeInstanceResponse.setMasterNodeCount(_ctx.integerValue("DescribeInstanceResponse.MasterNodeCount"));
		describeInstanceResponse.setMasterDiskType(_ctx.stringValue("DescribeInstanceResponse.MasterDiskType"));
		describeInstanceResponse.setMasterDiskSize(_ctx.integerValue("DescribeInstanceResponse.MasterDiskSize"));
		describeInstanceResponse.setCoreInstanceType(_ctx.stringValue("DescribeInstanceResponse.CoreInstanceType"));
		describeInstanceResponse.setCoreNodeCount(_ctx.integerValue("DescribeInstanceResponse.CoreNodeCount"));
		describeInstanceResponse.setCoreDiskType(_ctx.stringValue("DescribeInstanceResponse.CoreDiskType"));
		describeInstanceResponse.setCoreDiskSize(_ctx.integerValue("DescribeInstanceResponse.CoreDiskSize"));
		describeInstanceResponse.setRegionId(_ctx.stringValue("DescribeInstanceResponse.RegionId"));
		describeInstanceResponse.setZoneId(_ctx.stringValue("DescribeInstanceResponse.ZoneId"));
		describeInstanceResponse.setColdStorageStatus(_ctx.stringValue("DescribeInstanceResponse.ColdStorageStatus"));
		describeInstanceResponse.setBackupStatus(_ctx.stringValue("DescribeInstanceResponse.BackupStatus"));
		describeInstanceResponse.setCoreDiskCount(_ctx.stringValue("DescribeInstanceResponse.CoreDiskCount"));
		describeInstanceResponse.setMaintainStartTime(_ctx.stringValue("DescribeInstanceResponse.MaintainStartTime"));
		describeInstanceResponse.setMaintainEndTime(_ctx.stringValue("DescribeInstanceResponse.MaintainEndTime"));
		describeInstanceResponse.setCreatedTimeUTC(_ctx.stringValue("DescribeInstanceResponse.CreatedTimeUTC"));
		describeInstanceResponse.setExpireTimeUTC(_ctx.stringValue("DescribeInstanceResponse.ExpireTimeUTC"));
		describeInstanceResponse.setIsLatestVersion(_ctx.booleanValue("DescribeInstanceResponse.IsLatestVersion"));
		describeInstanceResponse.setIsMultiModel(_ctx.booleanValue("DescribeInstanceResponse.IsMultiModel"));
		describeInstanceResponse.setClusterType(_ctx.stringValue("DescribeInstanceResponse.ClusterType"));
		describeInstanceResponse.setClusterId(_ctx.stringValue("DescribeInstanceResponse.ClusterId"));
		describeInstanceResponse.setClusterName(_ctx.stringValue("DescribeInstanceResponse.ClusterName"));
		describeInstanceResponse.setIsDeletionProtection(_ctx.booleanValue("DescribeInstanceResponse.IsDeletionProtection"));

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