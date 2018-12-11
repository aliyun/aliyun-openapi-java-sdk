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

package com.aliyuncs.r_kvstore.transform.v20150101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.r_kvstore.model.v20150101.DescribeSlowLogRecordsResponse;
import com.aliyuncs.r_kvstore.model.v20150101.DescribeSlowLogRecordsResponse.LogRecords;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSlowLogRecordsResponseUnmarshaller {

	public static DescribeSlowLogRecordsResponse unmarshall(DescribeSlowLogRecordsResponse describeSlowLogRecordsResponse, UnmarshallerContext context) {
		
		describeSlowLogRecordsResponse.setRequestId(context.stringValue("DescribeSlowLogRecordsResponse.RequestId"));
		describeSlowLogRecordsResponse.setInstanceId(context.stringValue("DescribeSlowLogRecordsResponse.InstanceId"));
		describeSlowLogRecordsResponse.setStartTime(context.stringValue("DescribeSlowLogRecordsResponse.StartTime"));
		describeSlowLogRecordsResponse.setEngine(context.stringValue("DescribeSlowLogRecordsResponse.Engine"));
		describeSlowLogRecordsResponse.setTotalRecordCount(context.integerValue("DescribeSlowLogRecordsResponse.TotalRecordCount"));
		describeSlowLogRecordsResponse.setPageNumber(context.integerValue("DescribeSlowLogRecordsResponse.PageNumber"));
		describeSlowLogRecordsResponse.setPageRecordCount(context.integerValue("DescribeSlowLogRecordsResponse.PageRecordCount"));

		List<LogRecords> items = new ArrayList<LogRecords>();
		for (int i = 0; i < context.lengthValue("DescribeSlowLogRecordsResponse.Items.Length"); i++) {
			LogRecords logRecords = new LogRecords();
			logRecords.setNodeId(context.stringValue("DescribeSlowLogRecordsResponse.Items["+ i +"].NodeId"));
			logRecords.setIPAddress(context.stringValue("DescribeSlowLogRecordsResponse.Items["+ i +"].IPAddress"));
			logRecords.setDBName(context.stringValue("DescribeSlowLogRecordsResponse.Items["+ i +"].DBName"));
			logRecords.setDataBaseName(context.stringValue("DescribeSlowLogRecordsResponse.Items["+ i +"].DataBaseName"));
			logRecords.setCommand(context.stringValue("DescribeSlowLogRecordsResponse.Items["+ i +"].Command"));
			logRecords.setElapsedTime(context.longValue("DescribeSlowLogRecordsResponse.Items["+ i +"].ElapsedTime"));
			logRecords.setExecuteTime(context.stringValue("DescribeSlowLogRecordsResponse.Items["+ i +"].ExecuteTime"));
			logRecords.setAccount(context.stringValue("DescribeSlowLogRecordsResponse.Items["+ i +"].Account"));
			logRecords.setAccountName(context.stringValue("DescribeSlowLogRecordsResponse.Items["+ i +"].AccountName"));

			items.add(logRecords);
		}
		describeSlowLogRecordsResponse.setItems(items);
	 
	 	return describeSlowLogRecordsResponse;
	}
}