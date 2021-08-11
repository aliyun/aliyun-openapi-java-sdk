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

import com.aliyuncs.ens.model.v20171110.DescribeLoadBalancerAttributeResponse;
import com.aliyuncs.ens.model.v20171110.DescribeLoadBalancerAttributeResponse.Listener;
import com.aliyuncs.ens.model.v20171110.DescribeLoadBalancerAttributeResponse.Rs;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLoadBalancerAttributeResponseUnmarshaller {

	public static DescribeLoadBalancerAttributeResponse unmarshall(DescribeLoadBalancerAttributeResponse describeLoadBalancerAttributeResponse, UnmarshallerContext _ctx) {
		
		describeLoadBalancerAttributeResponse.setRequestId(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.RequestId"));
		describeLoadBalancerAttributeResponse.setLoadBalancerId(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.LoadBalancerId"));
		describeLoadBalancerAttributeResponse.setLoadBalancerName(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.LoadBalancerName"));
		describeLoadBalancerAttributeResponse.setLoadBalancerStatus(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.LoadBalancerStatus"));
		describeLoadBalancerAttributeResponse.setEnsRegionId(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.EnsRegionId"));
		describeLoadBalancerAttributeResponse.setAddress(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.Address"));
		describeLoadBalancerAttributeResponse.setNetworkId(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.NetworkId"));
		describeLoadBalancerAttributeResponse.setVSwitchId(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.VSwitchId"));
		describeLoadBalancerAttributeResponse.setBandwidth(_ctx.integerValue("DescribeLoadBalancerAttributeResponse.Bandwidth"));
		describeLoadBalancerAttributeResponse.setLoadBalancerSpec(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.LoadBalancerSpec"));
		describeLoadBalancerAttributeResponse.setCreateTime(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.CreateTime"));
		describeLoadBalancerAttributeResponse.setEndTime(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.EndTime"));
		describeLoadBalancerAttributeResponse.setAddressIPVersion(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.AddressIPVersion"));

		List<String> listenerPorts = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLoadBalancerAttributeResponse.ListenerPorts.Length"); i++) {
			listenerPorts.add(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.ListenerPorts["+ i +"]"));
		}
		describeLoadBalancerAttributeResponse.setListenerPorts(listenerPorts);

		List<Rs> backendServers = new ArrayList<Rs>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLoadBalancerAttributeResponse.BackendServers.Length"); i++) {
			Rs rs = new Rs();
			rs.setServerId(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.BackendServers["+ i +"].ServerId"));
			rs.setIp(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.BackendServers["+ i +"].Ip"));
			rs.setPort(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.BackendServers["+ i +"].Port"));
			rs.setType(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.BackendServers["+ i +"].Type"));
			rs.setWeight(_ctx.integerValue("DescribeLoadBalancerAttributeResponse.BackendServers["+ i +"].Weight"));

			backendServers.add(rs);
		}
		describeLoadBalancerAttributeResponse.setBackendServers(backendServers);

		List<Listener> listenerPortsAndProtocols = new ArrayList<Listener>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLoadBalancerAttributeResponse.ListenerPortsAndProtocols.Length"); i++) {
			Listener listener = new Listener();
			listener.setListenerPort(_ctx.integerValue("DescribeLoadBalancerAttributeResponse.ListenerPortsAndProtocols["+ i +"].ListenerPort"));
			listener.setListenerProtocol(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.ListenerPortsAndProtocols["+ i +"].ListenerProtocol"));
			listener.setDescription(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.ListenerPortsAndProtocols["+ i +"].Description"));
			listener.setListenerForward(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.ListenerPortsAndProtocols["+ i +"].ListenerForward"));
			listener.setForwardPort(_ctx.integerValue("DescribeLoadBalancerAttributeResponse.ListenerPortsAndProtocols["+ i +"].ForwardPort"));

			listenerPortsAndProtocols.add(listener);
		}
		describeLoadBalancerAttributeResponse.setListenerPortsAndProtocols(listenerPortsAndProtocols);
	 
	 	return describeLoadBalancerAttributeResponse;
	}
}