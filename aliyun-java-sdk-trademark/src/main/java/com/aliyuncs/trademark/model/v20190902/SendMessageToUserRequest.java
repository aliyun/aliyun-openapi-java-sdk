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

package com.aliyuncs.trademark.model.v20190902;

import com.aliyuncs.RpcAcsRequest;
import java.util.Map;
import com.google.gson.Gson;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.trademark.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SendMessageToUserRequest extends RpcAcsRequest<SendMessageToUserResponse> {
	   

	private String senderNickName;

	private String templateId;

	private String receiverNickName;

	private Map<Object,Object> templateData;
	public SendMessageToUserRequest() {
		super("Trademark", "2019-09-02", "SendMessageToUser");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSenderNickName() {
		return this.senderNickName;
	}

	public void setSenderNickName(String senderNickName) {
		this.senderNickName = senderNickName;
		if(senderNickName != null){
			putQueryParameter("SenderNickName", senderNickName);
		}
	}

	public String getTemplateId() {
		return this.templateId;
	}

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
		if(templateId != null){
			putQueryParameter("TemplateId", templateId);
		}
	}

	public String getReceiverNickName() {
		return this.receiverNickName;
	}

	public void setReceiverNickName(String receiverNickName) {
		this.receiverNickName = receiverNickName;
		if(receiverNickName != null){
			putQueryParameter("ReceiverNickName", receiverNickName);
		}
	}

	public Map<Object,Object> getTemplateData() {
		return this.templateData;
	}

	public void setTemplateData(Map<Object,Object> templateData) {
		this.templateData = templateData;
		if(templateData != null){
			putQueryParameter("TemplateData", new Gson().toJson(templateData));
		}
	}

	@Override
	public Class<SendMessageToUserResponse> getResponseClass() {
		return SendMessageToUserResponse.class;
	}

}
