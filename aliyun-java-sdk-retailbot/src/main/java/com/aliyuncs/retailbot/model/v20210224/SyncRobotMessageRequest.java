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
public class SyncRobotMessageRequest extends RpcAcsRequest<SyncRobotMessageResponse> {
	   

	private String answerId;

	private String reason;

	private String chatId;

	private String sceneKey;

	private String answer;

	private String answerType;

	@SerializedName("solutions")
	private List<String> solutions;

	private String useDxm;

	private String sessionId;

	private String robotCode;
	public SyncRobotMessageRequest() {
		super("RetailBot", "2021-02-24", "SyncRobotMessage");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getAnswerId() {
		return this.answerId;
	}

	public void setAnswerId(String answerId) {
		this.answerId = answerId;
		if(answerId != null){
			putBodyParameter("AnswerId", answerId);
		}
	}

	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
		if(reason != null){
			putBodyParameter("Reason", reason);
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

	public String getSceneKey() {
		return this.sceneKey;
	}

	public void setSceneKey(String sceneKey) {
		this.sceneKey = sceneKey;
		if(sceneKey != null){
			putBodyParameter("SceneKey", sceneKey);
		}
	}

	public String getAnswer() {
		return this.answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
		if(answer != null){
			putBodyParameter("Answer", answer);
		}
	}

	public String getAnswerType() {
		return this.answerType;
	}

	public void setAnswerType(String answerType) {
		this.answerType = answerType;
		if(answerType != null){
			putBodyParameter("AnswerType", answerType);
		}
	}

	public List<String> getSolutions() {
		return this.solutions;
	}

	public void setSolutions(List<String> solutions) {
		this.solutions = solutions;	
		if (solutions != null) {
			putBodyParameter("Solutions" , new Gson().toJson(solutions));
		}	
	}

	public String getUseDxm() {
		return this.useDxm;
	}

	public void setUseDxm(String useDxm) {
		this.useDxm = useDxm;
		if(useDxm != null){
			putBodyParameter("UseDxm", useDxm);
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

	public String getRobotCode() {
		return this.robotCode;
	}

	public void setRobotCode(String robotCode) {
		this.robotCode = robotCode;
		if(robotCode != null){
			putBodyParameter("RobotCode", robotCode);
		}
	}

	@Override
	public Class<SyncRobotMessageResponse> getResponseClass() {
		return SyncRobotMessageResponse.class;
	}

}
