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
public class QuerySiteCheckResultRequest extends RpcAcsRequest<QuerySiteCheckResultResponse> {
	   

	private String siteDomain;

	private String type;

	private Integer page;

	private Integer pageSize;

	private Long startDate;

	private Long endDate;
	public QuerySiteCheckResultRequest() {
		super("cspro", "2018-03-15", "QuerySiteCheckResult", "cspro");
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

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type);
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

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public Long getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Long startDate) {
		this.startDate = startDate;
		if(startDate != null){
			putQueryParameter("StartDate", startDate.toString());
		}
	}

	public Long getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Long endDate) {
		this.endDate = endDate;
		if(endDate != null){
			putQueryParameter("EndDate", endDate.toString());
		}
	}

	@Override
	public Class<QuerySiteCheckResultResponse> getResponseClass() {
		return QuerySiteCheckResultResponse.class;
	}

}
