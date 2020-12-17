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
public class GetVmMetaRequest extends RpcAcsRequest<GetVmMetaResponse> {
	   

	private String serviceAccount;

	private String trustDomain;

	private String namespace;

	private String serviceMeshId;
	public GetVmMetaRequest() {
		super("servicemesh", "2020-01-11", "GetVmMeta", "servicemesh");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getServiceAccount() {
		return this.serviceAccount;
	}

	public void setServiceAccount(String serviceAccount) {
		this.serviceAccount = serviceAccount;
		if(serviceAccount != null){
			putQueryParameter("ServiceAccount", serviceAccount);
		}
	}

	public String getTrustDomain() {
		return this.trustDomain;
	}

	public void setTrustDomain(String trustDomain) {
		this.trustDomain = trustDomain;
		if(trustDomain != null){
			putQueryParameter("TrustDomain", trustDomain);
		}
	}

	public String getNamespace() {
		return this.namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
		if(namespace != null){
			putQueryParameter("Namespace", namespace);
		}
	}

	public String getServiceMeshId() {
		return this.serviceMeshId;
	}

	public void setServiceMeshId(String serviceMeshId) {
		this.serviceMeshId = serviceMeshId;
		if(serviceMeshId != null){
			putQueryParameter("ServiceMeshId", serviceMeshId);
		}
	}

	@Override
	public Class<GetVmMetaResponse> getResponseClass() {
		return GetVmMetaResponse.class;
	}

}
