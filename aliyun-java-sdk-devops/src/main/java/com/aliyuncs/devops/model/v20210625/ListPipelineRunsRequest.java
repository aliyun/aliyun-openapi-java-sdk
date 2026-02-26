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

package com.aliyuncs.devops.model.v20210625;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListPipelineRunsRequest extends RoaAcsRequest<ListPipelineRunsResponse> {
	   

	private Long endTime;

	private Long startTime;

	private Long pipelineId;

	private Integer triggerMode;

	private String organizationId;

	private String nextToken;

	private Long maxResults;

	private String status;
	public ListPipelineRunsRequest() {
		super("devops", "2021-06-25", "ListPipelineRuns");
		setUriPattern("/organization/[organizationId]/pipelines/[pipelineId]/pipelineRuns");
		setMethod(MethodType.GET);
	}

	public Long getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("endTime", endTime.toString());
		}
	}

	public Long getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Long startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("startTime", startTime.toString());
		}
	}

	public Long getPipelineId() {
		return this.pipelineId;
	}

	public void setPipelineId(Long pipelineId) {
		this.pipelineId = pipelineId;
		if(pipelineId != null){
			putPathParameter("pipelineId", pipelineId.toString());
		}
	}

	public Integer getTriggerMode() {
		return this.triggerMode;
	}

	public void setTriggerMode(Integer triggerMode) {
		this.triggerMode = triggerMode;
		if(triggerMode != null){
			putQueryParameter("triggerMode", triggerMode.toString());
		}
	}

	public String getOrganizationId() {
		return this.organizationId;
	}

	public void setOrganizationId(String organizationId) {
		this.organizationId = organizationId;
		if(organizationId != null){
			putPathParameter("organizationId", organizationId);
		}
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
		if(nextToken != null){
			putQueryParameter("nextToken", nextToken);
		}
	}

	public Long getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Long maxResults) {
		this.maxResults = maxResults;
		if(maxResults != null){
			putQueryParameter("maxResults", maxResults.toString());
		}
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putQueryParameter("status", status);
		}
	}

	@Override
	public Class<ListPipelineRunsResponse> getResponseClass() {
		return ListPipelineRunsResponse.class;
	}

}
