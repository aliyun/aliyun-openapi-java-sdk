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

package com.aliyuncs.ecs.model.v20160314;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DeleteNetworkInsightsPathRequest extends RpcAcsRequest<DeleteNetworkInsightsPathResponse> {
	   

	private Long resourceOwnerId;

	private Boolean dryRun;

	private List<String> networkInsightsPathIds;
	public DeleteNetworkInsightsPathRequest() {
		super("Ecs", "2016-03-14", "DeleteNetworkInsightsPath", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public Boolean getDryRun() {
		return this.dryRun;
	}

	public void setDryRun(Boolean dryRun) {
		this.dryRun = dryRun;
		if(dryRun != null){
			putQueryParameter("DryRun", dryRun.toString());
		}
	}

	public List<String> getNetworkInsightsPathIds() {
		return this.networkInsightsPathIds;
	}

	public void setNetworkInsightsPathIds(List<String> networkInsightsPathIds) {
		this.networkInsightsPathIds = networkInsightsPathIds;	
		if (networkInsightsPathIds != null) {
			for (int i = 0; i < networkInsightsPathIds.size(); i++) {
				putQueryParameter("NetworkInsightsPathId." + (i + 1) , networkInsightsPathIds.get(i));
			}
		}	
	}

	@Override
	public Class<DeleteNetworkInsightsPathResponse> getResponseClass() {
		return DeleteNetworkInsightsPathResponse.class;
	}

}
