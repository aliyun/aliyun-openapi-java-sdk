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
public class DeleteEdgeMachineRequest extends RoaAcsRequest<DeleteEdgeMachineResponse> {
	   

	private String edge_machineid;

	private String force;
	public DeleteEdgeMachineRequest() {
		super("CS", "2015-12-15", "DeleteEdgeMachine");
		setUriPattern("/edge_machines/[edge_machineid]");
		setMethod(MethodType.DELETE);
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

	public String getForce() {
		return this.force;
	}

	public void setForce(String force) {
		this.force = force;
		if(force != null){
			putQueryParameter("force", force);
		}
	}

	@Override
	public Class<DeleteEdgeMachineResponse> getResponseClass() {
		return DeleteEdgeMachineResponse.class;
	}

}
