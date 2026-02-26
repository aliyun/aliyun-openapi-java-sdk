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

import com.aliyuncs.gpdb.model.v20160503.DescribeDBInstanceErrorLogResponse;
import com.aliyuncs.gpdb.model.v20160503.DescribeDBInstanceErrorLogResponse.ItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBInstanceErrorLogResponseUnmarshaller {

	public static DescribeDBInstanceErrorLogResponse unmarshall(DescribeDBInstanceErrorLogResponse describeDBInstanceErrorLogResponse, UnmarshallerContext _ctx) {
		
		describeDBInstanceErrorLogResponse.setRequestId(_ctx.stringValue("DescribeDBInstanceErrorLogResponse.RequestId"));
		describeDBInstanceErrorLogResponse.setTotalCount(_ctx.integerValue("DescribeDBInstanceErrorLogResponse.TotalCount"));
		describeDBInstanceErrorLogResponse.setPageNumber(_ctx.integerValue("DescribeDBInstanceErrorLogResponse.PageNumber"));

		List<ItemsItem> items = new ArrayList<ItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBInstanceErrorLogResponse.Items.Length"); i++) {
			ItemsItem itemsItem = new ItemsItem();
			itemsItem.setTime(_ctx.longValue("DescribeDBInstanceErrorLogResponse.Items["+ i +"].Time"));
			itemsItem.setLogLevel(_ctx.stringValue("DescribeDBInstanceErrorLogResponse.Items["+ i +"].LogLevel"));
			itemsItem.setUser(_ctx.stringValue("DescribeDBInstanceErrorLogResponse.Items["+ i +"].User"));
			itemsItem.setDatabase(_ctx.stringValue("DescribeDBInstanceErrorLogResponse.Items["+ i +"].Database"));
			itemsItem.setHost(_ctx.stringValue("DescribeDBInstanceErrorLogResponse.Items["+ i +"].Host"));
			itemsItem.setLogContext(_ctx.stringValue("DescribeDBInstanceErrorLogResponse.Items["+ i +"].LogContext"));

			items.add(itemsItem);
		}
		describeDBInstanceErrorLogResponse.setItems(items);
	 
	 	return describeDBInstanceErrorLogResponse;
	}
}