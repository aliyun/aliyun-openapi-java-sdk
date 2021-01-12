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

package com.aliyuncs.schedulerx2.model.v20190430;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.schedulerx2.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class BatchDeleteJobsRequest extends RpcAcsRequest<BatchDeleteJobsResponse> {
	   

	private String namespaceSource;

	private String groupId;

	private List<Long> jobIdLists;

	private String namespace;
	public BatchDeleteJobsRequest() {
		super("schedulerx2", "2019-04-30", "BatchDeleteJobs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getNamespaceSource() {
		return this.namespaceSource;
	}

	public void setNamespaceSource(String namespaceSource) {
		this.namespaceSource = namespaceSource;
		if(namespaceSource != null){
			putQueryParameter("NamespaceSource", namespaceSource);
		}
	}

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
		if(groupId != null){
			putQueryParameter("GroupId", groupId);
		}
	}

	public List<Long> getJobIdLists() {
		return this.jobIdLists;
	}

	public void setJobIdLists(List<Long> jobIdLists) {
		this.jobIdLists = jobIdLists;	
		if (jobIdLists != null) {
			for (int i = 0; i < jobIdLists.size(); i++) {
				putBodyParameter("JobIdList." + (i + 1) , jobIdLists.get(i));
			}
		}	
	}

	public String getNamespace() {
		return this.namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
		if(namespace != null){
			putQueryParameter("Namespace", namespace);
		}
	}

	@Override
	public Class<BatchDeleteJobsResponse> getResponseClass() {
		return BatchDeleteJobsResponse.class;
	}

}
