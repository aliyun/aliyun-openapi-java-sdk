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

package com.aliyuncs.oceanbasepro.model.v20190901;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.oceanbasepro.transform.v20190901.DescribeInstanceSecurityConfigsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeInstanceSecurityConfigsResponse extends AcsResponse {

	private String requestId;

	private InstanceSecurityConfigs instanceSecurityConfigs;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public InstanceSecurityConfigs getInstanceSecurityConfigs() {
		return this.instanceSecurityConfigs;
	}

	public void setInstanceSecurityConfigs(InstanceSecurityConfigs instanceSecurityConfigs) {
		this.instanceSecurityConfigs = instanceSecurityConfigs;
	}

	public static class InstanceSecurityConfigs {

		private Integer totalCheckCount;

		private Integer totalRiskCount;

		private List<SecurityConfigsItem> securityConfigs;

		public Integer getTotalCheckCount() {
			return this.totalCheckCount;
		}

		public void setTotalCheckCount(Integer totalCheckCount) {
			this.totalCheckCount = totalCheckCount;
		}

		public Integer getTotalRiskCount() {
			return this.totalRiskCount;
		}

		public void setTotalRiskCount(Integer totalRiskCount) {
			this.totalRiskCount = totalRiskCount;
		}

		public List<SecurityConfigsItem> getSecurityConfigs() {
			return this.securityConfigs;
		}

		public void setSecurityConfigs(List<SecurityConfigsItem> securityConfigs) {
			this.securityConfigs = securityConfigs;
		}

		public static class SecurityConfigsItem {

			private String configName;

			private Boolean risk;

			private String riskDescription;

			private String configGroup;

			private String configDescription;

			public String getConfigName() {
				return this.configName;
			}

			public void setConfigName(String configName) {
				this.configName = configName;
			}

			public Boolean getRisk() {
				return this.risk;
			}

			public void setRisk(Boolean risk) {
				this.risk = risk;
			}

			public String getRiskDescription() {
				return this.riskDescription;
			}

			public void setRiskDescription(String riskDescription) {
				this.riskDescription = riskDescription;
			}

			public String getConfigGroup() {
				return this.configGroup;
			}

			public void setConfigGroup(String configGroup) {
				this.configGroup = configGroup;
			}

			public String getConfigDescription() {
				return this.configDescription;
			}

			public void setConfigDescription(String configDescription) {
				this.configDescription = configDescription;
			}
		}
	}

	@Override
	public DescribeInstanceSecurityConfigsResponse getInstance(UnmarshallerContext context) {
		return	DescribeInstanceSecurityConfigsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
