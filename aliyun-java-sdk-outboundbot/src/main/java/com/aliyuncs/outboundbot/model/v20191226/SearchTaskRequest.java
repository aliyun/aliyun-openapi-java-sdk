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

package com.aliyuncs.outboundbot.model.v20191226;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.outboundbot.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SearchTaskRequest extends RpcAcsRequest<SearchTaskResponse> {
	   

	private Long actualTimeLte;

	private String otherId;

	private Long taskCreateTimeLte;

	private String jobId;

	private Long taskCreateTimeGte;

	private String calledNumber;

	private String userIdMatch;

	private Integer pageSize;

	private String scriptNameQuery;

	private Integer pageIndex;

	private String sortOrder;

	private String taskStatusStringList;

	private String jobGroupNameQuery;

	private String taskId;

	private String instanceId;

	private Long recordingDurationGte;

	private Long callDurationLte;

	private String jobGroupId;

	private String sortBy;

	private String jobStatusStringList;

	private Long actualTimeGte;

	private Long callDurationGte;

	private Long recordingDurationLte;
	public SearchTaskRequest() {
		super("OutboundBot", "2019-12-26", "SearchTask");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getActualTimeLte() {
		return this.actualTimeLte;
	}

	public void setActualTimeLte(Long actualTimeLte) {
		this.actualTimeLte = actualTimeLte;
		if(actualTimeLte != null){
			putQueryParameter("ActualTimeLte", actualTimeLte.toString());
		}
	}

	public String getOtherId() {
		return this.otherId;
	}

	public void setOtherId(String otherId) {
		this.otherId = otherId;
		if(otherId != null){
			putQueryParameter("OtherId", otherId);
		}
	}

	public Long getTaskCreateTimeLte() {
		return this.taskCreateTimeLte;
	}

	public void setTaskCreateTimeLte(Long taskCreateTimeLte) {
		this.taskCreateTimeLte = taskCreateTimeLte;
		if(taskCreateTimeLte != null){
			putQueryParameter("TaskCreateTimeLte", taskCreateTimeLte.toString());
		}
	}

	public String getJobId() {
		return this.jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
		if(jobId != null){
			putQueryParameter("JobId", jobId);
		}
	}

	public Long getTaskCreateTimeGte() {
		return this.taskCreateTimeGte;
	}

	public void setTaskCreateTimeGte(Long taskCreateTimeGte) {
		this.taskCreateTimeGte = taskCreateTimeGte;
		if(taskCreateTimeGte != null){
			putQueryParameter("TaskCreateTimeGte", taskCreateTimeGte.toString());
		}
	}

	public String getCalledNumber() {
		return this.calledNumber;
	}

	public void setCalledNumber(String calledNumber) {
		this.calledNumber = calledNumber;
		if(calledNumber != null){
			putQueryParameter("CalledNumber", calledNumber);
		}
	}

	public String getUserIdMatch() {
		return this.userIdMatch;
	}

	public void setUserIdMatch(String userIdMatch) {
		this.userIdMatch = userIdMatch;
		if(userIdMatch != null){
			putQueryParameter("UserIdMatch", userIdMatch);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getScriptNameQuery() {
		return this.scriptNameQuery;
	}

	public void setScriptNameQuery(String scriptNameQuery) {
		this.scriptNameQuery = scriptNameQuery;
		if(scriptNameQuery != null){
			putQueryParameter("ScriptNameQuery", scriptNameQuery);
		}
	}

	public Integer getPageIndex() {
		return this.pageIndex;
	}

	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
		if(pageIndex != null){
			putQueryParameter("PageIndex", pageIndex.toString());
		}
	}

	public String getSortOrder() {
		return this.sortOrder;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
		if(sortOrder != null){
			putQueryParameter("SortOrder", sortOrder);
		}
	}

	public String getTaskStatusStringList() {
		return this.taskStatusStringList;
	}

	public void setTaskStatusStringList(String taskStatusStringList) {
		this.taskStatusStringList = taskStatusStringList;
		if(taskStatusStringList != null){
			putQueryParameter("TaskStatusStringList", taskStatusStringList);
		}
	}

	public String getJobGroupNameQuery() {
		return this.jobGroupNameQuery;
	}

	public void setJobGroupNameQuery(String jobGroupNameQuery) {
		this.jobGroupNameQuery = jobGroupNameQuery;
		if(jobGroupNameQuery != null){
			putQueryParameter("JobGroupNameQuery", jobGroupNameQuery);
		}
	}

	public String getTaskId() {
		return this.taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
		if(taskId != null){
			putQueryParameter("TaskId", taskId);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public Long getRecordingDurationGte() {
		return this.recordingDurationGte;
	}

	public void setRecordingDurationGte(Long recordingDurationGte) {
		this.recordingDurationGte = recordingDurationGte;
		if(recordingDurationGte != null){
			putQueryParameter("RecordingDurationGte", recordingDurationGte.toString());
		}
	}

	public Long getCallDurationLte() {
		return this.callDurationLte;
	}

	public void setCallDurationLte(Long callDurationLte) {
		this.callDurationLte = callDurationLte;
		if(callDurationLte != null){
			putQueryParameter("CallDurationLte", callDurationLte.toString());
		}
	}

	public String getJobGroupId() {
		return this.jobGroupId;
	}

	public void setJobGroupId(String jobGroupId) {
		this.jobGroupId = jobGroupId;
		if(jobGroupId != null){
			putQueryParameter("JobGroupId", jobGroupId);
		}
	}

	public String getSortBy() {
		return this.sortBy;
	}

	public void setSortBy(String sortBy) {
		this.sortBy = sortBy;
		if(sortBy != null){
			putQueryParameter("SortBy", sortBy);
		}
	}

	public String getJobStatusStringList() {
		return this.jobStatusStringList;
	}

	public void setJobStatusStringList(String jobStatusStringList) {
		this.jobStatusStringList = jobStatusStringList;
		if(jobStatusStringList != null){
			putQueryParameter("JobStatusStringList", jobStatusStringList);
		}
	}

	public Long getActualTimeGte() {
		return this.actualTimeGte;
	}

	public void setActualTimeGte(Long actualTimeGte) {
		this.actualTimeGte = actualTimeGte;
		if(actualTimeGte != null){
			putQueryParameter("ActualTimeGte", actualTimeGte.toString());
		}
	}

	public Long getCallDurationGte() {
		return this.callDurationGte;
	}

	public void setCallDurationGte(Long callDurationGte) {
		this.callDurationGte = callDurationGte;
		if(callDurationGte != null){
			putQueryParameter("CallDurationGte", callDurationGte.toString());
		}
	}

	public Long getRecordingDurationLte() {
		return this.recordingDurationLte;
	}

	public void setRecordingDurationLte(Long recordingDurationLte) {
		this.recordingDurationLte = recordingDurationLte;
		if(recordingDurationLte != null){
			putQueryParameter("RecordingDurationLte", recordingDurationLte.toString());
		}
	}

	@Override
	public Class<SearchTaskResponse> getResponseClass() {
		return SearchTaskResponse.class;
	}

}
