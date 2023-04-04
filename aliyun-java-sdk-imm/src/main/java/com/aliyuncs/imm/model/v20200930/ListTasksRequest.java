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

package com.aliyuncs.imm.model.v20200930;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.imm.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListTasksRequest extends RpcAcsRequest<ListTasksResponse> {
	   

	@SerializedName("startTimeRange")
	private StartTimeRange startTimeRange;

	private String nextToken;

	private String order;

	private String projectName;

	@SerializedName("taskTypes")
	private List<String> taskTypes;

	@SerializedName("endTimeRange")
	private EndTimeRange endTimeRange;

	private String sort;

	private Long maxResults;

	private String tagSelector;

	private String status;
	public ListTasksRequest() {
		super("imm", "2020-09-30", "ListTasks", "imm");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public StartTimeRange getStartTimeRange() {
		return this.startTimeRange;
	}

	public void setStartTimeRange(StartTimeRange startTimeRange) {
		this.startTimeRange = startTimeRange;	
		if (startTimeRange != null) {
			putQueryParameter("StartTimeRange" , new Gson().toJson(startTimeRange));
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

	public String getOrder() {
		return this.order;
	}

	public void setOrder(String order) {
		this.order = order;
		if(order != null){
			putQueryParameter("Order", order);
		}
	}

	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
		if(projectName != null){
			putQueryParameter("ProjectName", projectName);
		}
	}

	public List<String> getTaskTypes() {
		return this.taskTypes;
	}

	public void setTaskTypes(List<String> taskTypes) {
		this.taskTypes = taskTypes;	
		if (taskTypes != null) {
			putQueryParameter("TaskTypes" , new Gson().toJson(taskTypes));
		}	
	}

	public EndTimeRange getEndTimeRange() {
		return this.endTimeRange;
	}

	public void setEndTimeRange(EndTimeRange endTimeRange) {
		this.endTimeRange = endTimeRange;	
		if (endTimeRange != null) {
			putQueryParameter("EndTimeRange" , new Gson().toJson(endTimeRange));
		}	
	}

	public String getSort() {
		return this.sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
		if(sort != null){
			putQueryParameter("Sort", sort);
		}
	}

	public Long getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Long maxResults) {
		this.maxResults = maxResults;
		if(maxResults != null){
			putQueryParameter("MaxResults", maxResults.toString());
		}
	}

	public String getTagSelector() {
		return this.tagSelector;
	}

	public void setTagSelector(String tagSelector) {
		this.tagSelector = tagSelector;
		if(tagSelector != null){
			putQueryParameter("TagSelector", tagSelector);
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

	public static class StartTimeRange {

		@SerializedName("Start")
		private String start;

		@SerializedName("End")
		private String end;

		public String getStart() {
			return this.start;
		}

		public void setStart(String start) {
			this.start = start;
		}

		public String getEnd() {
			return this.end;
		}

		public void setEnd(String end) {
			this.end = end;
		}
	}

	public static class EndTimeRange {

		@SerializedName("Start")
		private String start;

		@SerializedName("End")
		private String end;

		public String getStart() {
			return this.start;
		}

		public void setStart(String start) {
			this.start = start;
		}

		public String getEnd() {
			return this.end;
		}

		public void setEnd(String end) {
			this.end = end;
		}
	}

	@Override
	public Class<ListTasksResponse> getResponseClass() {
		return ListTasksResponse.class;
	}

}
