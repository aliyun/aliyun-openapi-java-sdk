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

package com.aliyuncs.emrstudio.model.v20231009;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListProjectsRequest extends RoaAcsRequest<ListProjectsResponse> {
	   

	private String searchVal;

	private String nextToken;

	private Integer maxResults;

	private Long workspaceId;
	public ListProjectsRequest() {
		super("EmrStudio", "2023-10-09", "ListProjects");
		setProtocol(ProtocolType.HTTPS);
		setUriPattern("/dolphinscheduler/v3/projects");
		setMethod(MethodType.GET);
	}

	public String getSearchVal() {
		return this.searchVal;
	}

	public void setSearchVal(String searchVal) {
		this.searchVal = searchVal;
		if(searchVal != null){
			putQueryParameter("searchVal", searchVal);
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

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
		if(maxResults != null){
			putQueryParameter("maxResults", maxResults.toString());
		}
	}

	public Long getWorkspaceId() {
		return this.workspaceId;
	}

	public void setWorkspaceId(Long workspaceId) {
		this.workspaceId = workspaceId;
		if(workspaceId != null){
			putQueryParameter("workspaceId", workspaceId.toString());
		}
	}

	@Override
	public Class<ListProjectsResponse> getResponseClass() {
		return ListProjectsResponse.class;
	}

}
