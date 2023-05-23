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

package com.aliyuncs.mse.model.v20190531;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.mse.transform.v20190531.ListAuthPolicyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAuthPolicyResponse extends AcsResponse {

	private Integer httpStatusCode;

	private String message;

	private String requestId;

	private Integer code;

	private Boolean success;

	private Data data;

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer totalSize;

		private Integer pageNumber;

		private Integer pageSize;

		private List<Policy> result;

		public Integer getTotalSize() {
			return this.totalSize;
		}

		public void setTotalSize(Integer totalSize) {
			this.totalSize = totalSize;
		}

		public Integer getPageNumber() {
			return this.pageNumber;
		}

		public void setPageNumber(Integer pageNumber) {
			this.pageNumber = pageNumber;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public List<Policy> getResult() {
			return this.result;
		}

		public void setResult(List<Policy> result) {
			this.result = result;
		}

		public static class Policy {

			private Integer status;

			private String namespaceId;

			private String protocol;

			private String accountId;

			private String source;

			private String regionId;

			private String appName;

			private String appId;

			private String name;

			private Integer id;

			private Boolean enable;

			private Integer authType;

			private String k8sNamespace;

			private List<AuthRuleItem> authRule;

			public Integer getStatus() {
				return this.status;
			}

			public void setStatus(Integer status) {
				this.status = status;
			}

			public String getNamespaceId() {
				return this.namespaceId;
			}

			public void setNamespaceId(String namespaceId) {
				this.namespaceId = namespaceId;
			}

			public String getBizProtocol() {
				return this.protocol;
			}

			public void setBizProtocol(String protocol) {
				this.protocol = protocol;
			}

			public String getAccountId() {
				return this.accountId;
			}

			public void setAccountId(String accountId) {
				this.accountId = accountId;
			}

			public String getSource() {
				return this.source;
			}

			public void setSource(String source) {
				this.source = source;
			}

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}

			public String getAppName() {
				return this.appName;
			}

			public void setAppName(String appName) {
				this.appName = appName;
			}

			public String getAppId() {
				return this.appId;
			}

			public void setAppId(String appId) {
				this.appId = appId;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public Integer getId() {
				return this.id;
			}

			public void setId(Integer id) {
				this.id = id;
			}

			public Boolean getEnable() {
				return this.enable;
			}

			public void setEnable(Boolean enable) {
				this.enable = enable;
			}

			public Integer getAuthType() {
				return this.authType;
			}

			public void setAuthType(Integer authType) {
				this.authType = authType;
			}

			public String getK8sNamespace() {
				return this.k8sNamespace;
			}

			public void setK8sNamespace(String k8sNamespace) {
				this.k8sNamespace = k8sNamespace;
			}

			public List<AuthRuleItem> getAuthRule() {
				return this.authRule;
			}

			public void setAuthRule(List<AuthRuleItem> authRule) {
				this.authRule = authRule;
			}

			public static class AuthRuleItem {

				private Boolean black;

				private String path;

				private Integer authType;

				private List<String> appIds;

				private List<String> k8sNamespaces;

				private Method method;

				public Boolean getBlack() {
					return this.black;
				}

				public void setBlack(Boolean black) {
					this.black = black;
				}

				public String getPath() {
					return this.path;
				}

				public void setPath(String path) {
					this.path = path;
				}

				public Integer getAuthType() {
					return this.authType;
				}

				public void setAuthType(Integer authType) {
					this.authType = authType;
				}

				public List<String> getAppIds() {
					return this.appIds;
				}

				public void setAppIds(List<String> appIds) {
					this.appIds = appIds;
				}

				public List<String> getK8sNamespaces() {
					return this.k8sNamespaces;
				}

				public void setK8sNamespaces(List<String> k8sNamespaces) {
					this.k8sNamespaces = k8sNamespaces;
				}

				public Method getBizMethod() {
					return this.method;
				}

				public void setBizMethod(Method method) {
					this.method = method;
				}

				public static class Method {

					private String version;

					private String serviceName;

					private String name;

					private String group;

					private String returnType;

					private List<String> parameterTypes;

					public String getVersion() {
						return this.version;
					}

					public void setVersion(String version) {
						this.version = version;
					}

					public String getServiceName() {
						return this.serviceName;
					}

					public void setServiceName(String serviceName) {
						this.serviceName = serviceName;
					}

					public String getName() {
						return this.name;
					}

					public void setName(String name) {
						this.name = name;
					}

					public String getGroup() {
						return this.group;
					}

					public void setGroup(String group) {
						this.group = group;
					}

					public String getReturnType() {
						return this.returnType;
					}

					public void setReturnType(String returnType) {
						this.returnType = returnType;
					}

					public List<String> getParameterTypes() {
						return this.parameterTypes;
					}

					public void setParameterTypes(List<String> parameterTypes) {
						this.parameterTypes = parameterTypes;
					}
				}
			}
		}
	}

	@Override
	public ListAuthPolicyResponse getInstance(UnmarshallerContext context) {
		return	ListAuthPolicyResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
