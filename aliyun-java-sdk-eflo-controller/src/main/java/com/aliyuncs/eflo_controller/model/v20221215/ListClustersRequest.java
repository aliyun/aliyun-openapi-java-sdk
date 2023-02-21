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

package com.aliyuncs.eflo_controller.model.v20221215;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListClustersRequest extends RpcAcsRequest<ListClustersResponse> {
	   

	private String resourceGroupId;

	private String nextToken;

	private Long maxResults;
	public ListClustersRequest() {
		super("eflo-controller", "2022-12-15", "ListClusters");
		setMethod(MethodType.POST);
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if(resourceGroupId != null){
			putBodyParameter("ResourceGroupId", resourceGroupId);
		}
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
		if(nextToken != null){
			putBodyParameter("NextToken", nextToken);
		}
	}

	public Long getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Long maxResults) {
		this.maxResults = maxResults;
		if(maxResults != null){
			putBodyParameter("MaxResults", maxResults.toString());
		}
	}

	@Override
	public Class<ListClustersResponse> getResponseClass() {
		return ListClustersResponse.class;
	}

}
