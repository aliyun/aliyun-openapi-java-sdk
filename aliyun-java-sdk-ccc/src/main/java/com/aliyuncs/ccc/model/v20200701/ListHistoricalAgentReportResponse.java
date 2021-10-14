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
import com.aliyuncs.ccc.transform.v20200701.ListHistoricalAgentReportResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListHistoricalAgentReportResponse extends AcsResponse {

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

		private Integer pageNumber;

		private Integer pageSize;

		private Integer totalCount;

		private List<Items> list;

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

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public List<Items> getList() {
			return this.list;
		}

		public void setList(List<Items> list) {
			this.list = list;
		}

		public static class Items {

			private String agentName;

			private String agentId;

			private String displayId;

			private Inbound inbound;

			private Outbound outbound;

			private Overall overall;

			public String getAgentName() {
				return this.agentName;
			}

			public void setAgentName(String agentName) {
				this.agentName = agentName;
			}

			public String getAgentId() {
				return this.agentId;
			}

			public void setAgentId(String agentId) {
				this.agentId = agentId;
			}

			public String getDisplayId() {
				return this.displayId;
			}

			public void setDisplayId(String displayId) {
				this.displayId = displayId;
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

				private Long callsHandled;

				private Long totalWorkTime;

				private Long callsAttendedTransferOut;

				private Long maxWorkTime;

				private Long totalHoldTime;

				private Float averageWorkTime;

				private Long callsBlindTransferIn;

				private Float satisfactionIndex;

				private Long callsRinged;

				private Long callsAttendedTransferIn;

				private Long callsBlindTransferOut;

				private Long totalRingTime;

				private Long maxTalkTime;

				private Long maxRingTime;

				private Long totalTalkTime;

				private Long callsOffered;

				private Long maxHoldTime;

				private Float averageTalkTime;

				private Float satisfactionRate;

				private Long callsHold;

				private Long satisfactionSurveysOffered;

				private Float handleRate;

				private Long satisfactionSurveysResponded;

				private Float averageHoldTime;

				public Float getAverageRingTime() {
					return this.averageRingTime;
				}

				public void setAverageRingTime(Float averageRingTime) {
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

				public Long getCallsAttendedTransferOut() {
					return this.callsAttendedTransferOut;
				}

				public void setCallsAttendedTransferOut(Long callsAttendedTransferOut) {
					this.callsAttendedTransferOut = callsAttendedTransferOut;
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

				public Float getAverageWorkTime() {
					return this.averageWorkTime;
				}

				public void setAverageWorkTime(Float averageWorkTime) {
					this.averageWorkTime = averageWorkTime;
				}

				public Long getCallsBlindTransferIn() {
					return this.callsBlindTransferIn;
				}

				public void setCallsBlindTransferIn(Long callsBlindTransferIn) {
					this.callsBlindTransferIn = callsBlindTransferIn;
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

				public Long getCallsAttendedTransferIn() {
					return this.callsAttendedTransferIn;
				}

				public void setCallsAttendedTransferIn(Long callsAttendedTransferIn) {
					this.callsAttendedTransferIn = callsAttendedTransferIn;
				}

				public Long getCallsBlindTransferOut() {
					return this.callsBlindTransferOut;
				}

				public void setCallsBlindTransferOut(Long callsBlindTransferOut) {
					this.callsBlindTransferOut = callsBlindTransferOut;
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

				public Long getCallsOffered() {
					return this.callsOffered;
				}

				public void setCallsOffered(Long callsOffered) {
					this.callsOffered = callsOffered;
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
			}

			public static class Outbound {

				private Float averageRingTime;

				private Long callsDialed;

				private Long callsAnswered;

				private Long totalWorkTime;

				private Long callsAttendedTransferOut;

				private Long maxWorkTime;

				private Long totalDialingTime;

				private Long totalHoldTime;

				private Float averageWorkTime;

				private Long callsBlindTransferIn;

				private Float satisfactionIndex;

				private Long callsRinged;

				private Long callsAttendedTransferIn;

				private Long callsBlindTransferOut;

				private Long totalRingTime;

				private Long maxTalkTime;

				private Long maxRingTime;

				private Long totalTalkTime;

				private Long maxDialingTime;

				private Float answerRate;

				private Long maxHoldTime;

				private Float averageTalkTime;

				private Float satisfactionRate;

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

				public Long getCallsAttendedTransferOut() {
					return this.callsAttendedTransferOut;
				}

				public void setCallsAttendedTransferOut(Long callsAttendedTransferOut) {
					this.callsAttendedTransferOut = callsAttendedTransferOut;
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

				public Long getCallsBlindTransferIn() {
					return this.callsBlindTransferIn;
				}

				public void setCallsBlindTransferIn(Long callsBlindTransferIn) {
					this.callsBlindTransferIn = callsBlindTransferIn;
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

				public Long getCallsAttendedTransferIn() {
					return this.callsAttendedTransferIn;
				}

				public void setCallsAttendedTransferIn(Long callsAttendedTransferIn) {
					this.callsAttendedTransferIn = callsAttendedTransferIn;
				}

				public Long getCallsBlindTransferOut() {
					return this.callsBlindTransferOut;
				}

				public void setCallsBlindTransferOut(Long callsBlindTransferOut) {
					this.callsBlindTransferOut = callsBlindTransferOut;
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
	}

	@Override
	public ListHistoricalAgentReportResponse getInstance(UnmarshallerContext context) {
		return	ListHistoricalAgentReportResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
