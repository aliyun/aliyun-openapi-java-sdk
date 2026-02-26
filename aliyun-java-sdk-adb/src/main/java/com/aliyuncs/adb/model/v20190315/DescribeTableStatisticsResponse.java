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

package com.aliyuncs.adb.model.v20190315;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.adb.transform.v20190315.DescribeTableStatisticsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeTableStatisticsResponse extends AcsResponse {

	private String totalCount;

	private String pageSize;

	private String requestId;

	private String pageNumber;

	private String dBClusterId;

	private String schemaNames;

	private List<TableStatisticRecords> items;

	public String getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}

	public String getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(String pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getDBClusterId() {
		return this.dBClusterId;
	}

	public void setDBClusterId(String dBClusterId) {
		this.dBClusterId = dBClusterId;
	}

	public String getSchemaNames() {
		return this.schemaNames;
	}

	public void setSchemaNames(String schemaNames) {
		this.schemaNames = schemaNames;
	}

	public List<TableStatisticRecords> getItems() {
		return this.items;
	}

	public void setItems(List<TableStatisticRecords> items) {
		this.items = items;
	}

	public static class TableStatisticRecords {

		private String schemaName;

		private String tableName;

		private Long rowCount;

		private Long dataSize;

		private Long indexSize;

		private Long primaryKeyIndexSize;

		private Long partitionCount;

		private Long coldDataSize;

		private Double spaceRatio;

		private Long totalSize;

		private Long hotDataSize;

		private Long otherSize;

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

		public Long getRowCount() {
			return this.rowCount;
		}

		public void setRowCount(Long rowCount) {
			this.rowCount = rowCount;
		}

		public Long getDataSize() {
			return this.dataSize;
		}

		public void setDataSize(Long dataSize) {
			this.dataSize = dataSize;
		}

		public Long getIndexSize() {
			return this.indexSize;
		}

		public void setIndexSize(Long indexSize) {
			this.indexSize = indexSize;
		}

		public Long getPrimaryKeyIndexSize() {
			return this.primaryKeyIndexSize;
		}

		public void setPrimaryKeyIndexSize(Long primaryKeyIndexSize) {
			this.primaryKeyIndexSize = primaryKeyIndexSize;
		}

		public Long getPartitionCount() {
			return this.partitionCount;
		}

		public void setPartitionCount(Long partitionCount) {
			this.partitionCount = partitionCount;
		}

		public Long getColdDataSize() {
			return this.coldDataSize;
		}

		public void setColdDataSize(Long coldDataSize) {
			this.coldDataSize = coldDataSize;
		}

		public Double getSpaceRatio() {
			return this.spaceRatio;
		}

		public void setSpaceRatio(Double spaceRatio) {
			this.spaceRatio = spaceRatio;
		}

		public Long getTotalSize() {
			return this.totalSize;
		}

		public void setTotalSize(Long totalSize) {
			this.totalSize = totalSize;
		}

		public Long getHotDataSize() {
			return this.hotDataSize;
		}

		public void setHotDataSize(Long hotDataSize) {
			this.hotDataSize = hotDataSize;
		}

		public Long getOtherSize() {
			return this.otherSize;
		}

		public void setOtherSize(Long otherSize) {
			this.otherSize = otherSize;
		}
	}

	@Override
	public DescribeTableStatisticsResponse getInstance(UnmarshallerContext context) {
		return	DescribeTableStatisticsResponseUnmarshaller.unmarshall(this, context);
	}
}
