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

package com.aliyuncs.alinlp.model.v20200629;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.alinlp.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class RequestTableQAOnlineRequest extends RpcAcsRequest<RequestTableQAOnlineResponse> {
	   

	private String question;

	private String params;

	private String serviceCode;

	private String botId;
	public RequestTableQAOnlineRequest() {
		super("alinlp", "2020-06-29", "RequestTableQAOnline");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getQuestion() {
		return this.question;
	}

	public void setQuestion(String question) {
		this.question = question;
		if(question != null){
			putBodyParameter("Question", question);
		}
	}

	public String getParams() {
		return this.params;
	}

	public void setParams(String params) {
		this.params = params;
		if(params != null){
			putBodyParameter("Params", params);
		}
	}

	public String getServiceCode() {
		return this.serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
		if(serviceCode != null){
			putBodyParameter("ServiceCode", serviceCode);
		}
	}

	public String getBotId() {
		return this.botId;
	}

	public void setBotId(String botId) {
		this.botId = botId;
		if(botId != null){
			putBodyParameter("BotId", botId);
		}
	}

	@Override
	public Class<RequestTableQAOnlineResponse> getResponseClass() {
		return RequestTableQAOnlineResponse.class;
	}

}
