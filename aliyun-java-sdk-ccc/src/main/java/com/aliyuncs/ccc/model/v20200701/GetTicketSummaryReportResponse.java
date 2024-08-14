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
import com.aliyuncs.ccc.transform.v20200701.GetTicketSummaryReportResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetTicketSummaryReportResponse extends AcsResponse {

	private String requestId;

	private String message;

	private Long httpStatusCode;

	private String code;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Long getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Long httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String ticketsCreated;

		private String ticketsParticipated;

		private String ticketsAssigned;

		public String getTicketsCreated() {
			return this.ticketsCreated;
		}

		public void setTicketsCreated(String ticketsCreated) {
			this.ticketsCreated = ticketsCreated;
		}

		public String getTicketsParticipated() {
			return this.ticketsParticipated;
		}

		public void setTicketsParticipated(String ticketsParticipated) {
			this.ticketsParticipated = ticketsParticipated;
		}

		public String getTicketsAssigned() {
			return this.ticketsAssigned;
		}

		public void setTicketsAssigned(String ticketsAssigned) {
			this.ticketsAssigned = ticketsAssigned;
		}
	}

	@Override
	public GetTicketSummaryReportResponse getInstance(UnmarshallerContext context) {
		return	GetTicketSummaryReportResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
