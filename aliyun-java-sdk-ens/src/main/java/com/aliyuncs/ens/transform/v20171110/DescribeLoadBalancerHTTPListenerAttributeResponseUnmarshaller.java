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

import com.aliyuncs.ens.model.v20171110.DescribeLoadBalancerHTTPListenerAttributeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLoadBalancerHTTPListenerAttributeResponseUnmarshaller {

	public static DescribeLoadBalancerHTTPListenerAttributeResponse unmarshall(DescribeLoadBalancerHTTPListenerAttributeResponse describeLoadBalancerHTTPListenerAttributeResponse, UnmarshallerContext _ctx) {
		
		describeLoadBalancerHTTPListenerAttributeResponse.setRequestId(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.RequestId"));
		describeLoadBalancerHTTPListenerAttributeResponse.setListenerPort(_ctx.integerValue("DescribeLoadBalancerHTTPListenerAttributeResponse.ListenerPort"));
		describeLoadBalancerHTTPListenerAttributeResponse.setStatus(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.Status"));
		describeLoadBalancerHTTPListenerAttributeResponse.setBandwidth(_ctx.integerValue("DescribeLoadBalancerHTTPListenerAttributeResponse.Bandwidth"));
		describeLoadBalancerHTTPListenerAttributeResponse.setScheduler(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.Scheduler"));
		describeLoadBalancerHTTPListenerAttributeResponse.setStickySession(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.StickySession"));
		describeLoadBalancerHTTPListenerAttributeResponse.setStickySessionType(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.StickySessionType"));
		describeLoadBalancerHTTPListenerAttributeResponse.setCookieTimeout(_ctx.integerValue("DescribeLoadBalancerHTTPListenerAttributeResponse.CookieTimeout"));
		describeLoadBalancerHTTPListenerAttributeResponse.setCookie(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.Cookie"));
		describeLoadBalancerHTTPListenerAttributeResponse.setHealthCheck(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.HealthCheck"));
		describeLoadBalancerHTTPListenerAttributeResponse.setHealthyThreshold(_ctx.integerValue("DescribeLoadBalancerHTTPListenerAttributeResponse.HealthyThreshold"));
		describeLoadBalancerHTTPListenerAttributeResponse.setUnhealthyThreshold(_ctx.integerValue("DescribeLoadBalancerHTTPListenerAttributeResponse.UnhealthyThreshold"));
		describeLoadBalancerHTTPListenerAttributeResponse.setHealthCheckTimeout(_ctx.integerValue("DescribeLoadBalancerHTTPListenerAttributeResponse.HealthCheckTimeout"));
		describeLoadBalancerHTTPListenerAttributeResponse.setHealthCheckConnectPort(_ctx.integerValue("DescribeLoadBalancerHTTPListenerAttributeResponse.HealthCheckConnectPort"));
		describeLoadBalancerHTTPListenerAttributeResponse.setHealthCheckInterval(_ctx.integerValue("DescribeLoadBalancerHTTPListenerAttributeResponse.HealthCheckInterval"));
		describeLoadBalancerHTTPListenerAttributeResponse.setDescription(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.Description"));
		describeLoadBalancerHTTPListenerAttributeResponse.setListenerForward(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.ListenerForward"));
		describeLoadBalancerHTTPListenerAttributeResponse.setForwardPort(_ctx.integerValue("DescribeLoadBalancerHTTPListenerAttributeResponse.ForwardPort"));
		describeLoadBalancerHTTPListenerAttributeResponse.setRequestTimeout(_ctx.integerValue("DescribeLoadBalancerHTTPListenerAttributeResponse.RequestTimeout"));
		describeLoadBalancerHTTPListenerAttributeResponse.setIdleTimeout(_ctx.integerValue("DescribeLoadBalancerHTTPListenerAttributeResponse.IdleTimeout"));
		describeLoadBalancerHTTPListenerAttributeResponse.setHealthCheckHttpCode(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.HealthCheckHttpCode"));
		describeLoadBalancerHTTPListenerAttributeResponse.setHealthCheckDomain(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.HealthCheckDomain"));
		describeLoadBalancerHTTPListenerAttributeResponse.setHealthCheckURI(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.HealthCheckURI"));
		describeLoadBalancerHTTPListenerAttributeResponse.setServerCertificateId(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.ServerCertificateId"));
		describeLoadBalancerHTTPListenerAttributeResponse.setHealthCheckMethod(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.HealthCheckMethod"));
	 
	 	return describeLoadBalancerHTTPListenerAttributeResponse;
	}
}