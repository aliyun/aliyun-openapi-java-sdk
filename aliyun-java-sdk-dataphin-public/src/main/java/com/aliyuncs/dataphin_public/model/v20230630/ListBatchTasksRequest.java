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

package com.aliyuncs.dataphin_public.model.v20230630;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListBatchTasksRequest extends RpcAcsRequest<ListBatchTasksResponse> {
	   

	private Long opTenantId;

	private String opUserId;

	@SerializedName("batchTaskQuery")
	private BatchTaskQuery batchTaskQuery;
	public ListBatchTasksRequest() {
		super("dataphin-public", "2023-06-30", "ListBatchTasks", "1111");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public Long getOpTenantId() {
		return this.opTenantId;
	}

	public void setOpTenantId(Long opTenantId) {
		this.opTenantId = opTenantId;
		if(opTenantId != null){
			putQueryParameter("OpTenantId", opTenantId.toString());
		}
	}

	public String getOpUserId() {
		return this.opUserId;
	}

	public void setOpUserId(String opUserId) {
		this.opUserId = opUserId;
		if(opUserId != null){
			putQueryParameter("OpUserId", opUserId);
		}
	}

	public BatchTaskQuery getBatchTaskQuery() {
		return this.batchTaskQuery;
	}

	public void setBatchTaskQuery(BatchTaskQuery batchTaskQuery) {
		this.batchTaskQuery = batchTaskQuery;	
		if (batchTaskQuery != null) {
			putBodyParameter("BatchTaskQuery" , new Gson().toJson(batchTaskQuery));
		}	
	}

	public static class BatchTaskQuery {

		@SerializedName("ScheduleIntervalTypeList")
		private List<String> scheduleIntervalTypeList;

		@SerializedName("TaskTypeList")
		private List<Integer> taskTypeList;

		@SerializedName("OutputTableNameList")
		private List<String> outputTableNameList;

		@SerializedName("ModifiedEndTime")
		private Long modifiedEndTime;

		@SerializedName("TaskStatusList")
		private List<Integer> taskStatusList;

		@SerializedName("ConditionScheduleEnable")
		private Boolean conditionScheduleEnable;

		@SerializedName("Published")
		private Boolean published;

		@SerializedName("CreateBeginTime")
		private Long createBeginTime;

		@SerializedName("IncludeSubDirectory")
		private Boolean includeSubDirectory;

		@SerializedName("LockUserList")
		private List<String> lockUserList;

		@SerializedName("TaskTagList")
		private List<String> taskTagList;

		@SerializedName("OpsOwnerList")
		private List<String> opsOwnerList;

		@SerializedName("ModifiedBeginTime")
		private Long modifiedBeginTime;

		@SerializedName("DevelopOwnerList")
		private List<String> developOwnerList;

		@SerializedName("PageSize")
		private Integer pageSize;

		@SerializedName("LastSubmitStatusList")
		private List<String> lastSubmitStatusList;

		@SerializedName("DirectoryList")
		private List<String> directoryList;

		@SerializedName("Page")
		private Integer page;

		@SerializedName("Keyword")
		private String keyword;

		@SerializedName("NodeStatusList")
		private List<Integer> nodeStatusList;

		@SerializedName("CreateEndTime")
		private Long createEndTime;

		@SerializedName("ProjectId")
		private Long projectId;

		@SerializedName("RefCodeTemplateId")
		private String refCodeTemplateId;

		public List<String> getScheduleIntervalTypeList() {
			return this.scheduleIntervalTypeList;
		}

		public void setScheduleIntervalTypeList(List<String> scheduleIntervalTypeList) {
			this.scheduleIntervalTypeList = scheduleIntervalTypeList;
		}

		public List<Integer> getTaskTypeList() {
			return this.taskTypeList;
		}

		public void setTaskTypeList(List<Integer> taskTypeList) {
			this.taskTypeList = taskTypeList;
		}

		public List<String> getOutputTableNameList() {
			return this.outputTableNameList;
		}

		public void setOutputTableNameList(List<String> outputTableNameList) {
			this.outputTableNameList = outputTableNameList;
		}

		public Long getModifiedEndTime() {
			return this.modifiedEndTime;
		}

		public void setModifiedEndTime(Long modifiedEndTime) {
			this.modifiedEndTime = modifiedEndTime;
		}

		public List<Integer> getTaskStatusList() {
			return this.taskStatusList;
		}

		public void setTaskStatusList(List<Integer> taskStatusList) {
			this.taskStatusList = taskStatusList;
		}

		public Boolean getConditionScheduleEnable() {
			return this.conditionScheduleEnable;
		}

		public void setConditionScheduleEnable(Boolean conditionScheduleEnable) {
			this.conditionScheduleEnable = conditionScheduleEnable;
		}

		public Boolean getPublished() {
			return this.published;
		}

		public void setPublished(Boolean published) {
			this.published = published;
		}

		public Long getCreateBeginTime() {
			return this.createBeginTime;
		}

		public void setCreateBeginTime(Long createBeginTime) {
			this.createBeginTime = createBeginTime;
		}

		public Boolean getIncludeSubDirectory() {
			return this.includeSubDirectory;
		}

		public void setIncludeSubDirectory(Boolean includeSubDirectory) {
			this.includeSubDirectory = includeSubDirectory;
		}

		public List<String> getLockUserList() {
			return this.lockUserList;
		}

		public void setLockUserList(List<String> lockUserList) {
			this.lockUserList = lockUserList;
		}

		public List<String> getTaskTagList() {
			return this.taskTagList;
		}

		public void setTaskTagList(List<String> taskTagList) {
			this.taskTagList = taskTagList;
		}

		public List<String> getOpsOwnerList() {
			return this.opsOwnerList;
		}

		public void setOpsOwnerList(List<String> opsOwnerList) {
			this.opsOwnerList = opsOwnerList;
		}

		public Long getModifiedBeginTime() {
			return this.modifiedBeginTime;
		}

		public void setModifiedBeginTime(Long modifiedBeginTime) {
			this.modifiedBeginTime = modifiedBeginTime;
		}

		public List<String> getDevelopOwnerList() {
			return this.developOwnerList;
		}

		public void setDevelopOwnerList(List<String> developOwnerList) {
			this.developOwnerList = developOwnerList;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public List<String> getLastSubmitStatusList() {
			return this.lastSubmitStatusList;
		}

		public void setLastSubmitStatusList(List<String> lastSubmitStatusList) {
			this.lastSubmitStatusList = lastSubmitStatusList;
		}

		public List<String> getDirectoryList() {
			return this.directoryList;
		}

		public void setDirectoryList(List<String> directoryList) {
			this.directoryList = directoryList;
		}

		public Integer getPage() {
			return this.page;
		}

		public void setPage(Integer page) {
			this.page = page;
		}

		public String getKeyword() {
			return this.keyword;
		}

		public void setKeyword(String keyword) {
			this.keyword = keyword;
		}

		public List<Integer> getNodeStatusList() {
			return this.nodeStatusList;
		}

		public void setNodeStatusList(List<Integer> nodeStatusList) {
			this.nodeStatusList = nodeStatusList;
		}

		public Long getCreateEndTime() {
			return this.createEndTime;
		}

		public void setCreateEndTime(Long createEndTime) {
			this.createEndTime = createEndTime;
		}

		public Long getProjectId() {
			return this.projectId;
		}

		public void setProjectId(Long projectId) {
			this.projectId = projectId;
		}

		public String getRefCodeTemplateId() {
			return this.refCodeTemplateId;
		}

		public void setRefCodeTemplateId(String refCodeTemplateId) {
			this.refCodeTemplateId = refCodeTemplateId;
		}
	}

	@Override
	public Class<ListBatchTasksResponse> getResponseClass() {
		return ListBatchTasksResponse.class;
	}

}
