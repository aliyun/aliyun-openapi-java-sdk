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
import com.aliyuncs.ccc.transform.v20170705.GenerateAgentStatisticReportResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GenerateAgentStatisticReportResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private DataList dataList;

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

	public DataList getDataList() {
		return this.dataList;
	}

	public void setDataList(DataList dataList) {
		this.dataList = dataList;
	}

	public static class DataList {

		private Integer totalCount;

		private Integer pageNumber;

		private Integer pageSize;

		private List<GenerateAgentStatistic> list;

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

		public List<GenerateAgentStatistic> getList() {
			return this.list;
		}

		public void setList(List<GenerateAgentStatistic> list) {
			this.list = list;
		}

		public static class GenerateAgentStatistic {

			private String agentId;

			private String loginName;

			private String agentName;

			private String skillGroupIds;

			private String skillGroupNames;

			private String instanceId;

			private String recordDate;

			private Long totalLoggedInTime;

			private Long totalBreakTime;

			private Float occupancyRate;

			private Long totalReadyTime;

			private Long maxReadyTime;

			private Long averageReadyTime;

			private Inbound inbound;

			private Outbound outbound;

			private Overall overall;

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

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getRecordDate() {
				return this.recordDate;
			}

			public void setRecordDate(String recordDate) {
				this.recordDate = recordDate;
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

			public Overall getOverall() {
				return this.overall;
			}

			public void setOverall(Overall overall) {
				this.overall = overall;
			}

			public static class Inbound {

				private Long totalTalkTime;

				private Long maxTalkTime;

				private Long averageTalkTime;

				private Long totalHoldTime;

				private Long maxHoldTime;

				private Long averageHoldTime;

				private Long totalWorkTime;

				private Long maxWorkTime;

				private Long averageWorkTime;

				private Long satisfactionSurveysOffered;

				private Long satisfactionSurveysResponded;

				private Float satisfactionIndex;

				private Long callsOffered;

				private Long callsHandled;

				private Float handleRate;

				private Long totalRingTime;

				private Long maxRingTime;

				private Long averageRingTime;

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

				public Long getTotalHoldTime() {
					return this.totalHoldTime;
				}

				public void setTotalHoldTime(Long totalHoldTime) {
					this.totalHoldTime = totalHoldTime;
				}

				public Long getMaxHoldTime() {
					return this.maxHoldTime;
				}

				public void setMaxHoldTime(Long maxHoldTime) {
					this.maxHoldTime = maxHoldTime;
				}

				public Long getAverageHoldTime() {
					return this.averageHoldTime;
				}

				public void setAverageHoldTime(Long averageHoldTime) {
					this.averageHoldTime = averageHoldTime;
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

				public Float getSatisfactionIndex() {
					return this.satisfactionIndex;
				}

				public void setSatisfactionIndex(Float satisfactionIndex) {
					this.satisfactionIndex = satisfactionIndex;
				}

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
			}

			public static class Outbound {

				private Long totalTalkTime;

				private Long maxTalkTime;

				private Long averageTalkTime;

				private Long totalHoldTime;

				private Long maxHoldTime;

				private Long averageHoldTime;

				private Long totalWorkTime;

				private Long maxWorkTime;

				private Long averageWorkTime;

				private Long satisfactionSurveysOffered;

				private Long satisfactionSurveysResponded;

				private Float satisfactionIndex;

				private Long callsDialed;

				private Long callsAnswered;

				private Float answerRate;

				private Long totalDialingTime;

				private Long totalDialingTime1;

				private Long maxDialingTime;

				private Long averageDialingTime;

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

				public Long getTotalHoldTime() {
					return this.totalHoldTime;
				}

				public void setTotalHoldTime(Long totalHoldTime) {
					this.totalHoldTime = totalHoldTime;
				}

				public Long getMaxHoldTime() {
					return this.maxHoldTime;
				}

				public void setMaxHoldTime(Long maxHoldTime) {
					this.maxHoldTime = maxHoldTime;
				}

				public Long getAverageHoldTime() {
					return this.averageHoldTime;
				}

				public void setAverageHoldTime(Long averageHoldTime) {
					this.averageHoldTime = averageHoldTime;
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

				public Float getSatisfactionIndex() {
					return this.satisfactionIndex;
				}

				public void setSatisfactionIndex(Float satisfactionIndex) {
					this.satisfactionIndex = satisfactionIndex;
				}

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

				public Long getTotalDialingTime1() {
					return this.totalDialingTime1;
				}

				public void setTotalDialingTime1(Long totalDialingTime1) {
					this.totalDialingTime1 = totalDialingTime1;
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
			}

			public static class Overall {

				private Long totalTalkTime;

				private Long maxTalkTime;

				private Long averageTalkTime;

				private Long totalHoldTime;

				private Long maxHoldTime;

				private Long averageHoldTime;

				private Long totalWorkTime;

				private Long maxWorkTime;

				private Long averageWorkTime;

				private Long satisfactionSurveysOffered;

				private Long satisfactionSurveysResponded;

				private Float satisfactionIndex;

				private Long totalCalls;

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

				public Long getTotalHoldTime() {
					return this.totalHoldTime;
				}

				public void setTotalHoldTime(Long totalHoldTime) {
					this.totalHoldTime = totalHoldTime;
				}

				public Long getMaxHoldTime() {
					return this.maxHoldTime;
				}

				public void setMaxHoldTime(Long maxHoldTime) {
					this.maxHoldTime = maxHoldTime;
				}

				public Long getAverageHoldTime() {
					return this.averageHoldTime;
				}

				public void setAverageHoldTime(Long averageHoldTime) {
					this.averageHoldTime = averageHoldTime;
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

				public Float getSatisfactionIndex() {
					return this.satisfactionIndex;
				}

				public void setSatisfactionIndex(Float satisfactionIndex) {
					this.satisfactionIndex = satisfactionIndex;
				}

				public Long getTotalCalls() {
					return this.totalCalls;
				}

				public void setTotalCalls(Long totalCalls) {
					this.totalCalls = totalCalls;
				}
			}
		}
	}

	@Override
	public GenerateAgentStatisticReportResponse getInstance(UnmarshallerContext context) {
		return	GenerateAgentStatisticReportResponseUnmarshaller.unmarshall(this, context);
	}
}
