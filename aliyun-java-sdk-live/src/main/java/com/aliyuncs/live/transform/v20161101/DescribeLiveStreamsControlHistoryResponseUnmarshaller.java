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

import com.aliyuncs.live.model.v20161101.DescribeLiveStreamsControlHistoryResponse;
import com.aliyuncs.live.model.v20161101.DescribeLiveStreamsControlHistoryResponse.LiveStreamControlInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveStreamsControlHistoryResponseUnmarshaller {

	public static DescribeLiveStreamsControlHistoryResponse unmarshall(DescribeLiveStreamsControlHistoryResponse describeLiveStreamsControlHistoryResponse, UnmarshallerContext context) {
		
		describeLiveStreamsControlHistoryResponse.setRequestId(context.stringValue("DescribeLiveStreamsControlHistoryResponse.RequestId"));

		List<LiveStreamControlInfo> controlInfo = new ArrayList<LiveStreamControlInfo>();
		for (int i = 0; i < context.lengthValue("DescribeLiveStreamsControlHistoryResponse.ControlInfo.Length"); i++) {
			LiveStreamControlInfo liveStreamControlInfo = new LiveStreamControlInfo();
			liveStreamControlInfo.setStreamName(context.stringValue("DescribeLiveStreamsControlHistoryResponse.ControlInfo["+ i +"].StreamName"));
			liveStreamControlInfo.setClientIP(context.stringValue("DescribeLiveStreamsControlHistoryResponse.ControlInfo["+ i +"].ClientIP"));
			liveStreamControlInfo.setAction(context.stringValue("DescribeLiveStreamsControlHistoryResponse.ControlInfo["+ i +"].Action"));
			liveStreamControlInfo.setTimeStamp(context.stringValue("DescribeLiveStreamsControlHistoryResponse.ControlInfo["+ i +"].TimeStamp"));

			controlInfo.add(liveStreamControlInfo);
		}
		describeLiveStreamsControlHistoryResponse.setControlInfo(controlInfo);
	 
	 	return describeLiveStreamsControlHistoryResponse;
	}
}