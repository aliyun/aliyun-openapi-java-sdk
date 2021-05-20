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
import com.aliyuncs.slb.transform.v20140515.DescribeLoadBalancerListenersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLoadBalancerListenersResponse extends AcsResponse {

	private Integer maxResults;

	private String nextToken;

	private String requestId;

	private Integer totalCount;

	private List<Listener> listeners;

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<Listener> getListeners() {
		return this.listeners;
	}

	public void setListeners(List<Listener> listeners) {
		this.listeners = listeners;
	}

	public static class Listener {

		private String aclId;

		private String aclStatus;

		private String aclType;

		private Integer backendServerPort;

		private Integer bandwidth;

		private String description;

		private Integer listenerPort;

		private String listenerProtocol;

		private String loadBalancerId;

		private String scheduler;

		private String status;

		private String vServerGroupId;

		private List<String> aclIds;

		private HTTPListenerConfig hTTPListenerConfig;

		private HTTPSListenerConfig hTTPSListenerConfig;

		private TCPListenerConfig tCPListenerConfig;

		private TCPSListenerConfig tCPSListenerConfig;

		private UDPListenerConfig uDPListenerConfig;

		public String getAclId() {
			return this.aclId;
		}

		public void setAclId(String aclId) {
			this.aclId = aclId;
		}

		public String getAclStatus() {
			return this.aclStatus;
		}

		public void setAclStatus(String aclStatus) {
			this.aclStatus = aclStatus;
		}

		public String getAclType() {
			return this.aclType;
		}

		public void setAclType(String aclType) {
			this.aclType = aclType;
		}

		public Integer getBackendServerPort() {
			return this.backendServerPort;
		}

		public void setBackendServerPort(Integer backendServerPort) {
			this.backendServerPort = backendServerPort;
		}

		public Integer getBandwidth() {
			return this.bandwidth;
		}

		public void setBandwidth(Integer bandwidth) {
			this.bandwidth = bandwidth;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Integer getListenerPort() {
			return this.listenerPort;
		}

		public void setListenerPort(Integer listenerPort) {
			this.listenerPort = listenerPort;
		}

		public String getListenerProtocol() {
			return this.listenerProtocol;
		}

		public void setListenerProtocol(String listenerProtocol) {
			this.listenerProtocol = listenerProtocol;
		}

		public String getLoadBalancerId() {
			return this.loadBalancerId;
		}

		public void setLoadBalancerId(String loadBalancerId) {
			this.loadBalancerId = loadBalancerId;
		}

		public String getScheduler() {
			return this.scheduler;
		}

		public void setScheduler(String scheduler) {
			this.scheduler = scheduler;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getVServerGroupId() {
			return this.vServerGroupId;
		}

		public void setVServerGroupId(String vServerGroupId) {
			this.vServerGroupId = vServerGroupId;
		}

		public List<String> getAclIds() {
			return this.aclIds;
		}

		public void setAclIds(List<String> aclIds) {
			this.aclIds = aclIds;
		}

		public HTTPListenerConfig getHTTPListenerConfig() {
			return this.hTTPListenerConfig;
		}

		public void setHTTPListenerConfig(HTTPListenerConfig hTTPListenerConfig) {
			this.hTTPListenerConfig = hTTPListenerConfig;
		}

		public HTTPSListenerConfig getHTTPSListenerConfig() {
			return this.hTTPSListenerConfig;
		}

		public void setHTTPSListenerConfig(HTTPSListenerConfig hTTPSListenerConfig) {
			this.hTTPSListenerConfig = hTTPSListenerConfig;
		}

		public TCPListenerConfig getTCPListenerConfig() {
			return this.tCPListenerConfig;
		}

		public void setTCPListenerConfig(TCPListenerConfig tCPListenerConfig) {
			this.tCPListenerConfig = tCPListenerConfig;
		}

		public TCPSListenerConfig getTCPSListenerConfig() {
			return this.tCPSListenerConfig;
		}

		public void setTCPSListenerConfig(TCPSListenerConfig tCPSListenerConfig) {
			this.tCPSListenerConfig = tCPSListenerConfig;
		}

		public UDPListenerConfig getUDPListenerConfig() {
			return this.uDPListenerConfig;
		}

		public void setUDPListenerConfig(UDPListenerConfig uDPListenerConfig) {
			this.uDPListenerConfig = uDPListenerConfig;
		}

		public static class HTTPListenerConfig {

			private String cookie;

			private Integer cookieTimeout;

			private Integer forwardCode;

			private Integer forwardPort;

			private String gzip;

			private String healthCheck;

			private Integer healthCheckConnectPort;

			private String healthCheckDomain;

			private String healthCheckHttpCode;

			private String healthCheckHttpVersion;

			private Integer healthCheckInterval;

			private String healthCheckMethod;

			private Integer healthCheckTimeout;

			private String healthCheckType;

			private String healthCheckURI;

			private Integer healthyThreshold;

			private Integer idleTimeout;

			private String listenerForward;

			private Integer requestTimeout;

			private String stickySession;

			private String stickySessionType;

			private Integer unhealthyThreshold;

			private String xForwardedFor;

			private String xForwardedFor_ClientSrcPort;

			private String xForwardedFor_SLBID;

			private String xForwardedFor_SLBIP;

			private String xForwardedFor_SLBPORT;

			private String xForwardedFor_proto;

			public String getCookie() {
				return this.cookie;
			}

			public void setCookie(String cookie) {
				this.cookie = cookie;
			}

			public Integer getCookieTimeout() {
				return this.cookieTimeout;
			}

			public void setCookieTimeout(Integer cookieTimeout) {
				this.cookieTimeout = cookieTimeout;
			}

			public Integer getForwardCode() {
				return this.forwardCode;
			}

			public void setForwardCode(Integer forwardCode) {
				this.forwardCode = forwardCode;
			}

			public Integer getForwardPort() {
				return this.forwardPort;
			}

			public void setForwardPort(Integer forwardPort) {
				this.forwardPort = forwardPort;
			}

			public String getGzip() {
				return this.gzip;
			}

			public void setGzip(String gzip) {
				this.gzip = gzip;
			}

			public String getHealthCheck() {
				return this.healthCheck;
			}

			public void setHealthCheck(String healthCheck) {
				this.healthCheck = healthCheck;
			}

			public Integer getHealthCheckConnectPort() {
				return this.healthCheckConnectPort;
			}

			public void setHealthCheckConnectPort(Integer healthCheckConnectPort) {
				this.healthCheckConnectPort = healthCheckConnectPort;
			}

			public String getHealthCheckDomain() {
				return this.healthCheckDomain;
			}

			public void setHealthCheckDomain(String healthCheckDomain) {
				this.healthCheckDomain = healthCheckDomain;
			}

			public String getHealthCheckHttpCode() {
				return this.healthCheckHttpCode;
			}

			public void setHealthCheckHttpCode(String healthCheckHttpCode) {
				this.healthCheckHttpCode = healthCheckHttpCode;
			}

			public String getHealthCheckHttpVersion() {
				return this.healthCheckHttpVersion;
			}

			public void setHealthCheckHttpVersion(String healthCheckHttpVersion) {
				this.healthCheckHttpVersion = healthCheckHttpVersion;
			}

			public Integer getHealthCheckInterval() {
				return this.healthCheckInterval;
			}

			public void setHealthCheckInterval(Integer healthCheckInterval) {
				this.healthCheckInterval = healthCheckInterval;
			}

			public String getHealthCheckMethod() {
				return this.healthCheckMethod;
			}

			public void setHealthCheckMethod(String healthCheckMethod) {
				this.healthCheckMethod = healthCheckMethod;
			}

			public Integer getHealthCheckTimeout() {
				return this.healthCheckTimeout;
			}

			public void setHealthCheckTimeout(Integer healthCheckTimeout) {
				this.healthCheckTimeout = healthCheckTimeout;
			}

			public String getHealthCheckType() {
				return this.healthCheckType;
			}

			public void setHealthCheckType(String healthCheckType) {
				this.healthCheckType = healthCheckType;
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

			public Integer getIdleTimeout() {
				return this.idleTimeout;
			}

			public void setIdleTimeout(Integer idleTimeout) {
				this.idleTimeout = idleTimeout;
			}

			public String getListenerForward() {
				return this.listenerForward;
			}

			public void setListenerForward(String listenerForward) {
				this.listenerForward = listenerForward;
			}

			public Integer getRequestTimeout() {
				return this.requestTimeout;
			}

			public void setRequestTimeout(Integer requestTimeout) {
				this.requestTimeout = requestTimeout;
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

			public Integer getUnhealthyThreshold() {
				return this.unhealthyThreshold;
			}

			public void setUnhealthyThreshold(Integer unhealthyThreshold) {
				this.unhealthyThreshold = unhealthyThreshold;
			}

			public String getXForwardedFor() {
				return this.xForwardedFor;
			}

			public void setXForwardedFor(String xForwardedFor) {
				this.xForwardedFor = xForwardedFor;
			}

			public String getXForwardedFor_ClientSrcPort() {
				return this.xForwardedFor_ClientSrcPort;
			}

			public void setXForwardedFor_ClientSrcPort(String xForwardedFor_ClientSrcPort) {
				this.xForwardedFor_ClientSrcPort = xForwardedFor_ClientSrcPort;
			}

			public String getXForwardedFor_SLBID() {
				return this.xForwardedFor_SLBID;
			}

			public void setXForwardedFor_SLBID(String xForwardedFor_SLBID) {
				this.xForwardedFor_SLBID = xForwardedFor_SLBID;
			}

			public String getXForwardedFor_SLBIP() {
				return this.xForwardedFor_SLBIP;
			}

			public void setXForwardedFor_SLBIP(String xForwardedFor_SLBIP) {
				this.xForwardedFor_SLBIP = xForwardedFor_SLBIP;
			}

			public String getXForwardedFor_SLBPORT() {
				return this.xForwardedFor_SLBPORT;
			}

			public void setXForwardedFor_SLBPORT(String xForwardedFor_SLBPORT) {
				this.xForwardedFor_SLBPORT = xForwardedFor_SLBPORT;
			}

			public String getXForwardedFor_proto() {
				return this.xForwardedFor_proto;
			}

			public void setXForwardedFor_proto(String xForwardedFor_proto) {
				this.xForwardedFor_proto = xForwardedFor_proto;
			}
		}

		public static class HTTPSListenerConfig {

			private String cACertificateId;

			private String cookie;

			private Integer cookieTimeout;

			private String enableHttp2;

			private String gzip;

			private String healthCheck;

			private Integer healthCheckConnectPort;

			private String healthCheckDomain;

			private String healthCheckHttpCode;

			private String healthCheckHttpVersion;

			private Integer healthCheckInterval;

			private String healthCheckMethod;

			private Integer healthCheckTimeout;

			private String healthCheckType;

			private String healthCheckURI;

			private Integer healthyThreshold;

			private Integer idleTimeout;

			private Integer requestTimeout;

			private String serverCertificateId;

			private String stickySession;

			private String stickySessionType;

			private String tLSCipherPolicy;

			private Integer unhealthyThreshold;

			private String xForwardedFor;

			private String xForwardedFor_ClientCertClientVerify;

			private String xForwardedFor_ClientCertClientVerifyAlias;

			private String xForwardedFor_ClientCertFingerprint;

			private String xForwardedFor_ClientCertFingerprintAlias;

			private String xForwardedFor_ClientCertIssuerDN;

			private String xForwardedFor_ClientCertIssuerDNAlias;

			private String xForwardedFor_ClientCertSubjectDN;

			private String xForwardedFor_ClientCertSubjectDNAlias;

			private String xForwardedFor_ClientSrcPort;

			private String xForwardedFor_SLBID;

			private String xForwardedFor_SLBIP;

			private String xForwardedFor_SLBPORT;

			private String xForwardedFor_proto;

			public String getCACertificateId() {
				return this.cACertificateId;
			}

			public void setCACertificateId(String cACertificateId) {
				this.cACertificateId = cACertificateId;
			}

			public String getCookie() {
				return this.cookie;
			}

			public void setCookie(String cookie) {
				this.cookie = cookie;
			}

			public Integer getCookieTimeout() {
				return this.cookieTimeout;
			}

			public void setCookieTimeout(Integer cookieTimeout) {
				this.cookieTimeout = cookieTimeout;
			}

			public String getEnableHttp2() {
				return this.enableHttp2;
			}

			public void setEnableHttp2(String enableHttp2) {
				this.enableHttp2 = enableHttp2;
			}

			public String getGzip() {
				return this.gzip;
			}

			public void setGzip(String gzip) {
				this.gzip = gzip;
			}

			public String getHealthCheck() {
				return this.healthCheck;
			}

			public void setHealthCheck(String healthCheck) {
				this.healthCheck = healthCheck;
			}

			public Integer getHealthCheckConnectPort() {
				return this.healthCheckConnectPort;
			}

			public void setHealthCheckConnectPort(Integer healthCheckConnectPort) {
				this.healthCheckConnectPort = healthCheckConnectPort;
			}

			public String getHealthCheckDomain() {
				return this.healthCheckDomain;
			}

			public void setHealthCheckDomain(String healthCheckDomain) {
				this.healthCheckDomain = healthCheckDomain;
			}

			public String getHealthCheckHttpCode() {
				return this.healthCheckHttpCode;
			}

			public void setHealthCheckHttpCode(String healthCheckHttpCode) {
				this.healthCheckHttpCode = healthCheckHttpCode;
			}

			public String getHealthCheckHttpVersion() {
				return this.healthCheckHttpVersion;
			}

			public void setHealthCheckHttpVersion(String healthCheckHttpVersion) {
				this.healthCheckHttpVersion = healthCheckHttpVersion;
			}

			public Integer getHealthCheckInterval() {
				return this.healthCheckInterval;
			}

			public void setHealthCheckInterval(Integer healthCheckInterval) {
				this.healthCheckInterval = healthCheckInterval;
			}

			public String getHealthCheckMethod() {
				return this.healthCheckMethod;
			}

			public void setHealthCheckMethod(String healthCheckMethod) {
				this.healthCheckMethod = healthCheckMethod;
			}

			public Integer getHealthCheckTimeout() {
				return this.healthCheckTimeout;
			}

			public void setHealthCheckTimeout(Integer healthCheckTimeout) {
				this.healthCheckTimeout = healthCheckTimeout;
			}

			public String getHealthCheckType() {
				return this.healthCheckType;
			}

			public void setHealthCheckType(String healthCheckType) {
				this.healthCheckType = healthCheckType;
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

			public Integer getIdleTimeout() {
				return this.idleTimeout;
			}

			public void setIdleTimeout(Integer idleTimeout) {
				this.idleTimeout = idleTimeout;
			}

			public Integer getRequestTimeout() {
				return this.requestTimeout;
			}

			public void setRequestTimeout(Integer requestTimeout) {
				this.requestTimeout = requestTimeout;
			}

			public String getServerCertificateId() {
				return this.serverCertificateId;
			}

			public void setServerCertificateId(String serverCertificateId) {
				this.serverCertificateId = serverCertificateId;
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

			public String getTLSCipherPolicy() {
				return this.tLSCipherPolicy;
			}

			public void setTLSCipherPolicy(String tLSCipherPolicy) {
				this.tLSCipherPolicy = tLSCipherPolicy;
			}

			public Integer getUnhealthyThreshold() {
				return this.unhealthyThreshold;
			}

			public void setUnhealthyThreshold(Integer unhealthyThreshold) {
				this.unhealthyThreshold = unhealthyThreshold;
			}

			public String getXForwardedFor() {
				return this.xForwardedFor;
			}

			public void setXForwardedFor(String xForwardedFor) {
				this.xForwardedFor = xForwardedFor;
			}

			public String getXForwardedFor_ClientCertClientVerify() {
				return this.xForwardedFor_ClientCertClientVerify;
			}

			public void setXForwardedFor_ClientCertClientVerify(String xForwardedFor_ClientCertClientVerify) {
				this.xForwardedFor_ClientCertClientVerify = xForwardedFor_ClientCertClientVerify;
			}

			public String getXForwardedFor_ClientCertClientVerifyAlias() {
				return this.xForwardedFor_ClientCertClientVerifyAlias;
			}

			public void setXForwardedFor_ClientCertClientVerifyAlias(String xForwardedFor_ClientCertClientVerifyAlias) {
				this.xForwardedFor_ClientCertClientVerifyAlias = xForwardedFor_ClientCertClientVerifyAlias;
			}

			public String getXForwardedFor_ClientCertFingerprint() {
				return this.xForwardedFor_ClientCertFingerprint;
			}

			public void setXForwardedFor_ClientCertFingerprint(String xForwardedFor_ClientCertFingerprint) {
				this.xForwardedFor_ClientCertFingerprint = xForwardedFor_ClientCertFingerprint;
			}

			public String getXForwardedFor_ClientCertFingerprintAlias() {
				return this.xForwardedFor_ClientCertFingerprintAlias;
			}

			public void setXForwardedFor_ClientCertFingerprintAlias(String xForwardedFor_ClientCertFingerprintAlias) {
				this.xForwardedFor_ClientCertFingerprintAlias = xForwardedFor_ClientCertFingerprintAlias;
			}

			public String getXForwardedFor_ClientCertIssuerDN() {
				return this.xForwardedFor_ClientCertIssuerDN;
			}

			public void setXForwardedFor_ClientCertIssuerDN(String xForwardedFor_ClientCertIssuerDN) {
				this.xForwardedFor_ClientCertIssuerDN = xForwardedFor_ClientCertIssuerDN;
			}

			public String getXForwardedFor_ClientCertIssuerDNAlias() {
				return this.xForwardedFor_ClientCertIssuerDNAlias;
			}

			public void setXForwardedFor_ClientCertIssuerDNAlias(String xForwardedFor_ClientCertIssuerDNAlias) {
				this.xForwardedFor_ClientCertIssuerDNAlias = xForwardedFor_ClientCertIssuerDNAlias;
			}

			public String getXForwardedFor_ClientCertSubjectDN() {
				return this.xForwardedFor_ClientCertSubjectDN;
			}

			public void setXForwardedFor_ClientCertSubjectDN(String xForwardedFor_ClientCertSubjectDN) {
				this.xForwardedFor_ClientCertSubjectDN = xForwardedFor_ClientCertSubjectDN;
			}

			public String getXForwardedFor_ClientCertSubjectDNAlias() {
				return this.xForwardedFor_ClientCertSubjectDNAlias;
			}

			public void setXForwardedFor_ClientCertSubjectDNAlias(String xForwardedFor_ClientCertSubjectDNAlias) {
				this.xForwardedFor_ClientCertSubjectDNAlias = xForwardedFor_ClientCertSubjectDNAlias;
			}

			public String getXForwardedFor_ClientSrcPort() {
				return this.xForwardedFor_ClientSrcPort;
			}

			public void setXForwardedFor_ClientSrcPort(String xForwardedFor_ClientSrcPort) {
				this.xForwardedFor_ClientSrcPort = xForwardedFor_ClientSrcPort;
			}

			public String getXForwardedFor_SLBID() {
				return this.xForwardedFor_SLBID;
			}

			public void setXForwardedFor_SLBID(String xForwardedFor_SLBID) {
				this.xForwardedFor_SLBID = xForwardedFor_SLBID;
			}

			public String getXForwardedFor_SLBIP() {
				return this.xForwardedFor_SLBIP;
			}

			public void setXForwardedFor_SLBIP(String xForwardedFor_SLBIP) {
				this.xForwardedFor_SLBIP = xForwardedFor_SLBIP;
			}

			public String getXForwardedFor_SLBPORT() {
				return this.xForwardedFor_SLBPORT;
			}

			public void setXForwardedFor_SLBPORT(String xForwardedFor_SLBPORT) {
				this.xForwardedFor_SLBPORT = xForwardedFor_SLBPORT;
			}

			public String getXForwardedFor_proto() {
				return this.xForwardedFor_proto;
			}

			public void setXForwardedFor_proto(String xForwardedFor_proto) {
				this.xForwardedFor_proto = xForwardedFor_proto;
			}
		}

		public static class TCPListenerConfig {

			private String connectionDrain;

			private Integer connectionDrainTimeout;

			private Integer establishedTimeout;

			private String healthCheck;

			private Integer healthCheckConnectPort;

			private Integer healthCheckConnectTimeout;

			private String healthCheckDomain;

			private String healthCheckHttpCode;

			private Integer healthCheckInterval;

			private String healthCheckMethod;

			private String healthCheckType;

			private String healthCheckURI;

			private Integer healthyThreshold;

			private String masterSlaveServerGroupId;

			private Integer persistenceTimeout;

			private Integer unhealthyThreshold;

			private String healthCheckSwitch;

			private List<PortRange> portRanges;

			public String getConnectionDrain() {
				return this.connectionDrain;
			}

			public void setConnectionDrain(String connectionDrain) {
				this.connectionDrain = connectionDrain;
			}

			public Integer getConnectionDrainTimeout() {
				return this.connectionDrainTimeout;
			}

			public void setConnectionDrainTimeout(Integer connectionDrainTimeout) {
				this.connectionDrainTimeout = connectionDrainTimeout;
			}

			public Integer getEstablishedTimeout() {
				return this.establishedTimeout;
			}

			public void setEstablishedTimeout(Integer establishedTimeout) {
				this.establishedTimeout = establishedTimeout;
			}

			public String getHealthCheck() {
				return this.healthCheck;
			}

			public void setHealthCheck(String healthCheck) {
				this.healthCheck = healthCheck;
			}

			public Integer getHealthCheckConnectPort() {
				return this.healthCheckConnectPort;
			}

			public void setHealthCheckConnectPort(Integer healthCheckConnectPort) {
				this.healthCheckConnectPort = healthCheckConnectPort;
			}

			public Integer getHealthCheckConnectTimeout() {
				return this.healthCheckConnectTimeout;
			}

			public void setHealthCheckConnectTimeout(Integer healthCheckConnectTimeout) {
				this.healthCheckConnectTimeout = healthCheckConnectTimeout;
			}

			public String getHealthCheckDomain() {
				return this.healthCheckDomain;
			}

			public void setHealthCheckDomain(String healthCheckDomain) {
				this.healthCheckDomain = healthCheckDomain;
			}

			public String getHealthCheckHttpCode() {
				return this.healthCheckHttpCode;
			}

			public void setHealthCheckHttpCode(String healthCheckHttpCode) {
				this.healthCheckHttpCode = healthCheckHttpCode;
			}

			public Integer getHealthCheckInterval() {
				return this.healthCheckInterval;
			}

			public void setHealthCheckInterval(Integer healthCheckInterval) {
				this.healthCheckInterval = healthCheckInterval;
			}

			public String getHealthCheckMethod() {
				return this.healthCheckMethod;
			}

			public void setHealthCheckMethod(String healthCheckMethod) {
				this.healthCheckMethod = healthCheckMethod;
			}

			public String getHealthCheckType() {
				return this.healthCheckType;
			}

			public void setHealthCheckType(String healthCheckType) {
				this.healthCheckType = healthCheckType;
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

			public String getMasterSlaveServerGroupId() {
				return this.masterSlaveServerGroupId;
			}

			public void setMasterSlaveServerGroupId(String masterSlaveServerGroupId) {
				this.masterSlaveServerGroupId = masterSlaveServerGroupId;
			}

			public Integer getPersistenceTimeout() {
				return this.persistenceTimeout;
			}

			public void setPersistenceTimeout(Integer persistenceTimeout) {
				this.persistenceTimeout = persistenceTimeout;
			}

			public Integer getUnhealthyThreshold() {
				return this.unhealthyThreshold;
			}

			public void setUnhealthyThreshold(Integer unhealthyThreshold) {
				this.unhealthyThreshold = unhealthyThreshold;
			}

			public String getHealthCheckSwitch() {
				return this.healthCheckSwitch;
			}

			public void setHealthCheckSwitch(String healthCheckSwitch) {
				this.healthCheckSwitch = healthCheckSwitch;
			}

			public List<PortRange> getPortRanges() {
				return this.portRanges;
			}

			public void setPortRanges(List<PortRange> portRanges) {
				this.portRanges = portRanges;
			}

			public static class PortRange {

				private Integer endPort;

				private Integer startPort;

				public Integer getEndPort() {
					return this.endPort;
				}

				public void setEndPort(Integer endPort) {
					this.endPort = endPort;
				}

				public Integer getStartPort() {
					return this.startPort;
				}

				public void setStartPort(Integer startPort) {
					this.startPort = startPort;
				}
			}
		}

		public static class TCPSListenerConfig {

			private String cACertificateId;

			private String cookie;

			private Integer cookieTimeout;

			private String healthCheck;

			private Integer healthCheckConnectPort;

			private String healthCheckDomain;

			private String healthCheckHttpCode;

			private Integer healthCheckInterval;

			private String healthCheckMethod;

			private Integer healthCheckTimeout;

			private String healthCheckType;

			private String healthCheckURI;

			private Integer healthyThreshold;

			private Integer idleTimeout;

			private String serverCertificateId;

			private String stickySession;

			private String stickySessionType;

			private String tLSCipherPolicy;

			private Integer unhealthyThreshold;

			public String getCACertificateId() {
				return this.cACertificateId;
			}

			public void setCACertificateId(String cACertificateId) {
				this.cACertificateId = cACertificateId;
			}

			public String getCookie() {
				return this.cookie;
			}

			public void setCookie(String cookie) {
				this.cookie = cookie;
			}

			public Integer getCookieTimeout() {
				return this.cookieTimeout;
			}

			public void setCookieTimeout(Integer cookieTimeout) {
				this.cookieTimeout = cookieTimeout;
			}

			public String getHealthCheck() {
				return this.healthCheck;
			}

			public void setHealthCheck(String healthCheck) {
				this.healthCheck = healthCheck;
			}

			public Integer getHealthCheckConnectPort() {
				return this.healthCheckConnectPort;
			}

			public void setHealthCheckConnectPort(Integer healthCheckConnectPort) {
				this.healthCheckConnectPort = healthCheckConnectPort;
			}

			public String getHealthCheckDomain() {
				return this.healthCheckDomain;
			}

			public void setHealthCheckDomain(String healthCheckDomain) {
				this.healthCheckDomain = healthCheckDomain;
			}

			public String getHealthCheckHttpCode() {
				return this.healthCheckHttpCode;
			}

			public void setHealthCheckHttpCode(String healthCheckHttpCode) {
				this.healthCheckHttpCode = healthCheckHttpCode;
			}

			public Integer getHealthCheckInterval() {
				return this.healthCheckInterval;
			}

			public void setHealthCheckInterval(Integer healthCheckInterval) {
				this.healthCheckInterval = healthCheckInterval;
			}

			public String getHealthCheckMethod() {
				return this.healthCheckMethod;
			}

			public void setHealthCheckMethod(String healthCheckMethod) {
				this.healthCheckMethod = healthCheckMethod;
			}

			public Integer getHealthCheckTimeout() {
				return this.healthCheckTimeout;
			}

			public void setHealthCheckTimeout(Integer healthCheckTimeout) {
				this.healthCheckTimeout = healthCheckTimeout;
			}

			public String getHealthCheckType() {
				return this.healthCheckType;
			}

			public void setHealthCheckType(String healthCheckType) {
				this.healthCheckType = healthCheckType;
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

			public Integer getIdleTimeout() {
				return this.idleTimeout;
			}

			public void setIdleTimeout(Integer idleTimeout) {
				this.idleTimeout = idleTimeout;
			}

			public String getServerCertificateId() {
				return this.serverCertificateId;
			}

			public void setServerCertificateId(String serverCertificateId) {
				this.serverCertificateId = serverCertificateId;
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

			public String getTLSCipherPolicy() {
				return this.tLSCipherPolicy;
			}

			public void setTLSCipherPolicy(String tLSCipherPolicy) {
				this.tLSCipherPolicy = tLSCipherPolicy;
			}

			public Integer getUnhealthyThreshold() {
				return this.unhealthyThreshold;
			}

			public void setUnhealthyThreshold(Integer unhealthyThreshold) {
				this.unhealthyThreshold = unhealthyThreshold;
			}
		}

		public static class UDPListenerConfig {

			private String connectionDrain;

			private Integer connectionDrainTimeout;

			private String healthCheck;

			private Integer healthCheckConnectPort;

			private Integer healthCheckConnectTimeout;

			private String healthCheckDomain;

			private String healthCheckExp;

			private String healthCheckHttpCode;

			private Integer healthCheckInterval;

			private String healthCheckMethod;

			private String healthCheckReq;

			private String healthCheckType;

			private String healthCheckURI;

			private Integer healthyThreshold;

			private String masterSlaveServerGroupId;

			private Integer unhealthyThreshold;

			private String healthCheckSwitch;

			private List<PortRange2> portRanges1;

			public String getConnectionDrain() {
				return this.connectionDrain;
			}

			public void setConnectionDrain(String connectionDrain) {
				this.connectionDrain = connectionDrain;
			}

			public Integer getConnectionDrainTimeout() {
				return this.connectionDrainTimeout;
			}

			public void setConnectionDrainTimeout(Integer connectionDrainTimeout) {
				this.connectionDrainTimeout = connectionDrainTimeout;
			}

			public String getHealthCheck() {
				return this.healthCheck;
			}

			public void setHealthCheck(String healthCheck) {
				this.healthCheck = healthCheck;
			}

			public Integer getHealthCheckConnectPort() {
				return this.healthCheckConnectPort;
			}

			public void setHealthCheckConnectPort(Integer healthCheckConnectPort) {
				this.healthCheckConnectPort = healthCheckConnectPort;
			}

			public Integer getHealthCheckConnectTimeout() {
				return this.healthCheckConnectTimeout;
			}

			public void setHealthCheckConnectTimeout(Integer healthCheckConnectTimeout) {
				this.healthCheckConnectTimeout = healthCheckConnectTimeout;
			}

			public String getHealthCheckDomain() {
				return this.healthCheckDomain;
			}

			public void setHealthCheckDomain(String healthCheckDomain) {
				this.healthCheckDomain = healthCheckDomain;
			}

			public String getHealthCheckExp() {
				return this.healthCheckExp;
			}

			public void setHealthCheckExp(String healthCheckExp) {
				this.healthCheckExp = healthCheckExp;
			}

			public String getHealthCheckHttpCode() {
				return this.healthCheckHttpCode;
			}

			public void setHealthCheckHttpCode(String healthCheckHttpCode) {
				this.healthCheckHttpCode = healthCheckHttpCode;
			}

			public Integer getHealthCheckInterval() {
				return this.healthCheckInterval;
			}

			public void setHealthCheckInterval(Integer healthCheckInterval) {
				this.healthCheckInterval = healthCheckInterval;
			}

			public String getHealthCheckMethod() {
				return this.healthCheckMethod;
			}

			public void setHealthCheckMethod(String healthCheckMethod) {
				this.healthCheckMethod = healthCheckMethod;
			}

			public String getHealthCheckReq() {
				return this.healthCheckReq;
			}

			public void setHealthCheckReq(String healthCheckReq) {
				this.healthCheckReq = healthCheckReq;
			}

			public String getHealthCheckType() {
				return this.healthCheckType;
			}

			public void setHealthCheckType(String healthCheckType) {
				this.healthCheckType = healthCheckType;
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

			public String getMasterSlaveServerGroupId() {
				return this.masterSlaveServerGroupId;
			}

			public void setMasterSlaveServerGroupId(String masterSlaveServerGroupId) {
				this.masterSlaveServerGroupId = masterSlaveServerGroupId;
			}

			public Integer getUnhealthyThreshold() {
				return this.unhealthyThreshold;
			}

			public void setUnhealthyThreshold(Integer unhealthyThreshold) {
				this.unhealthyThreshold = unhealthyThreshold;
			}

			public String getHealthCheckSwitch() {
				return this.healthCheckSwitch;
			}

			public void setHealthCheckSwitch(String healthCheckSwitch) {
				this.healthCheckSwitch = healthCheckSwitch;
			}

			public List<PortRange2> getPortRanges1() {
				return this.portRanges1;
			}

			public void setPortRanges1(List<PortRange2> portRanges1) {
				this.portRanges1 = portRanges1;
			}

			public static class PortRange2 {

				private Integer endPort;

				private Integer startPort;

				public Integer getEndPort() {
					return this.endPort;
				}

				public void setEndPort(Integer endPort) {
					this.endPort = endPort;
				}

				public Integer getStartPort() {
					return this.startPort;
				}

				public void setStartPort(Integer startPort) {
					this.startPort = startPort;
				}
			}
		}
	}

	@Override
	public DescribeLoadBalancerListenersResponse getInstance(UnmarshallerContext context) {
		return	DescribeLoadBalancerListenersResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
