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
public class ListWorkitemsRequest extends RoaAcsRequest<ListWorkitemsResponse> {
	   

	private String extraConditions;

	private String orderBy;

	private String organizationId;

	private String groupCondition;

	private String spaceType;

	private String nextToken;

	private String searchType;

	private String maxResults;

	private String spaceIdentifier;

	private String category;

	private String conditions;
	public ListWorkitemsRequest() {
		super("devops", "2021-06-25", "ListWorkitems");
		setUriPattern("/organization/[organizationId]/listWorkitems");
		setMethod(MethodType.GET);
	}

	public String getExtraConditions() {
		return this.extraConditions;
	}

	public void setExtraConditions(String extraConditions) {
		this.extraConditions = extraConditions;
		if(extraConditions != null){
			putQueryParameter("extraConditions", extraConditions);
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

	public String getOrganizationId() {
		return this.organizationId;
	}

	public void setOrganizationId(String organizationId) {
		this.organizationId = organizationId;
		if(organizationId != null){
			putPathParameter("organizationId", organizationId);
		}
	}

	public String getGroupCondition() {
		return this.groupCondition;
	}

	public void setGroupCondition(String groupCondition) {
		this.groupCondition = groupCondition;
		if(groupCondition != null){
			putQueryParameter("groupCondition", groupCondition);
		}
	}

	public String getSpaceType() {
		return this.spaceType;
	}

	public void setSpaceType(String spaceType) {
		this.spaceType = spaceType;
		if(spaceType != null){
			putQueryParameter("spaceType", spaceType);
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

	public String getSearchType() {
		return this.searchType;
	}

	public void setSearchType(String searchType) {
		this.searchType = searchType;
		if(searchType != null){
			putQueryParameter("searchType", searchType);
		}
	}

	public String getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(String maxResults) {
		this.maxResults = maxResults;
		if(maxResults != null){
			putQueryParameter("maxResults", maxResults);
		}
	}

	public String getSpaceIdentifier() {
		return this.spaceIdentifier;
	}

	public void setSpaceIdentifier(String spaceIdentifier) {
		this.spaceIdentifier = spaceIdentifier;
		if(spaceIdentifier != null){
			putQueryParameter("spaceIdentifier", spaceIdentifier);
		}
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
		if(category != null){
			putQueryParameter("category", category);
		}
	}

	public String getConditions() {
		return this.conditions;
	}

	public void setConditions(String conditions) {
		this.conditions = conditions;
		if(conditions != null){
			putQueryParameter("conditions", conditions);
		}
	}

	@Override
	public Class<ListWorkitemsResponse> getResponseClass() {
		return ListWorkitemsResponse.class;
	}

}
