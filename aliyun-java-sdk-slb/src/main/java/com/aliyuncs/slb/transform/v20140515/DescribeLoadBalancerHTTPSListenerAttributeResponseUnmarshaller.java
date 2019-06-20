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

import com.aliyuncs.slb.model.v20140515.DescribeLoadBalancerHTTPSListenerAttributeResponse;
import com.aliyuncs.slb.model.v20140515.DescribeLoadBalancerHTTPSListenerAttributeResponse.DomainExtension;
import com.aliyuncs.slb.model.v20140515.DescribeLoadBalancerHTTPSListenerAttributeResponse.Rule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLoadBalancerHTTPSListenerAttributeResponseUnmarshaller {

	public static DescribeLoadBalancerHTTPSListenerAttributeResponse unmarshall(DescribeLoadBalancerHTTPSListenerAttributeResponse describeLoadBalancerHTTPSListenerAttributeResponse, UnmarshallerContext context) {
		
		describeLoadBalancerHTTPSListenerAttributeResponse.setRequestId(context.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.RequestId"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setListenerPort(context.integerValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.ListenerPort"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setBackendServerPort(context.integerValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.BackendServerPort"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setBackendProtocol(context.integerValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.BackendProtocol"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setBandwidth(context.integerValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.Bandwidth"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setStatus(context.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.Status"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setSecurityStatus(context.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.SecurityStatus"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setXForwardedFor(context.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.XForwardedFor"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setScheduler(context.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.Scheduler"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setStickySession(context.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.StickySession"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setStickySessionType(context.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.StickySessionType"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setCookieTimeout(context.integerValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.CookieTimeout"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setCookie(context.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.Cookie"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setHealthCheck(context.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.HealthCheck"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setHealthCheckType(context.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.HealthCheckType"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setHealthCheckDomain(context.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.HealthCheckDomain"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setHealthCheckURI(context.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.HealthCheckURI"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setHealthyThreshold(context.integerValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.HealthyThreshold"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setUnhealthyThreshold(context.integerValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.UnhealthyThreshold"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setHealthCheckTimeout(context.integerValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.HealthCheckTimeout"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setHealthCheckInterval(context.integerValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.HealthCheckInterval"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setHealthCheckConnectPort(context.integerValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.HealthCheckConnectPort"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setHealthCheckHttpCode(context.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.HealthCheckHttpCode"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setServerCertificateId(context.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.ServerCertificateId"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setCACertificateId(context.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.CACertificateId"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setHealthCheckMethod(context.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.HealthCheckMethod"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setMaxConnection(context.integerValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.MaxConnection"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setVServerGroupId(context.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.VServerGroupId"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setGzip(context.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.Gzip"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setXForwardedFor_SLBIP(context.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.XForwardedFor_SLBIP"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setXForwardedFor_SLBID(context.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.XForwardedFor_SLBID"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setXForwardedFor_proto(context.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.XForwardedFor_proto"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setAclId(context.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.AclId"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setAclType(context.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.AclType"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setAclStatus(context.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.AclStatus"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setVpcIds(context.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.VpcIds"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setRequestTimeout(context.integerValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.RequestTimeout"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setIdleTimeout(context.integerValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.IdleTimeout"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setEnableHttp2(context.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.EnableHttp2"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setTLSCipherPolicy(context.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.TLSCipherPolicy"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setDescription(context.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.Description"));

		List<Rule> rules = new ArrayList<Rule>();
		for (int i = 0; i < context.lengthValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.Rules.Length"); i++) {
			Rule rule = new Rule();
			rule.setRuleId(context.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.Rules["+ i +"].RuleId"));
			rule.setRuleName(context.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.Rules["+ i +"].RuleName"));
			rule.setDomain(context.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.Rules["+ i +"].Domain"));
			rule.setUrl(context.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.Rules["+ i +"].Url"));
			rule.setVServerGroupId(context.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.Rules["+ i +"].VServerGroupId"));

			rules.add(rule);
		}
		describeLoadBalancerHTTPSListenerAttributeResponse.setRules(rules);

		List<DomainExtension> domainExtensions = new ArrayList<DomainExtension>();
		for (int i = 0; i < context.lengthValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.DomainExtensions.Length"); i++) {
			DomainExtension domainExtension = new DomainExtension();
			domainExtension.setDomainExtensionId(context.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.DomainExtensions["+ i +"].DomainExtensionId"));
			domainExtension.setDomain(context.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.DomainExtensions["+ i +"].Domain"));
			domainExtension.setServerCertificateId(context.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.DomainExtensions["+ i +"].ServerCertificateId"));

			domainExtensions.add(domainExtension);
		}
		describeLoadBalancerHTTPSListenerAttributeResponse.setDomainExtensions(domainExtensions);
	 
	 	return describeLoadBalancerHTTPSListenerAttributeResponse;
	}
}