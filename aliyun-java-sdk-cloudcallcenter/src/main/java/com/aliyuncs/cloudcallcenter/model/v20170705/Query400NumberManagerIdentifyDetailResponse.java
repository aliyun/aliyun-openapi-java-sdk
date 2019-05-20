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
import com.aliyuncs.cloudcallcenter.transform.v20170705.Query400NumberManagerIdentifyDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class Query400NumberManagerIdentifyDetailResponse extends AcsResponse {

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

		private Long aliyunUid;

		private Long partnerId;

		private String managerName;

		private String managerMobilePhone;

		private String managerCertType;

		private String managerCertNumber;

		private String managerCertEffDate;

		private String managerCertExpDate;

		private String managerCertPic;

		private String unifiedstandardAgreement;

		private String empowerment;

		private String supplementaryMaterial;

		private String rejectReason;

		private String reasonKey;

		public Long getAliyunUid() {
			return this.aliyunUid;
		}

		public void setAliyunUid(Long aliyunUid) {
			this.aliyunUid = aliyunUid;
		}

		public Long getPartnerId() {
			return this.partnerId;
		}

		public void setPartnerId(Long partnerId) {
			this.partnerId = partnerId;
		}

		public String getManagerName() {
			return this.managerName;
		}

		public void setManagerName(String managerName) {
			this.managerName = managerName;
		}

		public String getManagerMobilePhone() {
			return this.managerMobilePhone;
		}

		public void setManagerMobilePhone(String managerMobilePhone) {
			this.managerMobilePhone = managerMobilePhone;
		}

		public String getManagerCertType() {
			return this.managerCertType;
		}

		public void setManagerCertType(String managerCertType) {
			this.managerCertType = managerCertType;
		}

		public String getManagerCertNumber() {
			return this.managerCertNumber;
		}

		public void setManagerCertNumber(String managerCertNumber) {
			this.managerCertNumber = managerCertNumber;
		}

		public String getManagerCertEffDate() {
			return this.managerCertEffDate;
		}

		public void setManagerCertEffDate(String managerCertEffDate) {
			this.managerCertEffDate = managerCertEffDate;
		}

		public String getManagerCertExpDate() {
			return this.managerCertExpDate;
		}

		public void setManagerCertExpDate(String managerCertExpDate) {
			this.managerCertExpDate = managerCertExpDate;
		}

		public String getManagerCertPic() {
			return this.managerCertPic;
		}

		public void setManagerCertPic(String managerCertPic) {
			this.managerCertPic = managerCertPic;
		}

		public String getUnifiedstandardAgreement() {
			return this.unifiedstandardAgreement;
		}

		public void setUnifiedstandardAgreement(String unifiedstandardAgreement) {
			this.unifiedstandardAgreement = unifiedstandardAgreement;
		}

		public String getEmpowerment() {
			return this.empowerment;
		}

		public void setEmpowerment(String empowerment) {
			this.empowerment = empowerment;
		}

		public String getSupplementaryMaterial() {
			return this.supplementaryMaterial;
		}

		public void setSupplementaryMaterial(String supplementaryMaterial) {
			this.supplementaryMaterial = supplementaryMaterial;
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
	}

	@Override
	public Query400NumberManagerIdentifyDetailResponse getInstance(UnmarshallerContext context) {
		return	Query400NumberManagerIdentifyDetailResponseUnmarshaller.unmarshall(this, context);
	}
}
