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

	public static DescribeLiveStreamsOnlineListResponse unmarshall(DescribeLiveStreamsOnlineListResponse describeLiveStreamsOnlineListResponse, UnmarshallerContext _ctx) {
		
		describeLiveStreamsOnlineListResponse.setRequestId(_ctx.stringValue("DescribeLiveStreamsOnlineListResponse.RequestId"));
		describeLiveStreamsOnlineListResponse.setTotalPage(_ctx.integerValue("DescribeLiveStreamsOnlineListResponse.TotalPage"));
		describeLiveStreamsOnlineListResponse.setPageNum(_ctx.integerValue("DescribeLiveStreamsOnlineListResponse.PageNum"));
		describeLiveStreamsOnlineListResponse.setPageSize(_ctx.integerValue("DescribeLiveStreamsOnlineListResponse.PageSize"));
		describeLiveStreamsOnlineListResponse.setTotalNum(_ctx.integerValue("DescribeLiveStreamsOnlineListResponse.TotalNum"));

		List<LiveStreamOnlineInfo> onlineInfo = new ArrayList<LiveStreamOnlineInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLiveStreamsOnlineListResponse.OnlineInfo.Length"); i++) {
			LiveStreamOnlineInfo liveStreamOnlineInfo = new LiveStreamOnlineInfo();
			liveStreamOnlineInfo.setAudioDataRate(_ctx.integerValue("DescribeLiveStreamsOnlineListResponse.OnlineInfo["+ i +"].AudioDataRate"));
			liveStreamOnlineInfo.setFrameRate(_ctx.integerValue("DescribeLiveStreamsOnlineListResponse.OnlineInfo["+ i +"].FrameRate"));
			liveStreamOnlineInfo.setPublishUrl(_ctx.stringValue("DescribeLiveStreamsOnlineListResponse.OnlineInfo["+ i +"].PublishUrl"));
			liveStreamOnlineInfo.setStreamName(_ctx.stringValue("DescribeLiveStreamsOnlineListResponse.OnlineInfo["+ i +"].StreamName"));
			liveStreamOnlineInfo.setAudioCodecId(_ctx.integerValue("DescribeLiveStreamsOnlineListResponse.OnlineInfo["+ i +"].AudioCodecId"));
			liveStreamOnlineInfo.setHeight(_ctx.integerValue("DescribeLiveStreamsOnlineListResponse.OnlineInfo["+ i +"].Height"));
			liveStreamOnlineInfo.setVideoDataRate(_ctx.integerValue("DescribeLiveStreamsOnlineListResponse.OnlineInfo["+ i +"].VideoDataRate"));
			liveStreamOnlineInfo.setDomainName(_ctx.stringValue("DescribeLiveStreamsOnlineListResponse.OnlineInfo["+ i +"].DomainName"));
			liveStreamOnlineInfo.setTranscodeId(_ctx.stringValue("DescribeLiveStreamsOnlineListResponse.OnlineInfo["+ i +"].TranscodeId"));
			liveStreamOnlineInfo.setTranscodeDrm(_ctx.stringValue("DescribeLiveStreamsOnlineListResponse.OnlineInfo["+ i +"].TranscodeDrm"));
			liveStreamOnlineInfo.setPublishDomain(_ctx.stringValue("DescribeLiveStreamsOnlineListResponse.OnlineInfo["+ i +"].PublishDomain"));
			liveStreamOnlineInfo.setPublishTime(_ctx.stringValue("DescribeLiveStreamsOnlineListResponse.OnlineInfo["+ i +"].PublishTime"));
			liveStreamOnlineInfo.setAppName(_ctx.stringValue("DescribeLiveStreamsOnlineListResponse.OnlineInfo["+ i +"].AppName"));
			liveStreamOnlineInfo.setPublishType(_ctx.stringValue("DescribeLiveStreamsOnlineListResponse.OnlineInfo["+ i +"].PublishType"));
			liveStreamOnlineInfo.setVideoCodecId(_ctx.integerValue("DescribeLiveStreamsOnlineListResponse.OnlineInfo["+ i +"].VideoCodecId"));
			liveStreamOnlineInfo.setTranscoded(_ctx.stringValue("DescribeLiveStreamsOnlineListResponse.OnlineInfo["+ i +"].Transcoded"));
			liveStreamOnlineInfo.setWidth(_ctx.integerValue("DescribeLiveStreamsOnlineListResponse.OnlineInfo["+ i +"].Width"));
			liveStreamOnlineInfo.setClientIp(_ctx.stringValue("DescribeLiveStreamsOnlineListResponse.OnlineInfo["+ i +"].ClientIp"));
			liveStreamOnlineInfo.setServerIp(_ctx.stringValue("DescribeLiveStreamsOnlineListResponse.OnlineInfo["+ i +"].ServerIp"));
			liveStreamOnlineInfo.setStreamUrlArgs(_ctx.stringValue("DescribeLiveStreamsOnlineListResponse.OnlineInfo["+ i +"].StreamUrlArgs"));
			liveStreamOnlineInfo.setCurrAudioDataRate(_ctx.integerValue("DescribeLiveStreamsOnlineListResponse.OnlineInfo["+ i +"].CurrAudioDataRate"));
			liveStreamOnlineInfo.setCurrVideoDataRate(_ctx.integerValue("DescribeLiveStreamsOnlineListResponse.OnlineInfo["+ i +"].CurrVideoDataRate"));
			liveStreamOnlineInfo.setCurrWidth(_ctx.integerValue("DescribeLiveStreamsOnlineListResponse.OnlineInfo["+ i +"].CurrWidth"));
			liveStreamOnlineInfo.setCurrHeight(_ctx.integerValue("DescribeLiveStreamsOnlineListResponse.OnlineInfo["+ i +"].CurrHeight"));
			liveStreamOnlineInfo.setCurrFrameRate(_ctx.integerValue("DescribeLiveStreamsOnlineListResponse.OnlineInfo["+ i +"].CurrFrameRate"));
			liveStreamOnlineInfo.setCurrVideoCodecId(_ctx.integerValue("DescribeLiveStreamsOnlineListResponse.OnlineInfo["+ i +"].CurrVideoCodecId"));

			onlineInfo.add(liveStreamOnlineInfo);
		}
		describeLiveStreamsOnlineListResponse.setOnlineInfo(onlineInfo);
	 
	 	return describeLiveStreamsOnlineListResponse;
	}
}