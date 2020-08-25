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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class JudgeLinkeBahamutDiffbetweenbranchesRequest extends RpcAcsRequest<JudgeLinkeBahamutDiffbetweenbranchesResponse> {
	   

	private String mrSourceBranch;

	private String mrTargetBranch;

	private String groupName;

	private String repoName;

	private String tenantName;
	public JudgeLinkeBahamutDiffbetweenbranchesRequest() {
		super("SOFA", "2019-08-15", "JudgeLinkeBahamutDiffbetweenbranches", "sofa");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getMrSourceBranch() {
		return this.mrSourceBranch;
	}

	public void setMrSourceBranch(String mrSourceBranch) {
		this.mrSourceBranch = mrSourceBranch;
		if(mrSourceBranch != null){
			putBodyParameter("MrSourceBranch", mrSourceBranch);
		}
	}

	public String getMrTargetBranch() {
		return this.mrTargetBranch;
	}

	public void setMrTargetBranch(String mrTargetBranch) {
		this.mrTargetBranch = mrTargetBranch;
		if(mrTargetBranch != null){
			putBodyParameter("MrTargetBranch", mrTargetBranch);
		}
	}

	public String getGroupName() {
		return this.groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
		if(groupName != null){
			putBodyParameter("GroupName", groupName);
		}
	}

	public String getRepoName() {
		return this.repoName;
	}

	public void setRepoName(String repoName) {
		this.repoName = repoName;
		if(repoName != null){
			putBodyParameter("RepoName", repoName);
		}
	}

	public String getTenantName() {
		return this.tenantName;
	}

	public void setTenantName(String tenantName) {
		this.tenantName = tenantName;
		if(tenantName != null){
			putBodyParameter("TenantName", tenantName);
		}
	}

	@Override
	public Class<JudgeLinkeBahamutDiffbetweenbranchesResponse> getResponseClass() {
		return JudgeLinkeBahamutDiffbetweenbranchesResponse.class;
	}

}
