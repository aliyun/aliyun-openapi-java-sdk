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
import com.aliyuncs.AcsResponse;
import com.aliyuncs.arms.transform.v20190808.ListAlertsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAlertsResponse extends AcsResponse {

	private String requestId;

	private PageBean pageBean;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public PageBean getPageBean() {
		return this.pageBean;
	}

	public void setPageBean(PageBean pageBean) {
		this.pageBean = pageBean;
	}

	public static class PageBean {

		private Long total;

		private Long page;

		private Long size;

		private List<ListAlertsItem> listAlerts;

		public Long getTotal() {
			return this.total;
		}

		public void setTotal(Long total) {
			this.total = total;
		}

		public Long getPage() {
			return this.page;
		}

		public void setPage(Long page) {
			this.page = page;
		}

		public Long getSize() {
			return this.size;
		}

		public void setSize(Long size) {
			this.size = size;
		}

		public List<ListAlertsItem> getListAlerts() {
			return this.listAlerts;
		}

		public void setListAlerts(List<ListAlertsItem> listAlerts) {
			this.listAlerts = listAlerts;
		}

		public static class ListAlertsItem {

			private String alertName;

			private String severity;

			private Long state;

			private Float dispatchRuleId;

			private String dispatchRuleName;

			private String createTime;

			private Long alertId;

			private List<ActivitiesItem> activities;

			private List<AlertEventsItem> alertEvents;

			public String getAlertName() {
				return this.alertName;
			}

			public void setAlertName(String alertName) {
				this.alertName = alertName;
			}

			public String getSeverity() {
				return this.severity;
			}

			public void setSeverity(String severity) {
				this.severity = severity;
			}

			public Long getState() {
				return this.state;
			}

			public void setState(Long state) {
				this.state = state;
			}

			public Float getDispatchRuleId() {
				return this.dispatchRuleId;
			}

			public void setDispatchRuleId(Float dispatchRuleId) {
				this.dispatchRuleId = dispatchRuleId;
			}

			public String getDispatchRuleName() {
				return this.dispatchRuleName;
			}

			public void setDispatchRuleName(String dispatchRuleName) {
				this.dispatchRuleName = dispatchRuleName;
			}

			public String getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(String createTime) {
				this.createTime = createTime;
			}

			public Long getAlertId() {
				return this.alertId;
			}

			public void setAlertId(Long alertId) {
				this.alertId = alertId;
			}

			public List<ActivitiesItem> getActivities() {
				return this.activities;
			}

			public void setActivities(List<ActivitiesItem> activities) {
				this.activities = activities;
			}

			public List<AlertEventsItem> getAlertEvents() {
				return this.alertEvents;
			}

			public void setAlertEvents(List<AlertEventsItem> alertEvents) {
				this.alertEvents = alertEvents;
			}

			public static class ActivitiesItem {

				private String time;

				private Long type;

				private String handlerName;

				private String description;

				private String content;

				public String getTime() {
					return this.time;
				}

				public void setTime(String time) {
					this.time = time;
				}

				public Long getType() {
					return this.type;
				}

				public void setType(Long type) {
					this.type = type;
				}

				public String getHandlerName() {
					return this.handlerName;
				}

				public void setHandlerName(String handlerName) {
					this.handlerName = handlerName;
				}

				public String getDescription() {
					return this.description;
				}

				public void setDescription(String description) {
					this.description = description;
				}

				public String getContent() {
					return this.content;
				}

				public void setContent(String content) {
					this.content = content;
				}
			}

			public static class AlertEventsItem {

				private String alertName;

				private String severity;

				private String state;

				private String startTime;

				private String endTime;

				private String receiveTime;

				private String integrationName;

				private String integrationType;

				private String generatorURL;

				private String description;

				private String annotations;

				private String labels;

				public String getAlertName() {
					return this.alertName;
				}

				public void setAlertName(String alertName) {
					this.alertName = alertName;
				}

				public String getSeverity() {
					return this.severity;
				}

				public void setSeverity(String severity) {
					this.severity = severity;
				}

				public String getState() {
					return this.state;
				}

				public void setState(String state) {
					this.state = state;
				}

				public String getStartTime() {
					return this.startTime;
				}

				public void setStartTime(String startTime) {
					this.startTime = startTime;
				}

				public String getEndTime() {
					return this.endTime;
				}

				public void setEndTime(String endTime) {
					this.endTime = endTime;
				}

				public String getReceiveTime() {
					return this.receiveTime;
				}

				public void setReceiveTime(String receiveTime) {
					this.receiveTime = receiveTime;
				}

				public String getIntegrationName() {
					return this.integrationName;
				}

				public void setIntegrationName(String integrationName) {
					this.integrationName = integrationName;
				}

				public String getIntegrationType() {
					return this.integrationType;
				}

				public void setIntegrationType(String integrationType) {
					this.integrationType = integrationType;
				}

				public String getGeneratorURL() {
					return this.generatorURL;
				}

				public void setGeneratorURL(String generatorURL) {
					this.generatorURL = generatorURL;
				}

				public String getDescription() {
					return this.description;
				}

				public void setDescription(String description) {
					this.description = description;
				}

				public String getAnnotations() {
					return this.annotations;
				}

				public void setAnnotations(String annotations) {
					this.annotations = annotations;
				}

				public String getLabels() {
					return this.labels;
				}

				public void setLabels(String labels) {
					this.labels = labels;
				}
			}
		}
	}

	@Override
	public ListAlertsResponse getInstance(UnmarshallerContext context) {
		return	ListAlertsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
