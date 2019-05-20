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

package com.aliyuncs.cloudcallcenter.model.v20170705;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudcallcenter.transform.v20170705.ListPerformanceSummaryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListPerformanceSummaryResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private Report report;

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

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public Report getReport() {
		return this.report;
	}

	public void setReport(Report report) {
		this.report = report;
	}

	public static class Report {

		private String instance;

		private String phoneNumber;

		private List<PerformanceSummary> overallHistory;

		private List<PerformanceSummary> skillGroupsRealTime;

		private OverallRealTime overallRealTime;

		public String getInstance() {
			return this.instance;
		}

		public void setInstance(String instance) {
			this.instance = instance;
		}

		public String getPhoneNumber() {
			return this.phoneNumber;
		}

		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public List<PerformanceSummary> getOverallHistory() {
			return this.overallHistory;
		}

		public void setOverallHistory(List<PerformanceSummary> overallHistory) {
			this.overallHistory = overallHistory;
		}

		public List<PerformanceSummary> getSkillGroupsRealTime() {
			return this.skillGroupsRealTime;
		}

		public void setSkillGroupsRealTime(List<PerformanceSummary> skillGroupsRealTime) {
			this.skillGroupsRealTime = skillGroupsRealTime;
		}

		public OverallRealTime getOverallRealTime() {
			return this.overallRealTime;
		}

		public void setOverallRealTime(OverallRealTime overallRealTime) {
			this.overallRealTime = overallRealTime;
		}

		public static class PerformanceSummary {

			private String skillGroup;

			private Integer totalCalls;

			private Integer totalInboundCalls;

			private Integer activeCalls;

			private Integer totalUsersInQueue;

			private Integer totalAbandonedCalls;

			private Integer totalOnlineAgents;

			private Float agentUtilizationPercentage;

			private Float satisfactionPercentage;

			private Integer averageSpeedOfAnswer;

			private Integer averageTalkTime;

			private String timestamp;

			public String getSkillGroup() {
				return this.skillGroup;
			}

			public void setSkillGroup(String skillGroup) {
				this.skillGroup = skillGroup;
			}

			public Integer getTotalCalls() {
				return this.totalCalls;
			}

			public void setTotalCalls(Integer totalCalls) {
				this.totalCalls = totalCalls;
			}

			public Integer getTotalInboundCalls() {
				return this.totalInboundCalls;
			}

			public void setTotalInboundCalls(Integer totalInboundCalls) {
				this.totalInboundCalls = totalInboundCalls;
			}

			public Integer getActiveCalls() {
				return this.activeCalls;
			}

			public void setActiveCalls(Integer activeCalls) {
				this.activeCalls = activeCalls;
			}

			public Integer getTotalUsersInQueue() {
				return this.totalUsersInQueue;
			}

			public void setTotalUsersInQueue(Integer totalUsersInQueue) {
				this.totalUsersInQueue = totalUsersInQueue;
			}

			public Integer getTotalAbandonedCalls() {
				return this.totalAbandonedCalls;
			}

			public void setTotalAbandonedCalls(Integer totalAbandonedCalls) {
				this.totalAbandonedCalls = totalAbandonedCalls;
			}

			public Integer getTotalOnlineAgents() {
				return this.totalOnlineAgents;
			}

			public void setTotalOnlineAgents(Integer totalOnlineAgents) {
				this.totalOnlineAgents = totalOnlineAgents;
			}

			public Float getAgentUtilizationPercentage() {
				return this.agentUtilizationPercentage;
			}

			public void setAgentUtilizationPercentage(Float agentUtilizationPercentage) {
				this.agentUtilizationPercentage = agentUtilizationPercentage;
			}

			public Float getSatisfactionPercentage() {
				return this.satisfactionPercentage;
			}

			public void setSatisfactionPercentage(Float satisfactionPercentage) {
				this.satisfactionPercentage = satisfactionPercentage;
			}

			public Integer getAverageSpeedOfAnswer() {
				return this.averageSpeedOfAnswer;
			}

			public void setAverageSpeedOfAnswer(Integer averageSpeedOfAnswer) {
				this.averageSpeedOfAnswer = averageSpeedOfAnswer;
			}

			public Integer getAverageTalkTime() {
				return this.averageTalkTime;
			}

			public void setAverageTalkTime(Integer averageTalkTime) {
				this.averageTalkTime = averageTalkTime;
			}

			public String getTimestamp() {
				return this.timestamp;
			}

			public void setTimestamp(String timestamp) {
				this.timestamp = timestamp;
			}
		}

		public static class OverallRealTime {

			private String skillGroup;

			private Integer totalCalls;

			private Integer totalInboundCalls;

			private Integer activeCalls;

			private Integer totalUsersInQueue;

			private Integer totalAbandonedCalls;

			private Integer totalOnlineAgents;

			private Float agentUtilizationPercentage;

			private Float satisfactionPercentage;

			private Integer averageSpeedOfAnswer;

			private Integer averageTalkTime;

			private String timestamp;

			public String getSkillGroup() {
				return this.skillGroup;
			}

			public void setSkillGroup(String skillGroup) {
				this.skillGroup = skillGroup;
			}

			public Integer getTotalCalls() {
				return this.totalCalls;
			}

			public void setTotalCalls(Integer totalCalls) {
				this.totalCalls = totalCalls;
			}

			public Integer getTotalInboundCalls() {
				return this.totalInboundCalls;
			}

			public void setTotalInboundCalls(Integer totalInboundCalls) {
				this.totalInboundCalls = totalInboundCalls;
			}

			public Integer getActiveCalls() {
				return this.activeCalls;
			}

			public void setActiveCalls(Integer activeCalls) {
				this.activeCalls = activeCalls;
			}

			public Integer getTotalUsersInQueue() {
				return this.totalUsersInQueue;
			}

			public void setTotalUsersInQueue(Integer totalUsersInQueue) {
				this.totalUsersInQueue = totalUsersInQueue;
			}

			public Integer getTotalAbandonedCalls() {
				return this.totalAbandonedCalls;
			}

			public void setTotalAbandonedCalls(Integer totalAbandonedCalls) {
				this.totalAbandonedCalls = totalAbandonedCalls;
			}

			public Integer getTotalOnlineAgents() {
				return this.totalOnlineAgents;
			}

			public void setTotalOnlineAgents(Integer totalOnlineAgents) {
				this.totalOnlineAgents = totalOnlineAgents;
			}

			public Float getAgentUtilizationPercentage() {
				return this.agentUtilizationPercentage;
			}

			public void setAgentUtilizationPercentage(Float agentUtilizationPercentage) {
				this.agentUtilizationPercentage = agentUtilizationPercentage;
			}

			public Float getSatisfactionPercentage() {
				return this.satisfactionPercentage;
			}

			public void setSatisfactionPercentage(Float satisfactionPercentage) {
				this.satisfactionPercentage = satisfactionPercentage;
			}

			public Integer getAverageSpeedOfAnswer() {
				return this.averageSpeedOfAnswer;
			}

			public void setAverageSpeedOfAnswer(Integer averageSpeedOfAnswer) {
				this.averageSpeedOfAnswer = averageSpeedOfAnswer;
			}

			public Integer getAverageTalkTime() {
				return this.averageTalkTime;
			}

			public void setAverageTalkTime(Integer averageTalkTime) {
				this.averageTalkTime = averageTalkTime;
			}

			public String getTimestamp() {
				return this.timestamp;
			}

			public void setTimestamp(String timestamp) {
				this.timestamp = timestamp;
			}
		}
	}

	@Override
	public ListPerformanceSummaryResponse getInstance(UnmarshallerContext context) {
		return	ListPerformanceSummaryResponseUnmarshaller.unmarshall(this, context);
	}
}
