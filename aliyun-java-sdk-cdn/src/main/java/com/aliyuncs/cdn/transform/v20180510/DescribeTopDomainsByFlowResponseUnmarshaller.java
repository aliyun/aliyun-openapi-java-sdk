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

package com.aliyuncs.cdn.transform.v20180510;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cdn.model.v20180510.DescribeTopDomainsByFlowResponse;
import com.aliyuncs.cdn.model.v20180510.DescribeTopDomainsByFlowResponse.TopDomain;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTopDomainsByFlowResponseUnmarshaller {

	public static DescribeTopDomainsByFlowResponse unmarshall(DescribeTopDomainsByFlowResponse describeTopDomainsByFlowResponse, UnmarshallerContext context) {
		
		describeTopDomainsByFlowResponse.setRequestId(context.stringValue("DescribeTopDomainsByFlowResponse.RequestId"));
		describeTopDomainsByFlowResponse.setStartTime(context.stringValue("DescribeTopDomainsByFlowResponse.StartTime"));
		describeTopDomainsByFlowResponse.setEndTime(context.stringValue("DescribeTopDomainsByFlowResponse.EndTime"));
		describeTopDomainsByFlowResponse.setDomainCount(context.longValue("DescribeTopDomainsByFlowResponse.DomainCount"));
		describeTopDomainsByFlowResponse.setDomainOnlineCount(context.longValue("DescribeTopDomainsByFlowResponse.DomainOnlineCount"));

		List<TopDomain> topDomains = new ArrayList<TopDomain>();
		for (int i = 0; i < context.lengthValue("DescribeTopDomainsByFlowResponse.TopDomains.Length"); i++) {
			TopDomain topDomain = new TopDomain();
			topDomain.setDomainName(context.stringValue("DescribeTopDomainsByFlowResponse.TopDomains["+ i +"].DomainName"));
			topDomain.setRank(context.longValue("DescribeTopDomainsByFlowResponse.TopDomains["+ i +"].Rank"));
			topDomain.setTotalTraffic(context.stringValue("DescribeTopDomainsByFlowResponse.TopDomains["+ i +"].TotalTraffic"));
			topDomain.setTrafficPercent(context.stringValue("DescribeTopDomainsByFlowResponse.TopDomains["+ i +"].TrafficPercent"));
			topDomain.setMaxBps(context.longValue("DescribeTopDomainsByFlowResponse.TopDomains["+ i +"].MaxBps"));
			topDomain.setMaxBpsTime(context.stringValue("DescribeTopDomainsByFlowResponse.TopDomains["+ i +"].MaxBpsTime"));
			topDomain.setTotalAccess(context.longValue("DescribeTopDomainsByFlowResponse.TopDomains["+ i +"].TotalAccess"));

			topDomains.add(topDomain);
		}
		describeTopDomainsByFlowResponse.setTopDomains(topDomains);
	 
	 	return describeTopDomainsByFlowResponse;
	}
}