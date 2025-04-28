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
import com.aliyuncs.adb.transform.v20190315.DescribeExcessivePrimaryKeysResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeExcessivePrimaryKeysResponse extends AcsResponse {

	private String totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private String requestId;

	private String dBClusterId;

	private String accessDeniedDetail;

	private List<ExcessivePrimaryKeyInfos> tables;

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

	public String getAccessDeniedDetail() {
		return this.accessDeniedDetail;
	}

	public void setAccessDeniedDetail(String accessDeniedDetail) {
		this.accessDeniedDetail = accessDeniedDetail;
	}

	public List<ExcessivePrimaryKeyInfos> getTables() {
		return this.tables;
	}

	public void setTables(List<ExcessivePrimaryKeyInfos> tables) {
		this.tables = tables;
	}

	public List<DetectionItemsArray> getDetectionItems() {
		return this.detectionItems;
	}

	public void setDetectionItems(List<DetectionItemsArray> detectionItems) {
		this.detectionItems = detectionItems;
	}

	public static class ExcessivePrimaryKeyInfos {

		private String tableName;

		private String schemaName;

		private Integer columnCount;

		private Integer primaryKeyCount;

		private String primaryKeyColumns;

		private Double spaceRatio;

		private Long totalSize;

		private Long primaryKeyIndexSize;

		public String getTableName() {
			return this.tableName;
		}

		public void setTableName(String tableName) {
			this.tableName = tableName;
		}

		public String getSchemaName() {
			return this.schemaName;
		}

		public void setSchemaName(String schemaName) {
			this.schemaName = schemaName;
		}

		public Integer getColumnCount() {
			return this.columnCount;
		}

		public void setColumnCount(Integer columnCount) {
			this.columnCount = columnCount;
		}

		public Integer getPrimaryKeyCount() {
			return this.primaryKeyCount;
		}

		public void setPrimaryKeyCount(Integer primaryKeyCount) {
			this.primaryKeyCount = primaryKeyCount;
		}

		public String getPrimaryKeyColumns() {
			return this.primaryKeyColumns;
		}

		public void setPrimaryKeyColumns(String primaryKeyColumns) {
			this.primaryKeyColumns = primaryKeyColumns;
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

		public Long getPrimaryKeyIndexSize() {
			return this.primaryKeyIndexSize;
		}

		public void setPrimaryKeyIndexSize(Long primaryKeyIndexSize) {
			this.primaryKeyIndexSize = primaryKeyIndexSize;
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
	public DescribeExcessivePrimaryKeysResponse getInstance(UnmarshallerContext context) {
		return	DescribeExcessivePrimaryKeysResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
