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
public class ModifyVnInstanceRequest extends RpcAcsRequest<ModifyVnInstanceResponse> {
	
	public ModifyVnInstanceRequest() {
		super("CloudCallCenter", "2017-07-05", "ModifyVnInstance", "CloudCallCenter", "innerAPI");
	}

	private String instanceId;

	private String chatbotInstanceId;

	private String description;

	private Long concurrency;

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getChatbotInstanceId() {
		return this.chatbotInstanceId;
	}

	public void setChatbotInstanceId(String chatbotInstanceId) {
		this.chatbotInstanceId = chatbotInstanceId;
		if(chatbotInstanceId != null){
			putQueryParameter("ChatbotInstanceId", chatbotInstanceId);
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
	public Class<ModifyVnInstanceResponse> getResponseClass() {
		return ModifyVnInstanceResponse.class;
	}

}
