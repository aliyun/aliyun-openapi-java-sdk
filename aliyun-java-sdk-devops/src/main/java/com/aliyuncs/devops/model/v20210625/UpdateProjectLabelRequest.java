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
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdateProjectLabelRequest extends RoaAcsRequest<UpdateProjectLabelResponse> {
	   

	private String organizationId;

	private String labelId;

	private String repositoryIdentity;

	private String accessToken;

	@SerializedName("body")
	private Body body;
	public UpdateProjectLabelRequest() {
		super("devops", "2021-06-25", "UpdateProjectLabel");
		setProtocol(ProtocolType.HTTPS);
		setUriPattern("/api/v4/projects/labels/[labelId]");
		setMethod(MethodType.PUT);
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

	public String getLabelId() {
		return this.labelId;
	}

	public void setLabelId(String labelId) {
		this.labelId = labelId;
		if(labelId != null){
			putPathParameter("labelId", labelId);
		}
	}

	public String getRepositoryIdentity() {
		return this.repositoryIdentity;
	}

	public void setRepositoryIdentity(String repositoryIdentity) {
		this.repositoryIdentity = repositoryIdentity;
		if(repositoryIdentity != null){
			putQueryParameter("repositoryIdentity", repositoryIdentity);
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

		@SerializedName("color")
		private String color;

		@SerializedName("name")
		private String name;

		@SerializedName("description")
		private String description;

		public String getColor() {
			return this.color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}
	}

	@Override
	public Class<UpdateProjectLabelResponse> getResponseClass() {
		return UpdateProjectLabelResponse.class;
	}

}
