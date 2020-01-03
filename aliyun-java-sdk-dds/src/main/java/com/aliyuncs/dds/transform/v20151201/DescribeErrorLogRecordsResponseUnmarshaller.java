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

import com.aliyuncs.dds.model.v20151201.DescribeErrorLogRecordsResponse;
import com.aliyuncs.dds.model.v20151201.DescribeErrorLogRecordsResponse.LogRecords;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeErrorLogRecordsResponseUnmarshaller {

	public static DescribeErrorLogRecordsResponse unmarshall(DescribeErrorLogRecordsResponse describeErrorLogRecordsResponse, UnmarshallerContext _ctx) {
		
		describeErrorLogRecordsResponse.setRequestId(_ctx.stringValue("DescribeErrorLogRecordsResponse.RequestId"));
		describeErrorLogRecordsResponse.setEngine(_ctx.stringValue("DescribeErrorLogRecordsResponse.Engine"));
		describeErrorLogRecordsResponse.setTotalRecordCount(_ctx.integerValue("DescribeErrorLogRecordsResponse.TotalRecordCount"));
		describeErrorLogRecordsResponse.setPageNumber(_ctx.integerValue("DescribeErrorLogRecordsResponse.PageNumber"));
		describeErrorLogRecordsResponse.setPageRecordCount(_ctx.integerValue("DescribeErrorLogRecordsResponse.PageRecordCount"));

		List<LogRecords> items = new ArrayList<LogRecords>();
		for (int i = 0; i < _ctx.lengthValue("DescribeErrorLogRecordsResponse.Items.Length"); i++) {
			LogRecords logRecords = new LogRecords();
			logRecords.setId(_ctx.integerValue("DescribeErrorLogRecordsResponse.Items["+ i +"].Id"));
			logRecords.setCreateTime(_ctx.stringValue("DescribeErrorLogRecordsResponse.Items["+ i +"].CreateTime"));
			logRecords.setCategory(_ctx.stringValue("DescribeErrorLogRecordsResponse.Items["+ i +"].Category"));
			logRecords.setConnInfo(_ctx.stringValue("DescribeErrorLogRecordsResponse.Items["+ i +"].ConnInfo"));
			logRecords.setContent(_ctx.stringValue("DescribeErrorLogRecordsResponse.Items["+ i +"].Content"));

			items.add(logRecords);
		}
		describeErrorLogRecordsResponse.setItems(items);
	 
	 	return describeErrorLogRecordsResponse;
	}
}