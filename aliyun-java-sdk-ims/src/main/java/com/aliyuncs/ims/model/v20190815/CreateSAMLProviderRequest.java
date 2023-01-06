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

package com.aliyuncs.ims.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ims.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateSAMLProviderRequest extends RpcAcsRequest<CreateSAMLProviderResponse> {
	   

	private String description;

	private String encodedSAMLMetadataDocument;

	private String sAMLProviderName;
	public CreateSAMLProviderRequest() {
		super("Ims", "2019-08-15", "CreateSAMLProvider");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getEncodedSAMLMetadataDocument() {
		return this.encodedSAMLMetadataDocument;
	}

	public void setEncodedSAMLMetadataDocument(String encodedSAMLMetadataDocument) {
		this.encodedSAMLMetadataDocument = encodedSAMLMetadataDocument;
		if(encodedSAMLMetadataDocument != null){
			putQueryParameter("EncodedSAMLMetadataDocument", encodedSAMLMetadataDocument);
		}
	}

	public String getSAMLProviderName() {
		return this.sAMLProviderName;
	}

	public void setSAMLProviderName(String sAMLProviderName) {
		this.sAMLProviderName = sAMLProviderName;
		if(sAMLProviderName != null){
			putQueryParameter("SAMLProviderName", sAMLProviderName);
		}
	}

	@Override
	public Class<CreateSAMLProviderResponse> getResponseClass() {
		return CreateSAMLProviderResponse.class;
	}

}
