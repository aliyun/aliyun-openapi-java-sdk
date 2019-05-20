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
import com.aliyuncs.cloudcallcenter.transform.v20170705.GetCorpIdentifyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetCorpIdentifyResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private List<CorpIdentify> corpIdentifies;

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

	public List<CorpIdentify> getCorpIdentifies() {
		return this.corpIdentifies;
	}

	public void setCorpIdentifies(List<CorpIdentify> corpIdentifies) {
		this.corpIdentifies = corpIdentifies;
	}

	public static class CorpIdentify {

		private Long taobaoUid;

		private Long ramId;

		private Long orderId;

		private Long partnerId;

		private String applyRemark;

		private String regionNameProvince;

		private String regionNameCity;

		private String corpName;

		private String legalPersonName;

		private String legalPersonCertNumber;

		private String managerContactPhoneNumber;

		private String managerName;

		private String businessLicenseAddress;

		private String managerCertNumber;

		private String organizationCode;

		private String telecomUndertakingPic;

		private String managerCertPic;

		private String numberApplicationLetterPic;

		private String businessLicensePic;

		private String procedureDesc;

		public Long getTaobaoUid() {
			return this.taobaoUid;
		}

		public void setTaobaoUid(Long taobaoUid) {
			this.taobaoUid = taobaoUid;
		}

		public Long getRamId() {
			return this.ramId;
		}

		public void setRamId(Long ramId) {
			this.ramId = ramId;
		}

		public Long getOrderId() {
			return this.orderId;
		}

		public void setOrderId(Long orderId) {
			this.orderId = orderId;
		}

		public Long getPartnerId() {
			return this.partnerId;
		}

		public void setPartnerId(Long partnerId) {
			this.partnerId = partnerId;
		}

		public String getApplyRemark() {
			return this.applyRemark;
		}

		public void setApplyRemark(String applyRemark) {
			this.applyRemark = applyRemark;
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

		public String getCorpName() {
			return this.corpName;
		}

		public void setCorpName(String corpName) {
			this.corpName = corpName;
		}

		public String getLegalPersonName() {
			return this.legalPersonName;
		}

		public void setLegalPersonName(String legalPersonName) {
			this.legalPersonName = legalPersonName;
		}

		public String getLegalPersonCertNumber() {
			return this.legalPersonCertNumber;
		}

		public void setLegalPersonCertNumber(String legalPersonCertNumber) {
			this.legalPersonCertNumber = legalPersonCertNumber;
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

		public String getBusinessLicenseAddress() {
			return this.businessLicenseAddress;
		}

		public void setBusinessLicenseAddress(String businessLicenseAddress) {
			this.businessLicenseAddress = businessLicenseAddress;
		}

		public String getManagerCertNumber() {
			return this.managerCertNumber;
		}

		public void setManagerCertNumber(String managerCertNumber) {
			this.managerCertNumber = managerCertNumber;
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

		public String getManagerCertPic() {
			return this.managerCertPic;
		}

		public void setManagerCertPic(String managerCertPic) {
			this.managerCertPic = managerCertPic;
		}

		public String getNumberApplicationLetterPic() {
			return this.numberApplicationLetterPic;
		}

		public void setNumberApplicationLetterPic(String numberApplicationLetterPic) {
			this.numberApplicationLetterPic = numberApplicationLetterPic;
		}

		public String getBusinessLicensePic() {
			return this.businessLicensePic;
		}

		public void setBusinessLicensePic(String businessLicensePic) {
			this.businessLicensePic = businessLicensePic;
		}

		public String getProcedureDesc() {
			return this.procedureDesc;
		}

		public void setProcedureDesc(String procedureDesc) {
			this.procedureDesc = procedureDesc;
		}
	}

	@Override
	public GetCorpIdentifyResponse getInstance(UnmarshallerContext context) {
		return	GetCorpIdentifyResponseUnmarshaller.unmarshall(this, context);
	}
}
