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
package com.aliyuncs.ecs.transform.v20140526;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20140526.DescribeDeploymentSetTopologyResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeDeploymentSetTopologyResponse.Rack;
import com.aliyuncs.ecs.model.v20140526.DescribeDeploymentSetTopologyResponse.Rack.Host2;
import com.aliyuncs.ecs.model.v20140526.DescribeDeploymentSetTopologyResponse._Switch;
import com.aliyuncs.ecs.model.v20140526.DescribeDeploymentSetTopologyResponse._Switch.Host;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDeploymentSetTopologyResponseUnmarshaller {

	public static DescribeDeploymentSetTopologyResponse unmarshall(DescribeDeploymentSetTopologyResponse describeDeploymentSetTopologyResponse, UnmarshallerContext context) {
		
		describeDeploymentSetTopologyResponse.setRequestId(context.stringValue("DescribeDeploymentSetTopologyResponse.RequestId"));

		List<_Switch> switchs = new ArrayList<_Switch>();
		for (int i = 0; i < context.lengthValue("DescribeDeploymentSetTopologyResponse.Switchs.Length"); i++) {
			_Switch _switch = new _Switch();
			_switch.setSwitchId(context.stringValue("DescribeDeploymentSetTopologyResponse.Switchs["+ i +"].SwitchId"));

			List<Host> hosts = new ArrayList<Host>();
			for (int j = 0; j < context.lengthValue("DescribeDeploymentSetTopologyResponse.Switchs["+ i +"].Hosts.Length"); j++) {
				Host host = new Host();
				host.setHostId(context.stringValue("DescribeDeploymentSetTopologyResponse.Switchs["+ i +"].Hosts["+ j +"].HostId"));

				List<String> instanceIds = new ArrayList<String>();
				for (int k = 0; k < context.lengthValue("DescribeDeploymentSetTopologyResponse.Switchs["+ i +"].Hosts["+ j +"].InstanceIds.Length"); k++) {
					instanceIds.add(context.stringValue("DescribeDeploymentSetTopologyResponse.Switchs["+ i +"].Hosts["+ j +"].InstanceIds["+ k +"]"));
				}
				host.setInstanceIds(instanceIds);

				hosts.add(host);
			}
			_switch.setHosts(hosts);

			switchs.add(_switch);
		}
		describeDeploymentSetTopologyResponse.setSwitchs(switchs);

		List<Rack> racks = new ArrayList<Rack>();
		for (int i = 0; i < context.lengthValue("DescribeDeploymentSetTopologyResponse.Racks.Length"); i++) {
			Rack rack = new Rack();
			rack.setRackId(context.stringValue("DescribeDeploymentSetTopologyResponse.Racks["+ i +"].RackId"));

			List<Host2> hosts1 = new ArrayList<Host2>();
			for (int j = 0; j < context.lengthValue("DescribeDeploymentSetTopologyResponse.Racks["+ i +"].Hosts.Length"); j++) {
				Host2 host2 = new Host2();
				host2.setHostId3(context.stringValue("DescribeDeploymentSetTopologyResponse.Racks["+ i +"].Hosts["+ j +"].HostId"));

				List<String> instanceIds4 = new ArrayList<String>();
				for (int k = 0; k < context.lengthValue("DescribeDeploymentSetTopologyResponse.Racks["+ i +"].Hosts["+ j +"].InstanceIds.Length"); k++) {
					instanceIds4.add(context.stringValue("DescribeDeploymentSetTopologyResponse.Racks["+ i +"].Hosts["+ j +"].InstanceIds["+ k +"]"));
				}
				host2.setInstanceIds4(instanceIds4);

				hosts1.add(host2);
			}
			rack.setHosts1(hosts1);

			racks.add(rack);
		}
		describeDeploymentSetTopologyResponse.setRacks(racks);
	 
	 	return describeDeploymentSetTopologyResponse;
	}
}