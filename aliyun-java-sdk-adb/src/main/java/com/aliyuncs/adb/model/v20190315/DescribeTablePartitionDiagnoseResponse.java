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
import com.aliyuncs.adb.transform.v20190315.DescribeTablePartitionDiagnoseResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeTablePartitionDiagnoseResponse extends AcsResponse {

	private String requestId;

	private Integer pageNumber;

	private Integer totalCount;

	private Integer pageSize;

	private Integer dBClusterId;

	private Long suggestMinRecordsPerPartition;

	private Long suggestMaxRecordsPerPartition;

	private List<TablePartitionDiagnose> items;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getDBClusterId() {
		return this.dBClusterId;
	}

	public void setDBClusterId(Integer dBClusterId) {
		this.dBClusterId = dBClusterId;
	}

	public Long getSuggestMinRecordsPerPartition() {
		return this.suggestMinRecordsPerPartition;
	}

	public void setSuggestMinRecordsPerPartition(Long suggestMinRecordsPerPartition) {
		this.suggestMinRecordsPerPartition = suggestMinRecordsPerPartition;
	}

	public Long getSuggestMaxRecordsPerPartition() {
		return this.suggestMaxRecordsPerPartition;
	}

	public void setSuggestMaxRecordsPerPartition(Long suggestMaxRecordsPerPartition) {
		this.suggestMaxRecordsPerPartition = suggestMaxRecordsPerPartition;
	}

	public List<TablePartitionDiagnose> getItems() {
		return this.items;
	}

	public void setItems(List<TablePartitionDiagnose> items) {
		this.items = items;
	}

	public static class TablePartitionDiagnose {

		private String schemaName;

		private String tableName;

		private Integer partitionNumber;

		private String partitionDetail;

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

		public Integer getPartitionNumber() {
			return this.partitionNumber;
		}

		public void setPartitionNumber(Integer partitionNumber) {
			this.partitionNumber = partitionNumber;
		}

		public String getPartitionDetail() {
			return this.partitionDetail;
		}

		public void setPartitionDetail(String partitionDetail) {
			this.partitionDetail = partitionDetail;
		}
	}

	@Override
	public DescribeTablePartitionDiagnoseResponse getInstance(UnmarshallerContext context) {
		return	DescribeTablePartitionDiagnoseResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
