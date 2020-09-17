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
public class QueryLinkedeploycoreDeploycoreProfileRequest extends RpcAcsRequest<QueryLinkedeploycoreDeploycoreProfileResponse> {
	   

	private Long pageNum;

	private Long parentId;

	private Long pageSize;

	private Long appServiceId;

	private List<String> envNamesRepeatLists;

	private String condition;

	private String tenantName;

	private List<String> appNamesRepeatLists;
	public QueryLinkedeploycoreDeploycoreProfileRequest() {
		super("SOFA", "2019-08-15", "QueryLinkedeploycoreDeploycoreProfile", "sofacafedeps");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public Long getParentId() {
		return this.parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
		if(parentId != null){
			putBodyParameter("ParentId", parentId.toString());
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

	public Long getAppServiceId() {
		return this.appServiceId;
	}

	public void setAppServiceId(Long appServiceId) {
		this.appServiceId = appServiceId;
		if(appServiceId != null){
			putBodyParameter("AppServiceId", appServiceId.toString());
		}
	}

	public List<String> getEnvNamesRepeatLists() {
		return this.envNamesRepeatLists;
	}

	public void setEnvNamesRepeatLists(List<String> envNamesRepeatLists) {
		this.envNamesRepeatLists = envNamesRepeatLists;	
		if (envNamesRepeatLists != null) {
			for (int i = 0; i < envNamesRepeatLists.size(); i++) {
				putBodyParameter("EnvNamesRepeatList." + (i + 1) , envNamesRepeatLists.get(i));
			}
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

	public String getTenantName() {
		return this.tenantName;
	}

	public void setTenantName(String tenantName) {
		this.tenantName = tenantName;
		if(tenantName != null){
			putBodyParameter("TenantName", tenantName);
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
	public Class<QueryLinkedeploycoreDeploycoreProfileResponse> getResponseClass() {
		return QueryLinkedeploycoreDeploycoreProfileResponse.class;
	}

}
