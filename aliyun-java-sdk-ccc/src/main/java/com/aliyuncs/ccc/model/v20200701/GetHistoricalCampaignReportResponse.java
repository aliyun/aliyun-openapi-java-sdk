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
import com.aliyuncs.ccc.transform.v20200701.GetHistoricalCampaignReportResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetHistoricalCampaignReportResponse extends AcsResponse {

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

		private Long callsConnected;

		private Long callsDialed;

		private Long callsAbandoned;

		private Float connectedRate;

		private Float abandonedRate;

		private Float occupancyRate;

		public Long getCallsConnected() {
			return this.callsConnected;
		}

		public void setCallsConnected(Long callsConnected) {
			this.callsConnected = callsConnected;
		}

		public Long getCallsDialed() {
			return this.callsDialed;
		}

		public void setCallsDialed(Long callsDialed) {
			this.callsDialed = callsDialed;
		}

		public Long getCallsAbandoned() {
			return this.callsAbandoned;
		}

		public void setCallsAbandoned(Long callsAbandoned) {
			this.callsAbandoned = callsAbandoned;
		}

		public Float getConnectedRate() {
			return this.connectedRate;
		}

		public void setConnectedRate(Float connectedRate) {
			this.connectedRate = connectedRate;
		}

		public Float getAbandonedRate() {
			return this.abandonedRate;
		}

		public void setAbandonedRate(Float abandonedRate) {
			this.abandonedRate = abandonedRate;
		}

		public Float getOccupancyRate() {
			return this.occupancyRate;
		}

		public void setOccupancyRate(Float occupancyRate) {
			this.occupancyRate = occupancyRate;
		}
	}

	@Override
	public GetHistoricalCampaignReportResponse getInstance(UnmarshallerContext context) {
		return	GetHistoricalCampaignReportResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
