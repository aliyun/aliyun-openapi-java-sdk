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

package com.aliyuncs.cms.model.v20180308;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cms.transform.v20180308.GetMyGroupAlertResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetMyGroupAlertResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer errorCode;

	private String errorMessage;

	private GroupAlert groupAlert;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Integer getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public GroupAlert getGroupAlert() {
		return this.groupAlert;
	}

	public void setGroupAlert(GroupAlert groupAlert) {
		this.groupAlert = groupAlert;
	}

	public static class GroupAlert {

		private String groupId;

		private String alertName;

		private String displayName;

		private String subject;

		private String webhook;

		private String category;

		private String namespace;

		private String metricName;

		private Integer period;

		private String state;

		private String description;

		private Boolean enable;

		private Integer silenceTime;

		private String enableEndTime;

		private String enableStartTime;

		private String selector;

		private Escalations escalations;

		public String getGroupId() {
			return this.groupId;
		}

		public void setGroupId(String groupId) {
			this.groupId = groupId;
		}

		public String getAlertName() {
			return this.alertName;
		}

		public void setAlertName(String alertName) {
			this.alertName = alertName;
		}

		public String getDisplayName() {
			return this.displayName;
		}

		public void setDisplayName(String displayName) {
			this.displayName = displayName;
		}

		public String getSubject() {
			return this.subject;
		}

		public void setSubject(String subject) {
			this.subject = subject;
		}

		public String getWebhook() {
			return this.webhook;
		}

		public void setWebhook(String webhook) {
			this.webhook = webhook;
		}

		public String getCategory() {
			return this.category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public String getNamespace() {
			return this.namespace;
		}

		public void setNamespace(String namespace) {
			this.namespace = namespace;
		}

		public String getMetricName() {
			return this.metricName;
		}

		public void setMetricName(String metricName) {
			this.metricName = metricName;
		}

		public Integer getPeriod() {
			return this.period;
		}

		public void setPeriod(Integer period) {
			this.period = period;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

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

		public Integer getSilenceTime() {
			return this.silenceTime;
		}

		public void setSilenceTime(Integer silenceTime) {
			this.silenceTime = silenceTime;
		}

		public String getEnableEndTime() {
			return this.enableEndTime;
		}

		public void setEnableEndTime(String enableEndTime) {
			this.enableEndTime = enableEndTime;
		}

		public String getEnableStartTime() {
			return this.enableStartTime;
		}

		public void setEnableStartTime(String enableStartTime) {
			this.enableStartTime = enableStartTime;
		}

		public String getSelector() {
			return this.selector;
		}

		public void setSelector(String selector) {
			this.selector = selector;
		}

		public Escalations getEscalations() {
			return this.escalations;
		}

		public void setEscalations(Escalations escalations) {
			this.escalations = escalations;
		}

		public static class Escalations {

			private Info info;

			private Warn warn;

			private Critical critical;

			public Info getInfo() {
				return this.info;
			}

			public void setInfo(Info info) {
				this.info = info;
			}

			public Warn getWarn() {
				return this.warn;
			}

			public void setWarn(Warn warn) {
				this.warn = warn;
			}

			public Critical getCritical() {
				return this.critical;
			}

			public void setCritical(Critical critical) {
				this.critical = critical;
			}

			public static class Info {

				private String statistics;

				private String comparisonOperator;

				private String threshold;

				private Integer times;

				public String getStatistics() {
					return this.statistics;
				}

				public void setStatistics(String statistics) {
					this.statistics = statistics;
				}

				public String getComparisonOperator() {
					return this.comparisonOperator;
				}

				public void setComparisonOperator(String comparisonOperator) {
					this.comparisonOperator = comparisonOperator;
				}

				public String getThreshold() {
					return this.threshold;
				}

				public void setThreshold(String threshold) {
					this.threshold = threshold;
				}

				public Integer getTimes() {
					return this.times;
				}

				public void setTimes(Integer times) {
					this.times = times;
				}
			}

			public static class Warn {

				private String statistics;

				private String comparisonOperator;

				private String threshold;

				private Integer times;

				public String getStatistics() {
					return this.statistics;
				}

				public void setStatistics(String statistics) {
					this.statistics = statistics;
				}

				public String getComparisonOperator() {
					return this.comparisonOperator;
				}

				public void setComparisonOperator(String comparisonOperator) {
					this.comparisonOperator = comparisonOperator;
				}

				public String getThreshold() {
					return this.threshold;
				}

				public void setThreshold(String threshold) {
					this.threshold = threshold;
				}

				public Integer getTimes() {
					return this.times;
				}

				public void setTimes(Integer times) {
					this.times = times;
				}
			}

			public static class Critical {

				private String statistics;

				private String comparisonOperator;

				private String threshold;

				private Integer times;

				public String getStatistics() {
					return this.statistics;
				}

				public void setStatistics(String statistics) {
					this.statistics = statistics;
				}

				public String getComparisonOperator() {
					return this.comparisonOperator;
				}

				public void setComparisonOperator(String comparisonOperator) {
					this.comparisonOperator = comparisonOperator;
				}

				public String getThreshold() {
					return this.threshold;
				}

				public void setThreshold(String threshold) {
					this.threshold = threshold;
				}

				public Integer getTimes() {
					return this.times;
				}

				public void setTimes(Integer times) {
					this.times = times;
				}
			}
		}
	}

	@Override
	public GetMyGroupAlertResponse getInstance(UnmarshallerContext context) {
		return	GetMyGroupAlertResponseUnmarshaller.unmarshall(this, context);
	}
}
