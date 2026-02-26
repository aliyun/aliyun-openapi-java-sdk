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

package com.aliyuncs.onsmqtt.model.v20200420;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.onsmqtt.transform.v20200420.SetSniConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class SetSniConfigResponse extends AcsResponse {

	private String requestId;

	private String success;

	private AccessDeniedDetail accessDeniedDetail;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public AccessDeniedDetail getAccessDeniedDetail() {
		return this.accessDeniedDetail;
	}

	public void setAccessDeniedDetail(AccessDeniedDetail accessDeniedDetail) {
		this.accessDeniedDetail = accessDeniedDetail;
	}

	public static class AccessDeniedDetail {

		private String authAction;

		private String authPrincipalDisplayName;

		private String authPrincipalOwnerId;

		private String authPrincipalType;

		private String encodedDiagnosticMessage;

		private String noPermissionType;

		private String policyType;

		public String getAuthAction() {
			return this.authAction;
		}

		public void setAuthAction(String authAction) {
			this.authAction = authAction;
		}

		public String getAuthPrincipalDisplayName() {
			return this.authPrincipalDisplayName;
		}

		public void setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
			this.authPrincipalDisplayName = authPrincipalDisplayName;
		}

		public String getAuthPrincipalOwnerId() {
			return this.authPrincipalOwnerId;
		}

		public void setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
			this.authPrincipalOwnerId = authPrincipalOwnerId;
		}

		public String getAuthPrincipalType() {
			return this.authPrincipalType;
		}

		public void setAuthPrincipalType(String authPrincipalType) {
			this.authPrincipalType = authPrincipalType;
		}

		public String getEncodedDiagnosticMessage() {
			return this.encodedDiagnosticMessage;
		}

		public void setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
			this.encodedDiagnosticMessage = encodedDiagnosticMessage;
		}

		public String getNoPermissionType() {
			return this.noPermissionType;
		}

		public void setNoPermissionType(String noPermissionType) {
			this.noPermissionType = noPermissionType;
		}

		public String getPolicyType() {
			return this.policyType;
		}

		public void setPolicyType(String policyType) {
			this.policyType = policyType;
		}
	}

	@Override
	public SetSniConfigResponse getInstance(UnmarshallerContext context) {
		return	SetSniConfigResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
