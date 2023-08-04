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
import com.aliyuncs.mns.transform.v20210319.ReceiveMessageResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ReceiveMessageResponse extends AcsResponse {

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

		private String messageId;

		private String receiptHandle;

		private String messageBody;

		private String messageBodyMd5;

		private Long enqueueTime;

		private Long nextVisibleTime;

		private Long firstDequeueTime;

		private Long dequeueCount;

		private Long priority;

		public String getMessageId() {
			return this.messageId;
		}

		public void setMessageId(String messageId) {
			this.messageId = messageId;
		}

		public String getReceiptHandle() {
			return this.receiptHandle;
		}

		public void setReceiptHandle(String receiptHandle) {
			this.receiptHandle = receiptHandle;
		}

		public String getMessageBody() {
			return this.messageBody;
		}

		public void setMessageBody(String messageBody) {
			this.messageBody = messageBody;
		}

		public String getMessageBodyMd5() {
			return this.messageBodyMd5;
		}

		public void setMessageBodyMd5(String messageBodyMd5) {
			this.messageBodyMd5 = messageBodyMd5;
		}

		public Long getEnqueueTime() {
			return this.enqueueTime;
		}

		public void setEnqueueTime(Long enqueueTime) {
			this.enqueueTime = enqueueTime;
		}

		public Long getNextVisibleTime() {
			return this.nextVisibleTime;
		}

		public void setNextVisibleTime(Long nextVisibleTime) {
			this.nextVisibleTime = nextVisibleTime;
		}

		public Long getFirstDequeueTime() {
			return this.firstDequeueTime;
		}

		public void setFirstDequeueTime(Long firstDequeueTime) {
			this.firstDequeueTime = firstDequeueTime;
		}

		public Long getDequeueCount() {
			return this.dequeueCount;
		}

		public void setDequeueCount(Long dequeueCount) {
			this.dequeueCount = dequeueCount;
		}

		public Long getPriority() {
			return this.priority;
		}

		public void setPriority(Long priority) {
			this.priority = priority;
		}
	}

	@Override
	public ReceiveMessageResponse getInstance(UnmarshallerContext context) {
		return	ReceiveMessageResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
