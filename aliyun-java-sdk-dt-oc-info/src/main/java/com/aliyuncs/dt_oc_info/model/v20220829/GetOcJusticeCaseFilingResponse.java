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
import com.aliyuncs.dt_oc_info.transform.v20220829.GetOcJusticeCaseFilingResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetOcJusticeCaseFilingResponse extends AcsResponse {

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

		private String caseNum;

		private String judge;

		private String assistant;

		private String filingDate;

		private String hearingDate;

		private String endDate;

		private String caseStatus;

		private String role;

		private String party;

		private String causeAction;

		public String getCaseNum() {
			return this.caseNum;
		}

		public void setCaseNum(String caseNum) {
			this.caseNum = caseNum;
		}

		public String getJudge() {
			return this.judge;
		}

		public void setJudge(String judge) {
			this.judge = judge;
		}

		public String getAssistant() {
			return this.assistant;
		}

		public void setAssistant(String assistant) {
			this.assistant = assistant;
		}

		public String getFilingDate() {
			return this.filingDate;
		}

		public void setFilingDate(String filingDate) {
			this.filingDate = filingDate;
		}

		public String getHearingDate() {
			return this.hearingDate;
		}

		public void setHearingDate(String hearingDate) {
			this.hearingDate = hearingDate;
		}

		public String getEndDate() {
			return this.endDate;
		}

		public void setEndDate(String endDate) {
			this.endDate = endDate;
		}

		public String getCaseStatus() {
			return this.caseStatus;
		}

		public void setCaseStatus(String caseStatus) {
			this.caseStatus = caseStatus;
		}

		public String getRole() {
			return this.role;
		}

		public void setRole(String role) {
			this.role = role;
		}

		public String getParty() {
			return this.party;
		}

		public void setParty(String party) {
			this.party = party;
		}

		public String getCauseAction() {
			return this.causeAction;
		}

		public void setCauseAction(String causeAction) {
			this.causeAction = causeAction;
		}
	}

	@Override
	public GetOcJusticeCaseFilingResponse getInstance(UnmarshallerContext context) {
		return	GetOcJusticeCaseFilingResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
