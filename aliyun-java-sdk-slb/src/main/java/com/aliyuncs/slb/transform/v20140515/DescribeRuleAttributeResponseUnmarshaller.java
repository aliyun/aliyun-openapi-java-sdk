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

import com.aliyuncs.slb.model.v20140515.DescribeRuleAttributeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRuleAttributeResponseUnmarshaller {

	public static DescribeRuleAttributeResponse unmarshall(DescribeRuleAttributeResponse describeRuleAttributeResponse, UnmarshallerContext _ctx) {
		
		describeRuleAttributeResponse.setRequestId(_ctx.stringValue("DescribeRuleAttributeResponse.RequestId"));
		describeRuleAttributeResponse.setVServerGroupId(_ctx.stringValue("DescribeRuleAttributeResponse.VServerGroupId"));
		describeRuleAttributeResponse.setCookie(_ctx.stringValue("DescribeRuleAttributeResponse.Cookie"));
		describeRuleAttributeResponse.setLoadBalancerId(_ctx.stringValue("DescribeRuleAttributeResponse.LoadBalancerId"));
		describeRuleAttributeResponse.setRuleId(_ctx.stringValue("DescribeRuleAttributeResponse.RuleId"));
		describeRuleAttributeResponse.setServiceManagedMode(_ctx.stringValue("DescribeRuleAttributeResponse.ServiceManagedMode"));
		describeRuleAttributeResponse.setHealthCheckConnectPort(_ctx.integerValue("DescribeRuleAttributeResponse.HealthCheckConnectPort"));
		describeRuleAttributeResponse.setHealthCheckTimeout(_ctx.integerValue("DescribeRuleAttributeResponse.HealthCheckTimeout"));
		describeRuleAttributeResponse.setCookieTimeout(_ctx.integerValue("DescribeRuleAttributeResponse.CookieTimeout"));
		describeRuleAttributeResponse.setHealthCheckDomain(_ctx.stringValue("DescribeRuleAttributeResponse.HealthCheckDomain"));
		describeRuleAttributeResponse.setUnhealthyThreshold(_ctx.integerValue("DescribeRuleAttributeResponse.UnhealthyThreshold"));
		describeRuleAttributeResponse.setHealthCheckHttpCode(_ctx.stringValue("DescribeRuleAttributeResponse.HealthCheckHttpCode"));
		describeRuleAttributeResponse.setDomain(_ctx.stringValue("DescribeRuleAttributeResponse.Domain"));
		describeRuleAttributeResponse.setListenerPort(_ctx.stringValue("DescribeRuleAttributeResponse.ListenerPort"));
		describeRuleAttributeResponse.setUrl(_ctx.stringValue("DescribeRuleAttributeResponse.Url"));
		describeRuleAttributeResponse.setHealthCheckInterval(_ctx.integerValue("DescribeRuleAttributeResponse.HealthCheckInterval"));
		describeRuleAttributeResponse.setHealthCheckURI(_ctx.stringValue("DescribeRuleAttributeResponse.HealthCheckURI"));
		describeRuleAttributeResponse.setRuleName(_ctx.stringValue("DescribeRuleAttributeResponse.RuleName"));
		describeRuleAttributeResponse.setStickySessionType(_ctx.stringValue("DescribeRuleAttributeResponse.StickySessionType"));
		describeRuleAttributeResponse.setScheduler(_ctx.stringValue("DescribeRuleAttributeResponse.Scheduler"));
		describeRuleAttributeResponse.setListenerSync(_ctx.stringValue("DescribeRuleAttributeResponse.ListenerSync"));
		describeRuleAttributeResponse.setHealthyThreshold(_ctx.integerValue("DescribeRuleAttributeResponse.HealthyThreshold"));
		describeRuleAttributeResponse.setStickySession(_ctx.stringValue("DescribeRuleAttributeResponse.StickySession"));
		describeRuleAttributeResponse.setHealthCheck(_ctx.stringValue("DescribeRuleAttributeResponse.HealthCheck"));
	 
	 	return describeRuleAttributeResponse;
	}
}