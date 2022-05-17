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
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class SyncMessageRequest extends RpcAcsRequest<SyncMessageResponse> {
	   

	private String staffNick;

	private String chatId;

	private String userNick;

	private String messageId;

	private String source;

	private String sessionId;

	private String userId;

	private String robotCode;

	private String content;

	private String contentType;

	private String sellerNick;

	private String sellerId;

	private Long sendTime;

	private String staffId;

	private String direction;
	public SyncMessageRequest() {
		super("RetailBot", "2021-02-24", "SyncMessage");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getStaffNick() {
		return this.staffNick;
	}

	public void setStaffNick(String staffNick) {
		this.staffNick = staffNick;
		if(staffNick != null){
			putBodyParameter("StaffNick", staffNick);
		}
	}

	public String getChatId() {
		return this.chatId;
	}

	public void setChatId(String chatId) {
		this.chatId = chatId;
		if(chatId != null){
			putBodyParameter("ChatId", chatId);
		}
	}

	public String getUserNick() {
		return this.userNick;
	}

	public void setUserNick(String userNick) {
		this.userNick = userNick;
		if(userNick != null){
			putBodyParameter("UserNick", userNick);
		}
	}

	public String getMessageId() {
		return this.messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
		if(messageId != null){
			putBodyParameter("MessageId", messageId);
		}
	}

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
		if(source != null){
			putBodyParameter("Source", source);
		}
	}

	public String getSessionId() {
		return this.sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
		if(sessionId != null){
			putBodyParameter("SessionId", sessionId);
		}
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
		if(userId != null){
			putBodyParameter("UserId", userId);
		}
	}

	public String getRobotCode() {
		return this.robotCode;
	}

	public void setRobotCode(String robotCode) {
		this.robotCode = robotCode;
		if(robotCode != null){
			putBodyParameter("RobotCode", robotCode);
		}
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
		if(content != null){
			putBodyParameter("Content", content);
		}
	}

	public String getContentType() {
		return this.contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
		if(contentType != null){
			putBodyParameter("ContentType", contentType);
		}
	}

	public String getSellerNick() {
		return this.sellerNick;
	}

	public void setSellerNick(String sellerNick) {
		this.sellerNick = sellerNick;
		if(sellerNick != null){
			putBodyParameter("SellerNick", sellerNick);
		}
	}

	public String getSellerId() {
		return this.sellerId;
	}

	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
		if(sellerId != null){
			putBodyParameter("SellerId", sellerId);
		}
	}

	public Long getSendTime() {
		return this.sendTime;
	}

	public void setSendTime(Long sendTime) {
		this.sendTime = sendTime;
		if(sendTime != null){
			putBodyParameter("SendTime", sendTime.toString());
		}
	}

	public String getStaffId() {
		return this.staffId;
	}

	public void setStaffId(String staffId) {
		this.staffId = staffId;
		if(staffId != null){
			putBodyParameter("StaffId", staffId);
		}
	}

	public String getDirection() {
		return this.direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
		if(direction != null){
			putBodyParameter("Direction", direction);
		}
	}

	@Override
	public Class<SyncMessageResponse> getResponseClass() {
		return SyncMessageResponse.class;
	}

}
