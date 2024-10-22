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

package com.aliyuncs.eais.model.v20190624;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.eais.transform.v20190624.StopEaiJupyterResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class StopEaiJupyterResponse extends AcsResponse {

	private String requestId;

	private AccessDeniedDetail accessDeniedDetail;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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
	public StopEaiJupyterResponse getInstance(UnmarshallerContext context) {
		return	StopEaiJupyterResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
