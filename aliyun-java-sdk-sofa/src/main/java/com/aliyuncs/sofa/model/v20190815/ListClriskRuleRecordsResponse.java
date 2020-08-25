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
import com.aliyuncs.sofa.transform.v20190815.ListClriskRuleRecordsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListClriskRuleRecordsResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private String modelCode;

	private String modelName;

	private Long pageCount;

	private Long pageNumber;

	private Long pageSize;

	private String ruleCode;

	private Long totalCount;

	private List<RecordListItem> recordList;

	private List<TaskRecordListItem> taskRecordList;

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

	public String getModelCode() {
		return this.modelCode;
	}

	public void setModelCode(String modelCode) {
		this.modelCode = modelCode;
	}

	public String getModelName() {
		return this.modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
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

	public String getRuleCode() {
		return this.ruleCode;
	}

	public void setRuleCode(String ruleCode) {
		this.ruleCode = ruleCode;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public List<RecordListItem> getRecordList() {
		return this.recordList;
	}

	public void setRecordList(List<RecordListItem> recordList) {
		this.recordList = recordList;
	}

	public List<TaskRecordListItem> getTaskRecordList() {
		return this.taskRecordList;
	}

	public void setTaskRecordList(List<TaskRecordListItem> taskRecordList) {
		this.taskRecordList = taskRecordList;
	}

	public static class RecordListItem {

		private String gmtModified;

		private String pkgCode;

		private String ruleCode;

		private String ruleName;

		private Long totalError;

		private Long totalSuccess;

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getPkgCode() {
			return this.pkgCode;
		}

		public void setPkgCode(String pkgCode) {
			this.pkgCode = pkgCode;
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

		public Long getTotalError() {
			return this.totalError;
		}

		public void setTotalError(Long totalError) {
			this.totalError = totalError;
		}

		public Long getTotalSuccess() {
			return this.totalSuccess;
		}

		public void setTotalSuccess(Long totalSuccess) {
			this.totalSuccess = totalSuccess;
		}
	}

	public static class TaskRecordListItem {

		private String cycle;

		private String gmtCreate;

		private String gmtModified;

		private String pkgCode;

		private String resultCode;

		private String resultDetail;

		private Long resultSize;

		private String sqlText;

		private String status;

		private Long taskId;

		public String getCycle() {
			return this.cycle;
		}

		public void setCycle(String cycle) {
			this.cycle = cycle;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getPkgCode() {
			return this.pkgCode;
		}

		public void setPkgCode(String pkgCode) {
			this.pkgCode = pkgCode;
		}

		public String getResultCode() {
			return this.resultCode;
		}

		public void setResultCode(String resultCode) {
			this.resultCode = resultCode;
		}

		public String getResultDetail() {
			return this.resultDetail;
		}

		public void setResultDetail(String resultDetail) {
			this.resultDetail = resultDetail;
		}

		public Long getResultSize() {
			return this.resultSize;
		}

		public void setResultSize(Long resultSize) {
			this.resultSize = resultSize;
		}

		public String getSqlText() {
			return this.sqlText;
		}

		public void setSqlText(String sqlText) {
			this.sqlText = sqlText;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Long getTaskId() {
			return this.taskId;
		}

		public void setTaskId(Long taskId) {
			this.taskId = taskId;
		}
	}

	@Override
	public ListClriskRuleRecordsResponse getInstance(UnmarshallerContext context) {
		return	ListClriskRuleRecordsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
