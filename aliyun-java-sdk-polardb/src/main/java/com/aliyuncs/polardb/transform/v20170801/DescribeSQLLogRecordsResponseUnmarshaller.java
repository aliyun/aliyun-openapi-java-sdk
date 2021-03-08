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
import com.aliyuncs.polardb.model.v20170801.DescribeSQLLogRecordsResponse.SQLLogRecord;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSQLLogRecordsResponseUnmarshaller {

	public static DescribeSQLLogRecordsResponse unmarshall(DescribeSQLLogRecordsResponse describeSQLLogRecordsResponse, UnmarshallerContext _ctx) {
		
		describeSQLLogRecordsResponse.setRequestId(_ctx.stringValue("DescribeSQLLogRecordsResponse.RequestId"));
		describeSQLLogRecordsResponse.setMaxRecordsPerPage(_ctx.integerValue("DescribeSQLLogRecordsResponse.MaxRecordsPerPage"));
		describeSQLLogRecordsResponse.setItemsNumbers(_ctx.integerValue("DescribeSQLLogRecordsResponse.ItemsNumbers"));
		describeSQLLogRecordsResponse.setEndTime(_ctx.stringValue("DescribeSQLLogRecordsResponse.EndTime"));
		describeSQLLogRecordsResponse.setDBInstanceID(_ctx.stringValue("DescribeSQLLogRecordsResponse.DBInstanceID"));
		describeSQLLogRecordsResponse.setStartTime(_ctx.stringValue("DescribeSQLLogRecordsResponse.StartTime"));
		describeSQLLogRecordsResponse.setTotalRecords(_ctx.integerValue("DescribeSQLLogRecordsResponse.TotalRecords"));
		describeSQLLogRecordsResponse.setFinish(_ctx.stringValue("DescribeSQLLogRecordsResponse.Finish"));
		describeSQLLogRecordsResponse.setPageNumbers(_ctx.integerValue("DescribeSQLLogRecordsResponse.PageNumbers"));
		describeSQLLogRecordsResponse.setJobId(_ctx.stringValue("DescribeSQLLogRecordsResponse.JobId"));
		describeSQLLogRecordsResponse.setPagingID(_ctx.stringValue("DescribeSQLLogRecordsResponse.PagingID"));
		describeSQLLogRecordsResponse.setDBInstanceName(_ctx.stringValue("DescribeSQLLogRecordsResponse.DBInstanceName"));

		List<SQLLogRecord> items = new ArrayList<SQLLogRecord>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSQLLogRecordsResponse.Items.Length"); i++) {
			SQLLogRecord sQLLogRecord = new SQLLogRecord();
			sQLLogRecord.setExecuteTime(_ctx.stringValue("DescribeSQLLogRecordsResponse.Items["+ i +"].ExecuteTime"));
			sQLLogRecord.setInsName(_ctx.stringValue("DescribeSQLLogRecordsResponse.Items["+ i +"].InsName"));
			sQLLogRecord.setHostAddress(_ctx.stringValue("DescribeSQLLogRecordsResponse.Items["+ i +"].HostAddress"));
			sQLLogRecord.setUpdateRows(_ctx.longValue("DescribeSQLLogRecordsResponse.Items["+ i +"].UpdateRows"));
			sQLLogRecord.setSQLText(_ctx.stringValue("DescribeSQLLogRecordsResponse.Items["+ i +"].SQLText"));
			sQLLogRecord.setOriginTime(_ctx.stringValue("DescribeSQLLogRecordsResponse.Items["+ i +"].OriginTime"));
			sQLLogRecord.setConsume(_ctx.longValue("DescribeSQLLogRecordsResponse.Items["+ i +"].Consume"));
			sQLLogRecord.setScanRows(_ctx.longValue("DescribeSQLLogRecordsResponse.Items["+ i +"].ScanRows"));
			sQLLogRecord.setThreadID(_ctx.integerValue("DescribeSQLLogRecordsResponse.Items["+ i +"].ThreadID"));
			sQLLogRecord.setState(_ctx.stringValue("DescribeSQLLogRecordsResponse.Items["+ i +"].State"));
			sQLLogRecord.setDBName(_ctx.stringValue("DescribeSQLLogRecordsResponse.Items["+ i +"].DBName"));
			sQLLogRecord.setSqlType(_ctx.stringValue("DescribeSQLLogRecordsResponse.Items["+ i +"].SqlType"));
			sQLLogRecord.setVip(_ctx.stringValue("DescribeSQLLogRecordsResponse.Items["+ i +"].Vip"));
			sQLLogRecord.setAccountName(_ctx.stringValue("DescribeSQLLogRecordsResponse.Items["+ i +"].AccountName"));

			items.add(sQLLogRecord);
		}
		describeSQLLogRecordsResponse.setItems(items);
	 
	 	return describeSQLLogRecordsResponse;
	}
}