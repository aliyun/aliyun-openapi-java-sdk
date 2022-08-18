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
public class SetApplicationProvisioningConfigRequest extends RpcAcsRequest<SetApplicationProvisioningConfigResponse> {
	   

	private String provisionProtocolType;

	private String applicationId;

	private CallbackProvisioningConfig callbackProvisioningConfig;

	private String instanceId;

	private Boolean provisionPassword;
	public SetApplicationProvisioningConfigRequest() {
		super("Eiam", "2021-12-01", "SetApplicationProvisioningConfig", "eiam");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getProvisionProtocolType() {
		return this.provisionProtocolType;
	}

	public void setProvisionProtocolType(String provisionProtocolType) {
		this.provisionProtocolType = provisionProtocolType;
		if(provisionProtocolType != null){
			putQueryParameter("ProvisionProtocolType", provisionProtocolType);
		}
	}

	public String getApplicationId() {
		return this.applicationId;
	}

	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
		if(applicationId != null){
			putQueryParameter("ApplicationId", applicationId);
		}
	}

	public CallbackProvisioningConfig getCallbackProvisioningConfig() {
		return this.callbackProvisioningConfig;
	}

	public void setCallbackProvisioningConfig(CallbackProvisioningConfig callbackProvisioningConfig) {
		this.callbackProvisioningConfig = callbackProvisioningConfig;	
		if (callbackProvisioningConfig != null) {
			
				if (callbackProvisioningConfig.getListenEventScopes() != null) {
					for (int depth1 = 0; depth1 < callbackProvisioningConfig.getListenEventScopes().size(); depth1++) {
						putQueryParameter("CallbackProvisioningConfig.ListenEventScopes." + (depth1 + 1) , callbackProvisioningConfig.getListenEventScopes().get(depth1));
					}
				}
				putQueryParameter("CallbackProvisioningConfig.EncryptRequired" , callbackProvisioningConfig.getEncryptRequired());
				putQueryParameter("CallbackProvisioningConfig.CallbackUrl" , callbackProvisioningConfig.getCallbackUrl());
				putQueryParameter("CallbackProvisioningConfig.EncryptKey" , callbackProvisioningConfig.getEncryptKey());
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

	public Boolean getProvisionPassword() {
		return this.provisionPassword;
	}

	public void setProvisionPassword(Boolean provisionPassword) {
		this.provisionPassword = provisionPassword;
		if(provisionPassword != null){
			putQueryParameter("ProvisionPassword", provisionPassword.toString());
		}
	}

	public static class CallbackProvisioningConfig {

		private List<String> listenEventScopes;

		private Boolean encryptRequired;

		private String callbackUrl;

		private String encryptKey;

		public List<String> getListenEventScopes() {
			return this.listenEventScopes;
		}

		public void setListenEventScopes(List<String> listenEventScopes) {
			this.listenEventScopes = listenEventScopes;
		}

		public Boolean getEncryptRequired() {
			return this.encryptRequired;
		}

		public void setEncryptRequired(Boolean encryptRequired) {
			this.encryptRequired = encryptRequired;
		}

		public String getCallbackUrl() {
			return this.callbackUrl;
		}

		public void setCallbackUrl(String callbackUrl) {
			this.callbackUrl = callbackUrl;
		}

		public String getEncryptKey() {
			return this.encryptKey;
		}

		public void setEncryptKey(String encryptKey) {
			this.encryptKey = encryptKey;
		}
	}

	@Override
	public Class<SetApplicationProvisioningConfigResponse> getResponseClass() {
		return SetApplicationProvisioningConfigResponse.class;
	}

}
