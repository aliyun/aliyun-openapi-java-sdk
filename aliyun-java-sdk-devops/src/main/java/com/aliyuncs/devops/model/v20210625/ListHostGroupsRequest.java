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
public class ListHostGroupsRequest extends RoaAcsRequest<ListHostGroupsResponse> {
	   

	private String pageSort;

	private String creatorAccountIds;

	private Long createStartTime;

	private String organizationId;

	private String pageOrder;

	private String nextToken;

	private String name;

	private String ids;

	private Long maxResults;

	private Long createEndTime;
	public ListHostGroupsRequest() {
		super("devops", "2021-06-25", "ListHostGroups");
		setUriPattern("/organization/[organizationId]/hostGroups");
		setMethod(MethodType.GET);
	}

	public String getPageSort() {
		return this.pageSort;
	}

	public void setPageSort(String pageSort) {
		this.pageSort = pageSort;
		if(pageSort != null){
			putQueryParameter("pageSort", pageSort);
		}
	}

	public String getCreatorAccountIds() {
		return this.creatorAccountIds;
	}

	public void setCreatorAccountIds(String creatorAccountIds) {
		this.creatorAccountIds = creatorAccountIds;
		if(creatorAccountIds != null){
			putQueryParameter("creatorAccountIds", creatorAccountIds);
		}
	}

	public Long getCreateStartTime() {
		return this.createStartTime;
	}

	public void setCreateStartTime(Long createStartTime) {
		this.createStartTime = createStartTime;
		if(createStartTime != null){
			putQueryParameter("createStartTime", createStartTime.toString());
		}
	}

	public String getOrganizationId() {
		return this.organizationId;
	}

	public void setOrganizationId(String organizationId) {
		this.organizationId = organizationId;
		if(organizationId != null){
			putPathParameter("organizationId", organizationId);
		}
	}

	public String getPageOrder() {
		return this.pageOrder;
	}

	public void setPageOrder(String pageOrder) {
		this.pageOrder = pageOrder;
		if(pageOrder != null){
			putQueryParameter("pageOrder", pageOrder);
		}
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
		if(nextToken != null){
			putQueryParameter("nextToken", nextToken);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("name", name);
		}
	}

	public String getIds() {
		return this.ids;
	}

	public void setIds(String ids) {
		this.ids = ids;
		if(ids != null){
			putQueryParameter("ids", ids);
		}
	}

	public Long getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Long maxResults) {
		this.maxResults = maxResults;
		if(maxResults != null){
			putQueryParameter("maxResults", maxResults.toString());
		}
	}

	public Long getCreateEndTime() {
		return this.createEndTime;
	}

	public void setCreateEndTime(Long createEndTime) {
		this.createEndTime = createEndTime;
		if(createEndTime != null){
			putQueryParameter("createEndTime", createEndTime.toString());
		}
	}

	@Override
	public Class<ListHostGroupsResponse> getResponseClass() {
		return ListHostGroupsResponse.class;
	}

}
