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
import com.aliyuncs.gpdb.transform.v20160503.DescribeDBInstanceDataSkewResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBInstanceDataSkewResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private List<ItemsItem> items;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<ItemsItem> getItems() {
		return this.items;
	}

	public void setItems(List<ItemsItem> items) {
		this.items = items;
	}

	public static class ItemsItem {

		private Integer sequence;

		private String databaseName;

		private String schemaName;

		private String tableName;

		private String owner;

		private String tableSize;

		private String tableSkew;

		private String distributeKey;

		private String timeLastUpdated;

		public Integer getSequence() {
			return this.sequence;
		}

		public void setSequence(Integer sequence) {
			this.sequence = sequence;
		}

		public String getDatabaseName() {
			return this.databaseName;
		}

		public void setDatabaseName(String databaseName) {
			this.databaseName = databaseName;
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

		public String getOwner() {
			return this.owner;
		}

		public void setOwner(String owner) {
			this.owner = owner;
		}

		public String getTableSize() {
			return this.tableSize;
		}

		public void setTableSize(String tableSize) {
			this.tableSize = tableSize;
		}

		public String getTableSkew() {
			return this.tableSkew;
		}

		public void setTableSkew(String tableSkew) {
			this.tableSkew = tableSkew;
		}

		public String getDistributeKey() {
			return this.distributeKey;
		}

		public void setDistributeKey(String distributeKey) {
			this.distributeKey = distributeKey;
		}

		public String getTimeLastUpdated() {
			return this.timeLastUpdated;
		}

		public void setTimeLastUpdated(String timeLastUpdated) {
			this.timeLastUpdated = timeLastUpdated;
		}
	}

	@Override
	public DescribeDBInstanceDataSkewResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBInstanceDataSkewResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
