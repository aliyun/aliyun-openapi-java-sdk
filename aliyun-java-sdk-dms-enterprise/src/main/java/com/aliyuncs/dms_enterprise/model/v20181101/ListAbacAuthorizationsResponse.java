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

package com.aliyuncs.dms_enterprise.model.v20181101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dms_enterprise.transform.v20181101.ListAbacAuthorizationsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAbacAuthorizationsResponse extends AcsResponse {

	private String requestId;

	private String errorCode;

	private String errorMessage;

	private Boolean success;

	private Long totalCount;

	private List<AuthorizationListItem> authorizationList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public List<AuthorizationListItem> getAuthorizationList() {
		return this.authorizationList;
	}

	public void setAuthorizationList(List<AuthorizationListItem> authorizationList) {
		this.authorizationList = authorizationList;
	}

	public static class AuthorizationListItem {

		private Long policyId;

		private String policyName;

		private String policySource;

		private Long authorizationId;

		private Long identityId;

		private String identityName;

		private String identityType;

		public Long getPolicyId() {
			return this.policyId;
		}

		public void setPolicyId(Long policyId) {
			this.policyId = policyId;
		}

		public String getPolicyName() {
			return this.policyName;
		}

		public void setPolicyName(String policyName) {
			this.policyName = policyName;
		}

		public String getPolicySource() {
			return this.policySource;
		}

		public void setPolicySource(String policySource) {
			this.policySource = policySource;
		}

		public Long getAuthorizationId() {
			return this.authorizationId;
		}

		public void setAuthorizationId(Long authorizationId) {
			this.authorizationId = authorizationId;
		}

		public Long getIdentityId() {
			return this.identityId;
		}

		public void setIdentityId(Long identityId) {
			this.identityId = identityId;
		}

		public String getIdentityName() {
			return this.identityName;
		}

		public void setIdentityName(String identityName) {
			this.identityName = identityName;
		}

		public String getIdentityType() {
			return this.identityType;
		}

		public void setIdentityType(String identityType) {
			this.identityType = identityType;
		}
	}

	@Override
	public ListAbacAuthorizationsResponse getInstance(UnmarshallerContext context) {
		return	ListAbacAuthorizationsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
