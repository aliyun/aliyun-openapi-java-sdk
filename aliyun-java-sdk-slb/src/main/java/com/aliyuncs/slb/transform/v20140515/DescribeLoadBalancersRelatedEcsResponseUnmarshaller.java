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

import com.aliyuncs.slb.model.v20140515.DescribeLoadBalancersRelatedEcsResponse;
import com.aliyuncs.slb.model.v20140515.DescribeLoadBalancersRelatedEcsResponse.LoadBalancer;
import com.aliyuncs.slb.model.v20140515.DescribeLoadBalancersRelatedEcsResponse.LoadBalancer.BackendServer4;
import com.aliyuncs.slb.model.v20140515.DescribeLoadBalancersRelatedEcsResponse.LoadBalancer.MasterSlaveVServerGroup;
import com.aliyuncs.slb.model.v20140515.DescribeLoadBalancersRelatedEcsResponse.LoadBalancer.MasterSlaveVServerGroup.BackendServer;
import com.aliyuncs.slb.model.v20140515.DescribeLoadBalancersRelatedEcsResponse.LoadBalancer.VServerGroup;
import com.aliyuncs.slb.model.v20140515.DescribeLoadBalancersRelatedEcsResponse.LoadBalancer.VServerGroup.BackendServer3;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLoadBalancersRelatedEcsResponseUnmarshaller {

	public static DescribeLoadBalancersRelatedEcsResponse unmarshall(DescribeLoadBalancersRelatedEcsResponse describeLoadBalancersRelatedEcsResponse, UnmarshallerContext context) {
		
		describeLoadBalancersRelatedEcsResponse.setRequestId(context.stringValue("DescribeLoadBalancersRelatedEcsResponse.RequestId"));
		describeLoadBalancersRelatedEcsResponse.setMessage(context.stringValue("DescribeLoadBalancersRelatedEcsResponse.Message"));
		describeLoadBalancersRelatedEcsResponse.setSuccess(context.booleanValue("DescribeLoadBalancersRelatedEcsResponse.Success"));

		List<LoadBalancer> loadBalancers = new ArrayList<LoadBalancer>();
		for (int i = 0; i < context.lengthValue("DescribeLoadBalancersRelatedEcsResponse.LoadBalancers.Length"); i++) {
			LoadBalancer loadBalancer = new LoadBalancer();
			loadBalancer.setLoadBalancerId(context.stringValue("DescribeLoadBalancersRelatedEcsResponse.LoadBalancers["+ i +"].LoadBalancerId"));
			loadBalancer.setCount(context.integerValue("DescribeLoadBalancersRelatedEcsResponse.LoadBalancers["+ i +"].Count"));

			List<MasterSlaveVServerGroup> masterSlaveVServerGroups = new ArrayList<MasterSlaveVServerGroup>();
			for (int j = 0; j < context.lengthValue("DescribeLoadBalancersRelatedEcsResponse.LoadBalancers["+ i +"].MasterSlaveVServerGroups.Length"); j++) {
				MasterSlaveVServerGroup masterSlaveVServerGroup = new MasterSlaveVServerGroup();
				masterSlaveVServerGroup.setGroupId(context.stringValue("DescribeLoadBalancersRelatedEcsResponse.LoadBalancers["+ i +"].MasterSlaveVServerGroups["+ j +"].GroupId"));
				masterSlaveVServerGroup.setGroupName(context.stringValue("DescribeLoadBalancersRelatedEcsResponse.LoadBalancers["+ i +"].MasterSlaveVServerGroups["+ j +"].GroupName"));

				List<BackendServer> backendServers1 = new ArrayList<BackendServer>();
				for (int k = 0; k < context.lengthValue("DescribeLoadBalancersRelatedEcsResponse.LoadBalancers["+ i +"].MasterSlaveVServerGroups["+ j +"].BackendServers.Length"); k++) {
					BackendServer backendServer = new BackendServer();
					backendServer.setVmName(context.stringValue("DescribeLoadBalancersRelatedEcsResponse.LoadBalancers["+ i +"].MasterSlaveVServerGroups["+ j +"].BackendServers["+ k +"].VmName"));
					backendServer.setWeight(context.integerValue("DescribeLoadBalancersRelatedEcsResponse.LoadBalancers["+ i +"].MasterSlaveVServerGroups["+ j +"].BackendServers["+ k +"].Weight"));
					backendServer.setPort(context.integerValue("DescribeLoadBalancersRelatedEcsResponse.LoadBalancers["+ i +"].MasterSlaveVServerGroups["+ j +"].BackendServers["+ k +"].Port"));
					backendServer.setNetworkType(context.stringValue("DescribeLoadBalancersRelatedEcsResponse.LoadBalancers["+ i +"].MasterSlaveVServerGroups["+ j +"].BackendServers["+ k +"].NetworkType"));

					backendServers1.add(backendServer);
				}
				masterSlaveVServerGroup.setBackendServers1(backendServers1);

				masterSlaveVServerGroups.add(masterSlaveVServerGroup);
			}
			loadBalancer.setMasterSlaveVServerGroups(masterSlaveVServerGroups);

			List<VServerGroup> vServerGroups = new ArrayList<VServerGroup>();
			for (int j = 0; j < context.lengthValue("DescribeLoadBalancersRelatedEcsResponse.LoadBalancers["+ i +"].VServerGroups.Length"); j++) {
				VServerGroup vServerGroup = new VServerGroup();
				vServerGroup.setGroupId(context.stringValue("DescribeLoadBalancersRelatedEcsResponse.LoadBalancers["+ i +"].VServerGroups["+ j +"].GroupId"));
				vServerGroup.setGroupName(context.stringValue("DescribeLoadBalancersRelatedEcsResponse.LoadBalancers["+ i +"].VServerGroups["+ j +"].GroupName"));

				List<BackendServer3> backendServers2 = new ArrayList<BackendServer3>();
				for (int k = 0; k < context.lengthValue("DescribeLoadBalancersRelatedEcsResponse.LoadBalancers["+ i +"].VServerGroups["+ j +"].BackendServers.Length"); k++) {
					BackendServer3 backendServer3 = new BackendServer3();
					backendServer3.setVmName(context.stringValue("DescribeLoadBalancersRelatedEcsResponse.LoadBalancers["+ i +"].VServerGroups["+ j +"].BackendServers["+ k +"].VmName"));
					backendServer3.setWeight(context.integerValue("DescribeLoadBalancersRelatedEcsResponse.LoadBalancers["+ i +"].VServerGroups["+ j +"].BackendServers["+ k +"].Weight"));
					backendServer3.setPort(context.integerValue("DescribeLoadBalancersRelatedEcsResponse.LoadBalancers["+ i +"].VServerGroups["+ j +"].BackendServers["+ k +"].Port"));
					backendServer3.setNetworkType(context.stringValue("DescribeLoadBalancersRelatedEcsResponse.LoadBalancers["+ i +"].VServerGroups["+ j +"].BackendServers["+ k +"].NetworkType"));

					backendServers2.add(backendServer3);
				}
				vServerGroup.setBackendServers2(backendServers2);

				vServerGroups.add(vServerGroup);
			}
			loadBalancer.setVServerGroups(vServerGroups);

			List<BackendServer4> backendServers = new ArrayList<BackendServer4>();
			for (int j = 0; j < context.lengthValue("DescribeLoadBalancersRelatedEcsResponse.LoadBalancers["+ i +"].BackendServers.Length"); j++) {
				BackendServer4 backendServer4 = new BackendServer4();
				backendServer4.setVmName(context.stringValue("DescribeLoadBalancersRelatedEcsResponse.LoadBalancers["+ i +"].BackendServers["+ j +"].VmName"));
				backendServer4.setWeight(context.integerValue("DescribeLoadBalancersRelatedEcsResponse.LoadBalancers["+ i +"].BackendServers["+ j +"].Weight"));
				backendServer4.setPort(context.integerValue("DescribeLoadBalancersRelatedEcsResponse.LoadBalancers["+ i +"].BackendServers["+ j +"].Port"));
				backendServer4.setNetworkType(context.stringValue("DescribeLoadBalancersRelatedEcsResponse.LoadBalancers["+ i +"].BackendServers["+ j +"].NetworkType"));

				backendServers.add(backendServer4);
			}
			loadBalancer.setBackendServers(backendServers);

			loadBalancers.add(loadBalancer);
		}
		describeLoadBalancersRelatedEcsResponse.setLoadBalancers(loadBalancers);
	 
	 	return describeLoadBalancersRelatedEcsResponse;
	}
}