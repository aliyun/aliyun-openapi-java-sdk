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
public class GetTestcaseListRequest extends RoaAcsRequest<GetTestcaseListResponse> {
	   

	@SerializedName("body")
	private Body body;

	private String organizationId;
	public GetTestcaseListRequest() {
		super("devops", "2021-06-25", "GetTestcaseList");
		setUriPattern("/organization/[organizationId]/testhub/testcases");
		setMethod(MethodType.POST);
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

	public String getOrganizationId() {
		return this.organizationId;
	}

	public void setOrganizationId(String organizationId) {
		this.organizationId = organizationId;
		if(organizationId != null){
			putPathParameter("organizationId", organizationId);
		}
	}

	public static class Body {

		@SerializedName("nextToken")
		private String nextToken;

		@SerializedName("spaceIdentifier")
		private String spaceIdentifier;

		@SerializedName("conditions")
		private String conditions;

		@SerializedName("directoryIdentifier")
		private String directoryIdentifier;

		@SerializedName("maxResult")
		private String maxResult;

		public String getNextToken() {
			return this.nextToken;
		}

		public void setNextToken(String nextToken) {
			this.nextToken = nextToken;
		}

		public String getSpaceIdentifier() {
			return this.spaceIdentifier;
		}

		public void setSpaceIdentifier(String spaceIdentifier) {
			this.spaceIdentifier = spaceIdentifier;
		}

		public String getConditions() {
			return this.conditions;
		}

		public void setConditions(String conditions) {
			this.conditions = conditions;
		}

		public String getDirectoryIdentifier() {
			return this.directoryIdentifier;
		}

		public void setDirectoryIdentifier(String directoryIdentifier) {
			this.directoryIdentifier = directoryIdentifier;
		}

		public String getMaxResult() {
			return this.maxResult;
		}

		public void setMaxResult(String maxResult) {
			this.maxResult = maxResult;
		}
	}

	@Override
	public Class<GetTestcaseListResponse> getResponseClass() {
		return GetTestcaseListResponse.class;
	}

}
