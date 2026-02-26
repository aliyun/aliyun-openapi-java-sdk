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

package com.aliyuncs.adcp.model.v20220101;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.adcp.transform.v20220101.DescribePolicyInstancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePolicyInstancesResponse extends AcsResponse {

	private String requestId;

	private List<Policy> policies;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Policy> getPolicies() {
		return this.policies;
	}

	public void setPolicies(List<Policy> policies) {
		this.policies = policies;
	}

	public static class Policy {

		private String policyName;

		private String instanceName;

		private String policyCategory;

		private String policyDescription;

		private String policySeverity;

		private String policyScope;

		private String policyAction;

		private Long totalViolations;

		private String clusterId;

		private Map<Object,Object> policyParameters;

		public String getPolicyName() {
			return this.policyName;
		}

		public void setPolicyName(String policyName) {
			this.policyName = policyName;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public String getPolicyCategory() {
			return this.policyCategory;
		}

		public void setPolicyCategory(String policyCategory) {
			this.policyCategory = policyCategory;
		}

		public String getPolicyDescription() {
			return this.policyDescription;
		}

		public void setPolicyDescription(String policyDescription) {
			this.policyDescription = policyDescription;
		}

		public String getPolicySeverity() {
			return this.policySeverity;
		}

		public void setPolicySeverity(String policySeverity) {
			this.policySeverity = policySeverity;
		}

		public String getPolicyScope() {
			return this.policyScope;
		}

		public void setPolicyScope(String policyScope) {
			this.policyScope = policyScope;
		}

		public String getPolicyAction() {
			return this.policyAction;
		}

		public void setPolicyAction(String policyAction) {
			this.policyAction = policyAction;
		}

		public Long getTotalViolations() {
			return this.totalViolations;
		}

		public void setTotalViolations(Long totalViolations) {
			this.totalViolations = totalViolations;
		}

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}

		public Map<Object,Object> getPolicyParameters() {
			return this.policyParameters;
		}

		public void setPolicyParameters(Map<Object,Object> policyParameters) {
			this.policyParameters = policyParameters;
		}
	}

	@Override
	public DescribePolicyInstancesResponse getInstance(UnmarshallerContext context) {
		return	DescribePolicyInstancesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
