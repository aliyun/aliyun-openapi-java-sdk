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

import com.aliyuncs.cdn.model.v20141111.DescribeLiveStreamOnlineUserNumByDomainResponse;
import com.aliyuncs.cdn.model.v20141111.DescribeLiveStreamOnlineUserNumByDomainResponse.LiveStreamOnlineUserNumInfo;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveStreamOnlineUserNumByDomainResponseUnmarshaller {

	public static DescribeLiveStreamOnlineUserNumByDomainResponse unmarshall(DescribeLiveStreamOnlineUserNumByDomainResponse describeLiveStreamOnlineUserNumByDomainResponse, UnmarshallerContext context) {
		
		describeLiveStreamOnlineUserNumByDomainResponse.setRequestId(context.stringValue("DescribeLiveStreamOnlineUserNumByDomainResponse.RequestId"));
		describeLiveStreamOnlineUserNumByDomainResponse.setTotalUserNumber(context.longValue("DescribeLiveStreamOnlineUserNumByDomainResponse.TotalUserNumber"));
		describeLiveStreamOnlineUserNumByDomainResponse.setCount(context.longValue("DescribeLiveStreamOnlineUserNumByDomainResponse.Count"));
		describeLiveStreamOnlineUserNumByDomainResponse.setPageNumber(context.longValue("DescribeLiveStreamOnlineUserNumByDomainResponse.pageNumber"));
		describeLiveStreamOnlineUserNumByDomainResponse.setPageSize(context.longValue("DescribeLiveStreamOnlineUserNumByDomainResponse.pageSize"));

		List<LiveStreamOnlineUserNumInfo> onlineUserInfo = new ArrayList<LiveStreamOnlineUserNumInfo>();
		for (int i = 0; i < context.lengthValue("DescribeLiveStreamOnlineUserNumByDomainResponse.OnlineUserInfo.Length"); i++) {
			LiveStreamOnlineUserNumInfo liveStreamOnlineUserNumInfo = new LiveStreamOnlineUserNumInfo();
			liveStreamOnlineUserNumInfo.setStreamUrl(context.stringValue("DescribeLiveStreamOnlineUserNumByDomainResponse.OnlineUserInfo["+ i +"].StreamUrl"));
			liveStreamOnlineUserNumInfo.setUserNumber(context.longValue("DescribeLiveStreamOnlineUserNumByDomainResponse.OnlineUserInfo["+ i +"].UserNumber"));
			liveStreamOnlineUserNumInfo.setTime(context.stringValue("DescribeLiveStreamOnlineUserNumByDomainResponse.OnlineUserInfo["+ i +"].Time"));

			onlineUserInfo.add(liveStreamOnlineUserNumInfo);
		}
		describeLiveStreamOnlineUserNumByDomainResponse.setOnlineUserInfo(onlineUserInfo);
	 
	 	return describeLiveStreamOnlineUserNumByDomainResponse;
	}
}