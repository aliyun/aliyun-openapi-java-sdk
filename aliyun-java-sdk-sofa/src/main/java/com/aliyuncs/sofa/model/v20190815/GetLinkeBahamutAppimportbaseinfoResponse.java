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
import com.aliyuncs.sofa.transform.v20190815.GetLinkeBahamutAppimportbaseinfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetLinkeBahamutAppimportbaseinfoResponse extends AcsResponse {

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

		private String accessControl;

		private String appDisplayName;

		private String appLevel;

		private String appName;

		private String appTechStackName;

		private String appType;

		private String archDomainId;

		private Boolean createApp;

		private Boolean createRepo;

		private String description;

		private Boolean fromLocal;

		private String group;

		private String repo;

		private String repoEncode;

		private String repoUrl;

		private Boolean techV2;

		private String tenantExternalId;

		private List<String> devOwnerAccounts;

		private List<String> fileList;

		private List<String> syncCloudTenants;

		private List<String> testOwnerAccounts;

		public String getAccessControl() {
			return this.accessControl;
		}

		public void setAccessControl(String accessControl) {
			this.accessControl = accessControl;
		}

		public String getAppDisplayName() {
			return this.appDisplayName;
		}

		public void setAppDisplayName(String appDisplayName) {
			this.appDisplayName = appDisplayName;
		}

		public String getAppLevel() {
			return this.appLevel;
		}

		public void setAppLevel(String appLevel) {
			this.appLevel = appLevel;
		}

		public String getAppName() {
			return this.appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public String getAppTechStackName() {
			return this.appTechStackName;
		}

		public void setAppTechStackName(String appTechStackName) {
			this.appTechStackName = appTechStackName;
		}

		public String getAppType() {
			return this.appType;
		}

		public void setAppType(String appType) {
			this.appType = appType;
		}

		public String getArchDomainId() {
			return this.archDomainId;
		}

		public void setArchDomainId(String archDomainId) {
			this.archDomainId = archDomainId;
		}

		public Boolean getCreateApp() {
			return this.createApp;
		}

		public void setCreateApp(Boolean createApp) {
			this.createApp = createApp;
		}

		public Boolean getCreateRepo() {
			return this.createRepo;
		}

		public void setCreateRepo(Boolean createRepo) {
			this.createRepo = createRepo;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Boolean getFromLocal() {
			return this.fromLocal;
		}

		public void setFromLocal(Boolean fromLocal) {
			this.fromLocal = fromLocal;
		}

		public String getGroup() {
			return this.group;
		}

		public void setGroup(String group) {
			this.group = group;
		}

		public String getRepo() {
			return this.repo;
		}

		public void setRepo(String repo) {
			this.repo = repo;
		}

		public String getRepoEncode() {
			return this.repoEncode;
		}

		public void setRepoEncode(String repoEncode) {
			this.repoEncode = repoEncode;
		}

		public String getRepoUrl() {
			return this.repoUrl;
		}

		public void setRepoUrl(String repoUrl) {
			this.repoUrl = repoUrl;
		}

		public Boolean getTechV2() {
			return this.techV2;
		}

		public void setTechV2(Boolean techV2) {
			this.techV2 = techV2;
		}

		public String getTenantExternalId() {
			return this.tenantExternalId;
		}

		public void setTenantExternalId(String tenantExternalId) {
			this.tenantExternalId = tenantExternalId;
		}

		public List<String> getDevOwnerAccounts() {
			return this.devOwnerAccounts;
		}

		public void setDevOwnerAccounts(List<String> devOwnerAccounts) {
			this.devOwnerAccounts = devOwnerAccounts;
		}

		public List<String> getFileList() {
			return this.fileList;
		}

		public void setFileList(List<String> fileList) {
			this.fileList = fileList;
		}

		public List<String> getSyncCloudTenants() {
			return this.syncCloudTenants;
		}

		public void setSyncCloudTenants(List<String> syncCloudTenants) {
			this.syncCloudTenants = syncCloudTenants;
		}

		public List<String> getTestOwnerAccounts() {
			return this.testOwnerAccounts;
		}

		public void setTestOwnerAccounts(List<String> testOwnerAccounts) {
			this.testOwnerAccounts = testOwnerAccounts;
		}
	}

	@Override
	public GetLinkeBahamutAppimportbaseinfoResponse getInstance(UnmarshallerContext context) {
		return	GetLinkeBahamutAppimportbaseinfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
