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

package com.aliyuncs.petadata.model.v20160101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.petadata.transform.v20160101.DescribeTableInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeTableInfoResponse extends AcsResponse {

	private String requestId;

	private String instanceId;

	private String dBName;

	private String tableName;

	private String partitionKey;

	private String primaryKey;

	private List<Column> columns;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public String getDBName() {
		return this.dBName;
	}

	public void setDBName(String dBName) {
		this.dBName = dBName;
	}

	public String getTableName() {
		return this.tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getPartitionKey() {
		return this.partitionKey;
	}

	public void setPartitionKey(String partitionKey) {
		this.partitionKey = partitionKey;
	}

	public String getPrimaryKey() {
		return this.primaryKey;
	}

	public void setPrimaryKey(String primaryKey) {
		this.primaryKey = primaryKey;
	}

	public List<Column> getColumns() {
		return this.columns;
	}

	public void setColumns(List<Column> columns) {
		this.columns = columns;
	}

	public static class Column {

		private String columnName;

		private String columnDataType;

		private Integer columnDataLength;

		private Boolean isNull;

		public String getColumnName() {
			return this.columnName;
		}

		public void setColumnName(String columnName) {
			this.columnName = columnName;
		}

		public String getColumnDataType() {
			return this.columnDataType;
		}

		public void setColumnDataType(String columnDataType) {
			this.columnDataType = columnDataType;
		}

		public Integer getColumnDataLength() {
			return this.columnDataLength;
		}

		public void setColumnDataLength(Integer columnDataLength) {
			this.columnDataLength = columnDataLength;
		}

		public Boolean getIsNull() {
			return this.isNull;
		}

		public void setIsNull(Boolean isNull) {
			this.isNull = isNull;
		}
	}

	@Override
	public DescribeTableInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeTableInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
