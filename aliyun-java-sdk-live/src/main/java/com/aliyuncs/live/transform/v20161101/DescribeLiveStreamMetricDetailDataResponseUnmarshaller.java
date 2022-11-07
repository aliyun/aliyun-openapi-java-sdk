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

import com.aliyuncs.live.model.v20161101.DescribeLiveStreamMetricDetailDataResponse;
import com.aliyuncs.live.model.v20161101.DescribeLiveStreamMetricDetailDataResponse.StreamData;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveStreamMetricDetailDataResponseUnmarshaller {

	public static DescribeLiveStreamMetricDetailDataResponse unmarshall(DescribeLiveStreamMetricDetailDataResponse describeLiveStreamMetricDetailDataResponse, UnmarshallerContext _ctx) {
		
		describeLiveStreamMetricDetailDataResponse.setRequestId(_ctx.stringValue("DescribeLiveStreamMetricDetailDataResponse.RequestId"));
		describeLiveStreamMetricDetailDataResponse.setEndTime(_ctx.stringValue("DescribeLiveStreamMetricDetailDataResponse.EndTime"));
		describeLiveStreamMetricDetailDataResponse.setStartTime(_ctx.stringValue("DescribeLiveStreamMetricDetailDataResponse.StartTime"));
		describeLiveStreamMetricDetailDataResponse.setNextPageToken(_ctx.stringValue("DescribeLiveStreamMetricDetailDataResponse.NextPageToken"));
		describeLiveStreamMetricDetailDataResponse.setPageSize(_ctx.integerValue("DescribeLiveStreamMetricDetailDataResponse.PageSize"));
		describeLiveStreamMetricDetailDataResponse.setDomainName(_ctx.stringValue("DescribeLiveStreamMetricDetailDataResponse.DomainName"));

		List<StreamData> streamDetailData = new ArrayList<StreamData>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLiveStreamMetricDetailDataResponse.StreamDetailData.Length"); i++) {
			StreamData streamData = new StreamData();
			streamData.setP2pTraffic(_ctx.longValue("DescribeLiveStreamMetricDetailDataResponse.StreamDetailData["+ i +"].P2pTraffic"));
			streamData.setRtmpBps(_ctx.floatValue("DescribeLiveStreamMetricDetailDataResponse.StreamDetailData["+ i +"].RtmpBps"));
			streamData.setHlsBps(_ctx.floatValue("DescribeLiveStreamMetricDetailDataResponse.StreamDetailData["+ i +"].HlsBps"));
			streamData.setP2pBps(_ctx.floatValue("DescribeLiveStreamMetricDetailDataResponse.StreamDetailData["+ i +"].P2pBps"));
			streamData.setStreamName(_ctx.stringValue("DescribeLiveStreamMetricDetailDataResponse.StreamDetailData["+ i +"].StreamName"));
			streamData.setP2pCount(_ctx.longValue("DescribeLiveStreamMetricDetailDataResponse.StreamDetailData["+ i +"].P2pCount"));
			streamData.setTraffic(_ctx.longValue("DescribeLiveStreamMetricDetailDataResponse.StreamDetailData["+ i +"].Traffic"));
			streamData.setRtmpCount(_ctx.longValue("DescribeLiveStreamMetricDetailDataResponse.StreamDetailData["+ i +"].RtmpCount"));
			streamData.setRtsCount(_ctx.longValue("DescribeLiveStreamMetricDetailDataResponse.StreamDetailData["+ i +"].RtsCount"));
			streamData.setRtsBps(_ctx.floatValue("DescribeLiveStreamMetricDetailDataResponse.StreamDetailData["+ i +"].RtsBps"));
			streamData.setBps(_ctx.floatValue("DescribeLiveStreamMetricDetailDataResponse.StreamDetailData["+ i +"].Bps"));
			streamData.setHlsTraffic(_ctx.longValue("DescribeLiveStreamMetricDetailDataResponse.StreamDetailData["+ i +"].HlsTraffic"));
			streamData.setFlvBps(_ctx.floatValue("DescribeLiveStreamMetricDetailDataResponse.StreamDetailData["+ i +"].FlvBps"));
			streamData.setCount(_ctx.longValue("DescribeLiveStreamMetricDetailDataResponse.StreamDetailData["+ i +"].Count"));
			streamData.setRtsTraffic(_ctx.longValue("DescribeLiveStreamMetricDetailDataResponse.StreamDetailData["+ i +"].RtsTraffic"));
			streamData.setRtmpTraffic(_ctx.longValue("DescribeLiveStreamMetricDetailDataResponse.StreamDetailData["+ i +"].RtmpTraffic"));
			streamData.setHlsCount(_ctx.longValue("DescribeLiveStreamMetricDetailDataResponse.StreamDetailData["+ i +"].HlsCount"));
			streamData.setAppName(_ctx.stringValue("DescribeLiveStreamMetricDetailDataResponse.StreamDetailData["+ i +"].AppName"));
			streamData.setFlvCount(_ctx.longValue("DescribeLiveStreamMetricDetailDataResponse.StreamDetailData["+ i +"].FlvCount"));
			streamData.setFlvTraffic(_ctx.longValue("DescribeLiveStreamMetricDetailDataResponse.StreamDetailData["+ i +"].FlvTraffic"));
			streamData.setTimeStamp(_ctx.stringValue("DescribeLiveStreamMetricDetailDataResponse.StreamDetailData["+ i +"].TimeStamp"));

			streamDetailData.add(streamData);
		}
		describeLiveStreamMetricDetailDataResponse.setStreamDetailData(streamDetailData);
	 
	 	return describeLiveStreamMetricDetailDataResponse;
	}
}