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

import com.aliyuncs.live.model.v20161101.DescribeLiveStreamTranscodeMetricDataResponse;
import com.aliyuncs.live.model.v20161101.DescribeLiveStreamTranscodeMetricDataResponse.StreamData;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveStreamTranscodeMetricDataResponseUnmarshaller {

	public static DescribeLiveStreamTranscodeMetricDataResponse unmarshall(DescribeLiveStreamTranscodeMetricDataResponse describeLiveStreamTranscodeMetricDataResponse, UnmarshallerContext _ctx) {
		
		describeLiveStreamTranscodeMetricDataResponse.setRequestId(_ctx.stringValue("DescribeLiveStreamTranscodeMetricDataResponse.RequestId"));
		describeLiveStreamTranscodeMetricDataResponse.setEndTime(_ctx.stringValue("DescribeLiveStreamTranscodeMetricDataResponse.EndTime"));
		describeLiveStreamTranscodeMetricDataResponse.setStartTime(_ctx.stringValue("DescribeLiveStreamTranscodeMetricDataResponse.StartTime"));
		describeLiveStreamTranscodeMetricDataResponse.setNextPageToken(_ctx.stringValue("DescribeLiveStreamTranscodeMetricDataResponse.NextPageToken"));
		describeLiveStreamTranscodeMetricDataResponse.setPageSize(_ctx.integerValue("DescribeLiveStreamTranscodeMetricDataResponse.PageSize"));
		describeLiveStreamTranscodeMetricDataResponse.setDomainName(_ctx.stringValue("DescribeLiveStreamTranscodeMetricDataResponse.DomainName"));

		List<StreamData> streamDetailData = new ArrayList<StreamData>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLiveStreamTranscodeMetricDataResponse.StreamDetailData.Length"); i++) {
			StreamData streamData = new StreamData();
			streamData.setAppName(_ctx.stringValue("DescribeLiveStreamTranscodeMetricDataResponse.StreamDetailData["+ i +"].AppName"));
			streamData.setStreamName(_ctx.stringValue("DescribeLiveStreamTranscodeMetricDataResponse.StreamDetailData["+ i +"].StreamName"));
			streamData.setRegion(_ctx.stringValue("DescribeLiveStreamTranscodeMetricDataResponse.StreamDetailData["+ i +"].Region"));
			streamData.setDuration(_ctx.longValue("DescribeLiveStreamTranscodeMetricDataResponse.StreamDetailData["+ i +"].Duration"));
			streamData.setFps(_ctx.stringValue("DescribeLiveStreamTranscodeMetricDataResponse.StreamDetailData["+ i +"].Fps"));
			streamData.setTimeStamp(_ctx.stringValue("DescribeLiveStreamTranscodeMetricDataResponse.StreamDetailData["+ i +"].TimeStamp"));
			streamData.setTranscodeType(_ctx.stringValue("DescribeLiveStreamTranscodeMetricDataResponse.StreamDetailData["+ i +"].TranscodeType"));
			streamData.setResolution(_ctx.stringValue("DescribeLiveStreamTranscodeMetricDataResponse.StreamDetailData["+ i +"].Resolution"));

			streamDetailData.add(streamData);
		}
		describeLiveStreamTranscodeMetricDataResponse.setStreamDetailData(streamDetailData);
	 
	 	return describeLiveStreamTranscodeMetricDataResponse;
	}
}