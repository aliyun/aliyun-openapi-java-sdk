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
public class CreateTestCaseRequest extends RoaAcsRequest<CreateTestCaseResponse> {
	   

	@SerializedName("body")
	private Body body;

	private String organizationId;
	public CreateTestCaseRequest() {
		super("devops", "2021-06-25", "CreateTestCase");
		setUriPattern("/organization/[organizationId]/testhub/testcase");
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

		@SerializedName("fieldValueList")
		private List<FieldValueListItem> fieldValueList;

		@SerializedName("subject")
		private String subject;

		@SerializedName("testcaseStepContentInfo")
		private TestcaseStepContentInfo testcaseStepContentInfo;

		@SerializedName("spaceIdentifier")
		private String spaceIdentifier;

		@SerializedName("priority")
		private String priority;

		@SerializedName("directoryIdentifier")
		private String directoryIdentifier;

		@SerializedName("assignedTo")
		private String assignedTo;

		@SerializedName("tags")
		private List<String> tags;

		public List<FieldValueListItem> getFieldValueList() {
			return this.fieldValueList;
		}

		public void setFieldValueList(List<FieldValueListItem> fieldValueList) {
			this.fieldValueList = fieldValueList;
		}

		public String getSubject() {
			return this.subject;
		}

		public void setSubject(String subject) {
			this.subject = subject;
		}

		public TestcaseStepContentInfo getTestcaseStepContentInfo() {
			return this.testcaseStepContentInfo;
		}

		public void setTestcaseStepContentInfo(TestcaseStepContentInfo testcaseStepContentInfo) {
			this.testcaseStepContentInfo = testcaseStepContentInfo;
		}

		public String getSpaceIdentifier() {
			return this.spaceIdentifier;
		}

		public void setSpaceIdentifier(String spaceIdentifier) {
			this.spaceIdentifier = spaceIdentifier;
		}

		public String getPriority() {
			return this.priority;
		}

		public void setPriority(String priority) {
			this.priority = priority;
		}

		public String getDirectoryIdentifier() {
			return this.directoryIdentifier;
		}

		public void setDirectoryIdentifier(String directoryIdentifier) {
			this.directoryIdentifier = directoryIdentifier;
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

		public static class TestcaseStepContentInfo {

			@SerializedName("stepType")
			private String stepType;

			@SerializedName("precondition")
			private String precondition;

			@SerializedName("stepResultList")
			private List<StepResultListItem> stepResultList;

			public String getStepType() {
				return this.stepType;
			}

			public void setStepType(String stepType) {
				this.stepType = stepType;
			}

			public String getPrecondition() {
				return this.precondition;
			}

			public void setPrecondition(String precondition) {
				this.precondition = precondition;
			}

			public List<StepResultListItem> getStepResultList() {
				return this.stepResultList;
			}

			public void setStepResultList(List<StepResultListItem> stepResultList) {
				this.stepResultList = stepResultList;
			}

			public static class StepResultListItem {

				@SerializedName("expected")
				private String expected;

				@SerializedName("step")
				private String step;

				public String getExpected() {
					return this.expected;
				}

				public void setExpected(String expected) {
					this.expected = expected;
				}

				public String getStep() {
					return this.step;
				}

				public void setStep(String step) {
					this.step = step;
				}
			}
		}
	}

	@Override
	public Class<CreateTestCaseResponse> getResponseClass() {
		return CreateTestCaseResponse.class;
	}

}
