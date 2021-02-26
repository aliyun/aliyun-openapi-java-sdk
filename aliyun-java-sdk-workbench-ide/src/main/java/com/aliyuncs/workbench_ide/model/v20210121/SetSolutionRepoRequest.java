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

package com.aliyuncs.workbench_ide.model.v20210121;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class SetSolutionRepoRequest extends RpcAcsRequest<SetSolutionRepoResponse> {
	   

	private String repoCloneUrl;

	private String repoCloneAccount;

	private String currentOrgId;

	private Integer solutionId;

	private String repoAccessToken;
	public SetSolutionRepoRequest() {
		super("Workbench-ide", "2021-01-21", "SetSolutionRepo");
		setMethod(MethodType.POST);
	}

	public String getRepoCloneUrl() {
		return this.repoCloneUrl;
	}

	public void setRepoCloneUrl(String repoCloneUrl) {
		this.repoCloneUrl = repoCloneUrl;
		if(repoCloneUrl != null){
			putQueryParameter("RepoCloneUrl", repoCloneUrl);
		}
	}

	public String getRepoCloneAccount() {
		return this.repoCloneAccount;
	}

	public void setRepoCloneAccount(String repoCloneAccount) {
		this.repoCloneAccount = repoCloneAccount;
		if(repoCloneAccount != null){
			putQueryParameter("RepoCloneAccount", repoCloneAccount);
		}
	}

	public String getCurrentOrgId() {
		return this.currentOrgId;
	}

	public void setCurrentOrgId(String currentOrgId) {
		this.currentOrgId = currentOrgId;
		if(currentOrgId != null){
			putQueryParameter("CurrentOrgId", currentOrgId);
		}
	}

	public Integer getSolutionId() {
		return this.solutionId;
	}

	public void setSolutionId(Integer solutionId) {
		this.solutionId = solutionId;
		if(solutionId != null){
			putQueryParameter("SolutionId", solutionId.toString());
		}
	}

	public String getRepoAccessToken() {
		return this.repoAccessToken;
	}

	public void setRepoAccessToken(String repoAccessToken) {
		this.repoAccessToken = repoAccessToken;
		if(repoAccessToken != null){
			putQueryParameter("RepoAccessToken", repoAccessToken);
		}
	}

	@Override
	public Class<SetSolutionRepoResponse> getResponseClass() {
		return SetSolutionRepoResponse.class;
	}

}
