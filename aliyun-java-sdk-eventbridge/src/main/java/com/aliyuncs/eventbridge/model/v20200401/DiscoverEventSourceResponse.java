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

package com.aliyuncs.eventbridge.model.v20200401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.eventbridge.transform.v20200401.DiscoverEventSourceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DiscoverEventSourceResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private Boolean success;

	private Data data;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private SourceMySQLDiscovery sourceMySQLDiscovery;

		public SourceMySQLDiscovery getSourceMySQLDiscovery() {
			return this.sourceMySQLDiscovery;
		}

		public void setSourceMySQLDiscovery(SourceMySQLDiscovery sourceMySQLDiscovery) {
			this.sourceMySQLDiscovery = sourceMySQLDiscovery;
		}

		public static class SourceMySQLDiscovery {

			private String simpleData;

			private Integer expireLogsDays;

			private Integer waitTimeout;

			private Long estimatedRows;

			private List<String> databaseNames;

			private List<String> tableNames;

			private TableSchema tableSchema;

			public String getSimpleData() {
				return this.simpleData;
			}

			public void setSimpleData(String simpleData) {
				this.simpleData = simpleData;
			}

			public Integer getExpireLogsDays() {
				return this.expireLogsDays;
			}

			public void setExpireLogsDays(Integer expireLogsDays) {
				this.expireLogsDays = expireLogsDays;
			}

			public Integer getWaitTimeout() {
				return this.waitTimeout;
			}

			public void setWaitTimeout(Integer waitTimeout) {
				this.waitTimeout = waitTimeout;
			}

			public Long getEstimatedRows() {
				return this.estimatedRows;
			}

			public void setEstimatedRows(Long estimatedRows) {
				this.estimatedRows = estimatedRows;
			}

			public List<String> getDatabaseNames() {
				return this.databaseNames;
			}

			public void setDatabaseNames(List<String> databaseNames) {
				this.databaseNames = databaseNames;
			}

			public List<String> getTableNames() {
				return this.tableNames;
			}

			public void setTableNames(List<String> tableNames) {
				this.tableNames = tableNames;
			}

			public TableSchema getTableSchema() {
				return this.tableSchema;
			}

			public void setTableSchema(TableSchema tableSchema) {
				this.tableSchema = tableSchema;
			}

			public static class TableSchema {

				private String tableName;

				private List<ColumnsItem> columns;

				public String getTableName() {
					return this.tableName;
				}

				public void setTableName(String tableName) {
					this.tableName = tableName;
				}

				public List<ColumnsItem> getColumns() {
					return this.columns;
				}

				public void setColumns(List<ColumnsItem> columns) {
					this.columns = columns;
				}

				public static class ColumnsItem {

					private String field;

					private String isNull;

					private String extra;

					private String type;

					private String key;

					public String getField() {
						return this.field;
					}

					public void setField(String field) {
						this.field = field;
					}

					public String getIsNull() {
						return this.isNull;
					}

					public void setIsNull(String isNull) {
						this.isNull = isNull;
					}

					public String getExtra() {
						return this.extra;
					}

					public void setExtra(String extra) {
						this.extra = extra;
					}

					public String getType() {
						return this.type;
					}

					public void setType(String type) {
						this.type = type;
					}

					public String getKey() {
						return this.key;
					}

					public void setKey(String key) {
						this.key = key;
					}
				}
			}
		}
	}

	@Override
	public DiscoverEventSourceResponse getInstance(UnmarshallerContext context) {
		return	DiscoverEventSourceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
