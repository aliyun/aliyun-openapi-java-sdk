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
public class QueryAKSBuildPackTechStackVersionsRequest extends RpcAcsRequest<QueryAKSBuildPackTechStackVersionsResponse> {
	   

	private String techStack;

	private Long pageSize;

	private String cafeRegionId;

	private String name;

	private Long page;
	public QueryAKSBuildPackTechStackVersionsRequest() {
		super("SOFA", "2019-08-15", "QueryAKSBuildPackTechStackVersions", "sofacafedeps");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getTechStack() {
		return this.techStack;
	}

	public void setTechStack(String techStack) {
		this.techStack = techStack;
		if(techStack != null){
			putBodyParameter("TechStack", techStack);
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

	public String getCafeRegionId() {
		return this.cafeRegionId;
	}

	public void setCafeRegionId(String cafeRegionId) {
		this.cafeRegionId = cafeRegionId;
		if(cafeRegionId != null){
			putBodyParameter("CafeRegionId", cafeRegionId);
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

	public Long getPage() {
		return this.page;
	}

	public void setPage(Long page) {
		this.page = page;
		if(page != null){
			putBodyParameter("Page", page.toString());
		}
	}

	@Override
	public Class<QueryAKSBuildPackTechStackVersionsResponse> getResponseClass() {
		return QueryAKSBuildPackTechStackVersionsResponse.class;
	}

}
