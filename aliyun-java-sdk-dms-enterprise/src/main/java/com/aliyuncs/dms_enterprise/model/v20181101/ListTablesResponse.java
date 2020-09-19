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
import com.aliyuncs.dms_enterprise.transform.v20181101.ListTablesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListTablesResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String errorMessage;

	private String errorCode;

	private Long totalCount;

	private List<Table> tableList;

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

	public List<Table> getTableList() {
		return this.tableList;
	}

	public void setTableList(List<Table> tableList) {
		this.tableList = tableList;
	}

	public static class Table {

		private String tableId;

		private String databaseId;

		private String tableName;

		private String tableSchemaName;

		private String engine;

		private String encoding;

		private String tableType;

		private Long numRows;

		private Long storeCapacity;

		private String tableGuid;

		private String description;

		private List<String> ownerIdList;

		private List<String> ownerNameList;

		public String getTableId() {
			return this.tableId;
		}

		public void setTableId(String tableId) {
			this.tableId = tableId;
		}

		public String getDatabaseId() {
			return this.databaseId;
		}

		public void setDatabaseId(String databaseId) {
			this.databaseId = databaseId;
		}

		public String getTableName() {
			return this.tableName;
		}

		public void setTableName(String tableName) {
			this.tableName = tableName;
		}

		public String getTableSchemaName() {
			return this.tableSchemaName;
		}

		public void setTableSchemaName(String tableSchemaName) {
			this.tableSchemaName = tableSchemaName;
		}

		public String getEngine() {
			return this.engine;
		}

		public void setEngine(String engine) {
			this.engine = engine;
		}

		public String getEncoding() {
			return this.encoding;
		}

		public void setEncoding(String encoding) {
			this.encoding = encoding;
		}

		public String getTableType() {
			return this.tableType;
		}

		public void setTableType(String tableType) {
			this.tableType = tableType;
		}

		public Long getNumRows() {
			return this.numRows;
		}

		public void setNumRows(Long numRows) {
			this.numRows = numRows;
		}

		public Long getStoreCapacity() {
			return this.storeCapacity;
		}

		public void setStoreCapacity(Long storeCapacity) {
			this.storeCapacity = storeCapacity;
		}

		public String getTableGuid() {
			return this.tableGuid;
		}

		public void setTableGuid(String tableGuid) {
			this.tableGuid = tableGuid;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public List<String> getOwnerIdList() {
			return this.ownerIdList;
		}

		public void setOwnerIdList(List<String> ownerIdList) {
			this.ownerIdList = ownerIdList;
		}

		public List<String> getOwnerNameList() {
			return this.ownerNameList;
		}

		public void setOwnerNameList(List<String> ownerNameList) {
			this.ownerNameList = ownerNameList;
		}
	}

	@Override
	public ListTablesResponse getInstance(UnmarshallerContext context) {
		return	ListTablesResponseUnmarshaller.unmarshall(this, context);
	}
}
