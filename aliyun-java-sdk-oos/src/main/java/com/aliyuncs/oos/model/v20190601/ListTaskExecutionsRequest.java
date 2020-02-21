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

package com.aliyuncs.oos.model.v20190601;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListTaskExecutionsRequest extends RpcAcsRequest<ListTaskExecutionsResponse> {
	   

	private String taskName;

	private Boolean includeChildTaskExecution;

	private String executionId;

	private String parentTaskExecutionId;

	private String nextToken;

	private String endDateBefore;

	private String sortOrder;

	private String startDateAfter;

	private String startDateBefore;

	private String endDateAfter;

	private Integer maxResults;

	private String taskExecutionId;

	private String sortField;

	private String taskAction;

	private String status;
	public ListTaskExecutionsRequest() {
		super("oos", "2019-06-01", "ListTaskExecutions", "oos");
		setMethod(MethodType.POST);
	}

	public String getTaskName() {
		return this.taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
		if(taskName != null){
			putQueryParameter("TaskName", taskName);
		}
	}

	public Boolean getIncludeChildTaskExecution() {
		return this.includeChildTaskExecution;
	}

	public void setIncludeChildTaskExecution(Boolean includeChildTaskExecution) {
		this.includeChildTaskExecution = includeChildTaskExecution;
		if(includeChildTaskExecution != null){
			putQueryParameter("IncludeChildTaskExecution", includeChildTaskExecution.toString());
		}
	}

	public String getExecutionId() {
		return this.executionId;
	}

	public void setExecutionId(String executionId) {
		this.executionId = executionId;
		if(executionId != null){
			putQueryParameter("ExecutionId", executionId);
		}
	}

	public String getParentTaskExecutionId() {
		return this.parentTaskExecutionId;
	}

	public void setParentTaskExecutionId(String parentTaskExecutionId) {
		this.parentTaskExecutionId = parentTaskExecutionId;
		if(parentTaskExecutionId != null){
			putQueryParameter("ParentTaskExecutionId", parentTaskExecutionId);
		}
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
		if(nextToken != null){
			putQueryParameter("NextToken", nextToken);
		}
	}

	public String getEndDateBefore() {
		return this.endDateBefore;
	}

	public void setEndDateBefore(String endDateBefore) {
		this.endDateBefore = endDateBefore;
		if(endDateBefore != null){
			putQueryParameter("EndDateBefore", endDateBefore);
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

	public String getStartDateAfter() {
		return this.startDateAfter;
	}

	public void setStartDateAfter(String startDateAfter) {
		this.startDateAfter = startDateAfter;
		if(startDateAfter != null){
			putQueryParameter("StartDateAfter", startDateAfter);
		}
	}

	public String getStartDateBefore() {
		return this.startDateBefore;
	}

	public void setStartDateBefore(String startDateBefore) {
		this.startDateBefore = startDateBefore;
		if(startDateBefore != null){
			putQueryParameter("StartDateBefore", startDateBefore);
		}
	}

	public String getEndDateAfter() {
		return this.endDateAfter;
	}

	public void setEndDateAfter(String endDateAfter) {
		this.endDateAfter = endDateAfter;
		if(endDateAfter != null){
			putQueryParameter("EndDateAfter", endDateAfter);
		}
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
		if(maxResults != null){
			putQueryParameter("MaxResults", maxResults.toString());
		}
	}

	public String getTaskExecutionId() {
		return this.taskExecutionId;
	}

	public void setTaskExecutionId(String taskExecutionId) {
		this.taskExecutionId = taskExecutionId;
		if(taskExecutionId != null){
			putQueryParameter("TaskExecutionId", taskExecutionId);
		}
	}

	public String getSortField() {
		return this.sortField;
	}

	public void setSortField(String sortField) {
		this.sortField = sortField;
		if(sortField != null){
			putQueryParameter("SortField", sortField);
		}
	}

	public String getTaskAction() {
		return this.taskAction;
	}

	public void setTaskAction(String taskAction) {
		this.taskAction = taskAction;
		if(taskAction != null){
			putQueryParameter("TaskAction", taskAction);
		}
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status);
		}
	}

	@Override
	public Class<ListTaskExecutionsResponse> getResponseClass() {
		return ListTaskExecutionsResponse.class;
	}

}
