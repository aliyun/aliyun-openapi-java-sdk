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
import com.aliyuncs.dms_enterprise.transform.v20181101.ListDataCorrectPreCheckSQLResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDataCorrectPreCheckSQLResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String errorMessage;

	private String errorCode;

	private List<PreCheckSQL> preCheckSQLList;

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

	public List<PreCheckSQL> getPreCheckSQLList() {
		return this.preCheckSQLList;
	}

	public void setPreCheckSQLList(List<PreCheckSQL> preCheckSQLList) {
		this.preCheckSQLList = preCheckSQLList;
	}

	public static class PreCheckSQL {

		private String checkSQL;

		private Long affectRows;

		private Long dbId;

		private String sQLReviewQueryKey;

		private String sqlReviewStatus;

		private String sqlType;

		public String getCheckSQL() {
			return this.checkSQL;
		}

		public void setCheckSQL(String checkSQL) {
			this.checkSQL = checkSQL;
		}

		public Long getAffectRows() {
			return this.affectRows;
		}

		public void setAffectRows(Long affectRows) {
			this.affectRows = affectRows;
		}

		public Long getDbId() {
			return this.dbId;
		}

		public void setDbId(Long dbId) {
			this.dbId = dbId;
		}

		public String getSQLReviewQueryKey() {
			return this.sQLReviewQueryKey;
		}

		public void setSQLReviewQueryKey(String sQLReviewQueryKey) {
			this.sQLReviewQueryKey = sQLReviewQueryKey;
		}

		public String getSqlReviewStatus() {
			return this.sqlReviewStatus;
		}

		public void setSqlReviewStatus(String sqlReviewStatus) {
			this.sqlReviewStatus = sqlReviewStatus;
		}

		public String getSqlType() {
			return this.sqlType;
		}

		public void setSqlType(String sqlType) {
			this.sqlType = sqlType;
		}
	}

	@Override
	public ListDataCorrectPreCheckSQLResponse getInstance(UnmarshallerContext context) {
		return	ListDataCorrectPreCheckSQLResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
