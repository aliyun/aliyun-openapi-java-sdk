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

package com.aliyuncs.polardbx.model.v20200202;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.polardbx.transform.v20200202.DescribeDistributeTableListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDistributeTableListResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String message;

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

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private List<Table> tables;

		public List<Table> getTables() {
			return this.tables;
		}

		public void setTables(List<Table> tables) {
			this.tables = tables;
		}

		public static class Table {

			private String tableName;

			private String tableType;

			private String dbKey;

			private String tbKey;

			public String getTableName() {
				return this.tableName;
			}

			public void setTableName(String tableName) {
				this.tableName = tableName;
			}

			public String getTableType() {
				return this.tableType;
			}

			public void setTableType(String tableType) {
				this.tableType = tableType;
			}

			public String getDbKey() {
				return this.dbKey;
			}

			public void setDbKey(String dbKey) {
				this.dbKey = dbKey;
			}

			public String getTbKey() {
				return this.tbKey;
			}

			public void setTbKey(String tbKey) {
				this.tbKey = tbKey;
			}
		}
	}

	@Override
	public DescribeDistributeTableListResponse getInstance(UnmarshallerContext context) {
		return	DescribeDistributeTableListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
