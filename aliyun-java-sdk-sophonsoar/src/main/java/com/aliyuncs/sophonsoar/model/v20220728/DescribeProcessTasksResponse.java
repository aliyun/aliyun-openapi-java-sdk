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

package com.aliyuncs.sophonsoar.model.v20220728;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sophonsoar.transform.v20220728.DescribeProcessTasksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeProcessTasksResponse extends AcsResponse {

	private String requestId;

	private List<Data> processTasks;

	private Page page;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Data> getProcessTasks() {
		return this.processTasks;
	}

	public void setProcessTasks(List<Data> processTasks) {
		this.processTasks = processTasks;
	}

	public Page getPage() {
		return this.page;
	}

	public void setPage(Page page) {
		this.page = page;
	}

	public static class Data {

		private String taskId;

		private String creator;

		private Long gmtCreateMillis;

		private Long gmtModifiedMillis;

		private String taskName;

		private String yunCode;

		private String entityName;

		private String entityType;

		private String entityValue;

		private String entityKey;

		private Integer taskStatus;

		private String scope;

		private String inputParams;

		private String sceneCode;

		private String sceneName;

		private Long processTime;

		private Long removeTime;

		private String processStrategyUuid;

		private String tenantId;

		private String source;

		private Integer removeFlag;

		private Integer retryFlag;

		private String errCode;

		private String errMsg;

		private String errTip;

		private String entityUuid;

		private String eventUuid;

		private String reqUuid;

		private String triggerSource;

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}

		public String getCreator() {
			return this.creator;
		}

		public void setCreator(String creator) {
			this.creator = creator;
		}

		public Long getGmtCreateMillis() {
			return this.gmtCreateMillis;
		}

		public void setGmtCreateMillis(Long gmtCreateMillis) {
			this.gmtCreateMillis = gmtCreateMillis;
		}

		public Long getGmtModifiedMillis() {
			return this.gmtModifiedMillis;
		}

		public void setGmtModifiedMillis(Long gmtModifiedMillis) {
			this.gmtModifiedMillis = gmtModifiedMillis;
		}

		public String getTaskName() {
			return this.taskName;
		}

		public void setTaskName(String taskName) {
			this.taskName = taskName;
		}

		public String getYunCode() {
			return this.yunCode;
		}

		public void setYunCode(String yunCode) {
			this.yunCode = yunCode;
		}

		public String getEntityName() {
			return this.entityName;
		}

		public void setEntityName(String entityName) {
			this.entityName = entityName;
		}

		public String getEntityType() {
			return this.entityType;
		}

		public void setEntityType(String entityType) {
			this.entityType = entityType;
		}

		public String getEntityValue() {
			return this.entityValue;
		}

		public void setEntityValue(String entityValue) {
			this.entityValue = entityValue;
		}

		public String getEntityKey() {
			return this.entityKey;
		}

		public void setEntityKey(String entityKey) {
			this.entityKey = entityKey;
		}

		public Integer getTaskStatus() {
			return this.taskStatus;
		}

		public void setTaskStatus(Integer taskStatus) {
			this.taskStatus = taskStatus;
		}

		public String getScope() {
			return this.scope;
		}

		public void setScope(String scope) {
			this.scope = scope;
		}

		public String getInputParams() {
			return this.inputParams;
		}

		public void setInputParams(String inputParams) {
			this.inputParams = inputParams;
		}

		public String getSceneCode() {
			return this.sceneCode;
		}

		public void setSceneCode(String sceneCode) {
			this.sceneCode = sceneCode;
		}

		public String getSceneName() {
			return this.sceneName;
		}

		public void setSceneName(String sceneName) {
			this.sceneName = sceneName;
		}

		public Long getProcessTime() {
			return this.processTime;
		}

		public void setProcessTime(Long processTime) {
			this.processTime = processTime;
		}

		public Long getRemoveTime() {
			return this.removeTime;
		}

		public void setRemoveTime(Long removeTime) {
			this.removeTime = removeTime;
		}

		public String getProcessStrategyUuid() {
			return this.processStrategyUuid;
		}

		public void setProcessStrategyUuid(String processStrategyUuid) {
			this.processStrategyUuid = processStrategyUuid;
		}

		public String getTenantId() {
			return this.tenantId;
		}

		public void setTenantId(String tenantId) {
			this.tenantId = tenantId;
		}

		public String getSource() {
			return this.source;
		}

		public void setSource(String source) {
			this.source = source;
		}

		public Integer getRemoveFlag() {
			return this.removeFlag;
		}

		public void setRemoveFlag(Integer removeFlag) {
			this.removeFlag = removeFlag;
		}

		public Integer getRetryFlag() {
			return this.retryFlag;
		}

		public void setRetryFlag(Integer retryFlag) {
			this.retryFlag = retryFlag;
		}

		public String getErrCode() {
			return this.errCode;
		}

		public void setErrCode(String errCode) {
			this.errCode = errCode;
		}

		public String getErrMsg() {
			return this.errMsg;
		}

		public void setErrMsg(String errMsg) {
			this.errMsg = errMsg;
		}

		public String getErrTip() {
			return this.errTip;
		}

		public void setErrTip(String errTip) {
			this.errTip = errTip;
		}

		public String getEntityUuid() {
			return this.entityUuid;
		}

		public void setEntityUuid(String entityUuid) {
			this.entityUuid = entityUuid;
		}

		public String getEventUuid() {
			return this.eventUuid;
		}

		public void setEventUuid(String eventUuid) {
			this.eventUuid = eventUuid;
		}

		public String getReqUuid() {
			return this.reqUuid;
		}

		public void setReqUuid(String reqUuid) {
			this.reqUuid = reqUuid;
		}

		public String getTriggerSource() {
			return this.triggerSource;
		}

		public void setTriggerSource(String triggerSource) {
			this.triggerSource = triggerSource;
		}
	}

	public static class Page {

		private Integer totalCount;

		private Integer pageNumber;

		private Integer pageSize;

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
	}

	@Override
	public DescribeProcessTasksResponse getInstance(UnmarshallerContext context) {
		return	DescribeProcessTasksResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
