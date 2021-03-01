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
import com.aliyuncs.dms_enterprise.transform.v20181101.ListSensitiveColumnsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListSensitiveColumnsResponse extends AcsResponse {

	private Long totalCount;

	private String requestId;

	private String errorCode;

	private String errorMessage;

	private Boolean success;

	private List<SensitiveColumn> sensitiveColumnList;

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

	public List<SensitiveColumn> getSensitiveColumnList() {
		return this.sensitiveColumnList;
	}

	public void setSensitiveColumnList(List<SensitiveColumn> sensitiveColumnList) {
		this.sensitiveColumnList = sensitiveColumnList;
	}

	public static class SensitiveColumn {

		private String tableName;

		private String columnName;

		private Long columnCount;

		private String functionType;

		private String securityLevel;

		private String schemaName;

		public String getTableName() {
			return this.tableName;
		}

		public void setTableName(String tableName) {
			this.tableName = tableName;
		}

		public String getColumnName() {
			return this.columnName;
		}

		public void setColumnName(String columnName) {
			this.columnName = columnName;
		}

		public Long getColumnCount() {
			return this.columnCount;
		}

		public void setColumnCount(Long columnCount) {
			this.columnCount = columnCount;
		}

		public String getFunctionType() {
			return this.functionType;
		}

		public void setFunctionType(String functionType) {
			this.functionType = functionType;
		}

		public String getSecurityLevel() {
			return this.securityLevel;
		}

		public void setSecurityLevel(String securityLevel) {
			this.securityLevel = securityLevel;
		}

		public String getSchemaName() {
			return this.schemaName;
		}

		public void setSchemaName(String schemaName) {
			this.schemaName = schemaName;
		}
	}

	@Override
	public ListSensitiveColumnsResponse getInstance(UnmarshallerContext context) {
		return	ListSensitiveColumnsResponseUnmarshaller.unmarshall(this, context);
	}
}
