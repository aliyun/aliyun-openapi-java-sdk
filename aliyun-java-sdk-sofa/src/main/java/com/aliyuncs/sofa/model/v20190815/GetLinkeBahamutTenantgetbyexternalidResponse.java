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
import com.aliyuncs.sofa.transform.v20190815.GetLinkeBahamutTenantgetbyexternalidResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetLinkeBahamutTenantgetbyexternalidResponse extends AcsResponse {

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

		private String accessKey;

		private String accessSecret;

		private String accessToken;

		private Boolean antflowEnabled;

		private Long created;

		private String customer;

		private Boolean deleted;

		private String displayName;

		private Long dropQualityApprovslDate;

		private String endPoint;

		private String externalId;

		private Boolean fromAliyun;

		private String frontHost;

		private String gitlabPrefixMap;

		private String gitLabSite;

		private Boolean haveNotInited;

		private Boolean highAvailabilityEnabled;

		private String id;

		private Boolean indebt;

		private String initStep;

		private Boolean jarEnabled;

		private Long lastModified;

		private Boolean mergeRequestEnabled;

		private String name;

		private Boolean openMyBankControl;

		private String path;

		private Boolean releaseControlEnabled;

		private Boolean showNewPRParamer;

		private Boolean useConfigTypes;

		private Boolean useNewAppReleaseShow;

		private Boolean useNewCloudAppImportView;

		private List<String> authorizedUsers;

		private List<String> configTypes;

		private List<String> sitMergeTrialList;

		private List<String> trialList;

		private List<String> zoneModeList;

		public String getAccessKey() {
			return this.accessKey;
		}

		public void setAccessKey(String accessKey) {
			this.accessKey = accessKey;
		}

		public String getAccessSecret() {
			return this.accessSecret;
		}

		public void setAccessSecret(String accessSecret) {
			this.accessSecret = accessSecret;
		}

		public String getAccessToken() {
			return this.accessToken;
		}

		public void setAccessToken(String accessToken) {
			this.accessToken = accessToken;
		}

		public Boolean getAntflowEnabled() {
			return this.antflowEnabled;
		}

		public void setAntflowEnabled(Boolean antflowEnabled) {
			this.antflowEnabled = antflowEnabled;
		}

		public Long getCreated() {
			return this.created;
		}

		public void setCreated(Long created) {
			this.created = created;
		}

		public String getCustomer() {
			return this.customer;
		}

		public void setCustomer(String customer) {
			this.customer = customer;
		}

		public Boolean getDeleted() {
			return this.deleted;
		}

		public void setDeleted(Boolean deleted) {
			this.deleted = deleted;
		}

		public String getDisplayName() {
			return this.displayName;
		}

		public void setDisplayName(String displayName) {
			this.displayName = displayName;
		}

		public Long getDropQualityApprovslDate() {
			return this.dropQualityApprovslDate;
		}

		public void setDropQualityApprovslDate(Long dropQualityApprovslDate) {
			this.dropQualityApprovslDate = dropQualityApprovslDate;
		}

		public String getEndPoint() {
			return this.endPoint;
		}

		public void setEndPoint(String endPoint) {
			this.endPoint = endPoint;
		}

		public String getExternalId() {
			return this.externalId;
		}

		public void setExternalId(String externalId) {
			this.externalId = externalId;
		}

		public Boolean getFromAliyun() {
			return this.fromAliyun;
		}

		public void setFromAliyun(Boolean fromAliyun) {
			this.fromAliyun = fromAliyun;
		}

		public String getFrontHost() {
			return this.frontHost;
		}

		public void setFrontHost(String frontHost) {
			this.frontHost = frontHost;
		}

		public String getGitlabPrefixMap() {
			return this.gitlabPrefixMap;
		}

		public void setGitlabPrefixMap(String gitlabPrefixMap) {
			this.gitlabPrefixMap = gitlabPrefixMap;
		}

		public String getGitLabSite() {
			return this.gitLabSite;
		}

		public void setGitLabSite(String gitLabSite) {
			this.gitLabSite = gitLabSite;
		}

		public Boolean getHaveNotInited() {
			return this.haveNotInited;
		}

		public void setHaveNotInited(Boolean haveNotInited) {
			this.haveNotInited = haveNotInited;
		}

		public Boolean getHighAvailabilityEnabled() {
			return this.highAvailabilityEnabled;
		}

		public void setHighAvailabilityEnabled(Boolean highAvailabilityEnabled) {
			this.highAvailabilityEnabled = highAvailabilityEnabled;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public Boolean getIndebt() {
			return this.indebt;
		}

		public void setIndebt(Boolean indebt) {
			this.indebt = indebt;
		}

		public String getInitStep() {
			return this.initStep;
		}

		public void setInitStep(String initStep) {
			this.initStep = initStep;
		}

		public Boolean getJarEnabled() {
			return this.jarEnabled;
		}

		public void setJarEnabled(Boolean jarEnabled) {
			this.jarEnabled = jarEnabled;
		}

		public Long getLastModified() {
			return this.lastModified;
		}

		public void setLastModified(Long lastModified) {
			this.lastModified = lastModified;
		}

		public Boolean getMergeRequestEnabled() {
			return this.mergeRequestEnabled;
		}

		public void setMergeRequestEnabled(Boolean mergeRequestEnabled) {
			this.mergeRequestEnabled = mergeRequestEnabled;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Boolean getOpenMyBankControl() {
			return this.openMyBankControl;
		}

		public void setOpenMyBankControl(Boolean openMyBankControl) {
			this.openMyBankControl = openMyBankControl;
		}

		public String getPath() {
			return this.path;
		}

		public void setPath(String path) {
			this.path = path;
		}

		public Boolean getReleaseControlEnabled() {
			return this.releaseControlEnabled;
		}

		public void setReleaseControlEnabled(Boolean releaseControlEnabled) {
			this.releaseControlEnabled = releaseControlEnabled;
		}

		public Boolean getShowNewPRParamer() {
			return this.showNewPRParamer;
		}

		public void setShowNewPRParamer(Boolean showNewPRParamer) {
			this.showNewPRParamer = showNewPRParamer;
		}

		public Boolean getUseConfigTypes() {
			return this.useConfigTypes;
		}

		public void setUseConfigTypes(Boolean useConfigTypes) {
			this.useConfigTypes = useConfigTypes;
		}

		public Boolean getUseNewAppReleaseShow() {
			return this.useNewAppReleaseShow;
		}

		public void setUseNewAppReleaseShow(Boolean useNewAppReleaseShow) {
			this.useNewAppReleaseShow = useNewAppReleaseShow;
		}

		public Boolean getUseNewCloudAppImportView() {
			return this.useNewCloudAppImportView;
		}

		public void setUseNewCloudAppImportView(Boolean useNewCloudAppImportView) {
			this.useNewCloudAppImportView = useNewCloudAppImportView;
		}

		public List<String> getAuthorizedUsers() {
			return this.authorizedUsers;
		}

		public void setAuthorizedUsers(List<String> authorizedUsers) {
			this.authorizedUsers = authorizedUsers;
		}

		public List<String> getConfigTypes() {
			return this.configTypes;
		}

		public void setConfigTypes(List<String> configTypes) {
			this.configTypes = configTypes;
		}

		public List<String> getSitMergeTrialList() {
			return this.sitMergeTrialList;
		}

		public void setSitMergeTrialList(List<String> sitMergeTrialList) {
			this.sitMergeTrialList = sitMergeTrialList;
		}

		public List<String> getTrialList() {
			return this.trialList;
		}

		public void setTrialList(List<String> trialList) {
			this.trialList = trialList;
		}

		public List<String> getZoneModeList() {
			return this.zoneModeList;
		}

		public void setZoneModeList(List<String> zoneModeList) {
			this.zoneModeList = zoneModeList;
		}
	}

	@Override
	public GetLinkeBahamutTenantgetbyexternalidResponse getInstance(UnmarshallerContext context) {
		return	GetLinkeBahamutTenantgetbyexternalidResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
