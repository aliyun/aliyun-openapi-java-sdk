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
import com.aliyuncs.slb.model.v20140515.DescribeLoadBalancerTCPListenerAttributeResponse.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLoadBalancerTCPListenerAttributeResponseUnmarshaller {

	public static DescribeLoadBalancerTCPListenerAttributeResponse unmarshall(DescribeLoadBalancerTCPListenerAttributeResponse describeLoadBalancerTCPListenerAttributeResponse, UnmarshallerContext _ctx) {
		
		describeLoadBalancerTCPListenerAttributeResponse.setRequestId(_ctx.stringValue("DescribeLoadBalancerTCPListenerAttributeResponse.RequestId"));
		describeLoadBalancerTCPListenerAttributeResponse.setVServerGroupId(_ctx.stringValue("DescribeLoadBalancerTCPListenerAttributeResponse.VServerGroupId"));
		describeLoadBalancerTCPListenerAttributeResponse.setStatus(_ctx.stringValue("DescribeLoadBalancerTCPListenerAttributeResponse.Status"));
		describeLoadBalancerTCPListenerAttributeResponse.setAclType(_ctx.stringValue("DescribeLoadBalancerTCPListenerAttributeResponse.AclType"));
		describeLoadBalancerTCPListenerAttributeResponse.setConnectionDrainTimeout(_ctx.integerValue("DescribeLoadBalancerTCPListenerAttributeResponse.ConnectionDrainTimeout"));
		describeLoadBalancerTCPListenerAttributeResponse.setFailoverStrategy(_ctx.stringValue("DescribeLoadBalancerTCPListenerAttributeResponse.FailoverStrategy"));
		describeLoadBalancerTCPListenerAttributeResponse.setWorkingServerGroupId(_ctx.stringValue("DescribeLoadBalancerTCPListenerAttributeResponse.WorkingServerGroupId"));
		describeLoadBalancerTCPListenerAttributeResponse.setHealthCheckTcpFastCloseEnabled(_ctx.booleanValue("DescribeLoadBalancerTCPListenerAttributeResponse.HealthCheckTcpFastCloseEnabled"));
		describeLoadBalancerTCPListenerAttributeResponse.setFullNatEnabled(_ctx.booleanValue("DescribeLoadBalancerTCPListenerAttributeResponse.FullNatEnabled"));
		describeLoadBalancerTCPListenerAttributeResponse.setServiceManagedMode(_ctx.stringValue("DescribeLoadBalancerTCPListenerAttributeResponse.ServiceManagedMode"));
		describeLoadBalancerTCPListenerAttributeResponse.setHealthCheckConnectPort(_ctx.integerValue("DescribeLoadBalancerTCPListenerAttributeResponse.HealthCheckConnectPort"));
		describeLoadBalancerTCPListenerAttributeResponse.setDescription(_ctx.stringValue("DescribeLoadBalancerTCPListenerAttributeResponse.Description"));
		describeLoadBalancerTCPListenerAttributeResponse.setBandwidth(_ctx.integerValue("DescribeLoadBalancerTCPListenerAttributeResponse.Bandwidth"));
		describeLoadBalancerTCPListenerAttributeResponse.setHealthCheckType(_ctx.stringValue("DescribeLoadBalancerTCPListenerAttributeResponse.HealthCheckType"));
		describeLoadBalancerTCPListenerAttributeResponse.setMasterSlaveServerGroupId(_ctx.stringValue("DescribeLoadBalancerTCPListenerAttributeResponse.MasterSlaveServerGroupId"));
		describeLoadBalancerTCPListenerAttributeResponse.setBackendServerPort(_ctx.integerValue("DescribeLoadBalancerTCPListenerAttributeResponse.BackendServerPort"));
		describeLoadBalancerTCPListenerAttributeResponse.setAclStatus(_ctx.stringValue("DescribeLoadBalancerTCPListenerAttributeResponse.AclStatus"));
		describeLoadBalancerTCPListenerAttributeResponse.setHealthCheckDomain(_ctx.stringValue("DescribeLoadBalancerTCPListenerAttributeResponse.HealthCheckDomain"));
		describeLoadBalancerTCPListenerAttributeResponse.setUnhealthyThreshold(_ctx.integerValue("DescribeLoadBalancerTCPListenerAttributeResponse.UnhealthyThreshold"));
		describeLoadBalancerTCPListenerAttributeResponse.setMasterServerGroupId(_ctx.stringValue("DescribeLoadBalancerTCPListenerAttributeResponse.MasterServerGroupId"));
		describeLoadBalancerTCPListenerAttributeResponse.setHealthCheckHttpCode(_ctx.stringValue("DescribeLoadBalancerTCPListenerAttributeResponse.HealthCheckHttpCode"));
		describeLoadBalancerTCPListenerAttributeResponse.setMaxConnection(_ctx.integerValue("DescribeLoadBalancerTCPListenerAttributeResponse.MaxConnection"));
		describeLoadBalancerTCPListenerAttributeResponse.setProxyProtocolV2Enabled(_ctx.booleanValue("DescribeLoadBalancerTCPListenerAttributeResponse.ProxyProtocolV2Enabled"));
		describeLoadBalancerTCPListenerAttributeResponse.setSlaveServerGroupId(_ctx.stringValue("DescribeLoadBalancerTCPListenerAttributeResponse.SlaveServerGroupId"));
		describeLoadBalancerTCPListenerAttributeResponse.setPersistenceTimeout(_ctx.integerValue("DescribeLoadBalancerTCPListenerAttributeResponse.PersistenceTimeout"));
		describeLoadBalancerTCPListenerAttributeResponse.setListenerPort(_ctx.integerValue("DescribeLoadBalancerTCPListenerAttributeResponse.ListenerPort"));
		describeLoadBalancerTCPListenerAttributeResponse.setHealthCheckInterval(_ctx.integerValue("DescribeLoadBalancerTCPListenerAttributeResponse.HealthCheckInterval"));
		describeLoadBalancerTCPListenerAttributeResponse.setHealthCheckURI(_ctx.stringValue("DescribeLoadBalancerTCPListenerAttributeResponse.HealthCheckURI"));
		describeLoadBalancerTCPListenerAttributeResponse.setFailoverThreshold(_ctx.integerValue("DescribeLoadBalancerTCPListenerAttributeResponse.FailoverThreshold"));
		describeLoadBalancerTCPListenerAttributeResponse.setAclId(_ctx.stringValue("DescribeLoadBalancerTCPListenerAttributeResponse.AclId"));
		describeLoadBalancerTCPListenerAttributeResponse.setSynProxy(_ctx.stringValue("DescribeLoadBalancerTCPListenerAttributeResponse.SynProxy"));
		describeLoadBalancerTCPListenerAttributeResponse.setScheduler(_ctx.stringValue("DescribeLoadBalancerTCPListenerAttributeResponse.Scheduler"));
		describeLoadBalancerTCPListenerAttributeResponse.setEstablishedTimeout(_ctx.integerValue("DescribeLoadBalancerTCPListenerAttributeResponse.EstablishedTimeout"));
		describeLoadBalancerTCPListenerAttributeResponse.setVpcIds(_ctx.stringValue("DescribeLoadBalancerTCPListenerAttributeResponse.VpcIds"));
		describeLoadBalancerTCPListenerAttributeResponse.setHealthCheckConnectTimeout(_ctx.integerValue("DescribeLoadBalancerTCPListenerAttributeResponse.HealthCheckConnectTimeout"));
		describeLoadBalancerTCPListenerAttributeResponse.setMasterSlaveModeEnabled(_ctx.booleanValue("DescribeLoadBalancerTCPListenerAttributeResponse.MasterSlaveModeEnabled"));
		describeLoadBalancerTCPListenerAttributeResponse.setHealthyThreshold(_ctx.integerValue("DescribeLoadBalancerTCPListenerAttributeResponse.HealthyThreshold"));
		describeLoadBalancerTCPListenerAttributeResponse.setConnectionDrain(_ctx.stringValue("DescribeLoadBalancerTCPListenerAttributeResponse.ConnectionDrain"));
		describeLoadBalancerTCPListenerAttributeResponse.setHealthCheckMethod(_ctx.stringValue("DescribeLoadBalancerTCPListenerAttributeResponse.HealthCheckMethod"));
		describeLoadBalancerTCPListenerAttributeResponse.setHealthCheck(_ctx.stringValue("DescribeLoadBalancerTCPListenerAttributeResponse.HealthCheck"));
		describeLoadBalancerTCPListenerAttributeResponse.setLoadBalancerId(_ctx.stringValue("DescribeLoadBalancerTCPListenerAttributeResponse.LoadBalancerId"));

		List<String> aclIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLoadBalancerTCPListenerAttributeResponse.AclIds.Length"); i++) {
			aclIds.add(_ctx.stringValue("DescribeLoadBalancerTCPListenerAttributeResponse.AclIds["+ i +"]"));
		}
		describeLoadBalancerTCPListenerAttributeResponse.setAclIds(aclIds);

		List<PortRange> portRanges = new ArrayList<PortRange>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLoadBalancerTCPListenerAttributeResponse.PortRanges.Length"); i++) {
			PortRange portRange = new PortRange();
			portRange.setStartPort(_ctx.integerValue("DescribeLoadBalancerTCPListenerAttributeResponse.PortRanges["+ i +"].StartPort"));
			portRange.setEndPort(_ctx.integerValue("DescribeLoadBalancerTCPListenerAttributeResponse.PortRanges["+ i +"].EndPort"));

			portRanges.add(portRange);
		}
		describeLoadBalancerTCPListenerAttributeResponse.setPortRanges(portRanges);

		List<Tag> tags = new ArrayList<Tag>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLoadBalancerTCPListenerAttributeResponse.Tags.Length"); i++) {
			Tag tag = new Tag();
			tag.setTagKey(_ctx.stringValue("DescribeLoadBalancerTCPListenerAttributeResponse.Tags["+ i +"].TagKey"));
			tag.setTagValue(_ctx.stringValue("DescribeLoadBalancerTCPListenerAttributeResponse.Tags["+ i +"].TagValue"));

			tags.add(tag);
		}
		describeLoadBalancerTCPListenerAttributeResponse.setTags(tags);
	 
	 	return describeLoadBalancerTCPListenerAttributeResponse;
	}
}