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
		describeLoadBalancerUDPListenerAttributeResponse.setVServerGroupId(_ctx.stringValue("DescribeLoadBalancerUDPListenerAttributeResponse.VServerGroupId"));
		describeLoadBalancerUDPListenerAttributeResponse.setStatus(_ctx.stringValue("DescribeLoadBalancerUDPListenerAttributeResponse.Status"));
		describeLoadBalancerUDPListenerAttributeResponse.setAclType(_ctx.stringValue("DescribeLoadBalancerUDPListenerAttributeResponse.AclType"));
		describeLoadBalancerUDPListenerAttributeResponse.setConnectionDrainTimeout(_ctx.integerValue("DescribeLoadBalancerUDPListenerAttributeResponse.ConnectionDrainTimeout"));
		describeLoadBalancerUDPListenerAttributeResponse.setFailoverStrategy(_ctx.stringValue("DescribeLoadBalancerUDPListenerAttributeResponse.FailoverStrategy"));
		describeLoadBalancerUDPListenerAttributeResponse.setWorkingServerGroupId(_ctx.stringValue("DescribeLoadBalancerUDPListenerAttributeResponse.WorkingServerGroupId"));
		describeLoadBalancerUDPListenerAttributeResponse.setHealthCheckSwitch(_ctx.stringValue("DescribeLoadBalancerUDPListenerAttributeResponse.HealthCheckSwitch"));
		describeLoadBalancerUDPListenerAttributeResponse.setFullNatEnabled(_ctx.booleanValue("DescribeLoadBalancerUDPListenerAttributeResponse.FullNatEnabled"));
		describeLoadBalancerUDPListenerAttributeResponse.setServiceManagedMode(_ctx.stringValue("DescribeLoadBalancerUDPListenerAttributeResponse.ServiceManagedMode"));
		describeLoadBalancerUDPListenerAttributeResponse.setQuicVersion(_ctx.stringValue("DescribeLoadBalancerUDPListenerAttributeResponse.QuicVersion"));
		describeLoadBalancerUDPListenerAttributeResponse.setHealthCheckConnectPort(_ctx.integerValue("DescribeLoadBalancerUDPListenerAttributeResponse.HealthCheckConnectPort"));
		describeLoadBalancerUDPListenerAttributeResponse.setDescription(_ctx.stringValue("DescribeLoadBalancerUDPListenerAttributeResponse.Description"));
		describeLoadBalancerUDPListenerAttributeResponse.setBandwidth(_ctx.integerValue("DescribeLoadBalancerUDPListenerAttributeResponse.Bandwidth"));
		describeLoadBalancerUDPListenerAttributeResponse.setHealthCheckType(_ctx.stringValue("DescribeLoadBalancerUDPListenerAttributeResponse.HealthCheckType"));
		describeLoadBalancerUDPListenerAttributeResponse.setMasterSlaveServerGroupId(_ctx.stringValue("DescribeLoadBalancerUDPListenerAttributeResponse.MasterSlaveServerGroupId"));
		describeLoadBalancerUDPListenerAttributeResponse.setBackendServerPort(_ctx.integerValue("DescribeLoadBalancerUDPListenerAttributeResponse.BackendServerPort"));
		describeLoadBalancerUDPListenerAttributeResponse.setAclStatus(_ctx.stringValue("DescribeLoadBalancerUDPListenerAttributeResponse.AclStatus"));
		describeLoadBalancerUDPListenerAttributeResponse.setHealthCheckDomain(_ctx.stringValue("DescribeLoadBalancerUDPListenerAttributeResponse.HealthCheckDomain"));
		describeLoadBalancerUDPListenerAttributeResponse.setUnhealthyThreshold(_ctx.integerValue("DescribeLoadBalancerUDPListenerAttributeResponse.UnhealthyThreshold"));
		describeLoadBalancerUDPListenerAttributeResponse.setMasterServerGroupId(_ctx.stringValue("DescribeLoadBalancerUDPListenerAttributeResponse.MasterServerGroupId"));
		describeLoadBalancerUDPListenerAttributeResponse.setHealthCheckHttpCode(_ctx.stringValue("DescribeLoadBalancerUDPListenerAttributeResponse.HealthCheckHttpCode"));
		describeLoadBalancerUDPListenerAttributeResponse.setMaxConnection(_ctx.integerValue("DescribeLoadBalancerUDPListenerAttributeResponse.MaxConnection"));
		describeLoadBalancerUDPListenerAttributeResponse.setProxyProtocolV2Enabled(_ctx.booleanValue("DescribeLoadBalancerUDPListenerAttributeResponse.ProxyProtocolV2Enabled"));
		describeLoadBalancerUDPListenerAttributeResponse.setSlaveServerGroupId(_ctx.stringValue("DescribeLoadBalancerUDPListenerAttributeResponse.SlaveServerGroupId"));
		describeLoadBalancerUDPListenerAttributeResponse.setPersistenceTimeout(_ctx.integerValue("DescribeLoadBalancerUDPListenerAttributeResponse.PersistenceTimeout"));
		describeLoadBalancerUDPListenerAttributeResponse.setListenerPort(_ctx.integerValue("DescribeLoadBalancerUDPListenerAttributeResponse.ListenerPort"));
		describeLoadBalancerUDPListenerAttributeResponse.setHealthCheckInterval(_ctx.integerValue("DescribeLoadBalancerUDPListenerAttributeResponse.HealthCheckInterval"));
		describeLoadBalancerUDPListenerAttributeResponse.setHealthCheckExp(_ctx.stringValue("DescribeLoadBalancerUDPListenerAttributeResponse.HealthCheckExp"));
		describeLoadBalancerUDPListenerAttributeResponse.setHealthCheckURI(_ctx.stringValue("DescribeLoadBalancerUDPListenerAttributeResponse.HealthCheckURI"));
		describeLoadBalancerUDPListenerAttributeResponse.setFailoverThreshold(_ctx.integerValue("DescribeLoadBalancerUDPListenerAttributeResponse.FailoverThreshold"));
		describeLoadBalancerUDPListenerAttributeResponse.setAclId(_ctx.stringValue("DescribeLoadBalancerUDPListenerAttributeResponse.AclId"));
		describeLoadBalancerUDPListenerAttributeResponse.setScheduler(_ctx.stringValue("DescribeLoadBalancerUDPListenerAttributeResponse.Scheduler"));
		describeLoadBalancerUDPListenerAttributeResponse.setVpcIds(_ctx.stringValue("DescribeLoadBalancerUDPListenerAttributeResponse.VpcIds"));
		describeLoadBalancerUDPListenerAttributeResponse.setHealthCheckConnectTimeout(_ctx.integerValue("DescribeLoadBalancerUDPListenerAttributeResponse.HealthCheckConnectTimeout"));
		describeLoadBalancerUDPListenerAttributeResponse.setMasterSlaveModeEnabled(_ctx.booleanValue("DescribeLoadBalancerUDPListenerAttributeResponse.MasterSlaveModeEnabled"));
		describeLoadBalancerUDPListenerAttributeResponse.setHealthyThreshold(_ctx.integerValue("DescribeLoadBalancerUDPListenerAttributeResponse.HealthyThreshold"));
		describeLoadBalancerUDPListenerAttributeResponse.setConnectionDrain(_ctx.stringValue("DescribeLoadBalancerUDPListenerAttributeResponse.ConnectionDrain"));
		describeLoadBalancerUDPListenerAttributeResponse.setHealthCheckReq(_ctx.stringValue("DescribeLoadBalancerUDPListenerAttributeResponse.HealthCheckReq"));
		describeLoadBalancerUDPListenerAttributeResponse.setHealthCheckMethod(_ctx.stringValue("DescribeLoadBalancerUDPListenerAttributeResponse.HealthCheckMethod"));
		describeLoadBalancerUDPListenerAttributeResponse.setHealthCheck(_ctx.stringValue("DescribeLoadBalancerUDPListenerAttributeResponse.HealthCheck"));

		List<String> aclIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLoadBalancerUDPListenerAttributeResponse.AclIds.Length"); i++) {
			aclIds.add(_ctx.stringValue("DescribeLoadBalancerUDPListenerAttributeResponse.AclIds["+ i +"]"));
		}
		describeLoadBalancerUDPListenerAttributeResponse.setAclIds(aclIds);

		List<PortRange> portRanges = new ArrayList<PortRange>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLoadBalancerUDPListenerAttributeResponse.PortRanges.Length"); i++) {
			PortRange portRange = new PortRange();
			portRange.setStartPort(_ctx.integerValue("DescribeLoadBalancerUDPListenerAttributeResponse.PortRanges["+ i +"].StartPort"));
			portRange.setEndPort(_ctx.integerValue("DescribeLoadBalancerUDPListenerAttributeResponse.PortRanges["+ i +"].EndPort"));

			portRanges.add(portRange);
		}
		describeLoadBalancerUDPListenerAttributeResponse.setPortRanges(portRanges);
	 
	 	return describeLoadBalancerUDPListenerAttributeResponse;
	}
}