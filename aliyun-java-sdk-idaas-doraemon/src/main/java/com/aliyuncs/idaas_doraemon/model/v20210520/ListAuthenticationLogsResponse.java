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

package com.aliyuncs.idaas_doraemon.model.v20210520;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.idaas_doraemon.transform.v20210520.ListAuthenticationLogsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAuthenticationLogsResponse extends AcsResponse {

	private String requestId;

	private Long totalCount;

	private Long pageNumber;

	private Long pageSize;

	private List<AuthenticationLogContentItem> authenticationLogContent;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public List<AuthenticationLogContentItem> getAuthenticationLogContent() {
		return this.authenticationLogContent;
	}

	public void setAuthenticationLogContent(List<AuthenticationLogContentItem> authenticationLogContent) {
		this.authenticationLogContent = authenticationLogContent;
	}

	public static class AuthenticationLogContentItem {

		private String tenantId;

		private String aliUid;

		private String applicationUuid;

		private String applicationExternalId;

		private String userId;

		private String authenticatorUuid;

		private String authenticatorName;

		private String credentialId;

		private String authenticatorType;

		private String authenticationAction;

		private String challengeBase64;

		private Long authenticationTime;

		private String userAgent;

		private String userSourceIp;

		private String rawAuthenticationContext;

		private Boolean verifyResult;

		private String errorCode;

		private String errorMessage;

		private String logTag;

		private String logParams;

		public String getTenantId() {
			return this.tenantId;
		}

		public void setTenantId(String tenantId) {
			this.tenantId = tenantId;
		}

		public String getAliUid() {
			return this.aliUid;
		}

		public void setAliUid(String aliUid) {
			this.aliUid = aliUid;
		}

		public String getApplicationUuid() {
			return this.applicationUuid;
		}

		public void setApplicationUuid(String applicationUuid) {
			this.applicationUuid = applicationUuid;
		}

		public String getApplicationExternalId() {
			return this.applicationExternalId;
		}

		public void setApplicationExternalId(String applicationExternalId) {
			this.applicationExternalId = applicationExternalId;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getAuthenticatorUuid() {
			return this.authenticatorUuid;
		}

		public void setAuthenticatorUuid(String authenticatorUuid) {
			this.authenticatorUuid = authenticatorUuid;
		}

		public String getAuthenticatorName() {
			return this.authenticatorName;
		}

		public void setAuthenticatorName(String authenticatorName) {
			this.authenticatorName = authenticatorName;
		}

		public String getCredentialId() {
			return this.credentialId;
		}

		public void setCredentialId(String credentialId) {
			this.credentialId = credentialId;
		}

		public String getAuthenticatorType() {
			return this.authenticatorType;
		}

		public void setAuthenticatorType(String authenticatorType) {
			this.authenticatorType = authenticatorType;
		}

		public String getAuthenticationAction() {
			return this.authenticationAction;
		}

		public void setAuthenticationAction(String authenticationAction) {
			this.authenticationAction = authenticationAction;
		}

		public String getChallengeBase64() {
			return this.challengeBase64;
		}

		public void setChallengeBase64(String challengeBase64) {
			this.challengeBase64 = challengeBase64;
		}

		public Long getAuthenticationTime() {
			return this.authenticationTime;
		}

		public void setAuthenticationTime(Long authenticationTime) {
			this.authenticationTime = authenticationTime;
		}

		public String getUserAgent() {
			return this.userAgent;
		}

		public void setUserAgent(String userAgent) {
			this.userAgent = userAgent;
		}

		public String getUserSourceIp() {
			return this.userSourceIp;
		}

		public void setUserSourceIp(String userSourceIp) {
			this.userSourceIp = userSourceIp;
		}

		public String getRawAuthenticationContext() {
			return this.rawAuthenticationContext;
		}

		public void setRawAuthenticationContext(String rawAuthenticationContext) {
			this.rawAuthenticationContext = rawAuthenticationContext;
		}

		public Boolean getVerifyResult() {
			return this.verifyResult;
		}

		public void setVerifyResult(Boolean verifyResult) {
			this.verifyResult = verifyResult;
		}

		public String getErrorCode() {
			return this.errorCode;
		}

		public void setErrorCode(String errorCode) {
			this.errorCode = errorCode;
		}

		public String getErrorMessage() {
			return this.errorMessage;
		}

		public void setErrorMessage(String errorMessage) {
			this.errorMessage = errorMessage;
		}

		public String getLogTag() {
			return this.logTag;
		}

		public void setLogTag(String logTag) {
			this.logTag = logTag;
		}

		public String getLogParams() {
			return this.logParams;
		}

		public void setLogParams(String logParams) {
			this.logParams = logParams;
		}
	}

	@Override
	public ListAuthenticationLogsResponse getInstance(UnmarshallerContext context) {
		return	ListAuthenticationLogsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
