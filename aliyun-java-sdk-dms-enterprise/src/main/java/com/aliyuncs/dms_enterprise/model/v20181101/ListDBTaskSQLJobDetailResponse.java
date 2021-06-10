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
import com.aliyuncs.dms_enterprise.transform.v20181101.ListDBTaskSQLJobDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDBTaskSQLJobDetailResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String errorMessage;

	private String errorCode;

	private Long totalCount;

	private List<DBTaskSQLJobDetail> dBTaskSQLJobDetailList;

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

	public List<DBTaskSQLJobDetail> getDBTaskSQLJobDetailList() {
		return this.dBTaskSQLJobDetailList;
	}

	public void setDBTaskSQLJobDetailList(List<DBTaskSQLJobDetail> dBTaskSQLJobDetailList) {
		this.dBTaskSQLJobDetailList = dBTaskSQLJobDetailList;
	}

	public static class DBTaskSQLJobDetail {

		private Long jobDetailId;

		private String currentSql;

		private Long executeCount;

		private Long jobId;

		private Long dbId;

		private Boolean logic;

		private Boolean skip;

		private String sqlType;

		private String status;

		public Long getJobDetailId() {
			return this.jobDetailId;
		}

		public void setJobDetailId(Long jobDetailId) {
			this.jobDetailId = jobDetailId;
		}

		public String getCurrentSql() {
			return this.currentSql;
		}

		public void setCurrentSql(String currentSql) {
			this.currentSql = currentSql;
		}

		public Long getExecuteCount() {
			return this.executeCount;
		}

		public void setExecuteCount(Long executeCount) {
			this.executeCount = executeCount;
		}

		public Long getJobId() {
			return this.jobId;
		}

		public void setJobId(Long jobId) {
			this.jobId = jobId;
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

		public Boolean getSkip() {
			return this.skip;
		}

		public void setSkip(Boolean skip) {
			this.skip = skip;
		}

		public String getSqlType() {
			return this.sqlType;
		}

		public void setSqlType(String sqlType) {
			this.sqlType = sqlType;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
	}

	@Override
	public ListDBTaskSQLJobDetailResponse getInstance(UnmarshallerContext context) {
		return	ListDBTaskSQLJobDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
