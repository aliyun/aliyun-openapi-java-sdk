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

package com.aliyuncs.edas.model.v20170801;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.edas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateK8sResourceRequest extends RoaAcsRequest<UpdateK8sResourceResponse> {
	   

	private String namespace;

	private String clusterId;

	private String resourceContent;
	public UpdateK8sResourceRequest() {
		super("Edas", "2017-08-01", "UpdateK8sResource", "Edas");
		setUriPattern("/pop/v5/oam/update_k8s_resource_config");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getNamespace() {
		return this.namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
		if(namespace != null){
			putBodyParameter("Namespace", namespace);
		}
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putBodyParameter("ClusterId", clusterId);
		}
	}

	public String getResourceContent() {
		return this.resourceContent;
	}

	public void setResourceContent(String resourceContent) {
		this.resourceContent = resourceContent;
		if(resourceContent != null){
			putBodyParameter("ResourceContent", resourceContent);
		}
	}

	@Override
	public Class<UpdateK8sResourceResponse> getResponseClass() {
		return UpdateK8sResourceResponse.class;
	}

}
