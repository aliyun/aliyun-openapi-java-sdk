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

package com.aliyuncs.ros.model.v20190910;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ros.transform.v20190910.GetServiceProvisionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetServiceProvisionsResponse extends AcsResponse {

	private String requestId;

	private List<ServiceProvision> serviceProvisions;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ServiceProvision> getServiceProvisions() {
		return this.serviceProvisions;
	}

	public void setServiceProvisions(List<ServiceProvision> serviceProvisions) {
		this.serviceProvisions = serviceProvisions;
	}

	public static class ServiceProvision {

		private String serviceName;

		private String status;

		private String statusReason;

		private Boolean autoEnableService;

		private String enableURL;

		private List<String> dependentServiceNames;

		private RoleProvision roleProvision;

		public String getServiceName() {
			return this.serviceName;
		}

		public void setServiceName(String serviceName) {
			this.serviceName = serviceName;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getStatusReason() {
			return this.statusReason;
		}

		public void setStatusReason(String statusReason) {
			this.statusReason = statusReason;
		}

		public Boolean getAutoEnableService() {
			return this.autoEnableService;
		}

		public void setAutoEnableService(Boolean autoEnableService) {
			this.autoEnableService = autoEnableService;
		}

		public String getEnableURL() {
			return this.enableURL;
		}

		public void setEnableURL(String enableURL) {
			this.enableURL = enableURL;
		}

		public List<String> getDependentServiceNames() {
			return this.dependentServiceNames;
		}

		public void setDependentServiceNames(List<String> dependentServiceNames) {
			this.dependentServiceNames = dependentServiceNames;
		}

		public RoleProvision getRoleProvision() {
			return this.roleProvision;
		}

		public void setRoleProvision(RoleProvision roleProvision) {
			this.roleProvision = roleProvision;
		}

		public static class RoleProvision {

			private String authorizationURL;

			private List<Role> roles;

			public String getAuthorizationURL() {
				return this.authorizationURL;
			}

			public void setAuthorizationURL(String authorizationURL) {
				this.authorizationURL = authorizationURL;
			}

			public List<Role> getRoles() {
				return this.roles;
			}

			public void setRoles(List<Role> roles) {
				this.roles = roles;
			}

			public static class Role {

				private String roleName;

				private Boolean created;

				private String function;

				private ApiForCreation apiForCreation;

				public String getRoleName() {
					return this.roleName;
				}

				public void setRoleName(String roleName) {
					this.roleName = roleName;
				}

				public Boolean getCreated() {
					return this.created;
				}

				public void setCreated(Boolean created) {
					this.created = created;
				}

				public String getFunction() {
					return this.function;
				}

				public void setFunction(String function) {
					this.function = function;
				}

				public ApiForCreation getApiForCreation() {
					return this.apiForCreation;
				}

				public void setApiForCreation(ApiForCreation apiForCreation) {
					this.apiForCreation = apiForCreation;
				}

				public static class ApiForCreation {

					private String apiProductId;

					private String apiName;

					private String apiType;

					private Map<Object,Object> parameters;

					public String getApiProductId() {
						return this.apiProductId;
					}

					public void setApiProductId(String apiProductId) {
						this.apiProductId = apiProductId;
					}

					public String getApiName() {
						return this.apiName;
					}

					public void setApiName(String apiName) {
						this.apiName = apiName;
					}

					public String getApiType() {
						return this.apiType;
					}

					public void setApiType(String apiType) {
						this.apiType = apiType;
					}

					public Map<Object,Object> getParameters() {
						return this.parameters;
					}

					public void setParameters(Map<Object,Object> parameters) {
						this.parameters = parameters;
					}
				}
			}
		}
	}

	@Override
	public GetServiceProvisionsResponse getInstance(UnmarshallerContext context) {
		return	GetServiceProvisionsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
