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

import com.aliyuncs.live.model.v20161101.DescribeLiveUserStreamMetricDataResponse;
import com.aliyuncs.live.model.v20161101.DescribeLiveUserStreamMetricDataResponse.StreamData;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveUserStreamMetricDataResponseUnmarshaller {

	public static DescribeLiveUserStreamMetricDataResponse unmarshall(DescribeLiveUserStreamMetricDataResponse describeLiveUserStreamMetricDataResponse, UnmarshallerContext _ctx) {
		
		describeLiveUserStreamMetricDataResponse.setRequestId(_ctx.stringValue("DescribeLiveUserStreamMetricDataResponse.RequestId"));
		describeLiveUserStreamMetricDataResponse.setDomainName(_ctx.stringValue("DescribeLiveUserStreamMetricDataResponse.DomainName"));
		describeLiveUserStreamMetricDataResponse.setEndTime(_ctx.stringValue("DescribeLiveUserStreamMetricDataResponse.EndTime"));
		describeLiveUserStreamMetricDataResponse.setPageSize(_ctx.longValue("DescribeLiveUserStreamMetricDataResponse.PageSize"));
		describeLiveUserStreamMetricDataResponse.setStartTime(_ctx.stringValue("DescribeLiveUserStreamMetricDataResponse.StartTime"));
		describeLiveUserStreamMetricDataResponse.setTotalCount(_ctx.longValue("DescribeLiveUserStreamMetricDataResponse.TotalCount"));
		describeLiveUserStreamMetricDataResponse.setPageNumber(_ctx.longValue("DescribeLiveUserStreamMetricDataResponse.PageNumber"));

		List<StreamData> streamDetailData = new ArrayList<StreamData>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLiveUserStreamMetricDataResponse.StreamDetailData.Length"); i++) {
			StreamData streamData = new StreamData();
			streamData.setAppName(_ctx.stringValue("DescribeLiveUserStreamMetricDataResponse.StreamDetailData["+ i +"].AppName"));
			streamData.setBps(_ctx.floatValue("DescribeLiveUserStreamMetricDataResponse.StreamDetailData["+ i +"].Bps"));
			streamData.setCount(_ctx.longValue("DescribeLiveUserStreamMetricDataResponse.StreamDetailData["+ i +"].Count"));
			streamData.setFlvBps(_ctx.floatValue("DescribeLiveUserStreamMetricDataResponse.StreamDetailData["+ i +"].FlvBps"));
			streamData.setFlvCount(_ctx.longValue("DescribeLiveUserStreamMetricDataResponse.StreamDetailData["+ i +"].FlvCount"));
			streamData.setFlvTraffic(_ctx.doubleValue("DescribeLiveUserStreamMetricDataResponse.StreamDetailData["+ i +"].FlvTraffic"));
			streamData.setHlsBps(_ctx.floatValue("DescribeLiveUserStreamMetricDataResponse.StreamDetailData["+ i +"].HlsBps"));
			streamData.setHlsCount(_ctx.longValue("DescribeLiveUserStreamMetricDataResponse.StreamDetailData["+ i +"].HlsCount"));
			streamData.setHlsTraffic(_ctx.doubleValue("DescribeLiveUserStreamMetricDataResponse.StreamDetailData["+ i +"].HlsTraffic"));
			streamData.setNewConns(_ctx.longValue("DescribeLiveUserStreamMetricDataResponse.StreamDetailData["+ i +"].NewConns"));
			streamData.setP2pBps(_ctx.floatValue("DescribeLiveUserStreamMetricDataResponse.StreamDetailData["+ i +"].P2pBps"));
			streamData.setP2pCount(_ctx.longValue("DescribeLiveUserStreamMetricDataResponse.StreamDetailData["+ i +"].P2pCount"));
			streamData.setP2pTraffic(_ctx.doubleValue("DescribeLiveUserStreamMetricDataResponse.StreamDetailData["+ i +"].P2pTraffic"));
			streamData.setRtmpBps(_ctx.floatValue("DescribeLiveUserStreamMetricDataResponse.StreamDetailData["+ i +"].RtmpBps"));
			streamData.setRtmpCount(_ctx.longValue("DescribeLiveUserStreamMetricDataResponse.StreamDetailData["+ i +"].RtmpCount"));
			streamData.setRtmpTraffic(_ctx.doubleValue("DescribeLiveUserStreamMetricDataResponse.StreamDetailData["+ i +"].RtmpTraffic"));
			streamData.setRtsBps(_ctx.doubleValue("DescribeLiveUserStreamMetricDataResponse.StreamDetailData["+ i +"].RtsBps"));
			streamData.setRtsCount(_ctx.longValue("DescribeLiveUserStreamMetricDataResponse.StreamDetailData["+ i +"].RtsCount"));
			streamData.setRtsTraffic(_ctx.doubleValue("DescribeLiveUserStreamMetricDataResponse.StreamDetailData["+ i +"].RtsTraffic"));
			streamData.setStreamName(_ctx.stringValue("DescribeLiveUserStreamMetricDataResponse.StreamDetailData["+ i +"].StreamName"));
			streamData.setTimeStamp(_ctx.stringValue("DescribeLiveUserStreamMetricDataResponse.StreamDetailData["+ i +"].TimeStamp"));
			streamData.setTraffic(_ctx.doubleValue("DescribeLiveUserStreamMetricDataResponse.StreamDetailData["+ i +"].Traffic"));

			streamDetailData.add(streamData);
		}
		describeLiveUserStreamMetricDataResponse.setStreamDetailData(streamDetailData);
	 
	 	return describeLiveUserStreamMetricDataResponse;
	}
}