/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
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

	public static DescribeLoadBalancerAttributeResponse unmarshall(DescribeLoadBalancerAttributeResponse describeLoadBalancerAttributeResponse, UnmarshallerContext context) {
		
		describeLoadBalancerAttributeResponse.setRequestId(context.stringValue("DescribeLoadBalancerAttributeResponse.RequestId"));
		describeLoadBalancerAttributeResponse.setLoadBalancerId(context.stringValue("DescribeLoadBalancerAttributeResponse.LoadBalancerId"));
		describeLoadBalancerAttributeResponse.setLoadBalancerName(context.stringValue("DescribeLoadBalancerAttributeResponse.LoadBalancerName"));
		describeLoadBalancerAttributeResponse.setLoadBalancerStatus(context.stringValue("DescribeLoadBalancerAttributeResponse.LoadBalancerStatus"));
		describeLoadBalancerAttributeResponse.setRegionId(context.stringValue("DescribeLoadBalancerAttributeResponse.RegionId"));
		describeLoadBalancerAttributeResponse.setRegionIdAlias(context.stringValue("DescribeLoadBalancerAttributeResponse.RegionIdAlias"));
		describeLoadBalancerAttributeResponse.setAddress(context.stringValue("DescribeLoadBalancerAttributeResponse.Address"));
		describeLoadBalancerAttributeResponse.setAddressType(context.stringValue("DescribeLoadBalancerAttributeResponse.AddressType"));
		describeLoadBalancerAttributeResponse.setVpcId(context.stringValue("DescribeLoadBalancerAttributeResponse.VpcId"));
		describeLoadBalancerAttributeResponse.setVSwitchId(context.stringValue("DescribeLoadBalancerAttributeResponse.VSwitchId"));
		describeLoadBalancerAttributeResponse.setNetworkType(context.stringValue("DescribeLoadBalancerAttributeResponse.NetworkType"));
		describeLoadBalancerAttributeResponse.setInternetChargeType(context.stringValue("DescribeLoadBalancerAttributeResponse.InternetChargeType"));
		describeLoadBalancerAttributeResponse.setBandwidth(context.integerValue("DescribeLoadBalancerAttributeResponse.Bandwidth"));
		describeLoadBalancerAttributeResponse.setCreateTime(context.stringValue("DescribeLoadBalancerAttributeResponse.CreateTime"));
		describeLoadBalancerAttributeResponse.setCreateTimeStamp(context.longValue("DescribeLoadBalancerAttributeResponse.CreateTimeStamp"));
		describeLoadBalancerAttributeResponse.setMasterZoneId(context.stringValue("DescribeLoadBalancerAttributeResponse.MasterZoneId"));
		describeLoadBalancerAttributeResponse.setSlaveZoneId(context.stringValue("DescribeLoadBalancerAttributeResponse.SlaveZoneId"));

		List<String> listenerPorts = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeLoadBalancerAttributeResponse.ListenerPorts.Length"); i++) {
			listenerPorts.add(context.stringValue("DescribeLoadBalancerAttributeResponse.ListenerPorts["+ i +"]"));
		}
		describeLoadBalancerAttributeResponse.setListenerPorts(listenerPorts);

		List<ListenerPortAndProtocal> listenerPortsAndProtocal = new ArrayList<ListenerPortAndProtocal>();
		for (int i = 0; i < context.lengthValue("DescribeLoadBalancerAttributeResponse.ListenerPortsAndProtocal.Length"); i++) {
			ListenerPortAndProtocal listenerPortAndProtocal = new ListenerPortAndProtocal();
			listenerPortAndProtocal.setListenerPort(context.integerValue("DescribeLoadBalancerAttributeResponse.ListenerPortsAndProtocal["+ i +"].ListenerPort"));
			listenerPortAndProtocal.setListenerProtocal(context.stringValue("DescribeLoadBalancerAttributeResponse.ListenerPortsAndProtocal["+ i +"].ListenerProtocal"));

			listenerPortsAndProtocal.add(listenerPortAndProtocal);
		}
		describeLoadBalancerAttributeResponse.setListenerPortsAndProtocal(listenerPortsAndProtocal);

		List<ListenerPortAndProtocol> listenerPortsAndProtocol = new ArrayList<ListenerPortAndProtocol>();
		for (int i = 0; i < context.lengthValue("DescribeLoadBalancerAttributeResponse.ListenerPortsAndProtocol.Length"); i++) {
			ListenerPortAndProtocol listenerPortAndProtocol = new ListenerPortAndProtocol();
			listenerPortAndProtocol.setListenerPort(context.integerValue("DescribeLoadBalancerAttributeResponse.ListenerPortsAndProtocol["+ i +"].ListenerPort"));
			listenerPortAndProtocol.setListenerProtocol(context.stringValue("DescribeLoadBalancerAttributeResponse.ListenerPortsAndProtocol["+ i +"].ListenerProtocol"));

			listenerPortsAndProtocol.add(listenerPortAndProtocol);
		}
		describeLoadBalancerAttributeResponse.setListenerPortsAndProtocol(listenerPortsAndProtocol);

		List<BackendServer> backendServers = new ArrayList<BackendServer>();
		for (int i = 0; i < context.lengthValue("DescribeLoadBalancerAttributeResponse.BackendServers.Length"); i++) {
			BackendServer backendServer = new BackendServer();
			backendServer.setServerId(context.stringValue("DescribeLoadBalancerAttributeResponse.BackendServers["+ i +"].ServerId"));
			backendServer.setWeight(context.integerValue("DescribeLoadBalancerAttributeResponse.BackendServers["+ i +"].Weight"));

			backendServers.add(backendServer);
		}
		describeLoadBalancerAttributeResponse.setBackendServers(backendServers);
	 
	 	return describeLoadBalancerAttributeResponse;
	}
}