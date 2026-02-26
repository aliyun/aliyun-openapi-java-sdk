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

package com.aliyuncs.adb.transform.v20190315;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.adb.model.v20190315.DescribeTableDetailResponse;
import com.aliyuncs.adb.model.v20190315.DescribeTableDetailResponse.Items;
import com.aliyuncs.adb.model.v20190315.DescribeTableDetailResponse.Items.ShardItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTableDetailResponseUnmarshaller {

	public static DescribeTableDetailResponse unmarshall(DescribeTableDetailResponse describeTableDetailResponse, UnmarshallerContext _ctx) {
		
		describeTableDetailResponse.setRequestId(_ctx.stringValue("DescribeTableDetailResponse.RequestId"));
		describeTableDetailResponse.setAvgSize(_ctx.longValue("DescribeTableDetailResponse.AvgSize"));

		Items items = new Items();

		List<ShardItem> shard = new ArrayList<ShardItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTableDetailResponse.Items.Shard.Length"); i++) {
			ShardItem shardItem = new ShardItem();
			shardItem.setSize(_ctx.longValue("DescribeTableDetailResponse.Items.Shard["+ i +"].Size"));
			shardItem.setId(_ctx.integerValue("DescribeTableDetailResponse.Items.Shard["+ i +"].Id"));

			shard.add(shardItem);
		}
		items.setShard(shard);
		describeTableDetailResponse.setItems(items);
	 
	 	return describeTableDetailResponse;
	}
}