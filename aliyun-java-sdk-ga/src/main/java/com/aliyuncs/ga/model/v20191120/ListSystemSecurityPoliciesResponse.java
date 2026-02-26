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

package com.aliyuncs.ga.model.v20191120;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ga.transform.v20191120.ListSystemSecurityPoliciesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListSystemSecurityPoliciesResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageSize;

	private Integer pageNumber;

	private List<SecurityPoliciesItem> securityPolicies;

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

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<SecurityPoliciesItem> getSecurityPolicies() {
		return this.securityPolicies;
	}

	public void setSecurityPolicies(List<SecurityPoliciesItem> securityPolicies) {
		this.securityPolicies = securityPolicies;
	}

	public static class SecurityPoliciesItem {

		private String securityPolicyId;

		private List<String> tlsVersions;

		private List<String> ciphers;

		public String getSecurityPolicyId() {
			return this.securityPolicyId;
		}

		public void setSecurityPolicyId(String securityPolicyId) {
			this.securityPolicyId = securityPolicyId;
		}

		public List<String> getTlsVersions() {
			return this.tlsVersions;
		}

		public void setTlsVersions(List<String> tlsVersions) {
			this.tlsVersions = tlsVersions;
		}

		public List<String> getCiphers() {
			return this.ciphers;
		}

		public void setCiphers(List<String> ciphers) {
			this.ciphers = ciphers;
		}
	}

	@Override
	public ListSystemSecurityPoliciesResponse getInstance(UnmarshallerContext context) {
		return	ListSystemSecurityPoliciesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
