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
public class ListSprintsRequest extends RoaAcsRequest<ListSprintsResponse> {
	   

	private String organizationId;

	private String spaceType;

	private String nextToken;

	private Long maxResults;

	private String spaceIdentifier;
	public ListSprintsRequest() {
		super("devops", "2021-06-25", "ListSprints");
		setUriPattern("/organization/[organizationId]/sprints/list");
		setMethod(MethodType.GET);
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

	public Long getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Long maxResults) {
		this.maxResults = maxResults;
		if(maxResults != null){
			putQueryParameter("maxResults", maxResults.toString());
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

	@Override
	public Class<ListSprintsResponse> getResponseClass() {
		return ListSprintsResponse.class;
	}

}
