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

import com.aliyuncs.adb.model.v20190315.DescribeDBClusterHealthReportResponse;
import com.aliyuncs.adb.model.v20190315.DescribeDBClusterHealthReportResponse.ItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBClusterHealthReportResponseUnmarshaller {

	public static DescribeDBClusterHealthReportResponse unmarshall(DescribeDBClusterHealthReportResponse describeDBClusterHealthReportResponse, UnmarshallerContext _ctx) {
		
		describeDBClusterHealthReportResponse.setRequestId(_ctx.stringValue("DescribeDBClusterHealthReportResponse.RequestId"));

		List<ItemsItem> items = new ArrayList<ItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBClusterHealthReportResponse.Items.Length"); i++) {
			ItemsItem itemsItem = new ItemsItem();
			itemsItem.setKey(_ctx.stringValue("DescribeDBClusterHealthReportResponse.Items["+ i +"].Key"));
			itemsItem.setMax(_ctx.stringValue("DescribeDBClusterHealthReportResponse.Items["+ i +"].Max"));
			itemsItem.setName(_ctx.stringValue("DescribeDBClusterHealthReportResponse.Items["+ i +"].Name"));
			itemsItem.setAvg(_ctx.stringValue("DescribeDBClusterHealthReportResponse.Items["+ i +"].Avg"));

			items.add(itemsItem);
		}
		describeDBClusterHealthReportResponse.setItems(items);
	 
	 	return describeDBClusterHealthReportResponse;
	}
}