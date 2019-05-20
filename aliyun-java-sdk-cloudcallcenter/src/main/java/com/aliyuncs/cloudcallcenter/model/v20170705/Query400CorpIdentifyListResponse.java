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
import com.aliyuncs.cloudcallcenter.transform.v20170705.Query400CorpIdentifyListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class Query400CorpIdentifyListResponse extends AcsResponse {

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

		private List<Number400CorpIdentifyDomain> corpIdentifies;

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

		public List<Number400CorpIdentifyDomain> getCorpIdentifies() {
			return this.corpIdentifies;
		}

		public void setCorpIdentifies(List<Number400CorpIdentifyDomain> corpIdentifies) {
			this.corpIdentifies = corpIdentifies;
		}

		public static class Number400CorpIdentifyDomain {

			private String applyRemark;

			private String auditState;

			private String businessLicensePic;

			private Integer buyCountLimit;

			private Boolean canModifyIdentify;

			private String corpCertNumber;

			private String corpCertType;

			private String corpName;

			private String corpNumber;

			private String corpRegisteredAddrArea;

			private String corpRegisteredAddrCity;

			private String corpRegisteredAddrDetail;

			private String corpRegisteredAddrProv;

			private String corpRegisteredEffDate;

			private String corpRegisteredExpDate;

			private String legalPersonCertEffDate;

			private String legalPersonCertExpDate;

			private String legalPersonCertNumber;

			private String legalPersonCertPic;

			private String legalPersonCertType;

			private String legalPersonName;

			private String legalPersonPhoneNumber;

			private String orderId;

			private Long orderTime;

			private Long partnerId;

			private Long realNameInsId;

			private Integer remainCount;

			private Long specId;

			private String specName;

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

			public String getBusinessLicensePic() {
				return this.businessLicensePic;
			}

			public void setBusinessLicensePic(String businessLicensePic) {
				this.businessLicensePic = businessLicensePic;
			}

			public Integer getBuyCountLimit() {
				return this.buyCountLimit;
			}

			public void setBuyCountLimit(Integer buyCountLimit) {
				this.buyCountLimit = buyCountLimit;
			}

			public Boolean getCanModifyIdentify() {
				return this.canModifyIdentify;
			}

			public void setCanModifyIdentify(Boolean canModifyIdentify) {
				this.canModifyIdentify = canModifyIdentify;
			}

			public String getCorpCertNumber() {
				return this.corpCertNumber;
			}

			public void setCorpCertNumber(String corpCertNumber) {
				this.corpCertNumber = corpCertNumber;
			}

			public String getCorpCertType() {
				return this.corpCertType;
			}

			public void setCorpCertType(String corpCertType) {
				this.corpCertType = corpCertType;
			}

			public String getCorpName() {
				return this.corpName;
			}

			public void setCorpName(String corpName) {
				this.corpName = corpName;
			}

			public String getCorpNumber() {
				return this.corpNumber;
			}

			public void setCorpNumber(String corpNumber) {
				this.corpNumber = corpNumber;
			}

			public String getCorpRegisteredAddrArea() {
				return this.corpRegisteredAddrArea;
			}

			public void setCorpRegisteredAddrArea(String corpRegisteredAddrArea) {
				this.corpRegisteredAddrArea = corpRegisteredAddrArea;
			}

			public String getCorpRegisteredAddrCity() {
				return this.corpRegisteredAddrCity;
			}

			public void setCorpRegisteredAddrCity(String corpRegisteredAddrCity) {
				this.corpRegisteredAddrCity = corpRegisteredAddrCity;
			}

			public String getCorpRegisteredAddrDetail() {
				return this.corpRegisteredAddrDetail;
			}

			public void setCorpRegisteredAddrDetail(String corpRegisteredAddrDetail) {
				this.corpRegisteredAddrDetail = corpRegisteredAddrDetail;
			}

			public String getCorpRegisteredAddrProv() {
				return this.corpRegisteredAddrProv;
			}

			public void setCorpRegisteredAddrProv(String corpRegisteredAddrProv) {
				this.corpRegisteredAddrProv = corpRegisteredAddrProv;
			}

			public String getCorpRegisteredEffDate() {
				return this.corpRegisteredEffDate;
			}

			public void setCorpRegisteredEffDate(String corpRegisteredEffDate) {
				this.corpRegisteredEffDate = corpRegisteredEffDate;
			}

			public String getCorpRegisteredExpDate() {
				return this.corpRegisteredExpDate;
			}

			public void setCorpRegisteredExpDate(String corpRegisteredExpDate) {
				this.corpRegisteredExpDate = corpRegisteredExpDate;
			}

			public String getLegalPersonCertEffDate() {
				return this.legalPersonCertEffDate;
			}

			public void setLegalPersonCertEffDate(String legalPersonCertEffDate) {
				this.legalPersonCertEffDate = legalPersonCertEffDate;
			}

			public String getLegalPersonCertExpDate() {
				return this.legalPersonCertExpDate;
			}

			public void setLegalPersonCertExpDate(String legalPersonCertExpDate) {
				this.legalPersonCertExpDate = legalPersonCertExpDate;
			}

			public String getLegalPersonCertNumber() {
				return this.legalPersonCertNumber;
			}

			public void setLegalPersonCertNumber(String legalPersonCertNumber) {
				this.legalPersonCertNumber = legalPersonCertNumber;
			}

			public String getLegalPersonCertPic() {
				return this.legalPersonCertPic;
			}

			public void setLegalPersonCertPic(String legalPersonCertPic) {
				this.legalPersonCertPic = legalPersonCertPic;
			}

			public String getLegalPersonCertType() {
				return this.legalPersonCertType;
			}

			public void setLegalPersonCertType(String legalPersonCertType) {
				this.legalPersonCertType = legalPersonCertType;
			}

			public String getLegalPersonName() {
				return this.legalPersonName;
			}

			public void setLegalPersonName(String legalPersonName) {
				this.legalPersonName = legalPersonName;
			}

			public String getLegalPersonPhoneNumber() {
				return this.legalPersonPhoneNumber;
			}

			public void setLegalPersonPhoneNumber(String legalPersonPhoneNumber) {
				this.legalPersonPhoneNumber = legalPersonPhoneNumber;
			}

			public String getOrderId() {
				return this.orderId;
			}

			public void setOrderId(String orderId) {
				this.orderId = orderId;
			}

			public Long getOrderTime() {
				return this.orderTime;
			}

			public void setOrderTime(Long orderTime) {
				this.orderTime = orderTime;
			}

			public Long getPartnerId() {
				return this.partnerId;
			}

			public void setPartnerId(Long partnerId) {
				this.partnerId = partnerId;
			}

			public Long getRealNameInsId() {
				return this.realNameInsId;
			}

			public void setRealNameInsId(Long realNameInsId) {
				this.realNameInsId = realNameInsId;
			}

			public Integer getRemainCount() {
				return this.remainCount;
			}

			public void setRemainCount(Integer remainCount) {
				this.remainCount = remainCount;
			}

			public Long getSpecId() {
				return this.specId;
			}

			public void setSpecId(Long specId) {
				this.specId = specId;
			}

			public String getSpecName() {
				return this.specName;
			}

			public void setSpecName(String specName) {
				this.specName = specName;
			}
		}
	}

	@Override
	public Query400CorpIdentifyListResponse getInstance(UnmarshallerContext context) {
		return	Query400CorpIdentifyListResponseUnmarshaller.unmarshall(this, context);
	}
}
