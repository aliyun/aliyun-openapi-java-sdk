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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.eiam.transform.v20211201.GetApplicationProvisioningConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetApplicationProvisioningConfigResponse extends AcsResponse {

	private String requestId;

	private ApplicationProvisioningConfig applicationProvisioningConfig;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public ApplicationProvisioningConfig getApplicationProvisioningConfig() {
		return this.applicationProvisioningConfig;
	}

	public void setApplicationProvisioningConfig(ApplicationProvisioningConfig applicationProvisioningConfig) {
		this.applicationProvisioningConfig = applicationProvisioningConfig;
	}

	public static class ApplicationProvisioningConfig {

		private String instanceId;

		private String applicationId;

		private String provisionProtocolType;

		private String provisionJwksEndpoint;

		private Boolean provisionPassword;

		private String status;

		private CallbackProvisioningConfig callbackProvisioningConfig;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getApplicationId() {
			return this.applicationId;
		}

		public void setApplicationId(String applicationId) {
			this.applicationId = applicationId;
		}

		public String getProvisionProtocolType() {
			return this.provisionProtocolType;
		}

		public void setProvisionProtocolType(String provisionProtocolType) {
			this.provisionProtocolType = provisionProtocolType;
		}

		public String getProvisionJwksEndpoint() {
			return this.provisionJwksEndpoint;
		}

		public void setProvisionJwksEndpoint(String provisionJwksEndpoint) {
			this.provisionJwksEndpoint = provisionJwksEndpoint;
		}

		public Boolean getProvisionPassword() {
			return this.provisionPassword;
		}

		public void setProvisionPassword(Boolean provisionPassword) {
			this.provisionPassword = provisionPassword;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public CallbackProvisioningConfig getCallbackProvisioningConfig() {
			return this.callbackProvisioningConfig;
		}

		public void setCallbackProvisioningConfig(CallbackProvisioningConfig callbackProvisioningConfig) {
			this.callbackProvisioningConfig = callbackProvisioningConfig;
		}

		public static class CallbackProvisioningConfig {

			private String callbackUrl;

			private String encryptKey;

			private Boolean encryptRequired;

			private List<String> listenEventScopes;

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

			public Boolean getEncryptRequired() {
				return this.encryptRequired;
			}

			public void setEncryptRequired(Boolean encryptRequired) {
				this.encryptRequired = encryptRequired;
			}

			public List<String> getListenEventScopes() {
				return this.listenEventScopes;
			}

			public void setListenEventScopes(List<String> listenEventScopes) {
				this.listenEventScopes = listenEventScopes;
			}
		}
	}

	@Override
	public GetApplicationProvisioningConfigResponse getInstance(UnmarshallerContext context) {
		return	GetApplicationProvisioningConfigResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
