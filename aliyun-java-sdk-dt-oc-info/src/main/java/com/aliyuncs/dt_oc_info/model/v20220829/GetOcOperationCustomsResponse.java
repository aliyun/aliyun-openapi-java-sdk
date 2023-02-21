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
import com.aliyuncs.dt_oc_info.transform.v20220829.GetOcOperationCustomsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetOcOperationCustomsResponse extends AcsResponse {

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

		private String regDate;

		private String customsNum;

		private String customsReg;

		private String businessCate;

		private String adminRegionName;

		private String ecoRegionName;

		private String specialArea;

		private String industryType;

		private String validDate;

		private String electType;

		private String cancelFlag;

		private String annualReport;

		private String creditLevelsNew;

		private String identCode;

		private String identDate;

		public String getEntName() {
			return this.entName;
		}

		public void setEntName(String entName) {
			this.entName = entName;
		}

		public String getRegDate() {
			return this.regDate;
		}

		public void setRegDate(String regDate) {
			this.regDate = regDate;
		}

		public String getCustomsNum() {
			return this.customsNum;
		}

		public void setCustomsNum(String customsNum) {
			this.customsNum = customsNum;
		}

		public String getCustomsReg() {
			return this.customsReg;
		}

		public void setCustomsReg(String customsReg) {
			this.customsReg = customsReg;
		}

		public String getBusinessCate() {
			return this.businessCate;
		}

		public void setBusinessCate(String businessCate) {
			this.businessCate = businessCate;
		}

		public String getAdminRegionName() {
			return this.adminRegionName;
		}

		public void setAdminRegionName(String adminRegionName) {
			this.adminRegionName = adminRegionName;
		}

		public String getEcoRegionName() {
			return this.ecoRegionName;
		}

		public void setEcoRegionName(String ecoRegionName) {
			this.ecoRegionName = ecoRegionName;
		}

		public String getSpecialArea() {
			return this.specialArea;
		}

		public void setSpecialArea(String specialArea) {
			this.specialArea = specialArea;
		}

		public String getIndustryType() {
			return this.industryType;
		}

		public void setIndustryType(String industryType) {
			this.industryType = industryType;
		}

		public String getValidDate() {
			return this.validDate;
		}

		public void setValidDate(String validDate) {
			this.validDate = validDate;
		}

		public String getElectType() {
			return this.electType;
		}

		public void setElectType(String electType) {
			this.electType = electType;
		}

		public String getCancelFlag() {
			return this.cancelFlag;
		}

		public void setCancelFlag(String cancelFlag) {
			this.cancelFlag = cancelFlag;
		}

		public String getAnnualReport() {
			return this.annualReport;
		}

		public void setAnnualReport(String annualReport) {
			this.annualReport = annualReport;
		}

		public String getCreditLevelsNew() {
			return this.creditLevelsNew;
		}

		public void setCreditLevelsNew(String creditLevelsNew) {
			this.creditLevelsNew = creditLevelsNew;
		}

		public String getIdentCode() {
			return this.identCode;
		}

		public void setIdentCode(String identCode) {
			this.identCode = identCode;
		}

		public String getIdentDate() {
			return this.identDate;
		}

		public void setIdentDate(String identDate) {
			this.identDate = identDate;
		}
	}

	@Override
	public GetOcOperationCustomsResponse getInstance(UnmarshallerContext context) {
		return	GetOcOperationCustomsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
