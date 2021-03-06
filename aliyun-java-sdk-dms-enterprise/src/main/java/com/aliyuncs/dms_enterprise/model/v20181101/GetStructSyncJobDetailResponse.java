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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.dms_enterprise.transform.v20181101.GetStructSyncJobDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetStructSyncJobDetailResponse extends AcsResponse {

	private String requestId;

	private String errorCode;

	private String errorMessage;

	private Boolean success;

	private StructSyncJobDetail structSyncJobDetail;

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

	public StructSyncJobDetail getStructSyncJobDetail() {
		return this.structSyncJobDetail;
	}

	public void setStructSyncJobDetail(StructSyncJobDetail structSyncJobDetail) {
		this.structSyncJobDetail = structSyncJobDetail;
	}

	public static class StructSyncJobDetail {

		private Long sqlCount;

		private String jobStatus;

		private String message;

		private Long tableAnalyzed;

		private Long tableCount;

		private Long executeCount;

		private String securityRule;

		public Long getSqlCount() {
			return this.sqlCount;
		}

		public void setSqlCount(Long sqlCount) {
			this.sqlCount = sqlCount;
		}

		public String getJobStatus() {
			return this.jobStatus;
		}

		public void setJobStatus(String jobStatus) {
			this.jobStatus = jobStatus;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public Long getTableAnalyzed() {
			return this.tableAnalyzed;
		}

		public void setTableAnalyzed(Long tableAnalyzed) {
			this.tableAnalyzed = tableAnalyzed;
		}

		public Long getTableCount() {
			return this.tableCount;
		}

		public void setTableCount(Long tableCount) {
			this.tableCount = tableCount;
		}

		public Long getExecuteCount() {
			return this.executeCount;
		}

		public void setExecuteCount(Long executeCount) {
			this.executeCount = executeCount;
		}

		public String getSecurityRule() {
			return this.securityRule;
		}

		public void setSecurityRule(String securityRule) {
			this.securityRule = securityRule;
		}
	}

	@Override
	public GetStructSyncJobDetailResponse getInstance(UnmarshallerContext context) {
		return	GetStructSyncJobDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
