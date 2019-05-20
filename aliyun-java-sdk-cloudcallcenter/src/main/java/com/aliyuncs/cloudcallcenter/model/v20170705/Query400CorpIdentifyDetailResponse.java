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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudcallcenter.transform.v20170705.Query400CorpIdentifyDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class Query400CorpIdentifyDetailResponse extends AcsResponse {

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

		private String corpName;

		private String corpNumber;

		private String corpCertType;

		private String corpCertNumber;

		private String corpRegisteredEffDate;

		private String corpRegisteredExpDate;

		private String corpRegisteredAddrProv;

		private String corpRegisteredAddrCity;

		private String corpRegisteredAddrArea;

		private String corpRegisteredAddrDetail;

		private String legalPersonName;

		private String legalPersonPhoneNumber;

		private String legalPersonCertType;

		private String legalPersonCertNumber;

		private String legalPersonCertEffDate;

		private String legalPersonCertExpDate;

		private String legalPersonCertPic;

		private String businessLicensePic;

		private Long specId;

		private String rejectReason;

		private String reasonKey;

		private String applyRemark;

		private String auditState;

		private Boolean canModifyIdentify;

		private String specIdArray;

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

		public String getCorpCertType() {
			return this.corpCertType;
		}

		public void setCorpCertType(String corpCertType) {
			this.corpCertType = corpCertType;
		}

		public String getCorpCertNumber() {
			return this.corpCertNumber;
		}

		public void setCorpCertNumber(String corpCertNumber) {
			this.corpCertNumber = corpCertNumber;
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

		public String getCorpRegisteredAddrProv() {
			return this.corpRegisteredAddrProv;
		}

		public void setCorpRegisteredAddrProv(String corpRegisteredAddrProv) {
			this.corpRegisteredAddrProv = corpRegisteredAddrProv;
		}

		public String getCorpRegisteredAddrCity() {
			return this.corpRegisteredAddrCity;
		}

		public void setCorpRegisteredAddrCity(String corpRegisteredAddrCity) {
			this.corpRegisteredAddrCity = corpRegisteredAddrCity;
		}

		public String getCorpRegisteredAddrArea() {
			return this.corpRegisteredAddrArea;
		}

		public void setCorpRegisteredAddrArea(String corpRegisteredAddrArea) {
			this.corpRegisteredAddrArea = corpRegisteredAddrArea;
		}

		public String getCorpRegisteredAddrDetail() {
			return this.corpRegisteredAddrDetail;
		}

		public void setCorpRegisteredAddrDetail(String corpRegisteredAddrDetail) {
			this.corpRegisteredAddrDetail = corpRegisteredAddrDetail;
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

		public String getLegalPersonCertType() {
			return this.legalPersonCertType;
		}

		public void setLegalPersonCertType(String legalPersonCertType) {
			this.legalPersonCertType = legalPersonCertType;
		}

		public String getLegalPersonCertNumber() {
			return this.legalPersonCertNumber;
		}

		public void setLegalPersonCertNumber(String legalPersonCertNumber) {
			this.legalPersonCertNumber = legalPersonCertNumber;
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

		public String getLegalPersonCertPic() {
			return this.legalPersonCertPic;
		}

		public void setLegalPersonCertPic(String legalPersonCertPic) {
			this.legalPersonCertPic = legalPersonCertPic;
		}

		public String getBusinessLicensePic() {
			return this.businessLicensePic;
		}

		public void setBusinessLicensePic(String businessLicensePic) {
			this.businessLicensePic = businessLicensePic;
		}

		public Long getSpecId() {
			return this.specId;
		}

		public void setSpecId(Long specId) {
			this.specId = specId;
		}

		public String getRejectReason() {
			return this.rejectReason;
		}

		public void setRejectReason(String rejectReason) {
			this.rejectReason = rejectReason;
		}

		public String getReasonKey() {
			return this.reasonKey;
		}

		public void setReasonKey(String reasonKey) {
			this.reasonKey = reasonKey;
		}

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

		public Boolean getCanModifyIdentify() {
			return this.canModifyIdentify;
		}

		public void setCanModifyIdentify(Boolean canModifyIdentify) {
			this.canModifyIdentify = canModifyIdentify;
		}

		public String getSpecIdArray() {
			return this.specIdArray;
		}

		public void setSpecIdArray(String specIdArray) {
			this.specIdArray = specIdArray;
		}
	}

	@Override
	public Query400CorpIdentifyDetailResponse getInstance(UnmarshallerContext context) {
		return	Query400CorpIdentifyDetailResponseUnmarshaller.unmarshall(this, context);
	}
}
