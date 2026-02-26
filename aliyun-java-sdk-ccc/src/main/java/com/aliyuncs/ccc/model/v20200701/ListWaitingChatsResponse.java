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
import com.aliyuncs.ccc.transform.v20200701.ListWaitingChatsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListWaitingChatsResponse extends AcsResponse {

	private String code;

	private Integer httpStatusCode;

	private String message;

	private String requestId;

	private List<Chat> data;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
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

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Chat> getData() {
		return this.data;
	}

	public void setData(List<Chat> data) {
		this.data = data;
	}

	public static class Chat {

		private String chatConversationId;

		private Boolean beingAssigned;

		private String jobId;

		private Long enqueueTime;

		private String accessChannelId;

		private String accessChannelType;

		private String skillGroupId;

		private List<User> userList;

		private List<Message> messages;

		public String getChatConversationId() {
			return this.chatConversationId;
		}

		public void setChatConversationId(String chatConversationId) {
			this.chatConversationId = chatConversationId;
		}

		public Boolean getBeingAssigned() {
			return this.beingAssigned;
		}

		public void setBeingAssigned(Boolean beingAssigned) {
			this.beingAssigned = beingAssigned;
		}

		public String getJobId() {
			return this.jobId;
		}

		public void setJobId(String jobId) {
			this.jobId = jobId;
		}

		public Long getEnqueueTime() {
			return this.enqueueTime;
		}

		public void setEnqueueTime(Long enqueueTime) {
			this.enqueueTime = enqueueTime;
		}

		public String getAccessChannelId() {
			return this.accessChannelId;
		}

		public void setAccessChannelId(String accessChannelId) {
			this.accessChannelId = accessChannelId;
		}

		public String getAccessChannelType() {
			return this.accessChannelType;
		}

		public void setAccessChannelType(String accessChannelType) {
			this.accessChannelType = accessChannelType;
		}

		public String getSkillGroupId() {
			return this.skillGroupId;
		}

		public void setSkillGroupId(String skillGroupId) {
			this.skillGroupId = skillGroupId;
		}

		public List<User> getUserList() {
			return this.userList;
		}

		public void setUserList(List<User> userList) {
			this.userList = userList;
		}

		public List<Message> getMessages() {
			return this.messages;
		}

		public void setMessages(List<Message> messages) {
			this.messages = messages;
		}

		public static class User {

			private String userName;

			private String userId;

			private String userType;

			private String avatarUrl;

			public String getUserName() {
				return this.userName;
			}

			public void setUserName(String userName) {
				this.userName = userName;
			}

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}

			public String getUserType() {
				return this.userType;
			}

			public void setUserType(String userType) {
				this.userType = userType;
			}

			public String getAvatarUrl() {
				return this.avatarUrl;
			}

			public void setAvatarUrl(String avatarUrl) {
				this.avatarUrl = avatarUrl;
			}
		}

		public static class Message {

			private String senderId;

			private String content;

			private String senderType;

			public String getSenderId() {
				return this.senderId;
			}

			public void setSenderId(String senderId) {
				this.senderId = senderId;
			}

			public String getContent() {
				return this.content;
			}

			public void setContent(String content) {
				this.content = content;
			}

			public String getSenderType() {
				return this.senderType;
			}

			public void setSenderType(String senderType) {
				this.senderType = senderType;
			}
		}
	}

	@Override
	public ListWaitingChatsResponse getInstance(UnmarshallerContext context) {
		return	ListWaitingChatsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
