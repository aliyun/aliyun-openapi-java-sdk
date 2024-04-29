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

package com.aliyuncs.arms.model.v20190808;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.arms.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AddTagToFlinkClusterRequest extends RpcAcsRequest<AddTagToFlinkClusterResponse> {
	   

	private String flinkWorkSpaceName;

	private String clusterId;

	private String targetUserId;

	private String resourceGroupId;

	private String flinkWorkSpaceId;
	public AddTagToFlinkClusterRequest() {
		super("ARMS", "2019-08-08", "AddTagToFlinkCluster", "arms");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getFlinkWorkSpaceName() {
		return this.flinkWorkSpaceName;
	}

	public void setFlinkWorkSpaceName(String flinkWorkSpaceName) {
		this.flinkWorkSpaceName = flinkWorkSpaceName;
		if(flinkWorkSpaceName != null){
			putQueryParameter("FlinkWorkSpaceName", flinkWorkSpaceName);
		}
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putQueryParameter("ClusterId", clusterId);
		}
	}

	public String getTargetUserId() {
		return this.targetUserId;
	}

	public void setTargetUserId(String targetUserId) {
		this.targetUserId = targetUserId;
		if(targetUserId != null){
			putQueryParameter("TargetUserId", targetUserId);
		}
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if(resourceGroupId != null){
			putQueryParameter("ResourceGroupId", resourceGroupId);
		}
	}

	public String getFlinkWorkSpaceId() {
		return this.flinkWorkSpaceId;
	}

	public void setFlinkWorkSpaceId(String flinkWorkSpaceId) {
		this.flinkWorkSpaceId = flinkWorkSpaceId;
		if(flinkWorkSpaceId != null){
			putQueryParameter("FlinkWorkSpaceId", flinkWorkSpaceId);
		}
	}

	@Override
	public Class<AddTagToFlinkClusterResponse> getResponseClass() {
		return AddTagToFlinkClusterResponse.class;
	}

}
