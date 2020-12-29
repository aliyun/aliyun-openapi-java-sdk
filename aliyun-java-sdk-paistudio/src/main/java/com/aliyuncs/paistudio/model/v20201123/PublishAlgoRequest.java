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

package com.aliyuncs.paistudio.model.v20201123;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.paistudio.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class PublishAlgoRequest extends RoaAcsRequest<PublishAlgoResponse> {
	   

	private String identifier;

	private String provider;

	private String signature;

	private String version;

	private String workspaceId;
	public PublishAlgoRequest() {
		super("PaiStudio", "2020-11-23", "PublishAlgo");
		setUriPattern("/api/core/v1.0/algo/publish");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getIdentifier() {
		return this.identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
		if(identifier != null){
			putQueryParameter("Identifier", identifier);
		}
	}

	public String getProvider() {
		return this.provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
		if(provider != null){
			putQueryParameter("Provider", provider);
		}
	}

	public String getSignature() {
		return this.signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
		if(signature != null){
			putQueryParameter("Signature", signature);
		}
	}

	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
		if(version != null){
			putQueryParameter("Version", version);
		}
	}

	public String getWorkspaceId() {
		return this.workspaceId;
	}

	public void setWorkspaceId(String workspaceId) {
		this.workspaceId = workspaceId;
		if(workspaceId != null){
			putQueryParameter("WorkspaceId", workspaceId);
		}
	}

	@Override
	public Class<PublishAlgoResponse> getResponseClass() {
		return PublishAlgoResponse.class;
	}

}
