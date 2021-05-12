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
public class ListRepositoryCommitDiffRequest extends RoaAcsRequest<ListRepositoryCommitDiffResponse> {
	   

	private String organizationId;

	private String accessToken;

	private Integer contextLine;

	private Long projectId;

	private String sha;
	public ListRepositoryCommitDiffRequest() {
		super("codeup", "2020-04-14", "ListRepositoryCommitDiff");
		setUriPattern("/api/v3/projects/[ProjectId]/repository/commits/[Sha]/diff");
		setMethod(MethodType.GET);
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

	public String getAccessToken() {
		return this.accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
		if(accessToken != null){
			putQueryParameter("AccessToken", accessToken);
		}
	}

	public Integer getContextLine() {
		return this.contextLine;
	}

	public void setContextLine(Integer contextLine) {
		this.contextLine = contextLine;
		if(contextLine != null){
			putQueryParameter("ContextLine", contextLine.toString());
		}
	}

	public Long getProjectId() {
		return this.projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putPathParameter("ProjectId", projectId.toString());
		}
	}

	public String getSha() {
		return this.sha;
	}

	public void setSha(String sha) {
		this.sha = sha;
		if(sha != null){
			putPathParameter("Sha", sha);
		}
	}

	@Override
	public Class<ListRepositoryCommitDiffResponse> getResponseClass() {
		return ListRepositoryCommitDiffResponse.class;
	}

}
