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
		describeRecordsResponse.setPageSize(_ctx.longValue("DescribeRecordsResponse.PageSize"));
		describeRecordsResponse.setPageNum(_ctx.longValue("DescribeRecordsResponse.PageNum"));
		describeRecordsResponse.setPageCount(_ctx.longValue("DescribeRecordsResponse.PageCount"));
		describeRecordsResponse.setTotalCount(_ctx.longValue("DescribeRecordsResponse.TotalCount"));
		describeRecordsResponse.setNextStartTime(_ctx.stringValue("DescribeRecordsResponse.NextStartTime"));

		List<Record> records = new ArrayList<Record>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRecordsResponse.Records.Length"); i++) {
			Record record = new Record();
			record.setId(_ctx.stringValue("DescribeRecordsResponse.Records["+ i +"].Id"));
			record.setStreamId(_ctx.stringValue("DescribeRecordsResponse.Records["+ i +"].StreamId"));
			record.setTemplateId(_ctx.stringValue("DescribeRecordsResponse.Records["+ i +"].TemplateId"));
			record.setType(_ctx.stringValue("DescribeRecordsResponse.Records["+ i +"].Type"));
			record.setUrl(_ctx.stringValue("DescribeRecordsResponse.Records["+ i +"].Url"));
			record.setFileFormat(_ctx.stringValue("DescribeRecordsResponse.Records["+ i +"].FileFormat"));
			record.setOssBucket(_ctx.stringValue("DescribeRecordsResponse.Records["+ i +"].OssBucket"));
			record.setOssObject(_ctx.stringValue("DescribeRecordsResponse.Records["+ i +"].OssObject"));
			record.setOssEndpoint(_ctx.stringValue("DescribeRecordsResponse.Records["+ i +"].OssEndpoint"));
			record.setStartTime(_ctx.stringValue("DescribeRecordsResponse.Records["+ i +"].StartTime"));
			record.setEndTime(_ctx.stringValue("DescribeRecordsResponse.Records["+ i +"].EndTime"));
			record.setHeight(_ctx.longValue("DescribeRecordsResponse.Records["+ i +"].Height"));
			record.setWidth(_ctx.longValue("DescribeRecordsResponse.Records["+ i +"].Width"));

			records.add(record);
		}
		describeRecordsResponse.setRecords(records);
	 
	 	return describeRecordsResponse;
	}
}