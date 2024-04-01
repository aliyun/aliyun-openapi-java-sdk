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

package com.aliyuncs.slb.transform.v20130221;

import com.aliyuncs.slb.model.v20130221.DescribeLoadBalancerTCPListenerAttributeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLoadBalancerTCPListenerAttributeResponseUnmarshaller {

	public static DescribeLoadBalancerTCPListenerAttributeResponse unmarshall(DescribeLoadBalancerTCPListenerAttributeResponse describeLoadBalancerTCPListenerAttributeResponse, UnmarshallerContext _ctx) {
		
		describeLoadBalancerTCPListenerAttributeResponse.setRequestId(_ctx.stringValue("DescribeLoadBalancerTCPListenerAttributeResponse.RequestId"));
		describeLoadBalancerTCPListenerAttributeResponse.setVServerGroupId(_ctx.stringValue("DescribeLoadBalancerTCPListenerAttributeResponse.VServerGroupId"));
		describeLoadBalancerTCPListenerAttributeResponse.setHealthCheckHttpCode(_ctx.stringValue("DescribeLoadBalancerTCPListenerAttributeResponse.HealthCheckHttpCode"));
		describeLoadBalancerTCPListenerAttributeResponse.setConnectPort(_ctx.integerValue("DescribeLoadBalancerTCPListenerAttributeResponse.ConnectPort"));
		describeLoadBalancerTCPListenerAttributeResponse.setStatus(_ctx.stringValue("DescribeLoadBalancerTCPListenerAttributeResponse.Status"));
		describeLoadBalancerTCPListenerAttributeResponse.setMaxConnection(_ctx.integerValue("DescribeLoadBalancerTCPListenerAttributeResponse.MaxConnection"));
		describeLoadBalancerTCPListenerAttributeResponse.setPersistenceTimeout(_ctx.integerValue("DescribeLoadBalancerTCPListenerAttributeResponse.PersistenceTimeout"));
		describeLoadBalancerTCPListenerAttributeResponse.setListenerPort(_ctx.integerValue("DescribeLoadBalancerTCPListenerAttributeResponse.ListenerPort"));
		describeLoadBalancerTCPListenerAttributeResponse.setHealthCheckURI(_ctx.stringValue("DescribeLoadBalancerTCPListenerAttributeResponse.HealthCheckURI"));
		describeLoadBalancerTCPListenerAttributeResponse.setSynProxy(_ctx.stringValue("DescribeLoadBalancerTCPListenerAttributeResponse.SynProxy"));
		describeLoadBalancerTCPListenerAttributeResponse.setScheduler(_ctx.stringValue("DescribeLoadBalancerTCPListenerAttributeResponse.Scheduler"));
		describeLoadBalancerTCPListenerAttributeResponse.setInterval(_ctx.integerValue("DescribeLoadBalancerTCPListenerAttributeResponse.Interval"));
		describeLoadBalancerTCPListenerAttributeResponse.setBandwidth(_ctx.integerValue("DescribeLoadBalancerTCPListenerAttributeResponse.Bandwidth"));
		describeLoadBalancerTCPListenerAttributeResponse.setEstablishedTimeout(_ctx.integerValue("DescribeLoadBalancerTCPListenerAttributeResponse.EstablishedTimeout"));
		describeLoadBalancerTCPListenerAttributeResponse.setHealthCheckType(_ctx.stringValue("DescribeLoadBalancerTCPListenerAttributeResponse.HealthCheckType"));
		describeLoadBalancerTCPListenerAttributeResponse.setMasterSlaveServerGroupId(_ctx.stringValue("DescribeLoadBalancerTCPListenerAttributeResponse.MasterSlaveServerGroupId"));
		describeLoadBalancerTCPListenerAttributeResponse.setBackendServerPort(_ctx.integerValue("DescribeLoadBalancerTCPListenerAttributeResponse.BackendServerPort"));
		describeLoadBalancerTCPListenerAttributeResponse.setHealthyThreshold(_ctx.integerValue("DescribeLoadBalancerTCPListenerAttributeResponse.HealthyThreshold"));
		describeLoadBalancerTCPListenerAttributeResponse.setHealthCheckDomain(_ctx.stringValue("DescribeLoadBalancerTCPListenerAttributeResponse.HealthCheckDomain"));
		describeLoadBalancerTCPListenerAttributeResponse.setUnhealthyThreshold(_ctx.integerValue("DescribeLoadBalancerTCPListenerAttributeResponse.UnhealthyThreshold"));
		describeLoadBalancerTCPListenerAttributeResponse.setConnectTimeout(_ctx.integerValue("DescribeLoadBalancerTCPListenerAttributeResponse.ConnectTimeout"));
		describeLoadBalancerTCPListenerAttributeResponse.setHealthCheck(_ctx.stringValue("DescribeLoadBalancerTCPListenerAttributeResponse.HealthCheck"));
	 
	 	return describeLoadBalancerTCPListenerAttributeResponse;
	}
}