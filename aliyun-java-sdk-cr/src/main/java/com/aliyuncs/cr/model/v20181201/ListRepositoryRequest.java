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

package com.aliyuncs.cr.model.v20181201;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListRepositoryRequest extends RpcAcsRequest<ListRepositoryResponse> {
	   

	private String instanceId;

	private String repoName;

	private String repoNamespaceName;

	private Integer pageNo;

	private Integer pageSize;

	private String repoStatus;
	public ListRepositoryRequest() {
		super("cr", "2018-12-01", "ListRepository", "acr");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getRepoName() {
		return this.repoName;
	}

	public void setRepoName(String repoName) {
		this.repoName = repoName;
		if(repoName != null){
			putQueryParameter("RepoName", repoName);
		}
	}

	public String getRepoNamespaceName() {
		return this.repoNamespaceName;
	}

	public void setRepoNamespaceName(String repoNamespaceName) {
		this.repoNamespaceName = repoNamespaceName;
		if(repoNamespaceName != null){
			putQueryParameter("RepoNamespaceName", repoNamespaceName);
		}
	}

	public Integer getPageNo() {
		return this.pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
		if(pageNo != null){
			putQueryParameter("PageNo", pageNo.toString());
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getRepoStatus() {
		return this.repoStatus;
	}

	public void setRepoStatus(String repoStatus) {
		this.repoStatus = repoStatus;
		if(repoStatus != null){
			putQueryParameter("RepoStatus", repoStatus);
		}
	}

	@Override
	public Class<ListRepositoryResponse> getResponseClass() {
		return ListRepositoryResponse.class;
	}

}
