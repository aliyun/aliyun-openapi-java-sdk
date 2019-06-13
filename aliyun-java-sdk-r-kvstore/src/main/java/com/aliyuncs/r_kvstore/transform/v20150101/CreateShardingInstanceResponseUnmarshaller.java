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

import com.aliyuncs.r_kvstore.model.v20150101.CreateShardingInstanceResponse;
import com.aliyuncs.r_kvstore.model.v20150101.CreateShardingInstanceResponse.Shard;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateShardingInstanceResponseUnmarshaller {

	public static CreateShardingInstanceResponse unmarshall(CreateShardingInstanceResponse createShardingInstanceResponse, UnmarshallerContext context) {
		
		createShardingInstanceResponse.setRequestId(context.stringValue("CreateShardingInstanceResponse.RequestId"));
		createShardingInstanceResponse.setInstanceId(context.stringValue("CreateShardingInstanceResponse.InstanceId"));
		createShardingInstanceResponse.setOrderId(context.stringValue("CreateShardingInstanceResponse.OrderId"));

		List<Shard> shardList = new ArrayList<Shard>();
		for (int i = 0; i < context.lengthValue("CreateShardingInstanceResponse.ShardList.Length"); i++) {
			Shard shard = new Shard();
			shard.setShardId(context.stringValue("CreateShardingInstanceResponse.ShardList["+ i +"].ShardId"));
			shard.setReplicaClass(context.stringValue("CreateShardingInstanceResponse.ShardList["+ i +"].ReplicaClass"));
			shard.setStorageQuantity(context.stringValue("CreateShardingInstanceResponse.ShardList["+ i +"].StorageQuantity"));
			shard.setReplicaQuantity(context.stringValue("CreateShardingInstanceResponse.ShardList["+ i +"].ReplicaQuantity"));

			shardList.add(shard);
		}
		createShardingInstanceResponse.setShardList(shardList);
	 
	 	return createShardingInstanceResponse;
	}
}