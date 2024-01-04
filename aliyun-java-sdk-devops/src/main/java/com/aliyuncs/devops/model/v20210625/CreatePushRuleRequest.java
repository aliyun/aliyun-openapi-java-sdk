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
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreatePushRuleRequest extends RoaAcsRequest<CreatePushRuleResponse> {
	   

	private String organizationId;

	private Long repositoryId;

	private String accessToken;

	@SerializedName("body")
	private Body body;
	public CreatePushRuleRequest() {
		super("devops", "2021-06-25", "CreatePushRule");
		setProtocol(ProtocolType.HTTPS);
		setUriPattern("/api/v4/projects/[repositoryId]/push_rule");
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

	public static class Body {

		@SerializedName("ruleInfos")
		private List<RuleInfosItem> ruleInfos;

		public List<RuleInfosItem> getRuleInfos() {
			return this.ruleInfos;
		}

		public void setRuleInfos(List<RuleInfosItem> ruleInfos) {
			this.ruleInfos = ruleInfos;
		}

		public static class RuleInfosItem {

			@SerializedName("extraMessage")
			private String extraMessage;

			@SerializedName("checkerType")
			private String checkerType;

			@SerializedName("fileRuleRegexes")
			private List<String> fileRuleRegexes;

			@SerializedName("checkerName")
			private String checkerName;

			public String getExtraMessage() {
				return this.extraMessage;
			}

			public void setExtraMessage(String extraMessage) {
				this.extraMessage = extraMessage;
			}

			public String getCheckerType() {
				return this.checkerType;
			}

			public void setCheckerType(String checkerType) {
				this.checkerType = checkerType;
			}

			public List<String> getFileRuleRegexes() {
				return this.fileRuleRegexes;
			}

			public void setFileRuleRegexes(List<String> fileRuleRegexes) {
				this.fileRuleRegexes = fileRuleRegexes;
			}

			public String getCheckerName() {
				return this.checkerName;
			}

			public void setCheckerName(String checkerName) {
				this.checkerName = checkerName;
			}
		}
	}

	@Override
	public Class<CreatePushRuleResponse> getResponseClass() {
		return CreatePushRuleResponse.class;
	}

}
