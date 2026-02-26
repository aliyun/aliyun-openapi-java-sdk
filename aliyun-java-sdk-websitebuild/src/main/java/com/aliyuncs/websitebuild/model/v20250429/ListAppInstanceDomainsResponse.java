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

package com.aliyuncs.websitebuild.model.v20250429;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.websitebuild.transform.v20250429.ListAppInstanceDomainsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAppInstanceDomainsResponse extends AcsResponse {

	private String requestId;

	private String dynamicCode;

	private String dynamicMessage;

	private Boolean synchro;

	private String accessDeniedDetail;

	private String rootErrorMsg;

	private String rootErrorCode;

	private Boolean allowRetry;

	private String appName;

	private Integer maxResults;

	private String nextToken;

	private List<String> errorArgs;

	private Module module;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public String getAccessDeniedDetail() {
		return this.accessDeniedDetail;
	}

	public void setAccessDeniedDetail(String accessDeniedDetail) {
		this.accessDeniedDetail = accessDeniedDetail;
	}

	public String getRootErrorMsg() {
		return this.rootErrorMsg;
	}

	public void setRootErrorMsg(String rootErrorMsg) {
		this.rootErrorMsg = rootErrorMsg;
	}

	public String getRootErrorCode() {
		return this.rootErrorCode;
	}

	public void setRootErrorCode(String rootErrorCode) {
		this.rootErrorCode = rootErrorCode;
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

		private Integer totalItemNum;

		private Integer currentPageNum;

		private Integer pageSize;

		private Integer totalPageNum;

		private Boolean prePage;

		private Boolean nextPage;

		private Boolean resultLimit;

		private List<DataItem> data;

		private Next next;

		public Integer getTotalItemNum() {
			return this.totalItemNum;
		}

		public void setTotalItemNum(Integer totalItemNum) {
			this.totalItemNum = totalItemNum;
		}

		public Integer getCurrentPageNum() {
			return this.currentPageNum;
		}

		public void setCurrentPageNum(Integer currentPageNum) {
			this.currentPageNum = currentPageNum;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getTotalPageNum() {
			return this.totalPageNum;
		}

		public void setTotalPageNum(Integer totalPageNum) {
			this.totalPageNum = totalPageNum;
		}

		public Boolean getPrePage() {
			return this.prePage;
		}

		public void setPrePage(Boolean prePage) {
			this.prePage = prePage;
		}

		public Boolean getNextPage() {
			return this.nextPage;
		}

		public void setNextPage(Boolean nextPage) {
			this.nextPage = nextPage;
		}

		public Boolean getResultLimit() {
			return this.resultLimit;
		}

		public void setResultLimit(Boolean resultLimit) {
			this.resultLimit = resultLimit;
		}

		public List<DataItem> getData() {
			return this.data;
		}

		public void setData(List<DataItem> data) {
			this.data = data;
		}

		public Next getNext() {
			return this.next;
		}

		public void setNext(Next next) {
			this.next = next;
		}

		public static class DataItem {

			private String domainName;

			private String createTime;

			private String overallStatus;

			private Verification verification;

			private Resolution resolution;

			private Certificate certificate;

			private Ownership ownership;

			public String getDomainName() {
				return this.domainName;
			}

			public void setDomainName(String domainName) {
				this.domainName = domainName;
			}

			public String getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(String createTime) {
				this.createTime = createTime;
			}

			public String getOverallStatus() {
				return this.overallStatus;
			}

			public void setOverallStatus(String overallStatus) {
				this.overallStatus = overallStatus;
			}

			public Verification getVerification() {
				return this.verification;
			}

			public void setVerification(Verification verification) {
				this.verification = verification;
			}

			public Resolution getResolution() {
				return this.resolution;
			}

			public void setResolution(Resolution resolution) {
				this.resolution = resolution;
			}

			public Certificate getCertificate() {
				return this.certificate;
			}

			public void setCertificate(Certificate certificate) {
				this.certificate = certificate;
			}

			public Ownership getOwnership() {
				return this.ownership;
			}

			public void setOwnership(Ownership ownership) {
				this.ownership = ownership;
			}

			public static class Verification {

				private String verificationStatus;

				private String errorMsg;

				private String verificationStatusCode;

				private DnsRecord dnsRecord;

				public String getVerificationStatus() {
					return this.verificationStatus;
				}

				public void setVerificationStatus(String verificationStatus) {
					this.verificationStatus = verificationStatus;
				}

				public String getErrorMsg() {
					return this.errorMsg;
				}

				public void setErrorMsg(String errorMsg) {
					this.errorMsg = errorMsg;
				}

				public String getVerificationStatusCode() {
					return this.verificationStatusCode;
				}

				public void setVerificationStatusCode(String verificationStatusCode) {
					this.verificationStatusCode = verificationStatusCode;
				}

				public DnsRecord getDnsRecord() {
					return this.dnsRecord;
				}

				public void setDnsRecord(DnsRecord dnsRecord) {
					this.dnsRecord = dnsRecord;
				}

				public static class DnsRecord {

					private String recordType;

					private String host;

					private String value;

					public String getRecordType() {
						return this.recordType;
					}

					public void setRecordType(String recordType) {
						this.recordType = recordType;
					}

					public String getHost() {
						return this.host;
					}

					public void setHost(String host) {
						this.host = host;
					}

					public String getValue() {
						return this.value;
					}

					public void setValue(String value) {
						this.value = value;
					}
				}
			}

			public static class Resolution {

				private String resolutionStatus;

				private String errorMsg;

				private DnsRecord1 dnsRecord1;

				public String getResolutionStatus() {
					return this.resolutionStatus;
				}

				public void setResolutionStatus(String resolutionStatus) {
					this.resolutionStatus = resolutionStatus;
				}

				public String getErrorMsg() {
					return this.errorMsg;
				}

				public void setErrorMsg(String errorMsg) {
					this.errorMsg = errorMsg;
				}

				public DnsRecord1 getDnsRecord1() {
					return this.dnsRecord1;
				}

				public void setDnsRecord1(DnsRecord1 dnsRecord1) {
					this.dnsRecord1 = dnsRecord1;
				}

				public static class DnsRecord1 {

					private String recordType;

					private String host;

					private String value;

					public String getRecordType() {
						return this.recordType;
					}

					public void setRecordType(String recordType) {
						this.recordType = recordType;
					}

					public String getHost() {
						return this.host;
					}

					public void setHost(String host) {
						this.host = host;
					}

					public String getValue() {
						return this.value;
					}

					public void setValue(String value) {
						this.value = value;
					}
				}
			}

			public static class Certificate {

				private String certificateStatus;

				private String certificateType;

				private String certificateName;

				private String endTime;

				public String getCertificateStatus() {
					return this.certificateStatus;
				}

				public void setCertificateStatus(String certificateStatus) {
					this.certificateStatus = certificateStatus;
				}

				public String getCertificateType() {
					return this.certificateType;
				}

				public void setCertificateType(String certificateType) {
					this.certificateType = certificateType;
				}

				public String getCertificateName() {
					return this.certificateName;
				}

				public void setCertificateName(String certificateName) {
					this.certificateName = certificateName;
				}

				public String getEndTime() {
					return this.endTime;
				}

				public void setEndTime(String endTime) {
					this.endTime = endTime;
				}
			}

			public static class Ownership {

				private String account;

				private String provider;

				private String rootDomain;

				public String getAccount() {
					return this.account;
				}

				public void setAccount(String account) {
					this.account = account;
				}

				public String getProvider() {
					return this.provider;
				}

				public void setProvider(String provider) {
					this.provider = provider;
				}

				public String getRootDomain() {
					return this.rootDomain;
				}

				public void setRootDomain(String rootDomain) {
					this.rootDomain = rootDomain;
				}
			}
		}

		public static class Next {

			private String domainName;

			private String createTime;

			private String overallStatus;

			private Verification2 verification2;

			private Resolution3 resolution3;

			private Certificate4 certificate4;

			private Ownership5 ownership5;

			public String getDomainName() {
				return this.domainName;
			}

			public void setDomainName(String domainName) {
				this.domainName = domainName;
			}

			public String getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(String createTime) {
				this.createTime = createTime;
			}

			public String getOverallStatus() {
				return this.overallStatus;
			}

			public void setOverallStatus(String overallStatus) {
				this.overallStatus = overallStatus;
			}

			public Verification2 getVerification2() {
				return this.verification2;
			}

			public void setVerification2(Verification2 verification2) {
				this.verification2 = verification2;
			}

			public Resolution3 getResolution3() {
				return this.resolution3;
			}

			public void setResolution3(Resolution3 resolution3) {
				this.resolution3 = resolution3;
			}

			public Certificate4 getCertificate4() {
				return this.certificate4;
			}

			public void setCertificate4(Certificate4 certificate4) {
				this.certificate4 = certificate4;
			}

			public Ownership5 getOwnership5() {
				return this.ownership5;
			}

			public void setOwnership5(Ownership5 ownership5) {
				this.ownership5 = ownership5;
			}

			public static class Verification2 {

				private String verificationStatus;

				private String errorMsg;

				private DnsRecord6 dnsRecord6;

				public String getVerificationStatus() {
					return this.verificationStatus;
				}

				public void setVerificationStatus(String verificationStatus) {
					this.verificationStatus = verificationStatus;
				}

				public String getErrorMsg() {
					return this.errorMsg;
				}

				public void setErrorMsg(String errorMsg) {
					this.errorMsg = errorMsg;
				}

				public DnsRecord6 getDnsRecord6() {
					return this.dnsRecord6;
				}

				public void setDnsRecord6(DnsRecord6 dnsRecord6) {
					this.dnsRecord6 = dnsRecord6;
				}

				public static class DnsRecord6 {

					private String recordType;

					private String host;

					private String value;

					public String getRecordType() {
						return this.recordType;
					}

					public void setRecordType(String recordType) {
						this.recordType = recordType;
					}

					public String getHost() {
						return this.host;
					}

					public void setHost(String host) {
						this.host = host;
					}

					public String getValue() {
						return this.value;
					}

					public void setValue(String value) {
						this.value = value;
					}
				}
			}

			public static class Resolution3 {

				private String resolutionStatus;

				private String errorMsg;

				private DnsRecord7 dnsRecord7;

				public String getResolutionStatus() {
					return this.resolutionStatus;
				}

				public void setResolutionStatus(String resolutionStatus) {
					this.resolutionStatus = resolutionStatus;
				}

				public String getErrorMsg() {
					return this.errorMsg;
				}

				public void setErrorMsg(String errorMsg) {
					this.errorMsg = errorMsg;
				}

				public DnsRecord7 getDnsRecord7() {
					return this.dnsRecord7;
				}

				public void setDnsRecord7(DnsRecord7 dnsRecord7) {
					this.dnsRecord7 = dnsRecord7;
				}

				public static class DnsRecord7 {

					private String recordType;

					private String host;

					private String value;

					public String getRecordType() {
						return this.recordType;
					}

					public void setRecordType(String recordType) {
						this.recordType = recordType;
					}

					public String getHost() {
						return this.host;
					}

					public void setHost(String host) {
						this.host = host;
					}

					public String getValue() {
						return this.value;
					}

					public void setValue(String value) {
						this.value = value;
					}
				}
			}

			public static class Certificate4 {

				private String certificateStatus;

				private String certificateType;

				private String certificateName;

				private String endTime;

				public String getCertificateStatus() {
					return this.certificateStatus;
				}

				public void setCertificateStatus(String certificateStatus) {
					this.certificateStatus = certificateStatus;
				}

				public String getCertificateType() {
					return this.certificateType;
				}

				public void setCertificateType(String certificateType) {
					this.certificateType = certificateType;
				}

				public String getCertificateName() {
					return this.certificateName;
				}

				public void setCertificateName(String certificateName) {
					this.certificateName = certificateName;
				}

				public String getEndTime() {
					return this.endTime;
				}

				public void setEndTime(String endTime) {
					this.endTime = endTime;
				}
			}

			public static class Ownership5 {

				private String account;

				private String provider;

				public String getAccount() {
					return this.account;
				}

				public void setAccount(String account) {
					this.account = account;
				}

				public String getProvider() {
					return this.provider;
				}

				public void setProvider(String provider) {
					this.provider = provider;
				}
			}
		}
	}

	@Override
	public ListAppInstanceDomainsResponse getInstance(UnmarshallerContext context) {
		return	ListAppInstanceDomainsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
