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

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeVulListPageRequest extends RpcAcsRequest<DescribeVulListPageResponse> {
	   

	private String cveId;

	private Integer pageSize;

	private Integer currentPage;

	private String vulNameLike;
	public DescribeVulListPageRequest() {
		super("Sas", "2018-12-03", "DescribeVulListPage");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCveId() {
		return this.cveId;
	}

	public void setCveId(String cveId) {
		this.cveId = cveId;
		if(cveId != null){
			putQueryParameter("CveId", cveId);
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

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
		if(currentPage != null){
			putQueryParameter("CurrentPage", currentPage.toString());
		}
	}

	public String getVulNameLike() {
		return this.vulNameLike;
	}

	public void setVulNameLike(String vulNameLike) {
		this.vulNameLike = vulNameLike;
		if(vulNameLike != null){
			putQueryParameter("VulNameLike", vulNameLike);
		}
	}

	@Override
	public Class<DescribeVulListPageResponse> getResponseClass() {
		return DescribeVulListPageResponse.class;
	}

}
