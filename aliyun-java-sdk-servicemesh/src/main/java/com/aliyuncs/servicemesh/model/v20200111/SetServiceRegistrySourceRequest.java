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

package com.aliyuncs.servicemesh.model.v20200111;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.servicemesh.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SetServiceRegistrySourceRequest extends RpcAcsRequest<SetServiceRegistrySourceResponse> {
	   

	private String serviceMeshId;

	private String config;
	public SetServiceRegistrySourceRequest() {
		super("servicemesh", "2020-01-11", "SetServiceRegistrySource", "servicemesh");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getServiceMeshId() {
		return this.serviceMeshId;
	}

	public void setServiceMeshId(String serviceMeshId) {
		this.serviceMeshId = serviceMeshId;
		if(serviceMeshId != null){
			putBodyParameter("ServiceMeshId", serviceMeshId);
		}
	}

	public String getConfig() {
		return this.config;
	}

	public void setConfig(String config) {
		this.config = config;
		if(config != null){
			putBodyParameter("Config", config);
		}
	}

	@Override
	public Class<SetServiceRegistrySourceResponse> getResponseClass() {
		return SetServiceRegistrySourceResponse.class;
	}

}
