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

package com.aliyuncs.ecd.transform.v20200930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecd.model.v20200930.DescribeUserConnectionRecordsResponse;
import com.aliyuncs.ecd.model.v20200930.DescribeUserConnectionRecordsResponse.ConnectionRecord;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeUserConnectionRecordsResponseUnmarshaller {

	public static DescribeUserConnectionRecordsResponse unmarshall(DescribeUserConnectionRecordsResponse describeUserConnectionRecordsResponse, UnmarshallerContext _ctx) {
		
		describeUserConnectionRecordsResponse.setRequestId(_ctx.stringValue("DescribeUserConnectionRecordsResponse.RequestId"));
		describeUserConnectionRecordsResponse.setNextToken(_ctx.stringValue("DescribeUserConnectionRecordsResponse.NextToken"));

		List<ConnectionRecord> connectionRecords = new ArrayList<ConnectionRecord>();
		for (int i = 0; i < _ctx.lengthValue("DescribeUserConnectionRecordsResponse.ConnectionRecords.Length"); i++) {
			ConnectionRecord connectionRecord = new ConnectionRecord();
			connectionRecord.setConnectionRecordId(_ctx.stringValue("DescribeUserConnectionRecordsResponse.ConnectionRecords["+ i +"].ConnectionRecordId"));
			connectionRecord.setConnectStartTime(_ctx.stringValue("DescribeUserConnectionRecordsResponse.ConnectionRecords["+ i +"].ConnectStartTime"));
			connectionRecord.setConnectEndTime(_ctx.stringValue("DescribeUserConnectionRecordsResponse.ConnectionRecords["+ i +"].ConnectEndTime"));
			connectionRecord.setConnectDuration(_ctx.stringValue("DescribeUserConnectionRecordsResponse.ConnectionRecords["+ i +"].ConnectDuration"));
			connectionRecord.setDesktopId(_ctx.stringValue("DescribeUserConnectionRecordsResponse.ConnectionRecords["+ i +"].DesktopId"));
			connectionRecord.setDesktopName(_ctx.stringValue("DescribeUserConnectionRecordsResponse.ConnectionRecords["+ i +"].DesktopName"));

			connectionRecords.add(connectionRecord);
		}
		describeUserConnectionRecordsResponse.setConnectionRecords(connectionRecords);
	 
	 	return describeUserConnectionRecordsResponse;
	}
}