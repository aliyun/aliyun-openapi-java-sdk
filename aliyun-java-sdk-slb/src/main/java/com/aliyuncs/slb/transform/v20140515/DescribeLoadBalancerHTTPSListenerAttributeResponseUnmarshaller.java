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

	public static DescribeLoadBalancerHTTPSListenerAttributeResponse unmarshall(DescribeLoadBalancerHTTPSListenerAttributeResponse describeLoadBalancerHTTPSListenerAttributeResponse, UnmarshallerContext _ctx) {
		
		describeLoadBalancerHTTPSListenerAttributeResponse.setRequestId(_ctx.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.RequestId"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setListenerPort(_ctx.integerValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.ListenerPort"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setBackendServerPort(_ctx.integerValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.BackendServerPort"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setBackendProtocol(_ctx.integerValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.BackendProtocol"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setBandwidth(_ctx.integerValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.Bandwidth"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setStatus(_ctx.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.Status"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setSecurityStatus(_ctx.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.SecurityStatus"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setXForwardedFor(_ctx.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.XForwardedFor"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setScheduler(_ctx.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.Scheduler"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setStickySession(_ctx.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.StickySession"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setStickySessionType(_ctx.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.StickySessionType"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setCookieTimeout(_ctx.integerValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.CookieTimeout"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setCookie(_ctx.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.Cookie"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setHealthCheck(_ctx.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.HealthCheck"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setHealthCheckType(_ctx.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.HealthCheckType"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setHealthCheckDomain(_ctx.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.HealthCheckDomain"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setHealthCheckURI(_ctx.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.HealthCheckURI"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setHealthyThreshold(_ctx.integerValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.HealthyThreshold"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setUnhealthyThreshold(_ctx.integerValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.UnhealthyThreshold"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setHealthCheckTimeout(_ctx.integerValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.HealthCheckTimeout"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setHealthCheckInterval(_ctx.integerValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.HealthCheckInterval"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setHealthCheckConnectPort(_ctx.integerValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.HealthCheckConnectPort"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setHealthCheckHttpCode(_ctx.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.HealthCheckHttpCode"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setServerCertificateId(_ctx.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.ServerCertificateId"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setCACertificateId(_ctx.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.CACertificateId"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setHealthCheckMethod(_ctx.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.HealthCheckMethod"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setMaxConnection(_ctx.integerValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.MaxConnection"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setVServerGroupId(_ctx.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.VServerGroupId"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setGzip(_ctx.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.Gzip"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setXForwardedFor_SLBIP(_ctx.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.XForwardedFor_SLBIP"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setXForwardedFor_SLBID(_ctx.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.XForwardedFor_SLBID"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setXForwardedFor_proto(_ctx.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.XForwardedFor_proto"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setAclId(_ctx.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.AclId"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setAclType(_ctx.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.AclType"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setAclStatus(_ctx.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.AclStatus"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setVpcIds(_ctx.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.VpcIds"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setRequestTimeout(_ctx.integerValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.RequestTimeout"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setIdleTimeout(_ctx.integerValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.IdleTimeout"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setEnableHttp2(_ctx.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.EnableHttp2"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setTLSCipherPolicy(_ctx.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.TLSCipherPolicy"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setDescription(_ctx.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.Description"));

		List<Rule> rules = new ArrayList<Rule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.Rules.Length"); i++) {
			Rule rule = new Rule();
			rule.setRuleId(_ctx.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.Rules["+ i +"].RuleId"));
			rule.setRuleName(_ctx.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.Rules["+ i +"].RuleName"));
			rule.setDomain(_ctx.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.Rules["+ i +"].Domain"));
			rule.setUrl(_ctx.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.Rules["+ i +"].Url"));
			rule.setVServerGroupId(_ctx.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.Rules["+ i +"].VServerGroupId"));

			rules.add(rule);
		}
		describeLoadBalancerHTTPSListenerAttributeResponse.setRules(rules);

		List<DomainExtension> domainExtensions = new ArrayList<DomainExtension>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.DomainExtensions.Length"); i++) {
			DomainExtension domainExtension = new DomainExtension();
			domainExtension.setDomainExtensionId(_ctx.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.DomainExtensions["+ i +"].DomainExtensionId"));
			domainExtension.setDomain(_ctx.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.DomainExtensions["+ i +"].Domain"));
			domainExtension.setServerCertificateId(_ctx.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.DomainExtensions["+ i +"].ServerCertificateId"));

			domainExtensions.add(domainExtension);
		}
		describeLoadBalancerHTTPSListenerAttributeResponse.setDomainExtensions(domainExtensions);
	 
	 	return describeLoadBalancerHTTPSListenerAttributeResponse;
	}
}