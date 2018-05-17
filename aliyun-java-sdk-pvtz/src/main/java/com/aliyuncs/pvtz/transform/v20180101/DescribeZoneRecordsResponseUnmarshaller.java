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

package com.aliyuncs.pvtz.transform.v20180101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.pvtz.model.v20180101.DescribeZoneRecordsResponse;
import com.aliyuncs.pvtz.model.v20180101.DescribeZoneRecordsResponse.Record;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeZoneRecordsResponseUnmarshaller {

	public static DescribeZoneRecordsResponse unmarshall(DescribeZoneRecordsResponse describeZoneRecordsResponse, UnmarshallerContext context) {
		
		describeZoneRecordsResponse.setRequestId(context.stringValue("DescribeZoneRecordsResponse.RequestId"));
		describeZoneRecordsResponse.setTotalItems(context.integerValue("DescribeZoneRecordsResponse.TotalItems"));
		describeZoneRecordsResponse.setTotalPages(context.integerValue("DescribeZoneRecordsResponse.TotalPages"));
		describeZoneRecordsResponse.setPageSize(context.integerValue("DescribeZoneRecordsResponse.PageSize"));
		describeZoneRecordsResponse.setPageNumber(context.integerValue("DescribeZoneRecordsResponse.PageNumber"));

		List<Record> records = new ArrayList<Record>();
		for (int i = 0; i < context.lengthValue("DescribeZoneRecordsResponse.Records.Length"); i++) {
			Record record = new Record();
			record.setRecordId(context.longValue("DescribeZoneRecordsResponse.Records["+ i +"].RecordId"));
			record.setRr(context.stringValue("DescribeZoneRecordsResponse.Records["+ i +"].Rr"));
			record.setType(context.stringValue("DescribeZoneRecordsResponse.Records["+ i +"].Type"));
			record.setTtl(context.integerValue("DescribeZoneRecordsResponse.Records["+ i +"].Ttl"));
			record.setPriority(context.integerValue("DescribeZoneRecordsResponse.Records["+ i +"].Priority"));
			record.setValue(context.stringValue("DescribeZoneRecordsResponse.Records["+ i +"].Value"));
			record.setStatus(context.stringValue("DescribeZoneRecordsResponse.Records["+ i +"].Status"));

			records.add(record);
		}
		describeZoneRecordsResponse.setRecords(records);
	 
	 	return describeZoneRecordsResponse;
	}
}