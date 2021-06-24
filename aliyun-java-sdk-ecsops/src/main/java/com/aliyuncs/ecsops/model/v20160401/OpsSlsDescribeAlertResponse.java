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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsSlsDescribeAlertResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsSlsDescribeAlertResponse extends AcsResponse {

	private String requestId;

	private String message;

	private String code;

	private String success;

	private Long pageSize;

	private Long total;

	private Long pageNo;

	private List<Alerts> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getTotal() {
		return this.total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public Long getPageNo() {
		return this.pageNo;
	}

	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}

	public List<Alerts> getData() {
		return this.data;
	}

	public void setData(List<Alerts> data) {
		this.data = data;
	}

	public static class Alerts {

		private String displayName;

		private String createTime;

		private String lastModifiedTime;

		private String state;

		private String type;

		private String description;

		private String name;

		private Boolean recyclable;

		private Configuration configuration;

		private Schedule schedule;

		public String getDisplayName() {
			return this.displayName;
		}

		public void setDisplayName(String displayName) {
			this.displayName = displayName;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getLastModifiedTime() {
			return this.lastModifiedTime;
		}

		public void setLastModifiedTime(String lastModifiedTime) {
			this.lastModifiedTime = lastModifiedTime;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

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

		public Boolean getRecyclable() {
			return this.recyclable;
		}

		public void setRecyclable(Boolean recyclable) {
			this.recyclable = recyclable;
		}

		public Configuration getConfiguration() {
			return this.configuration;
		}

		public void setConfiguration(Configuration configuration) {
			this.configuration = configuration;
		}

		public Schedule getSchedule() {
			return this.schedule;
		}

		public void setSchedule(Schedule schedule) {
			this.schedule = schedule;
		}

		public static class Configuration {

			private String dashboard;

			private Long notifyThreshold;

			private Boolean sendRecoveryMessage;

			private String throttling;

			private List<QueryListItem> queryList;

			private List<NotificationListItem> notificationList;

			public String getDashboard() {
				return this.dashboard;
			}

			public void setDashboard(String dashboard) {
				this.dashboard = dashboard;
			}

			public Long getNotifyThreshold() {
				return this.notifyThreshold;
			}

			public void setNotifyThreshold(Long notifyThreshold) {
				this.notifyThreshold = notifyThreshold;
			}

			public Boolean getSendRecoveryMessage() {
				return this.sendRecoveryMessage;
			}

			public void setSendRecoveryMessage(Boolean sendRecoveryMessage) {
				this.sendRecoveryMessage = sendRecoveryMessage;
			}

			public String getThrottling() {
				return this.throttling;
			}

			public void setThrottling(String throttling) {
				this.throttling = throttling;
			}

			public List<QueryListItem> getQueryList() {
				return this.queryList;
			}

			public void setQueryList(List<QueryListItem> queryList) {
				this.queryList = queryList;
			}

			public List<NotificationListItem> getNotificationList() {
				return this.notificationList;
			}

			public void setNotificationList(List<NotificationListItem> notificationList) {
				this.notificationList = notificationList;
			}

			public static class QueryListItem {

				private String chartTitle;

				private String end;

				private String query;

				private String start;

				private String timeSpanType;

				public String getChartTitle() {
					return this.chartTitle;
				}

				public void setChartTitle(String chartTitle) {
					this.chartTitle = chartTitle;
				}

				public String getEnd() {
					return this.end;
				}

				public void setEnd(String end) {
					this.end = end;
				}

				public String getQuery() {
					return this.query;
				}

				public void setQuery(String query) {
					this.query = query;
				}

				public String getStart() {
					return this.start;
				}

				public void setStart(String start) {
					this.start = start;
				}

				public String getTimeSpanType() {
					return this.timeSpanType;
				}

				public void setTimeSpanType(String timeSpanType) {
					this.timeSpanType = timeSpanType;
				}
			}

			public static class NotificationListItem {

				private Boolean atAll;

				private String content;

				private String method;

				private String serviceUri;

				private String title;

				private String type;

				public Boolean getAtAll() {
					return this.atAll;
				}

				public void setAtAll(Boolean atAll) {
					this.atAll = atAll;
				}

				public String getContent() {
					return this.content;
				}

				public void setContent(String content) {
					this.content = content;
				}

				public String getBizMethod() {
					return this.method;
				}

				public void setBizMethod(String method) {
					this.method = method;
				}

				public String getServiceUri() {
					return this.serviceUri;
				}

				public void setServiceUri(String serviceUri) {
					this.serviceUri = serviceUri;
				}

				public String getTitle() {
					return this.title;
				}

				public void setTitle(String title) {
					this.title = title;
				}

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}
			}
		}

		public static class Schedule {

			private Long delay;

			private String interval;

			private Boolean runImmediately;

			private String type;

			public Long getDelay() {
				return this.delay;
			}

			public void setDelay(Long delay) {
				this.delay = delay;
			}

			public String getInterval() {
				return this.interval;
			}

			public void setInterval(String interval) {
				this.interval = interval;
			}

			public Boolean getRunImmediately() {
				return this.runImmediately;
			}

			public void setRunImmediately(Boolean runImmediately) {
				this.runImmediately = runImmediately;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}
		}
	}

	@Override
	public OpsSlsDescribeAlertResponse getInstance(UnmarshallerContext context) {
		return	OpsSlsDescribeAlertResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
