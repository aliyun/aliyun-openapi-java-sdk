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

import com.aliyuncs.ens.model.v20171110.DescribeLoadBalancerListenersResponse;
import com.aliyuncs.ens.model.v20171110.DescribeLoadBalancerListenersResponse.Listener;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLoadBalancerListenersResponseUnmarshaller {

	public static DescribeLoadBalancerListenersResponse unmarshall(DescribeLoadBalancerListenersResponse describeLoadBalancerListenersResponse, UnmarshallerContext _ctx) {
		
		describeLoadBalancerListenersResponse.setRequestId(_ctx.stringValue("DescribeLoadBalancerListenersResponse.RequestId"));
		describeLoadBalancerListenersResponse.setPageNumber(_ctx.integerValue("DescribeLoadBalancerListenersResponse.PageNumber"));
		describeLoadBalancerListenersResponse.setPageSize(_ctx.integerValue("DescribeLoadBalancerListenersResponse.PageSize"));
		describeLoadBalancerListenersResponse.setTotalCount(_ctx.integerValue("DescribeLoadBalancerListenersResponse.TotalCount"));

		List<Listener> listeners = new ArrayList<Listener>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLoadBalancerListenersResponse.Listeners.Length"); i++) {
			Listener listener = new Listener();
			listener.setLoadBalancerId(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].LoadBalancerId"));
			listener.setListenerPort(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].ListenerPort"));
			listener.setBizProtocol(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].Protocol"));
			listener.setDescription(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].Description"));
			listener.setStatus(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].Status"));
			listener.setListenerForward(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].ListenerForward"));
			listener.setForwardPort(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].ForwardPort"));
			listener.setCreateTime(_ctx.stringValue("DescribeLoadBalancerListenersResponse.Listeners["+ i +"].CreateTime"));

			listeners.add(listener);
		}
		describeLoadBalancerListenersResponse.setListeners(listeners);
	 
	 	return describeLoadBalancerListenersResponse;
	}
}