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

package com.aliyuncs.ecs.model.v20140526;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20140526.DescribeTaskAttributeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeTaskAttributeResponse extends AcsResponse {

	private String requestId;

	private String taskId;

	private String regionId;

	private String taskAction;

	private String taskStatus;

	private String taskProcess;

	private String supportCancel;

	private Integer totalCount;

	private Integer successCount;

	private Integer failedCount;

	private String creationTime;

	private String finishedTime;

	private List<OperationProgress> operationProgressSet;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getTaskId() {
		return this.taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getRegionId() {
		return this.regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public String getTaskAction() {
		return this.taskAction;
	}

	public void setTaskAction(String taskAction) {
		this.taskAction = taskAction;
	}

	public String getTaskStatus() {
		return this.taskStatus;
	}

	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}

	public String getTaskProcess() {
		return this.taskProcess;
	}

	public void setTaskProcess(String taskProcess) {
		this.taskProcess = taskProcess;
	}

	public String getSupportCancel() {
		return this.supportCancel;
	}

	public void setSupportCancel(String supportCancel) {
		this.supportCancel = supportCancel;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getSuccessCount() {
		return this.successCount;
	}

	public void setSuccessCount(Integer successCount) {
		this.successCount = successCount;
	}

	public Integer getFailedCount() {
		return this.failedCount;
	}

	public void setFailedCount(Integer failedCount) {
		this.failedCount = failedCount;
	}

	public String getCreationTime() {
		return this.creationTime;
	}

	public void setCreationTime(String creationTime) {
		this.creationTime = creationTime;
	}

	public String getFinishedTime() {
		return this.finishedTime;
	}

	public void setFinishedTime(String finishedTime) {
		this.finishedTime = finishedTime;
	}

	public List<OperationProgress> getOperationProgressSet() {
		return this.operationProgressSet;
	}

	public void setOperationProgressSet(List<OperationProgress> operationProgressSet) {
		this.operationProgressSet = operationProgressSet;
	}

	public static class OperationProgress {

		private String operationStatus;

		private String errorCode;

		private String errorMsg;

		private List<RelatedItem> relatedItemSet;

		public String getOperationStatus() {
			return this.operationStatus;
		}

		public void setOperationStatus(String operationStatus) {
			this.operationStatus = operationStatus;
		}

		public String getErrorCode() {
			return this.errorCode;
		}

		public void setErrorCode(String errorCode) {
			this.errorCode = errorCode;
		}

		public String getErrorMsg() {
			return this.errorMsg;
		}

		public void setErrorMsg(String errorMsg) {
			this.errorMsg = errorMsg;
		}

		public List<RelatedItem> getRelatedItemSet() {
			return this.relatedItemSet;
		}

		public void setRelatedItemSet(List<RelatedItem> relatedItemSet) {
			this.relatedItemSet = relatedItemSet;
		}

		public static class RelatedItem {

			private String name;

			private String value;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}
		}
	}

	@Override
	public DescribeTaskAttributeResponse getInstance(UnmarshallerContext context) {
		return	DescribeTaskAttributeResponseUnmarshaller.unmarshall(this, context);
	}
}
