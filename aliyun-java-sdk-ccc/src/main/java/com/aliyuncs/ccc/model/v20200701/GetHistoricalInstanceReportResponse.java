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

package com.aliyuncs.ccc.model.v20200701;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ccc.transform.v20200701.GetHistoricalInstanceReportResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetHistoricalInstanceReportResponse extends AcsResponse {

	private String code;

	private Integer httpStatusCode;

	private String message;

	private String requestId;

	private Data data;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Inbound inbound;

		private Outbound outbound;

		private Overall overall;

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

			private Float abandonRate;

			private Float averageAbandonTime;

			private Float averageAbandonedInIVRTime;

			private Float averageAbandonedInQueueTime;

			private Float averageAbandonedInRingTime;

			private Float averageHoldTime;

			private Float averageRingTime;

			private Float averageTalkTime;

			private Float averageWaitTime;

			private Float averageWorkTime;

			private Long callsAbandoned;

			private Long callsAbandonedInIVR;

			private Long callsAbandonedInQueue;

			private Long callsAbandonedInRinging;

			private Long callsConsulted;

			private Long callsHandled;

			private Long callsHold;

			private Long callsOffered;

			private Long callsQueued;

			private Long callsRinged;

			private Long callsTransferred;

			private Float handleRate;

			private Long maxAbandonTime;

			private Long maxAbandonedInIVRTime;

			private Long maxAbandonedInQueueTime;

			private Long maxAbandonedInRingTime;

			private Long maxHoldTime;

			private Long maxRingTime;

			private Long maxTalkTime;

			private Long maxWaitTime;

			private Long maxWorkTime;

			private Float satisfactionIndex;

			private Long satisfactionSurveysOffered;

			private Long satisfactionSurveysResponded;

			private Float serviceLevel20;

			private Long totalAbandonTime;

			private Long totalAbandonedInIVRTime;

			private Long totalAbandonedInQueueTime;

			private Long totalAbandonedInRingTime;

			private Long totalHoldTime;

			private Long totalRingTime;

			private Long totalTalkTime;

			private Long totalWaitTime;

			private Long totalWorkTime;

			public Float getAbandonRate() {
				return this.abandonRate;
			}

			public void setAbandonRate(Float abandonRate) {
				this.abandonRate = abandonRate;
			}

			public Float getAverageAbandonTime() {
				return this.averageAbandonTime;
			}

			public void setAverageAbandonTime(Float averageAbandonTime) {
				this.averageAbandonTime = averageAbandonTime;
			}

			public Float getAverageAbandonedInIVRTime() {
				return this.averageAbandonedInIVRTime;
			}

			public void setAverageAbandonedInIVRTime(Float averageAbandonedInIVRTime) {
				this.averageAbandonedInIVRTime = averageAbandonedInIVRTime;
			}

			public Float getAverageAbandonedInQueueTime() {
				return this.averageAbandonedInQueueTime;
			}

			public void setAverageAbandonedInQueueTime(Float averageAbandonedInQueueTime) {
				this.averageAbandonedInQueueTime = averageAbandonedInQueueTime;
			}

			public Float getAverageAbandonedInRingTime() {
				return this.averageAbandonedInRingTime;
			}

			public void setAverageAbandonedInRingTime(Float averageAbandonedInRingTime) {
				this.averageAbandonedInRingTime = averageAbandonedInRingTime;
			}

			public Float getAverageHoldTime() {
				return this.averageHoldTime;
			}

			public void setAverageHoldTime(Float averageHoldTime) {
				this.averageHoldTime = averageHoldTime;
			}

			public Float getAverageRingTime() {
				return this.averageRingTime;
			}

			public void setAverageRingTime(Float averageRingTime) {
				this.averageRingTime = averageRingTime;
			}

			public Float getAverageTalkTime() {
				return this.averageTalkTime;
			}

			public void setAverageTalkTime(Float averageTalkTime) {
				this.averageTalkTime = averageTalkTime;
			}

			public Float getAverageWaitTime() {
				return this.averageWaitTime;
			}

			public void setAverageWaitTime(Float averageWaitTime) {
				this.averageWaitTime = averageWaitTime;
			}

			public Float getAverageWorkTime() {
				return this.averageWorkTime;
			}

			public void setAverageWorkTime(Float averageWorkTime) {
				this.averageWorkTime = averageWorkTime;
			}

			public Long getCallsAbandoned() {
				return this.callsAbandoned;
			}

			public void setCallsAbandoned(Long callsAbandoned) {
				this.callsAbandoned = callsAbandoned;
			}

			public Long getCallsAbandonedInIVR() {
				return this.callsAbandonedInIVR;
			}

			public void setCallsAbandonedInIVR(Long callsAbandonedInIVR) {
				this.callsAbandonedInIVR = callsAbandonedInIVR;
			}

			public Long getCallsAbandonedInQueue() {
				return this.callsAbandonedInQueue;
			}

			public void setCallsAbandonedInQueue(Long callsAbandonedInQueue) {
				this.callsAbandonedInQueue = callsAbandonedInQueue;
			}

			public Long getCallsAbandonedInRinging() {
				return this.callsAbandonedInRinging;
			}

			public void setCallsAbandonedInRinging(Long callsAbandonedInRinging) {
				this.callsAbandonedInRinging = callsAbandonedInRinging;
			}

			public Long getCallsConsulted() {
				return this.callsConsulted;
			}

			public void setCallsConsulted(Long callsConsulted) {
				this.callsConsulted = callsConsulted;
			}

			public Long getCallsHandled() {
				return this.callsHandled;
			}

			public void setCallsHandled(Long callsHandled) {
				this.callsHandled = callsHandled;
			}

			public Long getCallsHold() {
				return this.callsHold;
			}

			public void setCallsHold(Long callsHold) {
				this.callsHold = callsHold;
			}

			public Long getCallsOffered() {
				return this.callsOffered;
			}

			public void setCallsOffered(Long callsOffered) {
				this.callsOffered = callsOffered;
			}

			public Long getCallsQueued() {
				return this.callsQueued;
			}

			public void setCallsQueued(Long callsQueued) {
				this.callsQueued = callsQueued;
			}

			public Long getCallsRinged() {
				return this.callsRinged;
			}

			public void setCallsRinged(Long callsRinged) {
				this.callsRinged = callsRinged;
			}

			public Long getCallsTransferred() {
				return this.callsTransferred;
			}

			public void setCallsTransferred(Long callsTransferred) {
				this.callsTransferred = callsTransferred;
			}

			public Float getHandleRate() {
				return this.handleRate;
			}

			public void setHandleRate(Float handleRate) {
				this.handleRate = handleRate;
			}

			public Long getMaxAbandonTime() {
				return this.maxAbandonTime;
			}

			public void setMaxAbandonTime(Long maxAbandonTime) {
				this.maxAbandonTime = maxAbandonTime;
			}

			public Long getMaxAbandonedInIVRTime() {
				return this.maxAbandonedInIVRTime;
			}

			public void setMaxAbandonedInIVRTime(Long maxAbandonedInIVRTime) {
				this.maxAbandonedInIVRTime = maxAbandonedInIVRTime;
			}

			public Long getMaxAbandonedInQueueTime() {
				return this.maxAbandonedInQueueTime;
			}

			public void setMaxAbandonedInQueueTime(Long maxAbandonedInQueueTime) {
				this.maxAbandonedInQueueTime = maxAbandonedInQueueTime;
			}

			public Long getMaxAbandonedInRingTime() {
				return this.maxAbandonedInRingTime;
			}

			public void setMaxAbandonedInRingTime(Long maxAbandonedInRingTime) {
				this.maxAbandonedInRingTime = maxAbandonedInRingTime;
			}

			public Long getMaxHoldTime() {
				return this.maxHoldTime;
			}

			public void setMaxHoldTime(Long maxHoldTime) {
				this.maxHoldTime = maxHoldTime;
			}

			public Long getMaxRingTime() {
				return this.maxRingTime;
			}

			public void setMaxRingTime(Long maxRingTime) {
				this.maxRingTime = maxRingTime;
			}

			public Long getMaxTalkTime() {
				return this.maxTalkTime;
			}

			public void setMaxTalkTime(Long maxTalkTime) {
				this.maxTalkTime = maxTalkTime;
			}

			public Long getMaxWaitTime() {
				return this.maxWaitTime;
			}

			public void setMaxWaitTime(Long maxWaitTime) {
				this.maxWaitTime = maxWaitTime;
			}

			public Long getMaxWorkTime() {
				return this.maxWorkTime;
			}

			public void setMaxWorkTime(Long maxWorkTime) {
				this.maxWorkTime = maxWorkTime;
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

			public Float getServiceLevel20() {
				return this.serviceLevel20;
			}

			public void setServiceLevel20(Float serviceLevel20) {
				this.serviceLevel20 = serviceLevel20;
			}

			public Long getTotalAbandonTime() {
				return this.totalAbandonTime;
			}

			public void setTotalAbandonTime(Long totalAbandonTime) {
				this.totalAbandonTime = totalAbandonTime;
			}

			public Long getTotalAbandonedInIVRTime() {
				return this.totalAbandonedInIVRTime;
			}

			public void setTotalAbandonedInIVRTime(Long totalAbandonedInIVRTime) {
				this.totalAbandonedInIVRTime = totalAbandonedInIVRTime;
			}

			public Long getTotalAbandonedInQueueTime() {
				return this.totalAbandonedInQueueTime;
			}

			public void setTotalAbandonedInQueueTime(Long totalAbandonedInQueueTime) {
				this.totalAbandonedInQueueTime = totalAbandonedInQueueTime;
			}

			public Long getTotalAbandonedInRingTime() {
				return this.totalAbandonedInRingTime;
			}

			public void setTotalAbandonedInRingTime(Long totalAbandonedInRingTime) {
				this.totalAbandonedInRingTime = totalAbandonedInRingTime;
			}

			public Long getTotalHoldTime() {
				return this.totalHoldTime;
			}

			public void setTotalHoldTime(Long totalHoldTime) {
				this.totalHoldTime = totalHoldTime;
			}

			public Long getTotalRingTime() {
				return this.totalRingTime;
			}

			public void setTotalRingTime(Long totalRingTime) {
				this.totalRingTime = totalRingTime;
			}

			public Long getTotalTalkTime() {
				return this.totalTalkTime;
			}

			public void setTotalTalkTime(Long totalTalkTime) {
				this.totalTalkTime = totalTalkTime;
			}

			public Long getTotalWaitTime() {
				return this.totalWaitTime;
			}

			public void setTotalWaitTime(Long totalWaitTime) {
				this.totalWaitTime = totalWaitTime;
			}

			public Long getTotalWorkTime() {
				return this.totalWorkTime;
			}

			public void setTotalWorkTime(Long totalWorkTime) {
				this.totalWorkTime = totalWorkTime;
			}
		}

		public static class Outbound {

			private Float answerRate;

			private Float averageDialingTime;

			private Float averageHoldTime;

			private Float averageTalkTime;

			private Float averageWorkTime;

			private Long callsAnswered;

			private Long callsDialed;

			private Long callsDialedSuccess;

			private Integer callsHold;

			private Long maxDialingTime;

			private Long maxHoldTime;

			private Long maxTalkTime;

			private Long maxWorkTime;

			private Float satisfactionIndex;

			private Long satisfactionSurveysOffered;

			private Long satisfactionSurveysResponded;

			private Long totalDialingTime;

			private Long totalHoldTime;

			private Long totalTalkTime;

			private Long totalWorkTime;

			public Float getAnswerRate() {
				return this.answerRate;
			}

			public void setAnswerRate(Float answerRate) {
				this.answerRate = answerRate;
			}

			public Float getAverageDialingTime() {
				return this.averageDialingTime;
			}

			public void setAverageDialingTime(Float averageDialingTime) {
				this.averageDialingTime = averageDialingTime;
			}

			public Float getAverageHoldTime() {
				return this.averageHoldTime;
			}

			public void setAverageHoldTime(Float averageHoldTime) {
				this.averageHoldTime = averageHoldTime;
			}

			public Float getAverageTalkTime() {
				return this.averageTalkTime;
			}

			public void setAverageTalkTime(Float averageTalkTime) {
				this.averageTalkTime = averageTalkTime;
			}

			public Float getAverageWorkTime() {
				return this.averageWorkTime;
			}

			public void setAverageWorkTime(Float averageWorkTime) {
				this.averageWorkTime = averageWorkTime;
			}

			public Long getCallsAnswered() {
				return this.callsAnswered;
			}

			public void setCallsAnswered(Long callsAnswered) {
				this.callsAnswered = callsAnswered;
			}

			public Long getCallsDialed() {
				return this.callsDialed;
			}

			public void setCallsDialed(Long callsDialed) {
				this.callsDialed = callsDialed;
			}

			public Long getCallsDialedSuccess() {
				return this.callsDialedSuccess;
			}

			public void setCallsDialedSuccess(Long callsDialedSuccess) {
				this.callsDialedSuccess = callsDialedSuccess;
			}

			public Integer getCallsHold() {
				return this.callsHold;
			}

			public void setCallsHold(Integer callsHold) {
				this.callsHold = callsHold;
			}

			public Long getMaxDialingTime() {
				return this.maxDialingTime;
			}

			public void setMaxDialingTime(Long maxDialingTime) {
				this.maxDialingTime = maxDialingTime;
			}

			public Long getMaxHoldTime() {
				return this.maxHoldTime;
			}

			public void setMaxHoldTime(Long maxHoldTime) {
				this.maxHoldTime = maxHoldTime;
			}

			public Long getMaxTalkTime() {
				return this.maxTalkTime;
			}

			public void setMaxTalkTime(Long maxTalkTime) {
				this.maxTalkTime = maxTalkTime;
			}

			public Long getMaxWorkTime() {
				return this.maxWorkTime;
			}

			public void setMaxWorkTime(Long maxWorkTime) {
				this.maxWorkTime = maxWorkTime;
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

			public Long getTotalDialingTime() {
				return this.totalDialingTime;
			}

			public void setTotalDialingTime(Long totalDialingTime) {
				this.totalDialingTime = totalDialingTime;
			}

			public Long getTotalHoldTime() {
				return this.totalHoldTime;
			}

			public void setTotalHoldTime(Long totalHoldTime) {
				this.totalHoldTime = totalHoldTime;
			}

			public Long getTotalTalkTime() {
				return this.totalTalkTime;
			}

			public void setTotalTalkTime(Long totalTalkTime) {
				this.totalTalkTime = totalTalkTime;
			}

			public Long getTotalWorkTime() {
				return this.totalWorkTime;
			}

			public void setTotalWorkTime(Long totalWorkTime) {
				this.totalWorkTime = totalWorkTime;
			}
		}

		public static class Overall {

			private Float averageBreakTime;

			private Float averageHoldTime;

			private Float averageReadyTime;

			private Float averageTalkTime;

			private Float averageWorkTime;

			private Long maxBreakTime;

			private Long maxHoldTime;

			private Long maxReadyTime;

			private Long maxTalkTime;

			private Long maxWorkTime;

			private Float occupancyRate;

			private Float satisfactionIndex;

			private Long satisfactionSurveysOffered;

			private Long satisfactionSurveysResponded;

			private Long totalBreakTime;

			private Long totalCalls;

			private Long totalHoldTime;

			private Long totalLoggedInTime;

			private Long totalReadyTime;

			private Long totalTalkTime;

			private Long totalWorkTime;

			public Float getAverageBreakTime() {
				return this.averageBreakTime;
			}

			public void setAverageBreakTime(Float averageBreakTime) {
				this.averageBreakTime = averageBreakTime;
			}

			public Float getAverageHoldTime() {
				return this.averageHoldTime;
			}

			public void setAverageHoldTime(Float averageHoldTime) {
				this.averageHoldTime = averageHoldTime;
			}

			public Float getAverageReadyTime() {
				return this.averageReadyTime;
			}

			public void setAverageReadyTime(Float averageReadyTime) {
				this.averageReadyTime = averageReadyTime;
			}

			public Float getAverageTalkTime() {
				return this.averageTalkTime;
			}

			public void setAverageTalkTime(Float averageTalkTime) {
				this.averageTalkTime = averageTalkTime;
			}

			public Float getAverageWorkTime() {
				return this.averageWorkTime;
			}

			public void setAverageWorkTime(Float averageWorkTime) {
				this.averageWorkTime = averageWorkTime;
			}

			public Long getMaxBreakTime() {
				return this.maxBreakTime;
			}

			public void setMaxBreakTime(Long maxBreakTime) {
				this.maxBreakTime = maxBreakTime;
			}

			public Long getMaxHoldTime() {
				return this.maxHoldTime;
			}

			public void setMaxHoldTime(Long maxHoldTime) {
				this.maxHoldTime = maxHoldTime;
			}

			public Long getMaxReadyTime() {
				return this.maxReadyTime;
			}

			public void setMaxReadyTime(Long maxReadyTime) {
				this.maxReadyTime = maxReadyTime;
			}

			public Long getMaxTalkTime() {
				return this.maxTalkTime;
			}

			public void setMaxTalkTime(Long maxTalkTime) {
				this.maxTalkTime = maxTalkTime;
			}

			public Long getMaxWorkTime() {
				return this.maxWorkTime;
			}

			public void setMaxWorkTime(Long maxWorkTime) {
				this.maxWorkTime = maxWorkTime;
			}

			public Float getOccupancyRate() {
				return this.occupancyRate;
			}

			public void setOccupancyRate(Float occupancyRate) {
				this.occupancyRate = occupancyRate;
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

			public Long getTotalBreakTime() {
				return this.totalBreakTime;
			}

			public void setTotalBreakTime(Long totalBreakTime) {
				this.totalBreakTime = totalBreakTime;
			}

			public Long getTotalCalls() {
				return this.totalCalls;
			}

			public void setTotalCalls(Long totalCalls) {
				this.totalCalls = totalCalls;
			}

			public Long getTotalHoldTime() {
				return this.totalHoldTime;
			}

			public void setTotalHoldTime(Long totalHoldTime) {
				this.totalHoldTime = totalHoldTime;
			}

			public Long getTotalLoggedInTime() {
				return this.totalLoggedInTime;
			}

			public void setTotalLoggedInTime(Long totalLoggedInTime) {
				this.totalLoggedInTime = totalLoggedInTime;
			}

			public Long getTotalReadyTime() {
				return this.totalReadyTime;
			}

			public void setTotalReadyTime(Long totalReadyTime) {
				this.totalReadyTime = totalReadyTime;
			}

			public Long getTotalTalkTime() {
				return this.totalTalkTime;
			}

			public void setTotalTalkTime(Long totalTalkTime) {
				this.totalTalkTime = totalTalkTime;
			}

			public Long getTotalWorkTime() {
				return this.totalWorkTime;
			}

			public void setTotalWorkTime(Long totalWorkTime) {
				this.totalWorkTime = totalWorkTime;
			}
		}
	}

	@Override
	public GetHistoricalInstanceReportResponse getInstance(UnmarshallerContext context) {
		return	GetHistoricalInstanceReportResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
