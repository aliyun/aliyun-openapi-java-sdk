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
import com.aliyuncs.ecsops.transform.v20160401.OpsSlsDescribeReportResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsSlsDescribeReportResponse extends AcsResponse {

	private String requestId;

	private String message;

	private String code;

	private String success;

	private Long pageSize;

	private Long total;

	private Long pageNo;

	private List<Reports> data;

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

	public List<Reports> getData() {
		return this.data;
	}

	public void setData(List<Reports> data) {
		this.data = data;
	}

	public static class Reports {

		private Long createTime;

		private String description;

		private String displayName;

		private Long lastModifiedTime;

		private String name;

		private Boolean recyclable;

		private String state;

		private String type;

		private Configuration configuration;

		private Schedule schedule;

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getDisplayName() {
			return this.displayName;
		}

		public void setDisplayName(String displayName) {
			this.displayName = displayName;
		}

		public Long getLastModifiedTime() {
			return this.lastModifiedTime;
		}

		public void setLastModifiedTime(Long lastModifiedTime) {
			this.lastModifiedTime = lastModifiedTime;
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

			private Boolean allowAnonymousAccess;

			private Boolean customizePeriod;

			private String dashboard;

			private Boolean enableWatermark;

			private String language;

			private List<NotificationListItem> notificationList;

			public Boolean getAllowAnonymousAccess() {
				return this.allowAnonymousAccess;
			}

			public void setAllowAnonymousAccess(Boolean allowAnonymousAccess) {
				this.allowAnonymousAccess = allowAnonymousAccess;
			}

			public Boolean getCustomizePeriod() {
				return this.customizePeriod;
			}

			public void setCustomizePeriod(Boolean customizePeriod) {
				this.customizePeriod = customizePeriod;
			}

			public String getDashboard() {
				return this.dashboard;
			}

			public void setDashboard(String dashboard) {
				this.dashboard = dashboard;
			}

			public Boolean getEnableWatermark() {
				return this.enableWatermark;
			}

			public void setEnableWatermark(Boolean enableWatermark) {
				this.enableWatermark = enableWatermark;
			}

			public String getLanguage() {
				return this.language;
			}

			public void setLanguage(String language) {
				this.language = language;
			}

			public List<NotificationListItem> getNotificationList() {
				return this.notificationList;
			}

			public void setNotificationList(List<NotificationListItem> notificationList) {
				this.notificationList = notificationList;
			}

			public static class NotificationListItem {

				private String serviceUri;

				private Boolean atAll;

				private String content;

				private String method;

				private String title;

				private String type;

				public String getServiceUri() {
					return this.serviceUri;
				}

				public void setServiceUri(String serviceUri) {
					this.serviceUri = serviceUri;
				}

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

			private Long dayOfWeek;

			private Long delay;

			private Long hour;

			private Boolean runImmediately;

			private String type;

			public Long getDayOfWeek() {
				return this.dayOfWeek;
			}

			public void setDayOfWeek(Long dayOfWeek) {
				this.dayOfWeek = dayOfWeek;
			}

			public Long getDelay() {
				return this.delay;
			}

			public void setDelay(Long delay) {
				this.delay = delay;
			}

			public Long getHour() {
				return this.hour;
			}

			public void setHour(Long hour) {
				this.hour = hour;
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
	public OpsSlsDescribeReportResponse getInstance(UnmarshallerContext context) {
		return	OpsSlsDescribeReportResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
