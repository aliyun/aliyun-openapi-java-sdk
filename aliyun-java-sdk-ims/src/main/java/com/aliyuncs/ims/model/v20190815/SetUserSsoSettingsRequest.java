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
public class SetUserSsoSettingsRequest extends RpcAcsRequest<SetUserSsoSettingsResponse> {
	   

	private String auxiliaryDomain;

	private String metadataDocument;

	private Boolean ssoEnabled;
	public SetUserSsoSettingsRequest() {
		super("Ims", "2019-08-15", "SetUserSsoSettings", "ims");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAuxiliaryDomain() {
		return this.auxiliaryDomain;
	}

	public void setAuxiliaryDomain(String auxiliaryDomain) {
		this.auxiliaryDomain = auxiliaryDomain;
		if(auxiliaryDomain != null){
			putQueryParameter("AuxiliaryDomain", auxiliaryDomain);
		}
	}

	public String getMetadataDocument() {
		return this.metadataDocument;
	}

	public void setMetadataDocument(String metadataDocument) {
		this.metadataDocument = metadataDocument;
		if(metadataDocument != null){
			putQueryParameter("MetadataDocument", metadataDocument);
		}
	}

	public Boolean getSsoEnabled() {
		return this.ssoEnabled;
	}

	public void setSsoEnabled(Boolean ssoEnabled) {
		this.ssoEnabled = ssoEnabled;
		if(ssoEnabled != null){
			putQueryParameter("SsoEnabled", ssoEnabled.toString());
		}
	}

	@Override
	public Class<SetUserSsoSettingsResponse> getResponseClass() {
		return SetUserSsoSettingsResponse.class;
	}

}
