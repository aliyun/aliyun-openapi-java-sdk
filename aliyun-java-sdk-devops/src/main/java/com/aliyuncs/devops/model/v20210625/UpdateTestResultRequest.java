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
public class UpdateTestResultRequest extends RoaAcsRequest<UpdateTestResultResponse> {
	   

	private String testcaseIdentifier;

	@SerializedName("body")
	private Body body;

	private String organizationId;

	private String testPlanIdentifier;
	public UpdateTestResultRequest() {
		super("devops", "2021-06-25", "UpdateTestResult");
		setUriPattern("/organization/[organizationId]/testhub/testplan/[testPlanIdentifier]/testresult/[testcaseIdentifier]");
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

	public String getTestPlanIdentifier() {
		return this.testPlanIdentifier;
	}

	public void setTestPlanIdentifier(String testPlanIdentifier) {
		this.testPlanIdentifier = testPlanIdentifier;
		if(testPlanIdentifier != null){
			putPathParameter("testPlanIdentifier", testPlanIdentifier);
		}
	}

	public static class Body {

		@SerializedName("executor")
		private String executor;

		@SerializedName("status")
		private String status;

		public String getExecutor() {
			return this.executor;
		}

		public void setExecutor(String executor) {
			this.executor = executor;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
	}

	@Override
	public Class<UpdateTestResultResponse> getResponseClass() {
		return UpdateTestResultResponse.class;
	}

}
