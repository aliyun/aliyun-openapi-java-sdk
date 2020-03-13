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
import com.aliyuncs.sofa.transform.v20190815.QueryRmsResourcesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryRmsResourcesResponse extends AcsResponse {

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

		private String totalSize;

		private List<DataItem> data;

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

		public String getTotalSize() {
			return this.totalSize;
		}

		public void setTotalSize(String totalSize) {
			this.totalSize = totalSize;
		}

		public List<DataItem> getData() {
			return this.data;
		}

		public void setData(List<DataItem> data) {
			this.data = data;
		}

		public static class DataItem {

			private Long capacity;

			private String containerId;

			private Long createdDateTime;

			private String databaseType;

			private String dataAccessLevel;

			private String hostIp;

			private String iaasId;

			private String idcName;

			private String instanceType;

			private String ip;

			private String privateIp;

			private String publicIp;

			private String resourceId;

			private String resourceName;

			private String status;

			private String workspaceId;

			private List<ListenersItem> listeners;

			private List<ListenerConfigsItem> listenerConfigs;

			private List<String> vipAddress;

			private AlertRuleConfigurationStatusVo alertRuleConfigurationStatusVo;

			private AlertRuleInfoVo alertRuleInfoVo;

			public Long getCapacity() {
				return this.capacity;
			}

			public void setCapacity(Long capacity) {
				this.capacity = capacity;
			}

			public String getContainerId() {
				return this.containerId;
			}

			public void setContainerId(String containerId) {
				this.containerId = containerId;
			}

			public Long getCreatedDateTime() {
				return this.createdDateTime;
			}

			public void setCreatedDateTime(Long createdDateTime) {
				this.createdDateTime = createdDateTime;
			}

			public String getDatabaseType() {
				return this.databaseType;
			}

			public void setDatabaseType(String databaseType) {
				this.databaseType = databaseType;
			}

			public String getDataAccessLevel() {
				return this.dataAccessLevel;
			}

			public void setDataAccessLevel(String dataAccessLevel) {
				this.dataAccessLevel = dataAccessLevel;
			}

			public String getHostIp() {
				return this.hostIp;
			}

			public void setHostIp(String hostIp) {
				this.hostIp = hostIp;
			}

			public String getIaasId() {
				return this.iaasId;
			}

			public void setIaasId(String iaasId) {
				this.iaasId = iaasId;
			}

			public String getIdcName() {
				return this.idcName;
			}

			public void setIdcName(String idcName) {
				this.idcName = idcName;
			}

			public String getInstanceType() {
				return this.instanceType;
			}

			public void setInstanceType(String instanceType) {
				this.instanceType = instanceType;
			}

			public String getIp() {
				return this.ip;
			}

			public void setIp(String ip) {
				this.ip = ip;
			}

			public String getPrivateIp() {
				return this.privateIp;
			}

			public void setPrivateIp(String privateIp) {
				this.privateIp = privateIp;
			}

			public String getPublicIp() {
				return this.publicIp;
			}

			public void setPublicIp(String publicIp) {
				this.publicIp = publicIp;
			}

			public String getResourceId() {
				return this.resourceId;
			}

			public void setResourceId(String resourceId) {
				this.resourceId = resourceId;
			}

			public String getResourceName() {
				return this.resourceName;
			}

			public void setResourceName(String resourceName) {
				this.resourceName = resourceName;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getWorkspaceId() {
				return this.workspaceId;
			}

			public void setWorkspaceId(String workspaceId) {
				this.workspaceId = workspaceId;
			}

			public List<ListenersItem> getListeners() {
				return this.listeners;
			}

			public void setListeners(List<ListenersItem> listeners) {
				this.listeners = listeners;
			}

			public List<ListenerConfigsItem> getListenerConfigs() {
				return this.listenerConfigs;
			}

			public void setListenerConfigs(List<ListenerConfigsItem> listenerConfigs) {
				this.listenerConfigs = listenerConfigs;
			}

			public List<String> getVipAddress() {
				return this.vipAddress;
			}

			public void setVipAddress(List<String> vipAddress) {
				this.vipAddress = vipAddress;
			}

			public AlertRuleConfigurationStatusVo getAlertRuleConfigurationStatusVo() {
				return this.alertRuleConfigurationStatusVo;
			}

			public void setAlertRuleConfigurationStatusVo(AlertRuleConfigurationStatusVo alertRuleConfigurationStatusVo) {
				this.alertRuleConfigurationStatusVo = alertRuleConfigurationStatusVo;
			}

			public AlertRuleInfoVo getAlertRuleInfoVo() {
				return this.alertRuleInfoVo;
			}

			public void setAlertRuleInfoVo(AlertRuleInfoVo alertRuleInfoVo) {
				this.alertRuleInfoVo = alertRuleInfoVo;
			}

			public static class ListenersItem {

				private Long backendServerPort;

				private String iaasId;

				private String idcId;

				private String idcName;

				private String ip;

				private Long listenerPort;

				private String masterId;

				private String paasId;

				private String port;

				private String providerId;

				private String regionId;

				private String resourceId;

				private String resourceName;

				private String resourceType;

				private String sn;

				private String status;

				private String tenantId;

				private String utcCreated;

				private String version;

				private String workspaceId;

				private String zoneId;

				private List<CellsItem> cells;

				private List<OptionsItem> options;

				private List<String> appServiceIds;

				private List<String> assignedAppIds;

				public Long getBackendServerPort() {
					return this.backendServerPort;
				}

				public void setBackendServerPort(Long backendServerPort) {
					this.backendServerPort = backendServerPort;
				}

				public String getIaasId() {
					return this.iaasId;
				}

				public void setIaasId(String iaasId) {
					this.iaasId = iaasId;
				}

				public String getIdcId() {
					return this.idcId;
				}

				public void setIdcId(String idcId) {
					this.idcId = idcId;
				}

				public String getIdcName() {
					return this.idcName;
				}

				public void setIdcName(String idcName) {
					this.idcName = idcName;
				}

				public String getIp() {
					return this.ip;
				}

				public void setIp(String ip) {
					this.ip = ip;
				}

				public Long getListenerPort() {
					return this.listenerPort;
				}

				public void setListenerPort(Long listenerPort) {
					this.listenerPort = listenerPort;
				}

				public String getMasterId() {
					return this.masterId;
				}

				public void setMasterId(String masterId) {
					this.masterId = masterId;
				}

				public String getPaasId() {
					return this.paasId;
				}

				public void setPaasId(String paasId) {
					this.paasId = paasId;
				}

				public String getPort() {
					return this.port;
				}

				public void setPort(String port) {
					this.port = port;
				}

				public String getProviderId() {
					return this.providerId;
				}

				public void setProviderId(String providerId) {
					this.providerId = providerId;
				}

				public String getRegionId() {
					return this.regionId;
				}

				public void setRegionId(String regionId) {
					this.regionId = regionId;
				}

				public String getResourceId() {
					return this.resourceId;
				}

				public void setResourceId(String resourceId) {
					this.resourceId = resourceId;
				}

				public String getResourceName() {
					return this.resourceName;
				}

				public void setResourceName(String resourceName) {
					this.resourceName = resourceName;
				}

				public String getResourceType() {
					return this.resourceType;
				}

				public void setResourceType(String resourceType) {
					this.resourceType = resourceType;
				}

				public String getSn() {
					return this.sn;
				}

				public void setSn(String sn) {
					this.sn = sn;
				}

				public String getStatus() {
					return this.status;
				}

				public void setStatus(String status) {
					this.status = status;
				}

				public String getTenantId() {
					return this.tenantId;
				}

				public void setTenantId(String tenantId) {
					this.tenantId = tenantId;
				}

				public String getUtcCreated() {
					return this.utcCreated;
				}

				public void setUtcCreated(String utcCreated) {
					this.utcCreated = utcCreated;
				}

				public String getVersion() {
					return this.version;
				}

				public void setVersion(String version) {
					this.version = version;
				}

				public String getWorkspaceId() {
					return this.workspaceId;
				}

				public void setWorkspaceId(String workspaceId) {
					this.workspaceId = workspaceId;
				}

				public String getZoneId() {
					return this.zoneId;
				}

				public void setZoneId(String zoneId) {
					this.zoneId = zoneId;
				}

				public List<CellsItem> getCells() {
					return this.cells;
				}

				public void setCells(List<CellsItem> cells) {
					this.cells = cells;
				}

				public List<OptionsItem> getOptions() {
					return this.options;
				}

				public void setOptions(List<OptionsItem> options) {
					this.options = options;
				}

				public List<String> getAppServiceIds() {
					return this.appServiceIds;
				}

				public void setAppServiceIds(List<String> appServiceIds) {
					this.appServiceIds = appServiceIds;
				}

				public List<String> getAssignedAppIds() {
					return this.assignedAppIds;
				}

				public void setAssignedAppIds(List<String> assignedAppIds) {
					this.assignedAppIds = assignedAppIds;
				}

				public static class CellsItem {

					private String cellId;

					private String cellName;

					public String getCellId() {
						return this.cellId;
					}

					public void setCellId(String cellId) {
						this.cellId = cellId;
					}

					public String getCellName() {
						return this.cellName;
					}

					public void setCellName(String cellName) {
						this.cellName = cellName;
					}
				}

				public static class OptionsItem {

					private String key;

					private String value;

					public String getKey() {
						return this.key;
					}

					public void setKey(String key) {
						this.key = key;
					}

					public String getValue() {
						return this.value;
					}

					public void setValue(String value) {
						this.value = value;
					}
				}
			}

			public static class ListenerConfigsItem {

				private AlertRuleInfoVo1 alertRuleInfoVo1;

				private Listener listener;

				public AlertRuleInfoVo1 getAlertRuleInfoVo1() {
					return this.alertRuleInfoVo1;
				}

				public void setAlertRuleInfoVo1(AlertRuleInfoVo1 alertRuleInfoVo1) {
					this.alertRuleInfoVo1 = alertRuleInfoVo1;
				}

				public Listener getListener() {
					return this.listener;
				}

				public void setListener(Listener listener) {
					this.listener = listener;
				}

				public static class AlertRuleInfoVo1 {

					private Boolean alertState;

					private List<String> itemTypeAlerting;

					private List<String> itemTypeConfig;

					private List<String> itemTypeNoneConfig;

					public Boolean getAlertState() {
						return this.alertState;
					}

					public void setAlertState(Boolean alertState) {
						this.alertState = alertState;
					}

					public List<String> getItemTypeAlerting() {
						return this.itemTypeAlerting;
					}

					public void setItemTypeAlerting(List<String> itemTypeAlerting) {
						this.itemTypeAlerting = itemTypeAlerting;
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
				}

				public static class Listener {

					private String id;

					private String loadBalancerId;

					private String port;

					private String tenantId;

					public String getId() {
						return this.id;
					}

					public void setId(String id) {
						this.id = id;
					}

					public String getLoadBalancerId() {
						return this.loadBalancerId;
					}

					public void setLoadBalancerId(String loadBalancerId) {
						this.loadBalancerId = loadBalancerId;
					}

					public String getPort() {
						return this.port;
					}

					public void setPort(String port) {
						this.port = port;
					}

					public String getTenantId() {
						return this.tenantId;
					}

					public void setTenantId(String tenantId) {
						this.tenantId = tenantId;
					}
				}
			}

			public static class AlertRuleConfigurationStatusVo {

				private List<String> itemTypeAlerting2;

				private List<String> itemTypeConfigured;

				private List<String> itemTypeNotConfigured;

				public List<String> getItemTypeAlerting2() {
					return this.itemTypeAlerting2;
				}

				public void setItemTypeAlerting2(List<String> itemTypeAlerting2) {
					this.itemTypeAlerting2 = itemTypeAlerting2;
				}

				public List<String> getItemTypeConfigured() {
					return this.itemTypeConfigured;
				}

				public void setItemTypeConfigured(List<String> itemTypeConfigured) {
					this.itemTypeConfigured = itemTypeConfigured;
				}

				public List<String> getItemTypeNotConfigured() {
					return this.itemTypeNotConfigured;
				}

				public void setItemTypeNotConfigured(List<String> itemTypeNotConfigured) {
					this.itemTypeNotConfigured = itemTypeNotConfigured;
				}
			}

			public static class AlertRuleInfoVo {

				private Boolean alertState;

				private List<String> itemTypeAlerting3;

				private List<String> itemTypeConfig4;

				private List<String> itemTypeNoneConfig5;

				public Boolean getAlertState() {
					return this.alertState;
				}

				public void setAlertState(Boolean alertState) {
					this.alertState = alertState;
				}

				public List<String> getItemTypeAlerting3() {
					return this.itemTypeAlerting3;
				}

				public void setItemTypeAlerting3(List<String> itemTypeAlerting3) {
					this.itemTypeAlerting3 = itemTypeAlerting3;
				}

				public List<String> getItemTypeConfig4() {
					return this.itemTypeConfig4;
				}

				public void setItemTypeConfig4(List<String> itemTypeConfig4) {
					this.itemTypeConfig4 = itemTypeConfig4;
				}

				public List<String> getItemTypeNoneConfig5() {
					return this.itemTypeNoneConfig5;
				}

				public void setItemTypeNoneConfig5(List<String> itemTypeNoneConfig5) {
					this.itemTypeNoneConfig5 = itemTypeNoneConfig5;
				}
			}
		}
	}

	@Override
	public QueryRmsResourcesResponse getInstance(UnmarshallerContext context) {
		return	QueryRmsResourcesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
