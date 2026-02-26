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
import com.aliyuncs.oceanbasepro.transform.v20190901.DescribeTenantSecurityConfigsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeTenantSecurityConfigsResponse extends AcsResponse {

	private String requestId;

	private Configs configs;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Configs getConfigs() {
		return this.configs;
	}

	public void setConfigs(Configs configs) {
		this.configs = configs;
	}

	public static class Configs {

		private Integer totalCheckCount;

		private Integer totalRiskCount;

		private String checkId;

		private String instanceId;

		private String checkTime;

		private List<TenantSecurityConfigsItem> tenantSecurityConfigs;

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

		public String getCheckId() {
			return this.checkId;
		}

		public void setCheckId(String checkId) {
			this.checkId = checkId;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getCheckTime() {
			return this.checkTime;
		}

		public void setCheckTime(String checkTime) {
			this.checkTime = checkTime;
		}

		public List<TenantSecurityConfigsItem> getTenantSecurityConfigs() {
			return this.tenantSecurityConfigs;
		}

		public void setTenantSecurityConfigs(List<TenantSecurityConfigsItem> tenantSecurityConfigs) {
			this.tenantSecurityConfigs = tenantSecurityConfigs;
		}

		public static class TenantSecurityConfigsItem {

			private String tenantId;

			private String tenantName;

			private Integer riskCount;

			private List<SecurityConfigsItem> securityConfigs;

			public String getTenantId() {
				return this.tenantId;
			}

			public void setTenantId(String tenantId) {
				this.tenantId = tenantId;
			}

			public String getTenantName() {
				return this.tenantName;
			}

			public void setTenantName(String tenantName) {
				this.tenantName = tenantName;
			}

			public Integer getRiskCount() {
				return this.riskCount;
			}

			public void setRiskCount(Integer riskCount) {
				this.riskCount = riskCount;
			}

			public List<SecurityConfigsItem> getSecurityConfigs() {
				return this.securityConfigs;
			}

			public void setSecurityConfigs(List<SecurityConfigsItem> securityConfigs) {
				this.securityConfigs = securityConfigs;
			}

			public static class SecurityConfigsItem {

				private String configGroup;

				private String configName;

				private Boolean risk;

				private String riskDescription;

				private String configDescription;

				public String getConfigGroup() {
					return this.configGroup;
				}

				public void setConfigGroup(String configGroup) {
					this.configGroup = configGroup;
				}

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

				public String getConfigDescription() {
					return this.configDescription;
				}

				public void setConfigDescription(String configDescription) {
					this.configDescription = configDescription;
				}
			}
		}
	}

	@Override
	public DescribeTenantSecurityConfigsResponse getInstance(UnmarshallerContext context) {
		return	DescribeTenantSecurityConfigsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
