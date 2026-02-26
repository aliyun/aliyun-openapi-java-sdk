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

package com.aliyuncs.sas.model.v20181203;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.ListSystemClientRulesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListSystemClientRulesResponse extends AcsResponse {

	private String requestId;

	private List<Rule> ruleList;

	private PageInfo pageInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Rule> getRuleList() {
		return this.ruleList;
	}

	public void setRuleList(List<Rule> ruleList) {
		this.ruleList = ruleList;
	}

	public PageInfo getPageInfo() {
		return this.pageInfo;
	}

	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}

	public static class Rule {

		private Integer status;

		private Integer ruleType;

		private String platform;

		private String switchId;

		private Long ruleId;

		private String ruleName;

		private String aggregationName;

		private String description;

		private List<Policy> policies;

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public Integer getRuleType() {
			return this.ruleType;
		}

		public void setRuleType(Integer ruleType) {
			this.ruleType = ruleType;
		}

		public String getPlatform() {
			return this.platform;
		}

		public void setPlatform(String platform) {
			this.platform = platform;
		}

		public String getSwitchId() {
			return this.switchId;
		}

		public void setSwitchId(String switchId) {
			this.switchId = switchId;
		}

		public Long getRuleId() {
			return this.ruleId;
		}

		public void setRuleId(Long ruleId) {
			this.ruleId = ruleId;
		}

		public String getRuleName() {
			return this.ruleName;
		}

		public void setRuleName(String ruleName) {
			this.ruleName = ruleName;
		}

		public String getAggregationName() {
			return this.aggregationName;
		}

		public void setAggregationName(String aggregationName) {
			this.aggregationName = aggregationName;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public List<Policy> getPolicies() {
			return this.policies;
		}

		public void setPolicies(List<Policy> policies) {
			this.policies = policies;
		}

		public static class Policy {

			private String policyName;

			private String policyKey;

			public String getPolicyName() {
				return this.policyName;
			}

			public void setPolicyName(String policyName) {
				this.policyName = policyName;
			}

			public String getPolicyKey() {
				return this.policyKey;
			}

			public void setPolicyKey(String policyKey) {
				this.policyKey = policyKey;
			}
		}
	}

	public static class PageInfo {

		private Integer currentPage;

		private Integer pageSize;

		private Integer totalCount;

		public Integer getCurrentPage() {
			return this.currentPage;
		}

		public void setCurrentPage(Integer currentPage) {
			this.currentPage = currentPage;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}
	}

	@Override
	public ListSystemClientRulesResponse getInstance(UnmarshallerContext context) {
		return	ListSystemClientRulesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
