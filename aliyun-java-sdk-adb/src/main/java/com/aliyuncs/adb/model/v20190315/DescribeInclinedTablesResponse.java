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
import com.aliyuncs.adb.transform.v20190315.DescribeInclinedTablesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeInclinedTablesResponse extends AcsResponse {

	private String totalCount;

	private String pageSize;

	private String requestId;

	private String pageNumber;

	private List<Items> detectionItems;

	private Items1 items1;

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

	public List<Items> getDetectionItems() {
		return this.detectionItems;
	}

	public void setDetectionItems(List<Items> detectionItems) {
		this.detectionItems = detectionItems;
	}

	public Items1 getItems1() {
		return this.items1;
	}

	public void setItems1(Items1 items1) {
		this.items1 = items1;
	}

	public static class Items {

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

	public static class Items1 {

		private List<Items2> table;

		public List<Items2> getTable() {
			return this.table;
		}

		public void setTable(List<Items2> table) {
			this.table = table;
		}

		public static class Items2 {

			private String type;

			private String schema;

			private String size;

			private String name;

			private String isIncline;

			private Long totalSize;

			private Double spaceRatio;

			private Long rowCount;

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getSchema() {
				return this.schema;
			}

			public void setSchema(String schema) {
				this.schema = schema;
			}

			public String getSize() {
				return this.size;
			}

			public void setSize(String size) {
				this.size = size;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getIsIncline() {
				return this.isIncline;
			}

			public void setIsIncline(String isIncline) {
				this.isIncline = isIncline;
			}

			public Long getTotalSize() {
				return this.totalSize;
			}

			public void setTotalSize(Long totalSize) {
				this.totalSize = totalSize;
			}

			public Double getSpaceRatio() {
				return this.spaceRatio;
			}

			public void setSpaceRatio(Double spaceRatio) {
				this.spaceRatio = spaceRatio;
			}

			public Long getRowCount() {
				return this.rowCount;
			}

			public void setRowCount(Long rowCount) {
				this.rowCount = rowCount;
			}
		}
	}

	@Override
	public DescribeInclinedTablesResponse getInstance(UnmarshallerContext context) {
		return	DescribeInclinedTablesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
