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
public class QueryTSChunksRequest extends RpcAcsRequest<QueryTSChunksResponse> {
	   

	private Long parentId;

	private Long pageSize;

	private String executeHandler;

	private Long currentPage;

	private String instanceId;

	private String jobRequestId;
	public QueryTSChunksRequest() {
		super("SOFA", "2019-08-15", "QueryTSChunks", "ApplySidecarCert");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getParentId() {
		return this.parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
		if(parentId != null){
			putBodyParameter("ParentId", parentId.toString());
		}
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize.toString());
		}
	}

	public String getExecuteHandler() {
		return this.executeHandler;
	}

	public void setExecuteHandler(String executeHandler) {
		this.executeHandler = executeHandler;
		if(executeHandler != null){
			putBodyParameter("ExecuteHandler", executeHandler);
		}
	}

	public Long getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
		if(currentPage != null){
			putBodyParameter("CurrentPage", currentPage.toString());
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putBodyParameter("InstanceId", instanceId);
		}
	}

	public String getJobRequestId() {
		return this.jobRequestId;
	}

	public void setJobRequestId(String jobRequestId) {
		this.jobRequestId = jobRequestId;
		if(jobRequestId != null){
			putBodyParameter("JobRequestId", jobRequestId);
		}
	}

	@Override
	public Class<QueryTSChunksResponse> getResponseClass() {
		return QueryTSChunksResponse.class;
	}

}
