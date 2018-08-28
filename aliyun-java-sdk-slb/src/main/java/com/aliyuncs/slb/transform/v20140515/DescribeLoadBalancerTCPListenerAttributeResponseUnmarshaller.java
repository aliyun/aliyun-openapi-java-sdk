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

import com.aliyuncs.slb.model.v20140515.DescribeLoadBalancerTCPListenerAttributeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLoadBalancerTCPListenerAttributeResponseUnmarshaller {

	public static DescribeLoadBalancerTCPListenerAttributeResponse unmarshall(DescribeLoadBalancerTCPListenerAttributeResponse describeLoadBalancerTCPListenerAttributeResponse, UnmarshallerContext context) {
		
		describeLoadBalancerTCPListenerAttributeResponse.setRequestId(context.stringValue("DescribeLoadBalancerTCPListenerAttributeResponse.RequestId"));
		describeLoadBalancerTCPListenerAttributeResponse.setListenerPort(context.integerValue("DescribeLoadBalancerTCPListenerAttributeResponse.ListenerPort"));
		describeLoadBalancerTCPListenerAttributeResponse.setBackendServerPort(context.integerValue("DescribeLoadBalancerTCPListenerAttributeResponse.BackendServerPort"));
		describeLoadBalancerTCPListenerAttributeResponse.setStatus(context.stringValue("DescribeLoadBalancerTCPListenerAttributeResponse.Status"));
		describeLoadBalancerTCPListenerAttributeResponse.setBandwidth(context.integerValue("DescribeLoadBalancerTCPListenerAttributeResponse.Bandwidth"));
		describeLoadBalancerTCPListenerAttributeResponse.setScheduler(context.stringValue("DescribeLoadBalancerTCPListenerAttributeResponse.Scheduler"));
		describeLoadBalancerTCPListenerAttributeResponse.setSynProxy(context.stringValue("DescribeLoadBalancerTCPListenerAttributeResponse.SynProxy"));
		describeLoadBalancerTCPListenerAttributeResponse.setPersistenceTimeout(context.integerValue("DescribeLoadBalancerTCPListenerAttributeResponse.PersistenceTimeout"));
		describeLoadBalancerTCPListenerAttributeResponse.setEstablishedTimeout(context.integerValue("DescribeLoadBalancerTCPListenerAttributeResponse.EstablishedTimeout"));
		describeLoadBalancerTCPListenerAttributeResponse.setHealthCheck(context.stringValue("DescribeLoadBalancerTCPListenerAttributeResponse.HealthCheck"));
		describeLoadBalancerTCPListenerAttributeResponse.setHealthyThreshold(context.integerValue("DescribeLoadBalancerTCPListenerAttributeResponse.HealthyThreshold"));
		describeLoadBalancerTCPListenerAttributeResponse.setUnhealthyThreshold(context.integerValue("DescribeLoadBalancerTCPListenerAttributeResponse.UnhealthyThreshold"));
		describeLoadBalancerTCPListenerAttributeResponse.setHealthCheckConnectTimeout(context.integerValue("DescribeLoadBalancerTCPListenerAttributeResponse.HealthCheckConnectTimeout"));
		describeLoadBalancerTCPListenerAttributeResponse.setHealthCheckConnectPort(context.integerValue("DescribeLoadBalancerTCPListenerAttributeResponse.HealthCheckConnectPort"));
		describeLoadBalancerTCPListenerAttributeResponse.setHealthCheckInterval(context.integerValue("DescribeLoadBalancerTCPListenerAttributeResponse.HealthCheckInterval"));
		describeLoadBalancerTCPListenerAttributeResponse.setHealthCheckHttpCode(context.stringValue("DescribeLoadBalancerTCPListenerAttributeResponse.HealthCheckHttpCode"));
		describeLoadBalancerTCPListenerAttributeResponse.setHealthCheckDomain(context.stringValue("DescribeLoadBalancerTCPListenerAttributeResponse.HealthCheckDomain"));
		describeLoadBalancerTCPListenerAttributeResponse.setHealthCheckURI(context.stringValue("DescribeLoadBalancerTCPListenerAttributeResponse.HealthCheckURI"));
		describeLoadBalancerTCPListenerAttributeResponse.setHealthCheckType(context.stringValue("DescribeLoadBalancerTCPListenerAttributeResponse.HealthCheckType"));
		describeLoadBalancerTCPListenerAttributeResponse.setMaxConnection(context.integerValue("DescribeLoadBalancerTCPListenerAttributeResponse.MaxConnection"));
		describeLoadBalancerTCPListenerAttributeResponse.setVServerGroupId(context.stringValue("DescribeLoadBalancerTCPListenerAttributeResponse.VServerGroupId"));
		describeLoadBalancerTCPListenerAttributeResponse.setMasterSlaveServerGroupId(context.stringValue("DescribeLoadBalancerTCPListenerAttributeResponse.MasterSlaveServerGroupId"));
		describeLoadBalancerTCPListenerAttributeResponse.setAclId(context.stringValue("DescribeLoadBalancerTCPListenerAttributeResponse.AclId"));
		describeLoadBalancerTCPListenerAttributeResponse.setAclType(context.stringValue("DescribeLoadBalancerTCPListenerAttributeResponse.AclType"));
		describeLoadBalancerTCPListenerAttributeResponse.setAclStatus(context.stringValue("DescribeLoadBalancerTCPListenerAttributeResponse.AclStatus"));
		describeLoadBalancerTCPListenerAttributeResponse.setVpcIds(context.stringValue("DescribeLoadBalancerTCPListenerAttributeResponse.VpcIds"));
		describeLoadBalancerTCPListenerAttributeResponse.setDescription(context.stringValue("DescribeLoadBalancerTCPListenerAttributeResponse.Description"));
	 
	 	return describeLoadBalancerTCPListenerAttributeResponse;
	}
}