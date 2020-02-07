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

	public static DescribeZoneRecordsResponse unmarshall(DescribeZoneRecordsResponse describeZoneRecordsResponse, UnmarshallerContext _ctx) {
		
		describeZoneRecordsResponse.setRequestId(_ctx.stringValue("DescribeZoneRecordsResponse.RequestId"));
		describeZoneRecordsResponse.setTotalItems(_ctx.integerValue("DescribeZoneRecordsResponse.TotalItems"));
		describeZoneRecordsResponse.setTotalPages(_ctx.integerValue("DescribeZoneRecordsResponse.TotalPages"));
		describeZoneRecordsResponse.setPageSize(_ctx.integerValue("DescribeZoneRecordsResponse.PageSize"));
		describeZoneRecordsResponse.setPageNumber(_ctx.integerValue("DescribeZoneRecordsResponse.PageNumber"));

		List<Record> records = new ArrayList<Record>();
		for (int i = 0; i < _ctx.lengthValue("DescribeZoneRecordsResponse.Records.Length"); i++) {
			Record record = new Record();
			record.setRecordId(_ctx.longValue("DescribeZoneRecordsResponse.Records["+ i +"].RecordId"));
			record.setRr(_ctx.stringValue("DescribeZoneRecordsResponse.Records["+ i +"].Rr"));
			record.setType(_ctx.stringValue("DescribeZoneRecordsResponse.Records["+ i +"].Type"));
			record.setTtl(_ctx.integerValue("DescribeZoneRecordsResponse.Records["+ i +"].Ttl"));
			record.setPriority(_ctx.integerValue("DescribeZoneRecordsResponse.Records["+ i +"].Priority"));
			record.setValue(_ctx.stringValue("DescribeZoneRecordsResponse.Records["+ i +"].Value"));
			record.setStatus(_ctx.stringValue("DescribeZoneRecordsResponse.Records["+ i +"].Status"));
			record.setRegionId(_ctx.stringValue("DescribeZoneRecordsResponse.Records["+ i +"].RegionId"));
			record.setRemark(_ctx.stringValue("DescribeZoneRecordsResponse.Records["+ i +"].Remark"));

			records.add(record);
		}
		describeZoneRecordsResponse.setRecords(records);
	 
	 	return describeZoneRecordsResponse;
	}
}