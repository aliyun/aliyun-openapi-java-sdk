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
import com.aliyuncs.sofa.transform.v20190815.QueryRmsAlertrulesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryRmsAlertrulesResponse extends AcsResponse {

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

		private List<EntitiesItem> entities;

		private Meta meta;

		public List<EntitiesItem> getEntities() {
			return this.entities;
		}

		public void setEntities(List<EntitiesItem> entities) {
			this.entities = entities;
		}

		public Meta getMeta() {
			return this.meta;
		}

		public void setMeta(Meta meta) {
			this.meta = meta;
		}

		public static class EntitiesItem {

			private String layer;

			private Entity entity;

			public String getLayer() {
				return this.layer;
			}

			public void setLayer(String layer) {
				this.layer = layer;
			}

			public Entity getEntity() {
				return this.entity;
			}

			public void setEntity(Entity entity) {
				this.entity = entity;
			}

			public static class Entity {

				private Long alertLevel;

				private String alertShutEndDateTime;

				private String alertShutReason;

				private String alertShutStartDateTime;

				private String alertValidEndTime;

				private String alertValidStartTime;

				private Boolean enabled;

				private Long id;

				private String ruleType;

				private Long silencePeriodMinute;

				private String state;

				private String utcCreated;

				private String utcModified;

				private Definition definition;

				private MonitorTarget monitorTarget;

				public Long getAlertLevel() {
					return this.alertLevel;
				}

				public void setAlertLevel(Long alertLevel) {
					this.alertLevel = alertLevel;
				}

				public String getAlertShutEndDateTime() {
					return this.alertShutEndDateTime;
				}

				public void setAlertShutEndDateTime(String alertShutEndDateTime) {
					this.alertShutEndDateTime = alertShutEndDateTime;
				}

				public String getAlertShutReason() {
					return this.alertShutReason;
				}

				public void setAlertShutReason(String alertShutReason) {
					this.alertShutReason = alertShutReason;
				}

				public String getAlertShutStartDateTime() {
					return this.alertShutStartDateTime;
				}

				public void setAlertShutStartDateTime(String alertShutStartDateTime) {
					this.alertShutStartDateTime = alertShutStartDateTime;
				}

				public String getAlertValidEndTime() {
					return this.alertValidEndTime;
				}

				public void setAlertValidEndTime(String alertValidEndTime) {
					this.alertValidEndTime = alertValidEndTime;
				}

				public String getAlertValidStartTime() {
					return this.alertValidStartTime;
				}

				public void setAlertValidStartTime(String alertValidStartTime) {
					this.alertValidStartTime = alertValidStartTime;
				}

				public Boolean getEnabled() {
					return this.enabled;
				}

				public void setEnabled(Boolean enabled) {
					this.enabled = enabled;
				}

				public Long getId() {
					return this.id;
				}

				public void setId(Long id) {
					this.id = id;
				}

				public String getRuleType() {
					return this.ruleType;
				}

				public void setRuleType(String ruleType) {
					this.ruleType = ruleType;
				}

				public Long getSilencePeriodMinute() {
					return this.silencePeriodMinute;
				}

				public void setSilencePeriodMinute(Long silencePeriodMinute) {
					this.silencePeriodMinute = silencePeriodMinute;
				}

				public String getState() {
					return this.state;
				}

				public void setState(String state) {
					this.state = state;
				}

				public String getUtcCreated() {
					return this.utcCreated;
				}

				public void setUtcCreated(String utcCreated) {
					this.utcCreated = utcCreated;
				}

				public String getUtcModified() {
					return this.utcModified;
				}

				public void setUtcModified(String utcModified) {
					this.utcModified = utcModified;
				}

				public Definition getDefinition() {
					return this.definition;
				}

				public void setDefinition(Definition definition) {
					this.definition = definition;
				}

				public MonitorTarget getMonitorTarget() {
					return this.monitorTarget;
				}

				public void setMonitorTarget(MonitorTarget monitorTarget) {
					this.monitorTarget = monitorTarget;
				}

				public static class Definition {

					private String monitorItemType;

					private String monitorOptionKey;

					private Long monitorPort;

					private String statisticalMethod;

					private Long statisticalPeriod;

					private String triggerCountThreshold;

					private String triggerOperator;

					private Long triggerValueThreshold;

					public String getMonitorItemType() {
						return this.monitorItemType;
					}

					public void setMonitorItemType(String monitorItemType) {
						this.monitorItemType = monitorItemType;
					}

					public String getMonitorOptionKey() {
						return this.monitorOptionKey;
					}

					public void setMonitorOptionKey(String monitorOptionKey) {
						this.monitorOptionKey = monitorOptionKey;
					}

					public Long getMonitorPort() {
						return this.monitorPort;
					}

					public void setMonitorPort(Long monitorPort) {
						this.monitorPort = monitorPort;
					}

					public String getStatisticalMethod() {
						return this.statisticalMethod;
					}

					public void setStatisticalMethod(String statisticalMethod) {
						this.statisticalMethod = statisticalMethod;
					}

					public Long getStatisticalPeriod() {
						return this.statisticalPeriod;
					}

					public void setStatisticalPeriod(Long statisticalPeriod) {
						this.statisticalPeriod = statisticalPeriod;
					}

					public String getTriggerCountThreshold() {
						return this.triggerCountThreshold;
					}

					public void setTriggerCountThreshold(String triggerCountThreshold) {
						this.triggerCountThreshold = triggerCountThreshold;
					}

					public String getTriggerOperator() {
						return this.triggerOperator;
					}

					public void setTriggerOperator(String triggerOperator) {
						this.triggerOperator = triggerOperator;
					}

					public Long getTriggerValueThreshold() {
						return this.triggerValueThreshold;
					}

					public void setTriggerValueThreshold(Long triggerValueThreshold) {
						this.triggerValueThreshold = triggerValueThreshold;
					}
				}

				public static class MonitorTarget {

					private String monitorTargetId;

					private String monitorTargetName;

					private String monitorTargetType;

					private String tenantId;

					private String workspaceId;

					public String getMonitorTargetId() {
						return this.monitorTargetId;
					}

					public void setMonitorTargetId(String monitorTargetId) {
						this.monitorTargetId = monitorTargetId;
					}

					public String getMonitorTargetName() {
						return this.monitorTargetName;
					}

					public void setMonitorTargetName(String monitorTargetName) {
						this.monitorTargetName = monitorTargetName;
					}

					public String getMonitorTargetType() {
						return this.monitorTargetType;
					}

					public void setMonitorTargetType(String monitorTargetType) {
						this.monitorTargetType = monitorTargetType;
					}

					public String getTenantId() {
						return this.tenantId;
					}

					public void setTenantId(String tenantId) {
						this.tenantId = tenantId;
					}

					public String getWorkspaceId() {
						return this.workspaceId;
					}

					public void setWorkspaceId(String workspaceId) {
						this.workspaceId = workspaceId;
					}
				}
			}
		}

		public static class Meta {

			private Page page;

			public Page getPage() {
				return this.page;
			}

			public void setPage(Page page) {
				this.page = page;
			}

			public static class Page {

				private Long limit;

				private Long offset;

				private Long totalSize;

				public Long getLimit() {
					return this.limit;
				}

				public void setLimit(Long limit) {
					this.limit = limit;
				}

				public Long getOffset() {
					return this.offset;
				}

				public void setOffset(Long offset) {
					this.offset = offset;
				}

				public Long getTotalSize() {
					return this.totalSize;
				}

				public void setTotalSize(Long totalSize) {
					this.totalSize = totalSize;
				}
			}
		}
	}

	@Override
	public QueryRmsAlertrulesResponse getInstance(UnmarshallerContext context) {
		return	QueryRmsAlertrulesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
