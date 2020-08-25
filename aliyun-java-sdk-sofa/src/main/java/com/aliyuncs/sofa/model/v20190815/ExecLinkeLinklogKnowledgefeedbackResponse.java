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

package com.aliyuncs.sofa.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.ExecLinkeLinklogKnowledgefeedbackResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ExecLinkeLinklogKnowledgefeedbackResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private String errorMsg;

	private String responseContentRange;

	private String responseContentType;

	private Long responseStatusCode;

	private Boolean success;

	private Result result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public String getErrorMsg() {
		return this.errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getResponseContentRange() {
		return this.responseContentRange;
	}

	public void setResponseContentRange(String responseContentRange) {
		this.responseContentRange = responseContentRange;
	}

	public String getResponseContentType() {
		return this.responseContentType;
	}

	public void setResponseContentType(String responseContentType) {
		this.responseContentType = responseContentType;
	}

	public Long getResponseStatusCode() {
		return this.responseStatusCode;
	}

	public void setResponseStatusCode(Long responseStatusCode) {
		this.responseStatusCode = responseStatusCode;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private Long begin;

		private Long beginMills;

		private Long currentPage;

		private Long end;

		private Long endMills;

		private String feedback;

		private Long gmtCreate;

		private Long gmtModified;

		private Long id;

		private Long isOptions;

		private Long knowledgeId;

		private Long logId;

		private Long pageSize;

		private Long result;

		private String sorter;

		private Long storeId;

		private List<Long> tagList;

		public Long getBegin() {
			return this.begin;
		}

		public void setBegin(Long begin) {
			this.begin = begin;
		}

		public Long getBeginMills() {
			return this.beginMills;
		}

		public void setBeginMills(Long beginMills) {
			this.beginMills = beginMills;
		}

		public Long getCurrentPage() {
			return this.currentPage;
		}

		public void setCurrentPage(Long currentPage) {
			this.currentPage = currentPage;
		}

		public Long getEnd() {
			return this.end;
		}

		public void setEnd(Long end) {
			this.end = end;
		}

		public Long getEndMills() {
			return this.endMills;
		}

		public void setEndMills(Long endMills) {
			this.endMills = endMills;
		}

		public String getFeedback() {
			return this.feedback;
		}

		public void setFeedback(String feedback) {
			this.feedback = feedback;
		}

		public Long getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(Long gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public Long getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(Long gmtModified) {
			this.gmtModified = gmtModified;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Long getIsOptions() {
			return this.isOptions;
		}

		public void setIsOptions(Long isOptions) {
			this.isOptions = isOptions;
		}

		public Long getKnowledgeId() {
			return this.knowledgeId;
		}

		public void setKnowledgeId(Long knowledgeId) {
			this.knowledgeId = knowledgeId;
		}

		public Long getLogId() {
			return this.logId;
		}

		public void setLogId(Long logId) {
			this.logId = logId;
		}

		public Long getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Long pageSize) {
			this.pageSize = pageSize;
		}

		public Long getResult() {
			return this.result;
		}

		public void setResult(Long result) {
			this.result = result;
		}

		public String getSorter() {
			return this.sorter;
		}

		public void setSorter(String sorter) {
			this.sorter = sorter;
		}

		public Long getStoreId() {
			return this.storeId;
		}

		public void setStoreId(Long storeId) {
			this.storeId = storeId;
		}

		public List<Long> getTagList() {
			return this.tagList;
		}

		public void setTagList(List<Long> tagList) {
			this.tagList = tagList;
		}
	}

	@Override
	public ExecLinkeLinklogKnowledgefeedbackResponse getInstance(UnmarshallerContext context) {
		return	ExecLinkeLinklogKnowledgefeedbackResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
