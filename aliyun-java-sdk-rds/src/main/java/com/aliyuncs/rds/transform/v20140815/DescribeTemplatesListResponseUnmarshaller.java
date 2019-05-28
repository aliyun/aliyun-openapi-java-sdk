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

	public static DescribeTemplatesListResponse unmarshall(DescribeTemplatesListResponse describeTemplatesListResponse, UnmarshallerContext context) {
		
		describeTemplatesListResponse.setRequestId(context.stringValue("DescribeTemplatesListResponse.RequestId"));
		describeTemplatesListResponse.setDBInstanceID(context.integerValue("DescribeTemplatesListResponse.DBInstanceID"));
		describeTemplatesListResponse.setDBInstanceName(context.stringValue("DescribeTemplatesListResponse.DBInstanceName"));
		describeTemplatesListResponse.setStartTime(context.stringValue("DescribeTemplatesListResponse.StartTime"));
		describeTemplatesListResponse.setEndTime(context.stringValue("DescribeTemplatesListResponse.EndTime"));
		describeTemplatesListResponse.setTotalRecords(context.integerValue("DescribeTemplatesListResponse.TotalRecords"));
		describeTemplatesListResponse.setPagingID(context.stringValue("DescribeTemplatesListResponse.PagingID"));
		describeTemplatesListResponse.setMaxRecordsPerPage(context.integerValue("DescribeTemplatesListResponse.MaxRecordsPerPage"));
		describeTemplatesListResponse.setPageNumbers(context.integerValue("DescribeTemplatesListResponse.PageNumbers"));
		describeTemplatesListResponse.setItemsNumbers(context.integerValue("DescribeTemplatesListResponse.ItemsNumbers"));

		List<ItemsItem> items = new ArrayList<ItemsItem>();
		for (int i = 0; i < context.lengthValue("DescribeTemplatesListResponse.Items.Length"); i++) {
			ItemsItem itemsItem = new ItemsItem();
			itemsItem.setTemplate(context.stringValue("DescribeTemplatesListResponse.Items["+ i +"].Template"));
			itemsItem.setTotalConsume(context.longValue("DescribeTemplatesListResponse.Items["+ i +"].TotalConsume"));
			itemsItem.setAvgConsume(context.floatValue("DescribeTemplatesListResponse.Items["+ i +"].AvgConsume"));
			itemsItem.setTotalCounts(context.longValue("DescribeTemplatesListResponse.Items["+ i +"].TotalCounts"));
			itemsItem.setAvgScanRows(context.floatValue("DescribeTemplatesListResponse.Items["+ i +"].AvgScanRows"));
			itemsItem.setTotalScanRows(context.longValue("DescribeTemplatesListResponse.Items["+ i +"].TotalScanRows"));
			itemsItem.setTotalUpdateRows(context.longValue("DescribeTemplatesListResponse.Items["+ i +"].TotalUpdateRows"));
			itemsItem.setAvgUpdateRows(context.floatValue("DescribeTemplatesListResponse.Items["+ i +"].AvgUpdateRows"));
			itemsItem.setSqlType(context.stringValue("DescribeTemplatesListResponse.Items["+ i +"].SqlType"));
			itemsItem.setTemplateHash(context.stringValue("DescribeTemplatesListResponse.Items["+ i +"].TemplateHash"));

			items.add(itemsItem);
		}
		describeTemplatesListResponse.setItems(items);
	 
	 	return describeTemplatesListResponse;
	}
}