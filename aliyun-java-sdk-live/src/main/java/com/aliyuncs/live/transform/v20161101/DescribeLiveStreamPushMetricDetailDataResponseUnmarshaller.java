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

import com.aliyuncs.live.model.v20161101.DescribeLiveStreamPushMetricDetailDataResponse;
import com.aliyuncs.live.model.v20161101.DescribeLiveStreamPushMetricDetailDataResponse.StreamData;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveStreamPushMetricDetailDataResponseUnmarshaller {

	public static DescribeLiveStreamPushMetricDetailDataResponse unmarshall(DescribeLiveStreamPushMetricDetailDataResponse describeLiveStreamPushMetricDetailDataResponse, UnmarshallerContext _ctx) {
		
		describeLiveStreamPushMetricDetailDataResponse.setRequestId(_ctx.stringValue("DescribeLiveStreamPushMetricDetailDataResponse.RequestId"));
		describeLiveStreamPushMetricDetailDataResponse.setEndTime(_ctx.stringValue("DescribeLiveStreamPushMetricDetailDataResponse.EndTime"));
		describeLiveStreamPushMetricDetailDataResponse.setStartTime(_ctx.stringValue("DescribeLiveStreamPushMetricDetailDataResponse.StartTime"));
		describeLiveStreamPushMetricDetailDataResponse.setNextPageToken(_ctx.stringValue("DescribeLiveStreamPushMetricDetailDataResponse.NextPageToken"));
		describeLiveStreamPushMetricDetailDataResponse.setPageSize(_ctx.integerValue("DescribeLiveStreamPushMetricDetailDataResponse.PageSize"));
		describeLiveStreamPushMetricDetailDataResponse.setDomainName(_ctx.stringValue("DescribeLiveStreamPushMetricDetailDataResponse.DomainName"));

		List<StreamData> streamDetailData = new ArrayList<StreamData>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLiveStreamPushMetricDetailDataResponse.StreamDetailData.Length"); i++) {
			StreamData streamData = new StreamData();
			streamData.setAppName(_ctx.stringValue("DescribeLiveStreamPushMetricDetailDataResponse.StreamDetailData["+ i +"].AppName"));
			streamData.setTimeStamp(_ctx.stringValue("DescribeLiveStreamPushMetricDetailDataResponse.StreamDetailData["+ i +"].TimeStamp"));
			streamData.setReqBps(_ctx.floatValue("DescribeLiveStreamPushMetricDetailDataResponse.StreamDetailData["+ i +"].ReqBps"));
			streamData.setReqTraffic(_ctx.longValue("DescribeLiveStreamPushMetricDetailDataResponse.StreamDetailData["+ i +"].ReqTraffic"));
			streamData.setStreamName(_ctx.stringValue("DescribeLiveStreamPushMetricDetailDataResponse.StreamDetailData["+ i +"].StreamName"));

			streamDetailData.add(streamData);
		}
		describeLiveStreamPushMetricDetailDataResponse.setStreamDetailData(streamDetailData);
	 
	 	return describeLiveStreamPushMetricDetailDataResponse;
	}
}