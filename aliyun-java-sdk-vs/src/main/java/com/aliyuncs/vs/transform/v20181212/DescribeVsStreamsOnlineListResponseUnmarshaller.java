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

import com.aliyuncs.vs.model.v20181212.DescribeVsStreamsOnlineListResponse;
import com.aliyuncs.vs.model.v20181212.DescribeVsStreamsOnlineListResponse.LiveStreamOnlineInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVsStreamsOnlineListResponseUnmarshaller {

	public static DescribeVsStreamsOnlineListResponse unmarshall(DescribeVsStreamsOnlineListResponse describeVsStreamsOnlineListResponse, UnmarshallerContext _ctx) {
		
		describeVsStreamsOnlineListResponse.setRequestId(_ctx.stringValue("DescribeVsStreamsOnlineListResponse.RequestId"));
		describeVsStreamsOnlineListResponse.setPageNum(_ctx.integerValue("DescribeVsStreamsOnlineListResponse.PageNum"));
		describeVsStreamsOnlineListResponse.setPageSize(_ctx.integerValue("DescribeVsStreamsOnlineListResponse.PageSize"));
		describeVsStreamsOnlineListResponse.setTotalNum(_ctx.integerValue("DescribeVsStreamsOnlineListResponse.TotalNum"));
		describeVsStreamsOnlineListResponse.setTotalPage(_ctx.integerValue("DescribeVsStreamsOnlineListResponse.TotalPage"));

		List<LiveStreamOnlineInfo> onlineInfo = new ArrayList<LiveStreamOnlineInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVsStreamsOnlineListResponse.OnlineInfo.Length"); i++) {
			LiveStreamOnlineInfo liveStreamOnlineInfo = new LiveStreamOnlineInfo();
			liveStreamOnlineInfo.setDomainName(_ctx.stringValue("DescribeVsStreamsOnlineListResponse.OnlineInfo["+ i +"].DomainName"));
			liveStreamOnlineInfo.setAppName(_ctx.stringValue("DescribeVsStreamsOnlineListResponse.OnlineInfo["+ i +"].AppName"));
			liveStreamOnlineInfo.setStreamName(_ctx.stringValue("DescribeVsStreamsOnlineListResponse.OnlineInfo["+ i +"].StreamName"));
			liveStreamOnlineInfo.setPublishTime(_ctx.stringValue("DescribeVsStreamsOnlineListResponse.OnlineInfo["+ i +"].PublishTime"));
			liveStreamOnlineInfo.setPublishUrl(_ctx.stringValue("DescribeVsStreamsOnlineListResponse.OnlineInfo["+ i +"].PublishUrl"));
			liveStreamOnlineInfo.setPublishDomain(_ctx.stringValue("DescribeVsStreamsOnlineListResponse.OnlineInfo["+ i +"].PublishDomain"));
			liveStreamOnlineInfo.setPublishType(_ctx.stringValue("DescribeVsStreamsOnlineListResponse.OnlineInfo["+ i +"].PublishType"));
			liveStreamOnlineInfo.setTranscoded(_ctx.stringValue("DescribeVsStreamsOnlineListResponse.OnlineInfo["+ i +"].Transcoded"));
			liveStreamOnlineInfo.setTranscodeId(_ctx.stringValue("DescribeVsStreamsOnlineListResponse.OnlineInfo["+ i +"].TranscodeId"));

			onlineInfo.add(liveStreamOnlineInfo);
		}
		describeVsStreamsOnlineListResponse.setOnlineInfo(onlineInfo);
	 
	 	return describeVsStreamsOnlineListResponse;
	}
}