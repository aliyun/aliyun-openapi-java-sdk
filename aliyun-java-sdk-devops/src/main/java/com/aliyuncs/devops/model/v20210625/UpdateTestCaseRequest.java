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
public class UpdateTestCaseRequest extends RoaAcsRequest<UpdateTestCaseResponse> {
	   

	private String testcaseIdentifier;

	@SerializedName("body")
	private Body body;

	private String organizationId;
	public UpdateTestCaseRequest() {
		super("devops", "2021-06-25", "UpdateTestCase");
		setUriPattern("/organization/[organizationId]/testhub/testcase/[testcaseIdentifier]");
		setMethod(MethodType.PUT);
	}

	public String getTestcaseIdentifier() {
		return this.testcaseIdentifier;
	}

	public void setTestcaseIdentifier(String testcaseIdentifier) {
		this.testcaseIdentifier = testcaseIdentifier;
		if(testcaseIdentifier != null){
			putPathParameter("testcaseIdentifier", testcaseIdentifier);
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

		@SerializedName("updateWorkitemPropertyRequest")
		private List<UpdateWorkitemPropertyRequestItem> updateWorkitemPropertyRequest;

		public List<UpdateWorkitemPropertyRequestItem> getUpdateWorkitemPropertyRequest() {
			return this.updateWorkitemPropertyRequest;
		}

		public void setUpdateWorkitemPropertyRequest(List<UpdateWorkitemPropertyRequestItem> updateWorkitemPropertyRequest) {
			this.updateWorkitemPropertyRequest = updateWorkitemPropertyRequest;
		}

		public static class UpdateWorkitemPropertyRequestItem {

			@SerializedName("fieldIdentifier")
			private String fieldIdentifier;

			@SerializedName("fieldValue")
			private String fieldValue;

			public String getFieldIdentifier() {
				return this.fieldIdentifier;
			}

			public void setFieldIdentifier(String fieldIdentifier) {
				this.fieldIdentifier = fieldIdentifier;
			}

			public String getFieldValue() {
				return this.fieldValue;
			}

			public void setFieldValue(String fieldValue) {
				this.fieldValue = fieldValue;
			}
		}
	}

	@Override
	public Class<UpdateTestCaseResponse> getResponseClass() {
		return UpdateTestCaseResponse.class;
	}

}
