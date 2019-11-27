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

	public static DescribeTablesResponse unmarshall(DescribeTablesResponse describeTablesResponse, UnmarshallerContext _ctx) {
		
		describeTablesResponse.setRequestId(_ctx.stringValue("DescribeTablesResponse.RequestId"));
		describeTablesResponse.setSuccess(_ctx.booleanValue("DescribeTablesResponse.Success"));
		describeTablesResponse.setPageNumber(_ctx.integerValue("DescribeTablesResponse.PageNumber"));
		describeTablesResponse.setPageSize(_ctx.integerValue("DescribeTablesResponse.PageSize"));
		describeTablesResponse.setTotal(_ctx.integerValue("DescribeTablesResponse.Total"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTablesResponse.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setTable(_ctx.stringValue("DescribeTablesResponse.List["+ i +"].Table"));
			listItem.setShardKey(_ctx.stringValue("DescribeTablesResponse.List["+ i +"].ShardKey"));
			listItem.setIsShard(_ctx.booleanValue("DescribeTablesResponse.List["+ i +"].IsShard"));
			listItem.setIsLocked(_ctx.booleanValue("DescribeTablesResponse.List["+ i +"].IsLocked"));
			listItem.setDbInstType(_ctx.integerValue("DescribeTablesResponse.List["+ i +"].DbInstType"));
			listItem.setBroadcast(_ctx.booleanValue("DescribeTablesResponse.List["+ i +"].Broadcast"));
			listItem.setAllowFullTableScan(_ctx.booleanValue("DescribeTablesResponse.List["+ i +"].AllowFullTableScan"));
			listItem.setStatus(_ctx.integerValue("DescribeTablesResponse.List["+ i +"].Status"));

			list.add(listItem);
		}
		describeTablesResponse.setList(list);
	 
	 	return describeTablesResponse;
	}
}