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
import com.aliyuncs.dms_enterprise.transform.v20181101.GetDataTrackJobTableMetaResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDataTrackJobTableMetaResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String errorMessage;

	private String errorCode;

	private List<TableMeta> tableMetaList;

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

	public List<TableMeta> getTableMetaList() {
		return this.tableMetaList;
	}

	public void setTableMetaList(List<TableMeta> tableMetaList) {
		this.tableMetaList = tableMetaList;
	}

	public static class TableMeta {

		private String schemaName;

		private String tableName;

		private List<Column> columns;

		public String getSchemaName() {
			return this.schemaName;
		}

		public void setSchemaName(String schemaName) {
			this.schemaName = schemaName;
		}

		public String getTableName() {
			return this.tableName;
		}

		public void setTableName(String tableName) {
			this.tableName = tableName;
		}

		public List<Column> getColumns() {
			return this.columns;
		}

		public void setColumns(List<Column> columns) {
			this.columns = columns;
		}

		public static class Column {

			private String columnName;

			private Integer columnPosition;

			private String columnType;

			private Boolean fictive;

			private String charset;

			public String getColumnName() {
				return this.columnName;
			}

			public void setColumnName(String columnName) {
				this.columnName = columnName;
			}

			public Integer getColumnPosition() {
				return this.columnPosition;
			}

			public void setColumnPosition(Integer columnPosition) {
				this.columnPosition = columnPosition;
			}

			public String getColumnType() {
				return this.columnType;
			}

			public void setColumnType(String columnType) {
				this.columnType = columnType;
			}

			public Boolean getFictive() {
				return this.fictive;
			}

			public void setFictive(Boolean fictive) {
				this.fictive = fictive;
			}

			public String getCharset() {
				return this.charset;
			}

			public void setCharset(String charset) {
				this.charset = charset;
			}
		}
	}

	@Override
	public GetDataTrackJobTableMetaResponse getInstance(UnmarshallerContext context) {
		return	GetDataTrackJobTableMetaResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
