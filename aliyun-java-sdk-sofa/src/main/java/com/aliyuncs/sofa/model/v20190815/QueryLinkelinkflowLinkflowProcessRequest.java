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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QueryLinkelinkflowLinkflowProcessRequest extends RpcAcsRequest<QueryLinkelinkflowLinkflowProcessResponse> {
	   

	private String startTime;

	private String type;

	private String userId;

	private String current;

	private String appName;

	private String pageSize;

	private String tenantId;

	private String id;

	private String candidateUserId;

	private String finished;

	private String includeVariables;

	private String name;

	private String definitionKey;

	private String iterationId;

	private String stageId;

	private String status;
	public QueryLinkelinkflowLinkflowProcessRequest() {
		super("SOFA", "2019-08-15", "QueryLinkelinkflowLinkflowProcess", "sofacafedeps");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putBodyParameter("StartTime", startTime);
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putBodyParameter("Type", type);
		}
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
		if(userId != null){
			putBodyParameter("UserId", userId);
		}
	}

	public String getCurrent() {
		return this.current;
	}

	public void setCurrent(String current) {
		this.current = current;
		if(current != null){
			putBodyParameter("Current", current);
		}
	}

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
		if(appName != null){
			putBodyParameter("AppName", appName);
		}
	}

	public String getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize);
		}
	}

	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
		if(tenantId != null){
			putBodyParameter("TenantId", tenantId);
		}
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
		if(id != null){
			putBodyParameter("Id", id);
		}
	}

	public String getCandidateUserId() {
		return this.candidateUserId;
	}

	public void setCandidateUserId(String candidateUserId) {
		this.candidateUserId = candidateUserId;
		if(candidateUserId != null){
			putBodyParameter("CandidateUserId", candidateUserId);
		}
	}

	public String getFinished() {
		return this.finished;
	}

	public void setFinished(String finished) {
		this.finished = finished;
		if(finished != null){
			putBodyParameter("Finished", finished);
		}
	}

	public String getIncludeVariables() {
		return this.includeVariables;
	}

	public void setIncludeVariables(String includeVariables) {
		this.includeVariables = includeVariables;
		if(includeVariables != null){
			putBodyParameter("IncludeVariables", includeVariables);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putBodyParameter("Name", name);
		}
	}

	public String getDefinitionKey() {
		return this.definitionKey;
	}

	public void setDefinitionKey(String definitionKey) {
		this.definitionKey = definitionKey;
		if(definitionKey != null){
			putBodyParameter("DefinitionKey", definitionKey);
		}
	}

	public String getIterationId() {
		return this.iterationId;
	}

	public void setIterationId(String iterationId) {
		this.iterationId = iterationId;
		if(iterationId != null){
			putBodyParameter("IterationId", iterationId);
		}
	}

	public String getStageId() {
		return this.stageId;
	}

	public void setStageId(String stageId) {
		this.stageId = stageId;
		if(stageId != null){
			putBodyParameter("StageId", stageId);
		}
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putBodyParameter("Status", status);
		}
	}

	@Override
	public Class<QueryLinkelinkflowLinkflowProcessResponse> getResponseClass() {
		return QueryLinkelinkflowLinkflowProcessResponse.class;
	}

}
