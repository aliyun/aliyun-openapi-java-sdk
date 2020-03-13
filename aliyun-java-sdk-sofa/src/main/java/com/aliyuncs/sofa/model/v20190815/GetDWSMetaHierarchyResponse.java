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

package com.aliyuncs.sofa.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.GetDWSMetaHierarchyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDWSMetaHierarchyResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private List<DataItem> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String tableName;

		private List<AllColumnItem> allColumn;

		public String getTableName() {
			return this.tableName;
		}

		public void setTableName(String tableName) {
			this.tableName = tableName;
		}

		public List<AllColumnItem> getAllColumn() {
			return this.allColumn;
		}

		public void setAllColumn(List<AllColumnItem> allColumn) {
			this.allColumn = allColumn;
		}

		public static class AllColumnItem {

			private String columnName;

			private List<ColumnInfoItem> columnInfo;

			public String getColumnName() {
				return this.columnName;
			}

			public void setColumnName(String columnName) {
				this.columnName = columnName;
			}

			public List<ColumnInfoItem> getColumnInfo() {
				return this.columnInfo;
			}

			public void setColumnInfo(List<ColumnInfoItem> columnInfo) {
				this.columnInfo = columnInfo;
			}

			public static class ColumnInfoItem {

				private Boolean isPrimaryKey;

				private Boolean isUnique;

				private String name;

				private String type;

				public Boolean getIsPrimaryKey() {
					return this.isPrimaryKey;
				}

				public void setIsPrimaryKey(Boolean isPrimaryKey) {
					this.isPrimaryKey = isPrimaryKey;
				}

				public Boolean getIsUnique() {
					return this.isUnique;
				}

				public void setIsUnique(Boolean isUnique) {
					this.isUnique = isUnique;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}
			}
		}
	}

	@Override
	public GetDWSMetaHierarchyResponse getInstance(UnmarshallerContext context) {
		return	GetDWSMetaHierarchyResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
