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
import com.aliyuncs.adb.transform.v20190315.DescribeOversizeNonPartitionTableInfosResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeOversizeNonPartitionTableInfosResponse extends AcsResponse {

	private String totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private String requestId;

	private String dBClusterId;

	private List<OversizeNonPartitionTableInfo> tables;

	private List<DetectionItemsArray> detectionItems;

	public String getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDBClusterId() {
		return this.dBClusterId;
	}

	public void setDBClusterId(String dBClusterId) {
		this.dBClusterId = dBClusterId;
	}

	public List<OversizeNonPartitionTableInfo> getTables() {
		return this.tables;
	}

	public void setTables(List<OversizeNonPartitionTableInfo> tables) {
		this.tables = tables;
	}

	public List<DetectionItemsArray> getDetectionItems() {
		return this.detectionItems;
	}

	public void setDetectionItems(List<DetectionItemsArray> detectionItems) {
		this.detectionItems = detectionItems;
	}

	public static class OversizeNonPartitionTableInfo {

		private String schemaName;

		private String tableName;

		private Long rowCount;

		private Long indexSize;

		private Long dataSize;

		private Long localDataSize;

		private Long primaryKeySize;

		private Long remoteDataSize;

		private Double spaceRatio;

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

		public Long getIndexSize() {
			return this.indexSize;
		}

		public void setIndexSize(Long indexSize) {
			this.indexSize = indexSize;
		}

		public Long getDataSize() {
			return this.dataSize;
		}

		public void setDataSize(Long dataSize) {
			this.dataSize = dataSize;
		}

		public Long getLocalDataSize() {
			return this.localDataSize;
		}

		public void setLocalDataSize(Long localDataSize) {
			this.localDataSize = localDataSize;
		}

		public Long getPrimaryKeySize() {
			return this.primaryKeySize;
		}

		public void setPrimaryKeySize(Long primaryKeySize) {
			this.primaryKeySize = primaryKeySize;
		}

		public Long getRemoteDataSize() {
			return this.remoteDataSize;
		}

		public void setRemoteDataSize(Long remoteDataSize) {
			this.remoteDataSize = remoteDataSize;
		}

		public Double getSpaceRatio() {
			return this.spaceRatio;
		}

		public void setSpaceRatio(Double spaceRatio) {
			this.spaceRatio = spaceRatio;
		}
	}

	public static class DetectionItemsArray {

		private String name;

		private String message;

		private String status;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
	}

	@Override
	public DescribeOversizeNonPartitionTableInfosResponse getInstance(UnmarshallerContext context) {
		return	DescribeOversizeNonPartitionTableInfosResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
