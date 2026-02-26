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

package com.aliyuncs.devops.model.v20210625;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListRepositoryTagsRequest extends RoaAcsRequest<ListRepositoryTagsResponse> {
	   

	private String accessToken;

	private String sort;

	private String organizationId;

	private String search;

	private Long repositoryId;

	private Long pageSize;

	private Long page;
	public ListRepositoryTagsRequest() {
		super("devops", "2021-06-25", "ListRepositoryTags");
		setUriPattern("/repository/[repositoryId]/tag/list");
		setMethod(MethodType.GET);
	}

	public String getAccessToken() {
		return this.accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
		if(accessToken != null){
			putQueryParameter("accessToken", accessToken);
		}
	}

	public String getSort() {
		return this.sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
		if(sort != null){
			putQueryParameter("sort", sort);
		}
	}

	public String getOrganizationId() {
		return this.organizationId;
	}

	public void setOrganizationId(String organizationId) {
		this.organizationId = organizationId;
		if(organizationId != null){
			putQueryParameter("organizationId", organizationId);
		}
	}

	public String getSearch() {
		return this.search;
	}

	public void setSearch(String search) {
		this.search = search;
		if(search != null){
			putQueryParameter("search", search);
		}
	}

	public Long getRepositoryId() {
		return this.repositoryId;
	}

	public void setRepositoryId(Long repositoryId) {
		this.repositoryId = repositoryId;
		if(repositoryId != null){
			putPathParameter("repositoryId", repositoryId.toString());
		}
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("pageSize", pageSize.toString());
		}
	}

	public Long getPage() {
		return this.page;
	}

	public void setPage(Long page) {
		this.page = page;
		if(page != null){
			putQueryParameter("page", page.toString());
		}
	}

	@Override
	public Class<ListRepositoryTagsResponse> getResponseClass() {
		return ListRepositoryTagsResponse.class;
	}

}
