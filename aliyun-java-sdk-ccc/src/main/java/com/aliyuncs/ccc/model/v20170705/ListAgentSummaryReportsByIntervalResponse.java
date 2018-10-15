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

package com.aliyuncs.ccc.model.v20170705;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ccc.transform.v20170705.ListAgentSummaryReportsByIntervalResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAgentSummaryReportsByIntervalResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private PagedAgentSummaryReport pagedAgentSummaryReport;

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

	public PagedAgentSummaryReport getPagedAgentSummaryReport() {
		return this.pagedAgentSummaryReport;
	}

	public void setPagedAgentSummaryReport(PagedAgentSummaryReport pagedAgentSummaryReport) {
		this.pagedAgentSummaryReport = pagedAgentSummaryReport;
	}

	public static class PagedAgentSummaryReport {

		private Integer totalCount;

		private Integer pageNumber;

		private Integer pageSize;

		private List<AgentTimeIntervalReport> list;

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public Integer getPageNumber() {
			return this.pageNumber;
		}

		public void setPageNumber(Integer pageNumber) {
			this.pageNumber = pageNumber;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public List<AgentTimeIntervalReport> getList() {
			return this.list;
		}

		public void setList(List<AgentTimeIntervalReport> list) {
			this.list = list;
		}

		public static class AgentTimeIntervalReport {

			private String agentId;

			private List<AgentSummaryReport> intervalList;

			public String getAgentId() {
				return this.agentId;
			}

			public void setAgentId(String agentId) {
				this.agentId = agentId;
			}

			public List<AgentSummaryReport> getIntervalList() {
				return this.intervalList;
			}

			public void setIntervalList(List<AgentSummaryReport> intervalList) {
				this.intervalList = intervalList;
			}

			public static class AgentSummaryReport {

				private String timestamp;

				private String instanceId;

				private String agentId;

				private String loginName;

				private String agentName;

				private String skillGroupIds;

				private String skillGroupNames;

				private Overall overall;

				private Inbound inbound;

				private Outbound outbound;

				public String getTimestamp() {
					return this.timestamp;
				}

				public void setTimestamp(String timestamp) {
					this.timestamp = timestamp;
				}

				public String getInstanceId() {
					return this.instanceId;
				}

				public void setInstanceId(String instanceId) {
					this.instanceId = instanceId;
				}

				public String getAgentId() {
					return this.agentId;
				}

				public void setAgentId(String agentId) {
					this.agentId = agentId;
				}

				public String getLoginName() {
					return this.loginName;
				}

				public void setLoginName(String loginName) {
					this.loginName = loginName;
				}

				public String getAgentName() {
					return this.agentName;
				}

				public void setAgentName(String agentName) {
					this.agentName = agentName;
				}

				public String getSkillGroupIds() {
					return this.skillGroupIds;
				}

				public void setSkillGroupIds(String skillGroupIds) {
					this.skillGroupIds = skillGroupIds;
				}

				public String getSkillGroupNames() {
					return this.skillGroupNames;
				}

				public void setSkillGroupNames(String skillGroupNames) {
					this.skillGroupNames = skillGroupNames;
				}

				public Overall getOverall() {
					return this.overall;
				}

				public void setOverall(Overall overall) {
					this.overall = overall;
				}

				public Inbound getInbound() {
					return this.inbound;
				}

				public void setInbound(Inbound inbound) {
					this.inbound = inbound;
				}

				public Outbound getOutbound() {
					return this.outbound;
				}

				public void setOutbound(Outbound outbound) {
					this.outbound = outbound;
				}

				public static class Overall {

					private Long totalCalls;

					private Long totalLoggedInTime;

					private Long totalBreakTime;

					private Float occupancyRate;

					private Long totalReadyTime;

					private Long maxReadyTime;

					private Long averageReadyTime;

					private Long totalTalkTime;

					private Long maxTalkTime;

					private Long averageTalkTime;

					private Long totalWorkTime;

					private Long maxWorkTime;

					private Long averageWorkTime;

					private Float satisfactionIndex;

					private Long satisfactionSurveysOffered;

					private Long satisfactionSurveysResponded;

					public Long getTotalCalls() {
						return this.totalCalls;
					}

					public void setTotalCalls(Long totalCalls) {
						this.totalCalls = totalCalls;
					}

					public Long getTotalLoggedInTime() {
						return this.totalLoggedInTime;
					}

					public void setTotalLoggedInTime(Long totalLoggedInTime) {
						this.totalLoggedInTime = totalLoggedInTime;
					}

					public Long getTotalBreakTime() {
						return this.totalBreakTime;
					}

					public void setTotalBreakTime(Long totalBreakTime) {
						this.totalBreakTime = totalBreakTime;
					}

					public Float getOccupancyRate() {
						return this.occupancyRate;
					}

					public void setOccupancyRate(Float occupancyRate) {
						this.occupancyRate = occupancyRate;
					}

					public Long getTotalReadyTime() {
						return this.totalReadyTime;
					}

					public void setTotalReadyTime(Long totalReadyTime) {
						this.totalReadyTime = totalReadyTime;
					}

					public Long getMaxReadyTime() {
						return this.maxReadyTime;
					}

					public void setMaxReadyTime(Long maxReadyTime) {
						this.maxReadyTime = maxReadyTime;
					}

					public Long getAverageReadyTime() {
						return this.averageReadyTime;
					}

					public void setAverageReadyTime(Long averageReadyTime) {
						this.averageReadyTime = averageReadyTime;
					}

					public Long getTotalTalkTime() {
						return this.totalTalkTime;
					}

					public void setTotalTalkTime(Long totalTalkTime) {
						this.totalTalkTime = totalTalkTime;
					}

					public Long getMaxTalkTime() {
						return this.maxTalkTime;
					}

					public void setMaxTalkTime(Long maxTalkTime) {
						this.maxTalkTime = maxTalkTime;
					}

					public Long getAverageTalkTime() {
						return this.averageTalkTime;
					}

					public void setAverageTalkTime(Long averageTalkTime) {
						this.averageTalkTime = averageTalkTime;
					}

					public Long getTotalWorkTime() {
						return this.totalWorkTime;
					}

					public void setTotalWorkTime(Long totalWorkTime) {
						this.totalWorkTime = totalWorkTime;
					}

					public Long getMaxWorkTime() {
						return this.maxWorkTime;
					}

					public void setMaxWorkTime(Long maxWorkTime) {
						this.maxWorkTime = maxWorkTime;
					}

					public Long getAverageWorkTime() {
						return this.averageWorkTime;
					}

					public void setAverageWorkTime(Long averageWorkTime) {
						this.averageWorkTime = averageWorkTime;
					}

					public Float getSatisfactionIndex() {
						return this.satisfactionIndex;
					}

					public void setSatisfactionIndex(Float satisfactionIndex) {
						this.satisfactionIndex = satisfactionIndex;
					}

					public Long getSatisfactionSurveysOffered() {
						return this.satisfactionSurveysOffered;
					}

					public void setSatisfactionSurveysOffered(Long satisfactionSurveysOffered) {
						this.satisfactionSurveysOffered = satisfactionSurveysOffered;
					}

					public Long getSatisfactionSurveysResponded() {
						return this.satisfactionSurveysResponded;
					}

					public void setSatisfactionSurveysResponded(Long satisfactionSurveysResponded) {
						this.satisfactionSurveysResponded = satisfactionSurveysResponded;
					}
				}

				public static class Inbound {

					private Long callsOffered;

					private Long callsHandled;

					private Float handleRate;

					private Long totalRingTime;

					private Long maxRingTime;

					private Long averageRingTime;

					private Float serviceLevel20;

					private Long totalTalkTime;

					private Long maxTalkTime;

					private Long averageTalkTime;

					private Long totalWorkTime;

					private Long maxWorkTime;

					private Long averageWorkTime;

					private Float satisfactionIndex;

					private Long satisfactionSurveysOffered;

					private Long satisfactionSurveysResponded;

					public Long getCallsOffered() {
						return this.callsOffered;
					}

					public void setCallsOffered(Long callsOffered) {
						this.callsOffered = callsOffered;
					}

					public Long getCallsHandled() {
						return this.callsHandled;
					}

					public void setCallsHandled(Long callsHandled) {
						this.callsHandled = callsHandled;
					}

					public Float getHandleRate() {
						return this.handleRate;
					}

					public void setHandleRate(Float handleRate) {
						this.handleRate = handleRate;
					}

					public Long getTotalRingTime() {
						return this.totalRingTime;
					}

					public void setTotalRingTime(Long totalRingTime) {
						this.totalRingTime = totalRingTime;
					}

					public Long getMaxRingTime() {
						return this.maxRingTime;
					}

					public void setMaxRingTime(Long maxRingTime) {
						this.maxRingTime = maxRingTime;
					}

					public Long getAverageRingTime() {
						return this.averageRingTime;
					}

					public void setAverageRingTime(Long averageRingTime) {
						this.averageRingTime = averageRingTime;
					}

					public Float getServiceLevel20() {
						return this.serviceLevel20;
					}

					public void setServiceLevel20(Float serviceLevel20) {
						this.serviceLevel20 = serviceLevel20;
					}

					public Long getTotalTalkTime() {
						return this.totalTalkTime;
					}

					public void setTotalTalkTime(Long totalTalkTime) {
						this.totalTalkTime = totalTalkTime;
					}

					public Long getMaxTalkTime() {
						return this.maxTalkTime;
					}

					public void setMaxTalkTime(Long maxTalkTime) {
						this.maxTalkTime = maxTalkTime;
					}

					public Long getAverageTalkTime() {
						return this.averageTalkTime;
					}

					public void setAverageTalkTime(Long averageTalkTime) {
						this.averageTalkTime = averageTalkTime;
					}

					public Long getTotalWorkTime() {
						return this.totalWorkTime;
					}

					public void setTotalWorkTime(Long totalWorkTime) {
						this.totalWorkTime = totalWorkTime;
					}

					public Long getMaxWorkTime() {
						return this.maxWorkTime;
					}

					public void setMaxWorkTime(Long maxWorkTime) {
						this.maxWorkTime = maxWorkTime;
					}

					public Long getAverageWorkTime() {
						return this.averageWorkTime;
					}

					public void setAverageWorkTime(Long averageWorkTime) {
						this.averageWorkTime = averageWorkTime;
					}

					public Float getSatisfactionIndex() {
						return this.satisfactionIndex;
					}

					public void setSatisfactionIndex(Float satisfactionIndex) {
						this.satisfactionIndex = satisfactionIndex;
					}

					public Long getSatisfactionSurveysOffered() {
						return this.satisfactionSurveysOffered;
					}

					public void setSatisfactionSurveysOffered(Long satisfactionSurveysOffered) {
						this.satisfactionSurveysOffered = satisfactionSurveysOffered;
					}

					public Long getSatisfactionSurveysResponded() {
						return this.satisfactionSurveysResponded;
					}

					public void setSatisfactionSurveysResponded(Long satisfactionSurveysResponded) {
						this.satisfactionSurveysResponded = satisfactionSurveysResponded;
					}
				}

				public static class Outbound {

					private Long callsDialed;

					private Long callsAnswered;

					private Float answerRate;

					private Long totalDialingTime;

					private Long maxDialingTime;

					private Long averageDialingTime;

					private Long totalTalkTime;

					private Long maxTalkTime;

					private Long averageTalkTime;

					private Long totalWorkTime;

					private Long maxWorkTime;

					private Long averageWorkTime;

					private Float satisfactionIndex;

					private Long satisfactionSurveysOffered;

					private Long satisfactionSurveysResponded;

					public Long getCallsDialed() {
						return this.callsDialed;
					}

					public void setCallsDialed(Long callsDialed) {
						this.callsDialed = callsDialed;
					}

					public Long getCallsAnswered() {
						return this.callsAnswered;
					}

					public void setCallsAnswered(Long callsAnswered) {
						this.callsAnswered = callsAnswered;
					}

					public Float getAnswerRate() {
						return this.answerRate;
					}

					public void setAnswerRate(Float answerRate) {
						this.answerRate = answerRate;
					}

					public Long getTotalDialingTime() {
						return this.totalDialingTime;
					}

					public void setTotalDialingTime(Long totalDialingTime) {
						this.totalDialingTime = totalDialingTime;
					}

					public Long getMaxDialingTime() {
						return this.maxDialingTime;
					}

					public void setMaxDialingTime(Long maxDialingTime) {
						this.maxDialingTime = maxDialingTime;
					}

					public Long getAverageDialingTime() {
						return this.averageDialingTime;
					}

					public void setAverageDialingTime(Long averageDialingTime) {
						this.averageDialingTime = averageDialingTime;
					}

					public Long getTotalTalkTime() {
						return this.totalTalkTime;
					}

					public void setTotalTalkTime(Long totalTalkTime) {
						this.totalTalkTime = totalTalkTime;
					}

					public Long getMaxTalkTime() {
						return this.maxTalkTime;
					}

					public void setMaxTalkTime(Long maxTalkTime) {
						this.maxTalkTime = maxTalkTime;
					}

					public Long getAverageTalkTime() {
						return this.averageTalkTime;
					}

					public void setAverageTalkTime(Long averageTalkTime) {
						this.averageTalkTime = averageTalkTime;
					}

					public Long getTotalWorkTime() {
						return this.totalWorkTime;
					}

					public void setTotalWorkTime(Long totalWorkTime) {
						this.totalWorkTime = totalWorkTime;
					}

					public Long getMaxWorkTime() {
						return this.maxWorkTime;
					}

					public void setMaxWorkTime(Long maxWorkTime) {
						this.maxWorkTime = maxWorkTime;
					}

					public Long getAverageWorkTime() {
						return this.averageWorkTime;
					}

					public void setAverageWorkTime(Long averageWorkTime) {
						this.averageWorkTime = averageWorkTime;
					}

					public Float getSatisfactionIndex() {
						return this.satisfactionIndex;
					}

					public void setSatisfactionIndex(Float satisfactionIndex) {
						this.satisfactionIndex = satisfactionIndex;
					}

					public Long getSatisfactionSurveysOffered() {
						return this.satisfactionSurveysOffered;
					}

					public void setSatisfactionSurveysOffered(Long satisfactionSurveysOffered) {
						this.satisfactionSurveysOffered = satisfactionSurveysOffered;
					}

					public Long getSatisfactionSurveysResponded() {
						return this.satisfactionSurveysResponded;
					}

					public void setSatisfactionSurveysResponded(Long satisfactionSurveysResponded) {
						this.satisfactionSurveysResponded = satisfactionSurveysResponded;
					}
				}
			}
		}
	}

	@Override
	public ListAgentSummaryReportsByIntervalResponse getInstance(UnmarshallerContext context) {
		return	ListAgentSummaryReportsByIntervalResponseUnmarshaller.unmarshall(this, context);
	}
}
