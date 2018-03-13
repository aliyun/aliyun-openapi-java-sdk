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
package com.aliyuncs.ram.model.v20150501;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ram.transform.v20150501.CreatePolicyVersionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreatePolicyVersionResponse extends AcsResponse {

	private String requestId;

	private PolicyVersion policyVersion;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public PolicyVersion getPolicyVersion() {
		return this.policyVersion;
	}

	public void setPolicyVersion(PolicyVersion policyVersion) {
		this.policyVersion = policyVersion;
	}

	public static class PolicyVersion {

		private String versionId;

		private Boolean isDefaultVersion;

		private String policyDocument;

		private String createDate;

		public String getVersionId() {
			return this.versionId;
		}

		public void setVersionId(String versionId) {
			this.versionId = versionId;
		}

		public Boolean getIsDefaultVersion() {
			return this.isDefaultVersion;
		}

		public void setIsDefaultVersion(Boolean isDefaultVersion) {
			this.isDefaultVersion = isDefaultVersion;
		}

		public String getPolicyDocument() {
			return this.policyDocument;
		}

		public void setPolicyDocument(String policyDocument) {
			this.policyDocument = policyDocument;
		}

		public String getCreateDate() {
			return this.createDate;
		}

		public void setCreateDate(String createDate) {
			this.createDate = createDate;
		}
	}

	@Override
	public CreatePolicyVersionResponse getInstance(UnmarshallerContext context) {
		return	CreatePolicyVersionResponseUnmarshaller.unmarshall(this, context);
	}
}
