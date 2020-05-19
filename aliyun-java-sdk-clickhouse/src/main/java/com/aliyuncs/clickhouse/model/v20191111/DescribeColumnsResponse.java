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

package com.aliyuncs.clickhouse.model.v20191111;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.clickhouse.transform.v20191111.DescribeColumnsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeColumnsResponse extends AcsResponse {

	private String requestId;

	private List<Column> items;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Column> getItems() {
		return this.items;
	}

	public void setItems(List<Column> items) {
		this.items = items;
	}

	public static class Column {

		private String dBClusterId;

		private String schemaName;

		private String tableName;

		private String columnName;

		private String type;

		private Boolean primaryKey;

		private Boolean autoIncrementColumn;

		public String getDBClusterId() {
			return this.dBClusterId;
		}

		public void setDBClusterId(String dBClusterId) {
			this.dBClusterId = dBClusterId;
		}

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

		public String getColumnName() {
			return this.columnName;
		}

		public void setColumnName(String columnName) {
			this.columnName = columnName;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public Boolean getPrimaryKey() {
			return this.primaryKey;
		}

		public void setPrimaryKey(Boolean primaryKey) {
			this.primaryKey = primaryKey;
		}

		public Boolean getAutoIncrementColumn() {
			return this.autoIncrementColumn;
		}

		public void setAutoIncrementColumn(Boolean autoIncrementColumn) {
			this.autoIncrementColumn = autoIncrementColumn;
		}
	}

	@Override
	public DescribeColumnsResponse getInstance(UnmarshallerContext context) {
		return	DescribeColumnsResponseUnmarshaller.unmarshall(this, context);
	}
}
