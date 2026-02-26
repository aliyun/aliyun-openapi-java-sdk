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

package com.aliyuncs.cams.model.v20200606;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import java.util.Map;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cams.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class BeeBotChatRequest extends RpcAcsRequest<BeeBotChatResponse> {
	   

	private String sessionId;

	private String intentName;

	private String senderNick;

	@SerializedName("perspective")
	private List<String> perspective;

	private String utterance;

	private String isvCode;

	private String knowledgeId;

	@SerializedName("vendorParam")
	private Map<String,String> vendorParam;

	private String senderId;

	private String chatBotInstanceId;

	private String custSpaceId;
	public BeeBotChatRequest() {
		super("cams", "2020-06-06", "BeeBotChat", "cams");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getIntentName() {
		return this.intentName;
	}

	public void setIntentName(String intentName) {
		this.intentName = intentName;
		if(intentName != null){
			putBodyParameter("IntentName", intentName);
		}
	}

	public String getSenderNick() {
		return this.senderNick;
	}

	public void setSenderNick(String senderNick) {
		this.senderNick = senderNick;
		if(senderNick != null){
			putBodyParameter("SenderNick", senderNick);
		}
	}

	public List<String> getPerspective() {
		return this.perspective;
	}

	public void setPerspective(List<String> perspective) {
		this.perspective = perspective;	
		if (perspective != null) {
			putBodyParameter("Perspective" , new Gson().toJson(perspective));
		}	
	}

	public String getUtterance() {
		return this.utterance;
	}

	public void setUtterance(String utterance) {
		this.utterance = utterance;
		if(utterance != null){
			putBodyParameter("Utterance", utterance);
		}
	}

	public String getIsvCode() {
		return this.isvCode;
	}

	public void setIsvCode(String isvCode) {
		this.isvCode = isvCode;
		if(isvCode != null){
			putBodyParameter("IsvCode", isvCode);
		}
	}

	public String getKnowledgeId() {
		return this.knowledgeId;
	}

	public void setKnowledgeId(String knowledgeId) {
		this.knowledgeId = knowledgeId;
		if(knowledgeId != null){
			putBodyParameter("KnowledgeId", knowledgeId);
		}
	}

	public Map<String,String> getVendorParam() {
		return this.vendorParam;
	}

	public void setVendorParam(Map<String,String> vendorParam) {
		this.vendorParam = vendorParam;	
		if (vendorParam != null) {
			putBodyParameter("VendorParam" , new Gson().toJson(vendorParam));
		}	
	}

	public String getSenderId() {
		return this.senderId;
	}

	public void setSenderId(String senderId) {
		this.senderId = senderId;
		if(senderId != null){
			putBodyParameter("SenderId", senderId);
		}
	}

	public String getChatBotInstanceId() {
		return this.chatBotInstanceId;
	}

	public void setChatBotInstanceId(String chatBotInstanceId) {
		this.chatBotInstanceId = chatBotInstanceId;
		if(chatBotInstanceId != null){
			putBodyParameter("ChatBotInstanceId", chatBotInstanceId);
		}
	}

	public String getCustSpaceId() {
		return this.custSpaceId;
	}

	public void setCustSpaceId(String custSpaceId) {
		this.custSpaceId = custSpaceId;
		if(custSpaceId != null){
			putBodyParameter("CustSpaceId", custSpaceId);
		}
	}

	@Override
	public Class<BeeBotChatResponse> getResponseClass() {
		return BeeBotChatResponse.class;
	}

}
