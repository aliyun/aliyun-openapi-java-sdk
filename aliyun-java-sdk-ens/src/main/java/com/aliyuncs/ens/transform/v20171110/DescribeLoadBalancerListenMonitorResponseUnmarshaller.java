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

import com.aliyuncs.ens.model.v20171110.DescribeLoadBalancerListenMonitorResponse;
import com.aliyuncs.ens.model.v20171110.DescribeLoadBalancerListenMonitorResponse.ElbListenMonitorList;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLoadBalancerListenMonitorResponseUnmarshaller {

	public static DescribeLoadBalancerListenMonitorResponse unmarshall(DescribeLoadBalancerListenMonitorResponse describeLoadBalancerListenMonitorResponse, UnmarshallerContext _ctx) {
		
		describeLoadBalancerListenMonitorResponse.setRequestId(_ctx.stringValue("DescribeLoadBalancerListenMonitorResponse.RequestId"));

		List<ElbListenMonitorList> loadBalancerMonitorListenData = new ArrayList<ElbListenMonitorList>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLoadBalancerListenMonitorResponse.LoadBalancerMonitorListenData.Length"); i++) {
			ElbListenMonitorList elbListenMonitorList = new ElbListenMonitorList();
			elbListenMonitorList.setLoadBalancerId(_ctx.stringValue("DescribeLoadBalancerListenMonitorResponse.LoadBalancerMonitorListenData["+ i +"].LoadBalancerId"));
			elbListenMonitorList.setEnsRegionId(_ctx.stringValue("DescribeLoadBalancerListenMonitorResponse.LoadBalancerMonitorListenData["+ i +"].EnsRegionId"));
			elbListenMonitorList.setVip(_ctx.stringValue("DescribeLoadBalancerListenMonitorResponse.LoadBalancerMonitorListenData["+ i +"].Vip"));
			elbListenMonitorList.setVni(_ctx.stringValue("DescribeLoadBalancerListenMonitorResponse.LoadBalancerMonitorListenData["+ i +"].Vni"));
			elbListenMonitorList.setVPort(_ctx.stringValue("DescribeLoadBalancerListenMonitorResponse.LoadBalancerMonitorListenData["+ i +"].VPort"));
			elbListenMonitorList.setProto(_ctx.stringValue("DescribeLoadBalancerListenMonitorResponse.LoadBalancerMonitorListenData["+ i +"].Proto"));
			elbListenMonitorList.setConns(_ctx.stringValue("DescribeLoadBalancerListenMonitorResponse.LoadBalancerMonitorListenData["+ i +"].Conns"));
			elbListenMonitorList.setActConns(_ctx.stringValue("DescribeLoadBalancerListenMonitorResponse.LoadBalancerMonitorListenData["+ i +"].ActConns"));
			elbListenMonitorList.setInActConns(_ctx.stringValue("DescribeLoadBalancerListenMonitorResponse.LoadBalancerMonitorListenData["+ i +"].InActConns"));
			elbListenMonitorList.setDropConns(_ctx.stringValue("DescribeLoadBalancerListenMonitorResponse.LoadBalancerMonitorListenData["+ i +"].DropConns"));
			elbListenMonitorList.setInPkts(_ctx.stringValue("DescribeLoadBalancerListenMonitorResponse.LoadBalancerMonitorListenData["+ i +"].InPkts"));
			elbListenMonitorList.setOutPkts(_ctx.stringValue("DescribeLoadBalancerListenMonitorResponse.LoadBalancerMonitorListenData["+ i +"].OutPkts"));
			elbListenMonitorList.setInDropPkts(_ctx.stringValue("DescribeLoadBalancerListenMonitorResponse.LoadBalancerMonitorListenData["+ i +"].InDropPkts"));
			elbListenMonitorList.setOutDropPkts(_ctx.stringValue("DescribeLoadBalancerListenMonitorResponse.LoadBalancerMonitorListenData["+ i +"].OutDropPkts"));
			elbListenMonitorList.setInBytes(_ctx.stringValue("DescribeLoadBalancerListenMonitorResponse.LoadBalancerMonitorListenData["+ i +"].InBytes"));
			elbListenMonitorList.setOutBytes(_ctx.stringValue("DescribeLoadBalancerListenMonitorResponse.LoadBalancerMonitorListenData["+ i +"].OutBytes"));
			elbListenMonitorList.setInDropBytes(_ctx.stringValue("DescribeLoadBalancerListenMonitorResponse.LoadBalancerMonitorListenData["+ i +"].InDropBytes"));
			elbListenMonitorList.setOutDropBytes(_ctx.stringValue("DescribeLoadBalancerListenMonitorResponse.LoadBalancerMonitorListenData["+ i +"].OutDropBytes"));
			elbListenMonitorList.setValidRsNum(_ctx.stringValue("DescribeLoadBalancerListenMonitorResponse.LoadBalancerMonitorListenData["+ i +"].ValidRsNum"));
			elbListenMonitorList.setInValidRsNum(_ctx.stringValue("DescribeLoadBalancerListenMonitorResponse.LoadBalancerMonitorListenData["+ i +"].InValidRsNum"));
			elbListenMonitorList.setBizTime(_ctx.stringValue("DescribeLoadBalancerListenMonitorResponse.LoadBalancerMonitorListenData["+ i +"].BizTime"));

			loadBalancerMonitorListenData.add(elbListenMonitorList);
		}
		describeLoadBalancerListenMonitorResponse.setLoadBalancerMonitorListenData(loadBalancerMonitorListenData);
	 
	 	return describeLoadBalancerListenMonitorResponse;
	}
}