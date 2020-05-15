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

package com.aliyuncs.sofa.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.QueryRmsAppviewAppsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryRmsAppviewAppsResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private Response response;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public Response getResponse() {
		return this.response;
	}

	public void setResponse(Response response) {
		this.response = response;
	}

	public static class Response {

		private Long currentPage;

		private Long pageSize;

		private Long totalSize;

		private List<ResultItem> result;

		public Long getCurrentPage() {
			return this.currentPage;
		}

		public void setCurrentPage(Long currentPage) {
			this.currentPage = currentPage;
		}

		public Long getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Long pageSize) {
			this.pageSize = pageSize;
		}

		public Long getTotalSize() {
			return this.totalSize;
		}

		public void setTotalSize(Long totalSize) {
			this.totalSize = totalSize;
		}

		public List<ResultItem> getResult() {
			return this.result;
		}

		public void setResult(List<ResultItem> result) {
			this.result = result;
		}

		public static class ResultItem {

			private String appId;

			private String appName;

			private String levelId;

			private String levelName;

			private String ownerId;

			private String ownerName;

			private String stackId;

			private String stackName;

			private List<AppDomainsItem> appDomains;

			private List<DataByResourceTypeItem> dataByResourceType;

			private List<ItemTypeAlertingItem> itemTypeAlerting;

			private List<ItemTypeConfiguredItem> itemTypeConfigured;

			private List<ResourceIdsItem> resourceIds;

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

			public String getLevelId() {
				return this.levelId;
			}

			public void setLevelId(String levelId) {
				this.levelId = levelId;
			}

			public String getLevelName() {
				return this.levelName;
			}

			public void setLevelName(String levelName) {
				this.levelName = levelName;
			}

			public String getOwnerId() {
				return this.ownerId;
			}

			public void setOwnerId(String ownerId) {
				this.ownerId = ownerId;
			}

			public String getOwnerName() {
				return this.ownerName;
			}

			public void setOwnerName(String ownerName) {
				this.ownerName = ownerName;
			}

			public String getStackId() {
				return this.stackId;
			}

			public void setStackId(String stackId) {
				this.stackId = stackId;
			}

			public String getStackName() {
				return this.stackName;
			}

			public void setStackName(String stackName) {
				this.stackName = stackName;
			}

			public List<AppDomainsItem> getAppDomains() {
				return this.appDomains;
			}

			public void setAppDomains(List<AppDomainsItem> appDomains) {
				this.appDomains = appDomains;
			}

			public List<DataByResourceTypeItem> getDataByResourceType() {
				return this.dataByResourceType;
			}

			public void setDataByResourceType(List<DataByResourceTypeItem> dataByResourceType) {
				this.dataByResourceType = dataByResourceType;
			}

			public List<ItemTypeAlertingItem> getItemTypeAlerting() {
				return this.itemTypeAlerting;
			}

			public void setItemTypeAlerting(List<ItemTypeAlertingItem> itemTypeAlerting) {
				this.itemTypeAlerting = itemTypeAlerting;
			}

			public List<ItemTypeConfiguredItem> getItemTypeConfigured() {
				return this.itemTypeConfigured;
			}

			public void setItemTypeConfigured(List<ItemTypeConfiguredItem> itemTypeConfigured) {
				this.itemTypeConfigured = itemTypeConfigured;
			}

			public List<ResourceIdsItem> getResourceIds() {
				return this.resourceIds;
			}

			public void setResourceIds(List<ResourceIdsItem> resourceIds) {
				this.resourceIds = resourceIds;
			}

			public static class AppDomainsItem {

				private String id;

				private String name;

				public String getId() {
					return this.id;
				}

				public void setId(String id) {
					this.id = id;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}
			}

			public static class DataByResourceTypeItem {

				private String resourceAlertCount;

				private String resourceAllCount;

				private String resourceNormalCount;

				private String resourceType;

				private String resourceUnconfigedCount;

				private List<String> alertResourceIds;

				private List<String> allResourceIds;

				private List<String> monitorPorts;

				private List<String> normalResourceIds;

				private List<String> unconfigedResourceIds;

				private Data data;

				public String getResourceAlertCount() {
					return this.resourceAlertCount;
				}

				public void setResourceAlertCount(String resourceAlertCount) {
					this.resourceAlertCount = resourceAlertCount;
				}

				public String getResourceAllCount() {
					return this.resourceAllCount;
				}

				public void setResourceAllCount(String resourceAllCount) {
					this.resourceAllCount = resourceAllCount;
				}

				public String getResourceNormalCount() {
					return this.resourceNormalCount;
				}

				public void setResourceNormalCount(String resourceNormalCount) {
					this.resourceNormalCount = resourceNormalCount;
				}

				public String getResourceType() {
					return this.resourceType;
				}

				public void setResourceType(String resourceType) {
					this.resourceType = resourceType;
				}

				public String getResourceUnconfigedCount() {
					return this.resourceUnconfigedCount;
				}

				public void setResourceUnconfigedCount(String resourceUnconfigedCount) {
					this.resourceUnconfigedCount = resourceUnconfigedCount;
				}

				public List<String> getAlertResourceIds() {
					return this.alertResourceIds;
				}

				public void setAlertResourceIds(List<String> alertResourceIds) {
					this.alertResourceIds = alertResourceIds;
				}

				public List<String> getAllResourceIds() {
					return this.allResourceIds;
				}

				public void setAllResourceIds(List<String> allResourceIds) {
					this.allResourceIds = allResourceIds;
				}

				public List<String> getMonitorPorts() {
					return this.monitorPorts;
				}

				public void setMonitorPorts(List<String> monitorPorts) {
					this.monitorPorts = monitorPorts;
				}

				public List<String> getNormalResourceIds() {
					return this.normalResourceIds;
				}

				public void setNormalResourceIds(List<String> normalResourceIds) {
					this.normalResourceIds = normalResourceIds;
				}

				public List<String> getUnconfigedResourceIds() {
					return this.unconfigedResourceIds;
				}

				public void setUnconfigedResourceIds(List<String> unconfigedResourceIds) {
					this.unconfigedResourceIds = unconfigedResourceIds;
				}

				public Data getData() {
					return this.data;
				}

				public void setData(Data data) {
					this.data = data;
				}

				public static class Data {

					private String appId;

					private String appName;

					private Boolean monitorEnable;

					private String monitorPort;

					private String normalResourceIds;

					private String resourcesAlertCount;

					private String resourcesCount;

					private String resourcesNormalCount;

					private String resourcesUnconfigedCount;

					private String resourceType;

					private List<String> alertResourceIds1;

					private List<String> itemTypeConfig;

					private List<String> itemTypeNoneConfig;

					private List<String> itemTypePartialConfig;

					private List<String> resourceIds2;

					private List<String> unconfigedResourceIds3;

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

					public Boolean getMonitorEnable() {
						return this.monitorEnable;
					}

					public void setMonitorEnable(Boolean monitorEnable) {
						this.monitorEnable = monitorEnable;
					}

					public String getMonitorPort() {
						return this.monitorPort;
					}

					public void setMonitorPort(String monitorPort) {
						this.monitorPort = monitorPort;
					}

					public String getNormalResourceIds() {
						return this.normalResourceIds;
					}

					public void setNormalResourceIds(String normalResourceIds) {
						this.normalResourceIds = normalResourceIds;
					}

					public String getResourcesAlertCount() {
						return this.resourcesAlertCount;
					}

					public void setResourcesAlertCount(String resourcesAlertCount) {
						this.resourcesAlertCount = resourcesAlertCount;
					}

					public String getResourcesCount() {
						return this.resourcesCount;
					}

					public void setResourcesCount(String resourcesCount) {
						this.resourcesCount = resourcesCount;
					}

					public String getResourcesNormalCount() {
						return this.resourcesNormalCount;
					}

					public void setResourcesNormalCount(String resourcesNormalCount) {
						this.resourcesNormalCount = resourcesNormalCount;
					}

					public String getResourcesUnconfigedCount() {
						return this.resourcesUnconfigedCount;
					}

					public void setResourcesUnconfigedCount(String resourcesUnconfigedCount) {
						this.resourcesUnconfigedCount = resourcesUnconfigedCount;
					}

					public String getResourceType() {
						return this.resourceType;
					}

					public void setResourceType(String resourceType) {
						this.resourceType = resourceType;
					}

					public List<String> getAlertResourceIds1() {
						return this.alertResourceIds1;
					}

					public void setAlertResourceIds1(List<String> alertResourceIds1) {
						this.alertResourceIds1 = alertResourceIds1;
					}

					public List<String> getItemTypeConfig() {
						return this.itemTypeConfig;
					}

					public void setItemTypeConfig(List<String> itemTypeConfig) {
						this.itemTypeConfig = itemTypeConfig;
					}

					public List<String> getItemTypeNoneConfig() {
						return this.itemTypeNoneConfig;
					}

					public void setItemTypeNoneConfig(List<String> itemTypeNoneConfig) {
						this.itemTypeNoneConfig = itemTypeNoneConfig;
					}

					public List<String> getItemTypePartialConfig() {
						return this.itemTypePartialConfig;
					}

					public void setItemTypePartialConfig(List<String> itemTypePartialConfig) {
						this.itemTypePartialConfig = itemTypePartialConfig;
					}

					public List<String> getResourceIds2() {
						return this.resourceIds2;
					}

					public void setResourceIds2(List<String> resourceIds2) {
						this.resourceIds2 = resourceIds2;
					}

					public List<String> getUnconfigedResourceIds3() {
						return this.unconfigedResourceIds3;
					}

					public void setUnconfigedResourceIds3(List<String> unconfigedResourceIds3) {
						this.unconfigedResourceIds3 = unconfigedResourceIds3;
					}
				}
			}

			public static class ItemTypeAlertingItem {

				private String key;

				private List<String> values;

				public String getKey() {
					return this.key;
				}

				public void setKey(String key) {
					this.key = key;
				}

				public List<String> getValues() {
					return this.values;
				}

				public void setValues(List<String> values) {
					this.values = values;
				}
			}

			public static class ItemTypeConfiguredItem {

				private String key;

				private List<String> values4;

				public String getKey() {
					return this.key;
				}

				public void setKey(String key) {
					this.key = key;
				}

				public List<String> getValues4() {
					return this.values4;
				}

				public void setValues4(List<String> values4) {
					this.values4 = values4;
				}
			}

			public static class ResourceIdsItem {

				private String key;

				private List<String> values5;

				public String getKey() {
					return this.key;
				}

				public void setKey(String key) {
					this.key = key;
				}

				public List<String> getValues5() {
					return this.values5;
				}

				public void setValues5(List<String> values5) {
					this.values5 = values5;
				}
			}
		}
	}

	@Override
	public QueryRmsAppviewAppsResponse getInstance(UnmarshallerContext context) {
		return	QueryRmsAppviewAppsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
