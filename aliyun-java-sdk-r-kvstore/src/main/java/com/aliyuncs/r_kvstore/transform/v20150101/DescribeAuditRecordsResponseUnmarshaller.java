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

package com.aliyuncs.r_kvstore.transform.v20150101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.r_kvstore.model.v20150101.DescribeAuditRecordsResponse;
import com.aliyuncs.r_kvstore.model.v20150101.DescribeAuditRecordsResponse.SQL;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAuditRecordsResponseUnmarshaller {

	public static DescribeAuditRecordsResponse unmarshall(DescribeAuditRecordsResponse describeAuditRecordsResponse, UnmarshallerContext context) {
		
		describeAuditRecordsResponse.setRequestId(context.stringValue("DescribeAuditRecordsResponse.RequestId"));
		describeAuditRecordsResponse.setPageNumber(context.integerValue("DescribeAuditRecordsResponse.PageNumber"));
		describeAuditRecordsResponse.setPageSize(context.integerValue("DescribeAuditRecordsResponse.PageSize"));
		describeAuditRecordsResponse.setTotalRecordCount(context.integerValue("DescribeAuditRecordsResponse.TotalRecordCount"));
		describeAuditRecordsResponse.setInstanceName(context.stringValue("DescribeAuditRecordsResponse.InstanceName"));
		describeAuditRecordsResponse.setStartTime(context.stringValue("DescribeAuditRecordsResponse.StartTime"));
		describeAuditRecordsResponse.setEndTime(context.stringValue("DescribeAuditRecordsResponse.EndTime"));

		List<SQL> items = new ArrayList<SQL>();
		for (int i = 0; i < context.lengthValue("DescribeAuditRecordsResponse.Items.Length"); i++) {
			SQL sQL = new SQL();
			sQL.setHostAddress(context.integerValue("DescribeAuditRecordsResponse.Items["+ i +"].HostAddress"));
			sQL.setDatabaseName(context.stringValue("DescribeAuditRecordsResponse.Items["+ i +"].DatabaseName"));
			sQL.setIPAddress(context.stringValue("DescribeAuditRecordsResponse.Items["+ i +"].IPAddress"));
			sQL.setSQLText(context.stringValue("DescribeAuditRecordsResponse.Items["+ i +"].SQLText"));
			sQL.setSQLType(context.stringValue("DescribeAuditRecordsResponse.Items["+ i +"].SQLType"));
			sQL.setTotalExecutionTimes(context.stringValue("DescribeAuditRecordsResponse.Items["+ i +"].TotalExecutionTimes"));
			sQL.setExecuteTime(context.stringValue("DescribeAuditRecordsResponse.Items["+ i +"].ExecuteTime"));
			sQL.setAccountName(context.stringValue("DescribeAuditRecordsResponse.Items["+ i +"].AccountName"));

			items.add(sQL);
		}
		describeAuditRecordsResponse.setItems(items);
	 
	 	return describeAuditRecordsResponse;
	}
}