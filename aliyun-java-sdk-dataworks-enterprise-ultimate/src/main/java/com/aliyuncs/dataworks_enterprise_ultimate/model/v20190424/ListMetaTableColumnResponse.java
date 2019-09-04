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

package com.aliyuncs.dataworks_enterprise_ultimate.model.v20190424;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataworks_enterprise_ultimate.transform.v20190424.ListMetaTableColumnResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListMetaTableColumnResponse extends AcsResponse {

	private String requestId;

	private Long errCode;

	private String errMsg;

	private List<Column> columnList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getErrCode() {
		return this.errCode;
	}

	public void setErrCode(Long errCode) {
		this.errCode = errCode;
	}

	public String getErrMsg() {
		return this.errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

	public List<Column> getColumnList() {
		return this.columnList;
	}

	public void setColumnList(List<Column> columnList) {
		this.columnList = columnList;
	}

	public static class Column {

		private String appGuid;

		private String tableGuid;

		private String tableName;

		private String columnGuid;

		private String columnName;

		private String columnType;

		private Integer seqNumber;

		private Integer isPartitionCol;

		private Integer isPrimaryKey;

		private Integer isNullable;

		private String comment;

		private String safeLevel;

		public String getAppGuid() {
			return this.appGuid;
		}

		public void setAppGuid(String appGuid) {
			this.appGuid = appGuid;
		}

		public String getTableGuid() {
			return this.tableGuid;
		}

		public void setTableGuid(String tableGuid) {
			this.tableGuid = tableGuid;
		}

		public String getTableName() {
			return this.tableName;
		}

		public void setTableName(String tableName) {
			this.tableName = tableName;
		}

		public String getColumnGuid() {
			return this.columnGuid;
		}

		public void setColumnGuid(String columnGuid) {
			this.columnGuid = columnGuid;
		}

		public String getColumnName() {
			return this.columnName;
		}

		public void setColumnName(String columnName) {
			this.columnName = columnName;
		}

		public String getColumnType() {
			return this.columnType;
		}

		public void setColumnType(String columnType) {
			this.columnType = columnType;
		}

		public Integer getSeqNumber() {
			return this.seqNumber;
		}

		public void setSeqNumber(Integer seqNumber) {
			this.seqNumber = seqNumber;
		}

		public Integer getIsPartitionCol() {
			return this.isPartitionCol;
		}

		public void setIsPartitionCol(Integer isPartitionCol) {
			this.isPartitionCol = isPartitionCol;
		}

		public Integer getIsPrimaryKey() {
			return this.isPrimaryKey;
		}

		public void setIsPrimaryKey(Integer isPrimaryKey) {
			this.isPrimaryKey = isPrimaryKey;
		}

		public Integer getIsNullable() {
			return this.isNullable;
		}

		public void setIsNullable(Integer isNullable) {
			this.isNullable = isNullable;
		}

		public String getComment() {
			return this.comment;
		}

		public void setComment(String comment) {
			this.comment = comment;
		}

		public String getSafeLevel() {
			return this.safeLevel;
		}

		public void setSafeLevel(String safeLevel) {
			this.safeLevel = safeLevel;
		}
	}

	@Override
	public ListMetaTableColumnResponse getInstance(UnmarshallerContext context) {
		return	ListMetaTableColumnResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
