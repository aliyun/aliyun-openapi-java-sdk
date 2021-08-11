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

package com.aliyuncs.alb.model.v20200616;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.alb.transform.v20200616.GetListenerAttributeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetListenerAttributeResponse extends AcsResponse {

	private Boolean caEnabled;

	private Boolean gzipEnabled;

	private Boolean http2Enabled;

	private Integer idleTimeout;

	private String listenerDescription;

	private String listenerId;

	private Integer listenerPort;

	private String listenerProtocol;

	private String listenerStatus;

	private String loadBalancerId;

	private String requestId;

	private Integer requestTimeout;

	private String securityPolicyId;

	private List<Certificate> certificates;

	private List<DefaultAction> defaultActions;

	private AclConfig aclConfig;

	private LogConfig logConfig;

	private QuicConfig quicConfig;

	private XForwardedForConfig xForwardedForConfig;

	public Boolean getCaEnabled() {
		return this.caEnabled;
	}

	public void setCaEnabled(Boolean caEnabled) {
		this.caEnabled = caEnabled;
	}

	public Boolean getGzipEnabled() {
		return this.gzipEnabled;
	}

	public void setGzipEnabled(Boolean gzipEnabled) {
		this.gzipEnabled = gzipEnabled;
	}

	public Boolean getHttp2Enabled() {
		return this.http2Enabled;
	}

	public void setHttp2Enabled(Boolean http2Enabled) {
		this.http2Enabled = http2Enabled;
	}

	public Integer getIdleTimeout() {
		return this.idleTimeout;
	}

	public void setIdleTimeout(Integer idleTimeout) {
		this.idleTimeout = idleTimeout;
	}

	public String getListenerDescription() {
		return this.listenerDescription;
	}

	public void setListenerDescription(String listenerDescription) {
		this.listenerDescription = listenerDescription;
	}

	public String getListenerId() {
		return this.listenerId;
	}

	public void setListenerId(String listenerId) {
		this.listenerId = listenerId;
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

	public String getListenerStatus() {
		return this.listenerStatus;
	}

	public void setListenerStatus(String listenerStatus) {
		this.listenerStatus = listenerStatus;
	}

	public String getLoadBalancerId() {
		return this.loadBalancerId;
	}

	public void setLoadBalancerId(String loadBalancerId) {
		this.loadBalancerId = loadBalancerId;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getRequestTimeout() {
		return this.requestTimeout;
	}

	public void setRequestTimeout(Integer requestTimeout) {
		this.requestTimeout = requestTimeout;
	}

	public String getSecurityPolicyId() {
		return this.securityPolicyId;
	}

	public void setSecurityPolicyId(String securityPolicyId) {
		this.securityPolicyId = securityPolicyId;
	}

	public List<Certificate> getCertificates() {
		return this.certificates;
	}

	public void setCertificates(List<Certificate> certificates) {
		this.certificates = certificates;
	}

	public List<DefaultAction> getDefaultActions() {
		return this.defaultActions;
	}

	public void setDefaultActions(List<DefaultAction> defaultActions) {
		this.defaultActions = defaultActions;
	}

	public AclConfig getAclConfig() {
		return this.aclConfig;
	}

	public void setAclConfig(AclConfig aclConfig) {
		this.aclConfig = aclConfig;
	}

	public LogConfig getLogConfig() {
		return this.logConfig;
	}

	public void setLogConfig(LogConfig logConfig) {
		this.logConfig = logConfig;
	}

	public QuicConfig getQuicConfig() {
		return this.quicConfig;
	}

	public void setQuicConfig(QuicConfig quicConfig) {
		this.quicConfig = quicConfig;
	}

	public XForwardedForConfig getXForwardedForConfig() {
		return this.xForwardedForConfig;
	}

	public void setXForwardedForConfig(XForwardedForConfig xForwardedForConfig) {
		this.xForwardedForConfig = xForwardedForConfig;
	}

	public static class Certificate {

		private String certificateId;

		public String getCertificateId() {
			return this.certificateId;
		}

		public void setCertificateId(String certificateId) {
			this.certificateId = certificateId;
		}
	}

	public static class DefaultAction {

		private String type;

		private ForwardGroupConfig forwardGroupConfig;

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public ForwardGroupConfig getForwardGroupConfig() {
			return this.forwardGroupConfig;
		}

		public void setForwardGroupConfig(ForwardGroupConfig forwardGroupConfig) {
			this.forwardGroupConfig = forwardGroupConfig;
		}

		public static class ForwardGroupConfig {

			private List<ServerGroupTuple> serverGroupTuples;

			public List<ServerGroupTuple> getServerGroupTuples() {
				return this.serverGroupTuples;
			}

			public void setServerGroupTuples(List<ServerGroupTuple> serverGroupTuples) {
				this.serverGroupTuples = serverGroupTuples;
			}

			public static class ServerGroupTuple {

				private String serverGroupId;

				public String getServerGroupId() {
					return this.serverGroupId;
				}

				public void setServerGroupId(String serverGroupId) {
					this.serverGroupId = serverGroupId;
				}
			}
		}
	}

	public static class AclConfig {

		private String aclType;

		private List<AclRelation> aclRelations;

		public String getAclType() {
			return this.aclType;
		}

		public void setAclType(String aclType) {
			this.aclType = aclType;
		}

		public List<AclRelation> getAclRelations() {
			return this.aclRelations;
		}

		public void setAclRelations(List<AclRelation> aclRelations) {
			this.aclRelations = aclRelations;
		}

		public static class AclRelation {

			private String aclId;

			private String status;

			public String getAclId() {
				return this.aclId;
			}

			public void setAclId(String aclId) {
				this.aclId = aclId;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}
		}
	}

	public static class LogConfig {

		private Boolean accessLogRecordCustomizedHeadersEnabled;

		private AccessLogTracingConfig accessLogTracingConfig;

		public Boolean getAccessLogRecordCustomizedHeadersEnabled() {
			return this.accessLogRecordCustomizedHeadersEnabled;
		}

		public void setAccessLogRecordCustomizedHeadersEnabled(Boolean accessLogRecordCustomizedHeadersEnabled) {
			this.accessLogRecordCustomizedHeadersEnabled = accessLogRecordCustomizedHeadersEnabled;
		}

		public AccessLogTracingConfig getAccessLogTracingConfig() {
			return this.accessLogTracingConfig;
		}

		public void setAccessLogTracingConfig(AccessLogTracingConfig accessLogTracingConfig) {
			this.accessLogTracingConfig = accessLogTracingConfig;
		}

		public static class AccessLogTracingConfig {

			private Boolean tracingEnabled;

			private Integer tracingSample;

			private String tracingType;

			public Boolean getTracingEnabled() {
				return this.tracingEnabled;
			}

			public void setTracingEnabled(Boolean tracingEnabled) {
				this.tracingEnabled = tracingEnabled;
			}

			public Integer getTracingSample() {
				return this.tracingSample;
			}

			public void setTracingSample(Integer tracingSample) {
				this.tracingSample = tracingSample;
			}

			public String getTracingType() {
				return this.tracingType;
			}

			public void setTracingType(String tracingType) {
				this.tracingType = tracingType;
			}
		}
	}

	public static class QuicConfig {

		private String quicListenerId;

		private Boolean quicUpgradeEnabled;

		public String getQuicListenerId() {
			return this.quicListenerId;
		}

		public void setQuicListenerId(String quicListenerId) {
			this.quicListenerId = quicListenerId;
		}

		public Boolean getQuicUpgradeEnabled() {
			return this.quicUpgradeEnabled;
		}

		public void setQuicUpgradeEnabled(Boolean quicUpgradeEnabled) {
			this.quicUpgradeEnabled = quicUpgradeEnabled;
		}
	}

	public static class XForwardedForConfig {

		private String xForwardedForClientCertClientVerifyAlias;

		private Boolean xForwardedForClientCertClientVerifyEnabled;

		private String xForwardedForClientCertFingerprintAlias;

		private Boolean xForwardedForClientCertFingerprintEnabled;

		private String xForwardedForClientCertIssuerDNAlias;

		private Boolean xForwardedForClientCertIssuerDNEnabled;

		private String xForwardedForClientCertSubjectDNAlias;

		private Boolean xForwardedForClientCertSubjectDNEnabled;

		private Boolean xForwardedForClientSrcPortEnabled;

		private Boolean xForwardedForEnabled;

		private Boolean xForwardedForProtoEnabled;

		private Boolean xForwardedForSLBIdEnabled;

		private Boolean xForwardedForSLBPortEnabled;

		public String getXForwardedForClientCertClientVerifyAlias() {
			return this.xForwardedForClientCertClientVerifyAlias;
		}

		public void setXForwardedForClientCertClientVerifyAlias(String xForwardedForClientCertClientVerifyAlias) {
			this.xForwardedForClientCertClientVerifyAlias = xForwardedForClientCertClientVerifyAlias;
		}

		public Boolean getXForwardedForClientCertClientVerifyEnabled() {
			return this.xForwardedForClientCertClientVerifyEnabled;
		}

		public void setXForwardedForClientCertClientVerifyEnabled(Boolean xForwardedForClientCertClientVerifyEnabled) {
			this.xForwardedForClientCertClientVerifyEnabled = xForwardedForClientCertClientVerifyEnabled;
		}

		public String getXForwardedForClientCertFingerprintAlias() {
			return this.xForwardedForClientCertFingerprintAlias;
		}

		public void setXForwardedForClientCertFingerprintAlias(String xForwardedForClientCertFingerprintAlias) {
			this.xForwardedForClientCertFingerprintAlias = xForwardedForClientCertFingerprintAlias;
		}

		public Boolean getXForwardedForClientCertFingerprintEnabled() {
			return this.xForwardedForClientCertFingerprintEnabled;
		}

		public void setXForwardedForClientCertFingerprintEnabled(Boolean xForwardedForClientCertFingerprintEnabled) {
			this.xForwardedForClientCertFingerprintEnabled = xForwardedForClientCertFingerprintEnabled;
		}

		public String getXForwardedForClientCertIssuerDNAlias() {
			return this.xForwardedForClientCertIssuerDNAlias;
		}

		public void setXForwardedForClientCertIssuerDNAlias(String xForwardedForClientCertIssuerDNAlias) {
			this.xForwardedForClientCertIssuerDNAlias = xForwardedForClientCertIssuerDNAlias;
		}

		public Boolean getXForwardedForClientCertIssuerDNEnabled() {
			return this.xForwardedForClientCertIssuerDNEnabled;
		}

		public void setXForwardedForClientCertIssuerDNEnabled(Boolean xForwardedForClientCertIssuerDNEnabled) {
			this.xForwardedForClientCertIssuerDNEnabled = xForwardedForClientCertIssuerDNEnabled;
		}

		public String getXForwardedForClientCertSubjectDNAlias() {
			return this.xForwardedForClientCertSubjectDNAlias;
		}

		public void setXForwardedForClientCertSubjectDNAlias(String xForwardedForClientCertSubjectDNAlias) {
			this.xForwardedForClientCertSubjectDNAlias = xForwardedForClientCertSubjectDNAlias;
		}

		public Boolean getXForwardedForClientCertSubjectDNEnabled() {
			return this.xForwardedForClientCertSubjectDNEnabled;
		}

		public void setXForwardedForClientCertSubjectDNEnabled(Boolean xForwardedForClientCertSubjectDNEnabled) {
			this.xForwardedForClientCertSubjectDNEnabled = xForwardedForClientCertSubjectDNEnabled;
		}

		public Boolean getXForwardedForClientSrcPortEnabled() {
			return this.xForwardedForClientSrcPortEnabled;
		}

		public void setXForwardedForClientSrcPortEnabled(Boolean xForwardedForClientSrcPortEnabled) {
			this.xForwardedForClientSrcPortEnabled = xForwardedForClientSrcPortEnabled;
		}

		public Boolean getXForwardedForEnabled() {
			return this.xForwardedForEnabled;
		}

		public void setXForwardedForEnabled(Boolean xForwardedForEnabled) {
			this.xForwardedForEnabled = xForwardedForEnabled;
		}

		public Boolean getXForwardedForProtoEnabled() {
			return this.xForwardedForProtoEnabled;
		}

		public void setXForwardedForProtoEnabled(Boolean xForwardedForProtoEnabled) {
			this.xForwardedForProtoEnabled = xForwardedForProtoEnabled;
		}

		public Boolean getXForwardedForSLBIdEnabled() {
			return this.xForwardedForSLBIdEnabled;
		}

		public void setXForwardedForSLBIdEnabled(Boolean xForwardedForSLBIdEnabled) {
			this.xForwardedForSLBIdEnabled = xForwardedForSLBIdEnabled;
		}

		public Boolean getXForwardedForSLBPortEnabled() {
			return this.xForwardedForSLBPortEnabled;
		}

		public void setXForwardedForSLBPortEnabled(Boolean xForwardedForSLBPortEnabled) {
			this.xForwardedForSLBPortEnabled = xForwardedForSLBPortEnabled;
		}
	}

	@Override
	public GetListenerAttributeResponse getInstance(UnmarshallerContext context) {
		return	GetListenerAttributeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
