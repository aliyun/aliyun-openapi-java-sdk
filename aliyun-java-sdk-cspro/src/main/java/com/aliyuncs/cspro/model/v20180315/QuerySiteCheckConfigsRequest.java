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

package com.aliyuncs.cspro.model.v20180315;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class QuerySiteCheckConfigsRequest extends RpcAcsRequest<QuerySiteCheckConfigsResponse> {
	   

	private String siteDomain;

	private Integer pageSize;

	private Integer page;

	private Long checkId;
	public QuerySiteCheckConfigsRequest() {
		super("cspro", "2018-03-15", "QuerySiteCheckConfigs", "cspro");
		setMethod(MethodType.GET);
	}

	public String getSiteDomain() {
		return this.siteDomain;
	}

	public void setSiteDomain(String siteDomain) {
		this.siteDomain = siteDomain;
		if(siteDomain != null){
			putQueryParameter("SiteDomain", siteDomain);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public Integer getPage() {
		return this.page;
	}

	public void setPage(Integer page) {
		this.page = page;
		if(page != null){
			putQueryParameter("Page", page.toString());
		}
	}

	public Long getCheckId() {
		return this.checkId;
	}

	public void setCheckId(Long checkId) {
		this.checkId = checkId;
		if(checkId != null){
			putQueryParameter("CheckId", checkId.toString());
		}
	}

	@Override
	public Class<QuerySiteCheckConfigsResponse> getResponseClass() {
		return QuerySiteCheckConfigsResponse.class;
	}

}
