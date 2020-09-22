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

package com.aliyuncs.vs.transform.v20181212;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vs.model.v20181212.DescribeVsTopDomainsByFlowResponse;
import com.aliyuncs.vs.model.v20181212.DescribeVsTopDomainsByFlowResponse.TopDomain;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVsTopDomainsByFlowResponseUnmarshaller {

	public static DescribeVsTopDomainsByFlowResponse unmarshall(DescribeVsTopDomainsByFlowResponse describeVsTopDomainsByFlowResponse, UnmarshallerContext _ctx) {
		
		describeVsTopDomainsByFlowResponse.setRequestId(_ctx.stringValue("DescribeVsTopDomainsByFlowResponse.RequestId"));
		describeVsTopDomainsByFlowResponse.setStartTime(_ctx.stringValue("DescribeVsTopDomainsByFlowResponse.StartTime"));
		describeVsTopDomainsByFlowResponse.setEndTime(_ctx.stringValue("DescribeVsTopDomainsByFlowResponse.EndTime"));
		describeVsTopDomainsByFlowResponse.setDomainCount(_ctx.longValue("DescribeVsTopDomainsByFlowResponse.DomainCount"));
		describeVsTopDomainsByFlowResponse.setDomainOnlineCount(_ctx.longValue("DescribeVsTopDomainsByFlowResponse.DomainOnlineCount"));

		List<TopDomain> topDomains = new ArrayList<TopDomain>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVsTopDomainsByFlowResponse.TopDomains.Length"); i++) {
			TopDomain topDomain = new TopDomain();
			topDomain.setDomainName(_ctx.stringValue("DescribeVsTopDomainsByFlowResponse.TopDomains["+ i +"].DomainName"));
			topDomain.setRank(_ctx.longValue("DescribeVsTopDomainsByFlowResponse.TopDomains["+ i +"].Rank"));
			topDomain.setTotalTraffic(_ctx.stringValue("DescribeVsTopDomainsByFlowResponse.TopDomains["+ i +"].TotalTraffic"));
			topDomain.setTrafficPercent(_ctx.stringValue("DescribeVsTopDomainsByFlowResponse.TopDomains["+ i +"].TrafficPercent"));
			topDomain.setMaxBps(_ctx.longValue("DescribeVsTopDomainsByFlowResponse.TopDomains["+ i +"].MaxBps"));
			topDomain.setMaxBpsTime(_ctx.stringValue("DescribeVsTopDomainsByFlowResponse.TopDomains["+ i +"].MaxBpsTime"));
			topDomain.setTotalAccess(_ctx.longValue("DescribeVsTopDomainsByFlowResponse.TopDomains["+ i +"].TotalAccess"));

			topDomains.add(topDomain);
		}
		describeVsTopDomainsByFlowResponse.setTopDomains(topDomains);
	 
	 	return describeVsTopDomainsByFlowResponse;
	}
}