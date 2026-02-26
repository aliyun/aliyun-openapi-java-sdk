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
import com.aliyuncs.dt_oc_info.transform.v20220829.GetOcJusticeLimitHighConsumeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetOcJusticeLimitHighConsumeResponse extends AcsResponse {

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

		private String name;

		private String companyName;

		private String filingDate;

		private String caseNum;

		private String court;

		private String executionApplicant;

		private String causeAction;

		private String publishDate;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCompanyName() {
			return this.companyName;
		}

		public void setCompanyName(String companyName) {
			this.companyName = companyName;
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

		public String getCourt() {
			return this.court;
		}

		public void setCourt(String court) {
			this.court = court;
		}

		public String getExecutionApplicant() {
			return this.executionApplicant;
		}

		public void setExecutionApplicant(String executionApplicant) {
			this.executionApplicant = executionApplicant;
		}

		public String getCauseAction() {
			return this.causeAction;
		}

		public void setCauseAction(String causeAction) {
			this.causeAction = causeAction;
		}

		public String getPublishDate() {
			return this.publishDate;
		}

		public void setPublishDate(String publishDate) {
			this.publishDate = publishDate;
		}
	}

	@Override
	public GetOcJusticeLimitHighConsumeResponse getInstance(UnmarshallerContext context) {
		return	GetOcJusticeLimitHighConsumeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
