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

package com.aliyuncs.dt_oc_info.model.v20220829;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.dt_oc_info.transform.v20220829.GetOcIcBasicResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetOcIcBasicResponse extends AcsResponse {

	private String code;

	private Boolean success;

	private String message;

	private Integer totalNum;

	private Integer pageIndex;

	private Integer pageNum;

	private String requestId;

	private Data data;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getTotalNum() {
		return this.totalNum;
	}

	public void setTotalNum(Integer totalNum) {
		this.totalNum = totalNum;
	}

	public Integer getPageIndex() {
		return this.pageIndex;
	}

	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
	}

	public Integer getPageNum() {
		return this.pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String entName;

		private String legalName;

		private String esDate;

		private String entStatus;

		private String regCap;

		private String recCap;

		private String socialCreditCode;

		private String licenseNumber;

		private String orgNo;

		private String taxNum;

		private String entType;

		private String industryNameLv1;

		private String industryNameLv2;

		private String opFrom;

		private String opTo;

		private String staffNum;

		private String insuredNum;

		private String entNameEng;

		private String formerNames;

		private String regOrg;

		private String checkDate;

		private String opScope;

		private String entAddress;

		private String entBrief;

		private String regOrgProvince;

		private String regOrgCity;

		private String regOrgDistrict;

		public String getEntName() {
			return this.entName;
		}

		public void setEntName(String entName) {
			this.entName = entName;
		}

		public String getLegalName() {
			return this.legalName;
		}

		public void setLegalName(String legalName) {
			this.legalName = legalName;
		}

		public String getEsDate() {
			return this.esDate;
		}

		public void setEsDate(String esDate) {
			this.esDate = esDate;
		}

		public String getEntStatus() {
			return this.entStatus;
		}

		public void setEntStatus(String entStatus) {
			this.entStatus = entStatus;
		}

		public String getRegCap() {
			return this.regCap;
		}

		public void setRegCap(String regCap) {
			this.regCap = regCap;
		}

		public String getRecCap() {
			return this.recCap;
		}

		public void setRecCap(String recCap) {
			this.recCap = recCap;
		}

		public String getSocialCreditCode() {
			return this.socialCreditCode;
		}

		public void setSocialCreditCode(String socialCreditCode) {
			this.socialCreditCode = socialCreditCode;
		}

		public String getLicenseNumber() {
			return this.licenseNumber;
		}

		public void setLicenseNumber(String licenseNumber) {
			this.licenseNumber = licenseNumber;
		}

		public String getOrgNo() {
			return this.orgNo;
		}

		public void setOrgNo(String orgNo) {
			this.orgNo = orgNo;
		}

		public String getTaxNum() {
			return this.taxNum;
		}

		public void setTaxNum(String taxNum) {
			this.taxNum = taxNum;
		}

		public String getEntType() {
			return this.entType;
		}

		public void setEntType(String entType) {
			this.entType = entType;
		}

		public String getIndustryNameLv1() {
			return this.industryNameLv1;
		}

		public void setIndustryNameLv1(String industryNameLv1) {
			this.industryNameLv1 = industryNameLv1;
		}

		public String getIndustryNameLv2() {
			return this.industryNameLv2;
		}

		public void setIndustryNameLv2(String industryNameLv2) {
			this.industryNameLv2 = industryNameLv2;
		}

		public String getOpFrom() {
			return this.opFrom;
		}

		public void setOpFrom(String opFrom) {
			this.opFrom = opFrom;
		}

		public String getOpTo() {
			return this.opTo;
		}

		public void setOpTo(String opTo) {
			this.opTo = opTo;
		}

		public String getStaffNum() {
			return this.staffNum;
		}

		public void setStaffNum(String staffNum) {
			this.staffNum = staffNum;
		}

		public String getInsuredNum() {
			return this.insuredNum;
		}

		public void setInsuredNum(String insuredNum) {
			this.insuredNum = insuredNum;
		}

		public String getEntNameEng() {
			return this.entNameEng;
		}

		public void setEntNameEng(String entNameEng) {
			this.entNameEng = entNameEng;
		}

		public String getFormerNames() {
			return this.formerNames;
		}

		public void setFormerNames(String formerNames) {
			this.formerNames = formerNames;
		}

		public String getRegOrg() {
			return this.regOrg;
		}

		public void setRegOrg(String regOrg) {
			this.regOrg = regOrg;
		}

		public String getCheckDate() {
			return this.checkDate;
		}

		public void setCheckDate(String checkDate) {
			this.checkDate = checkDate;
		}

		public String getOpScope() {
			return this.opScope;
		}

		public void setOpScope(String opScope) {
			this.opScope = opScope;
		}

		public String getEntAddress() {
			return this.entAddress;
		}

		public void setEntAddress(String entAddress) {
			this.entAddress = entAddress;
		}

		public String getEntBrief() {
			return this.entBrief;
		}

		public void setEntBrief(String entBrief) {
			this.entBrief = entBrief;
		}

		public String getRegOrgProvince() {
			return this.regOrgProvince;
		}

		public void setRegOrgProvince(String regOrgProvince) {
			this.regOrgProvince = regOrgProvince;
		}

		public String getRegOrgCity() {
			return this.regOrgCity;
		}

		public void setRegOrgCity(String regOrgCity) {
			this.regOrgCity = regOrgCity;
		}

		public String getRegOrgDistrict() {
			return this.regOrgDistrict;
		}

		public void setRegOrgDistrict(String regOrgDistrict) {
			this.regOrgDistrict = regOrgDistrict;
		}
	}

	@Override
	public GetOcIcBasicResponse getInstance(UnmarshallerContext context) {
		return	GetOcIcBasicResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
