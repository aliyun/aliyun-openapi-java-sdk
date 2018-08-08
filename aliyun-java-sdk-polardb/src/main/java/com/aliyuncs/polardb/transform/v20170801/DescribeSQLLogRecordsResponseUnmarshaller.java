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

import com.aliyuncs.polardb.model.v20170801.DescribeSQLLogRecordsResponse;
import com.aliyuncs.polardb.model.v20170801.DescribeSQLLogRecordsResponse.SQLLog;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSQLLogRecordsResponseUnmarshaller {

	public static DescribeSQLLogRecordsResponse unmarshall(DescribeSQLLogRecordsResponse describeSQLLogRecordsResponse, UnmarshallerContext context) {
		
		describeSQLLogRecordsResponse.setRequestId(context.stringValue("DescribeSQLLogRecordsResponse.RequestId"));
		describeSQLLogRecordsResponse.setStartTime(context.stringValue("DescribeSQLLogRecordsResponse.StartTime"));
		describeSQLLogRecordsResponse.setEndTime(context.stringValue("DescribeSQLLogRecordsResponse.EndTime"));
		describeSQLLogRecordsResponse.setTotalRecordCount(context.integerValue("DescribeSQLLogRecordsResponse.TotalRecordCount"));
		describeSQLLogRecordsResponse.setPageNumber(context.integerValue("DescribeSQLLogRecordsResponse.PageNumber"));
		describeSQLLogRecordsResponse.setPageRecordCount(context.integerValue("DescribeSQLLogRecordsResponse.PageRecordCount"));

		List<SQLLog> items = new ArrayList<SQLLog>();
		for (int i = 0; i < context.lengthValue("DescribeSQLLogRecordsResponse.Items.Length"); i++) {
			SQLLog sQLLog = new SQLLog();
			sQLLog.setDBName(context.stringValue("DescribeSQLLogRecordsResponse.Items["+ i +"].DBName"));
			sQLLog.setAccountName(context.stringValue("DescribeSQLLogRecordsResponse.Items["+ i +"].AccountName"));
			sQLLog.setHostAddress(context.stringValue("DescribeSQLLogRecordsResponse.Items["+ i +"].HostAddress"));
			sQLLog.setSQLText(context.stringValue("DescribeSQLLogRecordsResponse.Items["+ i +"].SQLText"));
			sQLLog.setTotalExecutionTimes(context.longValue("DescribeSQLLogRecordsResponse.Items["+ i +"].TotalExecutionTimes"));
			sQLLog.setReturnRowCounts(context.longValue("DescribeSQLLogRecordsResponse.Items["+ i +"].ReturnRowCounts"));
			sQLLog.setExecuteTime(context.stringValue("DescribeSQLLogRecordsResponse.Items["+ i +"].ExecuteTime"));
			sQLLog.setThreadID(context.stringValue("DescribeSQLLogRecordsResponse.Items["+ i +"].ThreadID"));

			items.add(sQLLog);
		}
		describeSQLLogRecordsResponse.setItems(items);
	 
	 	return describeSQLLogRecordsResponse;
	}
}