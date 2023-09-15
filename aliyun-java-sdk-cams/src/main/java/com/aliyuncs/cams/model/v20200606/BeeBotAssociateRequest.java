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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cams.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class BeeBotAssociateRequest extends RpcAcsRequest<BeeBotAssociateResponse> {
	   

	private String sessionId;

	private String perspective;

	private String utterance;

	private String isvCode;

	private Integer recommendNum;

	private String chatBotInstanceId;

	private String custSpaceId;
	public BeeBotAssociateRequest() {
		super("cams", "2020-06-06", "BeeBotAssociate");
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

	public String getPerspective() {
		return this.perspective;
	}

	public void setPerspective(String perspective) {
		this.perspective = perspective;
		if(perspective != null){
			putBodyParameter("Perspective", perspective);
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

	public Integer getRecommendNum() {
		return this.recommendNum;
	}

	public void setRecommendNum(Integer recommendNum) {
		this.recommendNum = recommendNum;
		if(recommendNum != null){
			putBodyParameter("RecommendNum", recommendNum.toString());
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
	public Class<BeeBotAssociateResponse> getResponseClass() {
		return BeeBotAssociateResponse.class;
	}

}
