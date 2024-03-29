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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.outboundbot.transform.v20191226.ModifyOutboundCallNumberResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ModifyOutboundCallNumberResponse extends AcsResponse {

	private Integer httpStatusCode;

	private String code;

	private String message;

	private String requestId;

	private Boolean success;

	private OutboundCallNumber outboundCallNumber;

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

	public OutboundCallNumber getOutboundCallNumber() {
		return this.outboundCallNumber;
	}

	public void setOutboundCallNumber(OutboundCallNumber outboundCallNumber) {
		this.outboundCallNumber = outboundCallNumber;
	}

	public static class OutboundCallNumber {

		private String number;

		private String outboundCallNumberId;

		private String rateLimitCount;

		private String rateLimitPeriod;

		public String getNumber() {
			return this.number;
		}

		public void setNumber(String number) {
			this.number = number;
		}

		public String getOutboundCallNumberId() {
			return this.outboundCallNumberId;
		}

		public void setOutboundCallNumberId(String outboundCallNumberId) {
			this.outboundCallNumberId = outboundCallNumberId;
		}

		public String getRateLimitCount() {
			return this.rateLimitCount;
		}

		public void setRateLimitCount(String rateLimitCount) {
			this.rateLimitCount = rateLimitCount;
		}

		public String getRateLimitPeriod() {
			return this.rateLimitPeriod;
		}

		public void setRateLimitPeriod(String rateLimitPeriod) {
			this.rateLimitPeriod = rateLimitPeriod;
		}
	}

	@Override
	public ModifyOutboundCallNumberResponse getInstance(UnmarshallerContext context) {
		return	ModifyOutboundCallNumberResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
