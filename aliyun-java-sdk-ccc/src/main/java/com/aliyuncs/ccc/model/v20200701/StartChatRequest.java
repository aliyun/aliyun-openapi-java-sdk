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

package com.aliyuncs.ccc.model.v20200701;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ccc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class StartChatRequest extends RpcAcsRequest<StartChatResponse> {
	   

	@SerializedName("userList")
	private List<UserList> userList;

	private String token;

	private String instanceId;

	private String accessChannelId;
	public StartChatRequest() {
		super("CCC", "2020-07-01", "StartChat", "CCC");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<UserList> getUserList() {
		return this.userList;
	}

	public void setUserList(List<UserList> userList) {
		this.userList = userList;	
		if (userList != null) {
			putQueryParameter("UserList" , new Gson().toJson(userList));
		}	
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
		if(token != null){
			putQueryParameter("Token", token);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getAccessChannelId() {
		return this.accessChannelId;
	}

	public void setAccessChannelId(String accessChannelId) {
		this.accessChannelId = accessChannelId;
		if(accessChannelId != null){
			putQueryParameter("AccessChannelId", accessChannelId);
		}
	}

	public static class UserList {

		@SerializedName("AvatarUrl")
		private String avatarUrl;

		@SerializedName("Nickname")
		private String nickname;

		@SerializedName("UserType")
		private String userType;

		@SerializedName("UserId")
		private String userId;

		public String getAvatarUrl() {
			return this.avatarUrl;
		}

		public void setAvatarUrl(String avatarUrl) {
			this.avatarUrl = avatarUrl;
		}

		public String getNickname() {
			return this.nickname;
		}

		public void setNickname(String nickname) {
			this.nickname = nickname;
		}

		public String getUserType() {
			return this.userType;
		}

		public void setUserType(String userType) {
			this.userType = userType;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}
	}

	@Override
	public Class<StartChatResponse> getResponseClass() {
		return StartChatResponse.class;
	}

}
