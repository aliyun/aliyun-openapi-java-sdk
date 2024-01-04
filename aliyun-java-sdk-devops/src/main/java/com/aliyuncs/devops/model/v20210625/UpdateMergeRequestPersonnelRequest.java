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
public class UpdateMergeRequestPersonnelRequest extends RoaAcsRequest<UpdateMergeRequestPersonnelResponse> {
	   

	private String organizationId;

	private Long repositoryId;

	private String accessToken;

	@SerializedName("body")
	private Body body;

	private Long localId;

	private String personType;
	public UpdateMergeRequestPersonnelRequest() {
		super("devops", "2021-06-25", "UpdateMergeRequestPersonnel");
		setUriPattern("/api/v4/projects/[repositoryId]/merge_requests/[localId]/person/[personType]");
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

	public Long getRepositoryId() {
		return this.repositoryId;
	}

	public void setRepositoryId(Long repositoryId) {
		this.repositoryId = repositoryId;
		if(repositoryId != null){
			putPathParameter("repositoryId", repositoryId.toString());
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

	public Long getLocalId() {
		return this.localId;
	}

	public void setLocalId(Long localId) {
		this.localId = localId;
		if(localId != null){
			putPathParameter("localId", localId.toString());
		}
	}

	public String getPersonType() {
		return this.personType;
	}

	public void setPersonType(String personType) {
		this.personType = personType;
		if(personType != null){
			putPathParameter("personType", personType);
		}
	}

	public static class Body {

		@SerializedName("newUserIdList")
		private List<String> newUserIdList;

		public List<String> getNewUserIdList() {
			return this.newUserIdList;
		}

		public void setNewUserIdList(List<String> newUserIdList) {
			this.newUserIdList = newUserIdList;
		}
	}

	@Override
	public Class<UpdateMergeRequestPersonnelResponse> getResponseClass() {
		return UpdateMergeRequestPersonnelResponse.class;
	}

}
