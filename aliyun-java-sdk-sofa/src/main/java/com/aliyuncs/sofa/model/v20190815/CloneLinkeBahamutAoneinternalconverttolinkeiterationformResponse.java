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

package com.aliyuncs.sofa.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.CloneLinkeBahamutAoneinternalconverttolinkeiterationformResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CloneLinkeBahamutAoneinternalconverttolinkeiterationformResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private String errorMessage;

	private String errorMsgParamsMap;

	private String message;

	private Long responseStatusCode;

	private Boolean success;

	private Result result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorMsgParamsMap() {
		return this.errorMsgParamsMap;
	}

	public void setErrorMsgParamsMap(String errorMsgParamsMap) {
		this.errorMsgParamsMap = errorMsgParamsMap;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Long getResponseStatusCode() {
		return this.responseStatusCode;
	}

	public void setResponseStatusCode(Long responseStatusCode) {
		this.responseStatusCode = responseStatusCode;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private String aoneCodeChangeId;

		private String appForms;

		private Boolean isBranchRelease;

		private String iterationManager;

		private String name;

		private String prePubOwner;

		private String project;

		private String testOwner;

		private List<String> users;

		private List<String> workItems;

		public String getAoneCodeChangeId() {
			return this.aoneCodeChangeId;
		}

		public void setAoneCodeChangeId(String aoneCodeChangeId) {
			this.aoneCodeChangeId = aoneCodeChangeId;
		}

		public String getAppForms() {
			return this.appForms;
		}

		public void setAppForms(String appForms) {
			this.appForms = appForms;
		}

		public Boolean getIsBranchRelease() {
			return this.isBranchRelease;
		}

		public void setIsBranchRelease(Boolean isBranchRelease) {
			this.isBranchRelease = isBranchRelease;
		}

		public String getIterationManager() {
			return this.iterationManager;
		}

		public void setIterationManager(String iterationManager) {
			this.iterationManager = iterationManager;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPrePubOwner() {
			return this.prePubOwner;
		}

		public void setPrePubOwner(String prePubOwner) {
			this.prePubOwner = prePubOwner;
		}

		public String getProject() {
			return this.project;
		}

		public void setProject(String project) {
			this.project = project;
		}

		public String getTestOwner() {
			return this.testOwner;
		}

		public void setTestOwner(String testOwner) {
			this.testOwner = testOwner;
		}

		public List<String> getUsers() {
			return this.users;
		}

		public void setUsers(List<String> users) {
			this.users = users;
		}

		public List<String> getWorkItems() {
			return this.workItems;
		}

		public void setWorkItems(List<String> workItems) {
			this.workItems = workItems;
		}
	}

	@Override
	public CloneLinkeBahamutAoneinternalconverttolinkeiterationformResponse getInstance(UnmarshallerContext context) {
		return	CloneLinkeBahamutAoneinternalconverttolinkeiterationformResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
