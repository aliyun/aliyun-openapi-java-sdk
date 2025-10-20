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
import com.aliyuncs.eiam.transform.v20211201.ListApplicationFederatedCredentialsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListApplicationFederatedCredentialsResponse extends AcsResponse {

	private String requestId;

	private Long totalCount;

	private String nextToken;

	private String previousToken;

	private Integer maxResults;

	private List<ApplicationFederatedCredential> applicationFederatedCredentials;

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

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public String getPreviousToken() {
		return this.previousToken;
	}

	public void setPreviousToken(String previousToken) {
		this.previousToken = previousToken;
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public List<ApplicationFederatedCredential> getApplicationFederatedCredentials() {
		return this.applicationFederatedCredentials;
	}

	public void setApplicationFederatedCredentials(List<ApplicationFederatedCredential> applicationFederatedCredentials) {
		this.applicationFederatedCredentials = applicationFederatedCredentials;
	}

	public static class ApplicationFederatedCredential {

		private String status;

		private String description;

		private String instanceId;

		private String applicationFederatedCredentialType;

		private Long createTime;

		private Long lastUsedTime;

		private Long updateTime;

		private String applicationFederatedCredentialName;

		private String applicationId;

		private String federatedCredentialProviderId;

		private String applicationFederatedCredentialId;

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

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getApplicationFederatedCredentialType() {
			return this.applicationFederatedCredentialType;
		}

		public void setApplicationFederatedCredentialType(String applicationFederatedCredentialType) {
			this.applicationFederatedCredentialType = applicationFederatedCredentialType;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public Long getLastUsedTime() {
			return this.lastUsedTime;
		}

		public void setLastUsedTime(Long lastUsedTime) {
			this.lastUsedTime = lastUsedTime;
		}

		public Long getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(Long updateTime) {
			this.updateTime = updateTime;
		}

		public String getApplicationFederatedCredentialName() {
			return this.applicationFederatedCredentialName;
		}

		public void setApplicationFederatedCredentialName(String applicationFederatedCredentialName) {
			this.applicationFederatedCredentialName = applicationFederatedCredentialName;
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

		public String getApplicationFederatedCredentialId() {
			return this.applicationFederatedCredentialId;
		}

		public void setApplicationFederatedCredentialId(String applicationFederatedCredentialId) {
			this.applicationFederatedCredentialId = applicationFederatedCredentialId;
		}
	}

	@Override
	public ListApplicationFederatedCredentialsResponse getInstance(UnmarshallerContext context) {
		return	ListApplicationFederatedCredentialsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
