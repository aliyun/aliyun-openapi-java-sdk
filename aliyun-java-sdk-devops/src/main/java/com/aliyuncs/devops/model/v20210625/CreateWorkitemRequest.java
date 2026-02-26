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
public class CreateWorkitemRequest extends RoaAcsRequest<CreateWorkitemResponse> {
	   

	@SerializedName("body")
	private Body body;

	private String organizationId;
	public CreateWorkitemRequest() {
		super("devops", "2021-06-25", "CreateWorkitem");
		setUriPattern("/organization/[organizationId]/workitems/create");
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

		@SerializedName("parent")
		private String parent;

		@SerializedName("subject")
		private String subject;

		@SerializedName("sprint")
		private List<String> sprint;

		@SerializedName("description")
		private String description;

		@SerializedName("assignedTo")
		private String assignedTo;

		@SerializedName("space")
		private String space;

		@SerializedName("participant")
		private List<String> participant;

		@SerializedName("fieldValueList")
		private List<FieldValueListItem> fieldValueList;

		@SerializedName("spaceType")
		private String spaceType;

		@SerializedName("workitemType")
		private String workitemType;

		@SerializedName("verifier")
		private List<String> verifier;

		@SerializedName("tracker")
		private List<String> tracker;

		@SerializedName("descriptionFormat")
		private String descriptionFormat;

		@SerializedName("spaceIdentifier")
		private String spaceIdentifier;

		@SerializedName("category")
		private String category;

		public String getParent() {
			return this.parent;
		}

		public void setParent(String parent) {
			this.parent = parent;
		}

		public String getSubject() {
			return this.subject;
		}

		public void setSubject(String subject) {
			this.subject = subject;
		}

		public List<String> getSprint() {
			return this.sprint;
		}

		public void setSprint(List<String> sprint) {
			this.sprint = sprint;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getAssignedTo() {
			return this.assignedTo;
		}

		public void setAssignedTo(String assignedTo) {
			this.assignedTo = assignedTo;
		}

		public String getSpace() {
			return this.space;
		}

		public void setSpace(String space) {
			this.space = space;
		}

		public List<String> getParticipant() {
			return this.participant;
		}

		public void setParticipant(List<String> participant) {
			this.participant = participant;
		}

		public List<FieldValueListItem> getFieldValueList() {
			return this.fieldValueList;
		}

		public void setFieldValueList(List<FieldValueListItem> fieldValueList) {
			this.fieldValueList = fieldValueList;
		}

		public String getSpaceType() {
			return this.spaceType;
		}

		public void setSpaceType(String spaceType) {
			this.spaceType = spaceType;
		}

		public String getWorkitemType() {
			return this.workitemType;
		}

		public void setWorkitemType(String workitemType) {
			this.workitemType = workitemType;
		}

		public List<String> getVerifier() {
			return this.verifier;
		}

		public void setVerifier(List<String> verifier) {
			this.verifier = verifier;
		}

		public List<String> getTracker() {
			return this.tracker;
		}

		public void setTracker(List<String> tracker) {
			this.tracker = tracker;
		}

		public String getDescriptionFormat() {
			return this.descriptionFormat;
		}

		public void setDescriptionFormat(String descriptionFormat) {
			this.descriptionFormat = descriptionFormat;
		}

		public String getSpaceIdentifier() {
			return this.spaceIdentifier;
		}

		public void setSpaceIdentifier(String spaceIdentifier) {
			this.spaceIdentifier = spaceIdentifier;
		}

		public String getCategory() {
			return this.category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public static class FieldValueListItem {

			@SerializedName("fieldIdentifier")
			private String fieldIdentifier;

			@SerializedName("workitemIdentifier")
			private String workitemIdentifier;

			@SerializedName("value")
			private String value;

			public String getFieldIdentifier() {
				return this.fieldIdentifier;
			}

			public void setFieldIdentifier(String fieldIdentifier) {
				this.fieldIdentifier = fieldIdentifier;
			}

			public String getWorkitemIdentifier() {
				return this.workitemIdentifier;
			}

			public void setWorkitemIdentifier(String workitemIdentifier) {
				this.workitemIdentifier = workitemIdentifier;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}
		}
	}

	@Override
	public Class<CreateWorkitemResponse> getResponseClass() {
		return CreateWorkitemResponse.class;
	}

}
