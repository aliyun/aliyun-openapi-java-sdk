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

import com.aliyuncs.rds.model.v20140815.DescribeSQLLogRecordsResponse;
import com.aliyuncs.rds.model.v20140815.DescribeSQLLogRecordsResponse.SQLRecord;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSQLLogRecordsResponseUnmarshaller {

	public static DescribeSQLLogRecordsResponse unmarshall(DescribeSQLLogRecordsResponse describeSQLLogRecordsResponse, UnmarshallerContext _ctx) {
		
		describeSQLLogRecordsResponse.setRequestId(_ctx.stringValue("DescribeSQLLogRecordsResponse.RequestId"));
		describeSQLLogRecordsResponse.setPageNumber(_ctx.integerValue("DescribeSQLLogRecordsResponse.PageNumber"));
		describeSQLLogRecordsResponse.setPageRecordCount(_ctx.integerValue("DescribeSQLLogRecordsResponse.PageRecordCount"));
		describeSQLLogRecordsResponse.setTotalRecordCount(_ctx.longValue("DescribeSQLLogRecordsResponse.TotalRecordCount"));

		List<SQLRecord> items = new ArrayList<SQLRecord>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSQLLogRecordsResponse.Items.Length"); i++) {
			SQLRecord sQLRecord = new SQLRecord();
			sQLRecord.setHostAddress(_ctx.stringValue("DescribeSQLLogRecordsResponse.Items["+ i +"].HostAddress"));
			sQLRecord.setSQLText(_ctx.stringValue("DescribeSQLLogRecordsResponse.Items["+ i +"].SQLText"));
			sQLRecord.setReturnRowCounts(_ctx.longValue("DescribeSQLLogRecordsResponse.Items["+ i +"].ReturnRowCounts"));
			sQLRecord.setDBName(_ctx.stringValue("DescribeSQLLogRecordsResponse.Items["+ i +"].DBName"));
			sQLRecord.setExecuteTime(_ctx.stringValue("DescribeSQLLogRecordsResponse.Items["+ i +"].ExecuteTime"));
			sQLRecord.setThreadID(_ctx.stringValue("DescribeSQLLogRecordsResponse.Items["+ i +"].ThreadID"));
			sQLRecord.setTotalExecutionTimes(_ctx.longValue("DescribeSQLLogRecordsResponse.Items["+ i +"].TotalExecutionTimes"));
			sQLRecord.setAccountName(_ctx.stringValue("DescribeSQLLogRecordsResponse.Items["+ i +"].AccountName"));

			items.add(sQLRecord);
		}
		describeSQLLogRecordsResponse.setItems(items);
	 
	 	return describeSQLLogRecordsResponse;
	}
}