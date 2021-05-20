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

import com.aliyuncs.gpdb.model.v20160503.DescribeSlowSQLLogsResponse;
import com.aliyuncs.gpdb.model.v20160503.DescribeSlowSQLLogsResponse.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSlowSQLLogsResponseUnmarshaller {

	public static DescribeSlowSQLLogsResponse unmarshall(DescribeSlowSQLLogsResponse describeSlowSQLLogsResponse, UnmarshallerContext _ctx) {
		
		describeSlowSQLLogsResponse.setRequestId(_ctx.stringValue("DescribeSlowSQLLogsResponse.RequestId"));
		describeSlowSQLLogsResponse.setPageRecordCount(_ctx.integerValue("DescribeSlowSQLLogsResponse.PageRecordCount"));
		describeSlowSQLLogsResponse.setPageNumber(_ctx.integerValue("DescribeSlowSQLLogsResponse.PageNumber"));

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSlowSQLLogsResponse.Items.Length"); i++) {
			Item item = new Item();
			item.setExecuteCost(_ctx.floatValue("DescribeSlowSQLLogsResponse.Items["+ i +"].ExecuteCost"));
			item.setSQLPlan(_ctx.stringValue("DescribeSlowSQLLogsResponse.Items["+ i +"].SQLPlan"));
			item.setDBRole(_ctx.stringValue("DescribeSlowSQLLogsResponse.Items["+ i +"].DBRole"));
			item.setQueryId(_ctx.stringValue("DescribeSlowSQLLogsResponse.Items["+ i +"].QueryId"));
			item.setSourcePort(_ctx.integerValue("DescribeSlowSQLLogsResponse.Items["+ i +"].SourcePort"));
			item.setSQLText(_ctx.stringValue("DescribeSlowSQLLogsResponse.Items["+ i +"].SQLText"));
			item.setSourceIP(_ctx.stringValue("DescribeSlowSQLLogsResponse.Items["+ i +"].SourceIP"));
			item.setReturnRowCounts(_ctx.longValue("DescribeSlowSQLLogsResponse.Items["+ i +"].ReturnRowCounts"));
			item.setDBName(_ctx.stringValue("DescribeSlowSQLLogsResponse.Items["+ i +"].DBName"));
			item.setOperationType(_ctx.stringValue("DescribeSlowSQLLogsResponse.Items["+ i +"].OperationType"));
			item.setScanRowCounts(_ctx.longValue("DescribeSlowSQLLogsResponse.Items["+ i +"].ScanRowCounts"));
			item.setAccountName(_ctx.stringValue("DescribeSlowSQLLogsResponse.Items["+ i +"].AccountName"));
			item.setOperationExecuteTime(_ctx.stringValue("DescribeSlowSQLLogsResponse.Items["+ i +"].OperationExecuteTime"));
			item.setExecuteState(_ctx.stringValue("DescribeSlowSQLLogsResponse.Items["+ i +"].ExecuteState"));
			item.setOperationClass(_ctx.stringValue("DescribeSlowSQLLogsResponse.Items["+ i +"].OperationClass"));

			items.add(item);
		}
		describeSlowSQLLogsResponse.setItems(items);
	 
	 	return describeSlowSQLLogsResponse;
	}
}