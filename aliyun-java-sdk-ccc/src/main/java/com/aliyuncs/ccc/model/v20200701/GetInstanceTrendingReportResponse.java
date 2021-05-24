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
import com.aliyuncs.ccc.transform.v20200701.GetInstanceTrendingReportResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetInstanceTrendingReportResponse extends AcsResponse {

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

		private List<InboundItem> inbound;

		private List<OutboundItem> outbound;

		public List<InboundItem> getInbound() {
			return this.inbound;
		}

		public void setInbound(List<InboundItem> inbound) {
			this.inbound = inbound;
		}

		public List<OutboundItem> getOutbound() {
			return this.outbound;
		}

		public void setOutbound(List<OutboundItem> outbound) {
			this.outbound = outbound;
		}

		public static class InboundItem {

			private Long callsAbandonedInIVR;

			private Long callsAbandonedInQueue;

			private Long callsAbandonedInRinging;

			private Long callsHandled;

			private Long callsQueued;

			private Long statsTime;

			private Long totalCalls;

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

			public Long getCallsHandled() {
				return this.callsHandled;
			}

			public void setCallsHandled(Long callsHandled) {
				this.callsHandled = callsHandled;
			}

			public Long getCallsQueued() {
				return this.callsQueued;
			}

			public void setCallsQueued(Long callsQueued) {
				this.callsQueued = callsQueued;
			}

			public Long getStatsTime() {
				return this.statsTime;
			}

			public void setStatsTime(Long statsTime) {
				this.statsTime = statsTime;
			}

			public Long getTotalCalls() {
				return this.totalCalls;
			}

			public void setTotalCalls(Long totalCalls) {
				this.totalCalls = totalCalls;
			}
		}

		public static class OutboundItem {

			private Long callsAnswered;

			private Long statsTime;

			private Long totalCalls;

			public Long getCallsAnswered() {
				return this.callsAnswered;
			}

			public void setCallsAnswered(Long callsAnswered) {
				this.callsAnswered = callsAnswered;
			}

			public Long getStatsTime() {
				return this.statsTime;
			}

			public void setStatsTime(Long statsTime) {
				this.statsTime = statsTime;
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
	public GetInstanceTrendingReportResponse getInstance(UnmarshallerContext context) {
		return	GetInstanceTrendingReportResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
