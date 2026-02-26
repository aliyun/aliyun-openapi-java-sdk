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
public class UpdateSecretRequest extends RoaAcsRequest<UpdateSecretResponse> {
	   

	private String namespaceId;

	private Long secretId;

	private String secretData;
	public UpdateSecretRequest() {
		super("sae", "2019-05-06", "UpdateSecret", "serverless");
		setUriPattern("/pop/v1/sam/secret/secret");
		setMethod(MethodType.PUT);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getNamespaceId() {
		return this.namespaceId;
	}

	public void setNamespaceId(String namespaceId) {
		this.namespaceId = namespaceId;
		if(namespaceId != null){
			putQueryParameter("NamespaceId", namespaceId);
		}
	}

	public Long getSecretId() {
		return this.secretId;
	}

	public void setSecretId(Long secretId) {
		this.secretId = secretId;
		if(secretId != null){
			putQueryParameter("SecretId", secretId.toString());
		}
	}

	public String getSecretData() {
		return this.secretData;
	}

	public void setSecretData(String secretData) {
		this.secretData = secretData;
		if(secretData != null){
			putQueryParameter("SecretData", secretData);
		}
	}

	@Override
	public Class<UpdateSecretResponse> getResponseClass() {
		return UpdateSecretResponse.class;
	}

}
