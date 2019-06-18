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
import com.aliyuncs.ram.transform.v20150501.GetPolicyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetPolicyResponse extends AcsResponse {

	private String requestId;

	private Policy policy;

	private DefaultPolicyVersion defaultPolicyVersion;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Policy getPolicy() {
		return this.policy;
	}

	public void setPolicy(Policy policy) {
		this.policy = policy;
	}

	public DefaultPolicyVersion getDefaultPolicyVersion() {
		return this.defaultPolicyVersion;
	}

	public void setDefaultPolicyVersion(DefaultPolicyVersion defaultPolicyVersion) {
		this.defaultPolicyVersion = defaultPolicyVersion;
	}

	public static class Policy {

		private String policyName;

		private String policyType;

		private String description;

		private String defaultVersion;

		private String policyDocument;

		private String createDate;

		private String updateDate;

		private Integer attachmentCount;

		public String getPolicyName() {
			return this.policyName;
		}

		public void setPolicyName(String policyName) {
			this.policyName = policyName;
		}

		public String getPolicyType() {
			return this.policyType;
		}

		public void setPolicyType(String policyType) {
			this.policyType = policyType;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getDefaultVersion() {
			return this.defaultVersion;
		}

		public void setDefaultVersion(String defaultVersion) {
			this.defaultVersion = defaultVersion;
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

		public String getUpdateDate() {
			return this.updateDate;
		}

		public void setUpdateDate(String updateDate) {
			this.updateDate = updateDate;
		}

		public Integer getAttachmentCount() {
			return this.attachmentCount;
		}

		public void setAttachmentCount(Integer attachmentCount) {
			this.attachmentCount = attachmentCount;
		}
	}

	public static class DefaultPolicyVersion {

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
	public GetPolicyResponse getInstance(UnmarshallerContext context) {
		return	GetPolicyResponseUnmarshaller.unmarshall(this, context);
	}
}
