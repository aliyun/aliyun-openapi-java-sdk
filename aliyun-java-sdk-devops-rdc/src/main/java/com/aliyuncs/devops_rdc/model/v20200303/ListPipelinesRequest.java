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

package com.aliyuncs.devops_rdc.model.v20200303;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListPipelinesRequest extends RpcAcsRequest<ListPipelinesResponse> {
	   

	private String pipelineName;

	private String resultStatusList;

	private String creators;

	private String executeEndTime;

	private String userPk;

	private String orgId;

	private String createStartTime;

	private String operators;

	private Integer pageSize;

	private String executeStartTime;

	private Integer pageStart;

	private String createEndTime;
	public ListPipelinesRequest() {
		super("devops-rdc", "2020-03-03", "ListPipelines", "1.9.6");
		setMethod(MethodType.POST);
	}

	public String getPipelineName() {
		return this.pipelineName;
	}

	public void setPipelineName(String pipelineName) {
		this.pipelineName = pipelineName;
		if(pipelineName != null){
			putBodyParameter("PipelineName", pipelineName);
		}
	}

	public String getResultStatusList() {
		return this.resultStatusList;
	}

	public void setResultStatusList(String resultStatusList) {
		this.resultStatusList = resultStatusList;
		if(resultStatusList != null){
			putBodyParameter("ResultStatusList", resultStatusList);
		}
	}

	public String getCreators() {
		return this.creators;
	}

	public void setCreators(String creators) {
		this.creators = creators;
		if(creators != null){
			putBodyParameter("Creators", creators);
		}
	}

	public String getExecuteEndTime() {
		return this.executeEndTime;
	}

	public void setExecuteEndTime(String executeEndTime) {
		this.executeEndTime = executeEndTime;
		if(executeEndTime != null){
			putBodyParameter("ExecuteEndTime", executeEndTime);
		}
	}

	public String getUserPk() {
		return this.userPk;
	}

	public void setUserPk(String userPk) {
		this.userPk = userPk;
		if(userPk != null){
			putBodyParameter("UserPk", userPk);
		}
	}

	public String getOrgId() {
		return this.orgId;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;
		if(orgId != null){
			putQueryParameter("OrgId", orgId);
		}
	}

	public String getCreateStartTime() {
		return this.createStartTime;
	}

	public void setCreateStartTime(String createStartTime) {
		this.createStartTime = createStartTime;
		if(createStartTime != null){
			putBodyParameter("CreateStartTime", createStartTime);
		}
	}

	public String getOperators() {
		return this.operators;
	}

	public void setOperators(String operators) {
		this.operators = operators;
		if(operators != null){
			putBodyParameter("Operators", operators);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize.toString());
		}
	}

	public String getExecuteStartTime() {
		return this.executeStartTime;
	}

	public void setExecuteStartTime(String executeStartTime) {
		this.executeStartTime = executeStartTime;
		if(executeStartTime != null){
			putBodyParameter("ExecuteStartTime", executeStartTime);
		}
	}

	public Integer getPageStart() {
		return this.pageStart;
	}

	public void setPageStart(Integer pageStart) {
		this.pageStart = pageStart;
		if(pageStart != null){
			putBodyParameter("PageStart", pageStart.toString());
		}
	}

	public String getCreateEndTime() {
		return this.createEndTime;
	}

	public void setCreateEndTime(String createEndTime) {
		this.createEndTime = createEndTime;
		if(createEndTime != null){
			putBodyParameter("CreateEndTime", createEndTime);
		}
	}

	@Override
	public Class<ListPipelinesResponse> getResponseClass() {
		return ListPipelinesResponse.class;
	}

}
