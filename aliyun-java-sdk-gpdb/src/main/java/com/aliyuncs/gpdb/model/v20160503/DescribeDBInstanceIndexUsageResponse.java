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
import com.aliyuncs.gpdb.transform.v20160503.DescribeDBInstanceIndexUsageResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBInstanceIndexUsageResponse extends AcsResponse {

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

		private String databaseName;

		private String schemaName;

		private String tableName;

		private Boolean isPartitionTable;

		private String parentTableName;

		private String indexName;

		private String indexSize;

		private Long indexScanTimes;

		private String indexDef;

		private String timeLastUpdated;

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

		public Boolean getIsPartitionTable() {
			return this.isPartitionTable;
		}

		public void setIsPartitionTable(Boolean isPartitionTable) {
			this.isPartitionTable = isPartitionTable;
		}

		public String getParentTableName() {
			return this.parentTableName;
		}

		public void setParentTableName(String parentTableName) {
			this.parentTableName = parentTableName;
		}

		public String getIndexName() {
			return this.indexName;
		}

		public void setIndexName(String indexName) {
			this.indexName = indexName;
		}

		public String getIndexSize() {
			return this.indexSize;
		}

		public void setIndexSize(String indexSize) {
			this.indexSize = indexSize;
		}

		public Long getIndexScanTimes() {
			return this.indexScanTimes;
		}

		public void setIndexScanTimes(Long indexScanTimes) {
			this.indexScanTimes = indexScanTimes;
		}

		public String getIndexDef() {
			return this.indexDef;
		}

		public void setIndexDef(String indexDef) {
			this.indexDef = indexDef;
		}

		public String getTimeLastUpdated() {
			return this.timeLastUpdated;
		}

		public void setTimeLastUpdated(String timeLastUpdated) {
			this.timeLastUpdated = timeLastUpdated;
		}
	}

	@Override
	public DescribeDBInstanceIndexUsageResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBInstanceIndexUsageResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
