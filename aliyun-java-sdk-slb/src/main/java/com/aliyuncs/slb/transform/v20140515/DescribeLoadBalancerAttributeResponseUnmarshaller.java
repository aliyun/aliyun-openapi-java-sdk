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
		describeLoadBalancerAttributeResponse.setVpcId(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.VpcId"));
		describeLoadBalancerAttributeResponse.setCreateTimeStamp(_ctx.longValue("DescribeLoadBalancerAttributeResponse.CreateTimeStamp"));
		describeLoadBalancerAttributeResponse.setReservedInfoBandwidth(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.ReservedInfoBandwidth"));
		describeLoadBalancerAttributeResponse.setCloudInstanceId(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.CloudInstanceId"));
		describeLoadBalancerAttributeResponse.setHasReservedInfo(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.HasReservedInfo"));
		describeLoadBalancerAttributeResponse.setCreateTime(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.CreateTime"));
		describeLoadBalancerAttributeResponse.setLoadBalancerId(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.LoadBalancerId"));
		describeLoadBalancerAttributeResponse.setTunnelType(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.TunnelType"));
		describeLoadBalancerAttributeResponse.setPayType(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.PayType"));
		describeLoadBalancerAttributeResponse.setReservedInfoOrderType(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.ReservedInfoOrderType"));
		describeLoadBalancerAttributeResponse.setAddressType(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.AddressType"));
		describeLoadBalancerAttributeResponse.setSupportPrivateLink(_ctx.booleanValue("DescribeLoadBalancerAttributeResponse.SupportPrivateLink"));
		describeLoadBalancerAttributeResponse.setNetworkType(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.NetworkType"));
		describeLoadBalancerAttributeResponse.setServiceManagedMode(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.ServiceManagedMode"));
		describeLoadBalancerAttributeResponse.setSpecBpsFlag(_ctx.booleanValue("DescribeLoadBalancerAttributeResponse.SpecBpsFlag"));
		describeLoadBalancerAttributeResponse.setAddressIPVersion(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.AddressIPVersion"));
		describeLoadBalancerAttributeResponse.setRenewalCycUnit(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.RenewalCycUnit"));
		describeLoadBalancerAttributeResponse.setBandwidth(_ctx.integerValue("DescribeLoadBalancerAttributeResponse.Bandwidth"));
		describeLoadBalancerAttributeResponse.setLoadBalancerName(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.LoadBalancerName"));
		describeLoadBalancerAttributeResponse.setAddress(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.Address"));
		describeLoadBalancerAttributeResponse.setAssociatedCenStatus(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.AssociatedCenStatus"));
		describeLoadBalancerAttributeResponse.setSlaveZoneId(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.SlaveZoneId"));
		describeLoadBalancerAttributeResponse.setCloudInstanceType(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.CloudInstanceType"));
		describeLoadBalancerAttributeResponse.setEndTimeStamp(_ctx.longValue("DescribeLoadBalancerAttributeResponse.EndTimeStamp"));
		describeLoadBalancerAttributeResponse.setReservedInfoActiveTime(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.ReservedInfoActiveTime"));
		describeLoadBalancerAttributeResponse.setMasterZoneId(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.MasterZoneId"));
		describeLoadBalancerAttributeResponse.setReservedInfoInternetChargeType(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.ReservedInfoInternetChargeType"));
		describeLoadBalancerAttributeResponse.setLoadBalancerSpec(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.LoadBalancerSpec"));
		describeLoadBalancerAttributeResponse.setSpecType(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.SpecType"));
		describeLoadBalancerAttributeResponse.setCloudType(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.CloudType"));
		describeLoadBalancerAttributeResponse.setAutoReleaseTime(_ctx.longValue("DescribeLoadBalancerAttributeResponse.AutoReleaseTime"));
		describeLoadBalancerAttributeResponse.setModificationProtectionReason(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.ModificationProtectionReason"));
		describeLoadBalancerAttributeResponse.setRegionId(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.RegionId"));
		describeLoadBalancerAttributeResponse.setModificationProtectionStatus(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.ModificationProtectionStatus"));
		describeLoadBalancerAttributeResponse.setEndTime(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.EndTime"));
		describeLoadBalancerAttributeResponse.setVSwitchId(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.VSwitchId"));
		describeLoadBalancerAttributeResponse.setLoadBalancerStatus(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.LoadBalancerStatus"));
		describeLoadBalancerAttributeResponse.setResourceGroupId(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.ResourceGroupId"));
		describeLoadBalancerAttributeResponse.setInternetChargeType(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.InternetChargeType"));
		describeLoadBalancerAttributeResponse.setBusinessStatus(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.BusinessStatus"));
		describeLoadBalancerAttributeResponse.setAssociatedCenId(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.AssociatedCenId"));
		describeLoadBalancerAttributeResponse.setDeleteProtection(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.DeleteProtection"));
		describeLoadBalancerAttributeResponse.setRegionIdAlias(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.RegionIdAlias"));
		describeLoadBalancerAttributeResponse.setRenewalStatus(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.RenewalStatus"));
		describeLoadBalancerAttributeResponse.setRenewalDuration(_ctx.integerValue("DescribeLoadBalancerAttributeResponse.RenewalDuration"));
		describeLoadBalancerAttributeResponse.setCloudInstanceUid(_ctx.longValue("DescribeLoadBalancerAttributeResponse.CloudInstanceUid"));
		describeLoadBalancerAttributeResponse.setInstanceChargeType(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.InstanceChargeType"));

		List<String> labels = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLoadBalancerAttributeResponse.Labels.Length"); i++) {
			labels.add(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.Labels["+ i +"]"));
		}
		describeLoadBalancerAttributeResponse.setLabels(labels);

		List<Integer> listenerPorts = new ArrayList<Integer>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLoadBalancerAttributeResponse.ListenerPorts.Length"); i++) {
			listenerPorts.add(_ctx.integerValue("DescribeLoadBalancerAttributeResponse.ListenerPorts["+ i +"]"));
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
			listenerPortAndProtocol.setListenerForward(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.ListenerPortsAndProtocol["+ i +"].ListenerForward"));
			listenerPortAndProtocol.setDescription(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.ListenerPortsAndProtocol["+ i +"].Description"));
			listenerPortAndProtocol.setForwardPort(_ctx.integerValue("DescribeLoadBalancerAttributeResponse.ListenerPortsAndProtocol["+ i +"].ForwardPort"));

			listenerPortsAndProtocol.add(listenerPortAndProtocol);
		}
		describeLoadBalancerAttributeResponse.setListenerPortsAndProtocol(listenerPortsAndProtocol);

		List<BackendServer> backendServers = new ArrayList<BackendServer>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLoadBalancerAttributeResponse.BackendServers.Length"); i++) {
			BackendServer backendServer = new BackendServer();
			backendServer.setType(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.BackendServers["+ i +"].Type"));
			backendServer.setVpcId(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.BackendServers["+ i +"].VpcId"));
			backendServer.setWeight(_ctx.integerValue("DescribeLoadBalancerAttributeResponse.BackendServers["+ i +"].Weight"));
			backendServer.setDescription(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.BackendServers["+ i +"].Description"));
			backendServer.setServerIp(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.BackendServers["+ i +"].ServerIp"));
			backendServer.setServerId(_ctx.stringValue("DescribeLoadBalancerAttributeResponse.BackendServers["+ i +"].ServerId"));

			backendServers.add(backendServer);
		}
		describeLoadBalancerAttributeResponse.setBackendServers(backendServers);
	 
	 	return describeLoadBalancerAttributeResponse;
	}
}