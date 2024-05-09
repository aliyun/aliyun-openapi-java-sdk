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

package com.aliyuncs.domain.model.v20180129;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.domain.transform.v20180129.QueryDomainSpecialBizInfoByDomainResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryDomainSpecialBizInfoByDomainResponse extends AcsResponse {

	private String requestId;

	private Integer httpStatusCode;

	private String dynamicCode;

	private String dynamicMessage;

	private Boolean synchro;

	private String errorMsg;

	private String errorCode;

	private Boolean success;

	private Boolean allowRetry;

	private String appName;

	private List<String> errorArgs;

	private Module module;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getDynamicCode() {
		return this.dynamicCode;
	}

	public void setDynamicCode(String dynamicCode) {
		this.dynamicCode = dynamicCode;
	}

	public String getDynamicMessage() {
		return this.dynamicMessage;
	}

	public void setDynamicMessage(String dynamicMessage) {
		this.dynamicMessage = dynamicMessage;
	}

	public Boolean getSynchro() {
		return this.synchro;
	}

	public void setSynchro(Boolean synchro) {
		this.synchro = synchro;
	}

	public String getErrorMsg() {
		return this.errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Boolean getAllowRetry() {
		return this.allowRetry;
	}

	public void setAllowRetry(Boolean allowRetry) {
		this.allowRetry = allowRetry;
	}

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public List<String> getErrorArgs() {
		return this.errorArgs;
	}

	public void setErrorArgs(List<String> errorArgs) {
		this.errorArgs = errorArgs;
	}

	public Module getModule() {
		return this.module;
	}

	public void setModule(Module module) {
		this.module = module;
	}

	public static class Module {

		private Long id;

		private String gmtCreate;

		private String gmtModified;

		private String bizName;

		private String bizNo;

		private String domainName;

		private String saleId;

		private String userId;

		private String productId;

		private String bizType;

		private String bizStatus;

		private Integer status;

		private String statusDesc;

		private String auditMsg;

		private String orderId;

		private Long updateTime;

		private Long createTime;

		private List<DomainSpecialBizCredential> domainSpecialBizCredentials;

		private DomainSpecialBizContact domainSpecialBizContact;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getBizName() {
			return this.bizName;
		}

		public void setBizName(String bizName) {
			this.bizName = bizName;
		}

		public String getBizNo() {
			return this.bizNo;
		}

		public void setBizNo(String bizNo) {
			this.bizNo = bizNo;
		}

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}

		public String getSaleId() {
			return this.saleId;
		}

		public void setSaleId(String saleId) {
			this.saleId = saleId;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getProductId() {
			return this.productId;
		}

		public void setProductId(String productId) {
			this.productId = productId;
		}

		public String getBizType() {
			return this.bizType;
		}

		public void setBizType(String bizType) {
			this.bizType = bizType;
		}

		public String getBizStatus() {
			return this.bizStatus;
		}

		public void setBizStatus(String bizStatus) {
			this.bizStatus = bizStatus;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public String getStatusDesc() {
			return this.statusDesc;
		}

		public void setStatusDesc(String statusDesc) {
			this.statusDesc = statusDesc;
		}

		public String getAuditMsg() {
			return this.auditMsg;
		}

		public void setAuditMsg(String auditMsg) {
			this.auditMsg = auditMsg;
		}

		public String getOrderId() {
			return this.orderId;
		}

		public void setOrderId(String orderId) {
			this.orderId = orderId;
		}

		public Long getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(Long updateTime) {
			this.updateTime = updateTime;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public List<DomainSpecialBizCredential> getDomainSpecialBizCredentials() {
			return this.domainSpecialBizCredentials;
		}

		public void setDomainSpecialBizCredentials(List<DomainSpecialBizCredential> domainSpecialBizCredentials) {
			this.domainSpecialBizCredentials = domainSpecialBizCredentials;
		}

		public DomainSpecialBizContact getDomainSpecialBizContact() {
			return this.domainSpecialBizContact;
		}

		public void setDomainSpecialBizContact(DomainSpecialBizContact domainSpecialBizContact) {
			this.domainSpecialBizContact = domainSpecialBizContact;
		}

		public static class DomainSpecialBizCredential {

			private String domainName;

			private String saleId;

			private Long bizId;

			private String credentialNo;

			private String credentialType;

			private String credentialUrl;

			private Integer holderCert;

			public String getDomainName() {
				return this.domainName;
			}

			public void setDomainName(String domainName) {
				this.domainName = domainName;
			}

			public String getSaleId() {
				return this.saleId;
			}

			public void setSaleId(String saleId) {
				this.saleId = saleId;
			}

			public Long getBizId() {
				return this.bizId;
			}

			public void setBizId(Long bizId) {
				this.bizId = bizId;
			}

			public String getCredentialNo() {
				return this.credentialNo;
			}

			public void setCredentialNo(String credentialNo) {
				this.credentialNo = credentialNo;
			}

			public String getCredentialType() {
				return this.credentialType;
			}

			public void setCredentialType(String credentialType) {
				this.credentialType = credentialType;
			}

			public String getCredentialUrl() {
				return this.credentialUrl;
			}

			public void setCredentialUrl(String credentialUrl) {
				this.credentialUrl = credentialUrl;
			}

			public Integer getHolderCert() {
				return this.holderCert;
			}

			public void setHolderCert(Integer holderCert) {
				this.holderCert = holderCert;
			}
		}

		public static class DomainSpecialBizContact {

			private Long bizId;

			private Integer regType;

			private String cCompany;

			private String eCompany;

			private String cName;

			private String eName;

			private String cCountry;

			private String cProvince;

			private String eProvince;

			private String cCity;

			private String eCity;

			private String cVenu;

			private String eVenu;

			private String postalcode;

			private String email;

			private String telArea;

			private String telMain;

			private String telExt;

			private String faxArea;

			private String faxMain;

			private String faxExt;

			private String mobile;

			private String extend;

			private String vspContactId;

			private String registrantId;

			public Long getBizId() {
				return this.bizId;
			}

			public void setBizId(Long bizId) {
				this.bizId = bizId;
			}

			public Integer getRegType() {
				return this.regType;
			}

			public void setRegType(Integer regType) {
				this.regType = regType;
			}

			public String getCCompany() {
				return this.cCompany;
			}

			public void setCCompany(String cCompany) {
				this.cCompany = cCompany;
			}

			public String getECompany() {
				return this.eCompany;
			}

			public void setECompany(String eCompany) {
				this.eCompany = eCompany;
			}

			public String getCName() {
				return this.cName;
			}

			public void setCName(String cName) {
				this.cName = cName;
			}

			public String getEName() {
				return this.eName;
			}

			public void setEName(String eName) {
				this.eName = eName;
			}

			public String getCCountry() {
				return this.cCountry;
			}

			public void setCCountry(String cCountry) {
				this.cCountry = cCountry;
			}

			public String getCProvince() {
				return this.cProvince;
			}

			public void setCProvince(String cProvince) {
				this.cProvince = cProvince;
			}

			public String getEProvince() {
				return this.eProvince;
			}

			public void setEProvince(String eProvince) {
				this.eProvince = eProvince;
			}

			public String getCCity() {
				return this.cCity;
			}

			public void setCCity(String cCity) {
				this.cCity = cCity;
			}

			public String getECity() {
				return this.eCity;
			}

			public void setECity(String eCity) {
				this.eCity = eCity;
			}

			public String getCVenu() {
				return this.cVenu;
			}

			public void setCVenu(String cVenu) {
				this.cVenu = cVenu;
			}

			public String getEVenu() {
				return this.eVenu;
			}

			public void setEVenu(String eVenu) {
				this.eVenu = eVenu;
			}

			public String getPostalcode() {
				return this.postalcode;
			}

			public void setPostalcode(String postalcode) {
				this.postalcode = postalcode;
			}

			public String getEmail() {
				return this.email;
			}

			public void setEmail(String email) {
				this.email = email;
			}

			public String getTelArea() {
				return this.telArea;
			}

			public void setTelArea(String telArea) {
				this.telArea = telArea;
			}

			public String getTelMain() {
				return this.telMain;
			}

			public void setTelMain(String telMain) {
				this.telMain = telMain;
			}

			public String getTelExt() {
				return this.telExt;
			}

			public void setTelExt(String telExt) {
				this.telExt = telExt;
			}

			public String getFaxArea() {
				return this.faxArea;
			}

			public void setFaxArea(String faxArea) {
				this.faxArea = faxArea;
			}

			public String getFaxMain() {
				return this.faxMain;
			}

			public void setFaxMain(String faxMain) {
				this.faxMain = faxMain;
			}

			public String getFaxExt() {
				return this.faxExt;
			}

			public void setFaxExt(String faxExt) {
				this.faxExt = faxExt;
			}

			public String getMobile() {
				return this.mobile;
			}

			public void setMobile(String mobile) {
				this.mobile = mobile;
			}

			public String getExtend() {
				return this.extend;
			}

			public void setExtend(String extend) {
				this.extend = extend;
			}

			public String getVspContactId() {
				return this.vspContactId;
			}

			public void setVspContactId(String vspContactId) {
				this.vspContactId = vspContactId;
			}

			public String getRegistrantId() {
				return this.registrantId;
			}

			public void setRegistrantId(String registrantId) {
				this.registrantId = registrantId;
			}
		}
	}

	@Override
	public QueryDomainSpecialBizInfoByDomainResponse getInstance(UnmarshallerContext context) {
		return	QueryDomainSpecialBizInfoByDomainResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
