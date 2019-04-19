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
import com.aliyuncs.ccc.transform.v20170705.ListCallMeasureSummaryReportsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListCallMeasureSummaryReportsResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private List<CallMeasureSummaryReport> callMeasureSummaryReportList;

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

	public List<CallMeasureSummaryReport> getCallMeasureSummaryReportList() {
		return this.callMeasureSummaryReportList;
	}

	public void setCallMeasureSummaryReportList(List<CallMeasureSummaryReport> callMeasureSummaryReportList) {
		this.callMeasureSummaryReportList = callMeasureSummaryReportList;
	}

	public static class CallMeasureSummaryReport {

		private String year;

		private String month;

		private String day;

		private Long inboundCount;

		private Long outboundCount;

		private Long outboundDurationByMinute;

		private Long inboundDurationByMinute;

		public String getYear() {
			return this.year;
		}

		public void setYear(String year) {
			this.year = year;
		}

		public String getMonth() {
			return this.month;
		}

		public void setMonth(String month) {
			this.month = month;
		}

		public String getDay() {
			return this.day;
		}

		public void setDay(String day) {
			this.day = day;
		}

		public Long getInboundCount() {
			return this.inboundCount;
		}

		public void setInboundCount(Long inboundCount) {
			this.inboundCount = inboundCount;
		}

		public Long getOutboundCount() {
			return this.outboundCount;
		}

		public void setOutboundCount(Long outboundCount) {
			this.outboundCount = outboundCount;
		}

		public Long getOutboundDurationByMinute() {
			return this.outboundDurationByMinute;
		}

		public void setOutboundDurationByMinute(Long outboundDurationByMinute) {
			this.outboundDurationByMinute = outboundDurationByMinute;
		}

		public Long getInboundDurationByMinute() {
			return this.inboundDurationByMinute;
		}

		public void setInboundDurationByMinute(Long inboundDurationByMinute) {
			this.inboundDurationByMinute = inboundDurationByMinute;
		}
	}

	@Override
	public ListCallMeasureSummaryReportsResponse getInstance(UnmarshallerContext context) {
		return	ListCallMeasureSummaryReportsResponseUnmarshaller.unmarshall(this, context);
	}
}
