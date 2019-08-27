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

package com.aliyuncs.emr.model.v20160408;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.emr.transform.v20160408.DescribeDataSourceSchemaTableResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDataSourceSchemaTableResponse extends AcsResponse {

	private String requestId;

	private String dataSourceId;

	private Schema schema;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDataSourceId() {
		return this.dataSourceId;
	}

	public void setDataSourceId(String dataSourceId) {
		this.dataSourceId = dataSourceId;
	}

	public Schema getSchema() {
		return this.schema;
	}

	public void setSchema(Schema schema) {
		this.schema = schema;
	}

	public static class Schema {

		private String dbType;

		private String dbVersion;

		private String dbName;

		private String tableName;

		private List<Field> fields;

		public String getDbType() {
			return this.dbType;
		}

		public void setDbType(String dbType) {
			this.dbType = dbType;
		}

		public String getDbVersion() {
			return this.dbVersion;
		}

		public void setDbVersion(String dbVersion) {
			this.dbVersion = dbVersion;
		}

		public String getDbName() {
			return this.dbName;
		}

		public void setDbName(String dbName) {
			this.dbName = dbName;
		}

		public String getTableName() {
			return this.tableName;
		}

		public void setTableName(String tableName) {
			this.tableName = tableName;
		}

		public List<Field> getFields() {
			return this.fields;
		}

		public void setFields(List<Field> fields) {
			this.fields = fields;
		}

		public static class Field {

			private String type;

			private String length;

			private String name;

			private Integer index;

			private String rawType;

			private String assignType;

			private String assignValue;

			private Boolean partitionKey;

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getLength() {
				return this.length;
			}

			public void setLength(String length) {
				this.length = length;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public Integer getIndex() {
				return this.index;
			}

			public void setIndex(Integer index) {
				this.index = index;
			}

			public String getRawType() {
				return this.rawType;
			}

			public void setRawType(String rawType) {
				this.rawType = rawType;
			}

			public String getAssignType() {
				return this.assignType;
			}

			public void setAssignType(String assignType) {
				this.assignType = assignType;
			}

			public String getAssignValue() {
				return this.assignValue;
			}

			public void setAssignValue(String assignValue) {
				this.assignValue = assignValue;
			}

			public Boolean getPartitionKey() {
				return this.partitionKey;
			}

			public void setPartitionKey(Boolean partitionKey) {
				this.partitionKey = partitionKey;
			}
		}
	}

	@Override
	public DescribeDataSourceSchemaTableResponse getInstance(UnmarshallerContext context) {
		return	DescribeDataSourceSchemaTableResponseUnmarshaller.unmarshall(this, context);
	}
}
