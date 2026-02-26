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

package com.aliyuncs.dataphin_public.model.v20230630;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataphin_public.transform.v20230630.GetTableColumnsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetTableColumnsResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer httpStatusCode;

	private String code;

	private String message;

	private List<Column> columnList;

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

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

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

	public List<Column> getColumnList() {
		return this.columnList;
	}

	public void setColumnList(List<Column> columnList) {
		this.columnList = columnList;
	}

	public static class Column {

		private String guid;

		private String env;

		private String tableGuid;

		private Long dataSourceId;

		private String dataSourceType;

		private String tableName;

		private Integer seqNumber;

		private String name;

		private String displayName;

		private String comment;

		private String dataType;

		private Boolean nullable;

		private String defaultValue;

		private Boolean isPrimaryKey;

		private Boolean isForeignKey;

		private Boolean isPartitionColumn;

		private String creator;

		private String lastModifier;

		private Long visitCount30d;

		private String createTime;

		private String modifyTime;

		private Long classifyId;

		private String classifyName;

		private String levelAbbreviation;

		public String getGuid() {
			return this.guid;
		}

		public void setGuid(String guid) {
			this.guid = guid;
		}

		public String getEnv() {
			return this.env;
		}

		public void setEnv(String env) {
			this.env = env;
		}

		public String getTableGuid() {
			return this.tableGuid;
		}

		public void setTableGuid(String tableGuid) {
			this.tableGuid = tableGuid;
		}

		public Long getDataSourceId() {
			return this.dataSourceId;
		}

		public void setDataSourceId(Long dataSourceId) {
			this.dataSourceId = dataSourceId;
		}

		public String getDataSourceType() {
			return this.dataSourceType;
		}

		public void setDataSourceType(String dataSourceType) {
			this.dataSourceType = dataSourceType;
		}

		public String getTableName() {
			return this.tableName;
		}

		public void setTableName(String tableName) {
			this.tableName = tableName;
		}

		public Integer getSeqNumber() {
			return this.seqNumber;
		}

		public void setSeqNumber(Integer seqNumber) {
			this.seqNumber = seqNumber;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDisplayName() {
			return this.displayName;
		}

		public void setDisplayName(String displayName) {
			this.displayName = displayName;
		}

		public String getComment() {
			return this.comment;
		}

		public void setComment(String comment) {
			this.comment = comment;
		}

		public String getDataType() {
			return this.dataType;
		}

		public void setDataType(String dataType) {
			this.dataType = dataType;
		}

		public Boolean getNullable() {
			return this.nullable;
		}

		public void setNullable(Boolean nullable) {
			this.nullable = nullable;
		}

		public String getDefaultValue() {
			return this.defaultValue;
		}

		public void setDefaultValue(String defaultValue) {
			this.defaultValue = defaultValue;
		}

		public Boolean getIsPrimaryKey() {
			return this.isPrimaryKey;
		}

		public void setIsPrimaryKey(Boolean isPrimaryKey) {
			this.isPrimaryKey = isPrimaryKey;
		}

		public Boolean getIsForeignKey() {
			return this.isForeignKey;
		}

		public void setIsForeignKey(Boolean isForeignKey) {
			this.isForeignKey = isForeignKey;
		}

		public Boolean getIsPartitionColumn() {
			return this.isPartitionColumn;
		}

		public void setIsPartitionColumn(Boolean isPartitionColumn) {
			this.isPartitionColumn = isPartitionColumn;
		}

		public String getCreator() {
			return this.creator;
		}

		public void setCreator(String creator) {
			this.creator = creator;
		}

		public String getLastModifier() {
			return this.lastModifier;
		}

		public void setLastModifier(String lastModifier) {
			this.lastModifier = lastModifier;
		}

		public Long getVisitCount30d() {
			return this.visitCount30d;
		}

		public void setVisitCount30d(Long visitCount30d) {
			this.visitCount30d = visitCount30d;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getModifyTime() {
			return this.modifyTime;
		}

		public void setModifyTime(String modifyTime) {
			this.modifyTime = modifyTime;
		}

		public Long getClassifyId() {
			return this.classifyId;
		}

		public void setClassifyId(Long classifyId) {
			this.classifyId = classifyId;
		}

		public String getClassifyName() {
			return this.classifyName;
		}

		public void setClassifyName(String classifyName) {
			this.classifyName = classifyName;
		}

		public String getLevelAbbreviation() {
			return this.levelAbbreviation;
		}

		public void setLevelAbbreviation(String levelAbbreviation) {
			this.levelAbbreviation = levelAbbreviation;
		}
	}

	@Override
	public GetTableColumnsResponse getInstance(UnmarshallerContext context) {
		return	GetTableColumnsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
