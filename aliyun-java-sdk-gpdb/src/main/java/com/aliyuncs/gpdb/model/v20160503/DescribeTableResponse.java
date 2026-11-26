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

package com.aliyuncs.gpdb.model.v20160503;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.gpdb.transform.v20160503.DescribeTableResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeTableResponse extends AcsResponse {

	private String status;

	private String message;

	private String requestId;

	private List<ColumnListItem> columnList;

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
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

	public List<ColumnListItem> getColumnList() {
		return this.columnList;
	}

	public void setColumnList(List<ColumnListItem> columnList) {
		this.columnList = columnList;
	}

	public static class ColumnListItem {

		private String comment;

		private String columnDefault;

		private Integer scale;

		private Integer maxLength;

		private String udtName;

		private Boolean isCaseSensitive;

		private Boolean isCurrency;

		private String name;

		private String tableName;

		private Integer precision;

		private String dataType;

		private Boolean isSigned;

		private Boolean nullable;

		private String schemaName;

		private Boolean isPrimaryKey;

		public String getComment() {
			return this.comment;
		}

		public void setComment(String comment) {
			this.comment = comment;
		}

		public String getColumnDefault() {
			return this.columnDefault;
		}

		public void setColumnDefault(String columnDefault) {
			this.columnDefault = columnDefault;
		}

		public Integer getScale() {
			return this.scale;
		}

		public void setScale(Integer scale) {
			this.scale = scale;
		}

		public Integer getMaxLength() {
			return this.maxLength;
		}

		public void setMaxLength(Integer maxLength) {
			this.maxLength = maxLength;
		}

		public String getUdtName() {
			return this.udtName;
		}

		public void setUdtName(String udtName) {
			this.udtName = udtName;
		}

		public Boolean getIsCaseSensitive() {
			return this.isCaseSensitive;
		}

		public void setIsCaseSensitive(Boolean isCaseSensitive) {
			this.isCaseSensitive = isCaseSensitive;
		}

		public Boolean getIsCurrency() {
			return this.isCurrency;
		}

		public void setIsCurrency(Boolean isCurrency) {
			this.isCurrency = isCurrency;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getTableName() {
			return this.tableName;
		}

		public void setTableName(String tableName) {
			this.tableName = tableName;
		}

		public Integer getPrecision() {
			return this.precision;
		}

		public void setPrecision(Integer precision) {
			this.precision = precision;
		}

		public String getDataType() {
			return this.dataType;
		}

		public void setDataType(String dataType) {
			this.dataType = dataType;
		}

		public Boolean getIsSigned() {
			return this.isSigned;
		}

		public void setIsSigned(Boolean isSigned) {
			this.isSigned = isSigned;
		}

		public Boolean getNullable() {
			return this.nullable;
		}

		public void setNullable(Boolean nullable) {
			this.nullable = nullable;
		}

		public String getSchemaName() {
			return this.schemaName;
		}

		public void setSchemaName(String schemaName) {
			this.schemaName = schemaName;
		}

		public Boolean getIsPrimaryKey() {
			return this.isPrimaryKey;
		}

		public void setIsPrimaryKey(Boolean isPrimaryKey) {
			this.isPrimaryKey = isPrimaryKey;
		}
	}

	@Override
	public DescribeTableResponse getInstance(UnmarshallerContext context) {
		return	DescribeTableResponseUnmarshaller.unmarshall(this, context);
	}
}
