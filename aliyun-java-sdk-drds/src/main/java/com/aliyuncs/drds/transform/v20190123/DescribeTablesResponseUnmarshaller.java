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

package com.aliyuncs.drds.transform.v20190123;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.drds.model.v20190123.DescribeTablesResponse;
import com.aliyuncs.drds.model.v20190123.DescribeTablesResponse.ListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTablesResponseUnmarshaller {

	public static DescribeTablesResponse unmarshall(DescribeTablesResponse describeTablesResponse, UnmarshallerContext context) {
		
		describeTablesResponse.setRequestId(context.stringValue("DescribeTablesResponse.RequestId"));
		describeTablesResponse.setSuccess(context.booleanValue("DescribeTablesResponse.Success"));
		describeTablesResponse.setPageNumber(context.integerValue("DescribeTablesResponse.PageNumber"));
		describeTablesResponse.setPageSize(context.integerValue("DescribeTablesResponse.PageSize"));
		describeTablesResponse.setTotal(context.integerValue("DescribeTablesResponse.Total"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < context.lengthValue("DescribeTablesResponse.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setTable(context.stringValue("DescribeTablesResponse.List["+ i +"].Table"));
			listItem.setShardKey(context.stringValue("DescribeTablesResponse.List["+ i +"].ShardKey"));
			listItem.setIsShard(context.booleanValue("DescribeTablesResponse.List["+ i +"].IsShard"));
			listItem.setIsLocked(context.booleanValue("DescribeTablesResponse.List["+ i +"].IsLocked"));
			listItem.setDbInstType(context.integerValue("DescribeTablesResponse.List["+ i +"].DbInstType"));
			listItem.setBroadcast(context.booleanValue("DescribeTablesResponse.List["+ i +"].Broadcast"));
			listItem.setAllowFullTableScan(context.booleanValue("DescribeTablesResponse.List["+ i +"].AllowFullTableScan"));

			list.add(listItem);
		}
		describeTablesResponse.setList(list);
	 
	 	return describeTablesResponse;
	}
}