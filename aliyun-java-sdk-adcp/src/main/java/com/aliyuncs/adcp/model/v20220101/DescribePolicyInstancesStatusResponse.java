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
import com.aliyuncs.AcsResponse;
import com.aliyuncs.adcp.transform.v20220101.DescribePolicyInstancesStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePolicyInstancesStatusResponse extends AcsResponse {

	private String requestId;

	private Policies policies;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Policies getPolicies() {
		return this.policies;
	}

	public void setPolicies(Policies policies) {
		this.policies = policies;
	}

	public static class Policies {

		private List<PolicyInstance> policyInstances;

		private List<SeverityInfoItem> severityInfo;

		public List<PolicyInstance> getPolicyInstances() {
			return this.policyInstances;
		}

		public void setPolicyInstances(List<PolicyInstance> policyInstances) {
			this.policyInstances = policyInstances;
		}

		public List<SeverityInfoItem> getSeverityInfo() {
			return this.severityInfo;
		}

		public void setSeverityInfo(List<SeverityInfoItem> severityInfo) {
			this.severityInfo = severityInfo;
		}

		public static class PolicyInstance {

			private String policyName;

			private String policyCategory;

			private String policyDescription;

			private String policySeverity;

			private Long policyInstancesCount;

			private List<PolicyCluster> policyClusters;

			public String getPolicyName() {
				return this.policyName;
			}

			public void setPolicyName(String policyName) {
				this.policyName = policyName;
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

			public Long getPolicyInstancesCount() {
				return this.policyInstancesCount;
			}

			public void setPolicyInstancesCount(Long policyInstancesCount) {
				this.policyInstancesCount = policyInstancesCount;
			}

			public List<PolicyCluster> getPolicyClusters() {
				return this.policyClusters;
			}

			public void setPolicyClusters(List<PolicyCluster> policyClusters) {
				this.policyClusters = policyClusters;
			}

			public static class PolicyCluster {

				private String clusterId;

				private String status;

				public String getClusterId() {
					return this.clusterId;
				}

				public void setClusterId(String clusterId) {
					this.clusterId = clusterId;
				}

				public String getStatus() {
					return this.status;
				}

				public void setStatus(String status) {
					this.status = status;
				}
			}
		}

		public static class SeverityInfoItem {

			private String severityType;

			private String severityCount;

			public String getSeverityType() {
				return this.severityType;
			}

			public void setSeverityType(String severityType) {
				this.severityType = severityType;
			}

			public String getSeverityCount() {
				return this.severityCount;
			}

			public void setSeverityCount(String severityCount) {
				this.severityCount = severityCount;
			}
		}
	}

	@Override
	public DescribePolicyInstancesStatusResponse getInstance(UnmarshallerContext context) {
		return	DescribePolicyInstancesStatusResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
