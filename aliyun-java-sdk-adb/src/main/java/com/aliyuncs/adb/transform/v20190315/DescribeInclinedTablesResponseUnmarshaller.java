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

import com.aliyuncs.adb.model.v20190315.DescribeInclinedTablesResponse;
import com.aliyuncs.adb.model.v20190315.DescribeInclinedTablesResponse.Table;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInclinedTablesResponseUnmarshaller {

	public static DescribeInclinedTablesResponse unmarshall(DescribeInclinedTablesResponse describeInclinedTablesResponse, UnmarshallerContext _ctx) {
		
		describeInclinedTablesResponse.setRequestId(_ctx.stringValue("DescribeInclinedTablesResponse.RequestId"));
		describeInclinedTablesResponse.setTotalCount(_ctx.stringValue("DescribeInclinedTablesResponse.TotalCount"));
		describeInclinedTablesResponse.setPageNumber(_ctx.stringValue("DescribeInclinedTablesResponse.PageNumber"));
		describeInclinedTablesResponse.setPageSize(_ctx.stringValue("DescribeInclinedTablesResponse.PageSize"));

		List<Table> items = new ArrayList<Table>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInclinedTablesResponse.Items.Length"); i++) {
			Table table = new Table();
			table.setSchema(_ctx.stringValue("DescribeInclinedTablesResponse.Items["+ i +"].Schema"));
			table.setName(_ctx.stringValue("DescribeInclinedTablesResponse.Items["+ i +"].Name"));
			table.setType(_ctx.stringValue("DescribeInclinedTablesResponse.Items["+ i +"].Type"));
			table.setSize(_ctx.longValue("DescribeInclinedTablesResponse.Items["+ i +"].Size"));
			table.setIsIncline(_ctx.booleanValue("DescribeInclinedTablesResponse.Items["+ i +"].IsIncline"));

			items.add(table);
		}
		describeInclinedTablesResponse.setItems(items);
	 
	 	return describeInclinedTablesResponse;
	}
}