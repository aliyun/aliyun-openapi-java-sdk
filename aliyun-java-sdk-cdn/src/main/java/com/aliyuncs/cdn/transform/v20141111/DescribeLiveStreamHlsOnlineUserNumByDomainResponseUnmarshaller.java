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

package com.aliyuncs.cdn.transform.v20141111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cdn.model.v20141111.DescribeLiveStreamHlsOnlineUserNumByDomainResponse;
import com.aliyuncs.cdn.model.v20141111.DescribeLiveStreamHlsOnlineUserNumByDomainResponse.LiveStreamOnlineUserNumInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveStreamHlsOnlineUserNumByDomainResponseUnmarshaller {

	public static DescribeLiveStreamHlsOnlineUserNumByDomainResponse unmarshall(DescribeLiveStreamHlsOnlineUserNumByDomainResponse describeLiveStreamHlsOnlineUserNumByDomainResponse, UnmarshallerContext context) {
		
		describeLiveStreamHlsOnlineUserNumByDomainResponse.setRequestId(context.stringValue("DescribeLiveStreamHlsOnlineUserNumByDomainResponse.RequestId"));
		describeLiveStreamHlsOnlineUserNumByDomainResponse.setTotalUserNumber(context.longValue("DescribeLiveStreamHlsOnlineUserNumByDomainResponse.TotalUserNumber"));
		describeLiveStreamHlsOnlineUserNumByDomainResponse.setCount(context.longValue("DescribeLiveStreamHlsOnlineUserNumByDomainResponse.Count"));
		describeLiveStreamHlsOnlineUserNumByDomainResponse.setPageNumber(context.longValue("DescribeLiveStreamHlsOnlineUserNumByDomainResponse.pageNumber"));
		describeLiveStreamHlsOnlineUserNumByDomainResponse.setPageSize(context.longValue("DescribeLiveStreamHlsOnlineUserNumByDomainResponse.pageSize"));

		List<LiveStreamOnlineUserNumInfo> onlineUserInfo = new ArrayList<LiveStreamOnlineUserNumInfo>();
		for (int i = 0; i < context.lengthValue("DescribeLiveStreamHlsOnlineUserNumByDomainResponse.OnlineUserInfo.Length"); i++) {
			LiveStreamOnlineUserNumInfo liveStreamOnlineUserNumInfo = new LiveStreamOnlineUserNumInfo();
			liveStreamOnlineUserNumInfo.setStreamUrl(context.stringValue("DescribeLiveStreamHlsOnlineUserNumByDomainResponse.OnlineUserInfo["+ i +"].StreamUrl"));
			liveStreamOnlineUserNumInfo.setUserNumber(context.longValue("DescribeLiveStreamHlsOnlineUserNumByDomainResponse.OnlineUserInfo["+ i +"].UserNumber"));
			liveStreamOnlineUserNumInfo.setTime(context.stringValue("DescribeLiveStreamHlsOnlineUserNumByDomainResponse.OnlineUserInfo["+ i +"].Time"));

			onlineUserInfo.add(liveStreamOnlineUserNumInfo);
		}
		describeLiveStreamHlsOnlineUserNumByDomainResponse.setOnlineUserInfo(onlineUserInfo);
	 
	 	return describeLiveStreamHlsOnlineUserNumByDomainResponse;
	}
}