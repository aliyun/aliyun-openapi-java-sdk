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

package com.aliyuncs.msccommonquery.model.v20210407;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.msccommonquery.transform.v20210407.ListMessagesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListMessagesResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private Boolean success;

	private List<Message> data;

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

	public List<Message> getData() {
		return this.data;
	}

	public void setData(List<Message> data) {
		this.data = data;
	}

	public static class Message {

		private String messageId;

		private String receiver;

		private String channelType;

		private String title;

		private String content;

		private String status;

		private Long timestamp;

		public String getMessageId() {
			return this.messageId;
		}

		public void setMessageId(String messageId) {
			this.messageId = messageId;
		}

		public String getReceiver() {
			return this.receiver;
		}

		public void setReceiver(String receiver) {
			this.receiver = receiver;
		}

		public String getChannelType() {
			return this.channelType;
		}

		public void setChannelType(String channelType) {
			this.channelType = channelType;
		}

		public String getTitle() {
			return this.title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getContent() {
			return this.content;
		}

		public void setContent(String content) {
			this.content = content;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Long getTimestamp() {
			return this.timestamp;
		}

		public void setTimestamp(Long timestamp) {
			this.timestamp = timestamp;
		}
	}

	@Override
	public ListMessagesResponse getInstance(UnmarshallerContext context) {
		return	ListMessagesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
