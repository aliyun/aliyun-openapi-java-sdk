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
public class QueryJobsWithResultRequest extends RpcAcsRequest<QueryJobsWithResultResponse> {
	   

	private Boolean hasReachedEndOfFlowFilter;

	private Boolean hasAnsweredFilter;

	private Integer pageNumber;

	private String queryText;

	private Boolean hasHangUpByRejectionFilter;

	private String instanceId;

	private String jobStatusFilter;

	private Integer pageSize;

	private String jobGroupId;
	public QueryJobsWithResultRequest() {
		super("OutboundBot", "2019-12-26", "QueryJobsWithResult", "outboundbot");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getHasReachedEndOfFlowFilter() {
		return this.hasReachedEndOfFlowFilter;
	}

	public void setHasReachedEndOfFlowFilter(Boolean hasReachedEndOfFlowFilter) {
		this.hasReachedEndOfFlowFilter = hasReachedEndOfFlowFilter;
		if(hasReachedEndOfFlowFilter != null){
			putQueryParameter("HasReachedEndOfFlowFilter", hasReachedEndOfFlowFilter.toString());
		}
	}

	public Boolean getHasAnsweredFilter() {
		return this.hasAnsweredFilter;
	}

	public void setHasAnsweredFilter(Boolean hasAnsweredFilter) {
		this.hasAnsweredFilter = hasAnsweredFilter;
		if(hasAnsweredFilter != null){
			putQueryParameter("HasAnsweredFilter", hasAnsweredFilter.toString());
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

	public String getQueryText() {
		return this.queryText;
	}

	public void setQueryText(String queryText) {
		this.queryText = queryText;
		if(queryText != null){
			putQueryParameter("QueryText", queryText);
		}
	}

	public Boolean getHasHangUpByRejectionFilter() {
		return this.hasHangUpByRejectionFilter;
	}

	public void setHasHangUpByRejectionFilter(Boolean hasHangUpByRejectionFilter) {
		this.hasHangUpByRejectionFilter = hasHangUpByRejectionFilter;
		if(hasHangUpByRejectionFilter != null){
			putQueryParameter("HasHangUpByRejectionFilter", hasHangUpByRejectionFilter.toString());
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

	public String getJobStatusFilter() {
		return this.jobStatusFilter;
	}

	public void setJobStatusFilter(String jobStatusFilter) {
		this.jobStatusFilter = jobStatusFilter;
		if(jobStatusFilter != null){
			putQueryParameter("JobStatusFilter", jobStatusFilter);
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

	public String getJobGroupId() {
		return this.jobGroupId;
	}

	public void setJobGroupId(String jobGroupId) {
		this.jobGroupId = jobGroupId;
		if(jobGroupId != null){
			putQueryParameter("JobGroupId", jobGroupId);
		}
	}

	@Override
	public Class<QueryJobsWithResultResponse> getResponseClass() {
		return QueryJobsWithResultResponse.class;
	}

}
