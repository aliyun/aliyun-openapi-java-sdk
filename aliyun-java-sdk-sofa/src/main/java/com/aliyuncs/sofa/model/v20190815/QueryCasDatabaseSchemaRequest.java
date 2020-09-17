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
public class QueryCasDatabaseSchemaRequest extends RpcAcsRequest<QueryCasDatabaseSchemaResponse> {
	   

	private String workspace;

	private Long pageSize;

	private List<String> iaasIdsRepeatLists;

	private Long currentPage;

	private List<String> idsRepeatLists;

	private String name;

	private String databaseId;

	private List<String> charSetsRepeatLists;

	private List<String> statusesRepeatLists;
	public QueryCasDatabaseSchemaRequest() {
		super("SOFA", "2019-08-15", "QueryCasDatabaseSchema", "sofacafedeps");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getWorkspace() {
		return this.workspace;
	}

	public void setWorkspace(String workspace) {
		this.workspace = workspace;
		if(workspace != null){
			putBodyParameter("Workspace", workspace);
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

	public List<String> getIaasIdsRepeatLists() {
		return this.iaasIdsRepeatLists;
	}

	public void setIaasIdsRepeatLists(List<String> iaasIdsRepeatLists) {
		this.iaasIdsRepeatLists = iaasIdsRepeatLists;	
		if (iaasIdsRepeatLists != null) {
			for (int i = 0; i < iaasIdsRepeatLists.size(); i++) {
				putBodyParameter("IaasIdsRepeatList." + (i + 1) , iaasIdsRepeatLists.get(i));
			}
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putBodyParameter("Name", name);
		}
	}

	public String getDatabaseId() {
		return this.databaseId;
	}

	public void setDatabaseId(String databaseId) {
		this.databaseId = databaseId;
		if(databaseId != null){
			putBodyParameter("DatabaseId", databaseId);
		}
	}

	public List<String> getCharSetsRepeatLists() {
		return this.charSetsRepeatLists;
	}

	public void setCharSetsRepeatLists(List<String> charSetsRepeatLists) {
		this.charSetsRepeatLists = charSetsRepeatLists;	
		if (charSetsRepeatLists != null) {
			for (int i = 0; i < charSetsRepeatLists.size(); i++) {
				putBodyParameter("CharSetsRepeatList." + (i + 1) , charSetsRepeatLists.get(i));
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
	public Class<QueryCasDatabaseSchemaResponse> getResponseClass() {
		return QueryCasDatabaseSchemaResponse.class;
	}

}
