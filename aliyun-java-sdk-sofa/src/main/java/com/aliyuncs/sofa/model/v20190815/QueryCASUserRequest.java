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
public class QueryCASUserRequest extends RpcAcsRequest<QueryCASUserResponse> {
	   

	private Boolean isLocaleEnabled;

	private String type;

	private String local;

	private Boolean search;

	private List<String> ordersRepeatLists;

	private Long pageSize;

	private String id;

	private String email;

	private String queryType;

	private String loginName;

	private String mobile;

	private Long currentPage;

	private Boolean paging;

	private String realName;

	private String customerId;

	private List<String> typesRepeatLists;
	public QueryCASUserRequest() {
		super("SOFA", "2019-08-15", "QueryCASUser", "sofa");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getIsLocaleEnabled() {
		return this.isLocaleEnabled;
	}

	public void setIsLocaleEnabled(Boolean isLocaleEnabled) {
		this.isLocaleEnabled = isLocaleEnabled;
		if(isLocaleEnabled != null){
			putBodyParameter("IsLocaleEnabled", isLocaleEnabled.toString());
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

	public String getLocal() {
		return this.local;
	}

	public void setLocal(String local) {
		this.local = local;
		if(local != null){
			putBodyParameter("Local", local);
		}
	}

	public Boolean getSearch() {
		return this.search;
	}

	public void setSearch(Boolean search) {
		this.search = search;
		if(search != null){
			putBodyParameter("Search", search.toString());
		}
	}

	public List<String> getOrdersRepeatLists() {
		return this.ordersRepeatLists;
	}

	public void setOrdersRepeatLists(List<String> ordersRepeatLists) {
		this.ordersRepeatLists = ordersRepeatLists;	
		if (ordersRepeatLists != null) {
			for (int i = 0; i < ordersRepeatLists.size(); i++) {
				putBodyParameter("OrdersRepeatList." + (i + 1) , ordersRepeatLists.get(i));
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

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
		if(id != null){
			putBodyParameter("Id", id);
		}
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
		if(email != null){
			putBodyParameter("Email", email);
		}
	}

	public String getQueryType() {
		return this.queryType;
	}

	public void setQueryType(String queryType) {
		this.queryType = queryType;
		if(queryType != null){
			putBodyParameter("QueryType", queryType);
		}
	}

	public String getLoginName() {
		return this.loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
		if(loginName != null){
			putBodyParameter("LoginName", loginName);
		}
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
		if(mobile != null){
			putBodyParameter("Mobile", mobile);
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

	public Boolean getPaging() {
		return this.paging;
	}

	public void setPaging(Boolean paging) {
		this.paging = paging;
		if(paging != null){
			putBodyParameter("Paging", paging.toString());
		}
	}

	public String getRealName() {
		return this.realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
		if(realName != null){
			putBodyParameter("RealName", realName);
		}
	}

	public String getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
		if(customerId != null){
			putBodyParameter("CustomerId", customerId);
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

	@Override
	public Class<QueryCASUserResponse> getResponseClass() {
		return QueryCASUserResponse.class;
	}

}
