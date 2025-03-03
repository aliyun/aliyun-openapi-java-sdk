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

package com.aliyuncs.resourcemanager.model.v20200331;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.resourcemanager.transform.v20200331.ListAutoGroupingRulesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAutoGroupingRulesResponse extends AcsResponse {

	private String nextToken;

	private Integer maxResults;

	private String requestId;

	private List<Rule> rules;

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Rule> getRules() {
		return this.rules;
	}

	public void setRules(List<Rule> rules) {
		this.rules = rules;
	}

	public static class Rule {

		private String createTime;

		private String excludeRegionIdsScope;

		private String excludeResourceGroupIdsScope;

		private String excludeResourceIdsScope;

		private String excludeResourceTypesScope;

		private String modifyTime;

		private String regionIdsScope;

		private String resourceGroupIdsScope;

		private String resourceIdsScope;

		private String resourceTypesScope;

		private String ruleDesc;

		private String ruleId;

		private String ruleName;

		private String ruleType;

		private List<RuleContent> ruleContents;

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getExcludeRegionIdsScope() {
			return this.excludeRegionIdsScope;
		}

		public void setExcludeRegionIdsScope(String excludeRegionIdsScope) {
			this.excludeRegionIdsScope = excludeRegionIdsScope;
		}

		public String getExcludeResourceGroupIdsScope() {
			return this.excludeResourceGroupIdsScope;
		}

		public void setExcludeResourceGroupIdsScope(String excludeResourceGroupIdsScope) {
			this.excludeResourceGroupIdsScope = excludeResourceGroupIdsScope;
		}

		public String getExcludeResourceIdsScope() {
			return this.excludeResourceIdsScope;
		}

		public void setExcludeResourceIdsScope(String excludeResourceIdsScope) {
			this.excludeResourceIdsScope = excludeResourceIdsScope;
		}

		public String getExcludeResourceTypesScope() {
			return this.excludeResourceTypesScope;
		}

		public void setExcludeResourceTypesScope(String excludeResourceTypesScope) {
			this.excludeResourceTypesScope = excludeResourceTypesScope;
		}

		public String getModifyTime() {
			return this.modifyTime;
		}

		public void setModifyTime(String modifyTime) {
			this.modifyTime = modifyTime;
		}

		public String getRegionIdsScope() {
			return this.regionIdsScope;
		}

		public void setRegionIdsScope(String regionIdsScope) {
			this.regionIdsScope = regionIdsScope;
		}

		public String getResourceGroupIdsScope() {
			return this.resourceGroupIdsScope;
		}

		public void setResourceGroupIdsScope(String resourceGroupIdsScope) {
			this.resourceGroupIdsScope = resourceGroupIdsScope;
		}

		public String getResourceIdsScope() {
			return this.resourceIdsScope;
		}

		public void setResourceIdsScope(String resourceIdsScope) {
			this.resourceIdsScope = resourceIdsScope;
		}

		public String getResourceTypesScope() {
			return this.resourceTypesScope;
		}

		public void setResourceTypesScope(String resourceTypesScope) {
			this.resourceTypesScope = resourceTypesScope;
		}

		public String getRuleDesc() {
			return this.ruleDesc;
		}

		public void setRuleDesc(String ruleDesc) {
			this.ruleDesc = ruleDesc;
		}

		public String getRuleId() {
			return this.ruleId;
		}

		public void setRuleId(String ruleId) {
			this.ruleId = ruleId;
		}

		public String getRuleName() {
			return this.ruleName;
		}

		public void setRuleName(String ruleName) {
			this.ruleName = ruleName;
		}

		public String getRuleType() {
			return this.ruleType;
		}

		public void setRuleType(String ruleType) {
			this.ruleType = ruleType;
		}

		public List<RuleContent> getRuleContents() {
			return this.ruleContents;
		}

		public void setRuleContents(List<RuleContent> ruleContents) {
			this.ruleContents = ruleContents;
		}

		public static class RuleContent {

			private String autoGroupingScopeCondition;

			private String ruleContentId;

			private String targetResourceGroupCondition;

			public String getAutoGroupingScopeCondition() {
				return this.autoGroupingScopeCondition;
			}

			public void setAutoGroupingScopeCondition(String autoGroupingScopeCondition) {
				this.autoGroupingScopeCondition = autoGroupingScopeCondition;
			}

			public String getRuleContentId() {
				return this.ruleContentId;
			}

			public void setRuleContentId(String ruleContentId) {
				this.ruleContentId = ruleContentId;
			}

			public String getTargetResourceGroupCondition() {
				return this.targetResourceGroupCondition;
			}

			public void setTargetResourceGroupCondition(String targetResourceGroupCondition) {
				this.targetResourceGroupCondition = targetResourceGroupCondition;
			}
		}
	}

	@Override
	public ListAutoGroupingRulesResponse getInstance(UnmarshallerContext context) {
		return	ListAutoGroupingRulesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
