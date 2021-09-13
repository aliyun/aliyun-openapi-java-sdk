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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ccc.transform.v20200701.ListIntervalInstanceReportResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListIntervalInstanceReportResponse extends AcsResponse {

	private String code;

	private Integer httpStatusCode;

	private String message;

	private String requestId;

	private List<DataItem> data;

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

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private Long statsTime;

		private Inbound inbound;

		private Outbound outbound;

		private Overall overall;

		public Long getStatsTime() {
			return this.statsTime;
		}

		public void setStatsTime(Long statsTime) {
			this.statsTime = statsTime;
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

			private Float averageRingTime;

			private Long callsVoicemail;

			private Long maxAbandonedInIVRTime;

			private Long callsHandled;

			private Long callsIVRException;

			private Long callsAbandonedInIVR;

			private Long maxWorkTime;

			private Long totalHoldTime;

			private Long maxAbandonTime;

			private Float averageAbandonTime;

			private Float abandonedRate;

			private Long callsRinged;

			private Long callsQueuingFailed;

			private Long totalRingTime;

			private Long totalTalkTime;

			private Long maxAbandonedInRingTime;

			private Long callsBlindTransferred;

			private Float averageAbandonedInIVRTime;

			private Float averageAbandonedInQueueTime;

			private Long maxWaitTime;

			private Float averageTalkTime;

			private Long callsAttendedTransferred;

			private Long totalAbandonedInIVRTime;

			private Long callsQueuingOverflow;

			private Long callsAbandonedInRing;

			private Long totalAbandonedInRingTime;

			private Long totalWorkTime;

			private Float averageWaitTime;

			private Float averageWorkTime;

			private Long callsQueued;

			private Float averageAbandonedInRingTime;

			private Float satisfactionIndex;

			private Long callsAbandoned;

			private Long maxAbandonedInQueueTime;

			private Long callsAbandonedInVoiceNavigator;

			private Long totalWaitTime;

			private Long maxTalkTime;

			private Long maxRingTime;

			private Long totalAbandonTime;

			private Long callsOffered;

			private Long callsQueuingTimeout;

			private Float serviceLevel20;

			private Long maxHoldTime;

			private Long callsForwardToOutsideNumber;

			private Float satisfactionRate;

			private Long callsHold;

			private Long satisfactionSurveysOffered;

			private Float handleRate;

			private Long satisfactionSurveysResponded;

			private Float averageHoldTime;

			private Long callsAbandonedInQueue;

			private Long totalAbandonedInQueueTime;

			public Float getAverageRingTime() {
				return this.averageRingTime;
			}

			public void setAverageRingTime(Float averageRingTime) {
				this.averageRingTime = averageRingTime;
			}

			public Long getCallsVoicemail() {
				return this.callsVoicemail;
			}

			public void setCallsVoicemail(Long callsVoicemail) {
				this.callsVoicemail = callsVoicemail;
			}

			public Long getMaxAbandonedInIVRTime() {
				return this.maxAbandonedInIVRTime;
			}

			public void setMaxAbandonedInIVRTime(Long maxAbandonedInIVRTime) {
				this.maxAbandonedInIVRTime = maxAbandonedInIVRTime;
			}

			public Long getCallsHandled() {
				return this.callsHandled;
			}

			public void setCallsHandled(Long callsHandled) {
				this.callsHandled = callsHandled;
			}

			public Long getCallsIVRException() {
				return this.callsIVRException;
			}

			public void setCallsIVRException(Long callsIVRException) {
				this.callsIVRException = callsIVRException;
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

			public Long getTotalHoldTime() {
				return this.totalHoldTime;
			}

			public void setTotalHoldTime(Long totalHoldTime) {
				this.totalHoldTime = totalHoldTime;
			}

			public Long getMaxAbandonTime() {
				return this.maxAbandonTime;
			}

			public void setMaxAbandonTime(Long maxAbandonTime) {
				this.maxAbandonTime = maxAbandonTime;
			}

			public Float getAverageAbandonTime() {
				return this.averageAbandonTime;
			}

			public void setAverageAbandonTime(Float averageAbandonTime) {
				this.averageAbandonTime = averageAbandonTime;
			}

			public Float getAbandonedRate() {
				return this.abandonedRate;
			}

			public void setAbandonedRate(Float abandonedRate) {
				this.abandonedRate = abandonedRate;
			}

			public Long getCallsRinged() {
				return this.callsRinged;
			}

			public void setCallsRinged(Long callsRinged) {
				this.callsRinged = callsRinged;
			}

			public Long getCallsQueuingFailed() {
				return this.callsQueuingFailed;
			}

			public void setCallsQueuingFailed(Long callsQueuingFailed) {
				this.callsQueuingFailed = callsQueuingFailed;
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

			public Long getMaxAbandonedInRingTime() {
				return this.maxAbandonedInRingTime;
			}

			public void setMaxAbandonedInRingTime(Long maxAbandonedInRingTime) {
				this.maxAbandonedInRingTime = maxAbandonedInRingTime;
			}

			public Long getCallsBlindTransferred() {
				return this.callsBlindTransferred;
			}

			public void setCallsBlindTransferred(Long callsBlindTransferred) {
				this.callsBlindTransferred = callsBlindTransferred;
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

			public Long getMaxWaitTime() {
				return this.maxWaitTime;
			}

			public void setMaxWaitTime(Long maxWaitTime) {
				this.maxWaitTime = maxWaitTime;
			}

			public Float getAverageTalkTime() {
				return this.averageTalkTime;
			}

			public void setAverageTalkTime(Float averageTalkTime) {
				this.averageTalkTime = averageTalkTime;
			}

			public Long getCallsAttendedTransferred() {
				return this.callsAttendedTransferred;
			}

			public void setCallsAttendedTransferred(Long callsAttendedTransferred) {
				this.callsAttendedTransferred = callsAttendedTransferred;
			}

			public Long getTotalAbandonedInIVRTime() {
				return this.totalAbandonedInIVRTime;
			}

			public void setTotalAbandonedInIVRTime(Long totalAbandonedInIVRTime) {
				this.totalAbandonedInIVRTime = totalAbandonedInIVRTime;
			}

			public Long getCallsQueuingOverflow() {
				return this.callsQueuingOverflow;
			}

			public void setCallsQueuingOverflow(Long callsQueuingOverflow) {
				this.callsQueuingOverflow = callsQueuingOverflow;
			}

			public Long getCallsAbandonedInRing() {
				return this.callsAbandonedInRing;
			}

			public void setCallsAbandonedInRing(Long callsAbandonedInRing) {
				this.callsAbandonedInRing = callsAbandonedInRing;
			}

			public Long getTotalAbandonedInRingTime() {
				return this.totalAbandonedInRingTime;
			}

			public void setTotalAbandonedInRingTime(Long totalAbandonedInRingTime) {
				this.totalAbandonedInRingTime = totalAbandonedInRingTime;
			}

			public Long getTotalWorkTime() {
				return this.totalWorkTime;
			}

			public void setTotalWorkTime(Long totalWorkTime) {
				this.totalWorkTime = totalWorkTime;
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

			public Long getCallsQueued() {
				return this.callsQueued;
			}

			public void setCallsQueued(Long callsQueued) {
				this.callsQueued = callsQueued;
			}

			public Float getAverageAbandonedInRingTime() {
				return this.averageAbandonedInRingTime;
			}

			public void setAverageAbandonedInRingTime(Float averageAbandonedInRingTime) {
				this.averageAbandonedInRingTime = averageAbandonedInRingTime;
			}

			public Float getSatisfactionIndex() {
				return this.satisfactionIndex;
			}

			public void setSatisfactionIndex(Float satisfactionIndex) {
				this.satisfactionIndex = satisfactionIndex;
			}

			public Long getCallsAbandoned() {
				return this.callsAbandoned;
			}

			public void setCallsAbandoned(Long callsAbandoned) {
				this.callsAbandoned = callsAbandoned;
			}

			public Long getMaxAbandonedInQueueTime() {
				return this.maxAbandonedInQueueTime;
			}

			public void setMaxAbandonedInQueueTime(Long maxAbandonedInQueueTime) {
				this.maxAbandonedInQueueTime = maxAbandonedInQueueTime;
			}

			public Long getCallsAbandonedInVoiceNavigator() {
				return this.callsAbandonedInVoiceNavigator;
			}

			public void setCallsAbandonedInVoiceNavigator(Long callsAbandonedInVoiceNavigator) {
				this.callsAbandonedInVoiceNavigator = callsAbandonedInVoiceNavigator;
			}

			public Long getTotalWaitTime() {
				return this.totalWaitTime;
			}

			public void setTotalWaitTime(Long totalWaitTime) {
				this.totalWaitTime = totalWaitTime;
			}

			public Long getMaxTalkTime() {
				return this.maxTalkTime;
			}

			public void setMaxTalkTime(Long maxTalkTime) {
				this.maxTalkTime = maxTalkTime;
			}

			public Long getMaxRingTime() {
				return this.maxRingTime;
			}

			public void setMaxRingTime(Long maxRingTime) {
				this.maxRingTime = maxRingTime;
			}

			public Long getTotalAbandonTime() {
				return this.totalAbandonTime;
			}

			public void setTotalAbandonTime(Long totalAbandonTime) {
				this.totalAbandonTime = totalAbandonTime;
			}

			public Long getCallsOffered() {
				return this.callsOffered;
			}

			public void setCallsOffered(Long callsOffered) {
				this.callsOffered = callsOffered;
			}

			public Long getCallsQueuingTimeout() {
				return this.callsQueuingTimeout;
			}

			public void setCallsQueuingTimeout(Long callsQueuingTimeout) {
				this.callsQueuingTimeout = callsQueuingTimeout;
			}

			public Float getServiceLevel20() {
				return this.serviceLevel20;
			}

			public void setServiceLevel20(Float serviceLevel20) {
				this.serviceLevel20 = serviceLevel20;
			}

			public Long getMaxHoldTime() {
				return this.maxHoldTime;
			}

			public void setMaxHoldTime(Long maxHoldTime) {
				this.maxHoldTime = maxHoldTime;
			}

			public Long getCallsForwardToOutsideNumber() {
				return this.callsForwardToOutsideNumber;
			}

			public void setCallsForwardToOutsideNumber(Long callsForwardToOutsideNumber) {
				this.callsForwardToOutsideNumber = callsForwardToOutsideNumber;
			}

			public Float getSatisfactionRate() {
				return this.satisfactionRate;
			}

			public void setSatisfactionRate(Float satisfactionRate) {
				this.satisfactionRate = satisfactionRate;
			}

			public Long getCallsHold() {
				return this.callsHold;
			}

			public void setCallsHold(Long callsHold) {
				this.callsHold = callsHold;
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

			public Float getAverageHoldTime() {
				return this.averageHoldTime;
			}

			public void setAverageHoldTime(Float averageHoldTime) {
				this.averageHoldTime = averageHoldTime;
			}

			public Long getCallsAbandonedInQueue() {
				return this.callsAbandonedInQueue;
			}

			public void setCallsAbandonedInQueue(Long callsAbandonedInQueue) {
				this.callsAbandonedInQueue = callsAbandonedInQueue;
			}

			public Long getTotalAbandonedInQueueTime() {
				return this.totalAbandonedInQueueTime;
			}

			public void setTotalAbandonedInQueueTime(Long totalAbandonedInQueueTime) {
				this.totalAbandonedInQueueTime = totalAbandonedInQueueTime;
			}
		}

		public static class Outbound {

			private Float averageRingTime;

			private Long callsDialed;

			private Long callsAnswered;

			private Long totalWorkTime;

			private Long maxWorkTime;

			private Long totalDialingTime;

			private Long totalHoldTime;

			private Float averageWorkTime;

			private Float satisfactionIndex;

			private Long callsRinged;

			private Long totalRingTime;

			private Long maxTalkTime;

			private Long maxRingTime;

			private Long totalTalkTime;

			private Long maxDialingTime;

			private Long callsBlindTransferred;

			private Float answerRate;

			private Long maxHoldTime;

			private Float averageTalkTime;

			private Float satisfactionRate;

			private Long callsAttendedTransferred;

			private Long callsHold;

			private Long satisfactionSurveysOffered;

			private Long satisfactionSurveysResponded;

			private Float averageHoldTime;

			private Float averageDialingTime;

			public Float getAverageRingTime() {
				return this.averageRingTime;
			}

			public void setAverageRingTime(Float averageRingTime) {
				this.averageRingTime = averageRingTime;
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

			public Long getTotalHoldTime() {
				return this.totalHoldTime;
			}

			public void setTotalHoldTime(Long totalHoldTime) {
				this.totalHoldTime = totalHoldTime;
			}

			public Float getAverageWorkTime() {
				return this.averageWorkTime;
			}

			public void setAverageWorkTime(Float averageWorkTime) {
				this.averageWorkTime = averageWorkTime;
			}

			public Float getSatisfactionIndex() {
				return this.satisfactionIndex;
			}

			public void setSatisfactionIndex(Float satisfactionIndex) {
				this.satisfactionIndex = satisfactionIndex;
			}

			public Long getCallsRinged() {
				return this.callsRinged;
			}

			public void setCallsRinged(Long callsRinged) {
				this.callsRinged = callsRinged;
			}

			public Long getTotalRingTime() {
				return this.totalRingTime;
			}

			public void setTotalRingTime(Long totalRingTime) {
				this.totalRingTime = totalRingTime;
			}

			public Long getMaxTalkTime() {
				return this.maxTalkTime;
			}

			public void setMaxTalkTime(Long maxTalkTime) {
				this.maxTalkTime = maxTalkTime;
			}

			public Long getMaxRingTime() {
				return this.maxRingTime;
			}

			public void setMaxRingTime(Long maxRingTime) {
				this.maxRingTime = maxRingTime;
			}

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

			public Long getCallsBlindTransferred() {
				return this.callsBlindTransferred;
			}

			public void setCallsBlindTransferred(Long callsBlindTransferred) {
				this.callsBlindTransferred = callsBlindTransferred;
			}

			public Float getAnswerRate() {
				return this.answerRate;
			}

			public void setAnswerRate(Float answerRate) {
				this.answerRate = answerRate;
			}

			public Long getMaxHoldTime() {
				return this.maxHoldTime;
			}

			public void setMaxHoldTime(Long maxHoldTime) {
				this.maxHoldTime = maxHoldTime;
			}

			public Float getAverageTalkTime() {
				return this.averageTalkTime;
			}

			public void setAverageTalkTime(Float averageTalkTime) {
				this.averageTalkTime = averageTalkTime;
			}

			public Float getSatisfactionRate() {
				return this.satisfactionRate;
			}

			public void setSatisfactionRate(Float satisfactionRate) {
				this.satisfactionRate = satisfactionRate;
			}

			public Long getCallsAttendedTransferred() {
				return this.callsAttendedTransferred;
			}

			public void setCallsAttendedTransferred(Long callsAttendedTransferred) {
				this.callsAttendedTransferred = callsAttendedTransferred;
			}

			public Long getCallsHold() {
				return this.callsHold;
			}

			public void setCallsHold(Long callsHold) {
				this.callsHold = callsHold;
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

			public Float getAverageHoldTime() {
				return this.averageHoldTime;
			}

			public void setAverageHoldTime(Float averageHoldTime) {
				this.averageHoldTime = averageHoldTime;
			}

			public Float getAverageDialingTime() {
				return this.averageDialingTime;
			}

			public void setAverageDialingTime(Float averageDialingTime) {
				this.averageDialingTime = averageDialingTime;
			}
		}

		public static class Overall {

			private Long totalTalkTime;

			private Long totalLoggedInTime;

			private Float occupancyRate;

			private Long totalWorkTime;

			private Long maxHoldTime;

			private Long maxWorkTime;

			private Float averageBreakTime;

			private Long totalHoldTime;

			private Float satisfactionRate;

			private Long maxBreakTime;

			private Float averageWorkTime;

			private Float averageTalkTime;

			private Float satisfactionIndex;

			private Long satisfactionSurveysOffered;

			private Long satisfactionSurveysResponded;

			private Long maxReadyTime;

			private Float averageReadyTime;

			private Float averageHoldTime;

			private Long totalReadyTime;

			private Long totalBreakTime;

			private Long maxTalkTime;

			private Long totalCalls;

			public Long getTotalTalkTime() {
				return this.totalTalkTime;
			}

			public void setTotalTalkTime(Long totalTalkTime) {
				this.totalTalkTime = totalTalkTime;
			}

			public Long getTotalLoggedInTime() {
				return this.totalLoggedInTime;
			}

			public void setTotalLoggedInTime(Long totalLoggedInTime) {
				this.totalLoggedInTime = totalLoggedInTime;
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

			public Long getMaxHoldTime() {
				return this.maxHoldTime;
			}

			public void setMaxHoldTime(Long maxHoldTime) {
				this.maxHoldTime = maxHoldTime;
			}

			public Long getMaxWorkTime() {
				return this.maxWorkTime;
			}

			public void setMaxWorkTime(Long maxWorkTime) {
				this.maxWorkTime = maxWorkTime;
			}

			public Float getAverageBreakTime() {
				return this.averageBreakTime;
			}

			public void setAverageBreakTime(Float averageBreakTime) {
				this.averageBreakTime = averageBreakTime;
			}

			public Long getTotalHoldTime() {
				return this.totalHoldTime;
			}

			public void setTotalHoldTime(Long totalHoldTime) {
				this.totalHoldTime = totalHoldTime;
			}

			public Float getSatisfactionRate() {
				return this.satisfactionRate;
			}

			public void setSatisfactionRate(Float satisfactionRate) {
				this.satisfactionRate = satisfactionRate;
			}

			public Long getMaxBreakTime() {
				return this.maxBreakTime;
			}

			public void setMaxBreakTime(Long maxBreakTime) {
				this.maxBreakTime = maxBreakTime;
			}

			public Float getAverageWorkTime() {
				return this.averageWorkTime;
			}

			public void setAverageWorkTime(Float averageWorkTime) {
				this.averageWorkTime = averageWorkTime;
			}

			public Float getAverageTalkTime() {
				return this.averageTalkTime;
			}

			public void setAverageTalkTime(Float averageTalkTime) {
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

			public Float getAverageReadyTime() {
				return this.averageReadyTime;
			}

			public void setAverageReadyTime(Float averageReadyTime) {
				this.averageReadyTime = averageReadyTime;
			}

			public Float getAverageHoldTime() {
				return this.averageHoldTime;
			}

			public void setAverageHoldTime(Float averageHoldTime) {
				this.averageHoldTime = averageHoldTime;
			}

			public Long getTotalReadyTime() {
				return this.totalReadyTime;
			}

			public void setTotalReadyTime(Long totalReadyTime) {
				this.totalReadyTime = totalReadyTime;
			}

			public Long getTotalBreakTime() {
				return this.totalBreakTime;
			}

			public void setTotalBreakTime(Long totalBreakTime) {
				this.totalBreakTime = totalBreakTime;
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
	}

	@Override
	public ListIntervalInstanceReportResponse getInstance(UnmarshallerContext context) {
		return	ListIntervalInstanceReportResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
