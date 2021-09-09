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
import com.aliyuncs.gpdb.transform.v20160503.DescribeSQLLogsOnSliceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSQLLogsOnSliceResponse extends AcsResponse {

	private String requestId;

	private Integer pageRecordCount;

	private Integer pageNumber;

	private List<SQLLogsSliceItem> sliceLogItems;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageRecordCount() {
		return this.pageRecordCount;
	}

	public void setPageRecordCount(Integer pageRecordCount) {
		this.pageRecordCount = pageRecordCount;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<SQLLogsSliceItem> getSliceLogItems() {
		return this.sliceLogItems;
	}

	public void setSliceLogItems(List<SQLLogsSliceItem> sliceLogItems) {
		this.sliceLogItems = sliceLogItems;
	}

	public static class SQLLogsSliceItem {

		private String executeStatus;

		private Float executeCost;

		private Long returnRowCounts;

		private String operationExecuteTime;

		private String segmentId;

		private Float peakMemory;

		private String operationExecuteEndTime;

		private String segmentName;

		public String getExecuteStatus() {
			return this.executeStatus;
		}

		public void setExecuteStatus(String executeStatus) {
			this.executeStatus = executeStatus;
		}

		public Float getExecuteCost() {
			return this.executeCost;
		}

		public void setExecuteCost(Float executeCost) {
			this.executeCost = executeCost;
		}

		public Long getReturnRowCounts() {
			return this.returnRowCounts;
		}

		public void setReturnRowCounts(Long returnRowCounts) {
			this.returnRowCounts = returnRowCounts;
		}

		public String getOperationExecuteTime() {
			return this.operationExecuteTime;
		}

		public void setOperationExecuteTime(String operationExecuteTime) {
			this.operationExecuteTime = operationExecuteTime;
		}

		public String getSegmentId() {
			return this.segmentId;
		}

		public void setSegmentId(String segmentId) {
			this.segmentId = segmentId;
		}

		public Float getPeakMemory() {
			return this.peakMemory;
		}

		public void setPeakMemory(Float peakMemory) {
			this.peakMemory = peakMemory;
		}

		public String getOperationExecuteEndTime() {
			return this.operationExecuteEndTime;
		}

		public void setOperationExecuteEndTime(String operationExecuteEndTime) {
			this.operationExecuteEndTime = operationExecuteEndTime;
		}

		public String getSegmentName() {
			return this.segmentName;
		}

		public void setSegmentName(String segmentName) {
			this.segmentName = segmentName;
		}
	}

	@Override
	public DescribeSQLLogsOnSliceResponse getInstance(UnmarshallerContext context) {
		return	DescribeSQLLogsOnSliceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
