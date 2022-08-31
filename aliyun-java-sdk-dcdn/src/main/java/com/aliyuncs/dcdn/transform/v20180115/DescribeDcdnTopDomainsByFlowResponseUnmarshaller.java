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

package com.aliyuncs.dcdn.transform.v20180115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnTopDomainsByFlowResponse;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnTopDomainsByFlowResponse.TopDomain;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnTopDomainsByFlowResponseUnmarshaller {

	public static DescribeDcdnTopDomainsByFlowResponse unmarshall(DescribeDcdnTopDomainsByFlowResponse describeDcdnTopDomainsByFlowResponse, UnmarshallerContext _ctx) {
		
		describeDcdnTopDomainsByFlowResponse.setRequestId(_ctx.stringValue("DescribeDcdnTopDomainsByFlowResponse.RequestId"));
		describeDcdnTopDomainsByFlowResponse.setDomainOnlineCount(_ctx.longValue("DescribeDcdnTopDomainsByFlowResponse.DomainOnlineCount"));
		describeDcdnTopDomainsByFlowResponse.setEndTime(_ctx.stringValue("DescribeDcdnTopDomainsByFlowResponse.EndTime"));
		describeDcdnTopDomainsByFlowResponse.setStartTime(_ctx.stringValue("DescribeDcdnTopDomainsByFlowResponse.StartTime"));
		describeDcdnTopDomainsByFlowResponse.setDomainCount(_ctx.longValue("DescribeDcdnTopDomainsByFlowResponse.DomainCount"));

		List<TopDomain> topDomains = new ArrayList<TopDomain>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDcdnTopDomainsByFlowResponse.TopDomains.Length"); i++) {
			TopDomain topDomain = new TopDomain();
			topDomain.setMaxBps(_ctx.longValue("DescribeDcdnTopDomainsByFlowResponse.TopDomains["+ i +"].MaxBps"));
			topDomain.setRank(_ctx.longValue("DescribeDcdnTopDomainsByFlowResponse.TopDomains["+ i +"].Rank"));
			topDomain.setTotalAccess(_ctx.longValue("DescribeDcdnTopDomainsByFlowResponse.TopDomains["+ i +"].TotalAccess"));
			topDomain.setTrafficPercent(_ctx.stringValue("DescribeDcdnTopDomainsByFlowResponse.TopDomains["+ i +"].TrafficPercent"));
			topDomain.setDomainName(_ctx.stringValue("DescribeDcdnTopDomainsByFlowResponse.TopDomains["+ i +"].DomainName"));
			topDomain.setTotalTraffic(_ctx.stringValue("DescribeDcdnTopDomainsByFlowResponse.TopDomains["+ i +"].TotalTraffic"));
			topDomain.setMaxBpsTime(_ctx.stringValue("DescribeDcdnTopDomainsByFlowResponse.TopDomains["+ i +"].MaxBpsTime"));

			topDomains.add(topDomain);
		}
		describeDcdnTopDomainsByFlowResponse.setTopDomains(topDomains);
	 
	 	return describeDcdnTopDomainsByFlowResponse;
	}
}