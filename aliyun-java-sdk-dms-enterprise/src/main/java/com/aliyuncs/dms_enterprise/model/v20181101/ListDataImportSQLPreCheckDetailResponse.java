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
import com.aliyuncs.dms_enterprise.transform.v20181101.ListDataImportSQLPreCheckDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDataImportSQLPreCheckDetailResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String errorMessage;

	private String errorCode;

	private Long totalCount;

	private List<PreCheckSQLDetail> preCheckSQLDetailList;

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

	public List<PreCheckSQLDetail> getPreCheckSQLDetailList() {
		return this.preCheckSQLDetailList;
	}

	public void setPreCheckSQLDetailList(List<PreCheckSQLDetail> preCheckSQLDetailList) {
		this.preCheckSQLDetailList = preCheckSQLDetailList;
	}

	public static class PreCheckSQLDetail {

		private Long sqlId;

		private String sqlType;

		private String statusCode;

		private Boolean skip;

		public Long getSqlId() {
			return this.sqlId;
		}

		public void setSqlId(Long sqlId) {
			this.sqlId = sqlId;
		}

		public String getSqlType() {
			return this.sqlType;
		}

		public void setSqlType(String sqlType) {
			this.sqlType = sqlType;
		}

		public String getStatusCode() {
			return this.statusCode;
		}

		public void setStatusCode(String statusCode) {
			this.statusCode = statusCode;
		}

		public Boolean getSkip() {
			return this.skip;
		}

		public void setSkip(Boolean skip) {
			this.skip = skip;
		}
	}

	@Override
	public ListDataImportSQLPreCheckDetailResponse getInstance(UnmarshallerContext context) {
		return	ListDataImportSQLPreCheckDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
