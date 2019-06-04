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

import com.aliyuncs.live.model.v20161101.DescribeLiveStreamsOnlineListResponse;
import com.aliyuncs.live.model.v20161101.DescribeLiveStreamsOnlineListResponse.LiveStreamOnlineInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveStreamsOnlineListResponseUnmarshaller {

	public static DescribeLiveStreamsOnlineListResponse unmarshall(DescribeLiveStreamsOnlineListResponse describeLiveStreamsOnlineListResponse, UnmarshallerContext context) {
		
		describeLiveStreamsOnlineListResponse.setRequestId(context.stringValue("DescribeLiveStreamsOnlineListResponse.RequestId"));
		describeLiveStreamsOnlineListResponse.setPageNum(context.integerValue("DescribeLiveStreamsOnlineListResponse.PageNum"));
		describeLiveStreamsOnlineListResponse.setPageSize(context.integerValue("DescribeLiveStreamsOnlineListResponse.PageSize"));
		describeLiveStreamsOnlineListResponse.setTotalNum(context.integerValue("DescribeLiveStreamsOnlineListResponse.TotalNum"));
		describeLiveStreamsOnlineListResponse.setTotalPage(context.integerValue("DescribeLiveStreamsOnlineListResponse.TotalPage"));

		List<LiveStreamOnlineInfo> onlineInfo = new ArrayList<LiveStreamOnlineInfo>();
		for (int i = 0; i < context.lengthValue("DescribeLiveStreamsOnlineListResponse.OnlineInfo.Length"); i++) {
			LiveStreamOnlineInfo liveStreamOnlineInfo = new LiveStreamOnlineInfo();
			liveStreamOnlineInfo.setDomainName(context.stringValue("DescribeLiveStreamsOnlineListResponse.OnlineInfo["+ i +"].DomainName"));
			liveStreamOnlineInfo.setAppName(context.stringValue("DescribeLiveStreamsOnlineListResponse.OnlineInfo["+ i +"].AppName"));
			liveStreamOnlineInfo.setStreamName(context.stringValue("DescribeLiveStreamsOnlineListResponse.OnlineInfo["+ i +"].StreamName"));
			liveStreamOnlineInfo.setPublishTime(context.stringValue("DescribeLiveStreamsOnlineListResponse.OnlineInfo["+ i +"].PublishTime"));
			liveStreamOnlineInfo.setPublishUrl(context.stringValue("DescribeLiveStreamsOnlineListResponse.OnlineInfo["+ i +"].PublishUrl"));
			liveStreamOnlineInfo.setPublishDomain(context.stringValue("DescribeLiveStreamsOnlineListResponse.OnlineInfo["+ i +"].PublishDomain"));
			liveStreamOnlineInfo.setPublishType(context.stringValue("DescribeLiveStreamsOnlineListResponse.OnlineInfo["+ i +"].PublishType"));
			liveStreamOnlineInfo.setTranscoded(context.stringValue("DescribeLiveStreamsOnlineListResponse.OnlineInfo["+ i +"].Transcoded"));
			liveStreamOnlineInfo.setTranscodeId(context.stringValue("DescribeLiveStreamsOnlineListResponse.OnlineInfo["+ i +"].TranscodeId"));
			liveStreamOnlineInfo.setServerIp(context.stringValue("DescribeLiveStreamsOnlineListResponse.OnlineInfo["+ i +"].ServerIp"));
			liveStreamOnlineInfo.setClientIp(context.stringValue("DescribeLiveStreamsOnlineListResponse.OnlineInfo["+ i +"].ClientIp"));
			liveStreamOnlineInfo.setVideoCodecId(context.integerValue("DescribeLiveStreamsOnlineListResponse.OnlineInfo["+ i +"].VideoCodecId"));
			liveStreamOnlineInfo.setVideoDataRate(context.integerValue("DescribeLiveStreamsOnlineListResponse.OnlineInfo["+ i +"].VideoDataRate"));
			liveStreamOnlineInfo.setFrameRate(context.integerValue("DescribeLiveStreamsOnlineListResponse.OnlineInfo["+ i +"].FrameRate"));
			liveStreamOnlineInfo.setWidth(context.integerValue("DescribeLiveStreamsOnlineListResponse.OnlineInfo["+ i +"].Width"));
			liveStreamOnlineInfo.setHeight(context.integerValue("DescribeLiveStreamsOnlineListResponse.OnlineInfo["+ i +"].Height"));
			liveStreamOnlineInfo.setAudioCodecId(context.integerValue("DescribeLiveStreamsOnlineListResponse.OnlineInfo["+ i +"].AudioCodecId"));
			liveStreamOnlineInfo.setAudioDataRate(context.integerValue("DescribeLiveStreamsOnlineListResponse.OnlineInfo["+ i +"].AudioDataRate"));

			onlineInfo.add(liveStreamOnlineInfo);
		}
		describeLiveStreamsOnlineListResponse.setOnlineInfo(onlineInfo);
	 
	 	return describeLiveStreamsOnlineListResponse;
	}
}