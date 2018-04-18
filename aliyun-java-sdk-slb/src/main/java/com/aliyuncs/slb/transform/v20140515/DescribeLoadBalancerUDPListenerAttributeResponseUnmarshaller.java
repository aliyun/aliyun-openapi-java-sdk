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

import com.aliyuncs.slb.model.v20140515.DescribeLoadBalancerUDPListenerAttributeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLoadBalancerUDPListenerAttributeResponseUnmarshaller {

	public static DescribeLoadBalancerUDPListenerAttributeResponse unmarshall(DescribeLoadBalancerUDPListenerAttributeResponse describeLoadBalancerUDPListenerAttributeResponse, UnmarshallerContext context) {
		
		describeLoadBalancerUDPListenerAttributeResponse.setRequestId(context.stringValue("DescribeLoadBalancerUDPListenerAttributeResponse.RequestId"));
		describeLoadBalancerUDPListenerAttributeResponse.setListenerPort(context.integerValue("DescribeLoadBalancerUDPListenerAttributeResponse.ListenerPort"));
		describeLoadBalancerUDPListenerAttributeResponse.setBackendServerPort(context.integerValue("DescribeLoadBalancerUDPListenerAttributeResponse.BackendServerPort"));
		describeLoadBalancerUDPListenerAttributeResponse.setStatus(context.stringValue("DescribeLoadBalancerUDPListenerAttributeResponse.Status"));
		describeLoadBalancerUDPListenerAttributeResponse.setBandwidth(context.integerValue("DescribeLoadBalancerUDPListenerAttributeResponse.Bandwidth"));
		describeLoadBalancerUDPListenerAttributeResponse.setScheduler(context.stringValue("DescribeLoadBalancerUDPListenerAttributeResponse.Scheduler"));
		describeLoadBalancerUDPListenerAttributeResponse.setPersistenceTimeout(context.integerValue("DescribeLoadBalancerUDPListenerAttributeResponse.PersistenceTimeout"));
		describeLoadBalancerUDPListenerAttributeResponse.setHealthCheck(context.stringValue("DescribeLoadBalancerUDPListenerAttributeResponse.HealthCheck"));
		describeLoadBalancerUDPListenerAttributeResponse.setHealthyThreshold(context.integerValue("DescribeLoadBalancerUDPListenerAttributeResponse.HealthyThreshold"));
		describeLoadBalancerUDPListenerAttributeResponse.setUnhealthyThreshold(context.integerValue("DescribeLoadBalancerUDPListenerAttributeResponse.UnhealthyThreshold"));
		describeLoadBalancerUDPListenerAttributeResponse.setHealthCheckConnectTimeout(context.integerValue("DescribeLoadBalancerUDPListenerAttributeResponse.HealthCheckConnectTimeout"));
		describeLoadBalancerUDPListenerAttributeResponse.setHealthCheckConnectPort(context.integerValue("DescribeLoadBalancerUDPListenerAttributeResponse.HealthCheckConnectPort"));
		describeLoadBalancerUDPListenerAttributeResponse.setHealthCheckInterval(context.integerValue("DescribeLoadBalancerUDPListenerAttributeResponse.HealthCheckInterval"));
		describeLoadBalancerUDPListenerAttributeResponse.setHealthCheckReq(context.stringValue("DescribeLoadBalancerUDPListenerAttributeResponse.HealthCheckReq"));
		describeLoadBalancerUDPListenerAttributeResponse.setHealthCheckExp(context.stringValue("DescribeLoadBalancerUDPListenerAttributeResponse.HealthCheckExp"));
		describeLoadBalancerUDPListenerAttributeResponse.setMaxConnection(context.integerValue("DescribeLoadBalancerUDPListenerAttributeResponse.MaxConnection"));
		describeLoadBalancerUDPListenerAttributeResponse.setVServerGroupId(context.stringValue("DescribeLoadBalancerUDPListenerAttributeResponse.VServerGroupId"));
		describeLoadBalancerUDPListenerAttributeResponse.setMasterSlaveServerGroupId(context.stringValue("DescribeLoadBalancerUDPListenerAttributeResponse.MasterSlaveServerGroupId"));
		describeLoadBalancerUDPListenerAttributeResponse.setAclId(context.stringValue("DescribeLoadBalancerUDPListenerAttributeResponse.AclId"));
		describeLoadBalancerUDPListenerAttributeResponse.setAclType(context.stringValue("DescribeLoadBalancerUDPListenerAttributeResponse.AclType"));
		describeLoadBalancerUDPListenerAttributeResponse.setAclStatus(context.stringValue("DescribeLoadBalancerUDPListenerAttributeResponse.AclStatus"));
		describeLoadBalancerUDPListenerAttributeResponse.setVpcIds(context.stringValue("DescribeLoadBalancerUDPListenerAttributeResponse.VpcIds"));
	 
	 	return describeLoadBalancerUDPListenerAttributeResponse;
	}
}