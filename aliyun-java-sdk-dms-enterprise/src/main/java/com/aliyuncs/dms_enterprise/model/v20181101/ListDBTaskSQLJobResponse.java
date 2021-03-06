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

	private Long totalCount;

	private String requestId;

	private String errorCode;

	private String errorMessage;

	private Boolean success;

	private List<DBTaskSQLJob> dBTaskSQLJobList;

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<DBTaskSQLJob> getDBTaskSQLJobList() {
		return this.dBTaskSQLJobList;
	}

	public void setDBTaskSQLJobList(List<DBTaskSQLJob> dBTaskSQLJobList) {
		this.dBTaskSQLJobList = dBTaskSQLJobList;
	}

	public static class DBTaskSQLJob {

		private String status;

		private String comment;

		private String lastExecTime;

		private String dbSearchName;

		private String jobType;

		private String createTime;

		private Long dbTaskGroupId;

		private Long dbId;

		private Boolean logic;

		private Long jobId;

		private Boolean transactional;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getComment() {
			return this.comment;
		}

		public void setComment(String comment) {
			this.comment = comment;
		}

		public String getLastExecTime() {
			return this.lastExecTime;
		}

		public void setLastExecTime(String lastExecTime) {
			this.lastExecTime = lastExecTime;
		}

		public String getDbSearchName() {
			return this.dbSearchName;
		}

		public void setDbSearchName(String dbSearchName) {
			this.dbSearchName = dbSearchName;
		}

		public String getJobType() {
			return this.jobType;
		}

		public void setJobType(String jobType) {
			this.jobType = jobType;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public Long getDbTaskGroupId() {
			return this.dbTaskGroupId;
		}

		public void setDbTaskGroupId(Long dbTaskGroupId) {
			this.dbTaskGroupId = dbTaskGroupId;
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

		public Long getJobId() {
			return this.jobId;
		}

		public void setJobId(Long jobId) {
			this.jobId = jobId;
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
