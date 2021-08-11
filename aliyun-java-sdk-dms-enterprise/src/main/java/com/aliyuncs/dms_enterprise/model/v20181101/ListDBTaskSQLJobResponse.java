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

package com.aliyuncs.dms_enterprise.model.v20181101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dms_enterprise.transform.v20181101.ListDBTaskSQLJobResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDBTaskSQLJobResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String errorMessage;

	private String errorCode;

	private Long totalCount;

	private List<DBTaskSQLJob> dBTaskSQLJobList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public List<DBTaskSQLJob> getDBTaskSQLJobList() {
		return this.dBTaskSQLJobList;
	}

	public void setDBTaskSQLJobList(List<DBTaskSQLJob> dBTaskSQLJobList) {
		this.dBTaskSQLJobList = dBTaskSQLJobList;
	}

	public static class DBTaskSQLJob {

		private Long jobId;

		private String jobType;

		private String comment;

		private String dbSearchName;

		private Long dbId;

		private Boolean logic;

		private String createTime;

		private String lastExecTime;

		private Long dbTaskGroupId;

		private String status;

		private Boolean transactional;

		public Long getJobId() {
			return this.jobId;
		}

		public void setJobId(Long jobId) {
			this.jobId = jobId;
		}

		public String getJobType() {
			return this.jobType;
		}

		public void setJobType(String jobType) {
			this.jobType = jobType;
		}

		public String getComment() {
			return this.comment;
		}

		public void setComment(String comment) {
			this.comment = comment;
		}

		public String getDbSearchName() {
			return this.dbSearchName;
		}

		public void setDbSearchName(String dbSearchName) {
			this.dbSearchName = dbSearchName;
		}

		public Long getDbId() {
			return this.dbId;
		}

		public void setDbId(Long dbId) {
			this.dbId = dbId;
		}

		public Boolean getLogic() {
			return this.logic;
		}

		public void setLogic(Boolean logic) {
			this.logic = logic;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getLastExecTime() {
			return this.lastExecTime;
		}

		public void setLastExecTime(String lastExecTime) {
			this.lastExecTime = lastExecTime;
		}

		public Long getDbTaskGroupId() {
			return this.dbTaskGroupId;
		}

		public void setDbTaskGroupId(Long dbTaskGroupId) {
			this.dbTaskGroupId = dbTaskGroupId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Boolean getTransactional() {
			return this.transactional;
		}

		public void setTransactional(Boolean transactional) {
			this.transactional = transactional;
		}
	}

	@Override
	public ListDBTaskSQLJobResponse getInstance(UnmarshallerContext context) {
		return	ListDBTaskSQLJobResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
