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

package com.aliyuncs.dms_enterprise.model.v20181101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dms_enterprise.transform.v20181101.ListTaskFlowsByPageResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListTaskFlowsByPageResponse extends AcsResponse {

	private String requestId;

	private String errorCode;

	private String errorMessage;

	private Boolean success;

	private Integer totalCount;

	private List<TaskFlow> taskFlowList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
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

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<TaskFlow> getTaskFlowList() {
		return this.taskFlowList;
	}

	public void setTaskFlowList(List<TaskFlow> taskFlowList) {
		this.taskFlowList = taskFlowList;
	}

	public static class TaskFlow {

		private Long id;

		private String dagName;

		private String description;

		private String creatorId;

		private String creatorNickName;

		private String dagOwnerNickName;

		private Long deployId;

		private Integer status;

		private Integer latestInstanceStatus;

		private String latestInstanceTime;

		private String scenarioId;

		private Boolean cronSwitch;

		private String cronStr;

		private String scheduleParam;

		private Integer triggerType;

		private Integer cronType;

		private String cronBeginDate;

		private String cronEndDate;

		private String timeZoneId;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getDagName() {
			return this.dagName;
		}

		public void setDagName(String dagName) {
			this.dagName = dagName;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getCreatorId() {
			return this.creatorId;
		}

		public void setCreatorId(String creatorId) {
			this.creatorId = creatorId;
		}

		public String getCreatorNickName() {
			return this.creatorNickName;
		}

		public void setCreatorNickName(String creatorNickName) {
			this.creatorNickName = creatorNickName;
		}

		public String getDagOwnerNickName() {
			return this.dagOwnerNickName;
		}

		public void setDagOwnerNickName(String dagOwnerNickName) {
			this.dagOwnerNickName = dagOwnerNickName;
		}

		public Long getDeployId() {
			return this.deployId;
		}

		public void setDeployId(Long deployId) {
			this.deployId = deployId;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public Integer getLatestInstanceStatus() {
			return this.latestInstanceStatus;
		}

		public void setLatestInstanceStatus(Integer latestInstanceStatus) {
			this.latestInstanceStatus = latestInstanceStatus;
		}

		public String getLatestInstanceTime() {
			return this.latestInstanceTime;
		}

		public void setLatestInstanceTime(String latestInstanceTime) {
			this.latestInstanceTime = latestInstanceTime;
		}

		public String getScenarioId() {
			return this.scenarioId;
		}

		public void setScenarioId(String scenarioId) {
			this.scenarioId = scenarioId;
		}

		public Boolean getCronSwitch() {
			return this.cronSwitch;
		}

		public void setCronSwitch(Boolean cronSwitch) {
			this.cronSwitch = cronSwitch;
		}

		public String getCronStr() {
			return this.cronStr;
		}

		public void setCronStr(String cronStr) {
			this.cronStr = cronStr;
		}

		public String getScheduleParam() {
			return this.scheduleParam;
		}

		public void setScheduleParam(String scheduleParam) {
			this.scheduleParam = scheduleParam;
		}

		public Integer getTriggerType() {
			return this.triggerType;
		}

		public void setTriggerType(Integer triggerType) {
			this.triggerType = triggerType;
		}

		public Integer getCronType() {
			return this.cronType;
		}

		public void setCronType(Integer cronType) {
			this.cronType = cronType;
		}

		public String getCronBeginDate() {
			return this.cronBeginDate;
		}

		public void setCronBeginDate(String cronBeginDate) {
			this.cronBeginDate = cronBeginDate;
		}

		public String getCronEndDate() {
			return this.cronEndDate;
		}

		public void setCronEndDate(String cronEndDate) {
			this.cronEndDate = cronEndDate;
		}

		public String getTimeZoneId() {
			return this.timeZoneId;
		}

		public void setTimeZoneId(String timeZoneId) {
			this.timeZoneId = timeZoneId;
		}
	}

	@Override
	public ListTaskFlowsByPageResponse getInstance(UnmarshallerContext context) {
		return	ListTaskFlowsByPageResponseUnmarshaller.unmarshall(this, context);
	}
}
