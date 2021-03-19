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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QueryCasRequestRequest extends RpcAcsRequest<QueryCasRequestResponse> {
	   

	private List<String> taskStatusesRepeatLists;

	private List<String> tokensRepeatLists;

	private String operatorType;

	private List<String> parentIdsRepeatLists;

	private List<String> operatorsRepeatLists;

	private Long pageSize;

	private List<String> resourceIdsRepeatLists;

	private String minTime;

	private Long currentPage;

	private String maxTime;

	private List<String> idsRepeatLists;

	private List<String> resourceTypesRepeatLists;

	private List<String> workspaceIdsRepeatLists;

	private List<String> typesRepeatLists;

	private List<String> statusesRepeatLists;
	public QueryCasRequestRequest() {
		super("SOFA", "2019-08-15", "QueryCasRequest", "sofacaferms");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getTaskStatusesRepeatLists() {
		return this.taskStatusesRepeatLists;
	}

	public void setTaskStatusesRepeatLists(List<String> taskStatusesRepeatLists) {
		this.taskStatusesRepeatLists = taskStatusesRepeatLists;	
		if (taskStatusesRepeatLists != null) {
			for (int i = 0; i < taskStatusesRepeatLists.size(); i++) {
				putBodyParameter("TaskStatusesRepeatList." + (i + 1) , taskStatusesRepeatLists.get(i));
			}
		}	
	}

	public List<String> getTokensRepeatLists() {
		return this.tokensRepeatLists;
	}

	public void setTokensRepeatLists(List<String> tokensRepeatLists) {
		this.tokensRepeatLists = tokensRepeatLists;	
		if (tokensRepeatLists != null) {
			for (int i = 0; i < tokensRepeatLists.size(); i++) {
				putBodyParameter("TokensRepeatList." + (i + 1) , tokensRepeatLists.get(i));
			}
		}	
	}

	public String getOperatorType() {
		return this.operatorType;
	}

	public void setOperatorType(String operatorType) {
		this.operatorType = operatorType;
		if(operatorType != null){
			putBodyParameter("OperatorType", operatorType);
		}
	}

	public List<String> getParentIdsRepeatLists() {
		return this.parentIdsRepeatLists;
	}

	public void setParentIdsRepeatLists(List<String> parentIdsRepeatLists) {
		this.parentIdsRepeatLists = parentIdsRepeatLists;	
		if (parentIdsRepeatLists != null) {
			for (int i = 0; i < parentIdsRepeatLists.size(); i++) {
				putBodyParameter("ParentIdsRepeatList." + (i + 1) , parentIdsRepeatLists.get(i));
			}
		}	
	}

	public List<String> getOperatorsRepeatLists() {
		return this.operatorsRepeatLists;
	}

	public void setOperatorsRepeatLists(List<String> operatorsRepeatLists) {
		this.operatorsRepeatLists = operatorsRepeatLists;	
		if (operatorsRepeatLists != null) {
			for (int i = 0; i < operatorsRepeatLists.size(); i++) {
				putBodyParameter("OperatorsRepeatList." + (i + 1) , operatorsRepeatLists.get(i));
			}
		}	
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize.toString());
		}
	}

	public List<String> getResourceIdsRepeatLists() {
		return this.resourceIdsRepeatLists;
	}

	public void setResourceIdsRepeatLists(List<String> resourceIdsRepeatLists) {
		this.resourceIdsRepeatLists = resourceIdsRepeatLists;	
		if (resourceIdsRepeatLists != null) {
			for (int i = 0; i < resourceIdsRepeatLists.size(); i++) {
				putBodyParameter("ResourceIdsRepeatList." + (i + 1) , resourceIdsRepeatLists.get(i));
			}
		}	
	}

	public String getMinTime() {
		return this.minTime;
	}

	public void setMinTime(String minTime) {
		this.minTime = minTime;
		if(minTime != null){
			putBodyParameter("MinTime", minTime);
		}
	}

	public Long getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
		if(currentPage != null){
			putBodyParameter("CurrentPage", currentPage.toString());
		}
	}

	public String getMaxTime() {
		return this.maxTime;
	}

	public void setMaxTime(String maxTime) {
		this.maxTime = maxTime;
		if(maxTime != null){
			putBodyParameter("MaxTime", maxTime);
		}
	}

	public List<String> getIdsRepeatLists() {
		return this.idsRepeatLists;
	}

	public void setIdsRepeatLists(List<String> idsRepeatLists) {
		this.idsRepeatLists = idsRepeatLists;	
		if (idsRepeatLists != null) {
			for (int i = 0; i < idsRepeatLists.size(); i++) {
				putBodyParameter("IdsRepeatList." + (i + 1) , idsRepeatLists.get(i));
			}
		}	
	}

	public List<String> getResourceTypesRepeatLists() {
		return this.resourceTypesRepeatLists;
	}

	public void setResourceTypesRepeatLists(List<String> resourceTypesRepeatLists) {
		this.resourceTypesRepeatLists = resourceTypesRepeatLists;	
		if (resourceTypesRepeatLists != null) {
			for (int i = 0; i < resourceTypesRepeatLists.size(); i++) {
				putBodyParameter("ResourceTypesRepeatList." + (i + 1) , resourceTypesRepeatLists.get(i));
			}
		}	
	}

	public List<String> getWorkspaceIdsRepeatLists() {
		return this.workspaceIdsRepeatLists;
	}

	public void setWorkspaceIdsRepeatLists(List<String> workspaceIdsRepeatLists) {
		this.workspaceIdsRepeatLists = workspaceIdsRepeatLists;	
		if (workspaceIdsRepeatLists != null) {
			for (int i = 0; i < workspaceIdsRepeatLists.size(); i++) {
				putBodyParameter("WorkspaceIdsRepeatList." + (i + 1) , workspaceIdsRepeatLists.get(i));
			}
		}	
	}

	public List<String> getTypesRepeatLists() {
		return this.typesRepeatLists;
	}

	public void setTypesRepeatLists(List<String> typesRepeatLists) {
		this.typesRepeatLists = typesRepeatLists;	
		if (typesRepeatLists != null) {
			for (int i = 0; i < typesRepeatLists.size(); i++) {
				putBodyParameter("TypesRepeatList." + (i + 1) , typesRepeatLists.get(i));
			}
		}	
	}

	public List<String> getStatusesRepeatLists() {
		return this.statusesRepeatLists;
	}

	public void setStatusesRepeatLists(List<String> statusesRepeatLists) {
		this.statusesRepeatLists = statusesRepeatLists;	
		if (statusesRepeatLists != null) {
			for (int i = 0; i < statusesRepeatLists.size(); i++) {
				putBodyParameter("StatusesRepeatList." + (i + 1) , statusesRepeatLists.get(i));
			}
		}	
	}

	@Override
	public Class<QueryCasRequestResponse> getResponseClass() {
		return QueryCasRequestResponse.class;
	}

}
