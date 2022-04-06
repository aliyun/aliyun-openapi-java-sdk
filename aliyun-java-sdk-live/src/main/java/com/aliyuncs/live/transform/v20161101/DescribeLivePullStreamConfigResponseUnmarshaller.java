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

import com.aliyuncs.live.model.v20161101.DescribeLivePullStreamConfigResponse;
import com.aliyuncs.live.model.v20161101.DescribeLivePullStreamConfigResponse.LiveAppRecord;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLivePullStreamConfigResponseUnmarshaller {

	public static DescribeLivePullStreamConfigResponse unmarshall(DescribeLivePullStreamConfigResponse describeLivePullStreamConfigResponse, UnmarshallerContext _ctx) {
		
		describeLivePullStreamConfigResponse.setRequestId(_ctx.stringValue("DescribeLivePullStreamConfigResponse.RequestId"));

		List<LiveAppRecord> liveAppRecordList = new ArrayList<LiveAppRecord>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLivePullStreamConfigResponse.LiveAppRecordList.Length"); i++) {
			LiveAppRecord liveAppRecord = new LiveAppRecord();
			liveAppRecord.setEndTime(_ctx.stringValue("DescribeLivePullStreamConfigResponse.LiveAppRecordList["+ i +"].EndTime"));
			liveAppRecord.setAppName(_ctx.stringValue("DescribeLivePullStreamConfigResponse.LiveAppRecordList["+ i +"].AppName"));
			liveAppRecord.setSourceUrl(_ctx.stringValue("DescribeLivePullStreamConfigResponse.LiveAppRecordList["+ i +"].SourceUrl"));
			liveAppRecord.setStartTime(_ctx.stringValue("DescribeLivePullStreamConfigResponse.LiveAppRecordList["+ i +"].StartTime"));
			liveAppRecord.setAlways(_ctx.stringValue("DescribeLivePullStreamConfigResponse.LiveAppRecordList["+ i +"].Always"));
			liveAppRecord.setStreamName(_ctx.stringValue("DescribeLivePullStreamConfigResponse.LiveAppRecordList["+ i +"].StreamName"));
			liveAppRecord.setSourceUsing(_ctx.stringValue("DescribeLivePullStreamConfigResponse.LiveAppRecordList["+ i +"].SourceUsing"));
			liveAppRecord.setDomainName(_ctx.stringValue("DescribeLivePullStreamConfigResponse.LiveAppRecordList["+ i +"].DomainName"));

			liveAppRecordList.add(liveAppRecord);
		}
		describeLivePullStreamConfigResponse.setLiveAppRecordList(liveAppRecordList);
	 
	 	return describeLivePullStreamConfigResponse;
	}
}