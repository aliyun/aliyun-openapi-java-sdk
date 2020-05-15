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

import com.aliyuncs.vs.model.v20181212.DescribeVsPullStreamInfoConfigResponse;
import com.aliyuncs.vs.model.v20181212.DescribeVsPullStreamInfoConfigResponse.LiveAppRecord;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVsPullStreamInfoConfigResponseUnmarshaller {

	public static DescribeVsPullStreamInfoConfigResponse unmarshall(DescribeVsPullStreamInfoConfigResponse describeVsPullStreamInfoConfigResponse, UnmarshallerContext _ctx) {
		
		describeVsPullStreamInfoConfigResponse.setRequestId(_ctx.stringValue("DescribeVsPullStreamInfoConfigResponse.RequestId"));

		List<LiveAppRecord> liveAppRecordList = new ArrayList<LiveAppRecord>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVsPullStreamInfoConfigResponse.LiveAppRecordList.Length"); i++) {
			LiveAppRecord liveAppRecord = new LiveAppRecord();
			liveAppRecord.setDomainName(_ctx.stringValue("DescribeVsPullStreamInfoConfigResponse.LiveAppRecordList["+ i +"].DomainName"));
			liveAppRecord.setAppName(_ctx.stringValue("DescribeVsPullStreamInfoConfigResponse.LiveAppRecordList["+ i +"].AppName"));
			liveAppRecord.setStreamName(_ctx.stringValue("DescribeVsPullStreamInfoConfigResponse.LiveAppRecordList["+ i +"].StreamName"));
			liveAppRecord.setSourceUrl(_ctx.stringValue("DescribeVsPullStreamInfoConfigResponse.LiveAppRecordList["+ i +"].SourceUrl"));
			liveAppRecord.setStartTime(_ctx.stringValue("DescribeVsPullStreamInfoConfigResponse.LiveAppRecordList["+ i +"].StartTime"));
			liveAppRecord.setEndTime(_ctx.stringValue("DescribeVsPullStreamInfoConfigResponse.LiveAppRecordList["+ i +"].EndTime"));

			liveAppRecordList.add(liveAppRecord);
		}
		describeVsPullStreamInfoConfigResponse.setLiveAppRecordList(liveAppRecordList);
	 
	 	return describeVsPullStreamInfoConfigResponse;
	}
}