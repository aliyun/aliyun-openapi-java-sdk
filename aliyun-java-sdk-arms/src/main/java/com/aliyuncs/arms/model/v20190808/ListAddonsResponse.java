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

package com.aliyuncs.arms.model.v20190808;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.arms.transform.v20190808.ListAddonsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAddonsResponse extends AcsResponse {

	private String requestId;

	private Integer code;

	private String message;

	private Boolean success;

	private List<DataItem> data;

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

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String alias;

		private String description;

		private String icon;

		private String language;

		private String name;

		private Boolean once;

		private String scene;

		private String version;

		private String weight;

		private String latestReleaseCreateTime;

		private List<DashboardsItem> dashboards;

		private List<EnvironmentsItem> environments;

		private List<String> categories;

		private List<String> keywords;

		public String getAlias() {
			return this.alias;
		}

		public void setAlias(String alias) {
			this.alias = alias;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getIcon() {
			return this.icon;
		}

		public void setIcon(String icon) {
			this.icon = icon;
		}

		public String getLanguage() {
			return this.language;
		}

		public void setLanguage(String language) {
			this.language = language;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Boolean getOnce() {
			return this.once;
		}

		public void setOnce(Boolean once) {
			this.once = once;
		}

		public String getScene() {
			return this.scene;
		}

		public void setScene(String scene) {
			this.scene = scene;
		}

		public String getVersion() {
			return this.version;
		}

		public void setVersion(String version) {
			this.version = version;
		}

		public String getWeight() {
			return this.weight;
		}

		public void setWeight(String weight) {
			this.weight = weight;
		}

		public String getLatestReleaseCreateTime() {
			return this.latestReleaseCreateTime;
		}

		public void setLatestReleaseCreateTime(String latestReleaseCreateTime) {
			this.latestReleaseCreateTime = latestReleaseCreateTime;
		}

		public List<DashboardsItem> getDashboards() {
			return this.dashboards;
		}

		public void setDashboards(List<DashboardsItem> dashboards) {
			this.dashboards = dashboards;
		}

		public List<EnvironmentsItem> getEnvironments() {
			return this.environments;
		}

		public void setEnvironments(List<EnvironmentsItem> environments) {
			this.environments = environments;
		}

		public List<String> getCategories() {
			return this.categories;
		}

		public void setCategories(List<String> categories) {
			this.categories = categories;
		}

		public List<String> getKeywords() {
			return this.keywords;
		}

		public void setKeywords(List<String> keywords) {
			this.keywords = keywords;
		}

		public static class DashboardsItem {

			private String description;

			private String name;

			private String url;

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getUrl() {
				return this.url;
			}

			public void setUrl(String url) {
				this.url = url;
			}
		}

		public static class EnvironmentsItem {

			private String description;

			private Boolean enable;

			private String label;

			private String name;

			private Dependencies dependencies;

			private Policies policies;

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public Boolean getEnable() {
				return this.enable;
			}

			public void setEnable(Boolean enable) {
				this.enable = enable;
			}

			public String getLabel() {
				return this.label;
			}

			public void setLabel(String label) {
				this.label = label;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public Dependencies getDependencies() {
				return this.dependencies;
			}

			public void setDependencies(Dependencies dependencies) {
				this.dependencies = dependencies;
			}

			public Policies getPolicies() {
				return this.policies;
			}

			public void setPolicies(Policies policies) {
				this.policies = policies;
			}

			public static class Dependencies {

				private Map<Object,Object> features;

				private List<String> services;

				private List<String> clusterTypes;

				public Map<Object,Object> getFeatures() {
					return this.features;
				}

				public void setFeatures(Map<Object,Object> features) {
					this.features = features;
				}

				public List<String> getServices() {
					return this.services;
				}

				public void setServices(List<String> services) {
					this.services = services;
				}

				public List<String> getClusterTypes() {
					return this.clusterTypes;
				}

				public void setClusterTypes(List<String> clusterTypes) {
					this.clusterTypes = clusterTypes;
				}
			}

			public static class Policies {

				private String alertDefaultStatus;

				private Boolean defaultInstall;

				private String targetAddonName;

				private Boolean enableServiceAccount;

				private Boolean needRestartAfterIntegration;

				private List<ProtocolsItem> protocols;

				private MetricCheckRule metricCheckRule;

				public String getAlertDefaultStatus() {
					return this.alertDefaultStatus;
				}

				public void setAlertDefaultStatus(String alertDefaultStatus) {
					this.alertDefaultStatus = alertDefaultStatus;
				}

				public Boolean getDefaultInstall() {
					return this.defaultInstall;
				}

				public void setDefaultInstall(Boolean defaultInstall) {
					this.defaultInstall = defaultInstall;
				}

				public String getTargetAddonName() {
					return this.targetAddonName;
				}

				public void setTargetAddonName(String targetAddonName) {
					this.targetAddonName = targetAddonName;
				}

				public Boolean getEnableServiceAccount() {
					return this.enableServiceAccount;
				}

				public void setEnableServiceAccount(Boolean enableServiceAccount) {
					this.enableServiceAccount = enableServiceAccount;
				}

				public Boolean getNeedRestartAfterIntegration() {
					return this.needRestartAfterIntegration;
				}

				public void setNeedRestartAfterIntegration(Boolean needRestartAfterIntegration) {
					this.needRestartAfterIntegration = needRestartAfterIntegration;
				}

				public List<ProtocolsItem> getProtocols() {
					return this.protocols;
				}

				public void setProtocols(List<ProtocolsItem> protocols) {
					this.protocols = protocols;
				}

				public MetricCheckRule getMetricCheckRule() {
					return this.metricCheckRule;
				}

				public void setMetricCheckRule(MetricCheckRule metricCheckRule) {
					this.metricCheckRule = metricCheckRule;
				}

				public static class ProtocolsItem {

					private String name;

					private String label;

					private String icon;

					private String description;

					public String getName() {
						return this.name;
					}

					public void setName(String name) {
						this.name = name;
					}

					public String getLabel() {
						return this.label;
					}

					public void setLabel(String label) {
						this.label = label;
					}

					public String getIcon() {
						return this.icon;
					}

					public void setIcon(String icon) {
						this.icon = icon;
					}

					public String getDescription() {
						return this.description;
					}

					public void setDescription(String description) {
						this.description = description;
					}
				}

				public static class MetricCheckRule {

					private List<String> promQL;

					public List<String> getPromQL() {
						return this.promQL;
					}

					public void setPromQL(List<String> promQL) {
						this.promQL = promQL;
					}
				}
			}
		}
	}

	@Override
	public ListAddonsResponse getInstance(UnmarshallerContext context) {
		return	ListAddonsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
