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

package com.aliyuncs.robotstudios.model.v20200310;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetResponseRequest extends RpcAcsRequest<GetResponseResponse> {
	   

	private String chatAppKey;

	private String chatUserId;

	private String chatQuery;
	public GetResponseRequest() {
		super("RobotStudios", "2020-03-10", "GetResponse");
		setMethod(MethodType.GET);
	}

	public String getChatAppKey() {
		return this.chatAppKey;
	}

	public void setChatAppKey(String chatAppKey) {
		this.chatAppKey = chatAppKey;
		if(chatAppKey != null){
			putQueryParameter("ChatAppKey", chatAppKey);
		}
	}

	public String getChatUserId() {
		return this.chatUserId;
	}

	public void setChatUserId(String chatUserId) {
		this.chatUserId = chatUserId;
		if(chatUserId != null){
			putQueryParameter("ChatUserId", chatUserId);
		}
	}

	public String getChatQuery() {
		return this.chatQuery;
	}

	public void setChatQuery(String chatQuery) {
		this.chatQuery = chatQuery;
		if(chatQuery != null){
			putQueryParameter("ChatQuery", chatQuery);
		}
	}

	@Override
	public Class<GetResponseResponse> getResponseClass() {
		return GetResponseResponse.class;
	}

}
