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

package com.aliyuncs.cloudauth_console.transform.v20190219;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudauth_console.model.v20190219.DescribeIdentifyRecordListResponse;
import com.aliyuncs.cloudauth_console.model.v20190219.DescribeIdentifyRecordListResponse.RecognitionRecord;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeIdentifyRecordListResponseUnmarshaller {

	public static DescribeIdentifyRecordListResponse unmarshall(DescribeIdentifyRecordListResponse describeIdentifyRecordListResponse, UnmarshallerContext _ctx) {
		
		describeIdentifyRecordListResponse.setRequestId(_ctx.stringValue("DescribeIdentifyRecordListResponse.RequestId"));
		describeIdentifyRecordListResponse.setTotalCount(_ctx.longValue("DescribeIdentifyRecordListResponse.TotalCount"));
		describeIdentifyRecordListResponse.setSuccess(_ctx.booleanValue("DescribeIdentifyRecordListResponse.Success"));
		describeIdentifyRecordListResponse.setHttpStatusCode(_ctx.integerValue("DescribeIdentifyRecordListResponse.HttpStatusCode"));

		List<RecognitionRecord> recordList = new ArrayList<RecognitionRecord>();
		for (int i = 0; i < _ctx.lengthValue("DescribeIdentifyRecordListResponse.RecordList.Length"); i++) {
			RecognitionRecord recognitionRecord = new RecognitionRecord();
			recognitionRecord.setCapturedImage(_ctx.stringValue("DescribeIdentifyRecordListResponse.RecordList["+ i +"].CapturedImage"));
			recognitionRecord.setGroupName(_ctx.stringValue("DescribeIdentifyRecordListResponse.RecordList["+ i +"].GroupName"));
			recognitionRecord.setIdentifyingImage(_ctx.stringValue("DescribeIdentifyRecordListResponse.RecordList["+ i +"].IdentifyingImage"));
			recognitionRecord.setUserName(_ctx.stringValue("DescribeIdentifyRecordListResponse.RecordList["+ i +"].UserName"));
			recognitionRecord.setGmtCreate(_ctx.longValue("DescribeIdentifyRecordListResponse.RecordList["+ i +"].GmtCreate"));
			recognitionRecord.setIotId(_ctx.stringValue("DescribeIdentifyRecordListResponse.RecordList["+ i +"].IotId"));
			recognitionRecord.setDeviceName(_ctx.stringValue("DescribeIdentifyRecordListResponse.RecordList["+ i +"].DeviceName"));
			recognitionRecord.setUserId(_ctx.integerValue("DescribeIdentifyRecordListResponse.RecordList["+ i +"].UserId"));

			recordList.add(recognitionRecord);
		}
		describeIdentifyRecordListResponse.setRecordList(recordList);
	 
	 	return describeIdentifyRecordListResponse;
	}
}