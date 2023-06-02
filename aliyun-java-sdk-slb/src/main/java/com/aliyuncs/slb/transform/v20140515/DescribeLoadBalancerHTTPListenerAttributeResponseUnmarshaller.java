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
import com.aliyuncs.slb.model.v20140515.DescribeLoadBalancerHTTPListenerAttributeResponse.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLoadBalancerHTTPListenerAttributeResponseUnmarshaller {

	public static DescribeLoadBalancerHTTPListenerAttributeResponse unmarshall(DescribeLoadBalancerHTTPListenerAttributeResponse describeLoadBalancerHTTPListenerAttributeResponse, UnmarshallerContext _ctx) {
		
		describeLoadBalancerHTTPListenerAttributeResponse.setRequestId(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.RequestId"));
		describeLoadBalancerHTTPListenerAttributeResponse.setAclType(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.AclType"));
		describeLoadBalancerHTTPListenerAttributeResponse.setVServerGroupId(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.VServerGroupId"));
		describeLoadBalancerHTTPListenerAttributeResponse.setHealthCheckHttpVersion(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.HealthCheckHttpVersion"));
		describeLoadBalancerHTTPListenerAttributeResponse.setStatus(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.Status"));
		describeLoadBalancerHTTPListenerAttributeResponse.setXForwardedFor_ClientSrcPort(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.XForwardedFor_ClientSrcPort"));
		describeLoadBalancerHTTPListenerAttributeResponse.setCookie(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.Cookie"));
		describeLoadBalancerHTTPListenerAttributeResponse.setGzip(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.Gzip"));
		describeLoadBalancerHTTPListenerAttributeResponse.setForwardCode(_ctx.integerValue("DescribeLoadBalancerHTTPListenerAttributeResponse.ForwardCode"));
		describeLoadBalancerHTTPListenerAttributeResponse.setServiceManagedMode(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.ServiceManagedMode"));
		describeLoadBalancerHTTPListenerAttributeResponse.setHealthCheckConnectPort(_ctx.integerValue("DescribeLoadBalancerHTTPListenerAttributeResponse.HealthCheckConnectPort"));
		describeLoadBalancerHTTPListenerAttributeResponse.setDescription(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.Description"));
		describeLoadBalancerHTTPListenerAttributeResponse.setBandwidth(_ctx.integerValue("DescribeLoadBalancerHTTPListenerAttributeResponse.Bandwidth"));
		describeLoadBalancerHTTPListenerAttributeResponse.setHealthCheckTimeout(_ctx.integerValue("DescribeLoadBalancerHTTPListenerAttributeResponse.HealthCheckTimeout"));
		describeLoadBalancerHTTPListenerAttributeResponse.setHealthCheckType(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.HealthCheckType"));
		describeLoadBalancerHTTPListenerAttributeResponse.setAclStatus(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.AclStatus"));
		describeLoadBalancerHTTPListenerAttributeResponse.setBackendServerPort(_ctx.integerValue("DescribeLoadBalancerHTTPListenerAttributeResponse.BackendServerPort"));
		describeLoadBalancerHTTPListenerAttributeResponse.setCookieTimeout(_ctx.integerValue("DescribeLoadBalancerHTTPListenerAttributeResponse.CookieTimeout"));
		describeLoadBalancerHTTPListenerAttributeResponse.setHealthCheckDomain(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.HealthCheckDomain"));
		describeLoadBalancerHTTPListenerAttributeResponse.setUnhealthyThreshold(_ctx.integerValue("DescribeLoadBalancerHTTPListenerAttributeResponse.UnhealthyThreshold"));
		describeLoadBalancerHTTPListenerAttributeResponse.setForwardPort(_ctx.integerValue("DescribeLoadBalancerHTTPListenerAttributeResponse.ForwardPort"));
		describeLoadBalancerHTTPListenerAttributeResponse.setXForwardedFor_SLBID(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.XForwardedFor_SLBID"));
		describeLoadBalancerHTTPListenerAttributeResponse.setSecurityStatus(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.SecurityStatus"));
		describeLoadBalancerHTTPListenerAttributeResponse.setHealthCheckHttpCode(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.HealthCheckHttpCode"));
		describeLoadBalancerHTTPListenerAttributeResponse.setMaxConnection(_ctx.integerValue("DescribeLoadBalancerHTTPListenerAttributeResponse.MaxConnection"));
		describeLoadBalancerHTTPListenerAttributeResponse.setListenerForward(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.ListenerForward"));
		describeLoadBalancerHTTPListenerAttributeResponse.setXForwardedFor(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.XForwardedFor"));
		describeLoadBalancerHTTPListenerAttributeResponse.setIdleTimeout(_ctx.integerValue("DescribeLoadBalancerHTTPListenerAttributeResponse.IdleTimeout"));
		describeLoadBalancerHTTPListenerAttributeResponse.setRequestTimeout(_ctx.integerValue("DescribeLoadBalancerHTTPListenerAttributeResponse.RequestTimeout"));
		describeLoadBalancerHTTPListenerAttributeResponse.setListenerPort(_ctx.integerValue("DescribeLoadBalancerHTTPListenerAttributeResponse.ListenerPort"));
		describeLoadBalancerHTTPListenerAttributeResponse.setHealthCheckInterval(_ctx.integerValue("DescribeLoadBalancerHTTPListenerAttributeResponse.HealthCheckInterval"));
		describeLoadBalancerHTTPListenerAttributeResponse.setXForwardedFor_SLBPORT(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.XForwardedFor_SLBPORT"));
		describeLoadBalancerHTTPListenerAttributeResponse.setHealthCheckURI(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.HealthCheckURI"));
		describeLoadBalancerHTTPListenerAttributeResponse.setStickySessionType(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.StickySessionType"));
		describeLoadBalancerHTTPListenerAttributeResponse.setAclId(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.AclId"));
		describeLoadBalancerHTTPListenerAttributeResponse.setScheduler(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.Scheduler"));
		describeLoadBalancerHTTPListenerAttributeResponse.setVpcIds(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.VpcIds"));
		describeLoadBalancerHTTPListenerAttributeResponse.setHealthyThreshold(_ctx.integerValue("DescribeLoadBalancerHTTPListenerAttributeResponse.HealthyThreshold"));
		describeLoadBalancerHTTPListenerAttributeResponse.setXForwardedFor_proto(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.XForwardedFor_proto"));
		describeLoadBalancerHTTPListenerAttributeResponse.setXForwardedFor_SLBIP(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.XForwardedFor_SLBIP"));
		describeLoadBalancerHTTPListenerAttributeResponse.setStickySession(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.StickySession"));
		describeLoadBalancerHTTPListenerAttributeResponse.setHealthCheckMethod(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.HealthCheckMethod"));
		describeLoadBalancerHTTPListenerAttributeResponse.setHealthCheck(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.HealthCheck"));
		describeLoadBalancerHTTPListenerAttributeResponse.setLoadBalancerId(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.LoadBalancerId"));

		List<String> aclIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLoadBalancerHTTPListenerAttributeResponse.AclIds.Length"); i++) {
			aclIds.add(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.AclIds["+ i +"]"));
		}
		describeLoadBalancerHTTPListenerAttributeResponse.setAclIds(aclIds);

		List<Rule> rules = new ArrayList<Rule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLoadBalancerHTTPListenerAttributeResponse.Rules.Length"); i++) {
			Rule rule = new Rule();
			rule.setVServerGroupId(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.Rules["+ i +"].VServerGroupId"));
			rule.setUrl(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.Rules["+ i +"].Url"));
			rule.setDomain(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.Rules["+ i +"].Domain"));
			rule.setRuleName(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.Rules["+ i +"].RuleName"));
			rule.setRuleId(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.Rules["+ i +"].RuleId"));

			rules.add(rule);
		}
		describeLoadBalancerHTTPListenerAttributeResponse.setRules(rules);

		List<Tag> tags = new ArrayList<Tag>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLoadBalancerHTTPListenerAttributeResponse.Tags.Length"); i++) {
			Tag tag = new Tag();
			tag.setTagKey(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.Tags["+ i +"].TagKey"));
			tag.setTagValue(_ctx.stringValue("DescribeLoadBalancerHTTPListenerAttributeResponse.Tags["+ i +"].TagValue"));

			tags.add(tag);
		}
		describeLoadBalancerHTTPListenerAttributeResponse.setTags(tags);
	 
	 	return describeLoadBalancerHTTPListenerAttributeResponse;
	}
}