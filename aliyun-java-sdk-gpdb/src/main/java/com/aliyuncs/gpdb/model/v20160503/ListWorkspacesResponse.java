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
import com.aliyuncs.gpdb.transform.v20160503.ListWorkspacesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListWorkspacesResponse extends AcsResponse {

	private Integer totalRecordCount;

	private Integer pageRecordCount;

	private String requestId;

	private String nextToken;

	private Integer pageNumber;

	private Integer maxResults;

	private List<ItemsItem> items;

	public Integer getTotalRecordCount() {
		return this.totalRecordCount;
	}

	public void setTotalRecordCount(Integer totalRecordCount) {
		this.totalRecordCount = totalRecordCount;
	}

	public Integer getPageRecordCount() {
		return this.pageRecordCount;
	}

	public void setPageRecordCount(Integer pageRecordCount) {
		this.pageRecordCount = pageRecordCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public List<ItemsItem> getItems() {
		return this.items;
	}

	public void setItems(List<ItemsItem> items) {
		this.items = items;
	}

	public static class ItemsItem {

		private String createTime;

		private String workspaceId;

		private String workspaceName;

		private List<ServicesItem> services;

		private List<ApiKeysItem> apikeys;

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

			private Boolean deletionProtection;

			private String expireTime;

			private String plan;

			private String serviceId;

			private List<ComponentsItem> components;

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

			public Boolean getDeletionProtection() {
				return this.deletionProtection;
			}

			public void setDeletionProtection(Boolean deletionProtection) {
				this.deletionProtection = deletionProtection;
			}

			public String getExpireTime() {
				return this.expireTime;
			}

			public void setExpireTime(String expireTime) {
				this.expireTime = expireTime;
			}

			public String getPlan() {
				return this.plan;
			}

			public void setPlan(String plan) {
				this.plan = plan;
			}

			public String getServiceId() {
				return this.serviceId;
			}

			public void setServiceId(String serviceId) {
				this.serviceId = serviceId;
			}

			public List<ComponentsItem> getComponents() {
				return this.components;
			}

			public void setComponents(List<ComponentsItem> components) {
				this.components = components;
			}

			public static class ComponentsItem {

				private String status;

				private String componentType;

				private String cu;

				private String componentId;

				private String createTime;

				private Boolean deletionProtection;

				public String getStatus() {
					return this.status;
				}

				public void setStatus(String status) {
					this.status = status;
				}

				public String getComponentType() {
					return this.componentType;
				}

				public void setComponentType(String componentType) {
					this.componentType = componentType;
				}

				public String getCu() {
					return this.cu;
				}

				public void setCu(String cu) {
					this.cu = cu;
				}

				public String getComponentId() {
					return this.componentId;
				}

				public void setComponentId(String componentId) {
					this.componentId = componentId;
				}

				public String getCreateTime() {
					return this.createTime;
				}

				public void setCreateTime(String createTime) {
					this.createTime = createTime;
				}

				public Boolean getDeletionProtection() {
					return this.deletionProtection;
				}

				public void setDeletionProtection(Boolean deletionProtection) {
					this.deletionProtection = deletionProtection;
				}
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
	}

	@Override
	public ListWorkspacesResponse getInstance(UnmarshallerContext context) {
		return	ListWorkspacesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
