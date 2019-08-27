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

	public static DescribeLoadBalancerUDPListenerAttributeResponse unmarshall(DescribeLoadBalancerUDPListenerAttributeResponse describeLoadBalancerUDPListenerAttributeResponse, UnmarshallerContext _ctx) {
		
		describeLoadBalancerUDPListenerAttributeResponse.setRequestId(_ctx.stringValue("DescribeLoadBalancerUDPListenerAttributeResponse.RequestId"));
		describeLoadBalancerUDPListenerAttributeResponse.setListenerPort(_ctx.integerValue("DescribeLoadBalancerUDPListenerAttributeResponse.ListenerPort"));
		describeLoadBalancerUDPListenerAttributeResponse.setBackendServerPort(_ctx.integerValue("DescribeLoadBalancerUDPListenerAttributeResponse.BackendServerPort"));
		describeLoadBalancerUDPListenerAttributeResponse.setStatus(_ctx.stringValue("DescribeLoadBalancerUDPListenerAttributeResponse.Status"));
		describeLoadBalancerUDPListenerAttributeResponse.setBandwidth(_ctx.integerValue("DescribeLoadBalancerUDPListenerAttributeResponse.Bandwidth"));
		describeLoadBalancerUDPListenerAttributeResponse.setScheduler(_ctx.stringValue("DescribeLoadBalancerUDPListenerAttributeResponse.Scheduler"));
		describeLoadBalancerUDPListenerAttributeResponse.setPersistenceTimeout(_ctx.integerValue("DescribeLoadBalancerUDPListenerAttributeResponse.PersistenceTimeout"));
		describeLoadBalancerUDPListenerAttributeResponse.setHealthCheck(_ctx.stringValue("DescribeLoadBalancerUDPListenerAttributeResponse.HealthCheck"));
		describeLoadBalancerUDPListenerAttributeResponse.setHealthyThreshold(_ctx.integerValue("DescribeLoadBalancerUDPListenerAttributeResponse.HealthyThreshold"));
		describeLoadBalancerUDPListenerAttributeResponse.setUnhealthyThreshold(_ctx.integerValue("DescribeLoadBalancerUDPListenerAttributeResponse.UnhealthyThreshold"));
		describeLoadBalancerUDPListenerAttributeResponse.setHealthCheckConnectTimeout(_ctx.integerValue("DescribeLoadBalancerUDPListenerAttributeResponse.HealthCheckConnectTimeout"));
		describeLoadBalancerUDPListenerAttributeResponse.setHealthCheckConnectPort(_ctx.integerValue("DescribeLoadBalancerUDPListenerAttributeResponse.HealthCheckConnectPort"));
		describeLoadBalancerUDPListenerAttributeResponse.setHealthCheckInterval(_ctx.integerValue("DescribeLoadBalancerUDPListenerAttributeResponse.HealthCheckInterval"));
		describeLoadBalancerUDPListenerAttributeResponse.setHealthCheckReq(_ctx.stringValue("DescribeLoadBalancerUDPListenerAttributeResponse.HealthCheckReq"));
		describeLoadBalancerUDPListenerAttributeResponse.setHealthCheckExp(_ctx.stringValue("DescribeLoadBalancerUDPListenerAttributeResponse.HealthCheckExp"));
		describeLoadBalancerUDPListenerAttributeResponse.setMaxConnection(_ctx.integerValue("DescribeLoadBalancerUDPListenerAttributeResponse.MaxConnection"));
		describeLoadBalancerUDPListenerAttributeResponse.setVServerGroupId(_ctx.stringValue("DescribeLoadBalancerUDPListenerAttributeResponse.VServerGroupId"));
		describeLoadBalancerUDPListenerAttributeResponse.setMasterSlaveServerGroupId(_ctx.stringValue("DescribeLoadBalancerUDPListenerAttributeResponse.MasterSlaveServerGroupId"));
		describeLoadBalancerUDPListenerAttributeResponse.setAclId(_ctx.stringValue("DescribeLoadBalancerUDPListenerAttributeResponse.AclId"));
		describeLoadBalancerUDPListenerAttributeResponse.setAclType(_ctx.stringValue("DescribeLoadBalancerUDPListenerAttributeResponse.AclType"));
		describeLoadBalancerUDPListenerAttributeResponse.setAclStatus(_ctx.stringValue("DescribeLoadBalancerUDPListenerAttributeResponse.AclStatus"));
		describeLoadBalancerUDPListenerAttributeResponse.setVpcIds(_ctx.stringValue("DescribeLoadBalancerUDPListenerAttributeResponse.VpcIds"));
		describeLoadBalancerUDPListenerAttributeResponse.setDescription(_ctx.stringValue("DescribeLoadBalancerUDPListenerAttributeResponse.Description"));
	 
	 	return describeLoadBalancerUDPListenerAttributeResponse;
	}
}