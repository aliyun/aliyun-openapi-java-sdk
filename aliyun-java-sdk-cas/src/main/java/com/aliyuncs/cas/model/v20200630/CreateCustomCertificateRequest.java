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

package com.aliyuncs.cas.model.v20200630;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateCustomCertificateRequest extends RpcAcsRequest<CreateCustomCertificateResponse> {
	   

	private String csr;

	private Integer immediately;

	private String parentIdentifier;

	private String validity;

	private ApiPassthrough apiPassthrough;
	public CreateCustomCertificateRequest() {
		super("cas", "2020-06-30", "CreateCustomCertificate");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCsr() {
		return this.csr;
	}

	public void setCsr(String csr) {
		this.csr = csr;
		if(csr != null){
			putQueryParameter("Csr", csr);
		}
	}

	public Integer getImmediately() {
		return this.immediately;
	}

	public void setImmediately(Integer immediately) {
		this.immediately = immediately;
		if(immediately != null){
			putQueryParameter("Immediately", immediately.toString());
		}
	}

	public String getParentIdentifier() {
		return this.parentIdentifier;
	}

	public void setParentIdentifier(String parentIdentifier) {
		this.parentIdentifier = parentIdentifier;
		if(parentIdentifier != null){
			putQueryParameter("ParentIdentifier", parentIdentifier);
		}
	}

	public String getValidity() {
		return this.validity;
	}

	public void setValidity(String validity) {
		this.validity = validity;
		if(validity != null){
			putQueryParameter("Validity", validity);
		}
	}

	public ApiPassthrough getApiPassthrough() {
		return this.apiPassthrough;
	}

	public void setApiPassthrough(ApiPassthrough apiPassthrough) {
		this.apiPassthrough = apiPassthrough;	
		if (apiPassthrough != null) {
			
				if (apiPassthrough.getSubject() != null) {
					
						putQueryParameter("ApiPassthrough.Subject.Country" , apiPassthrough.getSubject().getCountry());
						putQueryParameter("ApiPassthrough.Subject.State" , apiPassthrough.getSubject().getState());
						putQueryParameter("ApiPassthrough.Subject.Locality" , apiPassthrough.getSubject().getLocality());
						putQueryParameter("ApiPassthrough.Subject.Organization" , apiPassthrough.getSubject().getOrganization());
						putQueryParameter("ApiPassthrough.Subject.OrganizationUnit" , apiPassthrough.getSubject().getOrganizationUnit());
						putQueryParameter("ApiPassthrough.Subject.CommonName" , apiPassthrough.getSubject().getCommonName());
				}
				if (apiPassthrough.getExtensions() != null) {
					
						if (apiPassthrough.getExtensions().getKeyUsage() != null) {
							
								putQueryParameter("ApiPassthrough.Extensions.KeyUsage.DigitalSignature" , apiPassthrough.getExtensions().getKeyUsage().getDigitalSignature());
								putQueryParameter("ApiPassthrough.Extensions.KeyUsage.ContentCommitment" , apiPassthrough.getExtensions().getKeyUsage().getContentCommitment());
								putQueryParameter("ApiPassthrough.Extensions.KeyUsage.NonRepudiation" , apiPassthrough.getExtensions().getKeyUsage().getNonRepudiation());
								putQueryParameter("ApiPassthrough.Extensions.KeyUsage.KeyEncipherment" , apiPassthrough.getExtensions().getKeyUsage().getKeyEncipherment());
								putQueryParameter("ApiPassthrough.Extensions.KeyUsage.DataEncipherment" , apiPassthrough.getExtensions().getKeyUsage().getDataEncipherment());
								putQueryParameter("ApiPassthrough.Extensions.KeyUsage.KeyAgreement" , apiPassthrough.getExtensions().getKeyUsage().getKeyAgreement());
								putQueryParameter("ApiPassthrough.Extensions.KeyUsage.EncipherOnly" , apiPassthrough.getExtensions().getKeyUsage().getEncipherOnly());
								putQueryParameter("ApiPassthrough.Extensions.KeyUsage.DecipherOnly" , apiPassthrough.getExtensions().getKeyUsage().getDecipherOnly());
						}
						if (apiPassthrough.getExtensions().getExtendedKeyUsages() != null) {
							for (int depth1 = 0; depth1 < apiPassthrough.getExtensions().getExtendedKeyUsages().size(); depth1++) {
								putQueryParameter("ApiPassthrough.Extensions.ExtendedKeyUsages." + (depth1 + 1) , apiPassthrough.getExtensions().getExtendedKeyUsages().get(depth1));
							}
						}
						if (apiPassthrough.getExtensions().getSubjectAlternativeNames() != null) {
							for (int depth1 = 0; depth1 < apiPassthrough.getExtensions().getSubjectAlternativeNames().size(); depth1++) {
								if (apiPassthrough.getExtensions().getSubjectAlternativeNames().get(depth1) != null) {
									
										putQueryParameter("ApiPassthrough.Extensions.SubjectAlternativeNames." + (depth1 + 1) + ".Type" , apiPassthrough.getExtensions().getSubjectAlternativeNames().get(depth1).getType());
										putQueryParameter("ApiPassthrough.Extensions.SubjectAlternativeNames." + (depth1 + 1) + ".Value" , apiPassthrough.getExtensions().getSubjectAlternativeNames().get(depth1).getValue());
								}
							}
						}
				}
		}	
	}

	public static class ApiPassthrough {

		private Subject subject;

		private Extensions extensions;

		public Subject getSubject() {
			return this.subject;
		}

		public void setSubject(Subject subject) {
			this.subject = subject;
		}

		public Extensions getExtensions() {
			return this.extensions;
		}

		public void setExtensions(Extensions extensions) {
			this.extensions = extensions;
		}

		public static class Subject {

			private String country;

			private String state;

			private String locality;

			private String organization;

			private String organizationUnit;

			private String commonName;

			public String getCountry() {
				return this.country;
			}

			public void setCountry(String country) {
				this.country = country;
			}

			public String getState() {
				return this.state;
			}

			public void setState(String state) {
				this.state = state;
			}

			public String getLocality() {
				return this.locality;
			}

			public void setLocality(String locality) {
				this.locality = locality;
			}

			public String getOrganization() {
				return this.organization;
			}

			public void setOrganization(String organization) {
				this.organization = organization;
			}

			public String getOrganizationUnit() {
				return this.organizationUnit;
			}

			public void setOrganizationUnit(String organizationUnit) {
				this.organizationUnit = organizationUnit;
			}

			public String getCommonName() {
				return this.commonName;
			}

			public void setCommonName(String commonName) {
				this.commonName = commonName;
			}
		}

		public static class Extensions {

			private KeyUsage keyUsage;

			private List<String> extendedKeyUsages;

			private List<SubjectAlternativeNamesItem> subjectAlternativeNames;

			public KeyUsage getKeyUsage() {
				return this.keyUsage;
			}

			public void setKeyUsage(KeyUsage keyUsage) {
				this.keyUsage = keyUsage;
			}

			public List<String> getExtendedKeyUsages() {
				return this.extendedKeyUsages;
			}

			public void setExtendedKeyUsages(List<String> extendedKeyUsages) {
				this.extendedKeyUsages = extendedKeyUsages;
			}

			public List<SubjectAlternativeNamesItem> getSubjectAlternativeNames() {
				return this.subjectAlternativeNames;
			}

			public void setSubjectAlternativeNames(List<SubjectAlternativeNamesItem> subjectAlternativeNames) {
				this.subjectAlternativeNames = subjectAlternativeNames;
			}

			public static class KeyUsage {

				private Boolean digitalSignature;

				private Boolean contentCommitment;

				private Boolean nonRepudiation;

				private Boolean keyEncipherment;

				private Boolean dataEncipherment;

				private Boolean keyAgreement;

				private Boolean encipherOnly;

				private Boolean decipherOnly;

				public Boolean getDigitalSignature() {
					return this.digitalSignature;
				}

				public void setDigitalSignature(Boolean digitalSignature) {
					this.digitalSignature = digitalSignature;
				}

				public Boolean getContentCommitment() {
					return this.contentCommitment;
				}

				public void setContentCommitment(Boolean contentCommitment) {
					this.contentCommitment = contentCommitment;
				}

				public Boolean getNonRepudiation() {
					return this.nonRepudiation;
				}

				public void setNonRepudiation(Boolean nonRepudiation) {
					this.nonRepudiation = nonRepudiation;
				}

				public Boolean getKeyEncipherment() {
					return this.keyEncipherment;
				}

				public void setKeyEncipherment(Boolean keyEncipherment) {
					this.keyEncipherment = keyEncipherment;
				}

				public Boolean getDataEncipherment() {
					return this.dataEncipherment;
				}

				public void setDataEncipherment(Boolean dataEncipherment) {
					this.dataEncipherment = dataEncipherment;
				}

				public Boolean getKeyAgreement() {
					return this.keyAgreement;
				}

				public void setKeyAgreement(Boolean keyAgreement) {
					this.keyAgreement = keyAgreement;
				}

				public Boolean getEncipherOnly() {
					return this.encipherOnly;
				}

				public void setEncipherOnly(Boolean encipherOnly) {
					this.encipherOnly = encipherOnly;
				}

				public Boolean getDecipherOnly() {
					return this.decipherOnly;
				}

				public void setDecipherOnly(Boolean decipherOnly) {
					this.decipherOnly = decipherOnly;
				}
			}

			public static class SubjectAlternativeNamesItem {

				private String type;

				private String value;

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}
		}
	}

	@Override
	public Class<CreateCustomCertificateResponse> getResponseClass() {
		return CreateCustomCertificateResponse.class;
	}

}
