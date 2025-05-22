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
		describeSlowLogRecordsResponse.setCPUTime(_ctx.longValue("DescribeSlowLogRecordsResponse.CPUTime"));
		describeSlowLogRecordsResponse.setDBInstanceId(_ctx.stringValue("DescribeSlowLogRecordsResponse.DBInstanceId"));
		describeSlowLogRecordsResponse.setEngine(_ctx.stringValue("DescribeSlowLogRecordsResponse.Engine"));
		describeSlowLogRecordsResponse.setLastRowsAffectedCount(_ctx.longValue("DescribeSlowLogRecordsResponse.LastRowsAffectedCount"));
		describeSlowLogRecordsResponse.setLogicalIORead(_ctx.longValue("DescribeSlowLogRecordsResponse.LogicalIORead"));
		describeSlowLogRecordsResponse.setPageNumber(_ctx.integerValue("DescribeSlowLogRecordsResponse.PageNumber"));
		describeSlowLogRecordsResponse.setPageRecordCount(_ctx.integerValue("DescribeSlowLogRecordsResponse.PageRecordCount"));
		describeSlowLogRecordsResponse.setPhysicalIORead(_ctx.longValue("DescribeSlowLogRecordsResponse.PhysicalIORead"));
		describeSlowLogRecordsResponse.setRowsAffectedCount(_ctx.longValue("DescribeSlowLogRecordsResponse.RowsAffectedCount"));
		describeSlowLogRecordsResponse.setSQLHash(_ctx.stringValue("DescribeSlowLogRecordsResponse.SQLHash"));
		describeSlowLogRecordsResponse.setTotalRecordCount(_ctx.integerValue("DescribeSlowLogRecordsResponse.TotalRecordCount"));
		describeSlowLogRecordsResponse.setUserName(_ctx.stringValue("DescribeSlowLogRecordsResponse.UserName"));
		describeSlowLogRecordsResponse.setWritesIOCount(_ctx.longValue("DescribeSlowLogRecordsResponse.WritesIOCount"));

		List<SQLSlowRecord> items = new ArrayList<SQLSlowRecord>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSlowLogRecordsResponse.Items.Length"); i++) {
			SQLSlowRecord sQLSlowRecord = new SQLSlowRecord();
			sQLSlowRecord.setApplicationName(_ctx.stringValue("DescribeSlowLogRecordsResponse.Items["+ i +"].ApplicationName"));
			sQLSlowRecord.setClientHostName(_ctx.stringValue("DescribeSlowLogRecordsResponse.Items["+ i +"].ClientHostName"));
			sQLSlowRecord.setCpuTime(_ctx.longValue("DescribeSlowLogRecordsResponse.Items["+ i +"].CpuTime"));
			sQLSlowRecord.setDBName(_ctx.stringValue("DescribeSlowLogRecordsResponse.Items["+ i +"].DBName"));
			sQLSlowRecord.setExecutionStartTime(_ctx.stringValue("DescribeSlowLogRecordsResponse.Items["+ i +"].ExecutionStartTime"));
			sQLSlowRecord.setHostAddress(_ctx.stringValue("DescribeSlowLogRecordsResponse.Items["+ i +"].HostAddress"));
			sQLSlowRecord.setLastRowsAffectedCount(_ctx.longValue("DescribeSlowLogRecordsResponse.Items["+ i +"].LastRowsAffectedCount"));
			sQLSlowRecord.setLockTimes(_ctx.longValue("DescribeSlowLogRecordsResponse.Items["+ i +"].LockTimes"));
			sQLSlowRecord.setLogicalIORead(_ctx.longValue("DescribeSlowLogRecordsResponse.Items["+ i +"].LogicalIORead"));
			sQLSlowRecord.setParseRowCounts(_ctx.longValue("DescribeSlowLogRecordsResponse.Items["+ i +"].ParseRowCounts"));
			sQLSlowRecord.setPhysicalIORead(_ctx.longValue("DescribeSlowLogRecordsResponse.Items["+ i +"].PhysicalIORead"));
			sQLSlowRecord.setQueryTimeMS(_ctx.longValue("DescribeSlowLogRecordsResponse.Items["+ i +"].QueryTimeMS"));
			sQLSlowRecord.setQueryTimes(_ctx.longValue("DescribeSlowLogRecordsResponse.Items["+ i +"].QueryTimes"));
			sQLSlowRecord.setReturnRowCounts(_ctx.longValue("DescribeSlowLogRecordsResponse.Items["+ i +"].ReturnRowCounts"));
			sQLSlowRecord.setRowsAffectedCount(_ctx.longValue("DescribeSlowLogRecordsResponse.Items["+ i +"].RowsAffectedCount"));
			sQLSlowRecord.setSQLHash(_ctx.stringValue("DescribeSlowLogRecordsResponse.Items["+ i +"].SQLHash"));
			sQLSlowRecord.setSQLText(_ctx.stringValue("DescribeSlowLogRecordsResponse.Items["+ i +"].SQLText"));
			sQLSlowRecord.setUserName(_ctx.stringValue("DescribeSlowLogRecordsResponse.Items["+ i +"].UserName"));
			sQLSlowRecord.setWriteIOCount(_ctx.longValue("DescribeSlowLogRecordsResponse.Items["+ i +"].WriteIOCount"));

			items.add(sQLSlowRecord);
		}
		describeSlowLogRecordsResponse.setItems(items);
	 
	 	return describeSlowLogRecordsResponse;
	}
}