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

import com.aliyuncs.rds.model.v20140815.DescribeSQLLogRecordsListResponse;
import com.aliyuncs.rds.model.v20140815.DescribeSQLLogRecordsListResponse.SQLLogRecord;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSQLLogRecordsListResponseUnmarshaller {

	public static DescribeSQLLogRecordsListResponse unmarshall(DescribeSQLLogRecordsListResponse describeSQLLogRecordsListResponse, UnmarshallerContext context) {
		
		describeSQLLogRecordsListResponse.setRequestId(context.stringValue("DescribeSQLLogRecordsListResponse.RequestId"));
		describeSQLLogRecordsListResponse.setMaxRecordsPerPage(context.integerValue("DescribeSQLLogRecordsListResponse.MaxRecordsPerPage"));
		describeSQLLogRecordsListResponse.setItemsNumbers(context.integerValue("DescribeSQLLogRecordsListResponse.ItemsNumbers"));
		describeSQLLogRecordsListResponse.setEndTime(context.stringValue("DescribeSQLLogRecordsListResponse.EndTime"));
		describeSQLLogRecordsListResponse.setStartTime(context.stringValue("DescribeSQLLogRecordsListResponse.StartTime"));
		describeSQLLogRecordsListResponse.setDBInstanceID(context.stringValue("DescribeSQLLogRecordsListResponse.DBInstanceID"));
		describeSQLLogRecordsListResponse.setTotalRecords(context.integerValue("DescribeSQLLogRecordsListResponse.TotalRecords"));

		List<SQLLogRecord> items = new ArrayList<SQLLogRecord>();
		for (int i = 0; i < context.lengthValue("DescribeSQLLogRecordsListResponse.Items.Length"); i++) {
			SQLLogRecord sQLLogRecord = new SQLLogRecord();
			sQLLogRecord.setDBName(context.stringValue("DescribeSQLLogRecordsListResponse.Items["+ i +"].DBName"));
			sQLLogRecord.setAccountName(context.stringValue("DescribeSQLLogRecordsListResponse.Items["+ i +"].AccountName"));
			sQLLogRecord.setHostAddress(context.stringValue("DescribeSQLLogRecordsListResponse.Items["+ i +"].HostAddress"));
			sQLLogRecord.setSQLText(context.stringValue("DescribeSQLLogRecordsListResponse.Items["+ i +"].SQLText"));
			sQLLogRecord.setConsume(context.longValue("DescribeSQLLogRecordsListResponse.Items["+ i +"].Consume"));
			sQLLogRecord.setScanRows(context.longValue("DescribeSQLLogRecordsListResponse.Items["+ i +"].ScanRows"));
			sQLLogRecord.setUpdateRows(context.longValue("DescribeSQLLogRecordsListResponse.Items["+ i +"].UpdateRows"));
			sQLLogRecord.setState(context.integerValue("DescribeSQLLogRecordsListResponse.Items["+ i +"].State"));
			sQLLogRecord.setExecuteTime(context.stringValue("DescribeSQLLogRecordsListResponse.Items["+ i +"].ExecuteTime"));
			sQLLogRecord.setThreadID(context.stringValue("DescribeSQLLogRecordsListResponse.Items["+ i +"].ThreadID"));
			sQLLogRecord.setSqlType(context.stringValue("DescribeSQLLogRecordsListResponse.Items["+ i +"].SqlType"));

			items.add(sQLLogRecord);
		}
		describeSQLLogRecordsListResponse.setItems(items);
	 
	 	return describeSQLLogRecordsListResponse;
	}
}