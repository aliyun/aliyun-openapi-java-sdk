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
public class UpdateRepositoryMemberRequest extends RoaAcsRequest<UpdateRepositoryMemberResponse> {
	   

	private String aliyunPk;

	private String organizationId;

	private Long repositoryId;

	private String accessToken;

	@SerializedName("body")
	private Body body;
	public UpdateRepositoryMemberRequest() {
		super("devops", "2021-06-25", "UpdateRepositoryMember");
		setUriPattern("/repository/[repositoryId]/members/[aliyunPk]");
		setMethod(MethodType.PUT);
	}

	public String getAliyunPk() {
		return this.aliyunPk;
	}

	public void setAliyunPk(String aliyunPk) {
		this.aliyunPk = aliyunPk;
		if(aliyunPk != null){
			putPathParameter("aliyunPk", aliyunPk);
		}
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

	public static class Body {

		@SerializedName("accessLevel")
		private Integer accessLevel;

		@SerializedName("relatedInfos")
		private List<RelatedInfosItem> relatedInfos;

		@SerializedName("memberType")
		private String memberType;

		@SerializedName("expireAt")
		private String expireAt;

		@SerializedName("relatedId")
		private String relatedId;

		public Integer getAccessLevel() {
			return this.accessLevel;
		}

		public void setAccessLevel(Integer accessLevel) {
			this.accessLevel = accessLevel;
		}

		public List<RelatedInfosItem> getRelatedInfos() {
			return this.relatedInfos;
		}

		public void setRelatedInfos(List<RelatedInfosItem> relatedInfos) {
			this.relatedInfos = relatedInfos;
		}

		public String getMemberType() {
			return this.memberType;
		}

		public void setMemberType(String memberType) {
			this.memberType = memberType;
		}

		public String getExpireAt() {
			return this.expireAt;
		}

		public void setExpireAt(String expireAt) {
			this.expireAt = expireAt;
		}

		public String getRelatedId() {
			return this.relatedId;
		}

		public void setRelatedId(String relatedId) {
			this.relatedId = relatedId;
		}

		public static class RelatedInfosItem {

			@SerializedName("sourceId")
			private Long sourceId;

			@SerializedName("sourceType")
			private String sourceType;

			@SerializedName("relatedId")
			private String relatedId;

			public Long getSourceId() {
				return this.sourceId;
			}

			public void setSourceId(Long sourceId) {
				this.sourceId = sourceId;
			}

			public String getSourceType() {
				return this.sourceType;
			}

			public void setSourceType(String sourceType) {
				this.sourceType = sourceType;
			}

			public String getRelatedId() {
				return this.relatedId;
			}

			public void setRelatedId(String relatedId) {
				this.relatedId = relatedId;
			}
		}
	}

	@Override
	public Class<UpdateRepositoryMemberResponse> getResponseClass() {
		return UpdateRepositoryMemberResponse.class;
	}

}
