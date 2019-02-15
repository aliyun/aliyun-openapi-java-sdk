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

package com.aliyuncs.dds.transform.v20151201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dds.model.v20151201.DescribeAuditRecordsResponse;
import com.aliyuncs.dds.model.v20151201.DescribeAuditRecordsResponse.SQLRecord;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAuditRecordsResponseUnmarshaller {

	public static DescribeAuditRecordsResponse unmarshall(DescribeAuditRecordsResponse describeAuditRecordsResponse, UnmarshallerContext context) {
		
		describeAuditRecordsResponse.setRequestId(context.stringValue("DescribeAuditRecordsResponse.RequestId"));
		describeAuditRecordsResponse.setTotalRecordCount(context.integerValue("DescribeAuditRecordsResponse.TotalRecordCount"));
		describeAuditRecordsResponse.setPageNumber(context.integerValue("DescribeAuditRecordsResponse.PageNumber"));
		describeAuditRecordsResponse.setPageRecordCount(context.integerValue("DescribeAuditRecordsResponse.PageRecordCount"));

		List<SQLRecord> items = new ArrayList<SQLRecord>();
		for (int i = 0; i < context.lengthValue("DescribeAuditRecordsResponse.Items.Length"); i++) {
			SQLRecord sQLRecord = new SQLRecord();
			sQLRecord.setDBName(context.stringValue("DescribeAuditRecordsResponse.Items["+ i +"].DBName"));
			sQLRecord.setAccountName(context.stringValue("DescribeAuditRecordsResponse.Items["+ i +"].AccountName"));
			sQLRecord.setHostAddress(context.stringValue("DescribeAuditRecordsResponse.Items["+ i +"].HostAddress"));
			sQLRecord.setSyntax(context.stringValue("DescribeAuditRecordsResponse.Items["+ i +"].Syntax"));
			sQLRecord.setTotalExecutionTimes(context.longValue("DescribeAuditRecordsResponse.Items["+ i +"].TotalExecutionTimes"));
			sQLRecord.setReturnRowCounts(context.longValue("DescribeAuditRecordsResponse.Items["+ i +"].ReturnRowCounts"));
			sQLRecord.setExecuteTime(context.stringValue("DescribeAuditRecordsResponse.Items["+ i +"].ExecuteTime"));
			sQLRecord.setThreadID(context.stringValue("DescribeAuditRecordsResponse.Items["+ i +"].ThreadID"));

			items.add(sQLRecord);
		}
		describeAuditRecordsResponse.setItems(items);
	 
	 	return describeAuditRecordsResponse;
	}
}