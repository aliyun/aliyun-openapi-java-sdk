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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsDescribePlannedTasksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribePlannedTasksResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<PlannedTask> plannedTasks;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
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

	public List<PlannedTask> getPlannedTasks() {
		return this.plannedTasks;
	}

	public void setPlannedTasks(List<PlannedTask> plannedTasks) {
		this.plannedTasks = plannedTasks;
	}

	public static class PlannedTask {

		private Long id;

		private String bid;

		private Long aliUid;

		private String gmtCreate;

		private String gmtModified;

		private String expectedExecuteTime;

		private Integer actionType;

		private Integer status;

		private String instanceId;

		private String extendInfo;

		private Boolean deleted;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getBid() {
			return this.bid;
		}

		public void setBid(String bid) {
			this.bid = bid;
		}

		public Long getAliUid() {
			return this.aliUid;
		}

		public void setAliUid(Long aliUid) {
			this.aliUid = aliUid;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getExpectedExecuteTime() {
			return this.expectedExecuteTime;
		}

		public void setExpectedExecuteTime(String expectedExecuteTime) {
			this.expectedExecuteTime = expectedExecuteTime;
		}

		public Integer getActionType() {
			return this.actionType;
		}

		public void setActionType(Integer actionType) {
			this.actionType = actionType;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getExtendInfo() {
			return this.extendInfo;
		}

		public void setExtendInfo(String extendInfo) {
			this.extendInfo = extendInfo;
		}

		public Boolean getDeleted() {
			return this.deleted;
		}

		public void setDeleted(Boolean deleted) {
			this.deleted = deleted;
		}
	}

	@Override
	public OpsDescribePlannedTasksResponse getInstance(UnmarshallerContext context) {
		return	OpsDescribePlannedTasksResponseUnmarshaller.unmarshall(this, context);
	}
}
