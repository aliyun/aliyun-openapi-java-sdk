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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ccc.transform.v20200701.ListGroupChatMessagesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListGroupChatMessagesResponse extends AcsResponse {

	private String requestId;

	private Integer httpStatusCode;

	private String message;

	private String code;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

		private String nextPageToken;

		private List<GroupChatMessage> messages;

		public String getNextPageToken() {
			return this.nextPageToken;
		}

		public void setNextPageToken(String nextPageToken) {
			this.nextPageToken = nextPageToken;
		}

		public List<GroupChatMessage> getMessages() {
			return this.messages;
		}

		public void setMessages(List<GroupChatMessage> messages) {
			this.messages = messages;
		}

		public static class GroupChatMessage {

			private String jobId;

			private String senderId;

			private String senderType;

			private Long timestamp;

			private String content;

			private String senderName;

			private String senderAvatarUrl;

			private Boolean recalled;

			public String getJobId() {
				return this.jobId;
			}

			public void setJobId(String jobId) {
				this.jobId = jobId;
			}

			public String getSenderId() {
				return this.senderId;
			}

			public void setSenderId(String senderId) {
				this.senderId = senderId;
			}

			public String getSenderType() {
				return this.senderType;
			}

			public void setSenderType(String senderType) {
				this.senderType = senderType;
			}

			public Long getTimestamp() {
				return this.timestamp;
			}

			public void setTimestamp(Long timestamp) {
				this.timestamp = timestamp;
			}

			public String getContent() {
				return this.content;
			}

			public void setContent(String content) {
				this.content = content;
			}

			public String getSenderName() {
				return this.senderName;
			}

			public void setSenderName(String senderName) {
				this.senderName = senderName;
			}

			public String getSenderAvatarUrl() {
				return this.senderAvatarUrl;
			}

			public void setSenderAvatarUrl(String senderAvatarUrl) {
				this.senderAvatarUrl = senderAvatarUrl;
			}

			public Boolean getRecalled() {
				return this.recalled;
			}

			public void setRecalled(Boolean recalled) {
				this.recalled = recalled;
			}
		}
	}

	@Override
	public ListGroupChatMessagesResponse getInstance(UnmarshallerContext context) {
		return	ListGroupChatMessagesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
