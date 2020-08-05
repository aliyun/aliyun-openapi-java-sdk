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

package com.aliyuncs.sae.model.v20190506;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sae.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateConfigMapRequest extends RoaAcsRequest<UpdateConfigMapResponse> {
	   

	private String data;

	private String description;

	private Long configMapId;
	public UpdateConfigMapRequest() {
		super("sae", "2019-05-06", "UpdateConfigMap", "serverless");
		setUriPattern("/pop/v1/sam/configmap/configMap");
		setMethod(MethodType.PUT);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getData() {
		return this.data;
	}

	public void setData(String data) {
		this.data = data;
		if(data != null){
			putBodyParameter("Data", data);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putBodyParameter("Description", description);
		}
	}

	public Long getConfigMapId() {
		return this.configMapId;
	}

	public void setConfigMapId(Long configMapId) {
		this.configMapId = configMapId;
		if(configMapId != null){
			putQueryParameter("ConfigMapId", configMapId.toString());
		}
	}

	@Override
	public Class<UpdateConfigMapResponse> getResponseClass() {
		return UpdateConfigMapResponse.class;
	}

}
