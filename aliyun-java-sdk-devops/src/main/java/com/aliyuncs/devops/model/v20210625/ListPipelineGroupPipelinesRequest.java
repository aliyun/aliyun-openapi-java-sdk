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
public class ListPipelineGroupPipelinesRequest extends RoaAcsRequest<ListPipelineGroupPipelinesResponse> {
	   

	private String pipelineName;

	private String resultStatusList;

	private Long groupId;

	private Long executeEndTime;

	private Long createStartTime;

	private String organizationId;

	private String nextToken;

	private Long maxResults;

	private Long executeStartTime;

	private Long createEndTime;
	public ListPipelineGroupPipelinesRequest() {
		super("devops", "2021-06-25", "ListPipelineGroupPipelines");
		setUriPattern("/organization/[organizationId]/pipelineGroups/[groupId]/pipelines");
		setMethod(MethodType.GET);
	}

	public String getPipelineName() {
		return this.pipelineName;
	}

	public void setPipelineName(String pipelineName) {
		this.pipelineName = pipelineName;
		if(pipelineName != null){
			putQueryParameter("pipelineName", pipelineName);
		}
	}

	public String getResultStatusList() {
		return this.resultStatusList;
	}

	public void setResultStatusList(String resultStatusList) {
		this.resultStatusList = resultStatusList;
		if(resultStatusList != null){
			putQueryParameter("resultStatusList", resultStatusList);
		}
	}

	public Long getGroupId() {
		return this.groupId;
	}

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
		if(groupId != null){
			putPathParameter("groupId", groupId.toString());
		}
	}

	public Long getExecuteEndTime() {
		return this.executeEndTime;
	}

	public void setExecuteEndTime(Long executeEndTime) {
		this.executeEndTime = executeEndTime;
		if(executeEndTime != null){
			putQueryParameter("executeEndTime", executeEndTime.toString());
		}
	}

	public Long getCreateStartTime() {
		return this.createStartTime;
	}

	public void setCreateStartTime(Long createStartTime) {
		this.createStartTime = createStartTime;
		if(createStartTime != null){
			putQueryParameter("createStartTime", createStartTime.toString());
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

	public Long getExecuteStartTime() {
		return this.executeStartTime;
	}

	public void setExecuteStartTime(Long executeStartTime) {
		this.executeStartTime = executeStartTime;
		if(executeStartTime != null){
			putQueryParameter("executeStartTime", executeStartTime.toString());
		}
	}

	public Long getCreateEndTime() {
		return this.createEndTime;
	}

	public void setCreateEndTime(Long createEndTime) {
		this.createEndTime = createEndTime;
		if(createEndTime != null){
			putQueryParameter("createEndTime", createEndTime.toString());
		}
	}

	@Override
	public Class<ListPipelineGroupPipelinesResponse> getResponseClass() {
		return ListPipelineGroupPipelinesResponse.class;
	}

}
