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
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeScdnTopDomainsByFlowResponseUnmarshaller {

	public static DescribeScdnTopDomainsByFlowResponse unmarshall(DescribeScdnTopDomainsByFlowResponse describeScdnTopDomainsByFlowResponse, UnmarshallerContext context) {
		
		describeScdnTopDomainsByFlowResponse.setRequestId(context.stringValue("DescribeScdnTopDomainsByFlowResponse.RequestId"));
		describeScdnTopDomainsByFlowResponse.setStartTime(context.stringValue("DescribeScdnTopDomainsByFlowResponse.StartTime"));
		describeScdnTopDomainsByFlowResponse.setEndTime(context.stringValue("DescribeScdnTopDomainsByFlowResponse.EndTime"));
		describeScdnTopDomainsByFlowResponse.setDomainCount(context.longValue("DescribeScdnTopDomainsByFlowResponse.DomainCount"));
		describeScdnTopDomainsByFlowResponse.setDomainOnlineCount(context.longValue("DescribeScdnTopDomainsByFlowResponse.DomainOnlineCount"));

		List<TopDomain> topDomains = new ArrayList<TopDomain>();
		for (int i = 0; i < context.lengthValue("DescribeScdnTopDomainsByFlowResponse.TopDomains.Length"); i++) {
			TopDomain topDomain = new TopDomain();
			topDomain.setDomainName(context.stringValue("DescribeScdnTopDomainsByFlowResponse.TopDomains["+ i +"].DomainName"));
			topDomain.setRank(context.longValue("DescribeScdnTopDomainsByFlowResponse.TopDomains["+ i +"].Rank"));
			topDomain.setTotalTraffic(context.stringValue("DescribeScdnTopDomainsByFlowResponse.TopDomains["+ i +"].TotalTraffic"));
			topDomain.setTrafficPercent(context.stringValue("DescribeScdnTopDomainsByFlowResponse.TopDomains["+ i +"].TrafficPercent"));
			topDomain.setMaxBps(context.longValue("DescribeScdnTopDomainsByFlowResponse.TopDomains["+ i +"].MaxBps"));
			topDomain.setMaxBpsTime(context.stringValue("DescribeScdnTopDomainsByFlowResponse.TopDomains["+ i +"].MaxBpsTime"));
			topDomain.setTotalAccess(context.longValue("DescribeScdnTopDomainsByFlowResponse.TopDomains["+ i +"].TotalAccess"));

			topDomains.add(topDomain);
		}
		describeScdnTopDomainsByFlowResponse.setTopDomains(topDomains);
	 
	 	return describeScdnTopDomainsByFlowResponse;
	}
}