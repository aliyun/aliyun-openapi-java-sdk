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
public class UpdateSAMLProviderRequest extends RpcAcsRequest<UpdateSAMLProviderResponse> {
	   

	private String newEncodedSAMLMetadataDocument;

	private String sAMLProviderName;

	private String newDescription;
	public UpdateSAMLProviderRequest() {
		super("Ims", "2019-08-15", "UpdateSAMLProvider", "ims");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getNewEncodedSAMLMetadataDocument() {
		return this.newEncodedSAMLMetadataDocument;
	}

	public void setNewEncodedSAMLMetadataDocument(String newEncodedSAMLMetadataDocument) {
		this.newEncodedSAMLMetadataDocument = newEncodedSAMLMetadataDocument;
		if(newEncodedSAMLMetadataDocument != null){
			putQueryParameter("NewEncodedSAMLMetadataDocument", newEncodedSAMLMetadataDocument);
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

	public String getNewDescription() {
		return this.newDescription;
	}

	public void setNewDescription(String newDescription) {
		this.newDescription = newDescription;
		if(newDescription != null){
			putQueryParameter("NewDescription", newDescription);
		}
	}

	@Override
	public Class<UpdateSAMLProviderResponse> getResponseClass() {
		return UpdateSAMLProviderResponse.class;
	}

}
