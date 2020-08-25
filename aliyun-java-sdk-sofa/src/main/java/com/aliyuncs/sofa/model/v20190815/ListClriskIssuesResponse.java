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
import com.aliyuncs.sofa.transform.v20190815.ListClriskIssuesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListClriskIssuesResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private Long pageCount;

	private Long pageNumber;

	private Long pageSize;

	private Long totalCount;

	private List<IssueListItem> issueList;

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

	public Long getPageCount() {
		return this.pageCount;
	}

	public void setPageCount(Long pageCount) {
		this.pageCount = pageCount;
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public List<IssueListItem> getIssueList() {
		return this.issueList;
	}

	public void setIssueList(List<IssueListItem> issueList) {
		this.issueList = issueList;
	}

	public static class IssueListItem {

		private String createTime;

		private Long diffSize;

		private String issueCode;

		private Long issueId;

		private String modelCode;

		private String processDuration;

		private String ruleCode;

		private String ruleName;

		private String sceneId;

		private String sceneName;

		private String status;

		private String triggerMode;

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public Long getDiffSize() {
			return this.diffSize;
		}

		public void setDiffSize(Long diffSize) {
			this.diffSize = diffSize;
		}

		public String getIssueCode() {
			return this.issueCode;
		}

		public void setIssueCode(String issueCode) {
			this.issueCode = issueCode;
		}

		public Long getIssueId() {
			return this.issueId;
		}

		public void setIssueId(Long issueId) {
			this.issueId = issueId;
		}

		public String getModelCode() {
			return this.modelCode;
		}

		public void setModelCode(String modelCode) {
			this.modelCode = modelCode;
		}

		public String getProcessDuration() {
			return this.processDuration;
		}

		public void setProcessDuration(String processDuration) {
			this.processDuration = processDuration;
		}

		public String getRuleCode() {
			return this.ruleCode;
		}

		public void setRuleCode(String ruleCode) {
			this.ruleCode = ruleCode;
		}

		public String getRuleName() {
			return this.ruleName;
		}

		public void setRuleName(String ruleName) {
			this.ruleName = ruleName;
		}

		public String getSceneId() {
			return this.sceneId;
		}

		public void setSceneId(String sceneId) {
			this.sceneId = sceneId;
		}

		public String getSceneName() {
			return this.sceneName;
		}

		public void setSceneName(String sceneName) {
			this.sceneName = sceneName;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getTriggerMode() {
			return this.triggerMode;
		}

		public void setTriggerMode(String triggerMode) {
			this.triggerMode = triggerMode;
		}
	}

	@Override
	public ListClriskIssuesResponse getInstance(UnmarshallerContext context) {
		return	ListClriskIssuesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
