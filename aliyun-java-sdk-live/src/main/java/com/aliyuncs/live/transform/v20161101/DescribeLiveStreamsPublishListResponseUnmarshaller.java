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
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveStreamsPublishListResponseUnmarshaller {

	public static DescribeLiveStreamsPublishListResponse unmarshall(DescribeLiveStreamsPublishListResponse describeLiveStreamsPublishListResponse, UnmarshallerContext _ctx) {
		
		describeLiveStreamsPublishListResponse.setRequestId(_ctx.stringValue("DescribeLiveStreamsPublishListResponse.RequestId"));
		describeLiveStreamsPublishListResponse.setPageNum(_ctx.integerValue("DescribeLiveStreamsPublishListResponse.PageNum"));
		describeLiveStreamsPublishListResponse.setPageSize(_ctx.integerValue("DescribeLiveStreamsPublishListResponse.PageSize"));
		describeLiveStreamsPublishListResponse.setTotalNum(_ctx.integerValue("DescribeLiveStreamsPublishListResponse.TotalNum"));
		describeLiveStreamsPublishListResponse.setTotalPage(_ctx.integerValue("DescribeLiveStreamsPublishListResponse.TotalPage"));

		List<LiveStreamPublishInfo> publishInfo = new ArrayList<LiveStreamPublishInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLiveStreamsPublishListResponse.PublishInfo.Length"); i++) {
			LiveStreamPublishInfo liveStreamPublishInfo = new LiveStreamPublishInfo();
			liveStreamPublishInfo.setDomainName(_ctx.stringValue("DescribeLiveStreamsPublishListResponse.PublishInfo["+ i +"].DomainName"));
			liveStreamPublishInfo.setAppName(_ctx.stringValue("DescribeLiveStreamsPublishListResponse.PublishInfo["+ i +"].AppName"));
			liveStreamPublishInfo.setStreamName(_ctx.stringValue("DescribeLiveStreamsPublishListResponse.PublishInfo["+ i +"].StreamName"));
			liveStreamPublishInfo.setStreamUrl(_ctx.stringValue("DescribeLiveStreamsPublishListResponse.PublishInfo["+ i +"].StreamUrl"));
			liveStreamPublishInfo.setPublishTime(_ctx.stringValue("DescribeLiveStreamsPublishListResponse.PublishInfo["+ i +"].PublishTime"));
			liveStreamPublishInfo.setStopTime(_ctx.stringValue("DescribeLiveStreamsPublishListResponse.PublishInfo["+ i +"].StopTime"));
			liveStreamPublishInfo.setPublishUrl(_ctx.stringValue("DescribeLiveStreamsPublishListResponse.PublishInfo["+ i +"].PublishUrl"));
			liveStreamPublishInfo.setClientAddr(_ctx.stringValue("DescribeLiveStreamsPublishListResponse.PublishInfo["+ i +"].ClientAddr"));
			liveStreamPublishInfo.setEdgeNodeAddr(_ctx.stringValue("DescribeLiveStreamsPublishListResponse.PublishInfo["+ i +"].EdgeNodeAddr"));
			liveStreamPublishInfo.setPublishDomain(_ctx.stringValue("DescribeLiveStreamsPublishListResponse.PublishInfo["+ i +"].PublishDomain"));
			liveStreamPublishInfo.setPublishType(_ctx.stringValue("DescribeLiveStreamsPublishListResponse.PublishInfo["+ i +"].PublishType"));
			liveStreamPublishInfo.setTranscoded(_ctx.stringValue("DescribeLiveStreamsPublishListResponse.PublishInfo["+ i +"].Transcoded"));
			liveStreamPublishInfo.setTranscodeId(_ctx.stringValue("DescribeLiveStreamsPublishListResponse.PublishInfo["+ i +"].TranscodeId"));

			publishInfo.add(liveStreamPublishInfo);
		}
		describeLiveStreamsPublishListResponse.setPublishInfo(publishInfo);
	 
	 	return describeLiveStreamsPublishListResponse;
	}
}