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
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DeleteGroupMemberRequest extends RoaAcsRequest<DeleteGroupMemberResponse> {
	   

	private String organizationId;

	private String aliyunPk;

	private Long groupId;

	private String accessToken;

	@SerializedName("body")
	private Body body;
	public DeleteGroupMemberRequest() {
		super("devops", "2021-06-25", "DeleteGroupMember");
		setUriPattern("/repository/groups/[groupId]/members/remove/aliyun_pk");
		setMethod(MethodType.DELETE);
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

	public String getAliyunPk() {
		return this.aliyunPk;
	}

	public void setAliyunPk(String aliyunPk) {
		this.aliyunPk = aliyunPk;
		if(aliyunPk != null){
			putQueryParameter("aliyunPk", aliyunPk);
		}
	}

	public Long getGroupId() {
		return this.groupId;
	}

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
		if(groupId != null){
			putPathParameter("groupId", groupId.toString());
		}
	}

	public String getAccessToken() {
		return this.accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
		if(accessToken != null){
			putQueryParameter("accessToken", accessToken);
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

		@SerializedName("memberType")
		private String memberType;

		public String getMemberType() {
			return this.memberType;
		}

		public void setMemberType(String memberType) {
			this.memberType = memberType;
		}
	}

	@Override
	public Class<DeleteGroupMemberResponse> getResponseClass() {
		return DeleteGroupMemberResponse.class;
	}

}
