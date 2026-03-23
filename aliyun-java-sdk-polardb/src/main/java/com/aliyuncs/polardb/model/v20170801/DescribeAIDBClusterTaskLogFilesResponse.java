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

package com.aliyuncs.polardb.model.v20170801;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.polardb.transform.v20170801.DescribeAIDBClusterTaskLogFilesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAIDBClusterTaskLogFilesResponse extends AcsResponse {

	private Integer pageRecordCount;

	private String requestId;

	private Long pageSize;

	private Long pageNumber;

	private String startTime;

	private String endTime;

	private Items items;

	public Integer getPageRecordCount() {
		return this.pageRecordCount;
	}

	public void setPageRecordCount(Integer pageRecordCount) {
		this.pageRecordCount = pageRecordCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public Items getItems() {
		return this.items;
	}

	public void setItems(Items items) {
		this.items = items;
	}

	public static class Items {

		private List<SlsLogItem> slsLogItems;

		public List<SlsLogItem> getSlsLogItems() {
			return this.slsLogItems;
		}

		public void setSlsLogItems(List<SlsLogItem> slsLogItems) {
			this.slsLogItems = slsLogItems;
		}

		public static class SlsLogItem {

			private String timestamp;

			private String message;

			private String logTime;

			public String getTimestamp() {
				return this.timestamp;
			}

			public void setTimestamp(String timestamp) {
				this.timestamp = timestamp;
			}

			public String getMessage() {
				return this.message;
			}

			public void setMessage(String message) {
				this.message = message;
			}

			public String getLogTime() {
				return this.logTime;
			}

			public void setLogTime(String logTime) {
				this.logTime = logTime;
			}
		}
	}

	@Override
	public DescribeAIDBClusterTaskLogFilesResponse getInstance(UnmarshallerContext context) {
		return	DescribeAIDBClusterTaskLogFilesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
