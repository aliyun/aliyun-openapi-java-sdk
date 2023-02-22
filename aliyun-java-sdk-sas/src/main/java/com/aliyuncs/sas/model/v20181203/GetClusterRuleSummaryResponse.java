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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.GetClusterRuleSummaryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetClusterRuleSummaryResponse extends AcsResponse {

	private String requestId;

	private ClusterRuleSummary clusterRuleSummary;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public ClusterRuleSummary getClusterRuleSummary() {
		return this.clusterRuleSummary;
	}

	public void setClusterRuleSummary(ClusterRuleSummary clusterRuleSummary) {
		this.clusterRuleSummary = clusterRuleSummary;
	}

	public static class ClusterRuleSummary {

		private Integer interceptionSwitch;

		private Integer closeRuleCount;

		private Integer interceptionType;

		private Integer ruleCount;

		private Integer openRuleCount;

		private Integer suggestRuleCount;

		private Long interceptionCount7Day;

		public Integer getInterceptionSwitch() {
			return this.interceptionSwitch;
		}

		public void setInterceptionSwitch(Integer interceptionSwitch) {
			this.interceptionSwitch = interceptionSwitch;
		}

		public Integer getCloseRuleCount() {
			return this.closeRuleCount;
		}

		public void setCloseRuleCount(Integer closeRuleCount) {
			this.closeRuleCount = closeRuleCount;
		}

		public Integer getInterceptionType() {
			return this.interceptionType;
		}

		public void setInterceptionType(Integer interceptionType) {
			this.interceptionType = interceptionType;
		}

		public Integer getRuleCount() {
			return this.ruleCount;
		}

		public void setRuleCount(Integer ruleCount) {
			this.ruleCount = ruleCount;
		}

		public Integer getOpenRuleCount() {
			return this.openRuleCount;
		}

		public void setOpenRuleCount(Integer openRuleCount) {
			this.openRuleCount = openRuleCount;
		}

		public Integer getSuggestRuleCount() {
			return this.suggestRuleCount;
		}

		public void setSuggestRuleCount(Integer suggestRuleCount) {
			this.suggestRuleCount = suggestRuleCount;
		}

		public Long getInterceptionCount7Day() {
			return this.interceptionCount7Day;
		}

		public void setInterceptionCount7Day(Long interceptionCount7Day) {
			this.interceptionCount7Day = interceptionCount7Day;
		}
	}

	@Override
	public GetClusterRuleSummaryResponse getInstance(UnmarshallerContext context) {
		return	GetClusterRuleSummaryResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
