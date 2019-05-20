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

package com.aliyuncs.cloudcallcenter.model.v20170705;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudcallcenter.transform.v20170705.QueryNumberCorpResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryNumberCorpResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer totalCount;

		private Integer pageNumber;

		private Integer pageSize;

		private List<QueryCorpDomain> list;

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public Integer getPageNumber() {
			return this.pageNumber;
		}

		public void setPageNumber(Integer pageNumber) {
			this.pageNumber = pageNumber;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public List<QueryCorpDomain> getList() {
			return this.list;
		}

		public void setList(List<QueryCorpDomain> list) {
			this.list = list;
		}

		public static class QueryCorpDomain {

			private String corpName;

			private List<QueryCorpIdentifyDomain> identify;

			public String getCorpName() {
				return this.corpName;
			}

			public void setCorpName(String corpName) {
				this.corpName = corpName;
			}

			public List<QueryCorpIdentifyDomain> getIdentify() {
				return this.identify;
			}

			public void setIdentify(List<QueryCorpIdentifyDomain> identify) {
				this.identify = identify;
			}

			public static class QueryCorpIdentifyDomain {

				private String applyRemark;

				private String auditState;

				private String corpName;

				private String regionNameProvince;

				private String regionNameCity;

				private Long orderId;

				private String specName;

				private Integer remainCount;

				private Integer buyCountLimit;

				private Boolean canApplyOffsite;

				private String realNameInsId;

				private Long specId;

				private String specIdArray;

				private String registeredFundCode;

				private Long gmtCreate;

				private String businessLicenseAddress;

				private String businessLicensePic;

				private String legalPersonCertNumber;

				private String legalPersonrCertNumber;

				private String legalPersonName;

				private String managerCertNumber;

				private String managerCertPic;

				private String managerContactPhoneNumber;

				private String managerName;

				private String numberApplicationLetterPic;

				private String organizationCode;

				private String telecomUndertakingPic;

				private String procedureDesc;

				private AuditRemarkInfo auditRemarkInfo;

				public String getApplyRemark() {
					return this.applyRemark;
				}

				public void setApplyRemark(String applyRemark) {
					this.applyRemark = applyRemark;
				}

				public String getAuditState() {
					return this.auditState;
				}

				public void setAuditState(String auditState) {
					this.auditState = auditState;
				}

				public String getCorpName() {
					return this.corpName;
				}

				public void setCorpName(String corpName) {
					this.corpName = corpName;
				}

				public String getRegionNameProvince() {
					return this.regionNameProvince;
				}

				public void setRegionNameProvince(String regionNameProvince) {
					this.regionNameProvince = regionNameProvince;
				}

				public String getRegionNameCity() {
					return this.regionNameCity;
				}

				public void setRegionNameCity(String regionNameCity) {
					this.regionNameCity = regionNameCity;
				}

				public Long getOrderId() {
					return this.orderId;
				}

				public void setOrderId(Long orderId) {
					this.orderId = orderId;
				}

				public String getSpecName() {
					return this.specName;
				}

				public void setSpecName(String specName) {
					this.specName = specName;
				}

				public Integer getRemainCount() {
					return this.remainCount;
				}

				public void setRemainCount(Integer remainCount) {
					this.remainCount = remainCount;
				}

				public Integer getBuyCountLimit() {
					return this.buyCountLimit;
				}

				public void setBuyCountLimit(Integer buyCountLimit) {
					this.buyCountLimit = buyCountLimit;
				}

				public Boolean getCanApplyOffsite() {
					return this.canApplyOffsite;
				}

				public void setCanApplyOffsite(Boolean canApplyOffsite) {
					this.canApplyOffsite = canApplyOffsite;
				}

				public String getRealNameInsId() {
					return this.realNameInsId;
				}

				public void setRealNameInsId(String realNameInsId) {
					this.realNameInsId = realNameInsId;
				}

				public Long getSpecId() {
					return this.specId;
				}

				public void setSpecId(Long specId) {
					this.specId = specId;
				}

				public String getSpecIdArray() {
					return this.specIdArray;
				}

				public void setSpecIdArray(String specIdArray) {
					this.specIdArray = specIdArray;
				}

				public String getRegisteredFundCode() {
					return this.registeredFundCode;
				}

				public void setRegisteredFundCode(String registeredFundCode) {
					this.registeredFundCode = registeredFundCode;
				}

				public Long getGmtCreate() {
					return this.gmtCreate;
				}

				public void setGmtCreate(Long gmtCreate) {
					this.gmtCreate = gmtCreate;
				}

				public String getBusinessLicenseAddress() {
					return this.businessLicenseAddress;
				}

				public void setBusinessLicenseAddress(String businessLicenseAddress) {
					this.businessLicenseAddress = businessLicenseAddress;
				}

				public String getBusinessLicensePic() {
					return this.businessLicensePic;
				}

				public void setBusinessLicensePic(String businessLicensePic) {
					this.businessLicensePic = businessLicensePic;
				}

				public String getLegalPersonCertNumber() {
					return this.legalPersonCertNumber;
				}

				public void setLegalPersonCertNumber(String legalPersonCertNumber) {
					this.legalPersonCertNumber = legalPersonCertNumber;
				}

				public String getLegalPersonrCertNumber() {
					return this.legalPersonrCertNumber;
				}

				public void setLegalPersonrCertNumber(String legalPersonrCertNumber) {
					this.legalPersonrCertNumber = legalPersonrCertNumber;
				}

				public String getLegalPersonName() {
					return this.legalPersonName;
				}

				public void setLegalPersonName(String legalPersonName) {
					this.legalPersonName = legalPersonName;
				}

				public String getManagerCertNumber() {
					return this.managerCertNumber;
				}

				public void setManagerCertNumber(String managerCertNumber) {
					this.managerCertNumber = managerCertNumber;
				}

				public String getManagerCertPic() {
					return this.managerCertPic;
				}

				public void setManagerCertPic(String managerCertPic) {
					this.managerCertPic = managerCertPic;
				}

				public String getManagerContactPhoneNumber() {
					return this.managerContactPhoneNumber;
				}

				public void setManagerContactPhoneNumber(String managerContactPhoneNumber) {
					this.managerContactPhoneNumber = managerContactPhoneNumber;
				}

				public String getManagerName() {
					return this.managerName;
				}

				public void setManagerName(String managerName) {
					this.managerName = managerName;
				}

				public String getNumberApplicationLetterPic() {
					return this.numberApplicationLetterPic;
				}

				public void setNumberApplicationLetterPic(String numberApplicationLetterPic) {
					this.numberApplicationLetterPic = numberApplicationLetterPic;
				}

				public String getOrganizationCode() {
					return this.organizationCode;
				}

				public void setOrganizationCode(String organizationCode) {
					this.organizationCode = organizationCode;
				}

				public String getTelecomUndertakingPic() {
					return this.telecomUndertakingPic;
				}

				public void setTelecomUndertakingPic(String telecomUndertakingPic) {
					this.telecomUndertakingPic = telecomUndertakingPic;
				}

				public String getProcedureDesc() {
					return this.procedureDesc;
				}

				public void setProcedureDesc(String procedureDesc) {
					this.procedureDesc = procedureDesc;
				}

				public AuditRemarkInfo getAuditRemarkInfo() {
					return this.auditRemarkInfo;
				}

				public void setAuditRemarkInfo(AuditRemarkInfo auditRemarkInfo) {
					this.auditRemarkInfo = auditRemarkInfo;
				}

				public static class AuditRemarkInfo {

					private String rejectDate;

					private String rejectInfo;

					public String getRejectDate() {
						return this.rejectDate;
					}

					public void setRejectDate(String rejectDate) {
						this.rejectDate = rejectDate;
					}

					public String getRejectInfo() {
						return this.rejectInfo;
					}

					public void setRejectInfo(String rejectInfo) {
						this.rejectInfo = rejectInfo;
					}
				}
			}
		}
	}

	@Override
	public QueryNumberCorpResponse getInstance(UnmarshallerContext context) {
		return	QueryNumberCorpResponseUnmarshaller.unmarshall(this, context);
	}
}
