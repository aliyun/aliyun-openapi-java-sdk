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

import com.aliyuncs.r_kvstore.model.v20150101.DescribeRunningLogRecordsResponse;
import com.aliyuncs.r_kvstore.model.v20150101.DescribeRunningLogRecordsResponse.LogRecords;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRunningLogRecordsResponseUnmarshaller {

	public static DescribeRunningLogRecordsResponse unmarshall(DescribeRunningLogRecordsResponse describeRunningLogRecordsResponse, UnmarshallerContext _ctx) {
		
		describeRunningLogRecordsResponse.setRequestId(_ctx.stringValue("DescribeRunningLogRecordsResponse.RequestId"));
		describeRunningLogRecordsResponse.setInstanceId(_ctx.stringValue("DescribeRunningLogRecordsResponse.InstanceId"));
		describeRunningLogRecordsResponse.setStartTime(_ctx.stringValue("DescribeRunningLogRecordsResponse.StartTime"));
		describeRunningLogRecordsResponse.setEngine(_ctx.stringValue("DescribeRunningLogRecordsResponse.Engine"));
		describeRunningLogRecordsResponse.setTotalRecordCount(_ctx.integerValue("DescribeRunningLogRecordsResponse.TotalRecordCount"));
		describeRunningLogRecordsResponse.setPageNumber(_ctx.integerValue("DescribeRunningLogRecordsResponse.PageNumber"));
		describeRunningLogRecordsResponse.setPageSize(_ctx.integerValue("DescribeRunningLogRecordsResponse.PageSize"));
		describeRunningLogRecordsResponse.setPageRecordCount(_ctx.integerValue("DescribeRunningLogRecordsResponse.PageRecordCount"));

		List<LogRecords> items = new ArrayList<LogRecords>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRunningLogRecordsResponse.Items.Length"); i++) {
			LogRecords logRecords = new LogRecords();
			logRecords.setLevel(_ctx.stringValue("DescribeRunningLogRecordsResponse.Items["+ i +"].Level"));
			logRecords.setId(_ctx.integerValue("DescribeRunningLogRecordsResponse.Items["+ i +"].Id"));
			logRecords.setCreateTime(_ctx.stringValue("DescribeRunningLogRecordsResponse.Items["+ i +"].CreateTime"));
			logRecords.setCategory(_ctx.stringValue("DescribeRunningLogRecordsResponse.Items["+ i +"].Category"));
			logRecords.setConnInfo(_ctx.stringValue("DescribeRunningLogRecordsResponse.Items["+ i +"].ConnInfo"));
			logRecords.setContent(_ctx.stringValue("DescribeRunningLogRecordsResponse.Items["+ i +"].Content"));

			items.add(logRecords);
		}
		describeRunningLogRecordsResponse.setItems(items);
	 
	 	return describeRunningLogRecordsResponse;
	}
}