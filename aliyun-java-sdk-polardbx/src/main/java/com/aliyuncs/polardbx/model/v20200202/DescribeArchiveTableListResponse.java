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
import com.aliyuncs.polardbx.transform.v20200202.DescribeArchiveTableListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeArchiveTableListResponse extends AcsResponse {

	private String requestId;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long total;

		private Long pageIndex;

		private Long pageSize;

		private Integer tobeArchivedConut;

		private Integer runningCount;

		private Integer successCount;

		private Integer pausedCount;

		private List<ArchiveTable> tables;

		public Long getTotal() {
			return this.total;
		}

		public void setTotal(Long total) {
			this.total = total;
		}

		public Long getPageIndex() {
			return this.pageIndex;
		}

		public void setPageIndex(Long pageIndex) {
			this.pageIndex = pageIndex;
		}

		public Long getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Long pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getTobeArchivedConut() {
			return this.tobeArchivedConut;
		}

		public void setTobeArchivedConut(Integer tobeArchivedConut) {
			this.tobeArchivedConut = tobeArchivedConut;
		}

		public Integer getRunningCount() {
			return this.runningCount;
		}

		public void setRunningCount(Integer runningCount) {
			this.runningCount = runningCount;
		}

		public Integer getSuccessCount() {
			return this.successCount;
		}

		public void setSuccessCount(Integer successCount) {
			this.successCount = successCount;
		}

		public Integer getPausedCount() {
			return this.pausedCount;
		}

		public void setPausedCount(Integer pausedCount) {
			this.pausedCount = pausedCount;
		}

		public List<ArchiveTable> getTables() {
			return this.tables;
		}

		public void setTables(List<ArchiveTable> tables) {
			this.tables = tables;
		}

		public static class ArchiveTable {

			private String schemaName;

			private String tableName;

			private Long createdDate;

			private Double spaceSize;

			private Integer fileCount;

			private Long lastSuccessArchiveTime;

			private String archiveStatus;

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

			public Long getCreatedDate() {
				return this.createdDate;
			}

			public void setCreatedDate(Long createdDate) {
				this.createdDate = createdDate;
			}

			public Double getSpaceSize() {
				return this.spaceSize;
			}

			public void setSpaceSize(Double spaceSize) {
				this.spaceSize = spaceSize;
			}

			public Integer getFileCount() {
				return this.fileCount;
			}

			public void setFileCount(Integer fileCount) {
				this.fileCount = fileCount;
			}

			public Long getLastSuccessArchiveTime() {
				return this.lastSuccessArchiveTime;
			}

			public void setLastSuccessArchiveTime(Long lastSuccessArchiveTime) {
				this.lastSuccessArchiveTime = lastSuccessArchiveTime;
			}

			public String getArchiveStatus() {
				return this.archiveStatus;
			}

			public void setArchiveStatus(String archiveStatus) {
				this.archiveStatus = archiveStatus;
			}
		}
	}

	@Override
	public DescribeArchiveTableListResponse getInstance(UnmarshallerContext context) {
		return	DescribeArchiveTableListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
