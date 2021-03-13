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

import com.aliyuncs.adb.model.v20190315.DescribeSlowLogRecordsResponse;
import com.aliyuncs.adb.model.v20190315.DescribeSlowLogRecordsResponse.SlowLogRecord;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSlowLogRecordsResponseUnmarshaller {

	public static DescribeSlowLogRecordsResponse unmarshall(DescribeSlowLogRecordsResponse describeSlowLogRecordsResponse, UnmarshallerContext _ctx) {
		
		describeSlowLogRecordsResponse.setRequestId(_ctx.stringValue("DescribeSlowLogRecordsResponse.RequestId"));
		describeSlowLogRecordsResponse.setTotalCount(_ctx.stringValue("DescribeSlowLogRecordsResponse.TotalCount"));
		describeSlowLogRecordsResponse.setPageSize(_ctx.stringValue("DescribeSlowLogRecordsResponse.PageSize"));
		describeSlowLogRecordsResponse.setPageNumber(_ctx.stringValue("DescribeSlowLogRecordsResponse.PageNumber"));
		describeSlowLogRecordsResponse.setDBClusterId(_ctx.stringValue("DescribeSlowLogRecordsResponse.DBClusterId"));

		List<SlowLogRecord> items = new ArrayList<SlowLogRecord>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSlowLogRecordsResponse.Items.Length"); i++) {
			SlowLogRecord slowLogRecord = new SlowLogRecord();
			slowLogRecord.setOutputSize(_ctx.stringValue("DescribeSlowLogRecordsResponse.Items["+ i +"].OutputSize"));
			slowLogRecord.setUserName(_ctx.stringValue("DescribeSlowLogRecordsResponse.Items["+ i +"].UserName"));
			slowLogRecord.setPeakMemoryUsage(_ctx.stringValue("DescribeSlowLogRecordsResponse.Items["+ i +"].PeakMemoryUsage"));
			slowLogRecord.setExecutionStartTime(_ctx.stringValue("DescribeSlowLogRecordsResponse.Items["+ i +"].ExecutionStartTime"));
			slowLogRecord.setParseRowCounts(_ctx.longValue("DescribeSlowLogRecordsResponse.Items["+ i +"].ParseRowCounts"));
			slowLogRecord.setQueryTime(_ctx.longValue("DescribeSlowLogRecordsResponse.Items["+ i +"].QueryTime"));
			slowLogRecord.setScanTime(_ctx.longValue("DescribeSlowLogRecordsResponse.Items["+ i +"].ScanTime"));
			slowLogRecord.setHostAddress(_ctx.stringValue("DescribeSlowLogRecordsResponse.Items["+ i +"].HostAddress"));
			slowLogRecord.setSQLText(_ctx.stringValue("DescribeSlowLogRecordsResponse.Items["+ i +"].SQLText"));
			slowLogRecord.setWallTime(_ctx.longValue("DescribeSlowLogRecordsResponse.Items["+ i +"].WallTime"));
			slowLogRecord.setScanRows(_ctx.longValue("DescribeSlowLogRecordsResponse.Items["+ i +"].ScanRows"));
			slowLogRecord.setState(_ctx.stringValue("DescribeSlowLogRecordsResponse.Items["+ i +"].State"));
			slowLogRecord.setReturnRowCounts(_ctx.longValue("DescribeSlowLogRecordsResponse.Items["+ i +"].ReturnRowCounts"));
			slowLogRecord.setPlanningTime(_ctx.longValue("DescribeSlowLogRecordsResponse.Items["+ i +"].PlanningTime"));
			slowLogRecord.setDBName(_ctx.stringValue("DescribeSlowLogRecordsResponse.Items["+ i +"].DBName"));
			slowLogRecord.setQueueTime(_ctx.longValue("DescribeSlowLogRecordsResponse.Items["+ i +"].QueueTime"));
			slowLogRecord.setProcessID(_ctx.stringValue("DescribeSlowLogRecordsResponse.Items["+ i +"].ProcessID"));
			slowLogRecord.setScanSize(_ctx.stringValue("DescribeSlowLogRecordsResponse.Items["+ i +"].ScanSize"));

			items.add(slowLogRecord);
		}
		describeSlowLogRecordsResponse.setItems(items);
	 
	 	return describeSlowLogRecordsResponse;
	}
}