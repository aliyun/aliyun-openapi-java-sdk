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

package com.aliyuncs.cloudesl.model.v20200201;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudesl.transform.v20200201.DescribeEventReasonResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeEventReasonResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String message;

	private String errorCode;

	private String errorMessage;

	private String code;

	private String dynamicCode;

	private String dynamicMessage;

	private List<EventReason> eventReasons;

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

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDynamicCode() {
		return this.dynamicCode;
	}

	public void setDynamicCode(String dynamicCode) {
		this.dynamicCode = dynamicCode;
	}

	public String getDynamicMessage() {
		return this.dynamicMessage;
	}

	public void setDynamicMessage(String dynamicMessage) {
		this.dynamicMessage = dynamicMessage;
	}

	public List<EventReason> getEventReasons() {
		return this.eventReasons;
	}

	public void setEventReasons(List<EventReason> eventReasons) {
		this.eventReasons = eventReasons;
	}

	public static class EventReason {

		private String category;

		private List<String> reasons;

		private List<String> reasonI18ns;

		public String getCategory() {
			return this.category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public List<String> getReasons() {
			return this.reasons;
		}

		public void setReasons(List<String> reasons) {
			this.reasons = reasons;
		}

		public List<String> getReasonI18ns() {
			return this.reasonI18ns;
		}

		public void setReasonI18ns(List<String> reasonI18ns) {
			this.reasonI18ns = reasonI18ns;
		}
	}

	@Override
	public DescribeEventReasonResponse getInstance(UnmarshallerContext context) {
		return	DescribeEventReasonResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
