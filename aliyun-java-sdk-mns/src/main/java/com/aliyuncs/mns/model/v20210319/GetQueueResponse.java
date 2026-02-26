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

package com.aliyuncs.mns.model.v20210319;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.mns.transform.v20210319.GetQueueResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetQueueResponse extends AcsResponse {

	private String requestId;

	private Long code;

	private String status;

	private String message;

	private Boolean success;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getCode() {
		return this.code;
	}

	public void setCode(Long code) {
		this.code = code;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String queueUrl;

		private String queueInternalUrl;

		private String queueName;

		private Long createTime;

		private Long lastModifyTime;

		private Long delaySeconds;

		private Long maximumMessageSize;

		private Long messageRetentionPeriod;

		private Long visibilityTimeout;

		private Long pollingWaitSeconds;

		private Long activeMessages;

		private Long inactiveMessages;

		private Long delayMessages;

		private Boolean loggingEnabled;

		public String getQueueUrl() {
			return this.queueUrl;
		}

		public void setQueueUrl(String queueUrl) {
			this.queueUrl = queueUrl;
		}

		public String getQueueInternalUrl() {
			return this.queueInternalUrl;
		}

		public void setQueueInternalUrl(String queueInternalUrl) {
			this.queueInternalUrl = queueInternalUrl;
		}

		public String getQueueName() {
			return this.queueName;
		}

		public void setQueueName(String queueName) {
			this.queueName = queueName;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public Long getLastModifyTime() {
			return this.lastModifyTime;
		}

		public void setLastModifyTime(Long lastModifyTime) {
			this.lastModifyTime = lastModifyTime;
		}

		public Long getDelaySeconds() {
			return this.delaySeconds;
		}

		public void setDelaySeconds(Long delaySeconds) {
			this.delaySeconds = delaySeconds;
		}

		public Long getMaximumMessageSize() {
			return this.maximumMessageSize;
		}

		public void setMaximumMessageSize(Long maximumMessageSize) {
			this.maximumMessageSize = maximumMessageSize;
		}

		public Long getMessageRetentionPeriod() {
			return this.messageRetentionPeriod;
		}

		public void setMessageRetentionPeriod(Long messageRetentionPeriod) {
			this.messageRetentionPeriod = messageRetentionPeriod;
		}

		public Long getVisibilityTimeout() {
			return this.visibilityTimeout;
		}

		public void setVisibilityTimeout(Long visibilityTimeout) {
			this.visibilityTimeout = visibilityTimeout;
		}

		public Long getPollingWaitSeconds() {
			return this.pollingWaitSeconds;
		}

		public void setPollingWaitSeconds(Long pollingWaitSeconds) {
			this.pollingWaitSeconds = pollingWaitSeconds;
		}

		public Long getActiveMessages() {
			return this.activeMessages;
		}

		public void setActiveMessages(Long activeMessages) {
			this.activeMessages = activeMessages;
		}

		public Long getInactiveMessages() {
			return this.inactiveMessages;
		}

		public void setInactiveMessages(Long inactiveMessages) {
			this.inactiveMessages = inactiveMessages;
		}

		public Long getDelayMessages() {
			return this.delayMessages;
		}

		public void setDelayMessages(Long delayMessages) {
			this.delayMessages = delayMessages;
		}

		public Boolean getLoggingEnabled() {
			return this.loggingEnabled;
		}

		public void setLoggingEnabled(Boolean loggingEnabled) {
			this.loggingEnabled = loggingEnabled;
		}
	}

	@Override
	public GetQueueResponse getInstance(UnmarshallerContext context) {
		return	GetQueueResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
