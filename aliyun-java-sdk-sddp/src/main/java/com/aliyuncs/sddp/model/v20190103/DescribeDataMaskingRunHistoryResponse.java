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

package com.aliyuncs.sddp.model.v20190103;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sddp.transform.v20190103.DescribeDataMaskingRunHistoryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDataMaskingRunHistoryResponse extends AcsResponse {

	private String requestId;

	private Integer pageSize;

	private Integer currentPage;

	private Integer totalCount;

	private List<Task> items;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<Task> getItems() {
		return this.items;
	}

	public void setItems(List<Task> items) {
		this.items = items;
	}

	public static class Task {

		private Long id;

		private String taskId;

		private Long startTime;

		private Integer runIndex;

		private Integer type;

		private Integer dstType;

		private Integer percentage;

		private Integer srcType;

		private Long maskingCount;

		private Long conflictCount;

		private Integer status;

		private String failCode;

		private String dstTypeCode;

		private String srcTypeCode;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}

		public Long getStartTime() {
			return this.startTime;
		}

		public void setStartTime(Long startTime) {
			this.startTime = startTime;
		}

		public Integer getRunIndex() {
			return this.runIndex;
		}

		public void setRunIndex(Integer runIndex) {
			this.runIndex = runIndex;
		}

		public Integer getType() {
			return this.type;
		}

		public void setType(Integer type) {
			this.type = type;
		}

		public Integer getDstType() {
			return this.dstType;
		}

		public void setDstType(Integer dstType) {
			this.dstType = dstType;
		}

		public Integer getPercentage() {
			return this.percentage;
		}

		public void setPercentage(Integer percentage) {
			this.percentage = percentage;
		}

		public Integer getSrcType() {
			return this.srcType;
		}

		public void setSrcType(Integer srcType) {
			this.srcType = srcType;
		}

		public Long getMaskingCount() {
			return this.maskingCount;
		}

		public void setMaskingCount(Long maskingCount) {
			this.maskingCount = maskingCount;
		}

		public Long getConflictCount() {
			return this.conflictCount;
		}

		public void setConflictCount(Long conflictCount) {
			this.conflictCount = conflictCount;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public String getFailCode() {
			return this.failCode;
		}

		public void setFailCode(String failCode) {
			this.failCode = failCode;
		}

		public String getDstTypeCode() {
			return this.dstTypeCode;
		}

		public void setDstTypeCode(String dstTypeCode) {
			this.dstTypeCode = dstTypeCode;
		}

		public String getSrcTypeCode() {
			return this.srcTypeCode;
		}

		public void setSrcTypeCode(String srcTypeCode) {
			this.srcTypeCode = srcTypeCode;
		}
	}

	@Override
	public DescribeDataMaskingRunHistoryResponse getInstance(UnmarshallerContext context) {
		return	DescribeDataMaskingRunHistoryResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
