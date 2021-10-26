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

package com.aliyuncs.dataworks_public.model.v20200518;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataworks_public.transform.v20200518.GetInstanceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetInstanceResponse extends AcsResponse {

	private Integer httpStatusCode;

	private String requestId;

	private String errorMessage;

	private Boolean success;

	private String errorCode;

	private Data data;

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String status;

		private Long cycTime;

		private Long beginRunningTime;

		private Long finishTime;

		private String errorMessage;

		private Long createTime;

		private Long dagId;

		private Integer priority;

		private String taskType;

		private String paramValues;

		private String connection;

		private Long baselineId;

		private Integer dqcType;

		private String dagType;

		private Long businessId;

		private Integer taskRerunTime;

		private Long modifyTime;

		private Boolean repeatability;

		private Long repeatInterval;

		private Long instanceId;

		private Long beginWaitResTime;

		private Long relatedFlowId;

		private Long bizdate;

		private String nodeName;

		private Long beginWaitTimeTime;

		private String dqcDescription;

		private Long nodeId;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Long getCycTime() {
			return this.cycTime;
		}

		public void setCycTime(Long cycTime) {
			this.cycTime = cycTime;
		}

		public Long getBeginRunningTime() {
			return this.beginRunningTime;
		}

		public void setBeginRunningTime(Long beginRunningTime) {
			this.beginRunningTime = beginRunningTime;
		}

		public Long getFinishTime() {
			return this.finishTime;
		}

		public void setFinishTime(Long finishTime) {
			this.finishTime = finishTime;
		}

		public String getErrorMessage() {
			return this.errorMessage;
		}

		public void setErrorMessage(String errorMessage) {
			this.errorMessage = errorMessage;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public Long getDagId() {
			return this.dagId;
		}

		public void setDagId(Long dagId) {
			this.dagId = dagId;
		}

		public Integer getPriority() {
			return this.priority;
		}

		public void setPriority(Integer priority) {
			this.priority = priority;
		}

		public String getTaskType() {
			return this.taskType;
		}

		public void setTaskType(String taskType) {
			this.taskType = taskType;
		}

		public String getParamValues() {
			return this.paramValues;
		}

		public void setParamValues(String paramValues) {
			this.paramValues = paramValues;
		}

		public String getConnection() {
			return this.connection;
		}

		public void setConnection(String connection) {
			this.connection = connection;
		}

		public Long getBaselineId() {
			return this.baselineId;
		}

		public void setBaselineId(Long baselineId) {
			this.baselineId = baselineId;
		}

		public Integer getDqcType() {
			return this.dqcType;
		}

		public void setDqcType(Integer dqcType) {
			this.dqcType = dqcType;
		}

		public String getDagType() {
			return this.dagType;
		}

		public void setDagType(String dagType) {
			this.dagType = dagType;
		}

		public Long getBusinessId() {
			return this.businessId;
		}

		public void setBusinessId(Long businessId) {
			this.businessId = businessId;
		}

		public Integer getTaskRerunTime() {
			return this.taskRerunTime;
		}

		public void setTaskRerunTime(Integer taskRerunTime) {
			this.taskRerunTime = taskRerunTime;
		}

		public Long getModifyTime() {
			return this.modifyTime;
		}

		public void setModifyTime(Long modifyTime) {
			this.modifyTime = modifyTime;
		}

		public Boolean getRepeatability() {
			return this.repeatability;
		}

		public void setRepeatability(Boolean repeatability) {
			this.repeatability = repeatability;
		}

		public Long getRepeatInterval() {
			return this.repeatInterval;
		}

		public void setRepeatInterval(Long repeatInterval) {
			this.repeatInterval = repeatInterval;
		}

		public Long getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(Long instanceId) {
			this.instanceId = instanceId;
		}

		public Long getBeginWaitResTime() {
			return this.beginWaitResTime;
		}

		public void setBeginWaitResTime(Long beginWaitResTime) {
			this.beginWaitResTime = beginWaitResTime;
		}

		public Long getRelatedFlowId() {
			return this.relatedFlowId;
		}

		public void setRelatedFlowId(Long relatedFlowId) {
			this.relatedFlowId = relatedFlowId;
		}

		public Long getBizdate() {
			return this.bizdate;
		}

		public void setBizdate(Long bizdate) {
			this.bizdate = bizdate;
		}

		public String getNodeName() {
			return this.nodeName;
		}

		public void setNodeName(String nodeName) {
			this.nodeName = nodeName;
		}

		public Long getBeginWaitTimeTime() {
			return this.beginWaitTimeTime;
		}

		public void setBeginWaitTimeTime(Long beginWaitTimeTime) {
			this.beginWaitTimeTime = beginWaitTimeTime;
		}

		public String getDqcDescription() {
			return this.dqcDescription;
		}

		public void setDqcDescription(String dqcDescription) {
			this.dqcDescription = dqcDescription;
		}

		public Long getNodeId() {
			return this.nodeId;
		}

		public void setNodeId(Long nodeId) {
			this.nodeId = nodeId;
		}
	}

	@Override
	public GetInstanceResponse getInstance(UnmarshallerContext context) {
		return	GetInstanceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
