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

package com.aliyuncs.live.transform.v20161101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.live.model.v20161101.DescribeRecordsResponse;
import com.aliyuncs.live.model.v20161101.DescribeRecordsResponse.Record;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRecordsResponseUnmarshaller {

	public static DescribeRecordsResponse unmarshall(DescribeRecordsResponse describeRecordsResponse, UnmarshallerContext _ctx) {
		
		describeRecordsResponse.setRequestId(_ctx.stringValue("DescribeRecordsResponse.RequestId"));

		List<Record> records = new ArrayList<Record>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRecordsResponse.Records.Length"); i++) {
			Record record = new Record();
			record.setRecordId(_ctx.stringValue("DescribeRecordsResponse.Records["+ i +"].RecordId"));
			record.setAppId(_ctx.stringValue("DescribeRecordsResponse.Records["+ i +"].AppId"));
			record.setBoardId(_ctx.integerValue("DescribeRecordsResponse.Records["+ i +"].BoardId"));
			record.setRecordStartTime(_ctx.longValue("DescribeRecordsResponse.Records["+ i +"].RecordStartTime"));
			record.setStartTime(_ctx.longValue("DescribeRecordsResponse.Records["+ i +"].StartTime"));
			record.setEndTime(_ctx.longValue("DescribeRecordsResponse.Records["+ i +"].EndTime"));
			record.setState(_ctx.integerValue("DescribeRecordsResponse.Records["+ i +"].State"));
			record.setOssPath(_ctx.stringValue("DescribeRecordsResponse.Records["+ i +"].OssPath"));
			record.setOssBucket(_ctx.stringValue("DescribeRecordsResponse.Records["+ i +"].OssBucket"));
			record.setOssEndpoint(_ctx.stringValue("DescribeRecordsResponse.Records["+ i +"].OssEndpoint"));

			records.add(record);
		}
		describeRecordsResponse.setRecords(records);
	 
	 	return describeRecordsResponse;
	}
}