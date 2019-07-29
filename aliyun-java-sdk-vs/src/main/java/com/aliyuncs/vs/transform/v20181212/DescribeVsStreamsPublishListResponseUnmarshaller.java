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

package com.aliyuncs.vs.transform.v20181212;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vs.model.v20181212.DescribeVsStreamsPublishListResponse;
import com.aliyuncs.vs.model.v20181212.DescribeVsStreamsPublishListResponse.LiveStreamPublishInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVsStreamsPublishListResponseUnmarshaller {

	public static DescribeVsStreamsPublishListResponse unmarshall(DescribeVsStreamsPublishListResponse describeVsStreamsPublishListResponse, UnmarshallerContext _ctx) {
		
		describeVsStreamsPublishListResponse.setRequestId(_ctx.stringValue("DescribeVsStreamsPublishListResponse.RequestId"));
		describeVsStreamsPublishListResponse.setPageNum(_ctx.integerValue("DescribeVsStreamsPublishListResponse.PageNum"));
		describeVsStreamsPublishListResponse.setPageSize(_ctx.integerValue("DescribeVsStreamsPublishListResponse.PageSize"));
		describeVsStreamsPublishListResponse.setTotalNum(_ctx.integerValue("DescribeVsStreamsPublishListResponse.TotalNum"));
		describeVsStreamsPublishListResponse.setTotalPage(_ctx.integerValue("DescribeVsStreamsPublishListResponse.TotalPage"));

		List<LiveStreamPublishInfo> publishInfo = new ArrayList<LiveStreamPublishInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVsStreamsPublishListResponse.PublishInfo.Length"); i++) {
			LiveStreamPublishInfo liveStreamPublishInfo = new LiveStreamPublishInfo();
			liveStreamPublishInfo.setDomainName(_ctx.stringValue("DescribeVsStreamsPublishListResponse.PublishInfo["+ i +"].DomainName"));
			liveStreamPublishInfo.setAppName(_ctx.stringValue("DescribeVsStreamsPublishListResponse.PublishInfo["+ i +"].AppName"));
			liveStreamPublishInfo.setStreamName(_ctx.stringValue("DescribeVsStreamsPublishListResponse.PublishInfo["+ i +"].StreamName"));
			liveStreamPublishInfo.setStreamUrl(_ctx.stringValue("DescribeVsStreamsPublishListResponse.PublishInfo["+ i +"].StreamUrl"));
			liveStreamPublishInfo.setPublishTime(_ctx.stringValue("DescribeVsStreamsPublishListResponse.PublishInfo["+ i +"].PublishTime"));
			liveStreamPublishInfo.setStopTime(_ctx.stringValue("DescribeVsStreamsPublishListResponse.PublishInfo["+ i +"].StopTime"));
			liveStreamPublishInfo.setPublishUrl(_ctx.stringValue("DescribeVsStreamsPublishListResponse.PublishInfo["+ i +"].PublishUrl"));
			liveStreamPublishInfo.setClientAddr(_ctx.stringValue("DescribeVsStreamsPublishListResponse.PublishInfo["+ i +"].ClientAddr"));
			liveStreamPublishInfo.setEdgeNodeAddr(_ctx.stringValue("DescribeVsStreamsPublishListResponse.PublishInfo["+ i +"].EdgeNodeAddr"));
			liveStreamPublishInfo.setPublishDomain(_ctx.stringValue("DescribeVsStreamsPublishListResponse.PublishInfo["+ i +"].PublishDomain"));
			liveStreamPublishInfo.setPublishType(_ctx.stringValue("DescribeVsStreamsPublishListResponse.PublishInfo["+ i +"].PublishType"));
			liveStreamPublishInfo.setTranscoded(_ctx.stringValue("DescribeVsStreamsPublishListResponse.PublishInfo["+ i +"].Transcoded"));
			liveStreamPublishInfo.setTranscodeId(_ctx.stringValue("DescribeVsStreamsPublishListResponse.PublishInfo["+ i +"].TranscodeId"));

			publishInfo.add(liveStreamPublishInfo);
		}
		describeVsStreamsPublishListResponse.setPublishInfo(publishInfo);
	 
	 	return describeVsStreamsPublishListResponse;
	}
}