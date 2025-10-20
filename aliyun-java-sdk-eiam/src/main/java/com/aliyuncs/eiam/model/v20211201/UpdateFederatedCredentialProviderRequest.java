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

package com.aliyuncs.eiam.model.v20211201;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdateFederatedCredentialProviderRequest extends RpcAcsRequest<UpdateFederatedCredentialProviderResponse> {
	   

	private OidcProviderConfig oidcProviderConfig;

	private String federatedCredentialProviderName;

	private String networkAccessEndpointId;

	private PrivateCaProviderConfig privateCaProviderConfig;

	private String federatedCredentialProviderId;

	private String instanceId;

	private Pkcs7ProviderConfig pkcs7ProviderConfig;
	public UpdateFederatedCredentialProviderRequest() {
		super("Eiam", "2021-12-01", "UpdateFederatedCredentialProvider", "eiam");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public OidcProviderConfig getOidcProviderConfig() {
		return this.oidcProviderConfig;
	}

	public void setOidcProviderConfig(OidcProviderConfig oidcProviderConfig) {
		this.oidcProviderConfig = oidcProviderConfig;	
		if (oidcProviderConfig != null) {
			
				putQueryParameter("OidcProviderConfig.JwksSource" , oidcProviderConfig.getJwksSource());
				putQueryParameter("OidcProviderConfig.StaticJwks" , oidcProviderConfig.getStaticJwks());
				putQueryParameter("OidcProviderConfig.TrustCondition" , oidcProviderConfig.getTrustCondition());
				putQueryParameter("OidcProviderConfig.JwksUri" , oidcProviderConfig.getJwksUri());
				if (oidcProviderConfig.getAudiences() != null) {
					for (int depth1 = 0; depth1 < oidcProviderConfig.getAudiences().size(); depth1++) {
						putQueryParameter("OidcProviderConfig.Audiences." + (depth1 + 1) , oidcProviderConfig.getAudiences().get(depth1));
					}
				}
		}	
	}

	public String getFederatedCredentialProviderName() {
		return this.federatedCredentialProviderName;
	}

	public void setFederatedCredentialProviderName(String federatedCredentialProviderName) {
		this.federatedCredentialProviderName = federatedCredentialProviderName;
		if(federatedCredentialProviderName != null){
			putQueryParameter("FederatedCredentialProviderName", federatedCredentialProviderName);
		}
	}

	public String getNetworkAccessEndpointId() {
		return this.networkAccessEndpointId;
	}

	public void setNetworkAccessEndpointId(String networkAccessEndpointId) {
		this.networkAccessEndpointId = networkAccessEndpointId;
		if(networkAccessEndpointId != null){
			putQueryParameter("NetworkAccessEndpointId", networkAccessEndpointId);
		}
	}

	public PrivateCaProviderConfig getPrivateCaProviderConfig() {
		return this.privateCaProviderConfig;
	}

	public void setPrivateCaProviderConfig(PrivateCaProviderConfig privateCaProviderConfig) {
		this.privateCaProviderConfig = privateCaProviderConfig;	
		if (privateCaProviderConfig != null) {
			
				if (privateCaProviderConfig.getCertificates() != null) {
					for (int depth1 = 0; depth1 < privateCaProviderConfig.getCertificates().size(); depth1++) {
						if (privateCaProviderConfig.getCertificates().get(depth1) != null) {
							
								putQueryParameter("PrivateCaProviderConfig.Certificates." + (depth1 + 1) + ".Content" , privateCaProviderConfig.getCertificates().get(depth1).getContent());
						}
					}
				}
				putQueryParameter("PrivateCaProviderConfig.TrustCondition" , privateCaProviderConfig.getTrustCondition());
				putQueryParameter("PrivateCaProviderConfig.TrustAnchorSource" , privateCaProviderConfig.getTrustAnchorSource());
		}	
	}

	public String getFederatedCredentialProviderId() {
		return this.federatedCredentialProviderId;
	}

	public void setFederatedCredentialProviderId(String federatedCredentialProviderId) {
		this.federatedCredentialProviderId = federatedCredentialProviderId;
		if(federatedCredentialProviderId != null){
			putQueryParameter("FederatedCredentialProviderId", federatedCredentialProviderId);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public Pkcs7ProviderConfig getPkcs7ProviderConfig() {
		return this.pkcs7ProviderConfig;
	}

	public void setPkcs7ProviderConfig(Pkcs7ProviderConfig pkcs7ProviderConfig) {
		this.pkcs7ProviderConfig = pkcs7ProviderConfig;	
		if (pkcs7ProviderConfig != null) {
			
				putQueryParameter("Pkcs7ProviderConfig.SigningTimeValueExpression" , pkcs7ProviderConfig.getSigningTimeValueExpression());
				if (pkcs7ProviderConfig.getCertificates() != null) {
					for (int depth1 = 0; depth1 < pkcs7ProviderConfig.getCertificates().size(); depth1++) {
						if (pkcs7ProviderConfig.getCertificates().get(depth1) != null) {
							
								putQueryParameter("Pkcs7ProviderConfig.Certificates." + (depth1 + 1) + ".Content" , pkcs7ProviderConfig.getCertificates().get(depth1).getContent());
						}
					}
				}
				putQueryParameter("Pkcs7ProviderConfig.TrustCondition" , pkcs7ProviderConfig.getTrustCondition());
				putQueryParameter("Pkcs7ProviderConfig.CmsVerificationMode" , pkcs7ProviderConfig.getCmsVerificationMode());
				putQueryParameter("Pkcs7ProviderConfig.TrustAnchorSource" , pkcs7ProviderConfig.getTrustAnchorSource());
				putQueryParameter("Pkcs7ProviderConfig.SignatureEffectiveTime" , pkcs7ProviderConfig.getSignatureEffectiveTime());
		}	
	}

	public static class OidcProviderConfig {

		private String jwksSource;

		private String staticJwks;

		private String trustCondition;

		private String jwksUri;

		private List<String> audiences;

		public String getJwksSource() {
			return this.jwksSource;
		}

		public void setJwksSource(String jwksSource) {
			this.jwksSource = jwksSource;
		}

		public String getStaticJwks() {
			return this.staticJwks;
		}

		public void setStaticJwks(String staticJwks) {
			this.staticJwks = staticJwks;
		}

		public String getTrustCondition() {
			return this.trustCondition;
		}

		public void setTrustCondition(String trustCondition) {
			this.trustCondition = trustCondition;
		}

		public String getJwksUri() {
			return this.jwksUri;
		}

		public void setJwksUri(String jwksUri) {
			this.jwksUri = jwksUri;
		}

		public List<String> getAudiences() {
			return this.audiences;
		}

		public void setAudiences(List<String> audiences) {
			this.audiences = audiences;
		}
	}

	public static class PrivateCaProviderConfig {

		private List<CertificatesItem> certificates;

		private String trustCondition;

		private String trustAnchorSource;

		public List<CertificatesItem> getCertificates() {
			return this.certificates;
		}

		public void setCertificates(List<CertificatesItem> certificates) {
			this.certificates = certificates;
		}

		public String getTrustCondition() {
			return this.trustCondition;
		}

		public void setTrustCondition(String trustCondition) {
			this.trustCondition = trustCondition;
		}

		public String getTrustAnchorSource() {
			return this.trustAnchorSource;
		}

		public void setTrustAnchorSource(String trustAnchorSource) {
			this.trustAnchorSource = trustAnchorSource;
		}

		public static class CertificatesItem {

			private String content;

			public String getContent() {
				return this.content;
			}

			public void setContent(String content) {
				this.content = content;
			}
		}
	}

	public static class Pkcs7ProviderConfig {

		private String signingTimeValueExpression;

		private List<CertificatesItem> certificates;

		private String trustCondition;

		private String cmsVerificationMode;

		private String trustAnchorSource;

		private Long signatureEffectiveTime;

		public String getSigningTimeValueExpression() {
			return this.signingTimeValueExpression;
		}

		public void setSigningTimeValueExpression(String signingTimeValueExpression) {
			this.signingTimeValueExpression = signingTimeValueExpression;
		}

		public List<CertificatesItem> getCertificates() {
			return this.certificates;
		}

		public void setCertificates(List<CertificatesItem> certificates) {
			this.certificates = certificates;
		}

		public String getTrustCondition() {
			return this.trustCondition;
		}

		public void setTrustCondition(String trustCondition) {
			this.trustCondition = trustCondition;
		}

		public String getCmsVerificationMode() {
			return this.cmsVerificationMode;
		}

		public void setCmsVerificationMode(String cmsVerificationMode) {
			this.cmsVerificationMode = cmsVerificationMode;
		}

		public String getTrustAnchorSource() {
			return this.trustAnchorSource;
		}

		public void setTrustAnchorSource(String trustAnchorSource) {
			this.trustAnchorSource = trustAnchorSource;
		}

		public Long getSignatureEffectiveTime() {
			return this.signatureEffectiveTime;
		}

		public void setSignatureEffectiveTime(Long signatureEffectiveTime) {
			this.signatureEffectiveTime = signatureEffectiveTime;
		}

		public static class CertificatesItem {

			private String content;

			public String getContent() {
				return this.content;
			}

			public void setContent(String content) {
				this.content = content;
			}
		}
	}

	@Override
	public Class<UpdateFederatedCredentialProviderResponse> getResponseClass() {
		return UpdateFederatedCredentialProviderResponse.class;
	}

}
