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
import com.aliyuncs.slb.model.v20140515.DescribeLoadBalancerHTTPSListenerAttributeResponse.DomainExtension.Certificate;
import com.aliyuncs.slb.model.v20140515.DescribeLoadBalancerHTTPSListenerAttributeResponse.DomainExtension.ServerCertificate;
import com.aliyuncs.slb.model.v20140515.DescribeLoadBalancerHTTPSListenerAttributeResponse.Rule;
import com.aliyuncs.slb.model.v20140515.DescribeLoadBalancerHTTPSListenerAttributeResponse.ServerCertificate2;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLoadBalancerHTTPSListenerAttributeResponseUnmarshaller {

	public static DescribeLoadBalancerHTTPSListenerAttributeResponse unmarshall(DescribeLoadBalancerHTTPSListenerAttributeResponse describeLoadBalancerHTTPSListenerAttributeResponse, UnmarshallerContext _ctx) {
		
		describeLoadBalancerHTTPSListenerAttributeResponse.setRequestId(_ctx.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.RequestId"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setListenerPort(_ctx.integerValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.ListenerPort"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setBackendServerPort(_ctx.integerValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.BackendServerPort"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setBackendProtocol(_ctx.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.BackendProtocol"));
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
		describeLoadBalancerHTTPSListenerAttributeResponse.setHealthCheckHttpVersion(_ctx.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.HealthCheckHttpVersion"));
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
		describeLoadBalancerHTTPSListenerAttributeResponse.setXForwardedFor_SLBPORT(_ctx.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.XForwardedFor_SLBPORT"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setXForwardedFor_ClientSrcPort(_ctx.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.XForwardedFor_ClientSrcPort"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setXForwardedFor_ClientCertSubjectDN(_ctx.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.XForwardedFor_ClientCertSubjectDN"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setXForwardedFor_ClientCertIssuerDN(_ctx.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.XForwardedFor_ClientCertIssuerDN"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setXForwardedFor_ClientCertFingerprint(_ctx.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.XForwardedFor_ClientCertFingerprint"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setXForwardedFor_ClientCertClientVerify(_ctx.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.XForwardedFor_ClientCertClientVerify"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setXForwardedFor_ClientCertSubjectDNAlias(_ctx.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.XForwardedFor_ClientCertSubjectDNAlias"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setXForwardedFor_ClientCertIssuerDNAlias(_ctx.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.XForwardedFor_ClientCertIssuerDNAlias"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setXForwardedFor_ClientCertFingerprintAlias(_ctx.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.XForwardedFor_ClientCertFingerprintAlias"));
		describeLoadBalancerHTTPSListenerAttributeResponse.setXForwardedFor_ClientCertClientVerifyAlias(_ctx.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.XForwardedFor_ClientCertClientVerifyAlias"));

		List<String> aclIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.AclIds.Length"); i++) {
			aclIds.add(_ctx.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.AclIds["+ i +"]"));
		}
		describeLoadBalancerHTTPSListenerAttributeResponse.setAclIds(aclIds);

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

			List<Certificate> certificates = new ArrayList<Certificate>();
			for (int j = 0; j < _ctx.lengthValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.DomainExtensions["+ i +"].Certificates.Length"); j++) {
				Certificate certificate = new Certificate();
				certificate.setCertificateId(_ctx.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.DomainExtensions["+ i +"].Certificates["+ j +"].CertificateId"));
				certificate.setEncryptionAlgorithm(_ctx.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.DomainExtensions["+ i +"].Certificates["+ j +"].EncryptionAlgorithm"));

				certificates.add(certificate);
			}
			domainExtension.setCertificates(certificates);

			List<ServerCertificate> serverCertificates1 = new ArrayList<ServerCertificate>();
			for (int j = 0; j < _ctx.lengthValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.DomainExtensions["+ i +"].ServerCertificates.Length"); j++) {
				ServerCertificate serverCertificate = new ServerCertificate();
				serverCertificate.setCertificateId(_ctx.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.DomainExtensions["+ i +"].ServerCertificates["+ j +"].CertificateId"));
				serverCertificate.setEncryptionAlgorithm(_ctx.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.DomainExtensions["+ i +"].ServerCertificates["+ j +"].EncryptionAlgorithm"));
				serverCertificate.setStandardType(_ctx.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.DomainExtensions["+ i +"].ServerCertificates["+ j +"].StandardType"));
				serverCertificate.setBindingType(_ctx.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.DomainExtensions["+ i +"].ServerCertificates["+ j +"].BindingType"));

				serverCertificates1.add(serverCertificate);
			}
			domainExtension.setServerCertificates1(serverCertificates1);

			domainExtensions.add(domainExtension);
		}
		describeLoadBalancerHTTPSListenerAttributeResponse.setDomainExtensions(domainExtensions);

		List<ServerCertificate2> serverCertificates = new ArrayList<ServerCertificate2>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.ServerCertificates.Length"); i++) {
			ServerCertificate2 serverCertificate2 = new ServerCertificate2();
			serverCertificate2.setCertificateId(_ctx.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.ServerCertificates["+ i +"].CertificateId"));
			serverCertificate2.setEncryptionAlgorithm(_ctx.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.ServerCertificates["+ i +"].EncryptionAlgorithm"));
			serverCertificate2.setStandardType(_ctx.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.ServerCertificates["+ i +"].StandardType"));
			serverCertificate2.setBindingType(_ctx.stringValue("DescribeLoadBalancerHTTPSListenerAttributeResponse.ServerCertificates["+ i +"].BindingType"));

			serverCertificates.add(serverCertificate2);
		}
		describeLoadBalancerHTTPSListenerAttributeResponse.setServerCertificates(serverCertificates);
	 
	 	return describeLoadBalancerHTTPSListenerAttributeResponse;
	}
}