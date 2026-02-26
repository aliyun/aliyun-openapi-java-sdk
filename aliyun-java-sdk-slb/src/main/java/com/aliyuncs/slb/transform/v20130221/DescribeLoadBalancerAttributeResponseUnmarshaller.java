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

package com.aliyuncs.slb.transform.v20130221;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.slb.model.v20130221.DescribeLoadBalancerAttributeResponse;
import com.aliyuncs.slb.model.v20130221.DescribeLoadBalancerAttributeResponse.BackendServer;
import com.aliyuncs.slb.model.v20130221.DescribeLoadBalancerAttributeResponse.ListenerPortAndProtocal;
import com.aliyuncs.slb.model.v20130221.DescribeLoadBalancerAttributeResponse.ListenerPortAndProtocol;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLoadBalancerAttributeResponseUnmarshaller {

	public static DescribeLoadBalancerAttributeResponse unmarshall(DescribeLoadBalancerAttributeResponse describeLoadBalancerAttributeResponse, UnmarshallerContext _ctx) {
		
		describeLoadBalancerAttributeResponse.setRequestId(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.RequestId"));
		describeLoadBalancerAttributeResponse.setVpcId(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.VpcId"));
		describeLoadBalancerAttributeResponse.setCreateTimeStamp(_ctx.longValue("DescribeLoadBalancerAttributeResponse.CreateTimeStamp"));
		describeLoadBalancerAttributeResponse.setLoadBalancerSpec(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.LoadBalancerSpec"));
		describeLoadBalancerAttributeResponse.setAutoReleaseTime(_ctx.longValue("DescribeLoadBalancerAttributeResponse.AutoReleaseTime"));
		describeLoadBalancerAttributeResponse.setIsPublicAddress(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.IsPublicAddress"));
		describeLoadBalancerAttributeResponse.setCreateTime(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.CreateTime"));
		describeLoadBalancerAttributeResponse.setLoadBalancerId(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.LoadBalancerId"));
		describeLoadBalancerAttributeResponse.setPayType(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.PayType"));
		describeLoadBalancerAttributeResponse.setAddressType(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.AddressType"));
		describeLoadBalancerAttributeResponse.setNetworkType(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.NetworkType"));
		describeLoadBalancerAttributeResponse.setRegionId(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.RegionId"));
		describeLoadBalancerAttributeResponse.setEndTime(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.EndTime"));
		describeLoadBalancerAttributeResponse.setVSwitchId(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.VSwitchId"));
		describeLoadBalancerAttributeResponse.setBandwidth(_ctx.integerValue("DescribeLoadBalancerAttributeResponse.Bandwidth"));
		describeLoadBalancerAttributeResponse.setLoadBalancerStatus(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.LoadBalancerStatus"));
		describeLoadBalancerAttributeResponse.setLoadBalancerName(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.LoadBalancerName"));
		describeLoadBalancerAttributeResponse.setInternetChargeType(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.InternetChargeType"));
		describeLoadBalancerAttributeResponse.setAddress(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.Address"));
		describeLoadBalancerAttributeResponse.setSlaveZoneId(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.SlaveZoneId"));
		describeLoadBalancerAttributeResponse.setEndTimeStamp(_ctx.longValue("DescribeLoadBalancerAttributeResponse.EndTimeStamp"));
		describeLoadBalancerAttributeResponse.setRegionIdAlias(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.RegionIdAlias"));
		describeLoadBalancerAttributeResponse.setMasterZoneId(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.MasterZoneId"));

		List<String> listenerPorts = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLoadBalancerAttributeResponse.ListenerPorts.Length"); i++) {
			listenerPorts.add(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.ListenerPorts["+ i +"]"));
		}
		describeLoadBalancerAttributeResponse.setListenerPorts(listenerPorts);

		List<ListenerPortAndProtocal> listenerPortsAndProtocal = new ArrayList<ListenerPortAndProtocal>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLoadBalancerAttributeResponse.ListenerPortsAndProtocal.Length"); i++) {
			ListenerPortAndProtocal listenerPortAndProtocal = new ListenerPortAndProtocal();
			listenerPortAndProtocal.setListenerProtocal(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.ListenerPortsAndProtocal["+ i +"].ListenerProtocal"));
			listenerPortAndProtocal.setListenerPort(_ctx.integerValue("DescribeLoadBalancerAttributeResponse.ListenerPortsAndProtocal["+ i +"].ListenerPort"));

			listenerPortsAndProtocal.add(listenerPortAndProtocal);
		}
		describeLoadBalancerAttributeResponse.setListenerPortsAndProtocal(listenerPortsAndProtocal);

		List<ListenerPortAndProtocol> listenerPortsAndProtocol = new ArrayList<ListenerPortAndProtocol>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLoadBalancerAttributeResponse.ListenerPortsAndProtocol.Length"); i++) {
			ListenerPortAndProtocol listenerPortAndProtocol = new ListenerPortAndProtocol();
			listenerPortAndProtocol.setListenerPort(_ctx.integerValue("DescribeLoadBalancerAttributeResponse.ListenerPortsAndProtocol["+ i +"].ListenerPort"));
			listenerPortAndProtocol.setListenerProtocol(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.ListenerPortsAndProtocol["+ i +"].ListenerProtocol"));

			listenerPortsAndProtocol.add(listenerPortAndProtocol);
		}
		describeLoadBalancerAttributeResponse.setListenerPortsAndProtocol(listenerPortsAndProtocol);

		List<BackendServer> backendServers = new ArrayList<BackendServer>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLoadBalancerAttributeResponse.BackendServers.Length"); i++) {
			BackendServer backendServer = new BackendServer();
			backendServer.setWeight(_ctx.integerValue("DescribeLoadBalancerAttributeResponse.BackendServers["+ i +"].Weight"));
			backendServer.setServerId(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.BackendServers["+ i +"].ServerId"));

			backendServers.add(backendServer);
		}
		describeLoadBalancerAttributeResponse.setBackendServers(backendServers);
	 
	 	return describeLoadBalancerAttributeResponse;
	}
}