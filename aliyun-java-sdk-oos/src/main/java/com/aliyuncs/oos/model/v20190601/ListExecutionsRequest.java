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
import java.util.Map;
import com.google.gson.Gson;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListExecutionsRequest extends RpcAcsRequest<ListExecutionsResponse> {
	   

	private String executedBy;

	private Boolean includeChildExecution;

	private String mode;

	private String executionId;

	private String ramRole;

	private String nextToken;

	private String templateName;

	private String endDateBefore;

	private String sortOrder;

	private String startDateAfter;

	private String startDateBefore;

	private Map<Object,Object> tags;

	private String parentExecutionId;

	private String endDateAfter;

	private Integer maxResults;

	private String sortField;

	private String category;

	private String status;
	public ListExecutionsRequest() {
		super("oos", "2019-06-01", "ListExecutions", "oos");
		setMethod(MethodType.POST);
	}

	public String getExecutedBy() {
		return this.executedBy;
	}

	public void setExecutedBy(String executedBy) {
		this.executedBy = executedBy;
		if(executedBy != null){
			putQueryParameter("ExecutedBy", executedBy);
		}
	}

	public Boolean getIncludeChildExecution() {
		return this.includeChildExecution;
	}

	public void setIncludeChildExecution(Boolean includeChildExecution) {
		this.includeChildExecution = includeChildExecution;
		if(includeChildExecution != null){
			putQueryParameter("IncludeChildExecution", includeChildExecution.toString());
		}
	}

	public String getMode() {
		return this.mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
		if(mode != null){
			putQueryParameter("Mode", mode);
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

	public String getRamRole() {
		return this.ramRole;
	}

	public void setRamRole(String ramRole) {
		this.ramRole = ramRole;
		if(ramRole != null){
			putQueryParameter("RamRole", ramRole);
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

	public String getTemplateName() {
		return this.templateName;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
		if(templateName != null){
			putQueryParameter("TemplateName", templateName);
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

	public Map<Object,Object> getTags() {
		return this.tags;
	}

	public void setTags(Map<Object,Object> tags) {
		this.tags = tags;
		if(tags != null){
			putQueryParameter("Tags", new Gson().toJson(tags));
		}
	}

	public String getParentExecutionId() {
		return this.parentExecutionId;
	}

	public void setParentExecutionId(String parentExecutionId) {
		this.parentExecutionId = parentExecutionId;
		if(parentExecutionId != null){
			putQueryParameter("ParentExecutionId", parentExecutionId);
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

	public String getSortField() {
		return this.sortField;
	}

	public void setSortField(String sortField) {
		this.sortField = sortField;
		if(sortField != null){
			putQueryParameter("SortField", sortField);
		}
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
		if(category != null){
			putQueryParameter("Category", category);
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
	public Class<ListExecutionsResponse> getResponseClass() {
		return ListExecutionsResponse.class;
	}

}
