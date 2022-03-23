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
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSlowLogRecordsResponseUnmarshaller {

	public static DescribeSlowLogRecordsResponse unmarshall(DescribeSlowLogRecordsResponse describeSlowLogRecordsResponse, UnmarshallerContext _ctx) {
		
		describeSlowLogRecordsResponse.setRequestId(_ctx.stringValue("DescribeSlowLogRecordsResponse.RequestId"));
		describeSlowLogRecordsResponse.setStartTime(_ctx.stringValue("DescribeSlowLogRecordsResponse.StartTime"));
		describeSlowLogRecordsResponse.setPageRecordCount(_ctx.integerValue("DescribeSlowLogRecordsResponse.PageRecordCount"));
		describeSlowLogRecordsResponse.setTotalRecordCount(_ctx.integerValue("DescribeSlowLogRecordsResponse.TotalRecordCount"));
		describeSlowLogRecordsResponse.setPageSize(_ctx.integerValue("DescribeSlowLogRecordsResponse.PageSize"));
		describeSlowLogRecordsResponse.setInstanceId(_ctx.stringValue("DescribeSlowLogRecordsResponse.InstanceId"));
		describeSlowLogRecordsResponse.setEngine(_ctx.stringValue("DescribeSlowLogRecordsResponse.Engine"));
		describeSlowLogRecordsResponse.setPageNumber(_ctx.integerValue("DescribeSlowLogRecordsResponse.PageNumber"));

		List<LogRecords> items = new ArrayList<LogRecords>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSlowLogRecordsResponse.Items.Length"); i++) {
			LogRecords logRecords = new LogRecords();
			logRecords.setAccount(_ctx.stringValue("DescribeSlowLogRecordsResponse.Items["+ i +"].Account"));
			logRecords.setElapsedTime(_ctx.longValue("DescribeSlowLogRecordsResponse.Items["+ i +"].ElapsedTime"));
			logRecords.setCommand(_ctx.stringValue("DescribeSlowLogRecordsResponse.Items["+ i +"].Command"));
			logRecords.setDBName(_ctx.stringValue("DescribeSlowLogRecordsResponse.Items["+ i +"].DBName"));
			logRecords.setExecuteTime(_ctx.stringValue("DescribeSlowLogRecordsResponse.Items["+ i +"].ExecuteTime"));
			logRecords.setDataBaseName(_ctx.stringValue("DescribeSlowLogRecordsResponse.Items["+ i +"].DataBaseName"));
			logRecords.setNodeId(_ctx.stringValue("DescribeSlowLogRecordsResponse.Items["+ i +"].NodeId"));
			logRecords.setAccountName(_ctx.stringValue("DescribeSlowLogRecordsResponse.Items["+ i +"].AccountName"));
			logRecords.setIPAddress(_ctx.stringValue("DescribeSlowLogRecordsResponse.Items["+ i +"].IPAddress"));

			items.add(logRecords);
		}
		describeSlowLogRecordsResponse.setItems(items);
	 
	 	return describeSlowLogRecordsResponse;
	}
}