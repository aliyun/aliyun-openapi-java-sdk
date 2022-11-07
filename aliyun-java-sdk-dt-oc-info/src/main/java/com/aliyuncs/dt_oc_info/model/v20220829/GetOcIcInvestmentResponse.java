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
import com.aliyuncs.dt_oc_info.transform.v20220829.GetOcIcInvestmentResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetOcIcInvestmentResponse extends AcsResponse {

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

		private String investName;

		private String investCreditCode;

		private String investLicenseNo;

		private String investEsDate;

		private String investLegalName;

		private String investRegCap;

		private String investStatus;

		private String shouldCap;

		private String stockPercentage;

		public String getEntName() {
			return this.entName;
		}

		public void setEntName(String entName) {
			this.entName = entName;
		}

		public String getInvestName() {
			return this.investName;
		}

		public void setInvestName(String investName) {
			this.investName = investName;
		}

		public String getInvestCreditCode() {
			return this.investCreditCode;
		}

		public void setInvestCreditCode(String investCreditCode) {
			this.investCreditCode = investCreditCode;
		}

		public String getInvestLicenseNo() {
			return this.investLicenseNo;
		}

		public void setInvestLicenseNo(String investLicenseNo) {
			this.investLicenseNo = investLicenseNo;
		}

		public String getInvestEsDate() {
			return this.investEsDate;
		}

		public void setInvestEsDate(String investEsDate) {
			this.investEsDate = investEsDate;
		}

		public String getInvestLegalName() {
			return this.investLegalName;
		}

		public void setInvestLegalName(String investLegalName) {
			this.investLegalName = investLegalName;
		}

		public String getInvestRegCap() {
			return this.investRegCap;
		}

		public void setInvestRegCap(String investRegCap) {
			this.investRegCap = investRegCap;
		}

		public String getInvestStatus() {
			return this.investStatus;
		}

		public void setInvestStatus(String investStatus) {
			this.investStatus = investStatus;
		}

		public String getShouldCap() {
			return this.shouldCap;
		}

		public void setShouldCap(String shouldCap) {
			this.shouldCap = shouldCap;
		}

		public String getStockPercentage() {
			return this.stockPercentage;
		}

		public void setStockPercentage(String stockPercentage) {
			this.stockPercentage = stockPercentage;
		}
	}

	@Override
	public GetOcIcInvestmentResponse getInstance(UnmarshallerContext context) {
		return	GetOcIcInvestmentResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
