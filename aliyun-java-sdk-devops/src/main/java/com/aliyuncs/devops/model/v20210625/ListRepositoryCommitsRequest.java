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
public class ListRepositoryCommitsRequest extends RoaAcsRequest<ListRepositoryCommitsResponse> {
	   

	private Boolean showCommentsCount;

	private String start;

	private String accessToken;

	private Boolean showSignature;

	private String refName;

	private String organizationId;

	private String path;

	private String search;

	private Long repositoryId;

	private Long pageSize;

	private String end;

	private Long page;
	public ListRepositoryCommitsRequest() {
		super("devops", "2021-06-25", "ListRepositoryCommits");
		setUriPattern("/repository/[repositoryId]/commits");
		setMethod(MethodType.GET);
	}

	public Boolean getShowCommentsCount() {
		return this.showCommentsCount;
	}

	public void setShowCommentsCount(Boolean showCommentsCount) {
		this.showCommentsCount = showCommentsCount;
		if(showCommentsCount != null){
			putQueryParameter("showCommentsCount", showCommentsCount.toString());
		}
	}

	public String getStart() {
		return this.start;
	}

	public void setStart(String start) {
		this.start = start;
		if(start != null){
			putQueryParameter("start", start);
		}
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

	public Boolean getShowSignature() {
		return this.showSignature;
	}

	public void setShowSignature(Boolean showSignature) {
		this.showSignature = showSignature;
		if(showSignature != null){
			putQueryParameter("showSignature", showSignature.toString());
		}
	}

	public String getRefName() {
		return this.refName;
	}

	public void setRefName(String refName) {
		this.refName = refName;
		if(refName != null){
			putQueryParameter("refName", refName);
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

	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
		if(path != null){
			putQueryParameter("path", path);
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

	public String getEnd() {
		return this.end;
	}

	public void setEnd(String end) {
		this.end = end;
		if(end != null){
			putQueryParameter("end", end);
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
	public Class<ListRepositoryCommitsResponse> getResponseClass() {
		return ListRepositoryCommitsResponse.class;
	}

}
