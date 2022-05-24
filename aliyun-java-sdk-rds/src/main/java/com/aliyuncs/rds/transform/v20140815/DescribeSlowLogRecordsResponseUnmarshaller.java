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

package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.DescribeSlowLogRecordsResponse;
import com.aliyuncs.rds.model.v20140815.DescribeSlowLogRecordsResponse.SQLSlowRecord;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSlowLogRecordsResponseUnmarshaller {

	public static DescribeSlowLogRecordsResponse unmarshall(DescribeSlowLogRecordsResponse describeSlowLogRecordsResponse, UnmarshallerContext _ctx) {
		
		describeSlowLogRecordsResponse.setRequestId(_ctx.stringValue("DescribeSlowLogRecordsResponse.RequestId"));
		describeSlowLogRecordsResponse.setRowsAffectedCount(_ctx.longValue("DescribeSlowLogRecordsResponse.RowsAffectedCount"));
		describeSlowLogRecordsResponse.setPageRecordCount(_ctx.integerValue("DescribeSlowLogRecordsResponse.PageRecordCount"));
		describeSlowLogRecordsResponse.setWritesIOCount(_ctx.longValue("DescribeSlowLogRecordsResponse.WritesIOCount"));
		describeSlowLogRecordsResponse.setSQLHash(_ctx.stringValue("DescribeSlowLogRecordsResponse.SQLHash"));
		describeSlowLogRecordsResponse.setLogicalIORead(_ctx.longValue("DescribeSlowLogRecordsResponse.LogicalIORead"));
		describeSlowLogRecordsResponse.setPhysicalIORead(_ctx.longValue("DescribeSlowLogRecordsResponse.PhysicalIORead"));
		describeSlowLogRecordsResponse.setTotalRecordCount(_ctx.integerValue("DescribeSlowLogRecordsResponse.TotalRecordCount"));
		describeSlowLogRecordsResponse.setDBInstanceId(_ctx.stringValue("DescribeSlowLogRecordsResponse.DBInstanceId"));
		describeSlowLogRecordsResponse.setEngine(_ctx.stringValue("DescribeSlowLogRecordsResponse.Engine"));
		describeSlowLogRecordsResponse.setPageNumber(_ctx.integerValue("DescribeSlowLogRecordsResponse.PageNumber"));
		describeSlowLogRecordsResponse.setCPUTime(_ctx.longValue("DescribeSlowLogRecordsResponse.CPUTime"));
		describeSlowLogRecordsResponse.setUserName(_ctx.stringValue("DescribeSlowLogRecordsResponse.UserName"));
		describeSlowLogRecordsResponse.setLastRowsAffectedCount(_ctx.longValue("DescribeSlowLogRecordsResponse.LastRowsAffectedCount"));

		List<SQLSlowRecord> items = new ArrayList<SQLSlowRecord>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSlowLogRecordsResponse.Items.Length"); i++) {
			SQLSlowRecord sQLSlowRecord = new SQLSlowRecord();
			sQLSlowRecord.setHostAddress(_ctx.stringValue("DescribeSlowLogRecordsResponse.Items["+ i +"].HostAddress"));
			sQLSlowRecord.setRowsAffectedCount(_ctx.longValue("DescribeSlowLogRecordsResponse.Items["+ i +"].RowsAffectedCount"));
			sQLSlowRecord.setQueryTimes(_ctx.longValue("DescribeSlowLogRecordsResponse.Items["+ i +"].QueryTimes"));
			sQLSlowRecord.setSQLText(_ctx.stringValue("DescribeSlowLogRecordsResponse.Items["+ i +"].SQLText"));
			sQLSlowRecord.setCpuTime(_ctx.longValue("DescribeSlowLogRecordsResponse.Items["+ i +"].CpuTime"));
			sQLSlowRecord.setQueryTimeMS(_ctx.longValue("DescribeSlowLogRecordsResponse.Items["+ i +"].QueryTimeMS"));
			sQLSlowRecord.setApplicationName(_ctx.stringValue("DescribeSlowLogRecordsResponse.Items["+ i +"].ApplicationName"));
			sQLSlowRecord.setLockTimes(_ctx.longValue("DescribeSlowLogRecordsResponse.Items["+ i +"].LockTimes"));
			sQLSlowRecord.setExecutionStartTime(_ctx.stringValue("DescribeSlowLogRecordsResponse.Items["+ i +"].ExecutionStartTime"));
			sQLSlowRecord.setLogicalIORead(_ctx.longValue("DescribeSlowLogRecordsResponse.Items["+ i +"].LogicalIORead"));
			sQLSlowRecord.setWriteIOCount(_ctx.longValue("DescribeSlowLogRecordsResponse.Items["+ i +"].WriteIOCount"));
			sQLSlowRecord.setPhysicalIORead(_ctx.longValue("DescribeSlowLogRecordsResponse.Items["+ i +"].PhysicalIORead"));
			sQLSlowRecord.setReturnRowCounts(_ctx.longValue("DescribeSlowLogRecordsResponse.Items["+ i +"].ReturnRowCounts"));
			sQLSlowRecord.setParseRowCounts(_ctx.longValue("DescribeSlowLogRecordsResponse.Items["+ i +"].ParseRowCounts"));
			sQLSlowRecord.setDBName(_ctx.stringValue("DescribeSlowLogRecordsResponse.Items["+ i +"].DBName"));
			sQLSlowRecord.setClientHostName(_ctx.stringValue("DescribeSlowLogRecordsResponse.Items["+ i +"].ClientHostName"));
			sQLSlowRecord.setUserName(_ctx.stringValue("DescribeSlowLogRecordsResponse.Items["+ i +"].UserName"));
			sQLSlowRecord.setLastRowsAffectedCount(_ctx.longValue("DescribeSlowLogRecordsResponse.Items["+ i +"].LastRowsAffectedCount"));

			items.add(sQLSlowRecord);
		}
		describeSlowLogRecordsResponse.setItems(items);
	 
	 	return describeSlowLogRecordsResponse;
	}
}