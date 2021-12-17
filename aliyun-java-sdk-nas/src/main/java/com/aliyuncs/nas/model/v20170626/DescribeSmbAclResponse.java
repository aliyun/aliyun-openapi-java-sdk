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

package com.aliyuncs.nas.model.v20170626;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.nas.transform.v20170626.DescribeSmbAclResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSmbAclResponse extends AcsResponse {

	private String requestId;

	private Acl acl;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Acl getAcl() {
		return this.acl;
	}

	public void setAcl(Acl acl) {
		this.acl = acl;
	}

	public static class Acl {

		private String authMethod;

		private Boolean enableAnonymousAccess;

		private Boolean enabled;

		private Boolean encryptData;

		private Boolean rejectUnencryptedAccess;

		private String superAdminSid;

		private String homeDirPath;

		public String getAuthMethod() {
			return this.authMethod;
		}

		public void setAuthMethod(String authMethod) {
			this.authMethod = authMethod;
		}

		public Boolean getEnableAnonymousAccess() {
			return this.enableAnonymousAccess;
		}

		public void setEnableAnonymousAccess(Boolean enableAnonymousAccess) {
			this.enableAnonymousAccess = enableAnonymousAccess;
		}

		public Boolean getEnabled() {
			return this.enabled;
		}

		public void setEnabled(Boolean enabled) {
			this.enabled = enabled;
		}

		public Boolean getEncryptData() {
			return this.encryptData;
		}

		public void setEncryptData(Boolean encryptData) {
			this.encryptData = encryptData;
		}

		public Boolean getRejectUnencryptedAccess() {
			return this.rejectUnencryptedAccess;
		}

		public void setRejectUnencryptedAccess(Boolean rejectUnencryptedAccess) {
			this.rejectUnencryptedAccess = rejectUnencryptedAccess;
		}

		public String getSuperAdminSid() {
			return this.superAdminSid;
		}

		public void setSuperAdminSid(String superAdminSid) {
			this.superAdminSid = superAdminSid;
		}

		public String getHomeDirPath() {
			return this.homeDirPath;
		}

		public void setHomeDirPath(String homeDirPath) {
			this.homeDirPath = homeDirPath;
		}
	}

	@Override
	public DescribeSmbAclResponse getInstance(UnmarshallerContext context) {
		return	DescribeSmbAclResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
