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
package com.aliyuncs.cdn.transform.v20141111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cdn.model.v20141111.DescribeLivePullStreamConfigResponse;
import com.aliyuncs.cdn.model.v20141111.DescribeLivePullStreamConfigResponse.LiveAppRecord;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLivePullStreamConfigResponseUnmarshaller {

	public static DescribeLivePullStreamConfigResponse unmarshall(DescribeLivePullStreamConfigResponse describeLivePullStreamConfigResponse, UnmarshallerContext context) {
		
		describeLivePullStreamConfigResponse.setRequestId(context.stringValue("DescribeLivePullStreamConfigResponse.RequestId"));

		List<LiveAppRecord> liveAppRecordList = new ArrayList<LiveAppRecord>();
		for (int i = 0; i < context.lengthValue("DescribeLivePullStreamConfigResponse.LiveAppRecordList.Length"); i++) {
			LiveAppRecord liveAppRecord = new LiveAppRecord();
			liveAppRecord.setDomainName(context.stringValue("DescribeLivePullStreamConfigResponse.LiveAppRecordList["+ i +"].DomainName"));
			liveAppRecord.setStreamName(context.stringValue("DescribeLivePullStreamConfigResponse.LiveAppRecordList["+ i +"].StreamName"));
			liveAppRecord.setSourceUrl(context.stringValue("DescribeLivePullStreamConfigResponse.LiveAppRecordList["+ i +"].SourceUrl"));
			liveAppRecord.setStartTime(context.stringValue("DescribeLivePullStreamConfigResponse.LiveAppRecordList["+ i +"].StartTime"));
			liveAppRecord.setEndTime(context.stringValue("DescribeLivePullStreamConfigResponse.LiveAppRecordList["+ i +"].EndTime"));

			liveAppRecordList.add(liveAppRecord);
		}
		describeLivePullStreamConfigResponse.setLiveAppRecordList(liveAppRecordList);
	 
	 	return describeLivePullStreamConfigResponse;
	}
}