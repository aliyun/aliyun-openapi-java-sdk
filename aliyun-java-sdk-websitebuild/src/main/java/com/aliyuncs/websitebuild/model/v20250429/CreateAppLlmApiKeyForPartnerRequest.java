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

package com.aliyuncs.websitebuild.model.v20250429;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateAppLlmApiKeyForPartnerRequest extends RpcAcsRequest<CreateAppLlmApiKeyForPartnerResponse> {
	   

	private String clientToken;

	private String description;

	private String bizId;

	private List<String> ipWhiteLists;
	public CreateAppLlmApiKeyForPartnerRequest() {
		super("WebsiteBuild", "2025-04-29", "CreateAppLlmApiKeyForPartner");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putBodyParameter("ClientToken", clientToken);
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

	public String getBizId() {
		return this.bizId;
	}

	public void setBizId(String bizId) {
		this.bizId = bizId;
		if(bizId != null){
			putBodyParameter("BizId", bizId);
		}
	}

	public List<String> getIpWhiteLists() {
		return this.ipWhiteLists;
	}

	public void setIpWhiteLists(List<String> ipWhiteLists) {
		this.ipWhiteLists = ipWhiteLists;	
		if (ipWhiteLists != null) {
			for (int i = 0; i < ipWhiteLists.size(); i++) {
				putBodyParameter("IpWhiteList." + (i + 1) , ipWhiteLists.get(i));
			}
		}	
	}

	@Override
	public Class<CreateAppLlmApiKeyForPartnerResponse> getResponseClass() {
		return CreateAppLlmApiKeyForPartnerResponse.class;
	}

}
