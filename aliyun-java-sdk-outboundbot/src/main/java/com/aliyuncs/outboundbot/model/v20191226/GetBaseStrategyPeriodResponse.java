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

package com.aliyuncs.outboundbot.model.v20191226;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.outboundbot.transform.v20191226.GetBaseStrategyPeriodResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetBaseStrategyPeriodResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private Boolean onlyWeekdays;

	private List<TimeFrame> workingTime;

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

	public Boolean getOnlyWeekdays() {
		return this.onlyWeekdays;
	}

	public void setOnlyWeekdays(Boolean onlyWeekdays) {
		this.onlyWeekdays = onlyWeekdays;
	}

	public List<TimeFrame> getWorkingTime() {
		return this.workingTime;
	}

	public void setWorkingTime(List<TimeFrame> workingTime) {
		this.workingTime = workingTime;
	}

	public static class TimeFrame {

		private Long beginTimeMillis;

		private String beginTime;

		private Long endTimeMillis;

		private String endTime;

		public Long getBeginTimeMillis() {
			return this.beginTimeMillis;
		}

		public void setBeginTimeMillis(Long beginTimeMillis) {
			this.beginTimeMillis = beginTimeMillis;
		}

		public String getBeginTime() {
			return this.beginTime;
		}

		public void setBeginTime(String beginTime) {
			this.beginTime = beginTime;
		}

		public Long getEndTimeMillis() {
			return this.endTimeMillis;
		}

		public void setEndTimeMillis(Long endTimeMillis) {
			this.endTimeMillis = endTimeMillis;
		}

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}
	}

	@Override
	public GetBaseStrategyPeriodResponse getInstance(UnmarshallerContext context) {
		return	GetBaseStrategyPeriodResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
