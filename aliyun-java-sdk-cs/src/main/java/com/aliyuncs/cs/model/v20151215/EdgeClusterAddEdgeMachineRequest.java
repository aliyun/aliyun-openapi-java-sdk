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
public class EdgeClusterAddEdgeMachineRequest extends RoaAcsRequest<EdgeClusterAddEdgeMachineResponse> {
	   

	private String edge_machineid;

	private String clusterid;

	private String body;
	public EdgeClusterAddEdgeMachineRequest() {
		super("CS", "2015-12-15", "EdgeClusterAddEdgeMachine");
		setUriPattern("/clusters/[clusterid]/attachedgemachine/[edge_machineid]");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getEdge_machineid() {
		return this.edge_machineid;
	}

	public void setEdge_machineid(String edge_machineid) {
		this.edge_machineid = edge_machineid;
		if(edge_machineid != null){
			putPathParameter("edge_machineid", edge_machineid);
		}
	}

	public String getClusterid() {
		return this.clusterid;
	}

	public void setClusterid(String clusterid) {
		this.clusterid = clusterid;
		if(clusterid != null){
			putPathParameter("clusterid", clusterid);
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

	@Override
	public Class<EdgeClusterAddEdgeMachineResponse> getResponseClass() {
		return EdgeClusterAddEdgeMachineResponse.class;
	}

}
