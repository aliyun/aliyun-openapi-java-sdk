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

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.alb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateListenerAttributeRequest extends RpcAcsRequest<UpdateListenerAttributeResponse> {
	   

	private String clientToken;

	private Boolean gzipEnabled;

	private String listenerId;

	private QuicConfig quicConfig;

	private Boolean http2Enabled;

	private List<DefaultActions> defaultActions;

	private Boolean dryRun;

	private Integer requestTimeout;

	private XForwardedForConfig xForwardedForConfig;

	private String securityPolicyId;

	private Integer idleTimeout;

	private List<Certificates> certificates;

	private String listenerDescription;
	public UpdateListenerAttributeRequest() {
		super("Alb", "2020-06-16", "UpdateListenerAttribute", "alb");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public Boolean getGzipEnabled() {
		return this.gzipEnabled;
	}

	public void setGzipEnabled(Boolean gzipEnabled) {
		this.gzipEnabled = gzipEnabled;
		if(gzipEnabled != null){
			putQueryParameter("GzipEnabled", gzipEnabled.toString());
		}
	}

	public String getListenerId() {
		return this.listenerId;
	}

	public void setListenerId(String listenerId) {
		this.listenerId = listenerId;
		if(listenerId != null){
			putQueryParameter("ListenerId", listenerId);
		}
	}

	public QuicConfig getQuicConfig() {
		return this.quicConfig;
	}

	public void setQuicConfig(QuicConfig quicConfig) {
		this.quicConfig = quicConfig;	
		if (quicConfig != null) {
			
				putQueryParameter("QuicConfig.QuicUpgradeEnabled" , quicConfig.getQuicUpgradeEnabled());
				putQueryParameter("QuicConfig.QuicListenerId" , quicConfig.getQuicListenerId());
		}	
	}

	public Boolean getHttp2Enabled() {
		return this.http2Enabled;
	}

	public void setHttp2Enabled(Boolean http2Enabled) {
		this.http2Enabled = http2Enabled;
		if(http2Enabled != null){
			putQueryParameter("Http2Enabled", http2Enabled.toString());
		}
	}

	public List<DefaultActions> getDefaultActions() {
		return this.defaultActions;
	}

	public void setDefaultActions(List<DefaultActions> defaultActions) {
		this.defaultActions = defaultActions;	
		if (defaultActions != null) {
			for (int depth1 = 0; depth1 < defaultActions.size(); depth1++) {
				if (defaultActions.get(depth1) != null) {
					
						if (defaultActions.get(depth1).getForwardGroupConfig() != null) {
							
								if (defaultActions.get(depth1).getForwardGroupConfig().getServerGroupTuples() != null) {
									for (int depth2 = 0; depth2 < defaultActions.get(depth1).getForwardGroupConfig().getServerGroupTuples().size(); depth2++) {
										if (defaultActions.get(depth1).getForwardGroupConfig().getServerGroupTuples().get(depth2) != null) {
											
												putQueryParameter("DefaultActions." + (depth1 + 1) + ".ForwardGroupConfig.ServerGroupTuples." + (depth2 + 1) + ".ServerGroupId" , defaultActions.get(depth1).getForwardGroupConfig().getServerGroupTuples().get(depth2).getServerGroupId());
										}
									}
								}
						}
						putQueryParameter("DefaultActions." + (depth1 + 1) + ".Type" , defaultActions.get(depth1).getType());
				}
			}
		}	
	}

	public Boolean getDryRun() {
		return this.dryRun;
	}

	public void setDryRun(Boolean dryRun) {
		this.dryRun = dryRun;
		if(dryRun != null){
			putQueryParameter("DryRun", dryRun.toString());
		}
	}

	public Integer getRequestTimeout() {
		return this.requestTimeout;
	}

	public void setRequestTimeout(Integer requestTimeout) {
		this.requestTimeout = requestTimeout;
		if(requestTimeout != null){
			putQueryParameter("RequestTimeout", requestTimeout.toString());
		}
	}

	public XForwardedForConfig getXForwardedForConfig() {
		return this.xForwardedForConfig;
	}

	public void setXForwardedForConfig(XForwardedForConfig xForwardedForConfig) {
		this.xForwardedForConfig = xForwardedForConfig;	
		if (xForwardedForConfig != null) {
			
				putQueryParameter("XForwardedForConfig.XForwardedForClientCertSubjectDNAlias" , xForwardedForConfig.getXForwardedForClientCertSubjectDNAlias());
				putQueryParameter("XForwardedForConfig.XForwardedForClientCertIssuerDNEnabled" , xForwardedForConfig.getXForwardedForClientCertIssuerDNEnabled());
				putQueryParameter("XForwardedForConfig.XForwardedForClientCertFingerprintEnabled" , xForwardedForConfig.getXForwardedForClientCertFingerprintEnabled());
				putQueryParameter("XForwardedForConfig.XForwardedForClientCertIssuerDNAlias" , xForwardedForConfig.getXForwardedForClientCertIssuerDNAlias());
				putQueryParameter("XForwardedForConfig.XForwardedForProtoEnabled" , xForwardedForConfig.getXForwardedForProtoEnabled());
				putQueryParameter("XForwardedForConfig.XForwardedForClientCertFingerprintAlias" , xForwardedForConfig.getXForwardedForClientCertFingerprintAlias());
				putQueryParameter("XForwardedForConfig.XForwardedForClientCertClientVerifyEnabled" , xForwardedForConfig.getXForwardedForClientCertClientVerifyEnabled());
				putQueryParameter("XForwardedForConfig.XForwardedForSLBPortEnabled" , xForwardedForConfig.getXForwardedForSLBPortEnabled());
				putQueryParameter("XForwardedForConfig.XForwardedForClientCertSubjectDNEnabled" , xForwardedForConfig.getXForwardedForClientCertSubjectDNEnabled());
				putQueryParameter("XForwardedForConfig.XForwardedForClientCertClientVerifyAlias" , xForwardedForConfig.getXForwardedForClientCertClientVerifyAlias());
				putQueryParameter("XForwardedForConfig.XForwardedForClientSrcPortEnabled" , xForwardedForConfig.getXForwardedForClientSrcPortEnabled());
				putQueryParameter("XForwardedForConfig.XForwardedForEnabled" , xForwardedForConfig.getXForwardedForEnabled());
				putQueryParameter("XForwardedForConfig.XForwardedForSLBIdEnabled" , xForwardedForConfig.getXForwardedForSLBIdEnabled());
		}	
	}

	public String getSecurityPolicyId() {
		return this.securityPolicyId;
	}

	public void setSecurityPolicyId(String securityPolicyId) {
		this.securityPolicyId = securityPolicyId;
		if(securityPolicyId != null){
			putQueryParameter("SecurityPolicyId", securityPolicyId);
		}
	}

	public Integer getIdleTimeout() {
		return this.idleTimeout;
	}

	public void setIdleTimeout(Integer idleTimeout) {
		this.idleTimeout = idleTimeout;
		if(idleTimeout != null){
			putQueryParameter("IdleTimeout", idleTimeout.toString());
		}
	}

	public List<Certificates> getCertificates() {
		return this.certificates;
	}

	public void setCertificates(List<Certificates> certificates) {
		this.certificates = certificates;	
		if (certificates != null) {
			for (int depth1 = 0; depth1 < certificates.size(); depth1++) {
				if (certificates.get(depth1) != null) {
					
						putQueryParameter("Certificates." + (depth1 + 1) + ".CertificateId" , certificates.get(depth1).getCertificateId());
				}
			}
		}	
	}

	public String getListenerDescription() {
		return this.listenerDescription;
	}

	public void setListenerDescription(String listenerDescription) {
		this.listenerDescription = listenerDescription;
		if(listenerDescription != null){
			putQueryParameter("ListenerDescription", listenerDescription);
		}
	}

	public static class QuicConfig {

		private Boolean quicUpgradeEnabled;

		private String quicListenerId;

		public Boolean getQuicUpgradeEnabled() {
			return this.quicUpgradeEnabled;
		}

		public void setQuicUpgradeEnabled(Boolean quicUpgradeEnabled) {
			this.quicUpgradeEnabled = quicUpgradeEnabled;
		}

		public String getQuicListenerId() {
			return this.quicListenerId;
		}

		public void setQuicListenerId(String quicListenerId) {
			this.quicListenerId = quicListenerId;
		}
	}

	public static class DefaultActions {

		private ForwardGroupConfig forwardGroupConfig;

		private String type;

		public ForwardGroupConfig getForwardGroupConfig() {
			return this.forwardGroupConfig;
		}

		public void setForwardGroupConfig(ForwardGroupConfig forwardGroupConfig) {
			this.forwardGroupConfig = forwardGroupConfig;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public static class ForwardGroupConfig {

			private List<ServerGroupTuplesItem> serverGroupTuples;

			public List<ServerGroupTuplesItem> getServerGroupTuples() {
				return this.serverGroupTuples;
			}

			public void setServerGroupTuples(List<ServerGroupTuplesItem> serverGroupTuples) {
				this.serverGroupTuples = serverGroupTuples;
			}

			public static class ServerGroupTuplesItem {

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

	public static class XForwardedForConfig {

		private String xForwardedForClientCertSubjectDNAlias;

		private Boolean xForwardedForClientCertIssuerDNEnabled;

		private Boolean xForwardedForClientCertFingerprintEnabled;

		private String xForwardedForClientCertIssuerDNAlias;

		private Boolean xForwardedForProtoEnabled;

		private String xForwardedForClientCertFingerprintAlias;

		private Boolean xForwardedForClientCertClientVerifyEnabled;

		private Boolean xForwardedForSLBPortEnabled;

		private Boolean xForwardedForClientCertSubjectDNEnabled;

		private String xForwardedForClientCertClientVerifyAlias;

		private Boolean xForwardedForClientSrcPortEnabled;

		private Boolean xForwardedForEnabled;

		private Boolean xForwardedForSLBIdEnabled;

		public String getXForwardedForClientCertSubjectDNAlias() {
			return this.xForwardedForClientCertSubjectDNAlias;
		}

		public void setXForwardedForClientCertSubjectDNAlias(String xForwardedForClientCertSubjectDNAlias) {
			this.xForwardedForClientCertSubjectDNAlias = xForwardedForClientCertSubjectDNAlias;
		}

		public Boolean getXForwardedForClientCertIssuerDNEnabled() {
			return this.xForwardedForClientCertIssuerDNEnabled;
		}

		public void setXForwardedForClientCertIssuerDNEnabled(Boolean xForwardedForClientCertIssuerDNEnabled) {
			this.xForwardedForClientCertIssuerDNEnabled = xForwardedForClientCertIssuerDNEnabled;
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

		public Boolean getXForwardedForProtoEnabled() {
			return this.xForwardedForProtoEnabled;
		}

		public void setXForwardedForProtoEnabled(Boolean xForwardedForProtoEnabled) {
			this.xForwardedForProtoEnabled = xForwardedForProtoEnabled;
		}

		public String getXForwardedForClientCertFingerprintAlias() {
			return this.xForwardedForClientCertFingerprintAlias;
		}

		public void setXForwardedForClientCertFingerprintAlias(String xForwardedForClientCertFingerprintAlias) {
			this.xForwardedForClientCertFingerprintAlias = xForwardedForClientCertFingerprintAlias;
		}

		public Boolean getXForwardedForClientCertClientVerifyEnabled() {
			return this.xForwardedForClientCertClientVerifyEnabled;
		}

		public void setXForwardedForClientCertClientVerifyEnabled(Boolean xForwardedForClientCertClientVerifyEnabled) {
			this.xForwardedForClientCertClientVerifyEnabled = xForwardedForClientCertClientVerifyEnabled;
		}

		public Boolean getXForwardedForSLBPortEnabled() {
			return this.xForwardedForSLBPortEnabled;
		}

		public void setXForwardedForSLBPortEnabled(Boolean xForwardedForSLBPortEnabled) {
			this.xForwardedForSLBPortEnabled = xForwardedForSLBPortEnabled;
		}

		public Boolean getXForwardedForClientCertSubjectDNEnabled() {
			return this.xForwardedForClientCertSubjectDNEnabled;
		}

		public void setXForwardedForClientCertSubjectDNEnabled(Boolean xForwardedForClientCertSubjectDNEnabled) {
			this.xForwardedForClientCertSubjectDNEnabled = xForwardedForClientCertSubjectDNEnabled;
		}

		public String getXForwardedForClientCertClientVerifyAlias() {
			return this.xForwardedForClientCertClientVerifyAlias;
		}

		public void setXForwardedForClientCertClientVerifyAlias(String xForwardedForClientCertClientVerifyAlias) {
			this.xForwardedForClientCertClientVerifyAlias = xForwardedForClientCertClientVerifyAlias;
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

		public Boolean getXForwardedForSLBIdEnabled() {
			return this.xForwardedForSLBIdEnabled;
		}

		public void setXForwardedForSLBIdEnabled(Boolean xForwardedForSLBIdEnabled) {
			this.xForwardedForSLBIdEnabled = xForwardedForSLBIdEnabled;
		}
	}

	public static class Certificates {

		private String certificateId;

		public String getCertificateId() {
			return this.certificateId;
		}

		public void setCertificateId(String certificateId) {
			this.certificateId = certificateId;
		}
	}

	@Override
	public Class<UpdateListenerAttributeResponse> getResponseClass() {
		return UpdateListenerAttributeResponse.class;
	}

}
