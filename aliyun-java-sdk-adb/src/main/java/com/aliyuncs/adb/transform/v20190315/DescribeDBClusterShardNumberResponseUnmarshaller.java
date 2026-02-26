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

import com.aliyuncs.adb.model.v20190315.DescribeDBClusterShardNumberResponse;
import com.aliyuncs.adb.model.v20190315.DescribeDBClusterShardNumberResponse.AvailableShardNumberListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBClusterShardNumberResponseUnmarshaller {

	public static DescribeDBClusterShardNumberResponse unmarshall(DescribeDBClusterShardNumberResponse describeDBClusterShardNumberResponse, UnmarshallerContext _ctx) {
		
		describeDBClusterShardNumberResponse.setRequestId(_ctx.stringValue("DescribeDBClusterShardNumberResponse.RequestId"));
		describeDBClusterShardNumberResponse.setShardNumber(_ctx.integerValue("DescribeDBClusterShardNumberResponse.ShardNumber"));

		List<Integer> availableShardNumbers = new ArrayList<Integer>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBClusterShardNumberResponse.AvailableShardNumbers.Length"); i++) {
			availableShardNumbers.add(_ctx.integerValue("DescribeDBClusterShardNumberResponse.AvailableShardNumbers["+ i +"]"));
		}
		describeDBClusterShardNumberResponse.setAvailableShardNumbers(availableShardNumbers);

		List<AvailableShardNumberListItem> availableShardNumberList = new ArrayList<AvailableShardNumberListItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBClusterShardNumberResponse.AvailableShardNumberList.Length"); i++) {
			AvailableShardNumberListItem availableShardNumberListItem = new AvailableShardNumberListItem();
			availableShardNumberListItem.setShardNumber(_ctx.integerValue("DescribeDBClusterShardNumberResponse.AvailableShardNumberList["+ i +"].ShardNumber"));

			availableShardNumberList.add(availableShardNumberListItem);
		}
		describeDBClusterShardNumberResponse.setAvailableShardNumberList(availableShardNumberList);
	 
	 	return describeDBClusterShardNumberResponse;
	}
}