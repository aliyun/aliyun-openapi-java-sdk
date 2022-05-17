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

package com.aliyuncs.retailbot.model.v20210224;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListSyncMessagesRequest extends RpcAcsRequest<ListSyncMessagesResponse> {
	   

	@SerializedName("messageDTOList")
	private List<MessageDTOList> messageDTOList;
	public ListSyncMessagesRequest() {
		super("RetailBot", "2021-02-24", "ListSyncMessages");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public List<MessageDTOList> getMessageDTOList() {
		return this.messageDTOList;
	}

	public void setMessageDTOList(List<MessageDTOList> messageDTOList) {
		this.messageDTOList = messageDTOList;	
		if (messageDTOList != null) {
			putBodyParameter("MessageDTOList" , new Gson().toJson(messageDTOList));
		}	
	}

	public static class MessageDTOList {

		@SerializedName("StaffNick")
		private String staffNick;

		@SerializedName("ChatId")
		private String chatId;

		@SerializedName("UserNick")
		private String userNick;

		@SerializedName("MessageId")
		private String messageId;

		@SerializedName("Source")
		private String source;

		@SerializedName("SessionId")
		private String sessionId;

		@SerializedName("UserId")
		private String userId;

		@SerializedName("RobotCode")
		private String robotCode;

		@SerializedName("Content")
		private String content;

		@SerializedName("ContentType")
		private String contentType;

		@SerializedName("SellerNick")
		private String sellerNick;

		@SerializedName("SellerId")
		private String sellerId;

		@SerializedName("SendTime")
		private Long sendTime;

		@SerializedName("StaffId")
		private String staffId;

		@SerializedName("Direction")
		private String direction;

		public String getStaffNick() {
			return this.staffNick;
		}

		public void setStaffNick(String staffNick) {
			this.staffNick = staffNick;
		}

		public String getChatId() {
			return this.chatId;
		}

		public void setChatId(String chatId) {
			this.chatId = chatId;
		}

		public String getUserNick() {
			return this.userNick;
		}

		public void setUserNick(String userNick) {
			this.userNick = userNick;
		}

		public String getMessageId() {
			return this.messageId;
		}

		public void setMessageId(String messageId) {
			this.messageId = messageId;
		}

		public String getSource() {
			return this.source;
		}

		public void setSource(String source) {
			this.source = source;
		}

		public String getSessionId() {
			return this.sessionId;
		}

		public void setSessionId(String sessionId) {
			this.sessionId = sessionId;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getRobotCode() {
			return this.robotCode;
		}

		public void setRobotCode(String robotCode) {
			this.robotCode = robotCode;
		}

		public String getContent() {
			return this.content;
		}

		public void setContent(String content) {
			this.content = content;
		}

		public String getContentType() {
			return this.contentType;
		}

		public void setContentType(String contentType) {
			this.contentType = contentType;
		}

		public String getSellerNick() {
			return this.sellerNick;
		}

		public void setSellerNick(String sellerNick) {
			this.sellerNick = sellerNick;
		}

		public String getSellerId() {
			return this.sellerId;
		}

		public void setSellerId(String sellerId) {
			this.sellerId = sellerId;
		}

		public Long getSendTime() {
			return this.sendTime;
		}

		public void setSendTime(Long sendTime) {
			this.sendTime = sendTime;
		}

		public String getStaffId() {
			return this.staffId;
		}

		public void setStaffId(String staffId) {
			this.staffId = staffId;
		}

		public String getDirection() {
			return this.direction;
		}

		public void setDirection(String direction) {
			this.direction = direction;
		}
	}

	@Override
	public Class<ListSyncMessagesResponse> getResponseClass() {
		return ListSyncMessagesResponse.class;
	}

}
