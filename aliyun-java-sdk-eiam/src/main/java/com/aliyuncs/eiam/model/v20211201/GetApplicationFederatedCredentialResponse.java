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

package com.aliyuncs.eiam.model.v20211201;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.eiam.transform.v20211201.GetApplicationFederatedCredentialResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetApplicationFederatedCredentialResponse extends AcsResponse {

	private String requestId;

	private ApplicationFederatedCredential applicationFederatedCredential;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public ApplicationFederatedCredential getApplicationFederatedCredential() {
		return this.applicationFederatedCredential;
	}

	public void setApplicationFederatedCredential(ApplicationFederatedCredential applicationFederatedCredential) {
		this.applicationFederatedCredential = applicationFederatedCredential;
	}

	public static class ApplicationFederatedCredential {

		private String instanceId;

		private String applicationFederatedCredentialId;

		private String applicationId;

		private String federatedCredentialProviderId;

		private String applicationFederatedCredentialType;

		private String applicationFederatedCredentialName;

		private String status;

		private String description;

		private Long createTime;

		private Long updateTime;

		private Long lastUsedTime;

		private String verificationCondition;

		private List<AttributeMapping> attributeMappings;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getApplicationFederatedCredentialId() {
			return this.applicationFederatedCredentialId;
		}

		public void setApplicationFederatedCredentialId(String applicationFederatedCredentialId) {
			this.applicationFederatedCredentialId = applicationFederatedCredentialId;
		}

		public String getApplicationId() {
			return this.applicationId;
		}

		public void setApplicationId(String applicationId) {
			this.applicationId = applicationId;
		}

		public String getFederatedCredentialProviderId() {
			return this.federatedCredentialProviderId;
		}

		public void setFederatedCredentialProviderId(String federatedCredentialProviderId) {
			this.federatedCredentialProviderId = federatedCredentialProviderId;
		}

		public String getApplicationFederatedCredentialType() {
			return this.applicationFederatedCredentialType;
		}

		public void setApplicationFederatedCredentialType(String applicationFederatedCredentialType) {
			this.applicationFederatedCredentialType = applicationFederatedCredentialType;
		}

		public String getApplicationFederatedCredentialName() {
			return this.applicationFederatedCredentialName;
		}

		public void setApplicationFederatedCredentialName(String applicationFederatedCredentialName) {
			this.applicationFederatedCredentialName = applicationFederatedCredentialName;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public Long getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(Long updateTime) {
			this.updateTime = updateTime;
		}

		public Long getLastUsedTime() {
			return this.lastUsedTime;
		}

		public void setLastUsedTime(Long lastUsedTime) {
			this.lastUsedTime = lastUsedTime;
		}

		public String getVerificationCondition() {
			return this.verificationCondition;
		}

		public void setVerificationCondition(String verificationCondition) {
			this.verificationCondition = verificationCondition;
		}

		public List<AttributeMapping> getAttributeMappings() {
			return this.attributeMappings;
		}

		public void setAttributeMappings(List<AttributeMapping> attributeMappings) {
			this.attributeMappings = attributeMappings;
		}

		public static class AttributeMapping {

			private String sourceValueExpression;

			private String targetField;

			public String getSourceValueExpression() {
				return this.sourceValueExpression;
			}

			public void setSourceValueExpression(String sourceValueExpression) {
				this.sourceValueExpression = sourceValueExpression;
			}

			public String getTargetField() {
				return this.targetField;
			}

			public void setTargetField(String targetField) {
				this.targetField = targetField;
			}
		}
	}

	@Override
	public GetApplicationFederatedCredentialResponse getInstance(UnmarshallerContext context) {
		return	GetApplicationFederatedCredentialResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
