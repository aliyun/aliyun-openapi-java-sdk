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
public class ListMergeRequestsRequest extends RoaAcsRequest<ListMergeRequestsResponse> {
	   

	private String accessToken;

	private String orderBy;

	private String projectIds;

	private String sort;

	private String organizationId;

	private String filter;

	private String reviewerIds;

	private String search;

	private String groupIds;

	private Long pageSize;

	private String authorIds;

	private Long page;

	private String state;
	public ListMergeRequestsRequest() {
		super("devops", "2021-06-25", "ListMergeRequests");
		setUriPattern("/api/v4/projects/merge_requests/advanced_search");
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

	public String getOrderBy() {
		return this.orderBy;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
		if(orderBy != null){
			putQueryParameter("orderBy", orderBy);
		}
	}

	public String getProjectIds() {
		return this.projectIds;
	}

	public void setProjectIds(String projectIds) {
		this.projectIds = projectIds;
		if(projectIds != null){
			putQueryParameter("projectIds", projectIds);
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

	public String getFilter() {
		return this.filter;
	}

	public void setFilter(String filter) {
		this.filter = filter;
		if(filter != null){
			putQueryParameter("filter", filter);
		}
	}

	public String getReviewerIds() {
		return this.reviewerIds;
	}

	public void setReviewerIds(String reviewerIds) {
		this.reviewerIds = reviewerIds;
		if(reviewerIds != null){
			putQueryParameter("reviewerIds", reviewerIds);
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

	public String getGroupIds() {
		return this.groupIds;
	}

	public void setGroupIds(String groupIds) {
		this.groupIds = groupIds;
		if(groupIds != null){
			putQueryParameter("groupIds", groupIds);
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

	public String getAuthorIds() {
		return this.authorIds;
	}

	public void setAuthorIds(String authorIds) {
		this.authorIds = authorIds;
		if(authorIds != null){
			putQueryParameter("authorIds", authorIds);
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

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
		if(state != null){
			putQueryParameter("state", state);
		}
	}

	@Override
	public Class<ListMergeRequestsResponse> getResponseClass() {
		return ListMergeRequestsResponse.class;
	}

}
