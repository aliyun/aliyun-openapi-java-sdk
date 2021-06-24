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
import com.aliyuncs.ecsops.transform.v20160401.OpsDescribeDiagnosticReportsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeDiagnosticReportsResponse extends AcsResponse {

	private String nextToken;

	private String requestId;

	private Integer maxResults;

	private List<Report> reports;

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public List<Report> getReports() {
		return this.reports;
	}

	public void setReports(List<Report> reports) {
		this.reports = reports;
	}

	public static class Report {

		private String status;

		private String severity;

		private String creationTime;

		private String reportId;

		private String endTime;

		private String startTime;

		private String resourceType;

		private String finishedTime;

		private String resourceId;

		private List<Item> items;

		private List<Issue> issues;

		private List<RecentEvent> recentEvents;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getSeverity() {
			return this.severity;
		}

		public void setSeverity(String severity) {
			this.severity = severity;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getReportId() {
			return this.reportId;
		}

		public void setReportId(String reportId) {
			this.reportId = reportId;
		}

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getResourceType() {
			return this.resourceType;
		}

		public void setResourceType(String resourceType) {
			this.resourceType = resourceType;
		}

		public String getFinishedTime() {
			return this.finishedTime;
		}

		public void setFinishedTime(String finishedTime) {
			this.finishedTime = finishedTime;
		}

		public String getResourceId() {
			return this.resourceId;
		}

		public void setResourceId(String resourceId) {
			this.resourceId = resourceId;
		}

		public List<Item> getItems() {
			return this.items;
		}

		public void setItems(List<Item> items) {
			this.items = items;
		}

		public List<Issue> getIssues() {
			return this.issues;
		}

		public void setIssues(List<Issue> issues) {
			this.issues = issues;
		}

		public List<RecentEvent> getRecentEvents() {
			return this.recentEvents;
		}

		public void setRecentEvents(List<RecentEvent> recentEvents) {
			this.recentEvents = recentEvents;
		}

		public static class Item {

			private String status;

			private String severity;

			private String itemCategory;

			private String itemCode;

			private String occurrenceTime;

			private String occurrenceStartTime;

			private Long occurrenceCounts;

			private String reason;

			private List<ItemData> itemDatas;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getSeverity() {
				return this.severity;
			}

			public void setSeverity(String severity) {
				this.severity = severity;
			}

			public String getItemCategory() {
				return this.itemCategory;
			}

			public void setItemCategory(String itemCategory) {
				this.itemCategory = itemCategory;
			}

			public String getItemCode() {
				return this.itemCode;
			}

			public void setItemCode(String itemCode) {
				this.itemCode = itemCode;
			}

			public String getOccurrenceTime() {
				return this.occurrenceTime;
			}

			public void setOccurrenceTime(String occurrenceTime) {
				this.occurrenceTime = occurrenceTime;
			}

			public String getOccurrenceStartTime() {
				return this.occurrenceStartTime;
			}

			public void setOccurrenceStartTime(String occurrenceStartTime) {
				this.occurrenceStartTime = occurrenceStartTime;
			}

			public Long getOccurrenceCounts() {
				return this.occurrenceCounts;
			}

			public void setOccurrenceCounts(Long occurrenceCounts) {
				this.occurrenceCounts = occurrenceCounts;
			}

			public String getReason() {
				return this.reason;
			}

			public void setReason(String reason) {
				this.reason = reason;
			}

			public List<ItemData> getItemDatas() {
				return this.itemDatas;
			}

			public void setItemDatas(List<ItemData> itemDatas) {
				this.itemDatas = itemDatas;
			}

			public static class ItemData {

				private String value;

				private String name;

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}
			}
		}

		public static class Issue {

			private String severity;

			private String issueCode;

			private String message;

			private String occurrenceTime;

			private String occurrenceStartTime;

			private Long occurrenceCounts;

			private String reason;

			private String issueCategory;

			private List<RecommendedAction> recommendedActions;

			public String getSeverity() {
				return this.severity;
			}

			public void setSeverity(String severity) {
				this.severity = severity;
			}

			public String getIssueCode() {
				return this.issueCode;
			}

			public void setIssueCode(String issueCode) {
				this.issueCode = issueCode;
			}

			public String getMessage() {
				return this.message;
			}

			public void setMessage(String message) {
				this.message = message;
			}

			public String getOccurrenceTime() {
				return this.occurrenceTime;
			}

			public void setOccurrenceTime(String occurrenceTime) {
				this.occurrenceTime = occurrenceTime;
			}

			public String getOccurrenceStartTime() {
				return this.occurrenceStartTime;
			}

			public void setOccurrenceStartTime(String occurrenceStartTime) {
				this.occurrenceStartTime = occurrenceStartTime;
			}

			public Long getOccurrenceCounts() {
				return this.occurrenceCounts;
			}

			public void setOccurrenceCounts(Long occurrenceCounts) {
				this.occurrenceCounts = occurrenceCounts;
			}

			public String getReason() {
				return this.reason;
			}

			public void setReason(String reason) {
				this.reason = reason;
			}

			public String getIssueCategory() {
				return this.issueCategory;
			}

			public void setIssueCategory(String issueCategory) {
				this.issueCategory = issueCategory;
			}

			public List<RecommendedAction> getRecommendedActions() {
				return this.recommendedActions;
			}

			public void setRecommendedActions(List<RecommendedAction> recommendedActions) {
				this.recommendedActions = recommendedActions;
			}

			public static class RecommendedAction {

				private String actionCode;

				private String url;

				private List<Parameter> parameters;

				public String getActionCode() {
					return this.actionCode;
				}

				public void setActionCode(String actionCode) {
					this.actionCode = actionCode;
				}

				public String getUrl() {
					return this.url;
				}

				public void setUrl(String url) {
					this.url = url;
				}

				public List<Parameter> getParameters() {
					return this.parameters;
				}

				public void setParameters(List<Parameter> parameters) {
					this.parameters = parameters;
				}

				public static class Parameter {

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
		}

		public static class RecentEvent {

			private String eventID;

			private String eventName;

			private String publishTime;

			public String getEventID() {
				return this.eventID;
			}

			public void setEventID(String eventID) {
				this.eventID = eventID;
			}

			public String getEventName() {
				return this.eventName;
			}

			public void setEventName(String eventName) {
				this.eventName = eventName;
			}

			public String getPublishTime() {
				return this.publishTime;
			}

			public void setPublishTime(String publishTime) {
				this.publishTime = publishTime;
			}
		}
	}

	@Override
	public OpsDescribeDiagnosticReportsResponse getInstance(UnmarshallerContext context) {
		return	OpsDescribeDiagnosticReportsResponseUnmarshaller.unmarshall(this, context);
	}
}
