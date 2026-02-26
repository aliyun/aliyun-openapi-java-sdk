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
public class ListProjectsRequest extends RoaAcsRequest<ListProjectsResponse> {
	   

	private String extraConditions;

	private String organizationId;

	private String nextToken;

	private String scope;

	private Long maxResults;

	private String conditions;

	private String category;
	public ListProjectsRequest() {
		super("devops", "2021-06-25", "ListProjects");
		setUriPattern("/organization/[organizationId]/listProjects");
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

	public String getOrganizationId() {
		return this.organizationId;
	}

	public void setOrganizationId(String organizationId) {
		this.organizationId = organizationId;
		if(organizationId != null){
			putPathParameter("organizationId", organizationId);
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

	public String getScope() {
		return this.scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
		if(scope != null){
			putQueryParameter("scope", scope);
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

	public String getConditions() {
		return this.conditions;
	}

	public void setConditions(String conditions) {
		this.conditions = conditions;
		if(conditions != null){
			putQueryParameter("conditions", conditions);
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

	@Override
	public Class<ListProjectsResponse> getResponseClass() {
		return ListProjectsResponse.class;
	}

}
