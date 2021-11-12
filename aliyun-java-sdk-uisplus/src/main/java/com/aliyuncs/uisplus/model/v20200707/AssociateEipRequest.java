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

package com.aliyuncs.uisplus.model.v20200707;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.uisplus.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AssociateEipRequest extends RpcAcsRequest<AssociateEipResponse> {
	   

	private String role;

	private String clientToken;

	private String type;

	private String networkMode;

	private String instanceId;

	private String resourceMode;

	private String uisNodeId;

	private String uisId;
	public AssociateEipRequest() {
		super("Uisplus", "2020-07-07", "AssociateEip", "uisplus");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
		if(role != null){
			putQueryParameter("Role", role);
		}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type);
		}
	}

	public String getNetworkMode() {
		return this.networkMode;
	}

	public void setNetworkMode(String networkMode) {
		this.networkMode = networkMode;
		if(networkMode != null){
			putQueryParameter("NetworkMode", networkMode);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getResourceMode() {
		return this.resourceMode;
	}

	public void setResourceMode(String resourceMode) {
		this.resourceMode = resourceMode;
		if(resourceMode != null){
			putQueryParameter("ResourceMode", resourceMode);
		}
	}

	public String getUisNodeId() {
		return this.uisNodeId;
	}

	public void setUisNodeId(String uisNodeId) {
		this.uisNodeId = uisNodeId;
		if(uisNodeId != null){
			putQueryParameter("UisNodeId", uisNodeId);
		}
	}

	public String getUisId() {
		return this.uisId;
	}

	public void setUisId(String uisId) {
		this.uisId = uisId;
		if(uisId != null){
			putQueryParameter("UisId", uisId);
		}
	}

	@Override
	public Class<AssociateEipResponse> getResponseClass() {
		return AssociateEipResponse.class;
	}

}
