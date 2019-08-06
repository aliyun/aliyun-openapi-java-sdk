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

package com.aliyuncs.drds.model.v20190123;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.drds.transform.v20190123.DescribeTableResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeTableResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Data data;

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

		private List<ColumnInfo> list;

		public List<ColumnInfo> getList() {
			return this.list;
		}

		public void setList(List<ColumnInfo> list) {
			this.list = list;
		}

		public static class ColumnInfo {

			private String columnName;

			private String columnType;

			private String extra;

			private String index;

			private String isAllowNull;

			private String isPk;

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

			public String getExtra() {
				return this.extra;
			}

			public void setExtra(String extra) {
				this.extra = extra;
			}

			public String getIndex() {
				return this.index;
			}

			public void setIndex(String index) {
				this.index = index;
			}

			public String getIsAllowNull() {
				return this.isAllowNull;
			}

			public void setIsAllowNull(String isAllowNull) {
				this.isAllowNull = isAllowNull;
			}

			public String getIsPk() {
				return this.isPk;
			}

			public void setIsPk(String isPk) {
				this.isPk = isPk;
			}
		}
	}

	@Override
	public DescribeTableResponse getInstance(UnmarshallerContext context) {
		return	DescribeTableResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
