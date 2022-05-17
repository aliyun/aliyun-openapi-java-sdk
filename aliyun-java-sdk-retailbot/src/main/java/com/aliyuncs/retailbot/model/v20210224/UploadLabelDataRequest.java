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
public class UploadLabelDataRequest extends RpcAcsRequest<UploadLabelDataResponse> {
	   

	private String staffNick;

	private String chatId;

	private Boolean correct;

	private String userNick;

	private String sessionId;

	private String userId;

	private String robotCode;

	private String content;

	private String sellerNick;

	private String sellerId;

	private String sceneKey;

	private Long sendTime;

	private String staffId;

	private String correctSceneKey;
	public UploadLabelDataRequest() {
		super("RetailBot", "2021-02-24", "UploadLabelData");
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

	public Boolean getCorrect() {
		return this.correct;
	}

	public void setCorrect(Boolean correct) {
		this.correct = correct;
		if(correct != null){
			putBodyParameter("Correct", correct.toString());
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

	public String getSceneKey() {
		return this.sceneKey;
	}

	public void setSceneKey(String sceneKey) {
		this.sceneKey = sceneKey;
		if(sceneKey != null){
			putBodyParameter("SceneKey", sceneKey);
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

	public String getCorrectSceneKey() {
		return this.correctSceneKey;
	}

	public void setCorrectSceneKey(String correctSceneKey) {
		this.correctSceneKey = correctSceneKey;
		if(correctSceneKey != null){
			putBodyParameter("CorrectSceneKey", correctSceneKey);
		}
	}

	@Override
	public Class<UploadLabelDataResponse> getResponseClass() {
		return UploadLabelDataResponse.class;
	}

}
