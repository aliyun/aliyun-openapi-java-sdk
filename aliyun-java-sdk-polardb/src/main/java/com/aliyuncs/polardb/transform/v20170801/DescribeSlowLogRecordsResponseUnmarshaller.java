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

package com.aliyuncs.polardb.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.polardb.model.v20170801.DescribeSlowLogRecordsResponse;
import com.aliyuncs.polardb.model.v20170801.DescribeSlowLogRecordsResponse.SQLSlowRecord;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSlowLogRecordsResponseUnmarshaller {

	public static DescribeSlowLogRecordsResponse unmarshall(DescribeSlowLogRecordsResponse describeSlowLogRecordsResponse, UnmarshallerContext context) {
		
		describeSlowLogRecordsResponse.setRequestId(context.stringValue("DescribeSlowLogRecordsResponse.RequestId"));
		describeSlowLogRecordsResponse.setEngine(context.stringValue("DescribeSlowLogRecordsResponse.Engine"));
		describeSlowLogRecordsResponse.setTotalRecordCount(context.integerValue("DescribeSlowLogRecordsResponse.TotalRecordCount"));
		describeSlowLogRecordsResponse.setPageNumber(context.integerValue("DescribeSlowLogRecordsResponse.PageNumber"));
		describeSlowLogRecordsResponse.setPageRecordCount(context.integerValue("DescribeSlowLogRecordsResponse.PageRecordCount"));

		List<SQLSlowRecord> items = new ArrayList<SQLSlowRecord>();
		for (int i = 0; i < context.lengthValue("DescribeSlowLogRecordsResponse.Items.Length"); i++) {
			SQLSlowRecord sQLSlowRecord = new SQLSlowRecord();
			sQLSlowRecord.setHostAddress(context.stringValue("DescribeSlowLogRecordsResponse.Items["+ i +"].HostAddress"));
			sQLSlowRecord.setDBName(context.stringValue("DescribeSlowLogRecordsResponse.Items["+ i +"].DBName"));
			sQLSlowRecord.setSQLText(context.stringValue("DescribeSlowLogRecordsResponse.Items["+ i +"].SQLText"));
			sQLSlowRecord.setQueryTimes(context.longValue("DescribeSlowLogRecordsResponse.Items["+ i +"].QueryTimes"));
			sQLSlowRecord.setLockTimes(context.longValue("DescribeSlowLogRecordsResponse.Items["+ i +"].LockTimes"));
			sQLSlowRecord.setParseRowCounts(context.longValue("DescribeSlowLogRecordsResponse.Items["+ i +"].ParseRowCounts"));
			sQLSlowRecord.setReturnRowCounts(context.longValue("DescribeSlowLogRecordsResponse.Items["+ i +"].ReturnRowCounts"));
			sQLSlowRecord.setExecutionStartTime(context.stringValue("DescribeSlowLogRecordsResponse.Items["+ i +"].ExecutionStartTime"));

			items.add(sQLSlowRecord);
		}
		describeSlowLogRecordsResponse.setItems(items);
	 
	 	return describeSlowLogRecordsResponse;
	}
}