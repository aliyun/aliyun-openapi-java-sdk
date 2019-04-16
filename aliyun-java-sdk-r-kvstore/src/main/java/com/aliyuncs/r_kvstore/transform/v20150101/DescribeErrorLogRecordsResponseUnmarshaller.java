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

import com.aliyuncs.r_kvstore.model.v20150101.DescribeErrorLogRecordsResponse;
import com.aliyuncs.r_kvstore.model.v20150101.DescribeErrorLogRecordsResponse.LogRecords;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeErrorLogRecordsResponseUnmarshaller {

	public static DescribeErrorLogRecordsResponse unmarshall(DescribeErrorLogRecordsResponse describeErrorLogRecordsResponse, UnmarshallerContext context) {
		
		describeErrorLogRecordsResponse.setRequestId(context.stringValue("DescribeErrorLogRecordsResponse.RequestId"));
		describeErrorLogRecordsResponse.setEngine(context.stringValue("DescribeErrorLogRecordsResponse.Engine"));
		describeErrorLogRecordsResponse.setTotalRecordCount(context.integerValue("DescribeErrorLogRecordsResponse.TotalRecordCount"));
		describeErrorLogRecordsResponse.setPageNumber(context.integerValue("DescribeErrorLogRecordsResponse.PageNumber"));
		describeErrorLogRecordsResponse.setPageRecordCount(context.integerValue("DescribeErrorLogRecordsResponse.PageRecordCount"));

		List<LogRecords> items = new ArrayList<LogRecords>();
		for (int i = 0; i < context.lengthValue("DescribeErrorLogRecordsResponse.Items.Length"); i++) {
			LogRecords logRecords = new LogRecords();
			logRecords.setId(context.integerValue("DescribeErrorLogRecordsResponse.Items["+ i +"].Id"));
			logRecords.setCreateTime(context.stringValue("DescribeErrorLogRecordsResponse.Items["+ i +"].CreateTime"));
			logRecords.setCategory(context.stringValue("DescribeErrorLogRecordsResponse.Items["+ i +"].Category"));
			logRecords.setConnInfo(context.stringValue("DescribeErrorLogRecordsResponse.Items["+ i +"].ConnInfo"));
			logRecords.setContent(context.longValue("DescribeErrorLogRecordsResponse.Items["+ i +"].Content"));

			items.add(logRecords);
		}
		describeErrorLogRecordsResponse.setItems(items);
	 
	 	return describeErrorLogRecordsResponse;
	}
}