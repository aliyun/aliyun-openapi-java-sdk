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

package com.aliyuncs.gpdb.model.v20160503;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.gpdb.transform.v20160503.GetWorkspaceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetWorkspaceResponse extends AcsResponse {

	private String requestId;

	private String createTime;

	private String workspaceId;

	private String workspaceName;

	private List<ServicesItem> services;

	private List<ApiKeysItem> apikeys;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getWorkspaceId() {
		return this.workspaceId;
	}

	public void setWorkspaceId(String workspaceId) {
		this.workspaceId = workspaceId;
	}

	public String getWorkspaceName() {
		return this.workspaceName;
	}

	public void setWorkspaceName(String workspaceName) {
		this.workspaceName = workspaceName;
	}

	public List<ServicesItem> getServices() {
		return this.services;
	}

	public void setServices(List<ServicesItem> services) {
		this.services = services;
	}

	public List<ApiKeysItem> getApikeys() {
		return this.apikeys;
	}

	public void setApikeys(List<ApiKeysItem> apikeys) {
		this.apikeys = apikeys;
	}

	public static class ServicesItem {

		private String status;

		private String cu;

		private String serviceName;

		private String serviceType;

		private String createTime;

		private String payType;

		private String expireTime;

		private String serviceId;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getCu() {
			return this.cu;
		}

		public void setCu(String cu) {
			this.cu = cu;
		}

		public String getServiceName() {
			return this.serviceName;
		}

		public void setServiceName(String serviceName) {
			this.serviceName = serviceName;
		}

		public String getServiceType() {
			return this.serviceType;
		}

		public void setServiceType(String serviceType) {
			this.serviceType = serviceType;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getPayType() {
			return this.payType;
		}

		public void setPayType(String payType) {
			this.payType = payType;
		}

		public String getExpireTime() {
			return this.expireTime;
		}

		public void setExpireTime(String expireTime) {
			this.expireTime = expireTime;
		}

		public String getServiceId() {
			return this.serviceId;
		}

		public void setServiceId(String serviceId) {
			this.serviceId = serviceId;
		}
	}

	public static class ApiKeysItem {

		private String keyName;

		private String description;

		private String createTime;

		private String keyId;

		private String keyPrefix;

		private List<AuthServicesItem> authServices;

		public String getKeyName() {
			return this.keyName;
		}

		public void setKeyName(String keyName) {
			this.keyName = keyName;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getKeyId() {
			return this.keyId;
		}

		public void setKeyId(String keyId) {
			this.keyId = keyId;
		}

		public String getKeyPrefix() {
			return this.keyPrefix;
		}

		public void setKeyPrefix(String keyPrefix) {
			this.keyPrefix = keyPrefix;
		}

		public List<AuthServicesItem> getAuthServices() {
			return this.authServices;
		}

		public void setAuthServices(List<AuthServicesItem> authServices) {
			this.authServices = authServices;
		}

		public static class AuthServicesItem {

			private String serviceType;

			private String serviceId;

			public String getServiceType() {
				return this.serviceType;
			}

			public void setServiceType(String serviceType) {
				this.serviceType = serviceType;
			}

			public String getServiceId() {
				return this.serviceId;
			}

			public void setServiceId(String serviceId) {
				this.serviceId = serviceId;
			}
		}
	}

	@Override
	public GetWorkspaceResponse getInstance(UnmarshallerContext context) {
		return	GetWorkspaceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
