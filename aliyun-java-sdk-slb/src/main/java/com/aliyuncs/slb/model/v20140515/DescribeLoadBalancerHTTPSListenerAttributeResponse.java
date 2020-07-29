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

package com.aliyuncs.slb.model.v20140515;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.slb.transform.v20140515.DescribeLoadBalancerHTTPSListenerAttributeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLoadBalancerHTTPSListenerAttributeResponse extends AcsResponse {

	private String requestId;

	private Integer listenerPort;

	private Integer backendServerPort;

	private String backendProtocol;

	private Integer bandwidth;

	private String status;

	private String securityStatus;

	private String xForwardedFor;

	private String scheduler;

	private String stickySession;

	private String stickySessionType;

	private Integer cookieTimeout;

	private String cookie;

	private String healthCheck;

	private String healthCheckType;

	private String healthCheckDomain;

	private String healthCheckURI;

	private Integer healthyThreshold;

	private Integer unhealthyThreshold;

	private Integer healthCheckTimeout;

	private Integer healthCheckInterval;

	private Integer healthCheckConnectPort;

	private String healthCheckHttpCode;

	private String serverCertificateId;

	private String cACertificateId;

	private String healthCheckMethod;

	private String healthCheckHttpVersion;

	private Integer maxConnection;

	private String vServerGroupId;

	private String gzip;

	private String xForwardedFor_SLBIP;

	private String xForwardedFor_SLBID;

	private String xForwardedFor_proto;

	private String aclId;

	private String aclType;

	private String aclStatus;

	private String vpcIds;

	private Integer requestTimeout;

	private Integer idleTimeout;

	private String enableHttp2;

	private String tLSCipherPolicy;

	private String description;

	private String xForwardedFor_SLBPORT;

	private String xForwardedFor_ClientSrcPort;

	private String xForwardedFor_ClientCertSubjectDN;

	private String xForwardedFor_ClientCertIssuerDN;

	private String xForwardedFor_ClientCertFingerprint;

	private String xForwardedFor_ClientCertClientVerify;

	private String xForwardedFor_ClientCertSubjectDNAlias;

	private String xForwardedFor_ClientCertIssuerDNAlias;

	private String xForwardedFor_ClientCertFingerprintAlias;

	private String xForwardedFor_ClientCertClientVerifyAlias;

	private List<Rule> rules;

	private List<DomainExtension> domainExtensions;

	private List<ServerCertificate2> serverCertificates;

	private List<String> aclIds;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getListenerPort() {
		return this.listenerPort;
	}

	public void setListenerPort(Integer listenerPort) {
		this.listenerPort = listenerPort;
	}

	public Integer getBackendServerPort() {
		return this.backendServerPort;
	}

	public void setBackendServerPort(Integer backendServerPort) {
		this.backendServerPort = backendServerPort;
	}

	public String getBackendProtocol() {
		return this.backendProtocol;
	}

	public void setBackendProtocol(String backendProtocol) {
		this.backendProtocol = backendProtocol;
	}

	public Integer getBandwidth() {
		return this.bandwidth;
	}

	public void setBandwidth(Integer bandwidth) {
		this.bandwidth = bandwidth;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSecurityStatus() {
		return this.securityStatus;
	}

	public void setSecurityStatus(String securityStatus) {
		this.securityStatus = securityStatus;
	}

	public String getXForwardedFor() {
		return this.xForwardedFor;
	}

	public void setXForwardedFor(String xForwardedFor) {
		this.xForwardedFor = xForwardedFor;
	}

	public String getScheduler() {
		return this.scheduler;
	}

	public void setScheduler(String scheduler) {
		this.scheduler = scheduler;
	}

	public String getStickySession() {
		return this.stickySession;
	}

	public void setStickySession(String stickySession) {
		this.stickySession = stickySession;
	}

	public String getStickySessionType() {
		return this.stickySessionType;
	}

	public void setStickySessionType(String stickySessionType) {
		this.stickySessionType = stickySessionType;
	}

	public Integer getCookieTimeout() {
		return this.cookieTimeout;
	}

	public void setCookieTimeout(Integer cookieTimeout) {
		this.cookieTimeout = cookieTimeout;
	}

	public String getCookie() {
		return this.cookie;
	}

	public void setCookie(String cookie) {
		this.cookie = cookie;
	}

	public String getHealthCheck() {
		return this.healthCheck;
	}

	public void setHealthCheck(String healthCheck) {
		this.healthCheck = healthCheck;
	}

	public String getHealthCheckType() {
		return this.healthCheckType;
	}

	public void setHealthCheckType(String healthCheckType) {
		this.healthCheckType = healthCheckType;
	}

	public String getHealthCheckDomain() {
		return this.healthCheckDomain;
	}

	public void setHealthCheckDomain(String healthCheckDomain) {
		this.healthCheckDomain = healthCheckDomain;
	}

	public String getHealthCheckURI() {
		return this.healthCheckURI;
	}

	public void setHealthCheckURI(String healthCheckURI) {
		this.healthCheckURI = healthCheckURI;
	}

	public Integer getHealthyThreshold() {
		return this.healthyThreshold;
	}

	public void setHealthyThreshold(Integer healthyThreshold) {
		this.healthyThreshold = healthyThreshold;
	}

	public Integer getUnhealthyThreshold() {
		return this.unhealthyThreshold;
	}

	public void setUnhealthyThreshold(Integer unhealthyThreshold) {
		this.unhealthyThreshold = unhealthyThreshold;
	}

	public Integer getHealthCheckTimeout() {
		return this.healthCheckTimeout;
	}

	public void setHealthCheckTimeout(Integer healthCheckTimeout) {
		this.healthCheckTimeout = healthCheckTimeout;
	}

	public Integer getHealthCheckInterval() {
		return this.healthCheckInterval;
	}

	public void setHealthCheckInterval(Integer healthCheckInterval) {
		this.healthCheckInterval = healthCheckInterval;
	}

	public Integer getHealthCheckConnectPort() {
		return this.healthCheckConnectPort;
	}

	public void setHealthCheckConnectPort(Integer healthCheckConnectPort) {
		this.healthCheckConnectPort = healthCheckConnectPort;
	}

	public String getHealthCheckHttpCode() {
		return this.healthCheckHttpCode;
	}

	public void setHealthCheckHttpCode(String healthCheckHttpCode) {
		this.healthCheckHttpCode = healthCheckHttpCode;
	}

	public String getServerCertificateId() {
		return this.serverCertificateId;
	}

	public void setServerCertificateId(String serverCertificateId) {
		this.serverCertificateId = serverCertificateId;
	}

	public String getCACertificateId() {
		return this.cACertificateId;
	}

	public void setCACertificateId(String cACertificateId) {
		this.cACertificateId = cACertificateId;
	}

	public String getHealthCheckMethod() {
		return this.healthCheckMethod;
	}

	public void setHealthCheckMethod(String healthCheckMethod) {
		this.healthCheckMethod = healthCheckMethod;
	}

	public String getHealthCheckHttpVersion() {
		return this.healthCheckHttpVersion;
	}

	public void setHealthCheckHttpVersion(String healthCheckHttpVersion) {
		this.healthCheckHttpVersion = healthCheckHttpVersion;
	}

	public Integer getMaxConnection() {
		return this.maxConnection;
	}

	public void setMaxConnection(Integer maxConnection) {
		this.maxConnection = maxConnection;
	}

	public String getVServerGroupId() {
		return this.vServerGroupId;
	}

	public void setVServerGroupId(String vServerGroupId) {
		this.vServerGroupId = vServerGroupId;
	}

	public String getGzip() {
		return this.gzip;
	}

	public void setGzip(String gzip) {
		this.gzip = gzip;
	}

	public String getXForwardedFor_SLBIP() {
		return this.xForwardedFor_SLBIP;
	}

	public void setXForwardedFor_SLBIP(String xForwardedFor_SLBIP) {
		this.xForwardedFor_SLBIP = xForwardedFor_SLBIP;
	}

	public String getXForwardedFor_SLBID() {
		return this.xForwardedFor_SLBID;
	}

	public void setXForwardedFor_SLBID(String xForwardedFor_SLBID) {
		this.xForwardedFor_SLBID = xForwardedFor_SLBID;
	}

	public String getXForwardedFor_proto() {
		return this.xForwardedFor_proto;
	}

	public void setXForwardedFor_proto(String xForwardedFor_proto) {
		this.xForwardedFor_proto = xForwardedFor_proto;
	}

	public String getAclId() {
		return this.aclId;
	}

	public void setAclId(String aclId) {
		this.aclId = aclId;
	}

	public String getAclType() {
		return this.aclType;
	}

	public void setAclType(String aclType) {
		this.aclType = aclType;
	}

	public String getAclStatus() {
		return this.aclStatus;
	}

	public void setAclStatus(String aclStatus) {
		this.aclStatus = aclStatus;
	}

	public String getVpcIds() {
		return this.vpcIds;
	}

	public void setVpcIds(String vpcIds) {
		this.vpcIds = vpcIds;
	}

	public Integer getRequestTimeout() {
		return this.requestTimeout;
	}

	public void setRequestTimeout(Integer requestTimeout) {
		this.requestTimeout = requestTimeout;
	}

	public Integer getIdleTimeout() {
		return this.idleTimeout;
	}

	public void setIdleTimeout(Integer idleTimeout) {
		this.idleTimeout = idleTimeout;
	}

	public String getEnableHttp2() {
		return this.enableHttp2;
	}

	public void setEnableHttp2(String enableHttp2) {
		this.enableHttp2 = enableHttp2;
	}

	public String getTLSCipherPolicy() {
		return this.tLSCipherPolicy;
	}

	public void setTLSCipherPolicy(String tLSCipherPolicy) {
		this.tLSCipherPolicy = tLSCipherPolicy;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getXForwardedFor_SLBPORT() {
		return this.xForwardedFor_SLBPORT;
	}

	public void setXForwardedFor_SLBPORT(String xForwardedFor_SLBPORT) {
		this.xForwardedFor_SLBPORT = xForwardedFor_SLBPORT;
	}

	public String getXForwardedFor_ClientSrcPort() {
		return this.xForwardedFor_ClientSrcPort;
	}

	public void setXForwardedFor_ClientSrcPort(String xForwardedFor_ClientSrcPort) {
		this.xForwardedFor_ClientSrcPort = xForwardedFor_ClientSrcPort;
	}

	public String getXForwardedFor_ClientCertSubjectDN() {
		return this.xForwardedFor_ClientCertSubjectDN;
	}

	public void setXForwardedFor_ClientCertSubjectDN(String xForwardedFor_ClientCertSubjectDN) {
		this.xForwardedFor_ClientCertSubjectDN = xForwardedFor_ClientCertSubjectDN;
	}

	public String getXForwardedFor_ClientCertIssuerDN() {
		return this.xForwardedFor_ClientCertIssuerDN;
	}

	public void setXForwardedFor_ClientCertIssuerDN(String xForwardedFor_ClientCertIssuerDN) {
		this.xForwardedFor_ClientCertIssuerDN = xForwardedFor_ClientCertIssuerDN;
	}

	public String getXForwardedFor_ClientCertFingerprint() {
		return this.xForwardedFor_ClientCertFingerprint;
	}

	public void setXForwardedFor_ClientCertFingerprint(String xForwardedFor_ClientCertFingerprint) {
		this.xForwardedFor_ClientCertFingerprint = xForwardedFor_ClientCertFingerprint;
	}

	public String getXForwardedFor_ClientCertClientVerify() {
		return this.xForwardedFor_ClientCertClientVerify;
	}

	public void setXForwardedFor_ClientCertClientVerify(String xForwardedFor_ClientCertClientVerify) {
		this.xForwardedFor_ClientCertClientVerify = xForwardedFor_ClientCertClientVerify;
	}

	public String getXForwardedFor_ClientCertSubjectDNAlias() {
		return this.xForwardedFor_ClientCertSubjectDNAlias;
	}

	public void setXForwardedFor_ClientCertSubjectDNAlias(String xForwardedFor_ClientCertSubjectDNAlias) {
		this.xForwardedFor_ClientCertSubjectDNAlias = xForwardedFor_ClientCertSubjectDNAlias;
	}

	public String getXForwardedFor_ClientCertIssuerDNAlias() {
		return this.xForwardedFor_ClientCertIssuerDNAlias;
	}

	public void setXForwardedFor_ClientCertIssuerDNAlias(String xForwardedFor_ClientCertIssuerDNAlias) {
		this.xForwardedFor_ClientCertIssuerDNAlias = xForwardedFor_ClientCertIssuerDNAlias;
	}

	public String getXForwardedFor_ClientCertFingerprintAlias() {
		return this.xForwardedFor_ClientCertFingerprintAlias;
	}

	public void setXForwardedFor_ClientCertFingerprintAlias(String xForwardedFor_ClientCertFingerprintAlias) {
		this.xForwardedFor_ClientCertFingerprintAlias = xForwardedFor_ClientCertFingerprintAlias;
	}

	public String getXForwardedFor_ClientCertClientVerifyAlias() {
		return this.xForwardedFor_ClientCertClientVerifyAlias;
	}

	public void setXForwardedFor_ClientCertClientVerifyAlias(String xForwardedFor_ClientCertClientVerifyAlias) {
		this.xForwardedFor_ClientCertClientVerifyAlias = xForwardedFor_ClientCertClientVerifyAlias;
	}

	public List<Rule> getRules() {
		return this.rules;
	}

	public void setRules(List<Rule> rules) {
		this.rules = rules;
	}

	public List<DomainExtension> getDomainExtensions() {
		return this.domainExtensions;
	}

	public void setDomainExtensions(List<DomainExtension> domainExtensions) {
		this.domainExtensions = domainExtensions;
	}

	public List<ServerCertificate2> getServerCertificates() {
		return this.serverCertificates;
	}

	public void setServerCertificates(List<ServerCertificate2> serverCertificates) {
		this.serverCertificates = serverCertificates;
	}

	public List<String> getAclIds() {
		return this.aclIds;
	}

	public void setAclIds(List<String> aclIds) {
		this.aclIds = aclIds;
	}

	public static class Rule {

		private String ruleId;

		private String ruleName;

		private String domain;

		private String url;

		private String vServerGroupId;

		public String getRuleId() {
			return this.ruleId;
		}

		public void setRuleId(String ruleId) {
			this.ruleId = ruleId;
		}

		public String getRuleName() {
			return this.ruleName;
		}

		public void setRuleName(String ruleName) {
			this.ruleName = ruleName;
		}

		public String getDomain() {
			return this.domain;
		}

		public void setDomain(String domain) {
			this.domain = domain;
		}

		public String getUrl() {
			return this.url;
		}

		public void setUrl(String url) {
			this.url = url;
		}

		public String getVServerGroupId() {
			return this.vServerGroupId;
		}

		public void setVServerGroupId(String vServerGroupId) {
			this.vServerGroupId = vServerGroupId;
		}
	}

	public static class DomainExtension {

		private String domainExtensionId;

		private String domain;

		private String serverCertificateId;

		private List<Certificate> certificates;

		private List<ServerCertificate> serverCertificates1;

		public String getDomainExtensionId() {
			return this.domainExtensionId;
		}

		public void setDomainExtensionId(String domainExtensionId) {
			this.domainExtensionId = domainExtensionId;
		}

		public String getDomain() {
			return this.domain;
		}

		public void setDomain(String domain) {
			this.domain = domain;
		}

		public String getServerCertificateId() {
			return this.serverCertificateId;
		}

		public void setServerCertificateId(String serverCertificateId) {
			this.serverCertificateId = serverCertificateId;
		}

		public List<Certificate> getCertificates() {
			return this.certificates;
		}

		public void setCertificates(List<Certificate> certificates) {
			this.certificates = certificates;
		}

		public List<ServerCertificate> getServerCertificates1() {
			return this.serverCertificates1;
		}

		public void setServerCertificates1(List<ServerCertificate> serverCertificates1) {
			this.serverCertificates1 = serverCertificates1;
		}

		public static class Certificate {

			private String certificateId;

			private String encryptionAlgorithm;

			public String getCertificateId() {
				return this.certificateId;
			}

			public void setCertificateId(String certificateId) {
				this.certificateId = certificateId;
			}

			public String getEncryptionAlgorithm() {
				return this.encryptionAlgorithm;
			}

			public void setEncryptionAlgorithm(String encryptionAlgorithm) {
				this.encryptionAlgorithm = encryptionAlgorithm;
			}
		}

		public static class ServerCertificate {

			private String certificateId;

			private String encryptionAlgorithm;

			private String standardType;

			private String bindingType;

			public String getCertificateId() {
				return this.certificateId;
			}

			public void setCertificateId(String certificateId) {
				this.certificateId = certificateId;
			}

			public String getEncryptionAlgorithm() {
				return this.encryptionAlgorithm;
			}

			public void setEncryptionAlgorithm(String encryptionAlgorithm) {
				this.encryptionAlgorithm = encryptionAlgorithm;
			}

			public String getStandardType() {
				return this.standardType;
			}

			public void setStandardType(String standardType) {
				this.standardType = standardType;
			}

			public String getBindingType() {
				return this.bindingType;
			}

			public void setBindingType(String bindingType) {
				this.bindingType = bindingType;
			}
		}
	}

	public static class ServerCertificate2 {

		private String certificateId;

		private String encryptionAlgorithm;

		private String standardType;

		private String bindingType;

		public String getCertificateId() {
			return this.certificateId;
		}

		public void setCertificateId(String certificateId) {
			this.certificateId = certificateId;
		}

		public String getEncryptionAlgorithm() {
			return this.encryptionAlgorithm;
		}

		public void setEncryptionAlgorithm(String encryptionAlgorithm) {
			this.encryptionAlgorithm = encryptionAlgorithm;
		}

		public String getStandardType() {
			return this.standardType;
		}

		public void setStandardType(String standardType) {
			this.standardType = standardType;
		}

		public String getBindingType() {
			return this.bindingType;
		}

		public void setBindingType(String bindingType) {
			this.bindingType = bindingType;
		}
	}

	@Override
	public DescribeLoadBalancerHTTPSListenerAttributeResponse getInstance(UnmarshallerContext context) {
		return	DescribeLoadBalancerHTTPSListenerAttributeResponseUnmarshaller.unmarshall(this, context);
	}
}
