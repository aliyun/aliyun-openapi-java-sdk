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

import com.aliyuncs.adb.model.v20190315.DescribeTableAccessCountResponse;
import com.aliyuncs.adb.model.v20190315.DescribeTableAccessCountResponse.ItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTableAccessCountResponseUnmarshaller {

	public static DescribeTableAccessCountResponse unmarshall(DescribeTableAccessCountResponse describeTableAccessCountResponse, UnmarshallerContext _ctx) {
		
		describeTableAccessCountResponse.setRequestId(_ctx.stringValue("DescribeTableAccessCountResponse.RequestId"));
		describeTableAccessCountResponse.setPageNumber(_ctx.integerValue("DescribeTableAccessCountResponse.PageNumber"));
		describeTableAccessCountResponse.setPageSize(_ctx.integerValue("DescribeTableAccessCountResponse.PageSize"));
		describeTableAccessCountResponse.setTotalCount(_ctx.integerValue("DescribeTableAccessCountResponse.TotalCount"));

		List<ItemsItem> items = new ArrayList<ItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTableAccessCountResponse.Items.Length"); i++) {
			ItemsItem itemsItem = new ItemsItem();
			itemsItem.setReportDate(_ctx.stringValue("DescribeTableAccessCountResponse.Items["+ i +"].ReportDate"));
			itemsItem.setTableSchema(_ctx.stringValue("DescribeTableAccessCountResponse.Items["+ i +"].TableSchema"));
			itemsItem.setAccessCount(_ctx.stringValue("DescribeTableAccessCountResponse.Items["+ i +"].AccessCount"));
			itemsItem.setTableName(_ctx.stringValue("DescribeTableAccessCountResponse.Items["+ i +"].TableName"));
			itemsItem.setInstanceName(_ctx.stringValue("DescribeTableAccessCountResponse.Items["+ i +"].InstanceName"));

			items.add(itemsItem);
		}
		describeTableAccessCountResponse.setItems(items);
	 
	 	return describeTableAccessCountResponse;
	}
}