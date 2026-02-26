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

package com.aliyuncs.live.model.v20161101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.live.transform.v20161101.ListLiveMessageGroupMessagesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListLiveMessageGroupMessagesResponse extends AcsResponse {

	private String requestId;

	private String groupId;

	private Long nextPageToken;

	private Boolean hasmore;

	private List<Messages> messageList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public Long getNextPageToken() {
		return this.nextPageToken;
	}

	public void setNextPageToken(Long nextPageToken) {
		this.nextPageToken = nextPageToken;
	}

	public Boolean getHasmore() {
		return this.hasmore;
	}

	public void setHasmore(Boolean hasmore) {
		this.hasmore = hasmore;
	}

	public List<Messages> getMessageList() {
		return this.messageList;
	}

	public void setMessageList(List<Messages> messageList) {
		this.messageList = messageList;
	}

	public static class Messages {

		private String body;

		private Long timestamp;

		private String msgTid;

		private Long msgType;

		private Long seqNumber;

		private Long totalMessages;

		private Sender sender;

		public String getBody() {
			return this.body;
		}

		public void setBody(String body) {
			this.body = body;
		}

		public Long getTimestamp() {
			return this.timestamp;
		}

		public void setTimestamp(Long timestamp) {
			this.timestamp = timestamp;
		}

		public String getMsgTid() {
			return this.msgTid;
		}

		public void setMsgTid(String msgTid) {
			this.msgTid = msgTid;
		}

		public Long getMsgType() {
			return this.msgType;
		}

		public void setMsgType(Long msgType) {
			this.msgType = msgType;
		}

		public Long getSeqNumber() {
			return this.seqNumber;
		}

		public void setSeqNumber(Long seqNumber) {
			this.seqNumber = seqNumber;
		}

		public Long getTotalMessages() {
			return this.totalMessages;
		}

		public void setTotalMessages(Long totalMessages) {
			this.totalMessages = totalMessages;
		}

		public Sender getSender() {
			return this.sender;
		}

		public void setSender(Sender sender) {
			this.sender = sender;
		}

		public static class Sender {

			private String userId;

			private String userInfo;

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}

			public String getUserInfo() {
				return this.userInfo;
			}

			public void setUserInfo(String userInfo) {
				this.userInfo = userInfo;
			}
		}
	}

	@Override
	public ListLiveMessageGroupMessagesResponse getInstance(UnmarshallerContext context) {
		return	ListLiveMessageGroupMessagesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
