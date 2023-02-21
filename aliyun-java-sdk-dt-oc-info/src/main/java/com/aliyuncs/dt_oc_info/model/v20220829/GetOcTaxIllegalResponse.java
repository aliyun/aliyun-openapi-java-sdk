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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dt_oc_info.transform.v20220829.GetOcTaxIllegalResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetOcTaxIllegalResponse extends AcsResponse {

	private String code;

	private Boolean success;

	private String message;

	private Integer totalNum;

	private Integer pageIndex;

	private Integer pageNum;

	private String requestId;

	private List<DataItem> data;

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

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String entName;

		private String taxpayerNum;

		private String orgCode;

		private String entAddress;

		private String caseType;

		private String illegalTruth;

		private String publishDate;

		private String lawBasis;

		private String department;

		private String legalName;

		private String legalSex;

		private String legalCardType;

		private String legalCardNum;

		private String financialName;

		private String financialSex;

		private String financialCardType;

		private String financialCardNum;

		private String agencyEnt;

		private String agencyName;

		private String agencySex;

		private String agencyCardType;

		private String agencyCardNum;

		public String getEntName() {
			return this.entName;
		}

		public void setEntName(String entName) {
			this.entName = entName;
		}

		public String getTaxpayerNum() {
			return this.taxpayerNum;
		}

		public void setTaxpayerNum(String taxpayerNum) {
			this.taxpayerNum = taxpayerNum;
		}

		public String getOrgCode() {
			return this.orgCode;
		}

		public void setOrgCode(String orgCode) {
			this.orgCode = orgCode;
		}

		public String getEntAddress() {
			return this.entAddress;
		}

		public void setEntAddress(String entAddress) {
			this.entAddress = entAddress;
		}

		public String getCaseType() {
			return this.caseType;
		}

		public void setCaseType(String caseType) {
			this.caseType = caseType;
		}

		public String getIllegalTruth() {
			return this.illegalTruth;
		}

		public void setIllegalTruth(String illegalTruth) {
			this.illegalTruth = illegalTruth;
		}

		public String getPublishDate() {
			return this.publishDate;
		}

		public void setPublishDate(String publishDate) {
			this.publishDate = publishDate;
		}

		public String getLawBasis() {
			return this.lawBasis;
		}

		public void setLawBasis(String lawBasis) {
			this.lawBasis = lawBasis;
		}

		public String getDepartment() {
			return this.department;
		}

		public void setDepartment(String department) {
			this.department = department;
		}

		public String getLegalName() {
			return this.legalName;
		}

		public void setLegalName(String legalName) {
			this.legalName = legalName;
		}

		public String getLegalSex() {
			return this.legalSex;
		}

		public void setLegalSex(String legalSex) {
			this.legalSex = legalSex;
		}

		public String getLegalCardType() {
			return this.legalCardType;
		}

		public void setLegalCardType(String legalCardType) {
			this.legalCardType = legalCardType;
		}

		public String getLegalCardNum() {
			return this.legalCardNum;
		}

		public void setLegalCardNum(String legalCardNum) {
			this.legalCardNum = legalCardNum;
		}

		public String getFinancialName() {
			return this.financialName;
		}

		public void setFinancialName(String financialName) {
			this.financialName = financialName;
		}

		public String getFinancialSex() {
			return this.financialSex;
		}

		public void setFinancialSex(String financialSex) {
			this.financialSex = financialSex;
		}

		public String getFinancialCardType() {
			return this.financialCardType;
		}

		public void setFinancialCardType(String financialCardType) {
			this.financialCardType = financialCardType;
		}

		public String getFinancialCardNum() {
			return this.financialCardNum;
		}

		public void setFinancialCardNum(String financialCardNum) {
			this.financialCardNum = financialCardNum;
		}

		public String getAgencyEnt() {
			return this.agencyEnt;
		}

		public void setAgencyEnt(String agencyEnt) {
			this.agencyEnt = agencyEnt;
		}

		public String getAgencyName() {
			return this.agencyName;
		}

		public void setAgencyName(String agencyName) {
			this.agencyName = agencyName;
		}

		public String getAgencySex() {
			return this.agencySex;
		}

		public void setAgencySex(String agencySex) {
			this.agencySex = agencySex;
		}

		public String getAgencyCardType() {
			return this.agencyCardType;
		}

		public void setAgencyCardType(String agencyCardType) {
			this.agencyCardType = agencyCardType;
		}

		public String getAgencyCardNum() {
			return this.agencyCardNum;
		}

		public void setAgencyCardNum(String agencyCardNum) {
			this.agencyCardNum = agencyCardNum;
		}
	}

	@Override
	public GetOcTaxIllegalResponse getInstance(UnmarshallerContext context) {
		return	GetOcTaxIllegalResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
