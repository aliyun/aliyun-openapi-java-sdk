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

package com.aliyuncs.rds.model.v20140815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.DescribeHistoryTasksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeHistoryTasksResponse extends AcsResponse {

	private Integer pageNumber;

	private Integer pageSize;

	private String requestId;

	private Integer totalCount;

	private List<ItemsItem> items;

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

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<ItemsItem> getItems() {
		return this.items;
	}

	public void setItems(List<ItemsItem> items) {
		this.items = items;
	}

	public static class ItemsItem {

		private String actionInfo;

		private String callerSource;

		private String callerUid;

		private String currentStepName;

		private String dbType;

		private String endTime;

		private String instanceId;

		private String instanceName;

		private String instanceType;

		private String product;

		private Float progress;

		private String reasonCode;

		private String regionId;

		private Integer remainTime;

		private String startTime;

		private String status;

		private String taskDetail;

		private String taskId;

		private String taskType;

		private String uid;

		public String getActionInfo() {
			return this.actionInfo;
		}

		public void setActionInfo(String actionInfo) {
			this.actionInfo = actionInfo;
		}

		public String getCallerSource() {
			return this.callerSource;
		}

		public void setCallerSource(String callerSource) {
			this.callerSource = callerSource;
		}

		public String getCallerUid() {
			return this.callerUid;
		}

		public void setCallerUid(String callerUid) {
			this.callerUid = callerUid;
		}

		public String getCurrentStepName() {
			return this.currentStepName;
		}

		public void setCurrentStepName(String currentStepName) {
			this.currentStepName = currentStepName;
		}

		public String getDbType() {
			return this.dbType;
		}

		public void setDbType(String dbType) {
			this.dbType = dbType;
		}

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public String getProduct() {
			return this.product;
		}

		public void setProduct(String product) {
			this.product = product;
		}

		public Float getProgress() {
			return this.progress;
		}

		public void setProgress(Float progress) {
			this.progress = progress;
		}

		public String getReasonCode() {
			return this.reasonCode;
		}

		public void setReasonCode(String reasonCode) {
			this.reasonCode = reasonCode;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public Integer getRemainTime() {
			return this.remainTime;
		}

		public void setRemainTime(Integer remainTime) {
			this.remainTime = remainTime;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getTaskDetail() {
			return this.taskDetail;
		}

		public void setTaskDetail(String taskDetail) {
			this.taskDetail = taskDetail;
		}

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}

		public String getTaskType() {
			return this.taskType;
		}

		public void setTaskType(String taskType) {
			this.taskType = taskType;
		}

		public String getUid() {
			return this.uid;
		}

		public void setUid(String uid) {
			this.uid = uid;
		}
	}

	@Override
	public DescribeHistoryTasksResponse getInstance(UnmarshallerContext context) {
		return	DescribeHistoryTasksResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
