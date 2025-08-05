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

import com.aliyuncs.live.model.v20161101.DescribeLiveStreamMergeResponse;
import com.aliyuncs.live.model.v20161101.DescribeLiveStreamMergeResponse.LiveStreamMerge;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveStreamMergeResponseUnmarshaller {

	public static DescribeLiveStreamMergeResponse unmarshall(DescribeLiveStreamMergeResponse describeLiveStreamMergeResponse, UnmarshallerContext _ctx) {
		
		describeLiveStreamMergeResponse.setRequestId(_ctx.stringValue("DescribeLiveStreamMergeResponse.RequestId"));

		List<LiveStreamMerge> liveStreamMergeList = new ArrayList<LiveStreamMerge>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLiveStreamMergeResponse.LiveStreamMergeList.Length"); i++) {
			LiveStreamMerge liveStreamMerge = new LiveStreamMerge();
			liveStreamMerge.setAppName(_ctx.stringValue("DescribeLiveStreamMergeResponse.LiveStreamMergeList["+ i +"].AppName"));
			liveStreamMerge.setAppUsing(_ctx.stringValue("DescribeLiveStreamMergeResponse.LiveStreamMergeList["+ i +"].AppUsing"));
			liveStreamMerge.setDomainName(_ctx.stringValue("DescribeLiveStreamMergeResponse.LiveStreamMergeList["+ i +"].DomainName"));
			liveStreamMerge.setEndTime(_ctx.stringValue("DescribeLiveStreamMergeResponse.LiveStreamMergeList["+ i +"].EndTime"));
			liveStreamMerge.setExtraInAppStreams(_ctx.stringValue("DescribeLiveStreamMergeResponse.LiveStreamMergeList["+ i +"].ExtraInAppStreams"));
			liveStreamMerge.setInAppName1(_ctx.stringValue("DescribeLiveStreamMergeResponse.LiveStreamMergeList["+ i +"].InAppName1"));
			liveStreamMerge.setInAppName2(_ctx.stringValue("DescribeLiveStreamMergeResponse.LiveStreamMergeList["+ i +"].InAppName2"));
			liveStreamMerge.setInStreamName1(_ctx.stringValue("DescribeLiveStreamMergeResponse.LiveStreamMergeList["+ i +"].InStreamName1"));
			liveStreamMerge.setInStreamName2(_ctx.stringValue("DescribeLiveStreamMergeResponse.LiveStreamMergeList["+ i +"].InStreamName2"));
			liveStreamMerge.setBizProtocol(_ctx.stringValue("DescribeLiveStreamMergeResponse.LiveStreamMergeList["+ i +"].Protocol"));
			liveStreamMerge.setStartTime(_ctx.stringValue("DescribeLiveStreamMergeResponse.LiveStreamMergeList["+ i +"].StartTime"));
			liveStreamMerge.setStreamName(_ctx.stringValue("DescribeLiveStreamMergeResponse.LiveStreamMergeList["+ i +"].StreamName"));
			liveStreamMerge.setStreamUsing(_ctx.stringValue("DescribeLiveStreamMergeResponse.LiveStreamMergeList["+ i +"].StreamUsing"));
			liveStreamMerge.setLiveMerger(_ctx.stringValue("DescribeLiveStreamMergeResponse.LiveStreamMergeList["+ i +"].LiveMerger"));
			liveStreamMerge.setMergeParameters(_ctx.stringValue("DescribeLiveStreamMergeResponse.LiveStreamMergeList["+ i +"].MergeParameters"));

			liveStreamMergeList.add(liveStreamMerge);
		}
		describeLiveStreamMergeResponse.setLiveStreamMergeList(liveStreamMergeList);
	 
	 	return describeLiveStreamMergeResponse;
	}
}