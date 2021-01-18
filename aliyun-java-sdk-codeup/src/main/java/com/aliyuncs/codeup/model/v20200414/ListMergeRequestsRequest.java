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

package com.aliyuncs.codeup.model.v20200414;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListMergeRequestsRequest extends RoaAcsRequest<ListMergeRequestsResponse> {
	   

	private String beforeDate;

	private String assigneeIdList;

	private String accessToken;

	private String subscriberCodeupIdList;

	private String afterDate;

	private String organizationId;

	private String groupIdList;

	private String search;

	private String authorCodeupIdList;

	private String authorIdList;

	private Long pageSize;

	private String projectIdList;

	private Long page;

	private String assigneeCodeupIdList;

	private String state;

	private String order;
	public ListMergeRequestsRequest() {
		super("codeup", "2020-04-14", "ListMergeRequests");
		setUriPattern("/api/v4/merge_requests/advanced_search");
		setMethod(MethodType.GET);
	}

	public String getBeforeDate() {
		return this.beforeDate;
	}

	public void setBeforeDate(String beforeDate) {
		this.beforeDate = beforeDate;
		if(beforeDate != null){
			putQueryParameter("BeforeDate", beforeDate);
		}
	}

	public String getAssigneeIdList() {
		return this.assigneeIdList;
	}

	public void setAssigneeIdList(String assigneeIdList) {
		this.assigneeIdList = assigneeIdList;
		if(assigneeIdList != null){
			putQueryParameter("AssigneeIdList", assigneeIdList);
		}
	}

	public String getAccessToken() {
		return this.accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
		if(accessToken != null){
			putQueryParameter("AccessToken", accessToken);
		}
	}

	public String getSubscriberCodeupIdList() {
		return this.subscriberCodeupIdList;
	}

	public void setSubscriberCodeupIdList(String subscriberCodeupIdList) {
		this.subscriberCodeupIdList = subscriberCodeupIdList;
		if(subscriberCodeupIdList != null){
			putQueryParameter("SubscriberCodeupIdList", subscriberCodeupIdList);
		}
	}

	public String getAfterDate() {
		return this.afterDate;
	}

	public void setAfterDate(String afterDate) {
		this.afterDate = afterDate;
		if(afterDate != null){
			putQueryParameter("AfterDate", afterDate);
		}
	}

	public String getOrganizationId() {
		return this.organizationId;
	}

	public void setOrganizationId(String organizationId) {
		this.organizationId = organizationId;
		if(organizationId != null){
			putQueryParameter("OrganizationId", organizationId);
		}
	}

	public String getGroupIdList() {
		return this.groupIdList;
	}

	public void setGroupIdList(String groupIdList) {
		this.groupIdList = groupIdList;
		if(groupIdList != null){
			putQueryParameter("GroupIdList", groupIdList);
		}
	}

	public String getSearch() {
		return this.search;
	}

	public void setSearch(String search) {
		this.search = search;
		if(search != null){
			putQueryParameter("Search", search);
		}
	}

	public String getAuthorCodeupIdList() {
		return this.authorCodeupIdList;
	}

	public void setAuthorCodeupIdList(String authorCodeupIdList) {
		this.authorCodeupIdList = authorCodeupIdList;
		if(authorCodeupIdList != null){
			putQueryParameter("AuthorCodeupIdList", authorCodeupIdList);
		}
	}

	public String getAuthorIdList() {
		return this.authorIdList;
	}

	public void setAuthorIdList(String authorIdList) {
		this.authorIdList = authorIdList;
		if(authorIdList != null){
			putQueryParameter("AuthorIdList", authorIdList);
		}
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getProjectIdList() {
		return this.projectIdList;
	}

	public void setProjectIdList(String projectIdList) {
		this.projectIdList = projectIdList;
		if(projectIdList != null){
			putQueryParameter("ProjectIdList", projectIdList);
		}
	}

	public Long getPage() {
		return this.page;
	}

	public void setPage(Long page) {
		this.page = page;
		if(page != null){
			putQueryParameter("Page", page.toString());
		}
	}

	public String getAssigneeCodeupIdList() {
		return this.assigneeCodeupIdList;
	}

	public void setAssigneeCodeupIdList(String assigneeCodeupIdList) {
		this.assigneeCodeupIdList = assigneeCodeupIdList;
		if(assigneeCodeupIdList != null){
			putQueryParameter("AssigneeCodeupIdList", assigneeCodeupIdList);
		}
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
		if(state != null){
			putQueryParameter("State", state);
		}
	}

	public String getOrder() {
		return this.order;
	}

	public void setOrder(String order) {
		this.order = order;
		if(order != null){
			putQueryParameter("Order", order);
		}
	}

	@Override
	public Class<ListMergeRequestsResponse> getResponseClass() {
		return ListMergeRequestsResponse.class;
	}

}
