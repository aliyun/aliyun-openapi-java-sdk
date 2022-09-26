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

import com.aliyuncs.gpdb.model.v20160503.DescribeDBInstanceDataBloatResponse;
import com.aliyuncs.gpdb.model.v20160503.DescribeDBInstanceDataBloatResponse.ItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBInstanceDataBloatResponseUnmarshaller {

	public static DescribeDBInstanceDataBloatResponse unmarshall(DescribeDBInstanceDataBloatResponse describeDBInstanceDataBloatResponse, UnmarshallerContext _ctx) {
		
		describeDBInstanceDataBloatResponse.setRequestId(_ctx.stringValue("DescribeDBInstanceDataBloatResponse.RequestId"));
		describeDBInstanceDataBloatResponse.setTotalCount(_ctx.integerValue("DescribeDBInstanceDataBloatResponse.TotalCount"));
		describeDBInstanceDataBloatResponse.setPageNumber(_ctx.integerValue("DescribeDBInstanceDataBloatResponse.PageNumber"));

		List<ItemsItem> items = new ArrayList<ItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBInstanceDataBloatResponse.Items.Length"); i++) {
			ItemsItem itemsItem = new ItemsItem();
			itemsItem.setSequence(_ctx.integerValue("DescribeDBInstanceDataBloatResponse.Items["+ i +"].Sequence"));
			itemsItem.setDatabaseName(_ctx.stringValue("DescribeDBInstanceDataBloatResponse.Items["+ i +"].DatabaseName"));
			itemsItem.setSchemaName(_ctx.stringValue("DescribeDBInstanceDataBloatResponse.Items["+ i +"].SchemaName"));
			itemsItem.setTableName(_ctx.stringValue("DescribeDBInstanceDataBloatResponse.Items["+ i +"].TableName"));
			itemsItem.setStorageType(_ctx.stringValue("DescribeDBInstanceDataBloatResponse.Items["+ i +"].StorageType"));
			itemsItem.setExpectTableSize(_ctx.stringValue("DescribeDBInstanceDataBloatResponse.Items["+ i +"].ExpectTableSize"));
			itemsItem.setRealTableSize(_ctx.stringValue("DescribeDBInstanceDataBloatResponse.Items["+ i +"].RealTableSize"));
			itemsItem.setBloatSize(_ctx.stringValue("DescribeDBInstanceDataBloatResponse.Items["+ i +"].BloatSize"));
			itemsItem.setBloatCeoff(_ctx.stringValue("DescribeDBInstanceDataBloatResponse.Items["+ i +"].BloatCeoff"));
			itemsItem.setSuggestedAction(_ctx.stringValue("DescribeDBInstanceDataBloatResponse.Items["+ i +"].SuggestedAction"));
			itemsItem.setTimeLastVacuumed(_ctx.stringValue("DescribeDBInstanceDataBloatResponse.Items["+ i +"].TimeLastVacuumed"));
			itemsItem.setTimeLastUpdated(_ctx.stringValue("DescribeDBInstanceDataBloatResponse.Items["+ i +"].TimeLastUpdated"));

			items.add(itemsItem);
		}
		describeDBInstanceDataBloatResponse.setItems(items);
	 
	 	return describeDBInstanceDataBloatResponse;
	}
}