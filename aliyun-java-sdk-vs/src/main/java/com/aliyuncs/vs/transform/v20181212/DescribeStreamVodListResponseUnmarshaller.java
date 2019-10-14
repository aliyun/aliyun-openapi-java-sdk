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

import com.aliyuncs.vs.model.v20181212.DescribeStreamVodListResponse;
import com.aliyuncs.vs.model.v20181212.DescribeStreamVodListResponse.Record;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeStreamVodListResponseUnmarshaller {

	public static DescribeStreamVodListResponse unmarshall(DescribeStreamVodListResponse describeStreamVodListResponse, UnmarshallerContext _ctx) {
		
		describeStreamVodListResponse.setRequestId(_ctx.stringValue("DescribeStreamVodListResponse.RequestId"));

		List<Record> records = new ArrayList<Record>();
		for (int i = 0; i < _ctx.lengthValue("DescribeStreamVodListResponse.Records.Length"); i++) {
			Record record = new Record();
			record.setStartTime(_ctx.longValue("DescribeStreamVodListResponse.Records["+ i +"].StartTime"));
			record.setEndTime(_ctx.longValue("DescribeStreamVodListResponse.Records["+ i +"].EndTime"));

			records.add(record);
		}
		describeStreamVodListResponse.setRecords(records);
	 
	 	return describeStreamVodListResponse;
	}
}