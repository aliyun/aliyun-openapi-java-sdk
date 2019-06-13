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

import com.aliyuncs.r_kvstore.model.v20150101.DescribeShardingInstancesResponse;
import com.aliyuncs.r_kvstore.model.v20150101.DescribeShardingInstancesResponse.Instance;
import com.aliyuncs.r_kvstore.model.v20150101.DescribeShardingInstancesResponse.Instance.Shard;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeShardingInstancesResponseUnmarshaller {

	public static DescribeShardingInstancesResponse unmarshall(DescribeShardingInstancesResponse describeShardingInstancesResponse, UnmarshallerContext context) {
		
		describeShardingInstancesResponse.setRequestId(context.stringValue("DescribeShardingInstancesResponse.RequestId"));
		describeShardingInstancesResponse.setTotalCount(context.integerValue("DescribeShardingInstancesResponse.TotalCount"));

		List<Instance> instances = new ArrayList<Instance>();
		for (int i = 0; i < context.lengthValue("DescribeShardingInstancesResponse.Instances.Length"); i++) {
			Instance instance = new Instance();
			instance.setInstanceId(context.stringValue("DescribeShardingInstancesResponse.Instances["+ i +"].InstanceId"));

			List<Shard> shardList = new ArrayList<Shard>();
			for (int j = 0; j < context.lengthValue("DescribeShardingInstancesResponse.Instances["+ i +"].ShardList.Length"); j++) {
				Shard shard = new Shard();
				shard.setNodeId(context.stringValue("DescribeShardingInstancesResponse.Instances["+ i +"].ShardList["+ j +"].NodeId"));
				shard.setShardReplicaClass(context.stringValue("DescribeShardingInstancesResponse.Instances["+ i +"].ShardList["+ j +"].ShardReplicaClass"));
				shard.setShardStorageQuantity(context.stringValue("DescribeShardingInstancesResponse.Instances["+ i +"].ShardList["+ j +"].ShardStorageQuantity"));

				shardList.add(shard);
			}
			instance.setShardList(shardList);

			instances.add(instance);
		}
		describeShardingInstancesResponse.setInstances(instances);
	 
	 	return describeShardingInstancesResponse;
	}
}