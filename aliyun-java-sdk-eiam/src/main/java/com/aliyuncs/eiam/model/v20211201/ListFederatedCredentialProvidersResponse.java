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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.eiam.transform.v20211201.ListFederatedCredentialProvidersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListFederatedCredentialProvidersResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private String nextToken;

	private String previousToken;

	private Integer maxResults;

	private List<FederatedCredentialProvider> federatedCredentialProviders;

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

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public String getPreviousToken() {
		return this.previousToken;
	}

	public void setPreviousToken(String previousToken) {
		this.previousToken = previousToken;
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public List<FederatedCredentialProvider> getFederatedCredentialProviders() {
		return this.federatedCredentialProviders;
	}

	public void setFederatedCredentialProviders(List<FederatedCredentialProvider> federatedCredentialProviders) {
		this.federatedCredentialProviders = federatedCredentialProviders;
	}

	public static class FederatedCredentialProvider {

		private String status;

		private String description;

		private String instanceId;

		private Long createTime;

		private Long updateTime;

		private String federatedCredentialProviderType;

		private String networkAccessEndpointId;

		private String federatedCredentialProviderName;

		private String federatedCredentialProviderId;

		private PrivateCaProviderConfig privateCaProviderConfig;

		private OidcProviderConfig oidcProviderConfig;

		private Pkcs7ProviderConfig pkcs7ProviderConfig;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public Long getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(Long updateTime) {
			this.updateTime = updateTime;
		}

		public String getFederatedCredentialProviderType() {
			return this.federatedCredentialProviderType;
		}

		public void setFederatedCredentialProviderType(String federatedCredentialProviderType) {
			this.federatedCredentialProviderType = federatedCredentialProviderType;
		}

		public String getNetworkAccessEndpointId() {
			return this.networkAccessEndpointId;
		}

		public void setNetworkAccessEndpointId(String networkAccessEndpointId) {
			this.networkAccessEndpointId = networkAccessEndpointId;
		}

		public String getFederatedCredentialProviderName() {
			return this.federatedCredentialProviderName;
		}

		public void setFederatedCredentialProviderName(String federatedCredentialProviderName) {
			this.federatedCredentialProviderName = federatedCredentialProviderName;
		}

		public String getFederatedCredentialProviderId() {
			return this.federatedCredentialProviderId;
		}

		public void setFederatedCredentialProviderId(String federatedCredentialProviderId) {
			this.federatedCredentialProviderId = federatedCredentialProviderId;
		}

		public PrivateCaProviderConfig getPrivateCaProviderConfig() {
			return this.privateCaProviderConfig;
		}

		public void setPrivateCaProviderConfig(PrivateCaProviderConfig privateCaProviderConfig) {
			this.privateCaProviderConfig = privateCaProviderConfig;
		}

		public OidcProviderConfig getOidcProviderConfig() {
			return this.oidcProviderConfig;
		}

		public void setOidcProviderConfig(OidcProviderConfig oidcProviderConfig) {
			this.oidcProviderConfig = oidcProviderConfig;
		}

		public Pkcs7ProviderConfig getPkcs7ProviderConfig() {
			return this.pkcs7ProviderConfig;
		}

		public void setPkcs7ProviderConfig(Pkcs7ProviderConfig pkcs7ProviderConfig) {
			this.pkcs7ProviderConfig = pkcs7ProviderConfig;
		}

		public static class PrivateCaProviderConfig {

			private String trustAnchorSource;

			private String trustCondition;

			private List<Certificate> certificates;

			public String getTrustAnchorSource() {
				return this.trustAnchorSource;
			}

			public void setTrustAnchorSource(String trustAnchorSource) {
				this.trustAnchorSource = trustAnchorSource;
			}

			public String getTrustCondition() {
				return this.trustCondition;
			}

			public void setTrustCondition(String trustCondition) {
				this.trustCondition = trustCondition;
			}

			public List<Certificate> getCertificates() {
				return this.certificates;
			}

			public void setCertificates(List<Certificate> certificates) {
				this.certificates = certificates;
			}

			public static class Certificate {

				private String fingerprint;

				private String content;

				private CertificateMetadata certificateMetadata;

				public String getFingerprint() {
					return this.fingerprint;
				}

				public void setFingerprint(String fingerprint) {
					this.fingerprint = fingerprint;
				}

				public String getContent() {
					return this.content;
				}

				public void setContent(String content) {
					this.content = content;
				}

				public CertificateMetadata getCertificateMetadata() {
					return this.certificateMetadata;
				}

				public void setCertificateMetadata(CertificateMetadata certificateMetadata) {
					this.certificateMetadata = certificateMetadata;
				}

				public static class CertificateMetadata {

					private Long notBefore;

					private Long notAfter;

					public Long getNotBefore() {
						return this.notBefore;
					}

					public void setNotBefore(Long notBefore) {
						this.notBefore = notBefore;
					}

					public Long getNotAfter() {
						return this.notAfter;
					}

					public void setNotAfter(Long notAfter) {
						this.notAfter = notAfter;
					}
				}
			}
		}

		public static class OidcProviderConfig {

			private String jwksUri;

			private String issuer;

			private Long jwksLastObtainedTime;

			private String staticJwks;

			private String jwksSource;

			private String trustCondition;

			private String dynamicJwks;

			private List<String> audiences;

			public String getJwksUri() {
				return this.jwksUri;
			}

			public void setJwksUri(String jwksUri) {
				this.jwksUri = jwksUri;
			}

			public String getIssuer() {
				return this.issuer;
			}

			public void setIssuer(String issuer) {
				this.issuer = issuer;
			}

			public Long getJwksLastObtainedTime() {
				return this.jwksLastObtainedTime;
			}

			public void setJwksLastObtainedTime(Long jwksLastObtainedTime) {
				this.jwksLastObtainedTime = jwksLastObtainedTime;
			}

			public String getStaticJwks() {
				return this.staticJwks;
			}

			public void setStaticJwks(String staticJwks) {
				this.staticJwks = staticJwks;
			}

			public String getJwksSource() {
				return this.jwksSource;
			}

			public void setJwksSource(String jwksSource) {
				this.jwksSource = jwksSource;
			}

			public String getTrustCondition() {
				return this.trustCondition;
			}

			public void setTrustCondition(String trustCondition) {
				this.trustCondition = trustCondition;
			}

			public String getDynamicJwks() {
				return this.dynamicJwks;
			}

			public void setDynamicJwks(String dynamicJwks) {
				this.dynamicJwks = dynamicJwks;
			}

			public List<String> getAudiences() {
				return this.audiences;
			}

			public void setAudiences(List<String> audiences) {
				this.audiences = audiences;
			}
		}

		public static class Pkcs7ProviderConfig {

			private Long signatureEffectiveTime;

			private String trustAnchorSource;

			private String cmsVerificationMode;

			private String signingTimeValueExpression;

			private String trustCondition;

			private List<Certificate2> certificates1;

			public Long getSignatureEffectiveTime() {
				return this.signatureEffectiveTime;
			}

			public void setSignatureEffectiveTime(Long signatureEffectiveTime) {
				this.signatureEffectiveTime = signatureEffectiveTime;
			}

			public String getTrustAnchorSource() {
				return this.trustAnchorSource;
			}

			public void setTrustAnchorSource(String trustAnchorSource) {
				this.trustAnchorSource = trustAnchorSource;
			}

			public String getCmsVerificationMode() {
				return this.cmsVerificationMode;
			}

			public void setCmsVerificationMode(String cmsVerificationMode) {
				this.cmsVerificationMode = cmsVerificationMode;
			}

			public String getSigningTimeValueExpression() {
				return this.signingTimeValueExpression;
			}

			public void setSigningTimeValueExpression(String signingTimeValueExpression) {
				this.signingTimeValueExpression = signingTimeValueExpression;
			}

			public String getTrustCondition() {
				return this.trustCondition;
			}

			public void setTrustCondition(String trustCondition) {
				this.trustCondition = trustCondition;
			}

			public List<Certificate2> getCertificates1() {
				return this.certificates1;
			}

			public void setCertificates1(List<Certificate2> certificates1) {
				this.certificates1 = certificates1;
			}

			public static class Certificate2 {

				private String fingerprint;

				private String content;

				private CertificateMetadata3 certificateMetadata3;

				public String getFingerprint() {
					return this.fingerprint;
				}

				public void setFingerprint(String fingerprint) {
					this.fingerprint = fingerprint;
				}

				public String getContent() {
					return this.content;
				}

				public void setContent(String content) {
					this.content = content;
				}

				public CertificateMetadata3 getCertificateMetadata3() {
					return this.certificateMetadata3;
				}

				public void setCertificateMetadata3(CertificateMetadata3 certificateMetadata3) {
					this.certificateMetadata3 = certificateMetadata3;
				}

				public static class CertificateMetadata3 {

					private Long notBefore;

					private Long notAfter;

					public Long getNotBefore() {
						return this.notBefore;
					}

					public void setNotBefore(Long notBefore) {
						this.notBefore = notBefore;
					}

					public Long getNotAfter() {
						return this.notAfter;
					}

					public void setNotAfter(Long notAfter) {
						this.notAfter = notAfter;
					}
				}
			}
		}
	}

	@Override
	public ListFederatedCredentialProvidersResponse getInstance(UnmarshallerContext context) {
		return	ListFederatedCredentialProvidersResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
