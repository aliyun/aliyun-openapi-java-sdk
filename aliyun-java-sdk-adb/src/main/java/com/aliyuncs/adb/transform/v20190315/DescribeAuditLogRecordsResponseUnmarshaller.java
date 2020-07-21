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

import com.aliyuncs.adb.model.v20190315.DescribeAuditLogRecordsResponse;
import com.aliyuncs.adb.model.v20190315.DescribeAuditLogRecordsResponse.SlowLogRecord;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAuditLogRecordsResponseUnmarshaller {

	public static DescribeAuditLogRecordsResponse unmarshall(DescribeAuditLogRecordsResponse describeAuditLogRecordsResponse, UnmarshallerContext _ctx) {
		
		describeAuditLogRecordsResponse.setRequestId(_ctx.stringValue("DescribeAuditLogRecordsResponse.RequestId"));
		describeAuditLogRecordsResponse.setTotalCount(_ctx.stringValue("DescribeAuditLogRecordsResponse.TotalCount"));
		describeAuditLogRecordsResponse.setPageNumber(_ctx.stringValue("DescribeAuditLogRecordsResponse.PageNumber"));
		describeAuditLogRecordsResponse.setPageSize(_ctx.stringValue("DescribeAuditLogRecordsResponse.PageSize"));
		describeAuditLogRecordsResponse.setDBClusterId(_ctx.stringValue("DescribeAuditLogRecordsResponse.DBClusterId"));

		List<SlowLogRecord> items = new ArrayList<SlowLogRecord>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAuditLogRecordsResponse.Items.Length"); i++) {
			SlowLogRecord slowLogRecord = new SlowLogRecord();
			slowLogRecord.setHostAddress(_ctx.stringValue("DescribeAuditLogRecordsResponse.Items["+ i +"].HostAddress"));
			slowLogRecord.setDBName(_ctx.stringValue("DescribeAuditLogRecordsResponse.Items["+ i +"].DBName"));
			slowLogRecord.setSQLText(_ctx.stringValue("DescribeAuditLogRecordsResponse.Items["+ i +"].SQLText"));
			slowLogRecord.setSQLType(_ctx.stringValue("DescribeAuditLogRecordsResponse.Items["+ i +"].SQLType"));
			slowLogRecord.setConnId(_ctx.stringValue("DescribeAuditLogRecordsResponse.Items["+ i +"].ConnId"));
			slowLogRecord.setExecuteTime(_ctx.stringValue("DescribeAuditLogRecordsResponse.Items["+ i +"].ExecuteTime"));
			slowLogRecord.setSucceed(_ctx.stringValue("DescribeAuditLogRecordsResponse.Items["+ i +"].Succeed"));
			slowLogRecord.setTotalTime(_ctx.stringValue("DescribeAuditLogRecordsResponse.Items["+ i +"].TotalTime"));
			slowLogRecord.setProcessID(_ctx.stringValue("DescribeAuditLogRecordsResponse.Items["+ i +"].ProcessID"));

			items.add(slowLogRecord);
		}
		describeAuditLogRecordsResponse.setItems(items);
	 
	 	return describeAuditLogRecordsResponse;
	}
}