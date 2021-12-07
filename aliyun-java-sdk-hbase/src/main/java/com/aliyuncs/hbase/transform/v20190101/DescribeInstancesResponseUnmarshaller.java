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

import com.aliyuncs.hbase.model.v20190101.DescribeInstancesResponse;
import com.aliyuncs.hbase.model.v20190101.DescribeInstancesResponse.Instance;
import com.aliyuncs.hbase.model.v20190101.DescribeInstancesResponse.Instance.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstancesResponseUnmarshaller {

	public static DescribeInstancesResponse unmarshall(DescribeInstancesResponse describeInstancesResponse, UnmarshallerContext _ctx) {
		
		describeInstancesResponse.setRequestId(_ctx.stringValue("DescribeInstancesResponse.RequestId"));
		describeInstancesResponse.setPageSize(_ctx.integerValue("DescribeInstancesResponse.PageSize"));
		describeInstancesResponse.setPageNumber(_ctx.integerValue("DescribeInstancesResponse.PageNumber"));
		describeInstancesResponse.setTotalCount(_ctx.longValue("DescribeInstancesResponse.TotalCount"));

		List<Instance> instances = new ArrayList<Instance>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstancesResponse.Instances.Length"); i++) {
			Instance instance = new Instance();
			instance.setVpcId(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].VpcId"));
			instance.setStatus(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].Status"));
			instance.setModuleId(_ctx.integerValue("DescribeInstancesResponse.Instances["+ i +"].ModuleId"));
			instance.setVswitchId(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].VswitchId"));
			instance.setBackupStatus(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].BackupStatus"));
			instance.setPayType(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].PayType"));
			instance.setCoreDiskType(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].CoreDiskType"));
			instance.setMasterNodeCount(_ctx.integerValue("DescribeInstancesResponse.Instances["+ i +"].MasterNodeCount"));
			instance.setNetworkType(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].NetworkType"));
			instance.setCreatedTimeUTC(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].CreatedTimeUTC"));
			instance.setParentId(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].ParentId"));
			instance.setExpireTimeUTC(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].ExpireTimeUTC"));
			instance.setInstanceName(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].InstanceName"));
			instance.setMasterInstanceType(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].MasterInstanceType"));
			instance.setCoreInstanceType(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].CoreInstanceType"));
			instance.setCreatedTime(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].CreatedTime"));
			instance.setCoreDiskSize(_ctx.integerValue("DescribeInstancesResponse.Instances["+ i +"].CoreDiskSize"));
			instance.setClusterId(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].ClusterId"));
			instance.setExpireTime(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].ExpireTime"));
			instance.setIsHa(_ctx.booleanValue("DescribeInstancesResponse.Instances["+ i +"].IsHa"));
			instance.setInstanceId(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].InstanceId"));
			instance.setColdStorageStatus(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].ColdStorageStatus"));
			instance.setIsDeletionProtection(_ctx.booleanValue("DescribeInstancesResponse.Instances["+ i +"].IsDeletionProtection"));
			instance.setRegionId(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].RegionId"));
			instance.setMasterDiskSize(_ctx.integerValue("DescribeInstancesResponse.Instances["+ i +"].MasterDiskSize"));
			instance.setMasterDiskType(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].MasterDiskType"));
			instance.setAutoRenewal(_ctx.booleanValue("DescribeInstancesResponse.Instances["+ i +"].AutoRenewal"));
			instance.setClusterType(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].ClusterType"));
			instance.setResourceGroupId(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].ResourceGroupId"));
			instance.setClusterName(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].ClusterName"));
			instance.setZoneId(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].ZoneId"));
			instance.setDuration(_ctx.integerValue("DescribeInstancesResponse.Instances["+ i +"].Duration"));
			instance.setModuleStackVersion(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].ModuleStackVersion"));
			instance.setEngine(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].Engine"));
			instance.setMajorVersion(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].MajorVersion"));
			instance.setCoreDiskCount(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].CoreDiskCount"));
			instance.setCoreNodeCount(_ctx.integerValue("DescribeInstancesResponse.Instances["+ i +"].CoreNodeCount"));

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeInstancesResponse.Instances["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].Tags["+ j +"].Key"));
				tag.setValue(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].Tags["+ j +"].Value"));

				tags.add(tag);
			}
			instance.setTags(tags);

			instances.add(instance);
		}
		describeInstancesResponse.setInstances(instances);
	 
	 	return describeInstancesResponse;
	}
}