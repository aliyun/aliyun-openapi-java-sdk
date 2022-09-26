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

import com.aliyuncs.gpdb.model.v20160503.DescribeDBInstanceDataSkewResponse;
import com.aliyuncs.gpdb.model.v20160503.DescribeDBInstanceDataSkewResponse.ItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBInstanceDataSkewResponseUnmarshaller {

	public static DescribeDBInstanceDataSkewResponse unmarshall(DescribeDBInstanceDataSkewResponse describeDBInstanceDataSkewResponse, UnmarshallerContext _ctx) {
		
		describeDBInstanceDataSkewResponse.setRequestId(_ctx.stringValue("DescribeDBInstanceDataSkewResponse.RequestId"));
		describeDBInstanceDataSkewResponse.setTotalCount(_ctx.integerValue("DescribeDBInstanceDataSkewResponse.TotalCount"));
		describeDBInstanceDataSkewResponse.setPageNumber(_ctx.integerValue("DescribeDBInstanceDataSkewResponse.PageNumber"));

		List<ItemsItem> items = new ArrayList<ItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBInstanceDataSkewResponse.Items.Length"); i++) {
			ItemsItem itemsItem = new ItemsItem();
			itemsItem.setSequence(_ctx.integerValue("DescribeDBInstanceDataSkewResponse.Items["+ i +"].Sequence"));
			itemsItem.setDatabaseName(_ctx.stringValue("DescribeDBInstanceDataSkewResponse.Items["+ i +"].DatabaseName"));
			itemsItem.setSchemaName(_ctx.stringValue("DescribeDBInstanceDataSkewResponse.Items["+ i +"].SchemaName"));
			itemsItem.setTableName(_ctx.stringValue("DescribeDBInstanceDataSkewResponse.Items["+ i +"].TableName"));
			itemsItem.setOwner(_ctx.stringValue("DescribeDBInstanceDataSkewResponse.Items["+ i +"].Owner"));
			itemsItem.setTableSize(_ctx.stringValue("DescribeDBInstanceDataSkewResponse.Items["+ i +"].TableSize"));
			itemsItem.setTableSkew(_ctx.stringValue("DescribeDBInstanceDataSkewResponse.Items["+ i +"].TableSkew"));
			itemsItem.setDistributeKey(_ctx.stringValue("DescribeDBInstanceDataSkewResponse.Items["+ i +"].DistributeKey"));
			itemsItem.setTimeLastUpdated(_ctx.stringValue("DescribeDBInstanceDataSkewResponse.Items["+ i +"].TimeLastUpdated"));

			items.add(itemsItem);
		}
		describeDBInstanceDataSkewResponse.setItems(items);
	 
	 	return describeDBInstanceDataSkewResponse;
	}
}