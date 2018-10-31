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

import com.aliyuncs.dds.model.v20151201.DescribeRunningLogRecordsResponse;
import com.aliyuncs.dds.model.v20151201.DescribeRunningLogRecordsResponse.LogRecords;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRunningLogRecordsResponseUnmarshaller {

	public static DescribeRunningLogRecordsResponse unmarshall(DescribeRunningLogRecordsResponse describeRunningLogRecordsResponse, UnmarshallerContext context) {
		
		describeRunningLogRecordsResponse.setRequestId(context.stringValue("DescribeRunningLogRecordsResponse.RequestId"));
		describeRunningLogRecordsResponse.setEngine(context.stringValue("DescribeRunningLogRecordsResponse.Engine"));
		describeRunningLogRecordsResponse.setTotalRecordCount(context.integerValue("DescribeRunningLogRecordsResponse.TotalRecordCount"));
		describeRunningLogRecordsResponse.setPageNumber(context.integerValue("DescribeRunningLogRecordsResponse.PageNumber"));
		describeRunningLogRecordsResponse.setPageRecordCount(context.integerValue("DescribeRunningLogRecordsResponse.PageRecordCount"));

		List<LogRecords> items = new ArrayList<LogRecords>();
		for (int i = 0; i < context.lengthValue("DescribeRunningLogRecordsResponse.Items.Length"); i++) {
			LogRecords logRecords = new LogRecords();
			logRecords.setId(context.integerValue("DescribeRunningLogRecordsResponse.Items["+ i +"].Id"));
			logRecords.setCreateTime(context.stringValue("DescribeRunningLogRecordsResponse.Items["+ i +"].CreateTime"));
			logRecords.setCategory(context.stringValue("DescribeRunningLogRecordsResponse.Items["+ i +"].Category"));
			logRecords.setConnInfo(context.stringValue("DescribeRunningLogRecordsResponse.Items["+ i +"].ConnInfo"));
			logRecords.setContent(context.longValue("DescribeRunningLogRecordsResponse.Items["+ i +"].Content"));

			items.add(logRecords);
		}
		describeRunningLogRecordsResponse.setItems(items);
	 
	 	return describeRunningLogRecordsResponse;
	}
}