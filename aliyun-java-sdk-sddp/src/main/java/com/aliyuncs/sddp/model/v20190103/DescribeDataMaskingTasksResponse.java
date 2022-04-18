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
import com.aliyuncs.sddp.transform.v20190103.DescribeDataMaskingTasksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDataMaskingTasksResponse extends AcsResponse {

	private Integer currentPage;

	private String requestId;

	private Integer pageSize;

	private Integer totalCount;

	private List<Task> items;

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

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

		private Integer status;

		private String owner;

		private String taskName;

		private Integer srcType;

		private Integer dstType;

		private Boolean hasUnfinishProcess;

		private Boolean originalTable;

		private Integer triggerType;

		private String dstTypeCode;

		private Integer runCount;

		private Long gmtCreate;

		private String taskId;

		private String dstPath;

		private String srcTypeCode;

		private Long id;

		private String srcPath;

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public String getOwner() {
			return this.owner;
		}

		public void setOwner(String owner) {
			this.owner = owner;
		}

		public String getTaskName() {
			return this.taskName;
		}

		public void setTaskName(String taskName) {
			this.taskName = taskName;
		}

		public Integer getSrcType() {
			return this.srcType;
		}

		public void setSrcType(Integer srcType) {
			this.srcType = srcType;
		}

		public Integer getDstType() {
			return this.dstType;
		}

		public void setDstType(Integer dstType) {
			this.dstType = dstType;
		}

		public Boolean getHasUnfinishProcess() {
			return this.hasUnfinishProcess;
		}

		public void setHasUnfinishProcess(Boolean hasUnfinishProcess) {
			this.hasUnfinishProcess = hasUnfinishProcess;
		}

		public Boolean getOriginalTable() {
			return this.originalTable;
		}

		public void setOriginalTable(Boolean originalTable) {
			this.originalTable = originalTable;
		}

		public Integer getTriggerType() {
			return this.triggerType;
		}

		public void setTriggerType(Integer triggerType) {
			this.triggerType = triggerType;
		}

		public String getDstTypeCode() {
			return this.dstTypeCode;
		}

		public void setDstTypeCode(String dstTypeCode) {
			this.dstTypeCode = dstTypeCode;
		}

		public Integer getRunCount() {
			return this.runCount;
		}

		public void setRunCount(Integer runCount) {
			this.runCount = runCount;
		}

		public Long getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(Long gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}

		public String getDstPath() {
			return this.dstPath;
		}

		public void setDstPath(String dstPath) {
			this.dstPath = dstPath;
		}

		public String getSrcTypeCode() {
			return this.srcTypeCode;
		}

		public void setSrcTypeCode(String srcTypeCode) {
			this.srcTypeCode = srcTypeCode;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getSrcPath() {
			return this.srcPath;
		}

		public void setSrcPath(String srcPath) {
			this.srcPath = srcPath;
		}
	}

	@Override
	public DescribeDataMaskingTasksResponse getInstance(UnmarshallerContext context) {
		return	DescribeDataMaskingTasksResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
