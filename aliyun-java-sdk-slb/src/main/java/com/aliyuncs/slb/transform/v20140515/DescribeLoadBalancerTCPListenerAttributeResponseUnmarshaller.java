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

import com.aliyuncs.slb.model.v20140515.DescribeLoadBalancerTCPListenerAttributeResponse;
import com.aliyuncs.slb.model.v20140515.DescribeLoadBalancerTCPListenerAttributeResponse.PortRange;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLoadBalancerTCPListenerAttributeResponseUnmarshaller {

	public static DescribeLoadBalancerTCPListenerAttributeResponse unmarshall(DescribeLoadBalancerTCPListenerAttributeResponse describeLoadBalancerTCPListenerAttributeResponse, UnmarshallerContext _ctx) {
		
		describeLoadBalancerTCPListenerAttributeResponse.setRequestId(_ctx.stringValue("DescribeLoadBalancerTCPListenerAttributeResponse.RequestId"));
		describeLoadBalancerTCPListenerAttributeResponse.setAclId(_ctx.stringValue("DescribeLoadBalancerTCPListenerAttributeResponse.AclId"));
		describeLoadBalancerTCPListenerAttributeResponse.setAclStatus(_ctx.stringValue("DescribeLoadBalancerTCPListenerAttributeResponse.AclStatus"));
		describeLoadBalancerTCPListenerAttributeResponse.setAclType(_ctx.stringValue("DescribeLoadBalancerTCPListenerAttributeResponse.AclType"));
		describeLoadBalancerTCPListenerAttributeResponse.setBackendServerPort(_ctx.integerValue("DescribeLoadBalancerTCPListenerAttributeResponse.BackendServerPort"));
		describeLoadBalancerTCPListenerAttributeResponse.setBandwidth(_ctx.integerValue("DescribeLoadBalancerTCPListenerAttributeResponse.Bandwidth"));
		describeLoadBalancerTCPListenerAttributeResponse.setConnectionDrain(_ctx.stringValue("DescribeLoadBalancerTCPListenerAttributeResponse.ConnectionDrain"));
		describeLoadBalancerTCPListenerAttributeResponse.setConnectionDrainTimeout(_ctx.integerValue("DescribeLoadBalancerTCPListenerAttributeResponse.ConnectionDrainTimeout"));
		describeLoadBalancerTCPListenerAttributeResponse.setDescription(_ctx.stringValue("DescribeLoadBalancerTCPListenerAttributeResponse.Description"));
		describeLoadBalancerTCPListenerAttributeResponse.setEstablishedTimeout(_ctx.integerValue("DescribeLoadBalancerTCPListenerAttributeResponse.EstablishedTimeout"));
		describeLoadBalancerTCPListenerAttributeResponse.setFailoverStrategy(_ctx.stringValue("DescribeLoadBalancerTCPListenerAttributeResponse.FailoverStrategy"));
		describeLoadBalancerTCPListenerAttributeResponse.setFailoverThreshold(_ctx.integerValue("DescribeLoadBalancerTCPListenerAttributeResponse.FailoverThreshold"));
		describeLoadBalancerTCPListenerAttributeResponse.setHealthCheck(_ctx.stringValue("DescribeLoadBalancerTCPListenerAttributeResponse.HealthCheck"));
		describeLoadBalancerTCPListenerAttributeResponse.setHealthCheckConnectPort(_ctx.integerValue("DescribeLoadBalancerTCPListenerAttributeResponse.HealthCheckConnectPort"));
		describeLoadBalancerTCPListenerAttributeResponse.setHealthCheckConnectTimeout(_ctx.integerValue("DescribeLoadBalancerTCPListenerAttributeResponse.HealthCheckConnectTimeout"));
		describeLoadBalancerTCPListenerAttributeResponse.setHealthCheckDomain(_ctx.stringValue("DescribeLoadBalancerTCPListenerAttributeResponse.HealthCheckDomain"));
		describeLoadBalancerTCPListenerAttributeResponse.setHealthCheckHttpCode(_ctx.stringValue("DescribeLoadBalancerTCPListenerAttributeResponse.HealthCheckHttpCode"));
		describeLoadBalancerTCPListenerAttributeResponse.setHealthCheckInterval(_ctx.integerValue("DescribeLoadBalancerTCPListenerAttributeResponse.HealthCheckInterval"));
		describeLoadBalancerTCPListenerAttributeResponse.setHealthCheckMethod(_ctx.stringValue("DescribeLoadBalancerTCPListenerAttributeResponse.HealthCheckMethod"));
		describeLoadBalancerTCPListenerAttributeResponse.setHealthCheckTcpFastCloseEnabled(_ctx.booleanValue("DescribeLoadBalancerTCPListenerAttributeResponse.HealthCheckTcpFastCloseEnabled"));
		describeLoadBalancerTCPListenerAttributeResponse.setHealthCheckType(_ctx.stringValue("DescribeLoadBalancerTCPListenerAttributeResponse.HealthCheckType"));
		describeLoadBalancerTCPListenerAttributeResponse.setHealthCheckURI(_ctx.stringValue("DescribeLoadBalancerTCPListenerAttributeResponse.HealthCheckURI"));
		describeLoadBalancerTCPListenerAttributeResponse.setHealthyThreshold(_ctx.integerValue("DescribeLoadBalancerTCPListenerAttributeResponse.HealthyThreshold"));
		describeLoadBalancerTCPListenerAttributeResponse.setListenerPort(_ctx.integerValue("DescribeLoadBalancerTCPListenerAttributeResponse.ListenerPort"));
		describeLoadBalancerTCPListenerAttributeResponse.setMasterServerGroupId(_ctx.stringValue("DescribeLoadBalancerTCPListenerAttributeResponse.MasterServerGroupId"));
		describeLoadBalancerTCPListenerAttributeResponse.setMasterSlaveModeEnabled(_ctx.booleanValue("DescribeLoadBalancerTCPListenerAttributeResponse.MasterSlaveModeEnabled"));
		describeLoadBalancerTCPListenerAttributeResponse.setMasterSlaveServerGroupId(_ctx.stringValue("DescribeLoadBalancerTCPListenerAttributeResponse.MasterSlaveServerGroupId"));
		describeLoadBalancerTCPListenerAttributeResponse.setMaxConnection(_ctx.integerValue("DescribeLoadBalancerTCPListenerAttributeResponse.MaxConnection"));
		describeLoadBalancerTCPListenerAttributeResponse.setPersistenceTimeout(_ctx.integerValue("DescribeLoadBalancerTCPListenerAttributeResponse.PersistenceTimeout"));
		describeLoadBalancerTCPListenerAttributeResponse.setProxyProtocolV2Enabled(_ctx.booleanValue("DescribeLoadBalancerTCPListenerAttributeResponse.ProxyProtocolV2Enabled"));
		describeLoadBalancerTCPListenerAttributeResponse.setScheduler(_ctx.stringValue("DescribeLoadBalancerTCPListenerAttributeResponse.Scheduler"));
		describeLoadBalancerTCPListenerAttributeResponse.setSlaveServerGroupId(_ctx.stringValue("DescribeLoadBalancerTCPListenerAttributeResponse.SlaveServerGroupId"));
		describeLoadBalancerTCPListenerAttributeResponse.setStatus(_ctx.stringValue("DescribeLoadBalancerTCPListenerAttributeResponse.Status"));
		describeLoadBalancerTCPListenerAttributeResponse.setSynProxy(_ctx.stringValue("DescribeLoadBalancerTCPListenerAttributeResponse.SynProxy"));
		describeLoadBalancerTCPListenerAttributeResponse.setUnhealthyThreshold(_ctx.integerValue("DescribeLoadBalancerTCPListenerAttributeResponse.UnhealthyThreshold"));
		describeLoadBalancerTCPListenerAttributeResponse.setVServerGroupId(_ctx.stringValue("DescribeLoadBalancerTCPListenerAttributeResponse.VServerGroupId"));
		describeLoadBalancerTCPListenerAttributeResponse.setVpcIds(_ctx.stringValue("DescribeLoadBalancerTCPListenerAttributeResponse.VpcIds"));
		describeLoadBalancerTCPListenerAttributeResponse.setWorkingServerGroupId(_ctx.stringValue("DescribeLoadBalancerTCPListenerAttributeResponse.WorkingServerGroupId"));

		List<String> aclIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLoadBalancerTCPListenerAttributeResponse.AclIds.Length"); i++) {
			aclIds.add(_ctx.stringValue("DescribeLoadBalancerTCPListenerAttributeResponse.AclIds["+ i +"]"));
		}
		describeLoadBalancerTCPListenerAttributeResponse.setAclIds(aclIds);

		List<PortRange> portRanges = new ArrayList<PortRange>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLoadBalancerTCPListenerAttributeResponse.PortRanges.Length"); i++) {
			PortRange portRange = new PortRange();
			portRange.setEndPort(_ctx.integerValue("DescribeLoadBalancerTCPListenerAttributeResponse.PortRanges["+ i +"].EndPort"));
			portRange.setStartPort(_ctx.integerValue("DescribeLoadBalancerTCPListenerAttributeResponse.PortRanges["+ i +"].StartPort"));

			portRanges.add(portRange);
		}
		describeLoadBalancerTCPListenerAttributeResponse.setPortRanges(portRanges);
	 
	 	return describeLoadBalancerTCPListenerAttributeResponse;
	}
}