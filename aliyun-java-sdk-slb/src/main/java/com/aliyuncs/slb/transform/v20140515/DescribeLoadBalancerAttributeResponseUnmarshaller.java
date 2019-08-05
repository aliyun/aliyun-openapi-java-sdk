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

package com.aliyuncs.slb.transform.v20140515;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.slb.model.v20140515.DescribeLoadBalancerAttributeResponse;
import com.aliyuncs.slb.model.v20140515.DescribeLoadBalancerAttributeResponse.BackendServer;
import com.aliyuncs.slb.model.v20140515.DescribeLoadBalancerAttributeResponse.ListenerPortAndProtocal;
import com.aliyuncs.slb.model.v20140515.DescribeLoadBalancerAttributeResponse.ListenerPortAndProtocol;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLoadBalancerAttributeResponseUnmarshaller {

	public static DescribeLoadBalancerAttributeResponse unmarshall(DescribeLoadBalancerAttributeResponse describeLoadBalancerAttributeResponse, UnmarshallerContext _ctx) {
		
		describeLoadBalancerAttributeResponse.setRequestId(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.RequestId"));
		describeLoadBalancerAttributeResponse.setLoadBalancerId(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.LoadBalancerId"));
		describeLoadBalancerAttributeResponse.setResourceGroupId(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.ResourceGroupId"));
		describeLoadBalancerAttributeResponse.setLoadBalancerName(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.LoadBalancerName"));
		describeLoadBalancerAttributeResponse.setLoadBalancerStatus(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.LoadBalancerStatus"));
		describeLoadBalancerAttributeResponse.setRegionId(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.RegionId"));
		describeLoadBalancerAttributeResponse.setRegionIdAlias(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.RegionIdAlias"));
		describeLoadBalancerAttributeResponse.setAddress(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.Address"));
		describeLoadBalancerAttributeResponse.setAddressType(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.AddressType"));
		describeLoadBalancerAttributeResponse.setVpcId(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.VpcId"));
		describeLoadBalancerAttributeResponse.setVSwitchId(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.VSwitchId"));
		describeLoadBalancerAttributeResponse.setNetworkType(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.NetworkType"));
		describeLoadBalancerAttributeResponse.setInternetChargeType(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.InternetChargeType"));
		describeLoadBalancerAttributeResponse.setAutoReleaseTime(_ctx.longValue("DescribeLoadBalancerAttributeResponse.AutoReleaseTime"));
		describeLoadBalancerAttributeResponse.setBandwidth(_ctx.integerValue("DescribeLoadBalancerAttributeResponse.Bandwidth"));
		describeLoadBalancerAttributeResponse.setLoadBalancerSpec(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.LoadBalancerSpec"));
		describeLoadBalancerAttributeResponse.setCreateTime(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.CreateTime"));
		describeLoadBalancerAttributeResponse.setCreateTimeStamp(_ctx.longValue("DescribeLoadBalancerAttributeResponse.CreateTimeStamp"));
		describeLoadBalancerAttributeResponse.setEndTime(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.EndTime"));
		describeLoadBalancerAttributeResponse.setEndTimeStamp(_ctx.longValue("DescribeLoadBalancerAttributeResponse.EndTimeStamp"));
		describeLoadBalancerAttributeResponse.setPayType(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.PayType"));
		describeLoadBalancerAttributeResponse.setMasterZoneId(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.MasterZoneId"));
		describeLoadBalancerAttributeResponse.setSlaveZoneId(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.SlaveZoneId"));
		describeLoadBalancerAttributeResponse.setAddressIPVersion(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.AddressIPVersion"));
		describeLoadBalancerAttributeResponse.setCloudType(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.CloudType"));
		describeLoadBalancerAttributeResponse.setRenewalDuration(_ctx.integerValue("DescribeLoadBalancerAttributeResponse.RenewalDuration"));
		describeLoadBalancerAttributeResponse.setRenewalStatus(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.RenewalStatus"));
		describeLoadBalancerAttributeResponse.setRenewalCycUnit(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.RenewalCycUnit"));
		describeLoadBalancerAttributeResponse.setHasReservedInfo(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.HasReservedInfo"));
		describeLoadBalancerAttributeResponse.setReservedInfoOrderType(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.ReservedInfoOrderType"));
		describeLoadBalancerAttributeResponse.setReservedInfoInternetChargeType(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.ReservedInfoInternetChargeType"));
		describeLoadBalancerAttributeResponse.setReservedInfoBandwidth(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.ReservedInfoBandwidth"));
		describeLoadBalancerAttributeResponse.setReservedInfoActiveTime(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.ReservedInfoActiveTime"));
		describeLoadBalancerAttributeResponse.setDeleteProtection(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.DeleteProtection"));

		List<String> listenerPorts = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLoadBalancerAttributeResponse.ListenerPorts.Length"); i++) {
			listenerPorts.add(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.ListenerPorts["+ i +"]"));
		}
		describeLoadBalancerAttributeResponse.setListenerPorts(listenerPorts);

		List<ListenerPortAndProtocal> listenerPortsAndProtocal = new ArrayList<ListenerPortAndProtocal>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLoadBalancerAttributeResponse.ListenerPortsAndProtocal.Length"); i++) {
			ListenerPortAndProtocal listenerPortAndProtocal = new ListenerPortAndProtocal();
			listenerPortAndProtocal.setListenerPort(_ctx.integerValue("DescribeLoadBalancerAttributeResponse.ListenerPortsAndProtocal["+ i +"].ListenerPort"));
			listenerPortAndProtocal.setListenerProtocal(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.ListenerPortsAndProtocal["+ i +"].ListenerProtocal"));

			listenerPortsAndProtocal.add(listenerPortAndProtocal);
		}
		describeLoadBalancerAttributeResponse.setListenerPortsAndProtocal(listenerPortsAndProtocal);

		List<ListenerPortAndProtocol> listenerPortsAndProtocol = new ArrayList<ListenerPortAndProtocol>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLoadBalancerAttributeResponse.ListenerPortsAndProtocol.Length"); i++) {
			ListenerPortAndProtocol listenerPortAndProtocol = new ListenerPortAndProtocol();
			listenerPortAndProtocol.setListenerPort(_ctx.integerValue("DescribeLoadBalancerAttributeResponse.ListenerPortsAndProtocol["+ i +"].ListenerPort"));
			listenerPortAndProtocol.setListenerProtocol(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.ListenerPortsAndProtocol["+ i +"].ListenerProtocol"));
			listenerPortAndProtocol.setListenerForward(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.ListenerPortsAndProtocol["+ i +"].ListenerForward"));
			listenerPortAndProtocol.setForwardPort(_ctx.integerValue("DescribeLoadBalancerAttributeResponse.ListenerPortsAndProtocol["+ i +"].ForwardPort"));
			listenerPortAndProtocol.setDescription(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.ListenerPortsAndProtocol["+ i +"].Description"));

			listenerPortsAndProtocol.add(listenerPortAndProtocol);
		}
		describeLoadBalancerAttributeResponse.setListenerPortsAndProtocol(listenerPortsAndProtocol);

		List<BackendServer> backendServers = new ArrayList<BackendServer>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLoadBalancerAttributeResponse.BackendServers.Length"); i++) {
			BackendServer backendServer = new BackendServer();
			backendServer.setServerId(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.BackendServers["+ i +"].ServerId"));
			backendServer.setWeight(_ctx.integerValue("DescribeLoadBalancerAttributeResponse.BackendServers["+ i +"].Weight"));
			backendServer.setType(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.BackendServers["+ i +"].Type"));
			backendServer.setServerIp(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.BackendServers["+ i +"].ServerIp"));
			backendServer.setVpcId(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.BackendServers["+ i +"].VpcId"));
			backendServer.setDescription(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.BackendServers["+ i +"].Description"));

			backendServers.add(backendServer);
		}
		describeLoadBalancerAttributeResponse.setBackendServers(backendServers);
	 
	 	return describeLoadBalancerAttributeResponse;
	}
}