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
public class ListJobGroupsRequest extends RpcAcsRequest<ListJobGroupsResponse> {
	   

	private Boolean asyncQuery;

	private String searchText;

	private Long endTime;

	private Boolean onlyMinConcurrencyEnabled;

	private Long startTime;

	private Integer pageNumber;

	private String instanceId;

	private String jobGroupStatusFilter;

	private Integer pageSize;
	public ListJobGroupsRequest() {
		super("OutboundBot", "2019-12-26", "ListJobGroups", "outboundbot");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getAsyncQuery() {
		return this.asyncQuery;
	}

	public void setAsyncQuery(Boolean asyncQuery) {
		this.asyncQuery = asyncQuery;
		if(asyncQuery != null){
			putQueryParameter("AsyncQuery", asyncQuery.toString());
		}
	}

	public String getSearchText() {
		return this.searchText;
	}

	public void setSearchText(String searchText) {
		this.searchText = searchText;
		if(searchText != null){
			putQueryParameter("SearchText", searchText);
		}
	}

	public Long getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("EndTime", endTime.toString());
		}
	}

	public Boolean getOnlyMinConcurrencyEnabled() {
		return this.onlyMinConcurrencyEnabled;
	}

	public void setOnlyMinConcurrencyEnabled(Boolean onlyMinConcurrencyEnabled) {
		this.onlyMinConcurrencyEnabled = onlyMinConcurrencyEnabled;
		if(onlyMinConcurrencyEnabled != null){
			putQueryParameter("OnlyMinConcurrencyEnabled", onlyMinConcurrencyEnabled.toString());
		}
	}

	public Long getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Long startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime.toString());
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
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

	public String getJobGroupStatusFilter() {
		return this.jobGroupStatusFilter;
	}

	public void setJobGroupStatusFilter(String jobGroupStatusFilter) {
		this.jobGroupStatusFilter = jobGroupStatusFilter;
		if(jobGroupStatusFilter != null){
			putQueryParameter("JobGroupStatusFilter", jobGroupStatusFilter);
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

	@Override
	public Class<ListJobGroupsResponse> getResponseClass() {
		return ListJobGroupsResponse.class;
	}

}
