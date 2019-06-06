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

import com.aliyuncs.slb.model.v20140515.DescribeLoadBalancerHTTPListenerAttributeResponse;
import com.aliyuncs.slb.model.v20140515.DescribeLoadBalancerHTTPListenerAttributeResponse.Rule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLoadBalancerHTTPListenerAttributeResponseUnmarshaller {

	public static DescribeLoadBalancerHTTPListenerAttributeResponse unmarshall(DescribeLoadBalancerHTTPListenerAttributeResponse describeLoadBalancerHTTPListenerAttributeResponse, UnmarshallerContext context) {
		
		describeLoadBalancerHTTPListenerAttributeResponse.setRequestId(context.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.RequestId"));
		describeLoadBalancerHTTPListenerAttributeResponse.setListenerPort(context.integerValue("DescribeLoadBalancerHTTPListenerAttributeResponse.ListenerPort"));
		describeLoadBalancerHTTPListenerAttributeResponse.setBackendServerPort(context.integerValue("DescribeLoadBalancerHTTPListenerAttributeResponse.BackendServerPort"));
		describeLoadBalancerHTTPListenerAttributeResponse.setBandwidth(context.integerValue("DescribeLoadBalancerHTTPListenerAttributeResponse.Bandwidth"));
		describeLoadBalancerHTTPListenerAttributeResponse.setStatus(context.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.Status"));
		describeLoadBalancerHTTPListenerAttributeResponse.setSecurityStatus(context.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.SecurityStatus"));
		describeLoadBalancerHTTPListenerAttributeResponse.setXForwardedFor(context.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.XForwardedFor"));
		describeLoadBalancerHTTPListenerAttributeResponse.setScheduler(context.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.Scheduler"));
		describeLoadBalancerHTTPListenerAttributeResponse.setStickySession(context.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.StickySession"));
		describeLoadBalancerHTTPListenerAttributeResponse.setStickySessionType(context.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.StickySessionType"));
		describeLoadBalancerHTTPListenerAttributeResponse.setCookieTimeout(context.integerValue("DescribeLoadBalancerHTTPListenerAttributeResponse.CookieTimeout"));
		describeLoadBalancerHTTPListenerAttributeResponse.setCookie(context.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.Cookie"));
		describeLoadBalancerHTTPListenerAttributeResponse.setHealthCheck(context.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.HealthCheck"));
		describeLoadBalancerHTTPListenerAttributeResponse.setHealthCheckType(context.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.HealthCheckType"));
		describeLoadBalancerHTTPListenerAttributeResponse.setHealthCheckDomain(context.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.HealthCheckDomain"));
		describeLoadBalancerHTTPListenerAttributeResponse.setHealthCheckURI(context.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.HealthCheckURI"));
		describeLoadBalancerHTTPListenerAttributeResponse.setHealthyThreshold(context.integerValue("DescribeLoadBalancerHTTPListenerAttributeResponse.HealthyThreshold"));
		describeLoadBalancerHTTPListenerAttributeResponse.setUnhealthyThreshold(context.integerValue("DescribeLoadBalancerHTTPListenerAttributeResponse.UnhealthyThreshold"));
		describeLoadBalancerHTTPListenerAttributeResponse.setHealthCheckTimeout(context.integerValue("DescribeLoadBalancerHTTPListenerAttributeResponse.HealthCheckTimeout"));
		describeLoadBalancerHTTPListenerAttributeResponse.setHealthCheckInterval(context.integerValue("DescribeLoadBalancerHTTPListenerAttributeResponse.HealthCheckInterval"));
		describeLoadBalancerHTTPListenerAttributeResponse.setHealthCheckConnectPort(context.integerValue("DescribeLoadBalancerHTTPListenerAttributeResponse.HealthCheckConnectPort"));
		describeLoadBalancerHTTPListenerAttributeResponse.setHealthCheckHttpCode(context.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.HealthCheckHttpCode"));
		describeLoadBalancerHTTPListenerAttributeResponse.setHealthCheckMethod(context.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.HealthCheckMethod"));
		describeLoadBalancerHTTPListenerAttributeResponse.setMaxConnection(context.integerValue("DescribeLoadBalancerHTTPListenerAttributeResponse.MaxConnection"));
		describeLoadBalancerHTTPListenerAttributeResponse.setVServerGroupId(context.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.VServerGroupId"));
		describeLoadBalancerHTTPListenerAttributeResponse.setGzip(context.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.Gzip"));
		describeLoadBalancerHTTPListenerAttributeResponse.setXForwardedFor_SLBIP(context.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.XForwardedFor_SLBIP"));
		describeLoadBalancerHTTPListenerAttributeResponse.setXForwardedFor_SLBID(context.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.XForwardedFor_SLBID"));
		describeLoadBalancerHTTPListenerAttributeResponse.setXForwardedFor_proto(context.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.XForwardedFor_proto"));
		describeLoadBalancerHTTPListenerAttributeResponse.setAclId(context.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.AclId"));
		describeLoadBalancerHTTPListenerAttributeResponse.setAclType(context.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.AclType"));
		describeLoadBalancerHTTPListenerAttributeResponse.setAclStatus(context.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.AclStatus"));
		describeLoadBalancerHTTPListenerAttributeResponse.setVpcIds(context.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.VpcIds"));
		describeLoadBalancerHTTPListenerAttributeResponse.setListenerForward(context.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.ListenerForward"));
		describeLoadBalancerHTTPListenerAttributeResponse.setForwardPort(context.integerValue("DescribeLoadBalancerHTTPListenerAttributeResponse.ForwardPort"));
		describeLoadBalancerHTTPListenerAttributeResponse.setRequestTimeout(context.integerValue("DescribeLoadBalancerHTTPListenerAttributeResponse.RequestTimeout"));
		describeLoadBalancerHTTPListenerAttributeResponse.setIdleTimeout(context.integerValue("DescribeLoadBalancerHTTPListenerAttributeResponse.IdleTimeout"));
		describeLoadBalancerHTTPListenerAttributeResponse.setDescription(context.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.Description"));

		List<Rule> rules = new ArrayList<Rule>();
		for (int i = 0; i < context.lengthValue("DescribeLoadBalancerHTTPListenerAttributeResponse.Rules.Length"); i++) {
			Rule rule = new Rule();
			rule.setRuleId(context.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.Rules["+ i +"].RuleId"));
			rule.setRuleName(context.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.Rules["+ i +"].RuleName"));
			rule.setDomain(context.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.Rules["+ i +"].Domain"));
			rule.setUrl(context.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.Rules["+ i +"].Url"));
			rule.setVServerGroupId(context.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.Rules["+ i +"].VServerGroupId"));

			rules.add(rule);
		}
		describeLoadBalancerHTTPListenerAttributeResponse.setRules(rules);
	 
	 	return describeLoadBalancerHTTPListenerAttributeResponse;
	}
}