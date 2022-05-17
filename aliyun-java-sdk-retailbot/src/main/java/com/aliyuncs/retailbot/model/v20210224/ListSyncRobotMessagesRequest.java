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
public class ListSyncRobotMessagesRequest extends RpcAcsRequest<ListSyncRobotMessagesResponse> {
	   

	@SerializedName("robotMessageDTOList")
	private List<RobotMessageDTOList> robotMessageDTOList;
	public ListSyncRobotMessagesRequest() {
		super("RetailBot", "2021-02-24", "ListSyncRobotMessages");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public List<RobotMessageDTOList> getRobotMessageDTOList() {
		return this.robotMessageDTOList;
	}

	public void setRobotMessageDTOList(List<RobotMessageDTOList> robotMessageDTOList) {
		this.robotMessageDTOList = robotMessageDTOList;	
		if (robotMessageDTOList != null) {
			putBodyParameter("RobotMessageDTOList" , new Gson().toJson(robotMessageDTOList));
		}	
	}

	public static class RobotMessageDTOList {

		@SerializedName("AnswerId")
		private String answerId;

		@SerializedName("Reason")
		private String reason;

		@SerializedName("ChatId")
		private String chatId;

		@SerializedName("SceneKey")
		private String sceneKey;

		@SerializedName("AnswerType")
		private String answerType;

		@SerializedName("Solutions")
		private List<String> solutions;

		@SerializedName("UseDxm")
		private Boolean useDxm;

		@SerializedName("SessionId")
		private String sessionId;

		@SerializedName("RobotCode")
		private String robotCode;

		public String getAnswerId() {
			return this.answerId;
		}

		public void setAnswerId(String answerId) {
			this.answerId = answerId;
		}

		public String getReason() {
			return this.reason;
		}

		public void setReason(String reason) {
			this.reason = reason;
		}

		public String getChatId() {
			return this.chatId;
		}

		public void setChatId(String chatId) {
			this.chatId = chatId;
		}

		public String getSceneKey() {
			return this.sceneKey;
		}

		public void setSceneKey(String sceneKey) {
			this.sceneKey = sceneKey;
		}

		public String getAnswerType() {
			return this.answerType;
		}

		public void setAnswerType(String answerType) {
			this.answerType = answerType;
		}

		public List<String> getSolutions() {
			return this.solutions;
		}

		public void setSolutions(List<String> solutions) {
			this.solutions = solutions;
		}

		public Boolean getUseDxm() {
			return this.useDxm;
		}

		public void setUseDxm(Boolean useDxm) {
			this.useDxm = useDxm;
		}

		public String getSessionId() {
			return this.sessionId;
		}

		public void setSessionId(String sessionId) {
			this.sessionId = sessionId;
		}

		public String getRobotCode() {
			return this.robotCode;
		}

		public void setRobotCode(String robotCode) {
			this.robotCode = robotCode;
		}
	}

	@Override
	public Class<ListSyncRobotMessagesResponse> getResponseClass() {
		return ListSyncRobotMessagesResponse.class;
	}

}
