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

import com.aliyuncs.live.model.v20161101.DescribeLiveTopDomainsByFlowResponse;
import com.aliyuncs.live.model.v20161101.DescribeLiveTopDomainsByFlowResponse.TopDomain;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveTopDomainsByFlowResponseUnmarshaller {

	public static DescribeLiveTopDomainsByFlowResponse unmarshall(DescribeLiveTopDomainsByFlowResponse describeLiveTopDomainsByFlowResponse, UnmarshallerContext _ctx) {
		
		describeLiveTopDomainsByFlowResponse.setRequestId(_ctx.stringValue("DescribeLiveTopDomainsByFlowResponse.RequestId"));
		describeLiveTopDomainsByFlowResponse.setStartTime(_ctx.stringValue("DescribeLiveTopDomainsByFlowResponse.StartTime"));
		describeLiveTopDomainsByFlowResponse.setEndTime(_ctx.stringValue("DescribeLiveTopDomainsByFlowResponse.EndTime"));
		describeLiveTopDomainsByFlowResponse.setDomainCount(_ctx.longValue("DescribeLiveTopDomainsByFlowResponse.DomainCount"));
		describeLiveTopDomainsByFlowResponse.setDomainOnlineCount(_ctx.longValue("DescribeLiveTopDomainsByFlowResponse.DomainOnlineCount"));

		List<TopDomain> topDomains = new ArrayList<TopDomain>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLiveTopDomainsByFlowResponse.TopDomains.Length"); i++) {
			TopDomain topDomain = new TopDomain();
			topDomain.setDomainName(_ctx.stringValue("DescribeLiveTopDomainsByFlowResponse.TopDomains["+ i +"].DomainName"));
			topDomain.setRank(_ctx.longValue("DescribeLiveTopDomainsByFlowResponse.TopDomains["+ i +"].Rank"));
			topDomain.setTotalTraffic(_ctx.stringValue("DescribeLiveTopDomainsByFlowResponse.TopDomains["+ i +"].TotalTraffic"));
			topDomain.setTrafficPercent(_ctx.stringValue("DescribeLiveTopDomainsByFlowResponse.TopDomains["+ i +"].TrafficPercent"));
			topDomain.setMaxBps(_ctx.longValue("DescribeLiveTopDomainsByFlowResponse.TopDomains["+ i +"].MaxBps"));
			topDomain.setMaxBpsTime(_ctx.stringValue("DescribeLiveTopDomainsByFlowResponse.TopDomains["+ i +"].MaxBpsTime"));
			topDomain.setTotalAccess(_ctx.longValue("DescribeLiveTopDomainsByFlowResponse.TopDomains["+ i +"].TotalAccess"));

			topDomains.add(topDomain);
		}
		describeLiveTopDomainsByFlowResponse.setTopDomains(topDomains);
	 
	 	return describeLiveTopDomainsByFlowResponse;
	}
}