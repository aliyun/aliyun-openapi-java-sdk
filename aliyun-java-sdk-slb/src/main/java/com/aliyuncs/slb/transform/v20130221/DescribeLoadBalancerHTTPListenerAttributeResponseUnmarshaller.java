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

import com.aliyuncs.slb.model.v20130221.DescribeLoadBalancerHTTPListenerAttributeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLoadBalancerHTTPListenerAttributeResponseUnmarshaller {

	public static DescribeLoadBalancerHTTPListenerAttributeResponse unmarshall(DescribeLoadBalancerHTTPListenerAttributeResponse describeLoadBalancerHTTPListenerAttributeResponse, UnmarshallerContext _ctx) {
		
		describeLoadBalancerHTTPListenerAttributeResponse.setRequestId(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.RequestId"));
		describeLoadBalancerHTTPListenerAttributeResponse.setStatus(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.Status"));
		describeLoadBalancerHTTPListenerAttributeResponse.setVServerGroupId(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.VServerGroupId"));
		describeLoadBalancerHTTPListenerAttributeResponse.setCookie(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.Cookie"));
		describeLoadBalancerHTTPListenerAttributeResponse.setGzip(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.Gzip"));
		describeLoadBalancerHTTPListenerAttributeResponse.setHealthCheckConnectPort(_ctx.integerValue("DescribeLoadBalancerHTTPListenerAttributeResponse.HealthCheckConnectPort"));
		describeLoadBalancerHTTPListenerAttributeResponse.setBandwidth(_ctx.integerValue("DescribeLoadBalancerHTTPListenerAttributeResponse.Bandwidth"));
		describeLoadBalancerHTTPListenerAttributeResponse.setHealthCheckTimeout(_ctx.integerValue("DescribeLoadBalancerHTTPListenerAttributeResponse.HealthCheckTimeout"));
		describeLoadBalancerHTTPListenerAttributeResponse.setBackendServerPort(_ctx.integerValue("DescribeLoadBalancerHTTPListenerAttributeResponse.BackendServerPort"));
		describeLoadBalancerHTTPListenerAttributeResponse.setCookieTimeout(_ctx.integerValue("DescribeLoadBalancerHTTPListenerAttributeResponse.CookieTimeout"));
		describeLoadBalancerHTTPListenerAttributeResponse.setURI(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.URI"));
		describeLoadBalancerHTTPListenerAttributeResponse.setUnhealthyThreshold(_ctx.integerValue("DescribeLoadBalancerHTTPListenerAttributeResponse.UnhealthyThreshold"));
		describeLoadBalancerHTTPListenerAttributeResponse.setXForwardedFor_SLBID(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.XForwardedFor_SLBID"));
		describeLoadBalancerHTTPListenerAttributeResponse.setSecurityStatus(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.SecurityStatus"));
		describeLoadBalancerHTTPListenerAttributeResponse.setHealthCheckHttpCode(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.HealthCheckHttpCode"));
		describeLoadBalancerHTTPListenerAttributeResponse.setDomain(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.Domain"));
		describeLoadBalancerHTTPListenerAttributeResponse.setMaxConnection(_ctx.integerValue("DescribeLoadBalancerHTTPListenerAttributeResponse.MaxConnection"));
		describeLoadBalancerHTTPListenerAttributeResponse.setXForwardedFor(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.XForwardedFor"));
		describeLoadBalancerHTTPListenerAttributeResponse.setListenerPort(_ctx.integerValue("DescribeLoadBalancerHTTPListenerAttributeResponse.ListenerPort"));
		describeLoadBalancerHTTPListenerAttributeResponse.setStickySessionType(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.StickySessionType"));
		describeLoadBalancerHTTPListenerAttributeResponse.setScheduler(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.Scheduler"));
		describeLoadBalancerHTTPListenerAttributeResponse.setInterval(_ctx.integerValue("DescribeLoadBalancerHTTPListenerAttributeResponse.Interval"));
		describeLoadBalancerHTTPListenerAttributeResponse.setHealthyThreshold(_ctx.integerValue("DescribeLoadBalancerHTTPListenerAttributeResponse.HealthyThreshold"));
		describeLoadBalancerHTTPListenerAttributeResponse.setXForwardedFor_proto(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.XForwardedFor_proto"));
		describeLoadBalancerHTTPListenerAttributeResponse.setXForwardedFor_SLBIP(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.XForwardedFor_SLBIP"));
		describeLoadBalancerHTTPListenerAttributeResponse.setStickySession(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.StickySession"));
		describeLoadBalancerHTTPListenerAttributeResponse.setHealthCheck(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.HealthCheck"));
	 
	 	return describeLoadBalancerHTTPListenerAttributeResponse;
	}
}