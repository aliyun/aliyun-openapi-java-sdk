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

package com.aliyuncs.drds.model.v20190123;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.drds.transform.v20190123.DescribeSqlFlashbakTaskResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSqlFlashbakTaskResponse extends AcsResponse {

	private Boolean success;

	private String requestId;

	private List<SqlFlashbackTask> sqlFlashbackTasks;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<SqlFlashbackTask> getSqlFlashbackTasks() {
		return this.sqlFlashbackTasks;
	}

	public void setSqlFlashbackTasks(List<SqlFlashbackTask> sqlFlashbackTasks) {
		this.sqlFlashbackTasks = sqlFlashbackTasks;
	}

	public static class SqlFlashbackTask {

		private String tableName;

		private Long searchEndTime;

		private Long expireTime;

		private String downloadUrl;

		private Integer recallProgress;

		private String sqlPk;

		private String instId;

		private Integer recallType;

		private Long searchStartTime;

		private Long gmtModified;

		private Long sqlCounter;

		private String dbName;

		private Integer recallRestoreType;

		private Long gmtCreate;

		private String traceId;

		private Long id;

		private Integer recallStatus;

		private String sqlType;

		public String getTableName() {
			return this.tableName;
		}

		public void setTableName(String tableName) {
			this.tableName = tableName;
		}

		public Long getSearchEndTime() {
			return this.searchEndTime;
		}

		public void setSearchEndTime(Long searchEndTime) {
			this.searchEndTime = searchEndTime;
		}

		public Long getExpireTime() {
			return this.expireTime;
		}

		public void setExpireTime(Long expireTime) {
			this.expireTime = expireTime;
		}

		public String getDownloadUrl() {
			return this.downloadUrl;
		}

		public void setDownloadUrl(String downloadUrl) {
			this.downloadUrl = downloadUrl;
		}

		public Integer getRecallProgress() {
			return this.recallProgress;
		}

		public void setRecallProgress(Integer recallProgress) {
			this.recallProgress = recallProgress;
		}

		public String getSqlPk() {
			return this.sqlPk;
		}

		public void setSqlPk(String sqlPk) {
			this.sqlPk = sqlPk;
		}

		public String getInstId() {
			return this.instId;
		}

		public void setInstId(String instId) {
			this.instId = instId;
		}

		public Integer getRecallType() {
			return this.recallType;
		}

		public void setRecallType(Integer recallType) {
			this.recallType = recallType;
		}

		public Long getSearchStartTime() {
			return this.searchStartTime;
		}

		public void setSearchStartTime(Long searchStartTime) {
			this.searchStartTime = searchStartTime;
		}

		public Long getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(Long gmtModified) {
			this.gmtModified = gmtModified;
		}

		public Long getSqlCounter() {
			return this.sqlCounter;
		}

		public void setSqlCounter(Long sqlCounter) {
			this.sqlCounter = sqlCounter;
		}

		public String getDbName() {
			return this.dbName;
		}

		public void setDbName(String dbName) {
			this.dbName = dbName;
		}

		public Integer getRecallRestoreType() {
			return this.recallRestoreType;
		}

		public void setRecallRestoreType(Integer recallRestoreType) {
			this.recallRestoreType = recallRestoreType;
		}

		public Long getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(Long gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getTraceId() {
			return this.traceId;
		}

		public void setTraceId(String traceId) {
			this.traceId = traceId;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Integer getRecallStatus() {
			return this.recallStatus;
		}

		public void setRecallStatus(Integer recallStatus) {
			this.recallStatus = recallStatus;
		}

		public String getSqlType() {
			return this.sqlType;
		}

		public void setSqlType(String sqlType) {
			this.sqlType = sqlType;
		}
	}

	@Override
	public DescribeSqlFlashbakTaskResponse getInstance(UnmarshallerContext context) {
		return	DescribeSqlFlashbakTaskResponseUnmarshaller.unmarshall(this, context);
	}
}
