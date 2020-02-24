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
		describeInstancesResponse.setTotalCount(_ctx.longValue("DescribeInstancesResponse.TotalCount"));
		describeInstancesResponse.setPageNumber(_ctx.integerValue("DescribeInstancesResponse.PageNumber"));
		describeInstancesResponse.setPageSize(_ctx.integerValue("DescribeInstancesResponse.PageSize"));

		List<Instance> instances = new ArrayList<Instance>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstancesResponse.Instances.Length"); i++) {
			Instance instance = new Instance();
			instance.setInstanceId(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].InstanceId"));
			instance.setInstanceName(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].InstanceName"));
			instance.setStatus(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].Status"));
			instance.setPayType(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].PayType"));
			instance.setCreatedTime(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].CreatedTime"));
			instance.setExpireTime(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].ExpireTime"));
			instance.setMajorVersion(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].MajorVersion"));
			instance.setEngine(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].Engine"));
			instance.setIsHa(_ctx.booleanValue("DescribeInstancesResponse.Instances["+ i +"].IsHa"));
			instance.setNetworkType(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].NetworkType"));
			instance.setVpcId(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].VpcId"));
			instance.setVswitchId(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].VswitchId"));
			instance.setMasterInstanceType(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].MasterInstanceType"));
			instance.setMasterNodeCount(_ctx.integerValue("DescribeInstancesResponse.Instances["+ i +"].MasterNodeCount"));
			instance.setMasterDiskType(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].MasterDiskType"));
			instance.setMasterDiskSize(_ctx.integerValue("DescribeInstancesResponse.Instances["+ i +"].MasterDiskSize"));
			instance.setCoreInstanceType(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].CoreInstanceType"));
			instance.setCoreNodeCount(_ctx.integerValue("DescribeInstancesResponse.Instances["+ i +"].CoreNodeCount"));
			instance.setCoreDiskType(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].CoreDiskType"));
			instance.setCoreDiskSize(_ctx.integerValue("DescribeInstancesResponse.Instances["+ i +"].CoreDiskSize"));
			instance.setRegionId(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].RegionId"));
			instance.setZoneId(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].ZoneId"));
			instance.setColdStorageStatus(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].ColdStorageStatus"));
			instance.setBackupStatus(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].BackupStatus"));
			instance.setClusterType(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].ClusterType"));
			instance.setCreatedTimeUTC(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].CreatedTimeUTC"));
			instance.setExpireTimeUTC(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].ExpireTimeUTC"));
			instance.setClusterId(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].ClusterId"));
			instance.setClusterName(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].ClusterName"));
			instance.setIsDeletionProtection(_ctx.booleanValue("DescribeInstancesResponse.Instances["+ i +"].IsDeletionProtection"));

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