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

package com.aliyuncs.ens.transform.v20171110;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ens.model.v20171110.DescribeServerLoadBalancerMonitorResponse;
import com.aliyuncs.ens.model.v20171110.DescribeServerLoadBalancerMonitorResponse.EslbMonitorList;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeServerLoadBalancerMonitorResponseUnmarshaller {

	public static DescribeServerLoadBalancerMonitorResponse unmarshall(DescribeServerLoadBalancerMonitorResponse describeServerLoadBalancerMonitorResponse, UnmarshallerContext _ctx) {
		
		describeServerLoadBalancerMonitorResponse.setRequestId(_ctx.stringValue("DescribeServerLoadBalancerMonitorResponse.RequestId"));

		List<EslbMonitorList> serverLoadBalancerMonitorData = new ArrayList<EslbMonitorList>();
		for (int i = 0; i < _ctx.lengthValue("DescribeServerLoadBalancerMonitorResponse.ServerLoadBalancerMonitorData.Length"); i++) {
			EslbMonitorList eslbMonitorList = new EslbMonitorList();
			eslbMonitorList.setLoadBalancerId(_ctx.stringValue("DescribeServerLoadBalancerMonitorResponse.ServerLoadBalancerMonitorData["+ i +"].LoadBalancerId"));
			eslbMonitorList.setLoadBalancerName(_ctx.stringValue("DescribeServerLoadBalancerMonitorResponse.ServerLoadBalancerMonitorData["+ i +"].LoadBalancerName"));
			eslbMonitorList.setEnsRegionId(_ctx.stringValue("DescribeServerLoadBalancerMonitorResponse.ServerLoadBalancerMonitorData["+ i +"].EnsRegionId"));
			eslbMonitorList.setLoadBalancerSpec(_ctx.stringValue("DescribeServerLoadBalancerMonitorResponse.ServerLoadBalancerMonitorData["+ i +"].LoadBalancerSpec"));
			eslbMonitorList.setVip(_ctx.stringValue("DescribeServerLoadBalancerMonitorResponse.ServerLoadBalancerMonitorData["+ i +"].Vip"));
			eslbMonitorList.setVni(_ctx.integerValue("DescribeServerLoadBalancerMonitorResponse.ServerLoadBalancerMonitorData["+ i +"].Vni"));
			eslbMonitorList.setAcc(_ctx.integerValue("DescribeServerLoadBalancerMonitorResponse.ServerLoadBalancerMonitorData["+ i +"].Acc"));
			eslbMonitorList.setReqs2xx(_ctx.integerValue("DescribeServerLoadBalancerMonitorResponse.ServerLoadBalancerMonitorData["+ i +"].Reqs2xx"));
			eslbMonitorList.setReqs3xx(_ctx.integerValue("DescribeServerLoadBalancerMonitorResponse.ServerLoadBalancerMonitorData["+ i +"].Reqs3xx"));
			eslbMonitorList.setReqs4xx(_ctx.integerValue("DescribeServerLoadBalancerMonitorResponse.ServerLoadBalancerMonitorData["+ i +"].Reqs4xx"));
			eslbMonitorList.setReqs5xx(_ctx.integerValue("DescribeServerLoadBalancerMonitorResponse.ServerLoadBalancerMonitorData["+ i +"].Reqs5xx"));
			eslbMonitorList.setRtAvg(_ctx.integerValue("DescribeServerLoadBalancerMonitorResponse.ServerLoadBalancerMonitorData["+ i +"].RtAvg"));
			eslbMonitorList.setBizTime(_ctx.stringValue("DescribeServerLoadBalancerMonitorResponse.ServerLoadBalancerMonitorData["+ i +"].BizTime"));

			serverLoadBalancerMonitorData.add(eslbMonitorList);
		}
		describeServerLoadBalancerMonitorResponse.setServerLoadBalancerMonitorData(serverLoadBalancerMonitorData);
	 
	 	return describeServerLoadBalancerMonitorResponse;
	}
}