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
import com.aliyuncs.dt_oc_info.transform.v20220829.GetOcJusticeDishonestyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetOcJusticeDishonestyResponse extends AcsResponse {

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

		private String socialCreditCode;

		private String legalName;

		private String court;

		private String province;

		private String fromCaseNum;

		private String filingDate;

		private String caseNum;

		private String executeDepartment;

		private String finalDuty;

		private String executionStatus;

		private String executionDesc;

		private String publishDate;

		private String amount;

		public String getEntName() {
			return this.entName;
		}

		public void setEntName(String entName) {
			this.entName = entName;
		}

		public String getSocialCreditCode() {
			return this.socialCreditCode;
		}

		public void setSocialCreditCode(String socialCreditCode) {
			this.socialCreditCode = socialCreditCode;
		}

		public String getLegalName() {
			return this.legalName;
		}

		public void setLegalName(String legalName) {
			this.legalName = legalName;
		}

		public String getCourt() {
			return this.court;
		}

		public void setCourt(String court) {
			this.court = court;
		}

		public String getProvince() {
			return this.province;
		}

		public void setProvince(String province) {
			this.province = province;
		}

		public String getFromCaseNum() {
			return this.fromCaseNum;
		}

		public void setFromCaseNum(String fromCaseNum) {
			this.fromCaseNum = fromCaseNum;
		}

		public String getFilingDate() {
			return this.filingDate;
		}

		public void setFilingDate(String filingDate) {
			this.filingDate = filingDate;
		}

		public String getCaseNum() {
			return this.caseNum;
		}

		public void setCaseNum(String caseNum) {
			this.caseNum = caseNum;
		}

		public String getExecuteDepartment() {
			return this.executeDepartment;
		}

		public void setExecuteDepartment(String executeDepartment) {
			this.executeDepartment = executeDepartment;
		}

		public String getFinalDuty() {
			return this.finalDuty;
		}

		public void setFinalDuty(String finalDuty) {
			this.finalDuty = finalDuty;
		}

		public String getExecutionStatus() {
			return this.executionStatus;
		}

		public void setExecutionStatus(String executionStatus) {
			this.executionStatus = executionStatus;
		}

		public String getExecutionDesc() {
			return this.executionDesc;
		}

		public void setExecutionDesc(String executionDesc) {
			this.executionDesc = executionDesc;
		}

		public String getPublishDate() {
			return this.publishDate;
		}

		public void setPublishDate(String publishDate) {
			this.publishDate = publishDate;
		}

		public String getAmount() {
			return this.amount;
		}

		public void setAmount(String amount) {
			this.amount = amount;
		}
	}

	@Override
	public GetOcJusticeDishonestyResponse getInstance(UnmarshallerContext context) {
		return	GetOcJusticeDishonestyResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
