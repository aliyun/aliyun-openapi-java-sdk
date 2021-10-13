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
import com.aliyuncs.idaas_doraemon.transform.v20210520.ListAuthenticatorsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAuthenticatorsResponse extends AcsResponse {

	private String requestId;

	private Long pageNumber;

	private Long totalCount;

	private Long pageSize;

	private List<AuthenticatorListDTO> authenticator;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public List<AuthenticatorListDTO> getAuthenticator() {
		return this.authenticator;
	}

	public void setAuthenticator(List<AuthenticatorListDTO> authenticator) {
		this.authenticator = authenticator;
	}

	public static class AuthenticatorListDTO {

		private String applicationExternalId;

		private String authenticatorUuid;

		private String credentialId;

		private String type;

		private String authenticatorName;

		private Long registerTime;

		private Long lastVerifyTime;

		public String getApplicationExternalId() {
			return this.applicationExternalId;
		}

		public void setApplicationExternalId(String applicationExternalId) {
			this.applicationExternalId = applicationExternalId;
		}

		public String getAuthenticatorUuid() {
			return this.authenticatorUuid;
		}

		public void setAuthenticatorUuid(String authenticatorUuid) {
			this.authenticatorUuid = authenticatorUuid;
		}

		public String getCredentialId() {
			return this.credentialId;
		}

		public void setCredentialId(String credentialId) {
			this.credentialId = credentialId;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getAuthenticatorName() {
			return this.authenticatorName;
		}

		public void setAuthenticatorName(String authenticatorName) {
			this.authenticatorName = authenticatorName;
		}

		public Long getRegisterTime() {
			return this.registerTime;
		}

		public void setRegisterTime(Long registerTime) {
			this.registerTime = registerTime;
		}

		public Long getLastVerifyTime() {
			return this.lastVerifyTime;
		}

		public void setLastVerifyTime(Long lastVerifyTime) {
			this.lastVerifyTime = lastVerifyTime;
		}
	}

	@Override
	public ListAuthenticatorsResponse getInstance(UnmarshallerContext context) {
		return	ListAuthenticatorsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
