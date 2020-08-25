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
public class QueryLinkedeploycoreDeploycoreAppservicequeryRequest extends RpcAcsRequest<QueryLinkedeploycoreDeploycoreAppservicequeryResponse> {
	   

	private String envName;

	private List<String> projectIdsRepeatLists;

	private List<String> excludeFromAppsRepeatLists;

	private Long pageNum;

	private Long pageSize;

	private Long tenantId;

	private List<String> usersRepeatLists;

	private String projectId;

	private List<Long> appServiceIdsRepeatLists;

	private String currentUser;

	private String fuzzyName;

	private String fuzzyProjectId;

	private String condition;

	private String fuzzyAppName;

	private String name;

	private String tenantName;

	private List<String> fromAppsRepeatLists;

	private List<String> appNamesRepeatLists;
	public QueryLinkedeploycoreDeploycoreAppservicequeryRequest() {
		super("SOFA", "2019-08-15", "QueryLinkedeploycoreDeploycoreAppservicequery", "sofa");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getEnvName() {
		return this.envName;
	}

	public void setEnvName(String envName) {
		this.envName = envName;
		if(envName != null){
			putBodyParameter("EnvName", envName);
		}
	}

	public List<String> getProjectIdsRepeatLists() {
		return this.projectIdsRepeatLists;
	}

	public void setProjectIdsRepeatLists(List<String> projectIdsRepeatLists) {
		this.projectIdsRepeatLists = projectIdsRepeatLists;	
		if (projectIdsRepeatLists != null) {
			for (int i = 0; i < projectIdsRepeatLists.size(); i++) {
				putBodyParameter("ProjectIdsRepeatList." + (i + 1) , projectIdsRepeatLists.get(i));
			}
		}	
	}

	public List<String> getExcludeFromAppsRepeatLists() {
		return this.excludeFromAppsRepeatLists;
	}

	public void setExcludeFromAppsRepeatLists(List<String> excludeFromAppsRepeatLists) {
		this.excludeFromAppsRepeatLists = excludeFromAppsRepeatLists;	
		if (excludeFromAppsRepeatLists != null) {
			for (int i = 0; i < excludeFromAppsRepeatLists.size(); i++) {
				putBodyParameter("ExcludeFromAppsRepeatList." + (i + 1) , excludeFromAppsRepeatLists.get(i));
			}
		}	
	}

	public Long getPageNum() {
		return this.pageNum;
	}

	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
		if(pageNum != null){
			putBodyParameter("PageNum", pageNum.toString());
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

	public Long getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(Long tenantId) {
		this.tenantId = tenantId;
		if(tenantId != null){
			putBodyParameter("TenantId", tenantId.toString());
		}
	}

	public List<String> getUsersRepeatLists() {
		return this.usersRepeatLists;
	}

	public void setUsersRepeatLists(List<String> usersRepeatLists) {
		this.usersRepeatLists = usersRepeatLists;	
		if (usersRepeatLists != null) {
			for (int i = 0; i < usersRepeatLists.size(); i++) {
				putBodyParameter("UsersRepeatList." + (i + 1) , usersRepeatLists.get(i));
			}
		}	
	}

	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putBodyParameter("ProjectId", projectId);
		}
	}

	public List<Long> getAppServiceIdsRepeatLists() {
		return this.appServiceIdsRepeatLists;
	}

	public void setAppServiceIdsRepeatLists(List<Long> appServiceIdsRepeatLists) {
		this.appServiceIdsRepeatLists = appServiceIdsRepeatLists;	
		if (appServiceIdsRepeatLists != null) {
			for (int i = 0; i < appServiceIdsRepeatLists.size(); i++) {
				putBodyParameter("AppServiceIdsRepeatList." + (i + 1) , appServiceIdsRepeatLists.get(i));
			}
		}	
	}

	public String getCurrentUser() {
		return this.currentUser;
	}

	public void setCurrentUser(String currentUser) {
		this.currentUser = currentUser;
		if(currentUser != null){
			putBodyParameter("CurrentUser", currentUser);
		}
	}

	public String getFuzzyName() {
		return this.fuzzyName;
	}

	public void setFuzzyName(String fuzzyName) {
		this.fuzzyName = fuzzyName;
		if(fuzzyName != null){
			putBodyParameter("FuzzyName", fuzzyName);
		}
	}

	public String getFuzzyProjectId() {
		return this.fuzzyProjectId;
	}

	public void setFuzzyProjectId(String fuzzyProjectId) {
		this.fuzzyProjectId = fuzzyProjectId;
		if(fuzzyProjectId != null){
			putBodyParameter("FuzzyProjectId", fuzzyProjectId);
		}
	}

	public String getCondition() {
		return this.condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
		if(condition != null){
			putBodyParameter("Condition", condition);
		}
	}

	public String getFuzzyAppName() {
		return this.fuzzyAppName;
	}

	public void setFuzzyAppName(String fuzzyAppName) {
		this.fuzzyAppName = fuzzyAppName;
		if(fuzzyAppName != null){
			putBodyParameter("FuzzyAppName", fuzzyAppName);
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

	public String getTenantName() {
		return this.tenantName;
	}

	public void setTenantName(String tenantName) {
		this.tenantName = tenantName;
		if(tenantName != null){
			putBodyParameter("TenantName", tenantName);
		}
	}

	public List<String> getFromAppsRepeatLists() {
		return this.fromAppsRepeatLists;
	}

	public void setFromAppsRepeatLists(List<String> fromAppsRepeatLists) {
		this.fromAppsRepeatLists = fromAppsRepeatLists;	
		if (fromAppsRepeatLists != null) {
			for (int i = 0; i < fromAppsRepeatLists.size(); i++) {
				putBodyParameter("FromAppsRepeatList." + (i + 1) , fromAppsRepeatLists.get(i));
			}
		}	
	}

	public List<String> getAppNamesRepeatLists() {
		return this.appNamesRepeatLists;
	}

	public void setAppNamesRepeatLists(List<String> appNamesRepeatLists) {
		this.appNamesRepeatLists = appNamesRepeatLists;	
		if (appNamesRepeatLists != null) {
			for (int i = 0; i < appNamesRepeatLists.size(); i++) {
				putBodyParameter("AppNamesRepeatList." + (i + 1) , appNamesRepeatLists.get(i));
			}
		}	
	}

	@Override
	public Class<QueryLinkedeploycoreDeploycoreAppservicequeryResponse> getResponseClass() {
		return QueryLinkedeploycoreDeploycoreAppservicequeryResponse.class;
	}

}
