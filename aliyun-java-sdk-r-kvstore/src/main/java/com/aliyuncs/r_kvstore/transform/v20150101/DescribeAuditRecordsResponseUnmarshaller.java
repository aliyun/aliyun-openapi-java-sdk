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
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAuditRecordsResponseUnmarshaller {

	public static DescribeAuditRecordsResponse unmarshall(DescribeAuditRecordsResponse describeAuditRecordsResponse, UnmarshallerContext _ctx) {
		
		describeAuditRecordsResponse.setRequestId(_ctx.stringValue("DescribeAuditRecordsResponse.RequestId"));
		describeAuditRecordsResponse.setPageNumber(_ctx.integerValue("DescribeAuditRecordsResponse.PageNumber"));
		describeAuditRecordsResponse.setPageSize(_ctx.integerValue("DescribeAuditRecordsResponse.PageSize"));
		describeAuditRecordsResponse.setTotalRecordCount(_ctx.integerValue("DescribeAuditRecordsResponse.TotalRecordCount"));
		describeAuditRecordsResponse.setInstanceName(_ctx.stringValue("DescribeAuditRecordsResponse.InstanceName"));
		describeAuditRecordsResponse.setStartTime(_ctx.stringValue("DescribeAuditRecordsResponse.StartTime"));
		describeAuditRecordsResponse.setEndTime(_ctx.stringValue("DescribeAuditRecordsResponse.EndTime"));

		List<SQL> items = new ArrayList<SQL>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAuditRecordsResponse.Items.Length"); i++) {
			SQL sQL = new SQL();
			sQL.setHostAddress(_ctx.stringValue("DescribeAuditRecordsResponse.Items["+ i +"].HostAddress"));
			sQL.setDatabaseName(_ctx.stringValue("DescribeAuditRecordsResponse.Items["+ i +"].DatabaseName"));
			sQL.setIPAddress(_ctx.stringValue("DescribeAuditRecordsResponse.Items["+ i +"].IPAddress"));
			sQL.setSQLText(_ctx.stringValue("DescribeAuditRecordsResponse.Items["+ i +"].SQLText"));
			sQL.setSQLType(_ctx.stringValue("DescribeAuditRecordsResponse.Items["+ i +"].SQLType"));
			sQL.setTotalExecutionTimes(_ctx.stringValue("DescribeAuditRecordsResponse.Items["+ i +"].TotalExecutionTimes"));
			sQL.setExecuteTime(_ctx.stringValue("DescribeAuditRecordsResponse.Items["+ i +"].ExecuteTime"));
			sQL.setAccountName(_ctx.stringValue("DescribeAuditRecordsResponse.Items["+ i +"].AccountName"));

			items.add(sQL);
		}
		describeAuditRecordsResponse.setItems(items);
	 
	 	return describeAuditRecordsResponse;
	}
}