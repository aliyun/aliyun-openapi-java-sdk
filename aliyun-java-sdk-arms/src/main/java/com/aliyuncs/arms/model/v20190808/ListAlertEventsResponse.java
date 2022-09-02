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
import com.aliyuncs.arms.transform.v20190808.ListAlertEventsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAlertEventsResponse extends AcsResponse {

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

		private List<EventsItem> events;

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

		public List<EventsItem> getEvents() {
			return this.events;
		}

		public void setEvents(List<EventsItem> events) {
			this.events = events;
		}

		public static class EventsItem {

			private String alertName;

			private String severity;

			private String status;

			private String startTime;

			private String endTime;

			private String receiveTime;

			private String integrationName;

			private String integrationType;

			private String generatorURL;

			private String description;

			private String annotations;

			private String labels;

			private List<AlarmsItem> alarms;

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

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
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

			public List<AlarmsItem> getAlarms() {
				return this.alarms;
			}

			public void setAlarms(List<AlarmsItem> alarms) {
				this.alarms = alarms;
			}

			public static class AlarmsItem {

				private Long alarmId;

				private String alarmName;

				private Integer state;

				private String createTime;

				public Long getAlarmId() {
					return this.alarmId;
				}

				public void setAlarmId(Long alarmId) {
					this.alarmId = alarmId;
				}

				public String getAlarmName() {
					return this.alarmName;
				}

				public void setAlarmName(String alarmName) {
					this.alarmName = alarmName;
				}

				public Integer getState() {
					return this.state;
				}

				public void setState(Integer state) {
					this.state = state;
				}

				public String getCreateTime() {
					return this.createTime;
				}

				public void setCreateTime(String createTime) {
					this.createTime = createTime;
				}
			}
		}
	}

	@Override
	public ListAlertEventsResponse getInstance(UnmarshallerContext context) {
		return	ListAlertEventsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
