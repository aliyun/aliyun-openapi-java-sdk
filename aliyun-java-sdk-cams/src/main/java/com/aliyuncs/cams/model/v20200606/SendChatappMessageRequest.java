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
public class SendChatappMessageRequest extends RpcAcsRequest<SendChatappMessageResponse> {
	   

	private String messageType;

	private String language;

	private String type;

	private String content;

	@SerializedName("templateParams")
	private Map<String,String> templateParams;

	@SerializedName("payload")
	private List<String> payload;

	private String channelType;

	private String from;

	private String to;

	private String templateCode;
	public SendChatappMessageRequest() {
		super("cams", "2020-06-06", "SendChatappMessage");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getMessageType() {
		return this.messageType;
	}

	public void setMessageType(String messageType) {
		this.messageType = messageType;
		if(messageType != null){
			putBodyParameter("MessageType", messageType);
		}
	}

	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String language) {
		this.language = language;
		if(language != null){
			putBodyParameter("Language", language);
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putBodyParameter("Type", type);
		}
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
		if(content != null){
			putQueryParameter("Content", content);
		}
	}

	public Map<String,String> getTemplateParams() {
		return this.templateParams;
	}

	public void setTemplateParams(Map<String,String> templateParams) {
		this.templateParams = templateParams;	
		if (templateParams != null) {
			putBodyParameter("TemplateParams" , new Gson().toJson(templateParams));
		}	
	}

	public List<String> getPayload() {
		return this.payload;
	}

	public void setPayload(List<String> payload) {
		this.payload = payload;	
		if (payload != null) {
			putQueryParameter("Payload" , new Gson().toJson(payload));
		}	
	}

	public String getChannelType() {
		return this.channelType;
	}

	public void setChannelType(String channelType) {
		this.channelType = channelType;
		if(channelType != null){
			putBodyParameter("ChannelType", channelType);
		}
	}

	public String getFrom() {
		return this.from;
	}

	public void setFrom(String from) {
		this.from = from;
		if(from != null){
			putBodyParameter("From", from);
		}
	}

	public String getTo() {
		return this.to;
	}

	public void setTo(String to) {
		this.to = to;
		if(to != null){
			putBodyParameter("To", to);
		}
	}

	public String getTemplateCode() {
		return this.templateCode;
	}

	public void setTemplateCode(String templateCode) {
		this.templateCode = templateCode;
		if(templateCode != null){
			putBodyParameter("TemplateCode", templateCode);
		}
	}

	@Override
	public Class<SendChatappMessageResponse> getResponseClass() {
		return SendChatappMessageResponse.class;
	}

}
