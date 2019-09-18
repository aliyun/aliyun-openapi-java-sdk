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

import com.aliyuncs.live.model.v20161101.DescribeLiveDomainOnlineUserNumResponse;
import com.aliyuncs.live.model.v20161101.DescribeLiveDomainOnlineUserNumResponse.LiveStreamOnlineUserNumInfo;
import com.aliyuncs.live.model.v20161101.DescribeLiveDomainOnlineUserNumResponse.LiveStreamOnlineUserNumInfo.Info;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveDomainOnlineUserNumResponseUnmarshaller {

	public static DescribeLiveDomainOnlineUserNumResponse unmarshall(DescribeLiveDomainOnlineUserNumResponse describeLiveDomainOnlineUserNumResponse, UnmarshallerContext _ctx) {
		
		describeLiveDomainOnlineUserNumResponse.setRequestId(_ctx.stringValue("DescribeLiveDomainOnlineUserNumResponse.RequestId"));
		describeLiveDomainOnlineUserNumResponse.setStreamCount(_ctx.integerValue("DescribeLiveDomainOnlineUserNumResponse.StreamCount"));
		describeLiveDomainOnlineUserNumResponse.setUserCount(_ctx.integerValue("DescribeLiveDomainOnlineUserNumResponse.UserCount"));

		List<LiveStreamOnlineUserNumInfo> onlineUserInfo = new ArrayList<LiveStreamOnlineUserNumInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLiveDomainOnlineUserNumResponse.OnlineUserInfo.Length"); i++) {
			LiveStreamOnlineUserNumInfo liveStreamOnlineUserNumInfo = new LiveStreamOnlineUserNumInfo();
			liveStreamOnlineUserNumInfo.setStreamName(_ctx.stringValue("DescribeLiveDomainOnlineUserNumResponse.OnlineUserInfo["+ i +"].StreamName"));

			List<Info> infos = new ArrayList<Info>();
			for (int j = 0; j < _ctx.lengthValue("DescribeLiveDomainOnlineUserNumResponse.OnlineUserInfo["+ i +"].Infos.Length"); j++) {
				Info info = new Info();
				info.setTranscodeTemplate(_ctx.stringValue("DescribeLiveDomainOnlineUserNumResponse.OnlineUserInfo["+ i +"].Infos["+ j +"].TranscodeTemplate"));
				info.setUserNumber(_ctx.longValue("DescribeLiveDomainOnlineUserNumResponse.OnlineUserInfo["+ i +"].Infos["+ j +"].UserNumber"));

				infos.add(info);
			}
			liveStreamOnlineUserNumInfo.setInfos(infos);

			onlineUserInfo.add(liveStreamOnlineUserNumInfo);
		}
		describeLiveDomainOnlineUserNumResponse.setOnlineUserInfo(onlineUserInfo);
	 
	 	return describeLiveDomainOnlineUserNumResponse;
	}
}