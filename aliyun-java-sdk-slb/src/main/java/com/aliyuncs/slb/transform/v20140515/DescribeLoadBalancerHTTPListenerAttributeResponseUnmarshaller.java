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

	public static DescribeLoadBalancerHTTPListenerAttributeResponse unmarshall(DescribeLoadBalancerHTTPListenerAttributeResponse describeLoadBalancerHTTPListenerAttributeResponse, UnmarshallerContext _ctx) {
		
		describeLoadBalancerHTTPListenerAttributeResponse.setRequestId(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.RequestId"));
		describeLoadBalancerHTTPListenerAttributeResponse.setListenerPort(_ctx.integerValue("DescribeLoadBalancerHTTPListenerAttributeResponse.ListenerPort"));
		describeLoadBalancerHTTPListenerAttributeResponse.setBackendServerPort(_ctx.integerValue("DescribeLoadBalancerHTTPListenerAttributeResponse.BackendServerPort"));
		describeLoadBalancerHTTPListenerAttributeResponse.setBandwidth(_ctx.integerValue("DescribeLoadBalancerHTTPListenerAttributeResponse.Bandwidth"));
		describeLoadBalancerHTTPListenerAttributeResponse.setStatus(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.Status"));
		describeLoadBalancerHTTPListenerAttributeResponse.setSecurityStatus(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.SecurityStatus"));
		describeLoadBalancerHTTPListenerAttributeResponse.setXForwardedFor(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.XForwardedFor"));
		describeLoadBalancerHTTPListenerAttributeResponse.setScheduler(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.Scheduler"));
		describeLoadBalancerHTTPListenerAttributeResponse.setStickySession(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.StickySession"));
		describeLoadBalancerHTTPListenerAttributeResponse.setStickySessionType(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.StickySessionType"));
		describeLoadBalancerHTTPListenerAttributeResponse.setCookieTimeout(_ctx.integerValue("DescribeLoadBalancerHTTPListenerAttributeResponse.CookieTimeout"));
		describeLoadBalancerHTTPListenerAttributeResponse.setCookie(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.Cookie"));
		describeLoadBalancerHTTPListenerAttributeResponse.setHealthCheck(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.HealthCheck"));
		describeLoadBalancerHTTPListenerAttributeResponse.setHealthCheckType(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.HealthCheckType"));
		describeLoadBalancerHTTPListenerAttributeResponse.setHealthCheckDomain(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.HealthCheckDomain"));
		describeLoadBalancerHTTPListenerAttributeResponse.setHealthCheckURI(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.HealthCheckURI"));
		describeLoadBalancerHTTPListenerAttributeResponse.setHealthyThreshold(_ctx.integerValue("DescribeLoadBalancerHTTPListenerAttributeResponse.HealthyThreshold"));
		describeLoadBalancerHTTPListenerAttributeResponse.setUnhealthyThreshold(_ctx.integerValue("DescribeLoadBalancerHTTPListenerAttributeResponse.UnhealthyThreshold"));
		describeLoadBalancerHTTPListenerAttributeResponse.setHealthCheckTimeout(_ctx.integerValue("DescribeLoadBalancerHTTPListenerAttributeResponse.HealthCheckTimeout"));
		describeLoadBalancerHTTPListenerAttributeResponse.setHealthCheckInterval(_ctx.integerValue("DescribeLoadBalancerHTTPListenerAttributeResponse.HealthCheckInterval"));
		describeLoadBalancerHTTPListenerAttributeResponse.setHealthCheckConnectPort(_ctx.integerValue("DescribeLoadBalancerHTTPListenerAttributeResponse.HealthCheckConnectPort"));
		describeLoadBalancerHTTPListenerAttributeResponse.setHealthCheckHttpCode(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.HealthCheckHttpCode"));
		describeLoadBalancerHTTPListenerAttributeResponse.setHealthCheckMethod(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.HealthCheckMethod"));
		describeLoadBalancerHTTPListenerAttributeResponse.setMaxConnection(_ctx.integerValue("DescribeLoadBalancerHTTPListenerAttributeResponse.MaxConnection"));
		describeLoadBalancerHTTPListenerAttributeResponse.setVServerGroupId(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.VServerGroupId"));
		describeLoadBalancerHTTPListenerAttributeResponse.setGzip(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.Gzip"));
		describeLoadBalancerHTTPListenerAttributeResponse.setXForwardedFor_SLBIP(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.XForwardedFor_SLBIP"));
		describeLoadBalancerHTTPListenerAttributeResponse.setXForwardedFor_SLBID(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.XForwardedFor_SLBID"));
		describeLoadBalancerHTTPListenerAttributeResponse.setXForwardedFor_proto(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.XForwardedFor_proto"));
		describeLoadBalancerHTTPListenerAttributeResponse.setAclId(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.AclId"));
		describeLoadBalancerHTTPListenerAttributeResponse.setAclType(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.AclType"));
		describeLoadBalancerHTTPListenerAttributeResponse.setAclStatus(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.AclStatus"));
		describeLoadBalancerHTTPListenerAttributeResponse.setVpcIds(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.VpcIds"));
		describeLoadBalancerHTTPListenerAttributeResponse.setListenerForward(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.ListenerForward"));
		describeLoadBalancerHTTPListenerAttributeResponse.setForwardPort(_ctx.integerValue("DescribeLoadBalancerHTTPListenerAttributeResponse.ForwardPort"));
		describeLoadBalancerHTTPListenerAttributeResponse.setRequestTimeout(_ctx.integerValue("DescribeLoadBalancerHTTPListenerAttributeResponse.RequestTimeout"));
		describeLoadBalancerHTTPListenerAttributeResponse.setIdleTimeout(_ctx.integerValue("DescribeLoadBalancerHTTPListenerAttributeResponse.IdleTimeout"));
		describeLoadBalancerHTTPListenerAttributeResponse.setDescription(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.Description"));

		List<Rule> rules = new ArrayList<Rule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLoadBalancerHTTPListenerAttributeResponse.Rules.Length"); i++) {
			Rule rule = new Rule();
			rule.setRuleId(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.Rules["+ i +"].RuleId"));
			rule.setRuleName(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.Rules["+ i +"].RuleName"));
			rule.setDomain(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.Rules["+ i +"].Domain"));
			rule.setUrl(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.Rules["+ i +"].Url"));
			rule.setVServerGroupId(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.Rules["+ i +"].VServerGroupId"));

			rules.add(rule);
		}
		describeLoadBalancerHTTPListenerAttributeResponse.setRules(rules);
	 
	 	return describeLoadBalancerHTTPListenerAttributeResponse;
	}
}