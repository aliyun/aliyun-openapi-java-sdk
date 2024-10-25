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

import com.aliyuncs.ens.model.v20171110.DescribeServerLoadBalancerListenMonitorResponse;
import com.aliyuncs.ens.model.v20171110.DescribeServerLoadBalancerListenMonitorResponse.EslbMonitorList;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeServerLoadBalancerListenMonitorResponseUnmarshaller {

	public static DescribeServerLoadBalancerListenMonitorResponse unmarshall(DescribeServerLoadBalancerListenMonitorResponse describeServerLoadBalancerListenMonitorResponse, UnmarshallerContext _ctx) {
		
		describeServerLoadBalancerListenMonitorResponse.setRequestId(_ctx.stringValue("DescribeServerLoadBalancerListenMonitorResponse.RequestId"));

		List<EslbMonitorList> serverLoadBalancerMonitorData = new ArrayList<EslbMonitorList>();
		for (int i = 0; i < _ctx.lengthValue("DescribeServerLoadBalancerListenMonitorResponse.ServerLoadBalancerMonitorData.Length"); i++) {
			EslbMonitorList eslbMonitorList = new EslbMonitorList();
			eslbMonitorList.setLoadBalancerId(_ctx.stringValue("DescribeServerLoadBalancerListenMonitorResponse.ServerLoadBalancerMonitorData["+ i +"].LoadBalancerId"));
			eslbMonitorList.setLoadBalancerName(_ctx.stringValue("DescribeServerLoadBalancerListenMonitorResponse.ServerLoadBalancerMonitorData["+ i +"].LoadBalancerName"));
			eslbMonitorList.setEnsRegionId(_ctx.stringValue("DescribeServerLoadBalancerListenMonitorResponse.ServerLoadBalancerMonitorData["+ i +"].EnsRegionId"));
			eslbMonitorList.setLoadBalancerSpec(_ctx.stringValue("DescribeServerLoadBalancerListenMonitorResponse.ServerLoadBalancerMonitorData["+ i +"].LoadBalancerSpec"));
			eslbMonitorList.setVip(_ctx.stringValue("DescribeServerLoadBalancerListenMonitorResponse.ServerLoadBalancerMonitorData["+ i +"].Vip"));
			eslbMonitorList.setVni(_ctx.integerValue("DescribeServerLoadBalancerListenMonitorResponse.ServerLoadBalancerMonitorData["+ i +"].Vni"));
			eslbMonitorList.setVport(_ctx.integerValue("DescribeServerLoadBalancerListenMonitorResponse.ServerLoadBalancerMonitorData["+ i +"].Vport"));
			eslbMonitorList.setProto(_ctx.stringValue("DescribeServerLoadBalancerListenMonitorResponse.ServerLoadBalancerMonitorData["+ i +"].Proto"));
			eslbMonitorList.setAcc(_ctx.integerValue("DescribeServerLoadBalancerListenMonitorResponse.ServerLoadBalancerMonitorData["+ i +"].Acc"));
			eslbMonitorList.setReqs2xx(_ctx.integerValue("DescribeServerLoadBalancerListenMonitorResponse.ServerLoadBalancerMonitorData["+ i +"].Reqs2xx"));
			eslbMonitorList.setReqs3xx(_ctx.integerValue("DescribeServerLoadBalancerListenMonitorResponse.ServerLoadBalancerMonitorData["+ i +"].Reqs3xx"));
			eslbMonitorList.setReqs4xx(_ctx.integerValue("DescribeServerLoadBalancerListenMonitorResponse.ServerLoadBalancerMonitorData["+ i +"].Reqs4xx"));
			eslbMonitorList.setReqs5xx(_ctx.integerValue("DescribeServerLoadBalancerListenMonitorResponse.ServerLoadBalancerMonitorData["+ i +"].Reqs5xx"));
			eslbMonitorList.setRtAvg(_ctx.integerValue("DescribeServerLoadBalancerListenMonitorResponse.ServerLoadBalancerMonitorData["+ i +"].RtAvg"));
			eslbMonitorList.setBizTime(_ctx.stringValue("DescribeServerLoadBalancerListenMonitorResponse.ServerLoadBalancerMonitorData["+ i +"].BizTime"));

			serverLoadBalancerMonitorData.add(eslbMonitorList);
		}
		describeServerLoadBalancerListenMonitorResponse.setServerLoadBalancerMonitorData(serverLoadBalancerMonitorData);
	 
	 	return describeServerLoadBalancerListenMonitorResponse;
	}
}