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

import com.aliyuncs.rds.model.v20140815.DescribeTemplatesListResponse;
import com.aliyuncs.rds.model.v20140815.DescribeTemplatesListResponse.ItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTemplatesListResponseUnmarshaller {

	public static DescribeTemplatesListResponse unmarshall(DescribeTemplatesListResponse describeTemplatesListResponse, UnmarshallerContext _ctx) {
		
		describeTemplatesListResponse.setRequestId(_ctx.stringValue("DescribeTemplatesListResponse.RequestId"));
		describeTemplatesListResponse.setDBInstanceID(_ctx.integerValue("DescribeTemplatesListResponse.DBInstanceID"));
		describeTemplatesListResponse.setDBInstanceName(_ctx.stringValue("DescribeTemplatesListResponse.DBInstanceName"));
		describeTemplatesListResponse.setStartTime(_ctx.stringValue("DescribeTemplatesListResponse.StartTime"));
		describeTemplatesListResponse.setEndTime(_ctx.stringValue("DescribeTemplatesListResponse.EndTime"));
		describeTemplatesListResponse.setTotalRecords(_ctx.integerValue("DescribeTemplatesListResponse.TotalRecords"));
		describeTemplatesListResponse.setPagingID(_ctx.stringValue("DescribeTemplatesListResponse.PagingID"));
		describeTemplatesListResponse.setMaxRecordsPerPage(_ctx.integerValue("DescribeTemplatesListResponse.MaxRecordsPerPage"));
		describeTemplatesListResponse.setPageNumbers(_ctx.integerValue("DescribeTemplatesListResponse.PageNumbers"));
		describeTemplatesListResponse.setItemsNumbers(_ctx.integerValue("DescribeTemplatesListResponse.ItemsNumbers"));

		List<ItemsItem> items = new ArrayList<ItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTemplatesListResponse.Items.Length"); i++) {
			ItemsItem itemsItem = new ItemsItem();
			itemsItem.setTemplate(_ctx.stringValue("DescribeTemplatesListResponse.Items["+ i +"].Template"));
			itemsItem.setTotalConsume(_ctx.longValue("DescribeTemplatesListResponse.Items["+ i +"].TotalConsume"));
			itemsItem.setAvgConsume(_ctx.floatValue("DescribeTemplatesListResponse.Items["+ i +"].AvgConsume"));
			itemsItem.setTotalCounts(_ctx.longValue("DescribeTemplatesListResponse.Items["+ i +"].TotalCounts"));
			itemsItem.setAvgScanRows(_ctx.floatValue("DescribeTemplatesListResponse.Items["+ i +"].AvgScanRows"));
			itemsItem.setTotalScanRows(_ctx.longValue("DescribeTemplatesListResponse.Items["+ i +"].TotalScanRows"));
			itemsItem.setTotalUpdateRows(_ctx.longValue("DescribeTemplatesListResponse.Items["+ i +"].TotalUpdateRows"));
			itemsItem.setAvgUpdateRows(_ctx.floatValue("DescribeTemplatesListResponse.Items["+ i +"].AvgUpdateRows"));
			itemsItem.setSqlType(_ctx.stringValue("DescribeTemplatesListResponse.Items["+ i +"].SqlType"));
			itemsItem.setTemplateHash(_ctx.stringValue("DescribeTemplatesListResponse.Items["+ i +"].TemplateHash"));

			items.add(itemsItem);
		}
		describeTemplatesListResponse.setItems(items);
	 
	 	return describeTemplatesListResponse;
	}
}