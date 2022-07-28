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

package com.aliyuncs.eas.model.v20210701;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.eas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DeleteResourceInstancesRequest extends RoaAcsRequest<DeleteResourceInstancesResponse> {
	   

	private String instanceList;

	private String resourceId;

	private Boolean allFailed;

	private String clusterId;
	public DeleteResourceInstancesRequest() {
		super("eas", "2021-07-01", "DeleteResourceInstances", "eas");
		setUriPattern("/api/v2/resources/[ClusterId]/[ResourceId]/instances");
		setMethod(MethodType.DELETE);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getInstanceList() {
		return this.instanceList;
	}

	public void setInstanceList(String instanceList) {
		this.instanceList = instanceList;
		if(instanceList != null){
			putQueryParameter("InstanceList", instanceList);
		}
	}

	public String getResourceId() {
		return this.resourceId;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
		if(resourceId != null){
			putPathParameter("ResourceId", resourceId);
		}
	}

	public Boolean getAllFailed() {
		return this.allFailed;
	}

	public void setAllFailed(Boolean allFailed) {
		this.allFailed = allFailed;
		if(allFailed != null){
			putQueryParameter("AllFailed", allFailed.toString());
		}
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putPathParameter("ClusterId", clusterId);
		}
	}

	@Override
	public Class<DeleteResourceInstancesResponse> getResponseClass() {
		return DeleteResourceInstancesResponse.class;
	}

}
