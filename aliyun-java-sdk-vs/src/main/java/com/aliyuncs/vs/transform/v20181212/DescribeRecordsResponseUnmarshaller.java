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

package com.aliyuncs.vs.transform.v20181212;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vs.model.v20181212.DescribeRecordsResponse;
import com.aliyuncs.vs.model.v20181212.DescribeRecordsResponse.Record;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRecordsResponseUnmarshaller {

	public static DescribeRecordsResponse unmarshall(DescribeRecordsResponse describeRecordsResponse, UnmarshallerContext _ctx) {
		
		describeRecordsResponse.setRequestId(_ctx.stringValue("DescribeRecordsResponse.RequestId"));
		describeRecordsResponse.setPageNum(_ctx.longValue("DescribeRecordsResponse.PageNum"));
		describeRecordsResponse.setNextStartTime(_ctx.stringValue("DescribeRecordsResponse.NextStartTime"));
		describeRecordsResponse.setPageSize(_ctx.longValue("DescribeRecordsResponse.PageSize"));
		describeRecordsResponse.setTotalCount(_ctx.longValue("DescribeRecordsResponse.TotalCount"));
		describeRecordsResponse.setPageCount(_ctx.longValue("DescribeRecordsResponse.PageCount"));

		List<Record> records = new ArrayList<Record>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRecordsResponse.Records.Length"); i++) {
			Record record = new Record();
			record.setType(_ctx.stringValue("DescribeRecordsResponse.Records["+ i +"].Type"));
			record.setHeight(_ctx.longValue("DescribeRecordsResponse.Records["+ i +"].Height"));
			record.setUrl(_ctx.stringValue("DescribeRecordsResponse.Records["+ i +"].Url"));
			record.setOssBucket(_ctx.stringValue("DescribeRecordsResponse.Records["+ i +"].OssBucket"));
			record.setFileFormat(_ctx.stringValue("DescribeRecordsResponse.Records["+ i +"].FileFormat"));
			record.setStreamId(_ctx.stringValue("DescribeRecordsResponse.Records["+ i +"].StreamId"));
			record.setOssObject(_ctx.stringValue("DescribeRecordsResponse.Records["+ i +"].OssObject"));
			record.setEndTime(_ctx.stringValue("DescribeRecordsResponse.Records["+ i +"].EndTime"));
			record.setStartTime(_ctx.stringValue("DescribeRecordsResponse.Records["+ i +"].StartTime"));
			record.setWidth(_ctx.longValue("DescribeRecordsResponse.Records["+ i +"].Width"));
			record.setTemplateId(_ctx.stringValue("DescribeRecordsResponse.Records["+ i +"].TemplateId"));
			record.setId(_ctx.stringValue("DescribeRecordsResponse.Records["+ i +"].Id"));
			record.setOssEndpoint(_ctx.stringValue("DescribeRecordsResponse.Records["+ i +"].OssEndpoint"));

			records.add(record);
		}
		describeRecordsResponse.setRecords(records);
	 
	 	return describeRecordsResponse;
	}
}