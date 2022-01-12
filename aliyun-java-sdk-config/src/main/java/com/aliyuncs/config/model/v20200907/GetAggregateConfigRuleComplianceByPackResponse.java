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

package com.aliyuncs.config.model.v20200907;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.config.transform.v20200907.GetAggregateConfigRuleComplianceByPackResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAggregateConfigRuleComplianceByPackResponse extends AcsResponse {

	private String requestId;

	private ConfigRuleComplianceResult configRuleComplianceResult;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public ConfigRuleComplianceResult getConfigRuleComplianceResult() {
		return this.configRuleComplianceResult;
	}

	public void setConfigRuleComplianceResult(ConfigRuleComplianceResult configRuleComplianceResult) {
		this.configRuleComplianceResult = configRuleComplianceResult;
	}

	public static class ConfigRuleComplianceResult {

		private String compliancePackId;

		private Integer nonCompliantCount;

		private Integer totalCount;

		private List<ConfigRuleCompliancesItem> configRuleCompliances;

		public String getCompliancePackId() {
			return this.compliancePackId;
		}

		public void setCompliancePackId(String compliancePackId) {
			this.compliancePackId = compliancePackId;
		}

		public Integer getNonCompliantCount() {
			return this.nonCompliantCount;
		}

		public void setNonCompliantCount(Integer nonCompliantCount) {
			this.nonCompliantCount = nonCompliantCount;
		}

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public List<ConfigRuleCompliancesItem> getConfigRuleCompliances() {
			return this.configRuleCompliances;
		}

		public void setConfigRuleCompliances(List<ConfigRuleCompliancesItem> configRuleCompliances) {
			this.configRuleCompliances = configRuleCompliances;
		}

		public static class ConfigRuleCompliancesItem {

			private String complianceType;

			private String configRuleName;

			private String configRuleId;

			public String getComplianceType() {
				return this.complianceType;
			}

			public void setComplianceType(String complianceType) {
				this.complianceType = complianceType;
			}

			public String getConfigRuleName() {
				return this.configRuleName;
			}

			public void setConfigRuleName(String configRuleName) {
				this.configRuleName = configRuleName;
			}

			public String getConfigRuleId() {
				return this.configRuleId;
			}

			public void setConfigRuleId(String configRuleId) {
				this.configRuleId = configRuleId;
			}
		}
	}

	@Override
	public GetAggregateConfigRuleComplianceByPackResponse getInstance(UnmarshallerContext context) {
		return	GetAggregateConfigRuleComplianceByPackResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
