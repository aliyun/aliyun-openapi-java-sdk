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
public class CreateWorkitemV2Request extends RoaAcsRequest<CreateWorkitemV2Response> {
	   

	@SerializedName("body")
	private Body body;

	private String organizationId;
	public CreateWorkitemV2Request() {
		super("devops", "2021-06-25", "CreateWorkitemV2");
		setProtocol(ProtocolType.HTTPS);
		setUriPattern("/organization/[organizationId]/workitem");
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

		@SerializedName("trackers")
		private List<String> trackers;

		@SerializedName("subject")
		private String subject;

		@SerializedName("sprintIdentifier")
		private String sprintIdentifier;

		@SerializedName("description")
		private String description;

		@SerializedName("assignedTo")
		private String assignedTo;

		@SerializedName("tags")
		private List<String> tags;

		@SerializedName("fieldValueList")
		private List<FieldValueListItem> fieldValueList;

		@SerializedName("workitemTypeIdentifier")
		private String workitemTypeIdentifier;

		@SerializedName("versions")
		private List<String> versions;

		@SerializedName("verifier")
		private String verifier;

		@SerializedName("spaceIdentifier")
		private String spaceIdentifier;

		@SerializedName("parentIdentifier")
		private String parentIdentifier;

		@SerializedName("category")
		private String category;

		@SerializedName("participants")
		private List<String> participants;

		public List<String> getTrackers() {
			return this.trackers;
		}

		public void setTrackers(List<String> trackers) {
			this.trackers = trackers;
		}

		public String getSubject() {
			return this.subject;
		}

		public void setSubject(String subject) {
			this.subject = subject;
		}

		public String getSprintIdentifier() {
			return this.sprintIdentifier;
		}

		public void setSprintIdentifier(String sprintIdentifier) {
			this.sprintIdentifier = sprintIdentifier;
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

		public List<String> getTags() {
			return this.tags;
		}

		public void setTags(List<String> tags) {
			this.tags = tags;
		}

		public List<FieldValueListItem> getFieldValueList() {
			return this.fieldValueList;
		}

		public void setFieldValueList(List<FieldValueListItem> fieldValueList) {
			this.fieldValueList = fieldValueList;
		}

		public String getWorkitemTypeIdentifier() {
			return this.workitemTypeIdentifier;
		}

		public void setWorkitemTypeIdentifier(String workitemTypeIdentifier) {
			this.workitemTypeIdentifier = workitemTypeIdentifier;
		}

		public List<String> getVersions() {
			return this.versions;
		}

		public void setVersions(List<String> versions) {
			this.versions = versions;
		}

		public String getVerifier() {
			return this.verifier;
		}

		public void setVerifier(String verifier) {
			this.verifier = verifier;
		}

		public String getSpaceIdentifier() {
			return this.spaceIdentifier;
		}

		public void setSpaceIdentifier(String spaceIdentifier) {
			this.spaceIdentifier = spaceIdentifier;
		}

		public String getParentIdentifier() {
			return this.parentIdentifier;
		}

		public void setParentIdentifier(String parentIdentifier) {
			this.parentIdentifier = parentIdentifier;
		}

		public String getCategory() {
			return this.category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public List<String> getParticipants() {
			return this.participants;
		}

		public void setParticipants(List<String> participants) {
			this.participants = participants;
		}

		public static class FieldValueListItem {

			@SerializedName("fieldIdentifier")
			private String fieldIdentifier;

			@SerializedName("value")
			private String value;

			public String getFieldIdentifier() {
				return this.fieldIdentifier;
			}

			public void setFieldIdentifier(String fieldIdentifier) {
				this.fieldIdentifier = fieldIdentifier;
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
	public Class<CreateWorkitemV2Response> getResponseClass() {
		return CreateWorkitemV2Response.class;
	}

}
