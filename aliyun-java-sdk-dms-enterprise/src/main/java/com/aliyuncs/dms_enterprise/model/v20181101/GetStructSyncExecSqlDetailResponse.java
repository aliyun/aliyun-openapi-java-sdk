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
import com.aliyuncs.dms_enterprise.transform.v20181101.GetStructSyncExecSqlDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetStructSyncExecSqlDetailResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String errorMessage;

	private String errorCode;

	private StructSyncExecSqlDetail structSyncExecSqlDetail;

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

	public StructSyncExecSqlDetail getStructSyncExecSqlDetail() {
		return this.structSyncExecSqlDetail;
	}

	public void setStructSyncExecSqlDetail(StructSyncExecSqlDetail structSyncExecSqlDetail) {
		this.structSyncExecSqlDetail = structSyncExecSqlDetail;
	}

	public static class StructSyncExecSqlDetail {

		private Long totalSqlCount;

		private String execSql;

		public Long getTotalSqlCount() {
			return this.totalSqlCount;
		}

		public void setTotalSqlCount(Long totalSqlCount) {
			this.totalSqlCount = totalSqlCount;
		}

		public String getExecSql() {
			return this.execSql;
		}

		public void setExecSql(String execSql) {
			this.execSql = execSql;
		}
	}

	@Override
	public GetStructSyncExecSqlDetailResponse getInstance(UnmarshallerContext context) {
		return	GetStructSyncExecSqlDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
