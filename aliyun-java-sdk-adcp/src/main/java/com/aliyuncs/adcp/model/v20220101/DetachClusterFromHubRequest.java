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

package com.aliyuncs.adcp.model.v20220101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.adcp.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DetachClusterFromHubRequest extends RpcAcsRequest<DetachClusterFromHubResponse> {
	   

	private Boolean detachFromMesh;

	private String clusterId;

	private String clusterIds;
	public DetachClusterFromHubRequest() {
		super("adcp", "2022-01-01", "DetachClusterFromHub", "adcp");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getDetachFromMesh() {
		return this.detachFromMesh;
	}

	public void setDetachFromMesh(Boolean detachFromMesh) {
		this.detachFromMesh = detachFromMesh;
		if(detachFromMesh != null){
			putQueryParameter("DetachFromMesh", detachFromMesh.toString());
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

	public String getClusterIds() {
		return this.clusterIds;
	}

	public void setClusterIds(String clusterIds) {
		this.clusterIds = clusterIds;
		if(clusterIds != null){
			putBodyParameter("ClusterIds", clusterIds);
		}
	}

	@Override
	public Class<DetachClusterFromHubResponse> getResponseClass() {
		return DetachClusterFromHubResponse.class;
	}

}
