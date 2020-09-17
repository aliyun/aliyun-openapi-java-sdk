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
public class GetLinkeBahamutDeprecateddeprecatedgetallattachableRequest extends RpcAcsRequest<GetLinkeBahamutDeprecateddeprecatedgetallattachableResponse> {
	   

	private String type;

	private String pageSize;

	private String tenantId;

	private String from;

	private String aoneReleaseId;

	private String keyword;

	private String page;

	private String to;

	private String showAll;

	private String status;
	public GetLinkeBahamutDeprecateddeprecatedgetallattachableRequest() {
		super("SOFA", "2019-08-15", "GetLinkeBahamutDeprecateddeprecatedgetallattachable", "sofacafedeps");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getFrom() {
		return this.from;
	}

	public void setFrom(String from) {
		this.from = from;
		if(from != null){
			putBodyParameter("From", from);
		}
	}

	public String getAoneReleaseId() {
		return this.aoneReleaseId;
	}

	public void setAoneReleaseId(String aoneReleaseId) {
		this.aoneReleaseId = aoneReleaseId;
		if(aoneReleaseId != null){
			putBodyParameter("AoneReleaseId", aoneReleaseId);
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

	public String getPage() {
		return this.page;
	}

	public void setPage(String page) {
		this.page = page;
		if(page != null){
			putBodyParameter("Page", page);
		}
	}

	public String getTo() {
		return this.to;
	}

	public void setTo(String to) {
		this.to = to;
		if(to != null){
			putBodyParameter("To", to);
		}
	}

	public String getShowAll() {
		return this.showAll;
	}

	public void setShowAll(String showAll) {
		this.showAll = showAll;
		if(showAll != null){
			putBodyParameter("ShowAll", showAll);
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
	public Class<GetLinkeBahamutDeprecateddeprecatedgetallattachableResponse> getResponseClass() {
		return GetLinkeBahamutDeprecateddeprecatedgetallattachableResponse.class;
	}

}
