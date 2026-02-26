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

package com.aliyuncs.devops.model.v20210625;

import com.aliyuncs.RoaAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateAppMembersRequest extends RoaAcsRequest<CreateAppMembersResponse> {
	   

	private String organizationId;

	private String appName;

	@SerializedName("body")
	private Body body;
	public CreateAppMembersRequest() {
		super("devops", "2021-06-25", "CreateAppMembers");
		setUriPattern("/appstack/apps/[appName]/members");
		setMethod(MethodType.POST);
	}

	public String getOrganizationId() {
		return this.organizationId;
	}

	public void setOrganizationId(String organizationId) {
		this.organizationId = organizationId;
		if(organizationId != null){
			putQueryParameter("organizationId", organizationId);
		}
	}

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
		if(appName != null){
			putPathParameter("appName", appName);
		}
	}

	public Body getBody() {
		return this.body;
	}

	public void setBody(Body body) {
		this.body = body;	
		if (body != null) {
			putBodyParameter("body" , new Gson().toJson(body));
		}	
	}

	public static class Body {

		@SerializedName("roleNames")
		private List<String> roleNames;

		@SerializedName("playerList")
		private List<PlayerListItem> playerList;

		public List<String> getRoleNames() {
			return this.roleNames;
		}

		public void setRoleNames(List<String> roleNames) {
			this.roleNames = roleNames;
		}

		public List<PlayerListItem> getPlayerList() {
			return this.playerList;
		}

		public void setPlayerList(List<PlayerListItem> playerList) {
			this.playerList = playerList;
		}

		public static class PlayerListItem {

			@SerializedName("id")
			private String id;

			@SerializedName("type")
			private String type;

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}
		}
	}

	@Override
	public Class<CreateAppMembersResponse> getResponseClass() {
		return CreateAppMembersResponse.class;
	}

}
