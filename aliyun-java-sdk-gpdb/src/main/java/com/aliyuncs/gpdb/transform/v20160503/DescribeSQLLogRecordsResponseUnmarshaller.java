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

import com.aliyuncs.gpdb.model.v20160503.DescribeSQLLogRecordsResponse;
import com.aliyuncs.gpdb.model.v20160503.DescribeSQLLogRecordsResponse.SQLRecord;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSQLLogRecordsResponseUnmarshaller {

	public static DescribeSQLLogRecordsResponse unmarshall(DescribeSQLLogRecordsResponse describeSQLLogRecordsResponse, UnmarshallerContext context) {
		
		describeSQLLogRecordsResponse.setRequestId(context.stringValue("DescribeSQLLogRecordsResponse.RequestId"));
		describeSQLLogRecordsResponse.setTotalRecordCount(context.integerValue("DescribeSQLLogRecordsResponse.TotalRecordCount"));
		describeSQLLogRecordsResponse.setPageNumber(context.integerValue("DescribeSQLLogRecordsResponse.PageNumber"));
		describeSQLLogRecordsResponse.setPageRecordCount(context.integerValue("DescribeSQLLogRecordsResponse.PageRecordCount"));

		List<SQLRecord> items = new ArrayList<SQLRecord>();
		for (int i = 0; i < context.lengthValue("DescribeSQLLogRecordsResponse.Items.Length"); i++) {
			SQLRecord sQLRecord = new SQLRecord();
			sQLRecord.setDBName(context.stringValue("DescribeSQLLogRecordsResponse.Items["+ i +"].DBName"));
			sQLRecord.setAccountName(context.stringValue("DescribeSQLLogRecordsResponse.Items["+ i +"].AccountName"));
			sQLRecord.setHostAddress(context.stringValue("DescribeSQLLogRecordsResponse.Items["+ i +"].HostAddress"));
			sQLRecord.setSQLText(context.stringValue("DescribeSQLLogRecordsResponse.Items["+ i +"].SQLText"));
			sQLRecord.setTotalExecutionTimes(context.longValue("DescribeSQLLogRecordsResponse.Items["+ i +"].TotalExecutionTimes"));
			sQLRecord.setReturnRowCounts(context.longValue("DescribeSQLLogRecordsResponse.Items["+ i +"].ReturnRowCounts"));
			sQLRecord.setExecuteTime(context.stringValue("DescribeSQLLogRecordsResponse.Items["+ i +"].ExecuteTime"));
			sQLRecord.setThreadID(context.stringValue("DescribeSQLLogRecordsResponse.Items["+ i +"].ThreadID"));

			items.add(sQLRecord);
		}
		describeSQLLogRecordsResponse.setItems(items);
	 
	 	return describeSQLLogRecordsResponse;
	}
}