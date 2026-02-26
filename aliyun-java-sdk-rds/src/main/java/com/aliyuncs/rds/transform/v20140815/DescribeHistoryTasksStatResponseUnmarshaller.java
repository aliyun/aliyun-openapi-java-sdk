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

package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.DescribeHistoryTasksStatResponse;
import com.aliyuncs.rds.model.v20140815.DescribeHistoryTasksStatResponse.ItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeHistoryTasksStatResponseUnmarshaller {

	public static DescribeHistoryTasksStatResponse unmarshall(DescribeHistoryTasksStatResponse describeHistoryTasksStatResponse, UnmarshallerContext _ctx) {
		
		describeHistoryTasksStatResponse.setRequestId(_ctx.stringValue("DescribeHistoryTasksStatResponse.RequestId"));

		List<ItemsItem> items = new ArrayList<ItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeHistoryTasksStatResponse.Items.Length"); i++) {
			ItemsItem itemsItem = new ItemsItem();
			itemsItem.setStatus(_ctx.stringValue("DescribeHistoryTasksStatResponse.Items["+ i +"].Status"));
			itemsItem.setTotalCount(_ctx.integerValue("DescribeHistoryTasksStatResponse.Items["+ i +"].TotalCount"));

			items.add(itemsItem);
		}
		describeHistoryTasksStatResponse.setItems(items);
	 
	 	return describeHistoryTasksStatResponse;
	}
}