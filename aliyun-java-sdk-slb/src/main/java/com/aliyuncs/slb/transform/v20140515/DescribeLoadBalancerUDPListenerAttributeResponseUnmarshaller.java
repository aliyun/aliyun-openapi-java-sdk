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

import com.aliyuncs.slb.model.v20140515.DescribeLoadBalancerUDPListenerAttributeResponse;
import com.aliyuncs.slb.model.v20140515.DescribeLoadBalancerUDPListenerAttributeResponse.PortRange;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLoadBalancerUDPListenerAttributeResponseUnmarshaller {

	public static DescribeLoadBalancerUDPListenerAttributeResponse unmarshall(DescribeLoadBalancerUDPListenerAttributeResponse describeLoadBalancerUDPListenerAttributeResponse, UnmarshallerContext _ctx) {
		
		describeLoadBalancerUDPListenerAttributeResponse.setRequestId(_ctx.stringValue("DescribeLoadBalancerUDPListenerAttributeResponse.RequestId"));
		describeLoadBalancerUDPListenerAttributeResponse.setAclId(_ctx.stringValue("DescribeLoadBalancerUDPListenerAttributeResponse.AclId"));
		describeLoadBalancerUDPListenerAttributeResponse.setAclStatus(_ctx.stringValue("DescribeLoadBalancerUDPListenerAttributeResponse.AclStatus"));
		describeLoadBalancerUDPListenerAttributeResponse.setAclType(_ctx.stringValue("DescribeLoadBalancerUDPListenerAttributeResponse.AclType"));
		describeLoadBalancerUDPListenerAttributeResponse.setBackendServerPort(_ctx.integerValue("DescribeLoadBalancerUDPListenerAttributeResponse.BackendServerPort"));
		describeLoadBalancerUDPListenerAttributeResponse.setBandwidth(_ctx.integerValue("DescribeLoadBalancerUDPListenerAttributeResponse.Bandwidth"));
		describeLoadBalancerUDPListenerAttributeResponse.setConnectionDrain(_ctx.stringValue("DescribeLoadBalancerUDPListenerAttributeResponse.ConnectionDrain"));
		describeLoadBalancerUDPListenerAttributeResponse.setConnectionDrainTimeout(_ctx.integerValue("DescribeLoadBalancerUDPListenerAttributeResponse.ConnectionDrainTimeout"));
		describeLoadBalancerUDPListenerAttributeResponse.setDescription(_ctx.stringValue("DescribeLoadBalancerUDPListenerAttributeResponse.Description"));
		describeLoadBalancerUDPListenerAttributeResponse.setFailoverStrategy(_ctx.stringValue("DescribeLoadBalancerUDPListenerAttributeResponse.FailoverStrategy"));
		describeLoadBalancerUDPListenerAttributeResponse.setFailoverThreshold(_ctx.integerValue("DescribeLoadBalancerUDPListenerAttributeResponse.FailoverThreshold"));
		describeLoadBalancerUDPListenerAttributeResponse.setHealthCheck(_ctx.stringValue("DescribeLoadBalancerUDPListenerAttributeResponse.HealthCheck"));
		describeLoadBalancerUDPListenerAttributeResponse.setHealthCheckConnectPort(_ctx.integerValue("DescribeLoadBalancerUDPListenerAttributeResponse.HealthCheckConnectPort"));
		describeLoadBalancerUDPListenerAttributeResponse.setHealthCheckConnectTimeout(_ctx.integerValue("DescribeLoadBalancerUDPListenerAttributeResponse.HealthCheckConnectTimeout"));
		describeLoadBalancerUDPListenerAttributeResponse.setHealthCheckDomain(_ctx.stringValue("DescribeLoadBalancerUDPListenerAttributeResponse.HealthCheckDomain"));
		describeLoadBalancerUDPListenerAttributeResponse.setHealthCheckExp(_ctx.stringValue("DescribeLoadBalancerUDPListenerAttributeResponse.HealthCheckExp"));
		describeLoadBalancerUDPListenerAttributeResponse.setHealthCheckHttpCode(_ctx.stringValue("DescribeLoadBalancerUDPListenerAttributeResponse.HealthCheckHttpCode"));
		describeLoadBalancerUDPListenerAttributeResponse.setHealthCheckInterval(_ctx.integerValue("DescribeLoadBalancerUDPListenerAttributeResponse.HealthCheckInterval"));
		describeLoadBalancerUDPListenerAttributeResponse.setHealthCheckMethod(_ctx.stringValue("DescribeLoadBalancerUDPListenerAttributeResponse.HealthCheckMethod"));
		describeLoadBalancerUDPListenerAttributeResponse.setHealthCheckReq(_ctx.stringValue("DescribeLoadBalancerUDPListenerAttributeResponse.HealthCheckReq"));
		describeLoadBalancerUDPListenerAttributeResponse.setHealthCheckType(_ctx.stringValue("DescribeLoadBalancerUDPListenerAttributeResponse.HealthCheckType"));
		describeLoadBalancerUDPListenerAttributeResponse.setHealthCheckURI(_ctx.stringValue("DescribeLoadBalancerUDPListenerAttributeResponse.HealthCheckURI"));
		describeLoadBalancerUDPListenerAttributeResponse.setHealthyThreshold(_ctx.integerValue("DescribeLoadBalancerUDPListenerAttributeResponse.HealthyThreshold"));
		describeLoadBalancerUDPListenerAttributeResponse.setListenerPort(_ctx.integerValue("DescribeLoadBalancerUDPListenerAttributeResponse.ListenerPort"));
		describeLoadBalancerUDPListenerAttributeResponse.setMasterServerGroupId(_ctx.stringValue("DescribeLoadBalancerUDPListenerAttributeResponse.MasterServerGroupId"));
		describeLoadBalancerUDPListenerAttributeResponse.setMasterSlaveModeEnabled(_ctx.booleanValue("DescribeLoadBalancerUDPListenerAttributeResponse.MasterSlaveModeEnabled"));
		describeLoadBalancerUDPListenerAttributeResponse.setMasterSlaveServerGroupId(_ctx.stringValue("DescribeLoadBalancerUDPListenerAttributeResponse.MasterSlaveServerGroupId"));
		describeLoadBalancerUDPListenerAttributeResponse.setMaxConnection(_ctx.integerValue("DescribeLoadBalancerUDPListenerAttributeResponse.MaxConnection"));
		describeLoadBalancerUDPListenerAttributeResponse.setPersistenceTimeout(_ctx.integerValue("DescribeLoadBalancerUDPListenerAttributeResponse.PersistenceTimeout"));
		describeLoadBalancerUDPListenerAttributeResponse.setProxyProtocolV2Enabled(_ctx.booleanValue("DescribeLoadBalancerUDPListenerAttributeResponse.ProxyProtocolV2Enabled"));
		describeLoadBalancerUDPListenerAttributeResponse.setProxyProtocolVpcIdEnabled(_ctx.booleanValue("DescribeLoadBalancerUDPListenerAttributeResponse.ProxyProtocolVpcIdEnabled"));
		describeLoadBalancerUDPListenerAttributeResponse.setQuicVersion(_ctx.stringValue("DescribeLoadBalancerUDPListenerAttributeResponse.QuicVersion"));
		describeLoadBalancerUDPListenerAttributeResponse.setScheduler(_ctx.stringValue("DescribeLoadBalancerUDPListenerAttributeResponse.Scheduler"));
		describeLoadBalancerUDPListenerAttributeResponse.setSlaveServerGroupId(_ctx.stringValue("DescribeLoadBalancerUDPListenerAttributeResponse.SlaveServerGroupId"));
		describeLoadBalancerUDPListenerAttributeResponse.setStatus(_ctx.stringValue("DescribeLoadBalancerUDPListenerAttributeResponse.Status"));
		describeLoadBalancerUDPListenerAttributeResponse.setUnhealthyThreshold(_ctx.integerValue("DescribeLoadBalancerUDPListenerAttributeResponse.UnhealthyThreshold"));
		describeLoadBalancerUDPListenerAttributeResponse.setVServerGroupId(_ctx.stringValue("DescribeLoadBalancerUDPListenerAttributeResponse.VServerGroupId"));
		describeLoadBalancerUDPListenerAttributeResponse.setVpcIds(_ctx.stringValue("DescribeLoadBalancerUDPListenerAttributeResponse.VpcIds"));
		describeLoadBalancerUDPListenerAttributeResponse.setWorkingServerGroupId(_ctx.stringValue("DescribeLoadBalancerUDPListenerAttributeResponse.WorkingServerGroupId"));
		describeLoadBalancerUDPListenerAttributeResponse.setHealthCheckSwitch(_ctx.stringValue("DescribeLoadBalancerUDPListenerAttributeResponse.HealthCheckSwitch"));

		List<String> aclIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLoadBalancerUDPListenerAttributeResponse.AclIds.Length"); i++) {
			aclIds.add(_ctx.stringValue("DescribeLoadBalancerUDPListenerAttributeResponse.AclIds["+ i +"]"));
		}
		describeLoadBalancerUDPListenerAttributeResponse.setAclIds(aclIds);

		List<PortRange> portRanges = new ArrayList<PortRange>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLoadBalancerUDPListenerAttributeResponse.PortRanges.Length"); i++) {
			PortRange portRange = new PortRange();
			portRange.setEndPort(_ctx.integerValue("DescribeLoadBalancerUDPListenerAttributeResponse.PortRanges["+ i +"].EndPort"));
			portRange.setStartPort(_ctx.integerValue("DescribeLoadBalancerUDPListenerAttributeResponse.PortRanges["+ i +"].StartPort"));

			portRanges.add(portRange);
		}
		describeLoadBalancerUDPListenerAttributeResponse.setPortRanges(portRanges);
	 
	 	return describeLoadBalancerUDPListenerAttributeResponse;
	}
}