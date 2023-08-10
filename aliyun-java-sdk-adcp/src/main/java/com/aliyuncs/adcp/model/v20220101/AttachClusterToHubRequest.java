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
public class AttachClusterToHubRequest extends RpcAcsRequest<AttachClusterToHubResponse> {
	   

	private String clusterId;

	private String clusterIds;

	private Boolean attachToMesh;
	public AttachClusterToHubRequest() {
		super("adcp", "2022-01-01", "AttachClusterToHub", "adcp");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public Boolean getAttachToMesh() {
		return this.attachToMesh;
	}

	public void setAttachToMesh(Boolean attachToMesh) {
		this.attachToMesh = attachToMesh;
		if(attachToMesh != null){
			putQueryParameter("AttachToMesh", attachToMesh.toString());
		}
	}

	@Override
	public Class<AttachClusterToHubResponse> getResponseClass() {
		return AttachClusterToHubResponse.class;
	}

}
