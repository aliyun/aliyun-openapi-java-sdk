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

package com.aliyuncs.cs.model.v20151215;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class RemoveClusterNodesRequest extends RoaAcsRequest<RemoveClusterNodesResponse> {
	   

	private Boolean release_node;

	private Boolean drain_node;

	private String clusterId;
	public RemoveClusterNodesRequest() {
		super("CS", "2015-12-15", "RemoveClusterNodes");
		setUriPattern("/api/v2/clusters/[ClusterId]/nodes/remove");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getRelease_node() {
		return this.release_node;
	}

	public void setRelease_node(Boolean release_node) {
		this.release_node = release_node;
		if(release_node != null){
			putBodyParameter("release_node", release_node.toString());
		}
	}

	public Boolean getDrain_node() {
		return this.drain_node;
	}

	public void setDrain_node(Boolean drain_node) {
		this.drain_node = drain_node;
		if(drain_node != null){
			putBodyParameter("drain_node", drain_node.toString());
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
	public Class<RemoveClusterNodesResponse> getResponseClass() {
		return RemoveClusterNodesResponse.class;
	}

}
