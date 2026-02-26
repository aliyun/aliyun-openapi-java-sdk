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

import com.aliyuncs.rds.model.v20140815.DescribeHistoryEventsStatResponse;
import com.aliyuncs.rds.model.v20140815.DescribeHistoryEventsStatResponse.ItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeHistoryEventsStatResponseUnmarshaller {

	public static DescribeHistoryEventsStatResponse unmarshall(DescribeHistoryEventsStatResponse describeHistoryEventsStatResponse, UnmarshallerContext _ctx) {
		
		describeHistoryEventsStatResponse.setRequestId(_ctx.stringValue("DescribeHistoryEventsStatResponse.RequestId"));

		List<ItemsItem> items = new ArrayList<ItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeHistoryEventsStatResponse.Items.Length"); i++) {
			ItemsItem itemsItem = new ItemsItem();
			itemsItem.setEventCategory(_ctx.stringValue("DescribeHistoryEventsStatResponse.Items["+ i +"].EventCategory"));
			itemsItem.setTotalCount(_ctx.integerValue("DescribeHistoryEventsStatResponse.Items["+ i +"].TotalCount"));

			items.add(itemsItem);
		}
		describeHistoryEventsStatResponse.setItems(items);
	 
	 	return describeHistoryEventsStatResponse;
	}
}