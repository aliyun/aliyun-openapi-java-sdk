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
			kVStoreInstance.setConnections(_ctx.longValue("DescribeInstancesResponse.Instances["+ i +"].Connections"));
			kVStoreInstance.setEndTime(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].EndTime"));
			kVStoreInstance.setResourceGroupId(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].ResourceGroupId"));
			kVStoreInstance.setEditionType(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].EditionType"));
			kVStoreInstance.setConfig(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].Config"));
			kVStoreInstance.setPort(_ctx.longValue("DescribeInstancesResponse.Instances["+ i +"].Port"));
			kVStoreInstance.setDestroyTime(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].DestroyTime"));
			kVStoreInstance.setGlobalInstanceId(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].GlobalInstanceId"));
			kVStoreInstance.setHasRenewChangeOrder(_ctx.booleanValue("DescribeInstancesResponse.Instances["+ i +"].HasRenewChangeOrder"));
			kVStoreInstance.setShardCount(_ctx.integerValue("DescribeInstancesResponse.Instances["+ i +"].ShardCount"));
			kVStoreInstance.setConnectionDomain(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].ConnectionDomain"));
			kVStoreInstance.setSlaveReplicaCount(_ctx.integerValue("DescribeInstancesResponse.Instances["+ i +"].SlaveReplicaCount"));
			kVStoreInstance.setPrivateIp(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].PrivateIp"));
			kVStoreInstance.setCapacity(_ctx.longValue("DescribeInstancesResponse.Instances["+ i +"].Capacity"));
			kVStoreInstance.setQPS(_ctx.longValue("DescribeInstancesResponse.Instances["+ i +"].QPS"));
			kVStoreInstance.setNetworkType(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].NetworkType"));
			kVStoreInstance.setInstanceStatus(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].InstanceStatus"));
			kVStoreInstance.setPackageType(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].PackageType"));
			kVStoreInstance.setBandwidth(_ctx.longValue("DescribeInstancesResponse.Instances["+ i +"].Bandwidth"));
			kVStoreInstance.setInstanceType(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].InstanceType"));
			kVStoreInstance.setReplacateId(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].ReplacateId"));
			kVStoreInstance.setArchitectureType(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].ArchitectureType"));
			kVStoreInstance.setEngineVersion(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].EngineVersion"));
			kVStoreInstance.setUserName(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].UserName"));
			kVStoreInstance.setZoneId(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].ZoneId"));
			kVStoreInstance.setCloudType(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].CloudType"));
			kVStoreInstance.setInstanceId(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].InstanceId"));
			kVStoreInstance.setShardClass(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].ShardClass"));
			kVStoreInstance.setCreateTime(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].CreateTime"));
			kVStoreInstance.setVSwitchId(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].VSwitchId"));
			kVStoreInstance.setReplicaCount(_ctx.integerValue("DescribeInstancesResponse.Instances["+ i +"].ReplicaCount"));
			kVStoreInstance.setReadOnlyCount(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].ReadOnlyCount"));
			kVStoreInstance.setInstanceClass(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].InstanceClass"));
			kVStoreInstance.setIsRds(_ctx.booleanValue("DescribeInstancesResponse.Instances["+ i +"].IsRds"));
			kVStoreInstance.setSecondaryZoneId(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].SecondaryZoneId"));
			kVStoreInstance.setInstanceName(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].InstanceName"));
			kVStoreInstance.setSlaveReadOnlyCount(_ctx.integerValue("DescribeInstancesResponse.Instances["+ i +"].SlaveReadOnlyCount"));
			kVStoreInstance.setVpcId(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].VpcId"));
			kVStoreInstance.setChargeType(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].ChargeType"));
			kVStoreInstance.setComputingType(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].ComputingType"));
			kVStoreInstance.setNodeType(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].NodeType"));
			kVStoreInstance.setConnectionMode(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].ConnectionMode"));
			kVStoreInstance.setProxyCount(_ctx.integerValue("DescribeInstancesResponse.Instances["+ i +"].ProxyCount"));
			kVStoreInstance.setVpcCloudInstanceId(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].VpcCloudInstanceId"));
			kVStoreInstance.setRegionId(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].RegionId"));

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeInstancesResponse.Instances["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setValue(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].Tags["+ j +"].Value"));
				tag.setKey(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].Tags["+ j +"].Key"));

				tags.add(tag);
			}
			kVStoreInstance.setTags(tags);

			instances.add(kVStoreInstance);
		}
		describeInstancesResponse.setInstances(instances);
	 
	 	return describeInstancesResponse;
	}
}