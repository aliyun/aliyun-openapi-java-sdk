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
public class ChatappEmbedSignUpRequest extends RpcAcsRequest<ChatappEmbedSignUpResponse> {
	   

	private String inputToken;
	public ChatappEmbedSignUpRequest() {
		super("cams", "2020-06-06", "ChatappEmbedSignUp");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getInputToken() {
		return this.inputToken;
	}

	public void setInputToken(String inputToken) {
		this.inputToken = inputToken;
		if(inputToken != null){
			putBodyParameter("InputToken", inputToken);
		}
	}

	@Override
	public Class<ChatappEmbedSignUpResponse> getResponseClass() {
		return ChatappEmbedSignUpResponse.class;
	}

}
