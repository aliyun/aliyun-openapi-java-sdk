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
public class GetLinkeBahamutIterationsgetlterationsRequest extends RpcAcsRequest<GetLinkeBahamutIterationsgetlterationsResponse> {
	   

	private String isDeleted;

	private String appName;

	private String pageSize;

	private String tenantId;

	private String isFinished;

	private String page;

	private String showAll;
	public GetLinkeBahamutIterationsgetlterationsRequest() {
		super("SOFA", "2019-08-15", "GetLinkeBahamutIterationsgetlterations", "sofa");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getIsDeleted() {
		return this.isDeleted;
	}

	public void setIsDeleted(String isDeleted) {
		this.isDeleted = isDeleted;
		if(isDeleted != null){
			putBodyParameter("IsDeleted", isDeleted);
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

	public String getIsFinished() {
		return this.isFinished;
	}

	public void setIsFinished(String isFinished) {
		this.isFinished = isFinished;
		if(isFinished != null){
			putBodyParameter("IsFinished", isFinished);
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

	public String getShowAll() {
		return this.showAll;
	}

	public void setShowAll(String showAll) {
		this.showAll = showAll;
		if(showAll != null){
			putBodyParameter("ShowAll", showAll);
		}
	}

	@Override
	public Class<GetLinkeBahamutIterationsgetlterationsResponse> getResponseClass() {
		return GetLinkeBahamutIterationsgetlterationsResponse.class;
	}

}
