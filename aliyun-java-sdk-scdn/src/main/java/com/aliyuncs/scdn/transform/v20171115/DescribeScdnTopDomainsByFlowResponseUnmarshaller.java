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

package com.aliyuncs.scdn.transform.v20171115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.scdn.model.v20171115.DescribeScdnTopDomainsByFlowResponse;
import com.aliyuncs.scdn.model.v20171115.DescribeScdnTopDomainsByFlowResponse.TopDomain;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeScdnTopDomainsByFlowResponseUnmarshaller {

	public static DescribeScdnTopDomainsByFlowResponse unmarshall(DescribeScdnTopDomainsByFlowResponse describeScdnTopDomainsByFlowResponse, UnmarshallerContext _ctx) {
		
		describeScdnTopDomainsByFlowResponse.setRequestId(_ctx.stringValue("DescribeScdnTopDomainsByFlowResponse.RequestId"));
		describeScdnTopDomainsByFlowResponse.setDomainOnlineCount(_ctx.longValue("DescribeScdnTopDomainsByFlowResponse.DomainOnlineCount"));
		describeScdnTopDomainsByFlowResponse.setEndTime(_ctx.stringValue("DescribeScdnTopDomainsByFlowResponse.EndTime"));
		describeScdnTopDomainsByFlowResponse.setStartTime(_ctx.stringValue("DescribeScdnTopDomainsByFlowResponse.StartTime"));
		describeScdnTopDomainsByFlowResponse.setDomainCount(_ctx.longValue("DescribeScdnTopDomainsByFlowResponse.DomainCount"));

		List<TopDomain> topDomains = new ArrayList<TopDomain>();
		for (int i = 0; i < _ctx.lengthValue("DescribeScdnTopDomainsByFlowResponse.TopDomains.Length"); i++) {
			TopDomain topDomain = new TopDomain();
			topDomain.setMaxBps(_ctx.longValue("DescribeScdnTopDomainsByFlowResponse.TopDomains["+ i +"].MaxBps"));
			topDomain.setRank(_ctx.longValue("DescribeScdnTopDomainsByFlowResponse.TopDomains["+ i +"].Rank"));
			topDomain.setTotalAccess(_ctx.longValue("DescribeScdnTopDomainsByFlowResponse.TopDomains["+ i +"].TotalAccess"));
			topDomain.setTrafficPercent(_ctx.stringValue("DescribeScdnTopDomainsByFlowResponse.TopDomains["+ i +"].TrafficPercent"));
			topDomain.setDomainName(_ctx.stringValue("DescribeScdnTopDomainsByFlowResponse.TopDomains["+ i +"].DomainName"));
			topDomain.setTotalTraffic(_ctx.stringValue("DescribeScdnTopDomainsByFlowResponse.TopDomains["+ i +"].TotalTraffic"));
			topDomain.setMaxBpsTime(_ctx.stringValue("DescribeScdnTopDomainsByFlowResponse.TopDomains["+ i +"].MaxBpsTime"));

			topDomains.add(topDomain);
		}
		describeScdnTopDomainsByFlowResponse.setTopDomains(topDomains);
	 
	 	return describeScdnTopDomainsByFlowResponse;
	}
}