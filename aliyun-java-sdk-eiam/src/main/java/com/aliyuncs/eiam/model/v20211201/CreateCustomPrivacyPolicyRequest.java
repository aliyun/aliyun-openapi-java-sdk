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

package com.aliyuncs.eiam.model.v20211201;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateCustomPrivacyPolicyRequest extends RpcAcsRequest<CreateCustomPrivacyPolicyResponse> {
	   

	private String clientToken;

	private String defaultLanguageCode;

	private String userConsentType;

	private List<CustomPrivacyPolicyContents> customPrivacyPolicyContents;

	private String instanceId;

	private String customPrivacyPolicyName;

	private String status;
	public CreateCustomPrivacyPolicyRequest() {
		super("Eiam", "2021-12-01", "CreateCustomPrivacyPolicy", "eiam");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getDefaultLanguageCode() {
		return this.defaultLanguageCode;
	}

	public void setDefaultLanguageCode(String defaultLanguageCode) {
		this.defaultLanguageCode = defaultLanguageCode;
		if(defaultLanguageCode != null){
			putQueryParameter("DefaultLanguageCode", defaultLanguageCode);
		}
	}

	public String getUserConsentType() {
		return this.userConsentType;
	}

	public void setUserConsentType(String userConsentType) {
		this.userConsentType = userConsentType;
		if(userConsentType != null){
			putQueryParameter("UserConsentType", userConsentType);
		}
	}

	public List<CustomPrivacyPolicyContents> getCustomPrivacyPolicyContents() {
		return this.customPrivacyPolicyContents;
	}

	public void setCustomPrivacyPolicyContents(List<CustomPrivacyPolicyContents> customPrivacyPolicyContents) {
		this.customPrivacyPolicyContents = customPrivacyPolicyContents;	
		if (customPrivacyPolicyContents != null) {
			for (int depth1 = 0; depth1 < customPrivacyPolicyContents.size(); depth1++) {
				if (customPrivacyPolicyContents.get(depth1) != null) {
					
						putQueryParameter("CustomPrivacyPolicyContents." + (depth1 + 1) + ".CustomPrivacyPolicyTip" , customPrivacyPolicyContents.get(depth1).getCustomPrivacyPolicyTip());
						putQueryParameter("CustomPrivacyPolicyContents." + (depth1 + 1) + ".LanguageCode" , customPrivacyPolicyContents.get(depth1).getLanguageCode());
						if (customPrivacyPolicyContents.get(depth1).getCustomPrivacyPolicyItems() != null) {
							for (int depth2 = 0; depth2 < customPrivacyPolicyContents.get(depth1).getCustomPrivacyPolicyItems().size(); depth2++) {
								if (customPrivacyPolicyContents.get(depth1).getCustomPrivacyPolicyItems().get(depth2) != null) {
									
										putQueryParameter("CustomPrivacyPolicyContents." + (depth1 + 1) + ".CustomPrivacyPolicyItems." + (depth2 + 1) + ".CustomPrivacyPolicyItemUrl" , customPrivacyPolicyContents.get(depth1).getCustomPrivacyPolicyItems().get(depth2).getCustomPrivacyPolicyItemUrl());
										putQueryParameter("CustomPrivacyPolicyContents." + (depth1 + 1) + ".CustomPrivacyPolicyItems." + (depth2 + 1) + ".CustomPrivacyPolicyItemName" , customPrivacyPolicyContents.get(depth1).getCustomPrivacyPolicyItems().get(depth2).getCustomPrivacyPolicyItemName());
								}
							}
						}
				}
			}
		}	
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getCustomPrivacyPolicyName() {
		return this.customPrivacyPolicyName;
	}

	public void setCustomPrivacyPolicyName(String customPrivacyPolicyName) {
		this.customPrivacyPolicyName = customPrivacyPolicyName;
		if(customPrivacyPolicyName != null){
			putQueryParameter("CustomPrivacyPolicyName", customPrivacyPolicyName);
		}
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status);
		}
	}

	public static class CustomPrivacyPolicyContents {

		private String customPrivacyPolicyTip;

		private String languageCode;

		private List<CustomPrivacyPolicyItemsItem> customPrivacyPolicyItems;

		public String getCustomPrivacyPolicyTip() {
			return this.customPrivacyPolicyTip;
		}

		public void setCustomPrivacyPolicyTip(String customPrivacyPolicyTip) {
			this.customPrivacyPolicyTip = customPrivacyPolicyTip;
		}

		public String getLanguageCode() {
			return this.languageCode;
		}

		public void setLanguageCode(String languageCode) {
			this.languageCode = languageCode;
		}

		public List<CustomPrivacyPolicyItemsItem> getCustomPrivacyPolicyItems() {
			return this.customPrivacyPolicyItems;
		}

		public void setCustomPrivacyPolicyItems(List<CustomPrivacyPolicyItemsItem> customPrivacyPolicyItems) {
			this.customPrivacyPolicyItems = customPrivacyPolicyItems;
		}

		public static class CustomPrivacyPolicyItemsItem {

			private String customPrivacyPolicyItemUrl;

			private String customPrivacyPolicyItemName;

			public String getCustomPrivacyPolicyItemUrl() {
				return this.customPrivacyPolicyItemUrl;
			}

			public void setCustomPrivacyPolicyItemUrl(String customPrivacyPolicyItemUrl) {
				this.customPrivacyPolicyItemUrl = customPrivacyPolicyItemUrl;
			}

			public String getCustomPrivacyPolicyItemName() {
				return this.customPrivacyPolicyItemName;
			}

			public void setCustomPrivacyPolicyItemName(String customPrivacyPolicyItemName) {
				this.customPrivacyPolicyItemName = customPrivacyPolicyItemName;
			}
		}
	}

	@Override
	public Class<CreateCustomPrivacyPolicyResponse> getResponseClass() {
		return CreateCustomPrivacyPolicyResponse.class;
	}

}
