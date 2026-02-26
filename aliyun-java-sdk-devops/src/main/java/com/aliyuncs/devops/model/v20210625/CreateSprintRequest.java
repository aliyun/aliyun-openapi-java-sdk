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
public class CreateSprintRequest extends RoaAcsRequest<CreateSprintResponse> {
	   

	@SerializedName("body")
	private Body body;

	private String organizationId;
	public CreateSprintRequest() {
		super("devops", "2021-06-25", "CreateSprint");
		setUriPattern("/organization/[organizationId]/sprints/create");
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

		@SerializedName("endDate")
		private String endDate;

		@SerializedName("staffIds")
		private List<String> staffIds;

		@SerializedName("name")
		private String name;

		@SerializedName("spaceIdentifier")
		private String spaceIdentifier;

		@SerializedName("startDate")
		private String startDate;

		public String getEndDate() {
			return this.endDate;
		}

		public void setEndDate(String endDate) {
			this.endDate = endDate;
		}

		public List<String> getStaffIds() {
			return this.staffIds;
		}

		public void setStaffIds(List<String> staffIds) {
			this.staffIds = staffIds;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getSpaceIdentifier() {
			return this.spaceIdentifier;
		}

		public void setSpaceIdentifier(String spaceIdentifier) {
			this.spaceIdentifier = spaceIdentifier;
		}

		public String getStartDate() {
			return this.startDate;
		}

		public void setStartDate(String startDate) {
			this.startDate = startDate;
		}
	}

	@Override
	public Class<CreateSprintResponse> getResponseClass() {
		return CreateSprintResponse.class;
	}

}
