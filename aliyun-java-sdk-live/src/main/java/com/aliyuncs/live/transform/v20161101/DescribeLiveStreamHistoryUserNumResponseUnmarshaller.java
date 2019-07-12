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

import com.aliyuncs.live.model.v20161101.DescribeLiveStreamHistoryUserNumResponse;
import com.aliyuncs.live.model.v20161101.DescribeLiveStreamHistoryUserNumResponse.LiveStreamUserNumInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveStreamHistoryUserNumResponseUnmarshaller {

	public static DescribeLiveStreamHistoryUserNumResponse unmarshall(DescribeLiveStreamHistoryUserNumResponse describeLiveStreamHistoryUserNumResponse, UnmarshallerContext _ctx) {
		
		describeLiveStreamHistoryUserNumResponse.setRequestId(_ctx.stringValue("DescribeLiveStreamHistoryUserNumResponse.RequestId"));

		List<LiveStreamUserNumInfo> liveStreamUserNumInfos = new ArrayList<LiveStreamUserNumInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLiveStreamHistoryUserNumResponse.LiveStreamUserNumInfos.Length"); i++) {
			LiveStreamUserNumInfo liveStreamUserNumInfo = new LiveStreamUserNumInfo();
			liveStreamUserNumInfo.setStreamTime(_ctx.stringValue("DescribeLiveStreamHistoryUserNumResponse.LiveStreamUserNumInfos["+ i +"].StreamTime"));
			liveStreamUserNumInfo.setUserNum(_ctx.stringValue("DescribeLiveStreamHistoryUserNumResponse.LiveStreamUserNumInfos["+ i +"].UserNum"));

			liveStreamUserNumInfos.add(liveStreamUserNumInfo);
		}
		describeLiveStreamHistoryUserNumResponse.setLiveStreamUserNumInfos(liveStreamUserNumInfos);
	 
	 	return describeLiveStreamHistoryUserNumResponse;
	}
}