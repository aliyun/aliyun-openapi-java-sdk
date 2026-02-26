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
import com.aliyuncs.eiam.transform.v20211201.ListCustomPrivacyPoliciesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListCustomPrivacyPoliciesResponse extends AcsResponse {

	private String requestId;

	private Long totalCount;

	private String nextToken;

	private String previousToken;

	private Long maxResults;

	private List<CustomPrivacyPolicy> customPrivacyPolicies;

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

	public Long getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Long maxResults) {
		this.maxResults = maxResults;
	}

	public List<CustomPrivacyPolicy> getCustomPrivacyPolicies() {
		return this.customPrivacyPolicies;
	}

	public void setCustomPrivacyPolicies(List<CustomPrivacyPolicy> customPrivacyPolicies) {
		this.customPrivacyPolicies = customPrivacyPolicies;
	}

	public static class CustomPrivacyPolicy {

		private String instanceId;

		private String customPrivacyPolicyId;

		private String customPrivacyPolicyName;

		private String status;

		private String userConsentType;

		private String defaultLanguageCode;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getCustomPrivacyPolicyId() {
			return this.customPrivacyPolicyId;
		}

		public void setCustomPrivacyPolicyId(String customPrivacyPolicyId) {
			this.customPrivacyPolicyId = customPrivacyPolicyId;
		}

		public String getCustomPrivacyPolicyName() {
			return this.customPrivacyPolicyName;
		}

		public void setCustomPrivacyPolicyName(String customPrivacyPolicyName) {
			this.customPrivacyPolicyName = customPrivacyPolicyName;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getUserConsentType() {
			return this.userConsentType;
		}

		public void setUserConsentType(String userConsentType) {
			this.userConsentType = userConsentType;
		}

		public String getDefaultLanguageCode() {
			return this.defaultLanguageCode;
		}

		public void setDefaultLanguageCode(String defaultLanguageCode) {
			this.defaultLanguageCode = defaultLanguageCode;
		}
	}

	@Override
	public ListCustomPrivacyPoliciesResponse getInstance(UnmarshallerContext context) {
		return	ListCustomPrivacyPoliciesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
