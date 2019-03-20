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

package com.aliyuncs.alidns.transform.v20150109;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.alidns.model.v20150109.DescribeRecordLogsResponse;
import com.aliyuncs.alidns.model.v20150109.DescribeRecordLogsResponse.RecordLog;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRecordLogsResponseUnmarshaller {

	public static DescribeRecordLogsResponse unmarshall(DescribeRecordLogsResponse describeRecordLogsResponse, UnmarshallerContext context) {
		
		describeRecordLogsResponse.setRequestId(context.stringValue("DescribeRecordLogsResponse.RequestId"));
		describeRecordLogsResponse.setTotalCount(context.longValue("DescribeRecordLogsResponse.TotalCount"));
		describeRecordLogsResponse.setPageNumber(context.longValue("DescribeRecordLogsResponse.PageNumber"));
		describeRecordLogsResponse.setPageSize(context.longValue("DescribeRecordLogsResponse.PageSize"));

		List<RecordLog> recordLogs = new ArrayList<RecordLog>();
		for (int i = 0; i < context.lengthValue("DescribeRecordLogsResponse.RecordLogs.Length"); i++) {
			RecordLog recordLog = new RecordLog();
			recordLog.setActionTime(context.stringValue("DescribeRecordLogsResponse.RecordLogs["+ i +"].ActionTime"));
			recordLog.setActionTimestamp(context.longValue("DescribeRecordLogsResponse.RecordLogs["+ i +"].ActionTimestamp"));
			recordLog.setAction(context.stringValue("DescribeRecordLogsResponse.RecordLogs["+ i +"].Action"));
			recordLog.setMessage(context.stringValue("DescribeRecordLogsResponse.RecordLogs["+ i +"].Message"));
			recordLog.setClientIp(context.stringValue("DescribeRecordLogsResponse.RecordLogs["+ i +"].ClientIp"));

			recordLogs.add(recordLog);
		}
		describeRecordLogsResponse.setRecordLogs(recordLogs);
	 
	 	return describeRecordLogsResponse;
	}
}