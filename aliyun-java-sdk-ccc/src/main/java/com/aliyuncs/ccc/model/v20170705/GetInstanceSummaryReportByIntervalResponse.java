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
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ccc.transform.v20170705.GetInstanceSummaryReportByIntervalResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetInstanceSummaryReportByIntervalResponse extends AcsResponse {

	private Integer httpStatusCode;

	private String code;

	private String message;

	private String requestId;

	private Boolean success;

	private InstanceTimeIntervalReport instanceTimeIntervalReport;

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
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

	public InstanceTimeIntervalReport getInstanceTimeIntervalReport() {
		return this.instanceTimeIntervalReport;
	}

	public void setInstanceTimeIntervalReport(InstanceTimeIntervalReport instanceTimeIntervalReport) {
		this.instanceTimeIntervalReport = instanceTimeIntervalReport;
	}

	public static class InstanceTimeIntervalReport {

		private String instanceId;

		private List<InstanceSummaryReport> intervalList;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public List<InstanceSummaryReport> getIntervalList() {
			return this.intervalList;
		}

		public void setIntervalList(List<InstanceSummaryReport> intervalList) {
			this.intervalList = intervalList;
		}

		public static class InstanceSummaryReport {

			private String instanceId;

			private String timestamp;

			private Overall overall;

			private Inbound inbound;

			private Outbound outbound;

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getTimestamp() {
				return this.timestamp;
			}

			public void setTimestamp(String timestamp) {
				this.timestamp = timestamp;
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

				private Long totalLoggedInTime;

				private Long totalTalkTime;

				private Float occupancyRate;

				private Long totalWorkTime;

				private Long maxWorkTime;

				private Long averageWorkTime;

				private Long averageTalkTime;

				private Float satisfactionIndex;

				private Long satisfactionSurveysOffered;

				private Long satisfactionSurveysResponded;

				private Long maxReadyTime;

				private Long averageReadyTime;

				private Long totalBreakTime;

				private Long totalReadyTime;

				private Long maxTalkTime;

				private Long totalCalls;

				public Long getTotalLoggedInTime() {
					return this.totalLoggedInTime;
				}

				public void setTotalLoggedInTime(Long totalLoggedInTime) {
					this.totalLoggedInTime = totalLoggedInTime;
				}

				public Long getTotalTalkTime() {
					return this.totalTalkTime;
				}

				public void setTotalTalkTime(Long totalTalkTime) {
					this.totalTalkTime = totalTalkTime;
				}

				public Float getOccupancyRate() {
					return this.occupancyRate;
				}

				public void setOccupancyRate(Float occupancyRate) {
					this.occupancyRate = occupancyRate;
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

				public Long getAverageTalkTime() {
					return this.averageTalkTime;
				}

				public void setAverageTalkTime(Long averageTalkTime) {
					this.averageTalkTime = averageTalkTime;
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

				public Long getTotalBreakTime() {
					return this.totalBreakTime;
				}

				public void setTotalBreakTime(Long totalBreakTime) {
					this.totalBreakTime = totalBreakTime;
				}

				public Long getTotalReadyTime() {
					return this.totalReadyTime;
				}

				public void setTotalReadyTime(Long totalReadyTime) {
					this.totalReadyTime = totalReadyTime;
				}

				public Long getMaxTalkTime() {
					return this.maxTalkTime;
				}

				public void setMaxTalkTime(Long maxTalkTime) {
					this.maxTalkTime = maxTalkTime;
				}

				public Long getTotalCalls() {
					return this.totalCalls;
				}

				public void setTotalCalls(Long totalCalls) {
					this.totalCalls = totalCalls;
				}
			}

			public static class Inbound {

				private Long callsIncomingLine;

				private Long averageRingTime;

				private Long callsHandled;

				private Long totalWorkTime;

				private Long callsAbandonedInIVR;

				private Long maxWorkTime;

				private Long averageWaitTime;

				private Long callsIncomingQueue;

				private Long averageWorkTime;

				private Float satisfactionIndex;

				private Long totalWaitTime;

				private Long totalRingTime;

				private String maxTalkTime;

				private Long maxRingTime;

				private Long callsIncomingIVR;

				private Long totalTalkTime;

				private Long callsOffered;

				private Long maxWaitTime;

				private Float serviceLevel20;

				private Long averageTalkTime;

				private Long satisfactionSurveysOffered;

				private Float handleRate;

				private Long satisfactionSurveysResponded;

				private Long callsAbandonedInQueue;

				public Long getCallsIncomingLine() {
					return this.callsIncomingLine;
				}

				public void setCallsIncomingLine(Long callsIncomingLine) {
					this.callsIncomingLine = callsIncomingLine;
				}

				public Long getAverageRingTime() {
					return this.averageRingTime;
				}

				public void setAverageRingTime(Long averageRingTime) {
					this.averageRingTime = averageRingTime;
				}

				public Long getCallsHandled() {
					return this.callsHandled;
				}

				public void setCallsHandled(Long callsHandled) {
					this.callsHandled = callsHandled;
				}

				public Long getTotalWorkTime() {
					return this.totalWorkTime;
				}

				public void setTotalWorkTime(Long totalWorkTime) {
					this.totalWorkTime = totalWorkTime;
				}

				public Long getCallsAbandonedInIVR() {
					return this.callsAbandonedInIVR;
				}

				public void setCallsAbandonedInIVR(Long callsAbandonedInIVR) {
					this.callsAbandonedInIVR = callsAbandonedInIVR;
				}

				public Long getMaxWorkTime() {
					return this.maxWorkTime;
				}

				public void setMaxWorkTime(Long maxWorkTime) {
					this.maxWorkTime = maxWorkTime;
				}

				public Long getAverageWaitTime() {
					return this.averageWaitTime;
				}

				public void setAverageWaitTime(Long averageWaitTime) {
					this.averageWaitTime = averageWaitTime;
				}

				public Long getCallsIncomingQueue() {
					return this.callsIncomingQueue;
				}

				public void setCallsIncomingQueue(Long callsIncomingQueue) {
					this.callsIncomingQueue = callsIncomingQueue;
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

				public Long getTotalWaitTime() {
					return this.totalWaitTime;
				}

				public void setTotalWaitTime(Long totalWaitTime) {
					this.totalWaitTime = totalWaitTime;
				}

				public Long getTotalRingTime() {
					return this.totalRingTime;
				}

				public void setTotalRingTime(Long totalRingTime) {
					this.totalRingTime = totalRingTime;
				}

				public String getMaxTalkTime() {
					return this.maxTalkTime;
				}

				public void setMaxTalkTime(String maxTalkTime) {
					this.maxTalkTime = maxTalkTime;
				}

				public Long getMaxRingTime() {
					return this.maxRingTime;
				}

				public void setMaxRingTime(Long maxRingTime) {
					this.maxRingTime = maxRingTime;
				}

				public Long getCallsIncomingIVR() {
					return this.callsIncomingIVR;
				}

				public void setCallsIncomingIVR(Long callsIncomingIVR) {
					this.callsIncomingIVR = callsIncomingIVR;
				}

				public Long getTotalTalkTime() {
					return this.totalTalkTime;
				}

				public void setTotalTalkTime(Long totalTalkTime) {
					this.totalTalkTime = totalTalkTime;
				}

				public Long getCallsOffered() {
					return this.callsOffered;
				}

				public void setCallsOffered(Long callsOffered) {
					this.callsOffered = callsOffered;
				}

				public Long getMaxWaitTime() {
					return this.maxWaitTime;
				}

				public void setMaxWaitTime(Long maxWaitTime) {
					this.maxWaitTime = maxWaitTime;
				}

				public Float getServiceLevel20() {
					return this.serviceLevel20;
				}

				public void setServiceLevel20(Float serviceLevel20) {
					this.serviceLevel20 = serviceLevel20;
				}

				public Long getAverageTalkTime() {
					return this.averageTalkTime;
				}

				public void setAverageTalkTime(Long averageTalkTime) {
					this.averageTalkTime = averageTalkTime;
				}

				public Long getSatisfactionSurveysOffered() {
					return this.satisfactionSurveysOffered;
				}

				public void setSatisfactionSurveysOffered(Long satisfactionSurveysOffered) {
					this.satisfactionSurveysOffered = satisfactionSurveysOffered;
				}

				public Float getHandleRate() {
					return this.handleRate;
				}

				public void setHandleRate(Float handleRate) {
					this.handleRate = handleRate;
				}

				public Long getSatisfactionSurveysResponded() {
					return this.satisfactionSurveysResponded;
				}

				public void setSatisfactionSurveysResponded(Long satisfactionSurveysResponded) {
					this.satisfactionSurveysResponded = satisfactionSurveysResponded;
				}

				public Long getCallsAbandonedInQueue() {
					return this.callsAbandonedInQueue;
				}

				public void setCallsAbandonedInQueue(Long callsAbandonedInQueue) {
					this.callsAbandonedInQueue = callsAbandonedInQueue;
				}
			}

			public static class Outbound {

				private Long totalTalkTime;

				private Long maxDialingTime;

				private Long callsDialed;

				private Long callsAnswered;

				private Float answerRate;

				private Long totalWorkTime;

				private Long maxWorkTime;

				private Long totalDialingTime;

				private Long averageTalkTime;

				private Long averageWorkTime;

				private Float satisfactionIndex;

				private Long satisfactionSurveysOffered;

				private Long satisfactionSurveysResponded;

				private Long maxTalkTime;

				private Long averageDialingTime;

				public Long getTotalTalkTime() {
					return this.totalTalkTime;
				}

				public void setTotalTalkTime(Long totalTalkTime) {
					this.totalTalkTime = totalTalkTime;
				}

				public Long getMaxDialingTime() {
					return this.maxDialingTime;
				}

				public void setMaxDialingTime(Long maxDialingTime) {
					this.maxDialingTime = maxDialingTime;
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

				public Long getTotalDialingTime() {
					return this.totalDialingTime;
				}

				public void setTotalDialingTime(Long totalDialingTime) {
					this.totalDialingTime = totalDialingTime;
				}

				public Long getAverageTalkTime() {
					return this.averageTalkTime;
				}

				public void setAverageTalkTime(Long averageTalkTime) {
					this.averageTalkTime = averageTalkTime;
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

				public Long getMaxTalkTime() {
					return this.maxTalkTime;
				}

				public void setMaxTalkTime(Long maxTalkTime) {
					this.maxTalkTime = maxTalkTime;
				}

				public Long getAverageDialingTime() {
					return this.averageDialingTime;
				}

				public void setAverageDialingTime(Long averageDialingTime) {
					this.averageDialingTime = averageDialingTime;
				}
			}
		}
	}

	@Override
	public GetInstanceSummaryReportByIntervalResponse getInstance(UnmarshallerContext context) {
		return	GetInstanceSummaryReportByIntervalResponseUnmarshaller.unmarshall(this, context);
	}
}
