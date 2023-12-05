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

package com.aliyuncs.alb.model.v20200616;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.alb.transform.v20200616.ListSecurityPoliciesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListSecurityPoliciesResponse extends AcsResponse {

	private Integer maxResults;

	private String nextToken;

	private String requestId;

	private Integer totalCount;

	private List<SecurityPolicy> securityPolicies;

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<SecurityPolicy> getSecurityPolicies() {
		return this.securityPolicies;
	}

	public void setSecurityPolicies(List<SecurityPolicy> securityPolicies) {
		this.securityPolicies = securityPolicies;
	}

	public static class SecurityPolicy {

		private String resourceGroupId;

		private String securityPolicyId;

		private String securityPolicyName;

		private String securityPolicyStatus;

		private Boolean serviceManagedEnabled;

		private String serviceManagedMode;

		private String createTime;

		private List<Tag> tags;

		private List<String> ciphers;

		private List<String> tLSVersions;

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public String getSecurityPolicyId() {
			return this.securityPolicyId;
		}

		public void setSecurityPolicyId(String securityPolicyId) {
			this.securityPolicyId = securityPolicyId;
		}

		public String getSecurityPolicyName() {
			return this.securityPolicyName;
		}

		public void setSecurityPolicyName(String securityPolicyName) {
			this.securityPolicyName = securityPolicyName;
		}

		public String getSecurityPolicyStatus() {
			return this.securityPolicyStatus;
		}

		public void setSecurityPolicyStatus(String securityPolicyStatus) {
			this.securityPolicyStatus = securityPolicyStatus;
		}

		public Boolean getServiceManagedEnabled() {
			return this.serviceManagedEnabled;
		}

		public void setServiceManagedEnabled(Boolean serviceManagedEnabled) {
			this.serviceManagedEnabled = serviceManagedEnabled;
		}

		public String getServiceManagedMode() {
			return this.serviceManagedMode;
		}

		public void setServiceManagedMode(String serviceManagedMode) {
			this.serviceManagedMode = serviceManagedMode;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public List<String> getCiphers() {
			return this.ciphers;
		}

		public void setCiphers(List<String> ciphers) {
			this.ciphers = ciphers;
		}

		public List<String> getTLSVersions() {
			return this.tLSVersions;
		}

		public void setTLSVersions(List<String> tLSVersions) {
			this.tLSVersions = tLSVersions;
		}

		public static class Tag {

			private String key;

			private String value;

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}
		}
	}

	@Override
	public ListSecurityPoliciesResponse getInstance(UnmarshallerContext context) {
		return	ListSecurityPoliciesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
