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

package com.aliyuncs.edas.model.v20170801;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.edas.transform.v20170801.ListK8sIngressRulesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListK8sIngressRulesResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private List<IngressConfigsItem> ingressConfigs;

	private List<DataItem> data;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
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

	public List<IngressConfigsItem> getIngressConfigs() {
		return this.ingressConfigs;
	}

	public void setIngressConfigs(List<IngressConfigsItem> ingressConfigs) {
		this.ingressConfigs = ingressConfigs;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class IngressConfigsItem {

		private String clusterId;

		private String clusterName;

		private String regionId;

		private List<IngressRulesItem> ingressRules;

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}

		public String getClusterName() {
			return this.clusterName;
		}

		public void setClusterName(String clusterName) {
			this.clusterName = clusterName;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public List<IngressRulesItem> getIngressRules() {
			return this.ingressRules;
		}

		public void setIngressRules(List<IngressRulesItem> ingressRules) {
			this.ingressRules = ingressRules;
		}

		public static class IngressRulesItem {

			private String name;

			private String namespace;

			private String endpoint;

			private String creationTime;

			private List<IngressPathsItem> ingressPaths;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getNamespace() {
				return this.namespace;
			}

			public void setNamespace(String namespace) {
				this.namespace = namespace;
			}

			public String getEndpoint() {
				return this.endpoint;
			}

			public void setEndpoint(String endpoint) {
				this.endpoint = endpoint;
			}

			public String getCreationTime() {
				return this.creationTime;
			}

			public void setCreationTime(String creationTime) {
				this.creationTime = creationTime;
			}

			public List<IngressPathsItem> getIngressPaths() {
				return this.ingressPaths;
			}

			public void setIngressPaths(List<IngressPathsItem> ingressPaths) {
				this.ingressPaths = ingressPaths;
			}

			public static class IngressPathsItem {

				private String host;

				private String path;

				private String appName;

				private String serviceName;

				private Integer servicePort;

				private String appId;

				private String status;

				public String getHost() {
					return this.host;
				}

				public void setHost(String host) {
					this.host = host;
				}

				public String getPath() {
					return this.path;
				}

				public void setPath(String path) {
					this.path = path;
				}

				public String getAppName() {
					return this.appName;
				}

				public void setAppName(String appName) {
					this.appName = appName;
				}

				public String getServiceName() {
					return this.serviceName;
				}

				public void setServiceName(String serviceName) {
					this.serviceName = serviceName;
				}

				public Integer getServicePort() {
					return this.servicePort;
				}

				public void setServicePort(Integer servicePort) {
					this.servicePort = servicePort;
				}

				public String getAppId() {
					return this.appId;
				}

				public void setAppId(String appId) {
					this.appId = appId;
				}

				public String getStatus() {
					return this.status;
				}

				public void setStatus(String status) {
					this.status = status;
				}
			}
		}
	}

	public static class DataItem {

		private String clusterId;

		private String clusterName;

		private String regionId;

		private List<IngressConfsItem> ingressConfs;

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}

		public String getClusterName() {
			return this.clusterName;
		}

		public void setClusterName(String clusterName) {
			this.clusterName = clusterName;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public List<IngressConfsItem> getIngressConfs() {
			return this.ingressConfs;
		}

		public void setIngressConfs(List<IngressConfsItem> ingressConfs) {
			this.ingressConfs = ingressConfs;
		}

		public static class IngressConfsItem {

			private String name;

			private String namespace;

			private String endpoint;

			private String creationTime;

			private String dashboardUrl;

			private List<RulesItem> rules;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getNamespace() {
				return this.namespace;
			}

			public void setNamespace(String namespace) {
				this.namespace = namespace;
			}

			public String getEndpoint() {
				return this.endpoint;
			}

			public void setEndpoint(String endpoint) {
				this.endpoint = endpoint;
			}

			public String getCreationTime() {
				return this.creationTime;
			}

			public void setCreationTime(String creationTime) {
				this.creationTime = creationTime;
			}

			public String getDashboardUrl() {
				return this.dashboardUrl;
			}

			public void setDashboardUrl(String dashboardUrl) {
				this.dashboardUrl = dashboardUrl;
			}

			public List<RulesItem> getRules() {
				return this.rules;
			}

			public void setRules(List<RulesItem> rules) {
				this.rules = rules;
			}

			public static class RulesItem {

				private String host;

				private String secretName;

				private List<PathsItem> paths;

				public String getHost() {
					return this.host;
				}

				public void setHost(String host) {
					this.host = host;
				}

				public String getSecretName() {
					return this.secretName;
				}

				public void setSecretName(String secretName) {
					this.secretName = secretName;
				}

				public List<PathsItem> getPaths() {
					return this.paths;
				}

				public void setPaths(List<PathsItem> paths) {
					this.paths = paths;
				}

				public static class PathsItem {

					private String path;

					private String appId;

					private String appName;

					private String status;

					private Backend backend;

					public String getPath() {
						return this.path;
					}

					public void setPath(String path) {
						this.path = path;
					}

					public String getAppId() {
						return this.appId;
					}

					public void setAppId(String appId) {
						this.appId = appId;
					}

					public String getAppName() {
						return this.appName;
					}

					public void setAppName(String appName) {
						this.appName = appName;
					}

					public String getStatus() {
						return this.status;
					}

					public void setStatus(String status) {
						this.status = status;
					}

					public Backend getBackend() {
						return this.backend;
					}

					public void setBackend(Backend backend) {
						this.backend = backend;
					}

					public static class Backend {

						private String serviceName;

						private String servicePort;

						public String getServiceName() {
							return this.serviceName;
						}

						public void setServiceName(String serviceName) {
							this.serviceName = serviceName;
						}

						public String getServicePort() {
							return this.servicePort;
						}

						public void setServicePort(String servicePort) {
							this.servicePort = servicePort;
						}
					}
				}
			}
		}
	}

	@Override
	public ListK8sIngressRulesResponse getInstance(UnmarshallerContext context) {
		return	ListK8sIngressRulesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
