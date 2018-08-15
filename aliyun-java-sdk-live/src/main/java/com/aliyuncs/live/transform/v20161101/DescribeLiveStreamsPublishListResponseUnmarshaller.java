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

import com.aliyuncs.live.model.v20161101.DescribeLiveStreamsPublishListResponse;
import com.aliyuncs.live.model.v20161101.DescribeLiveStreamsPublishListResponse.LiveStreamPublishInfo;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveStreamsPublishListResponseUnmarshaller {

	public static DescribeLiveStreamsPublishListResponse unmarshall(DescribeLiveStreamsPublishListResponse describeLiveStreamsPublishListResponse, UnmarshallerContext context) {
		
		describeLiveStreamsPublishListResponse.setRequestId(context.stringValue("DescribeLiveStreamsPublishListResponse.RequestId"));
		describeLiveStreamsPublishListResponse.setPageNum(context.integerValue("DescribeLiveStreamsPublishListResponse.PageNum"));
		describeLiveStreamsPublishListResponse.setPageSize(context.integerValue("DescribeLiveStreamsPublishListResponse.PageSize"));
		describeLiveStreamsPublishListResponse.setTotalNum(context.integerValue("DescribeLiveStreamsPublishListResponse.TotalNum"));
		describeLiveStreamsPublishListResponse.setTotalPage(context.integerValue("DescribeLiveStreamsPublishListResponse.TotalPage"));

		List<LiveStreamPublishInfo> publishInfo = new ArrayList<LiveStreamPublishInfo>();
		for (int i = 0; i < context.lengthValue("DescribeLiveStreamsPublishListResponse.PublishInfo.Length"); i++) {
			LiveStreamPublishInfo liveStreamPublishInfo = new LiveStreamPublishInfo();
			liveStreamPublishInfo.setDomainName(context.stringValue("DescribeLiveStreamsPublishListResponse.PublishInfo["+ i +"].DomainName"));
			liveStreamPublishInfo.setAppName(context.stringValue("DescribeLiveStreamsPublishListResponse.PublishInfo["+ i +"].AppName"));
			liveStreamPublishInfo.setStreamName(context.stringValue("DescribeLiveStreamsPublishListResponse.PublishInfo["+ i +"].StreamName"));
			liveStreamPublishInfo.setStreamUrl(context.stringValue("DescribeLiveStreamsPublishListResponse.PublishInfo["+ i +"].StreamUrl"));
			liveStreamPublishInfo.setPublishTime(context.stringValue("DescribeLiveStreamsPublishListResponse.PublishInfo["+ i +"].PublishTime"));
			liveStreamPublishInfo.setStopTime(context.stringValue("DescribeLiveStreamsPublishListResponse.PublishInfo["+ i +"].StopTime"));
			liveStreamPublishInfo.setPublishUrl(context.stringValue("DescribeLiveStreamsPublishListResponse.PublishInfo["+ i +"].PublishUrl"));
			liveStreamPublishInfo.setClientAddr(context.stringValue("DescribeLiveStreamsPublishListResponse.PublishInfo["+ i +"].ClientAddr"));
			liveStreamPublishInfo.setEdgeNodeAddr(context.stringValue("DescribeLiveStreamsPublishListResponse.PublishInfo["+ i +"].EdgeNodeAddr"));
			liveStreamPublishInfo.setPublishDomain(context.stringValue("DescribeLiveStreamsPublishListResponse.PublishInfo["+ i +"].PublishDomain"));
			liveStreamPublishInfo.setPublishType(context.stringValue("DescribeLiveStreamsPublishListResponse.PublishInfo["+ i +"].PublishType"));
			liveStreamPublishInfo.setTranscoded(context.stringValue("DescribeLiveStreamsPublishListResponse.PublishInfo["+ i +"].Transcoded"));
			liveStreamPublishInfo.setTranscodeId(context.stringValue("DescribeLiveStreamsPublishListResponse.PublishInfo["+ i +"].TranscodeId"));

			publishInfo.add(liveStreamPublishInfo);
		}
		describeLiveStreamsPublishListResponse.setPublishInfo(publishInfo);
	 
	 	return describeLiveStreamsPublishListResponse;
	}
}