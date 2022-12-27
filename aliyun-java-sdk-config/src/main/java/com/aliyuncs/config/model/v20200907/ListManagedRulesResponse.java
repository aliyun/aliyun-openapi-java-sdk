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
import com.aliyuncs.config.transform.v20200907.ListManagedRulesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListManagedRulesResponse extends AcsResponse {

	private String requestId;

	private ManagedRules managedRules;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public ManagedRules getManagedRules() {
		return this.managedRules;
	}

	public void setManagedRules(ManagedRules managedRules) {
		this.managedRules = managedRules;
	}

	public static class ManagedRules {

		private Integer pageSize;

		private Integer pageNumber;

		private Long totalCount;

		private List<ManagedRule> managedRuleList;

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

		public Long getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Long totalCount) {
			this.totalCount = totalCount;
		}

		public List<ManagedRule> getManagedRuleList() {
			return this.managedRuleList;
		}

		public void setManagedRuleList(List<ManagedRule> managedRuleList) {
			this.managedRuleList = managedRuleList;
		}

		public static class ManagedRule {

			private Integer riskLevel;

			private String description;

			private String useCases;

			private String identifier;

			private String configRuleName;

			private Integer referenceCount;

			private String helpUrls;

			private List<String> labels;

			public Integer getRiskLevel() {
				return this.riskLevel;
			}

			public void setRiskLevel(Integer riskLevel) {
				this.riskLevel = riskLevel;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getUseCases() {
				return this.useCases;
			}

			public void setUseCases(String useCases) {
				this.useCases = useCases;
			}

			public String getIdentifier() {
				return this.identifier;
			}

			public void setIdentifier(String identifier) {
				this.identifier = identifier;
			}

			public String getConfigRuleName() {
				return this.configRuleName;
			}

			public void setConfigRuleName(String configRuleName) {
				this.configRuleName = configRuleName;
			}

			public Integer getReferenceCount() {
				return this.referenceCount;
			}

			public void setReferenceCount(Integer referenceCount) {
				this.referenceCount = referenceCount;
			}

			public String getHelpUrls() {
				return this.helpUrls;
			}

			public void setHelpUrls(String helpUrls) {
				this.helpUrls = helpUrls;
			}

			public List<String> getLabels() {
				return this.labels;
			}

			public void setLabels(List<String> labels) {
				this.labels = labels;
			}
		}
	}

	@Override
	public ListManagedRulesResponse getInstance(UnmarshallerContext context) {
		return	ListManagedRulesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
