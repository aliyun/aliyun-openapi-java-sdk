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

package com.aliyuncs.webplus.transform.v20190320;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.webplus.model.v20190320.DescribeEnvResourceResponse;
import com.aliyuncs.webplus.model.v20190320.DescribeEnvResourceResponse.EnvResource;
import com.aliyuncs.webplus.model.v20190320.DescribeEnvResourceResponse.EnvResource.Instance;
import com.aliyuncs.webplus.model.v20190320.DescribeEnvResourceResponse.EnvResource.LoadBalancer;
import com.aliyuncs.webplus.model.v20190320.DescribeEnvResourceResponse.EnvResource.MonitorGroup;
import com.aliyuncs.webplus.model.v20190320.DescribeEnvResourceResponse.EnvResource.ScalingGroup;
import com.aliyuncs.webplus.model.v20190320.DescribeEnvResourceResponse.EnvResource.SecurityGroup;
import com.aliyuncs.webplus.model.v20190320.DescribeEnvResourceResponse.EnvResource.VSwitch;
import com.aliyuncs.webplus.model.v20190320.DescribeEnvResourceResponse.EnvResource.Vpc;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEnvResourceResponseUnmarshaller {

	public static DescribeEnvResourceResponse unmarshall(DescribeEnvResourceResponse describeEnvResourceResponse, UnmarshallerContext _ctx) {
		
		describeEnvResourceResponse.setRequestId(_ctx.stringValue("DescribeEnvResourceResponse.RequestId"));
		describeEnvResourceResponse.setCode(_ctx.stringValue("DescribeEnvResourceResponse.Code"));
		describeEnvResourceResponse.setMessage(_ctx.stringValue("DescribeEnvResourceResponse.Message"));

		EnvResource envResource = new EnvResource();
		envResource.setEnvId(_ctx.stringValue("DescribeEnvResourceResponse.EnvResource.EnvId"));
		envResource.setEnvName(_ctx.stringValue("DescribeEnvResourceResponse.EnvResource.EnvName"));
		envResource.setLaunchConfigurationId(_ctx.stringValue("DescribeEnvResourceResponse.EnvResource.LaunchConfigurationId"));
		envResource.setLaunchTemplateId(_ctx.stringValue("DescribeEnvResourceResponse.EnvResource.LaunchTemplateId"));

		MonitorGroup monitorGroup = new MonitorGroup();
		monitorGroup.setId(_ctx.stringValue("DescribeEnvResourceResponse.EnvResource.MonitorGroup.Id"));
		envResource.setMonitorGroup(monitorGroup);

		ScalingGroup scalingGroup = new ScalingGroup();
		scalingGroup.setId(_ctx.stringValue("DescribeEnvResourceResponse.EnvResource.ScalingGroup.Id"));
		envResource.setScalingGroup(scalingGroup);

		Vpc vpc = new Vpc();
		vpc.setId(_ctx.stringValue("DescribeEnvResourceResponse.EnvResource.Vpc.Id"));
		envResource.setVpc(vpc);

		List<Instance> instances = new ArrayList<Instance>();
		for (int i = 0; i < _ctx.lengthValue("DescribeEnvResourceResponse.EnvResource.Instances.Length"); i++) {
			Instance instance = new Instance();
			instance.setId(_ctx.stringValue("DescribeEnvResourceResponse.EnvResource.Instances["+ i +"].Id"));

			instances.add(instance);
		}
		envResource.setInstances(instances);

		List<VSwitch> vSwitches = new ArrayList<VSwitch>();
		for (int i = 0; i < _ctx.lengthValue("DescribeEnvResourceResponse.EnvResource.VSwitches.Length"); i++) {
			VSwitch vSwitch = new VSwitch();
			vSwitch.setId(_ctx.stringValue("DescribeEnvResourceResponse.EnvResource.VSwitches["+ i +"].Id"));

			vSwitches.add(vSwitch);
		}
		envResource.setVSwitches(vSwitches);

		List<LoadBalancer> loadBalancers = new ArrayList<LoadBalancer>();
		for (int i = 0; i < _ctx.lengthValue("DescribeEnvResourceResponse.EnvResource.LoadBalancers.Length"); i++) {
			LoadBalancer loadBalancer = new LoadBalancer();
			loadBalancer.setId(_ctx.stringValue("DescribeEnvResourceResponse.EnvResource.LoadBalancers["+ i +"].Id"));
			loadBalancer.setAddressType(_ctx.stringValue("DescribeEnvResourceResponse.EnvResource.LoadBalancers["+ i +"].AddressType"));
			loadBalancer.setPort(_ctx.integerValue("DescribeEnvResourceResponse.EnvResource.LoadBalancers["+ i +"].Port"));
			loadBalancer.setProtocol(_ctx.stringValue("DescribeEnvResourceResponse.EnvResource.LoadBalancers["+ i +"].Protocol"));

			loadBalancers.add(loadBalancer);
		}
		envResource.setLoadBalancers(loadBalancers);

		List<SecurityGroup> securityGroups = new ArrayList<SecurityGroup>();
		for (int i = 0; i < _ctx.lengthValue("DescribeEnvResourceResponse.EnvResource.SecurityGroups.Length"); i++) {
			SecurityGroup securityGroup = new SecurityGroup();
			securityGroup.setId(_ctx.stringValue("DescribeEnvResourceResponse.EnvResource.SecurityGroups["+ i +"].Id"));

			securityGroups.add(securityGroup);
		}
		envResource.setSecurityGroups(securityGroups);
		describeEnvResourceResponse.setEnvResource(envResource);
	 
	 	return describeEnvResourceResponse;
	}
}