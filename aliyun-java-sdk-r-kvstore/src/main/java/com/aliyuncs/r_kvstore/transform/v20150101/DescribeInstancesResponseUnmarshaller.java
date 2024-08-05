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

package com.aliyuncs.r_kvstore.transform.v20150101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.r_kvstore.model.v20150101.DescribeInstancesResponse;
import com.aliyuncs.r_kvstore.model.v20150101.DescribeInstancesResponse.KVStoreInstance;
import com.aliyuncs.r_kvstore.model.v20150101.DescribeInstancesResponse.KVStoreInstance.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstancesResponseUnmarshaller {

	public static DescribeInstancesResponse unmarshall(DescribeInstancesResponse describeInstancesResponse, UnmarshallerContext _ctx) {
		
		describeInstancesResponse.setRequestId(_ctx.stringValue("DescribeInstancesResponse.RequestId"));
		describeInstancesResponse.setPageNumber(_ctx.integerValue("DescribeInstancesResponse.PageNumber"));
		describeInstancesResponse.setPageSize(_ctx.integerValue("DescribeInstancesResponse.PageSize"));
		describeInstancesResponse.setTotalCount(_ctx.integerValue("DescribeInstancesResponse.TotalCount"));

		List<KVStoreInstance> instances = new ArrayList<KVStoreInstance>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstancesResponse.Instances.Length"); i++) {
			KVStoreInstance kVStoreInstance = new KVStoreInstance();
			kVStoreInstance.setVpcId(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].VpcId"));
			kVStoreInstance.setPrivateIp(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].PrivateIp"));
			kVStoreInstance.setCapacity(_ctx.longValue("DescribeInstancesResponse.Instances["+ i +"].Capacity"));
			kVStoreInstance.setReplacateId(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].ReplacateId"));
			kVStoreInstance.setCreateTime(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].CreateTime"));
			kVStoreInstance.setConnectionDomain(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].ConnectionDomain"));
			kVStoreInstance.setIsRds(_ctx.booleanValue("DescribeInstancesResponse.Instances["+ i +"].IsRds"));
			kVStoreInstance.setChargeType(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].ChargeType"));
			kVStoreInstance.setArchitectureType(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].ArchitectureType"));
			kVStoreInstance.setNetworkType(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].NetworkType"));
			kVStoreInstance.setConnectionMode(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].ConnectionMode"));
			kVStoreInstance.setPort(_ctx.longValue("DescribeInstancesResponse.Instances["+ i +"].Port"));
			kVStoreInstance.setSecondaryZoneId(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].SecondaryZoneId"));
			kVStoreInstance.setEngineVersion(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].EngineVersion"));
			kVStoreInstance.setPackageType(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].PackageType"));
			kVStoreInstance.setConfig(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].Config"));
			kVStoreInstance.setVpcCloudInstanceId(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].VpcCloudInstanceId"));
			kVStoreInstance.setBandwidth(_ctx.longValue("DescribeInstancesResponse.Instances["+ i +"].Bandwidth"));
			kVStoreInstance.setInstanceName(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].InstanceName"));
			kVStoreInstance.setShardCount(_ctx.integerValue("DescribeInstancesResponse.Instances["+ i +"].ShardCount"));
			kVStoreInstance.setUserName(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].UserName"));
			kVStoreInstance.setGlobalInstanceId(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].GlobalInstanceId"));
			kVStoreInstance.setQPS(_ctx.longValue("DescribeInstancesResponse.Instances["+ i +"].QPS"));
			kVStoreInstance.setInstanceClass(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].InstanceClass"));
			kVStoreInstance.setDestroyTime(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].DestroyTime"));
			kVStoreInstance.setInstanceId(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].InstanceId"));
			kVStoreInstance.setInstanceType(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].InstanceType"));
			kVStoreInstance.setHasRenewChangeOrder(_ctx.booleanValue("DescribeInstancesResponse.Instances["+ i +"].HasRenewChangeOrder"));
			kVStoreInstance.setRegionId(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].RegionId"));
			kVStoreInstance.setEndTime(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].EndTime"));
			kVStoreInstance.setVSwitchId(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].VSwitchId"));
			kVStoreInstance.setNodeType(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].NodeType"));
			kVStoreInstance.setConnections(_ctx.longValue("DescribeInstancesResponse.Instances["+ i +"].Connections"));
			kVStoreInstance.setResourceGroupId(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].ResourceGroupId"));
			kVStoreInstance.setZoneId(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].ZoneId"));
			kVStoreInstance.setInstanceStatus(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].InstanceStatus"));
			kVStoreInstance.setProxyCount(_ctx.integerValue("DescribeInstancesResponse.Instances["+ i +"].ProxyCount"));
			kVStoreInstance.setComputingType(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].ComputingType"));
			kVStoreInstance.setCloudType(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].CloudType"));
			kVStoreInstance.setEditionType(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].EditionType"));
			kVStoreInstance.setReadOnlyCount(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].ReadOnlyCount"));
			kVStoreInstance.setShardClass(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].ShardClass"));

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeInstancesResponse.Instances["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].Tags["+ j +"].Key"));
				tag.setValue(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].Tags["+ j +"].Value"));

				tags.add(tag);
			}
			kVStoreInstance.setTags(tags);

			instances.add(kVStoreInstance);
		}
		describeInstancesResponse.setInstances(instances);
	 
	 	return describeInstancesResponse;
	}
}