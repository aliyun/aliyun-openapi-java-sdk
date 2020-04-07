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

package com.aliyuncs.hbr.model.v20170908;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.hbr.transform.v20170908.DescribeSqlServerRestoresResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSqlServerRestoresResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer totalCount;

	private Integer pageSize;

	private Integer pageNumber;

	private List<SqlServerRestore> sqlServerRestores;

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

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<SqlServerRestore> getSqlServerRestores() {
		return this.sqlServerRestores;
	}

	public void setSqlServerRestores(List<SqlServerRestore> sqlServerRestores) {
		this.sqlServerRestores = sqlServerRestores;
	}

	public static class SqlServerRestore {

		private String restoreId;

		private String clusterId;

		private String vaultId;

		private String sourceDatabaseId;

		private String targetDatabaseName;

		private String fileDestination;

		private Long pointInTime;

		private Long createdTime;

		private Long completeTime;

		private Long bytesTotal;

		private Integer percentage;

		private String errorMessage;

		private String status;

		private String sourceDatabaseName;

		public String getRestoreId() {
			return this.restoreId;
		}

		public void setRestoreId(String restoreId) {
			this.restoreId = restoreId;
		}

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}

		public String getVaultId() {
			return this.vaultId;
		}

		public void setVaultId(String vaultId) {
			this.vaultId = vaultId;
		}

		public String getSourceDatabaseId() {
			return this.sourceDatabaseId;
		}

		public void setSourceDatabaseId(String sourceDatabaseId) {
			this.sourceDatabaseId = sourceDatabaseId;
		}

		public String getTargetDatabaseName() {
			return this.targetDatabaseName;
		}

		public void setTargetDatabaseName(String targetDatabaseName) {
			this.targetDatabaseName = targetDatabaseName;
		}

		public String getFileDestination() {
			return this.fileDestination;
		}

		public void setFileDestination(String fileDestination) {
			this.fileDestination = fileDestination;
		}

		public Long getPointInTime() {
			return this.pointInTime;
		}

		public void setPointInTime(Long pointInTime) {
			this.pointInTime = pointInTime;
		}

		public Long getCreatedTime() {
			return this.createdTime;
		}

		public void setCreatedTime(Long createdTime) {
			this.createdTime = createdTime;
		}

		public Long getCompleteTime() {
			return this.completeTime;
		}

		public void setCompleteTime(Long completeTime) {
			this.completeTime = completeTime;
		}

		public Long getBytesTotal() {
			return this.bytesTotal;
		}

		public void setBytesTotal(Long bytesTotal) {
			this.bytesTotal = bytesTotal;
		}

		public Integer getPercentage() {
			return this.percentage;
		}

		public void setPercentage(Integer percentage) {
			this.percentage = percentage;
		}

		public String getErrorMessage() {
			return this.errorMessage;
		}

		public void setErrorMessage(String errorMessage) {
			this.errorMessage = errorMessage;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getSourceDatabaseName() {
			return this.sourceDatabaseName;
		}

		public void setSourceDatabaseName(String sourceDatabaseName) {
			this.sourceDatabaseName = sourceDatabaseName;
		}
	}

	@Override
	public DescribeSqlServerRestoresResponse getInstance(UnmarshallerContext context) {
		return	DescribeSqlServerRestoresResponseUnmarshaller.unmarshall(this, context);
	}
}
