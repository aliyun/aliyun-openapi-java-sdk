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
public class GetLinkeBahamutArchdomainappsRequest extends RpcAcsRequest<GetLinkeBahamutArchdomainappsResponse> {
	   

	private String archDomainName;

	private String searchType;

	private String pageSize;

	private String tenantId;

	private String archDomainID;

	private String parentArchDomainName;

	private String keyword;

	private String userAccount;

	private String order;

	private String archDomainExternalId;

	private String field;

	private String page;
	public GetLinkeBahamutArchdomainappsRequest() {
		super("SOFA", "2019-08-15", "GetLinkeBahamutArchdomainapps", "sofa");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getArchDomainName() {
		return this.archDomainName;
	}

	public void setArchDomainName(String archDomainName) {
		this.archDomainName = archDomainName;
		if(archDomainName != null){
			putBodyParameter("ArchDomainName", archDomainName);
		}
	}

	public String getSearchType() {
		return this.searchType;
	}

	public void setSearchType(String searchType) {
		this.searchType = searchType;
		if(searchType != null){
			putBodyParameter("SearchType", searchType);
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

	public String getArchDomainID() {
		return this.archDomainID;
	}

	public void setArchDomainID(String archDomainID) {
		this.archDomainID = archDomainID;
		if(archDomainID != null){
			putBodyParameter("ArchDomainID", archDomainID);
		}
	}

	public String getParentArchDomainName() {
		return this.parentArchDomainName;
	}

	public void setParentArchDomainName(String parentArchDomainName) {
		this.parentArchDomainName = parentArchDomainName;
		if(parentArchDomainName != null){
			putBodyParameter("ParentArchDomainName", parentArchDomainName);
		}
	}

	public String getKeyword() {
		return this.keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
		if(keyword != null){
			putBodyParameter("Keyword", keyword);
		}
	}

	public String getUserAccount() {
		return this.userAccount;
	}

	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
		if(userAccount != null){
			putBodyParameter("UserAccount", userAccount);
		}
	}

	public String getOrder() {
		return this.order;
	}

	public void setOrder(String order) {
		this.order = order;
		if(order != null){
			putBodyParameter("Order", order);
		}
	}

	public String getArchDomainExternalId() {
		return this.archDomainExternalId;
	}

	public void setArchDomainExternalId(String archDomainExternalId) {
		this.archDomainExternalId = archDomainExternalId;
		if(archDomainExternalId != null){
			putBodyParameter("ArchDomainExternalId", archDomainExternalId);
		}
	}

	public String getField() {
		return this.field;
	}

	public void setField(String field) {
		this.field = field;
		if(field != null){
			putBodyParameter("Field", field);
		}
	}

	public String getPage() {
		return this.page;
	}

	public void setPage(String page) {
		this.page = page;
		if(page != null){
			putBodyParameter("Page", page);
		}
	}

	@Override
	public Class<GetLinkeBahamutArchdomainappsResponse> getResponseClass() {
		return GetLinkeBahamutArchdomainappsResponse.class;
	}

}
