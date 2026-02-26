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

package com.aliyuncs.dataworks_public.model.v20200518;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataworks_public.transform.v20200518.GetDISyncTaskResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDISyncTaskResponse extends AcsResponse {

	private Boolean success;

	private String requestId;

	private Data data;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String code;

		private String status;

		private String message;

		private List<AlarmListItem> alarmList;

		private SolutionDetail solutionDetail;

		public String getCode() {
			return this.code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public List<AlarmListItem> getAlarmList() {
			return this.alarmList;
		}

		public void setAlarmList(List<AlarmListItem> alarmList) {
			this.alarmList = alarmList;
		}

		public SolutionDetail getSolutionDetail() {
			return this.solutionDetail;
		}

		public void setSolutionDetail(SolutionDetail solutionDetail) {
			this.solutionDetail = solutionDetail;
		}

		public static class AlarmListItem {

			private Long id;

			private Boolean enabled;

			private String ruleName;

			private String metric;

			private String description;

			private List<AlarmRuleListItem> alarmRuleList;

			private NotifyRule notifyRule;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public Boolean getEnabled() {
				return this.enabled;
			}

			public void setEnabled(Boolean enabled) {
				this.enabled = enabled;
			}

			public String getRuleName() {
				return this.ruleName;
			}

			public void setRuleName(String ruleName) {
				this.ruleName = ruleName;
			}

			public String getMetric() {
				return this.metric;
			}

			public void setMetric(String metric) {
				this.metric = metric;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public List<AlarmRuleListItem> getAlarmRuleList() {
				return this.alarmRuleList;
			}

			public void setAlarmRuleList(List<AlarmRuleListItem> alarmRuleList) {
				this.alarmRuleList = alarmRuleList;
			}

			public NotifyRule getNotifyRule() {
				return this.notifyRule;
			}

			public void setNotifyRule(NotifyRule notifyRule) {
				this.notifyRule = notifyRule;
			}

			public static class AlarmRuleListItem {

				private String level;

				private String comparator;

				private Long threshold;

				private Long duration;

				private String aggregator;

				public String getLevel() {
					return this.level;
				}

				public void setLevel(String level) {
					this.level = level;
				}

				public String getComparator() {
					return this.comparator;
				}

				public void setComparator(String comparator) {
					this.comparator = comparator;
				}

				public Long getThreshold() {
					return this.threshold;
				}

				public void setThreshold(Long threshold) {
					this.threshold = threshold;
				}

				public Long getDuration() {
					return this.duration;
				}

				public void setDuration(Long duration) {
					this.duration = duration;
				}

				public String getAggregator() {
					return this.aggregator;
				}

				public void setAggregator(String aggregator) {
					this.aggregator = aggregator;
				}
			}

			public static class NotifyRule {

				private Long interval;

				private List<String> warning;

				private List<String> critical;

				public Long getInterval() {
					return this.interval;
				}

				public void setInterval(Long interval) {
					this.interval = interval;
				}

				public List<String> getWarning() {
					return this.warning;
				}

				public void setWarning(List<String> warning) {
					this.warning = warning;
				}

				public List<String> getCritical() {
					return this.critical;
				}

				public void setCritical(List<String> critical) {
					this.critical = critical;
				}
			}
		}

		public static class SolutionDetail {

			private String status;

			private String type;

			private String startTime;

			private String creatorName;

			private Long projectId;

			private String sourceType;

			private String processContent;

			private String name;

			private String processExtra;

			private String submitTime;

			private Long id;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getStartTime() {
				return this.startTime;
			}

			public void setStartTime(String startTime) {
				this.startTime = startTime;
			}

			public String getCreatorName() {
				return this.creatorName;
			}

			public void setCreatorName(String creatorName) {
				this.creatorName = creatorName;
			}

			public Long getProjectId() {
				return this.projectId;
			}

			public void setProjectId(Long projectId) {
				this.projectId = projectId;
			}

			public String getSourceType() {
				return this.sourceType;
			}

			public void setSourceType(String sourceType) {
				this.sourceType = sourceType;
			}

			public String getProcessContent() {
				return this.processContent;
			}

			public void setProcessContent(String processContent) {
				this.processContent = processContent;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getProcessExtra() {
				return this.processExtra;
			}

			public void setProcessExtra(String processExtra) {
				this.processExtra = processExtra;
			}

			public String getSubmitTime() {
				return this.submitTime;
			}

			public void setSubmitTime(String submitTime) {
				this.submitTime = submitTime;
			}

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}
		}
	}

	@Override
	public GetDISyncTaskResponse getInstance(UnmarshallerContext context) {
		return	GetDISyncTaskResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
