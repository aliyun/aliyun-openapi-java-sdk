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

package com.aliyuncs.cloudcallcenter.model.v20170705;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class CreateVnInstanceRequest extends RpcAcsRequest<CreateVnInstanceResponse> {
	
	public CreateVnInstanceRequest() {
		super("CloudCallCenter", "2017-07-05", "CreateVnInstance", "CloudCallCenter", "innerAPI");
	}

	private String chatbotInstanceId;

	private String name;

	private String description;

	private String nluServiceType;

	private Long concurrency;

	public String getChatbotInstanceId() {
		return this.chatbotInstanceId;
	}

	public void setChatbotInstanceId(String chatbotInstanceId) {
		this.chatbotInstanceId = chatbotInstanceId;
		if(chatbotInstanceId != null){
			putQueryParameter("ChatbotInstanceId", chatbotInstanceId);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getNluServiceType() {
		return this.nluServiceType;
	}

	public void setNluServiceType(String nluServiceType) {
		this.nluServiceType = nluServiceType;
		if(nluServiceType != null){
			putQueryParameter("NluServiceType", nluServiceType);
		}
	}

	public Long getConcurrency() {
		return this.concurrency;
	}

	public void setConcurrency(Long concurrency) {
		this.concurrency = concurrency;
		if(concurrency != null){
			putQueryParameter("Concurrency", concurrency.toString());
		}
	}

	@Override
	public Class<CreateVnInstanceResponse> getResponseClass() {
		return CreateVnInstanceResponse.class;
	}

}
