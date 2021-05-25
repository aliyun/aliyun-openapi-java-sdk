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

package com.aliyuncs.ens.transform.v20171110;

import com.aliyuncs.ens.model.v20171110.DescribeLoadBalancerHTTPSListenerAttributeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLoadBalancerHTTPSListenerAttributeResponseUnmarshaller {

	public static DescribeLoadBalancerHTTPSListenerAttributeResponse unmarshall(DescribeLoadBalancerHTTPSListenerAttributeResponse describeLoadBalancerHTTPSListenerAttributeResponse, UnmarshallerContext _ctx) {
		
		describeLoadBalancerHTTPSListenerAttributeResponse.setRequestId(_ctx.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.RequestId"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setListenerPort(_ctx.integerValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.ListenerPort"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setStatus(_ctx.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.Status"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setBandwidth(_ctx.integerValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.Bandwidth"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setScheduler(_ctx.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.Scheduler"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setStickySession(_ctx.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.StickySession"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setStickySessionType(_ctx.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.StickySessionType"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setCookieTimeout(_ctx.integerValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.CookieTimeout"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setCookie(_ctx.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.Cookie"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setHealthCheck(_ctx.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.HealthCheck"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setHealthyThreshold(_ctx.integerValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.HealthyThreshold"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setUnhealthyThreshold(_ctx.integerValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.UnhealthyThreshold"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setHealthCheckTimeout(_ctx.integerValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.HealthCheckTimeout"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setHealthCheckConnectPort(_ctx.integerValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.HealthCheckConnectPort"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setHealthCheckInterval(_ctx.integerValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.HealthCheckInterval"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setDescription(_ctx.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.Description"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setListenerForward(_ctx.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.ListenerForward"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setForwardPort(_ctx.integerValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.ForwardPort"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setRequestTimeout(_ctx.integerValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.RequestTimeout"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setIdleTimeout(_ctx.integerValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.IdleTimeout"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setHealthCheckHttpCode(_ctx.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.HealthCheckHttpCode"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setHealthCheckDomain(_ctx.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.HealthCheckDomain"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setHealthCheckURI(_ctx.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.HealthCheckURI"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setServerCertificateId(_ctx.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.ServerCertificateId"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setHealthCheckMethod(_ctx.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.HealthCheckMethod"));
	 
	 	return describeLoadBalancerHTTPSListenerAttributeResponse;
	}
}