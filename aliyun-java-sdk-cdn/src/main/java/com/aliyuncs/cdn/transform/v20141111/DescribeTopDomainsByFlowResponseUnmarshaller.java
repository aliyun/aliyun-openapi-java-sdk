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

import com.aliyuncs.cdn.model.v20141111.DescribeTopDomainsByFlowResponse;
import com.aliyuncs.cdn.model.v20141111.DescribeTopDomainsByFlowResponse.TopDomain;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTopDomainsByFlowResponseUnmarshaller {

	public static DescribeTopDomainsByFlowResponse unmarshall(DescribeTopDomainsByFlowResponse describeTopDomainsByFlowResponse, UnmarshallerContext _ctx) {
		
		describeTopDomainsByFlowResponse.setRequestId(_ctx.stringValue("DescribeTopDomainsByFlowResponse.RequestId"));
		describeTopDomainsByFlowResponse.setStartTime(_ctx.stringValue("DescribeTopDomainsByFlowResponse.StartTime"));
		describeTopDomainsByFlowResponse.setEndTime(_ctx.stringValue("DescribeTopDomainsByFlowResponse.EndTime"));
		describeTopDomainsByFlowResponse.setDomainCount(_ctx.longValue("DescribeTopDomainsByFlowResponse.DomainCount"));
		describeTopDomainsByFlowResponse.setDomainOnlineCount(_ctx.longValue("DescribeTopDomainsByFlowResponse.DomainOnlineCount"));

		List<TopDomain> topDomains = new ArrayList<TopDomain>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTopDomainsByFlowResponse.TopDomains.Length"); i++) {
			TopDomain topDomain = new TopDomain();
			topDomain.setDomainName(_ctx.stringValue("DescribeTopDomainsByFlowResponse.TopDomains["+ i +"].DomainName"));
			topDomain.setRank(_ctx.longValue("DescribeTopDomainsByFlowResponse.TopDomains["+ i +"].Rank"));
			topDomain.setTotalTraffic(_ctx.stringValue("DescribeTopDomainsByFlowResponse.TopDomains["+ i +"].TotalTraffic"));
			topDomain.setTrafficPercent(_ctx.stringValue("DescribeTopDomainsByFlowResponse.TopDomains["+ i +"].TrafficPercent"));
			topDomain.setMaxBps(_ctx.floatValue("DescribeTopDomainsByFlowResponse.TopDomains["+ i +"].MaxBps"));
			topDomain.setMaxBpsTime(_ctx.stringValue("DescribeTopDomainsByFlowResponse.TopDomains["+ i +"].MaxBpsTime"));
			topDomain.setTotalAccess(_ctx.longValue("DescribeTopDomainsByFlowResponse.TopDomains["+ i +"].TotalAccess"));

			topDomains.add(topDomain);
		}
		describeTopDomainsByFlowResponse.setTopDomains(topDomains);
	 
	 	return describeTopDomainsByFlowResponse;
	}
}