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

package com.aliyuncs.eventbridge.model.v20200401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.eventbridge.transform.v20200401.QueryEventTracesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryEventTracesResponse extends AcsResponse {

	private String message;

	private String requestId;

	private String code;

	private Boolean success;

	private List<DataItem> data;

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

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String action;

		private Long receivedTime;

		private String ruleMatchingTime;

		private Long actionTime;

		private String notifyStatus;

		private String ruleName;

		private String eventId;

		private String eventBusName;

		private String endpoint;

		private String notifyLatency;

		private Long notifyTime;

		private String eventSource;

		public String getAction() {
			return this.action;
		}

		public void setAction(String action) {
			this.action = action;
		}

		public Long getReceivedTime() {
			return this.receivedTime;
		}

		public void setReceivedTime(Long receivedTime) {
			this.receivedTime = receivedTime;
		}

		public String getRuleMatchingTime() {
			return this.ruleMatchingTime;
		}

		public void setRuleMatchingTime(String ruleMatchingTime) {
			this.ruleMatchingTime = ruleMatchingTime;
		}

		public Long getActionTime() {
			return this.actionTime;
		}

		public void setActionTime(Long actionTime) {
			this.actionTime = actionTime;
		}

		public String getNotifyStatus() {
			return this.notifyStatus;
		}

		public void setNotifyStatus(String notifyStatus) {
			this.notifyStatus = notifyStatus;
		}

		public String getRuleName() {
			return this.ruleName;
		}

		public void setRuleName(String ruleName) {
			this.ruleName = ruleName;
		}

		public String getEventId() {
			return this.eventId;
		}

		public void setEventId(String eventId) {
			this.eventId = eventId;
		}

		public String getEventBusName() {
			return this.eventBusName;
		}

		public void setEventBusName(String eventBusName) {
			this.eventBusName = eventBusName;
		}

		public String getEndpoint() {
			return this.endpoint;
		}

		public void setEndpoint(String endpoint) {
			this.endpoint = endpoint;
		}

		public String getNotifyLatency() {
			return this.notifyLatency;
		}

		public void setNotifyLatency(String notifyLatency) {
			this.notifyLatency = notifyLatency;
		}

		public Long getNotifyTime() {
			return this.notifyTime;
		}

		public void setNotifyTime(Long notifyTime) {
			this.notifyTime = notifyTime;
		}

		public String getEventSource() {
			return this.eventSource;
		}

		public void setEventSource(String eventSource) {
			this.eventSource = eventSource;
		}
	}

	@Override
	public QueryEventTracesResponse getInstance(UnmarshallerContext context) {
		return	QueryEventTracesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
