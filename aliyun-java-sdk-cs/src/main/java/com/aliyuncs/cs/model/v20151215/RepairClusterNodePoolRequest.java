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
public class RepairClusterNodePoolRequest extends RoaAcsRequest<RepairClusterNodePoolResponse> {
	   

	private String cluster_id;

	private String body;

	private String nodepool_id;
	public RepairClusterNodePoolRequest() {
		super("CS", "2015-12-15", "RepairClusterNodePool");
		setUriPattern("/clusters/[cluster_id]/nodepools/[nodepool_id]/repair");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCluster_id() {
		return this.cluster_id;
	}

	public void setCluster_id(String cluster_id) {
		this.cluster_id = cluster_id;
		if(cluster_id != null){
			putPathParameter("cluster_id", cluster_id);
		}
	}

	public String getBody() {
		return this.body;
	}

	public void setBody(String body) {
		this.body = body;
		if(body != null){
			putBodyParameter("body", body);
		}
	}

	public String getNodepool_id() {
		return this.nodepool_id;
	}

	public void setNodepool_id(String nodepool_id) {
		this.nodepool_id = nodepool_id;
		if(nodepool_id != null){
			putPathParameter("nodepool_id", nodepool_id);
		}
	}

	@Override
	public Class<RepairClusterNodePoolResponse> getResponseClass() {
		return RepairClusterNodePoolResponse.class;
	}

}
