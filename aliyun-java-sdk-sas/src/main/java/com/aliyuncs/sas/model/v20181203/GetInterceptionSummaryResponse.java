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
import com.aliyuncs.sas.transform.v20181203.GetInterceptionSummaryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetInterceptionSummaryResponse extends AcsResponse {

	private String requestId;

	private InterceptionSummary interceptionSummary;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public InterceptionSummary getInterceptionSummary() {
		return this.interceptionSummary;
	}

	public void setInterceptionSummary(InterceptionSummary interceptionSummary) {
		this.interceptionSummary = interceptionSummary;
	}

	public static class InterceptionSummary {

		private Integer closeClusterCount;

		private Long riskCount30Day;

		private Long riskCount180Day;

		private Integer openClusterCount;

		private Long riskCountToday;

		private Integer closeRuleCount;

		private Integer ruleCount;

		private Integer clusterCount;

		private Integer suggestRuleCount;

		private Integer openRuleCount;

		private Integer interceptionCountInDays;

		public Integer getCloseClusterCount() {
			return this.closeClusterCount;
		}

		public void setCloseClusterCount(Integer closeClusterCount) {
			this.closeClusterCount = closeClusterCount;
		}

		public Long getRiskCount30Day() {
			return this.riskCount30Day;
		}

		public void setRiskCount30Day(Long riskCount30Day) {
			this.riskCount30Day = riskCount30Day;
		}

		public Long getRiskCount180Day() {
			return this.riskCount180Day;
		}

		public void setRiskCount180Day(Long riskCount180Day) {
			this.riskCount180Day = riskCount180Day;
		}

		public Integer getOpenClusterCount() {
			return this.openClusterCount;
		}

		public void setOpenClusterCount(Integer openClusterCount) {
			this.openClusterCount = openClusterCount;
		}

		public Long getRiskCountToday() {
			return this.riskCountToday;
		}

		public void setRiskCountToday(Long riskCountToday) {
			this.riskCountToday = riskCountToday;
		}

		public Integer getCloseRuleCount() {
			return this.closeRuleCount;
		}

		public void setCloseRuleCount(Integer closeRuleCount) {
			this.closeRuleCount = closeRuleCount;
		}

		public Integer getRuleCount() {
			return this.ruleCount;
		}

		public void setRuleCount(Integer ruleCount) {
			this.ruleCount = ruleCount;
		}

		public Integer getClusterCount() {
			return this.clusterCount;
		}

		public void setClusterCount(Integer clusterCount) {
			this.clusterCount = clusterCount;
		}

		public Integer getSuggestRuleCount() {
			return this.suggestRuleCount;
		}

		public void setSuggestRuleCount(Integer suggestRuleCount) {
			this.suggestRuleCount = suggestRuleCount;
		}

		public Integer getOpenRuleCount() {
			return this.openRuleCount;
		}

		public void setOpenRuleCount(Integer openRuleCount) {
			this.openRuleCount = openRuleCount;
		}

		public Integer getInterceptionCountInDays() {
			return this.interceptionCountInDays;
		}

		public void setInterceptionCountInDays(Integer interceptionCountInDays) {
			this.interceptionCountInDays = interceptionCountInDays;
		}
	}

	@Override
	public GetInterceptionSummaryResponse getInstance(UnmarshallerContext context) {
		return	GetInterceptionSummaryResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
