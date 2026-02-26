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

package com.aliyuncs.gpdb.transform.v20160503;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.gpdb.model.v20160503.DescribeDBInstanceIndexUsageResponse;
import com.aliyuncs.gpdb.model.v20160503.DescribeDBInstanceIndexUsageResponse.ItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBInstanceIndexUsageResponseUnmarshaller {

	public static DescribeDBInstanceIndexUsageResponse unmarshall(DescribeDBInstanceIndexUsageResponse describeDBInstanceIndexUsageResponse, UnmarshallerContext _ctx) {
		
		describeDBInstanceIndexUsageResponse.setRequestId(_ctx.stringValue("DescribeDBInstanceIndexUsageResponse.RequestId"));
		describeDBInstanceIndexUsageResponse.setTotalCount(_ctx.integerValue("DescribeDBInstanceIndexUsageResponse.TotalCount"));
		describeDBInstanceIndexUsageResponse.setPageNumber(_ctx.integerValue("DescribeDBInstanceIndexUsageResponse.PageNumber"));

		List<ItemsItem> items = new ArrayList<ItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBInstanceIndexUsageResponse.Items.Length"); i++) {
			ItemsItem itemsItem = new ItemsItem();
			itemsItem.setDatabaseName(_ctx.stringValue("DescribeDBInstanceIndexUsageResponse.Items["+ i +"].DatabaseName"));
			itemsItem.setSchemaName(_ctx.stringValue("DescribeDBInstanceIndexUsageResponse.Items["+ i +"].SchemaName"));
			itemsItem.setTableName(_ctx.stringValue("DescribeDBInstanceIndexUsageResponse.Items["+ i +"].TableName"));
			itemsItem.setIsPartitionTable(_ctx.booleanValue("DescribeDBInstanceIndexUsageResponse.Items["+ i +"].IsPartitionTable"));
			itemsItem.setParentTableName(_ctx.stringValue("DescribeDBInstanceIndexUsageResponse.Items["+ i +"].ParentTableName"));
			itemsItem.setIndexName(_ctx.stringValue("DescribeDBInstanceIndexUsageResponse.Items["+ i +"].IndexName"));
			itemsItem.setIndexSize(_ctx.stringValue("DescribeDBInstanceIndexUsageResponse.Items["+ i +"].IndexSize"));
			itemsItem.setIndexScanTimes(_ctx.longValue("DescribeDBInstanceIndexUsageResponse.Items["+ i +"].IndexScanTimes"));
			itemsItem.setIndexDef(_ctx.stringValue("DescribeDBInstanceIndexUsageResponse.Items["+ i +"].IndexDef"));
			itemsItem.setTimeLastUpdated(_ctx.stringValue("DescribeDBInstanceIndexUsageResponse.Items["+ i +"].TimeLastUpdated"));

			items.add(itemsItem);
		}
		describeDBInstanceIndexUsageResponse.setItems(items);
	 
	 	return describeDBInstanceIndexUsageResponse;
	}
}