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
public class CreateWorkitemEstimateRequest extends RoaAcsRequest<CreateWorkitemEstimateResponse> {
	   

	@SerializedName("body")
	private Body body;

	private String organizationId;
	public CreateWorkitemEstimateRequest() {
		super("devops", "2021-06-25", "CreateWorkitemEstimate");
		setUriPattern("/organization/[organizationId]/workitems/estimate");
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

		@SerializedName("recordUserIdentifier")
		private String recordUserIdentifier;

		@SerializedName("description")
		private String description;

		@SerializedName("workitemIdentifier")
		private String workitemIdentifier;

		@SerializedName("type")
		private String type;

		@SerializedName("spentTime")
		private String spentTime;

		public String getRecordUserIdentifier() {
			return this.recordUserIdentifier;
		}

		public void setRecordUserIdentifier(String recordUserIdentifier) {
			this.recordUserIdentifier = recordUserIdentifier;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getWorkitemIdentifier() {
			return this.workitemIdentifier;
		}

		public void setWorkitemIdentifier(String workitemIdentifier) {
			this.workitemIdentifier = workitemIdentifier;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getSpentTime() {
			return this.spentTime;
		}

		public void setSpentTime(String spentTime) {
			this.spentTime = spentTime;
		}
	}

	@Override
	public Class<CreateWorkitemEstimateResponse> getResponseClass() {
		return CreateWorkitemEstimateResponse.class;
	}

}
