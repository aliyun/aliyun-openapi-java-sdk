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
public class AuthorizedVnRequest extends RpcAcsRequest<AuthorizedVnResponse> {
	
	public AuthorizedVnRequest() {
		super("CloudCallCenter", "2017-07-05", "AuthorizedVn", "CloudCallCenter", "innerAPI");
	}

	private String instanceId;

	private String conversationId;

	private String initialContext;

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getConversationId() {
		return this.conversationId;
	}

	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
		if(conversationId != null){
			putQueryParameter("ConversationId", conversationId);
		}
	}

	public String getInitialContext() {
		return this.initialContext;
	}

	public void setInitialContext(String initialContext) {
		this.initialContext = initialContext;
		if(initialContext != null){
			putQueryParameter("InitialContext", initialContext);
		}
	}

	@Override
	public Class<AuthorizedVnResponse> getResponseClass() {
		return AuthorizedVnResponse.class;
	}

}
