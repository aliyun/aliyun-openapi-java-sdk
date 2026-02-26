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

import com.aliyuncs.adb.model.v20190315.DescribeInclinedNodesResponse;
import com.aliyuncs.adb.model.v20190315.DescribeInclinedNodesResponse.ItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInclinedNodesResponseUnmarshaller {

	public static DescribeInclinedNodesResponse unmarshall(DescribeInclinedNodesResponse describeInclinedNodesResponse, UnmarshallerContext _ctx) {
		
		describeInclinedNodesResponse.setRequestId(_ctx.stringValue("DescribeInclinedNodesResponse.RequestId"));

		List<ItemsItem> items = new ArrayList<ItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInclinedNodesResponse.Items.Length"); i++) {
			ItemsItem itemsItem = new ItemsItem();
			itemsItem.setNode(_ctx.stringValue("DescribeInclinedNodesResponse.Items["+ i +"].Node"));
			itemsItem.setDiskUsageRatio(_ctx.stringValue("DescribeInclinedNodesResponse.Items["+ i +"].DiskUsageRatio"));

			items.add(itemsItem);
		}
		describeInclinedNodesResponse.setItems(items);
	 
	 	return describeInclinedNodesResponse;
	}
}