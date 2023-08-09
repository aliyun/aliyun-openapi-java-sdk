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
import com.aliyuncs.config.transform.v20200907.ListAggregateConfigRuleEvaluationStatisticsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAggregateConfigRuleEvaluationStatisticsResponse extends AcsResponse {

	private String requestId;

	private List<EvaluationResultsItem> evaluationResults;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<EvaluationResultsItem> getEvaluationResults() {
		return this.evaluationResults;
	}

	public void setEvaluationResults(List<EvaluationResultsItem> evaluationResults) {
		this.evaluationResults = evaluationResults;
	}

	public static class EvaluationResultsItem {

		private Long accountId;

		private String aggregatorId;

		private String aggregatorName;

		private Integer nonCompliantResourceCnt;

		private Integer totalResourceCnt;

		private Integer nonCompliantRuleCnt;

		private Integer totalRuleCnt;

		private Long gmtCreate;

		private String nonCompliantRuleDetail;

		private String statisticDate;

		public Long getAccountId() {
			return this.accountId;
		}

		public void setAccountId(Long accountId) {
			this.accountId = accountId;
		}

		public String getAggregatorId() {
			return this.aggregatorId;
		}

		public void setAggregatorId(String aggregatorId) {
			this.aggregatorId = aggregatorId;
		}

		public String getAggregatorName() {
			return this.aggregatorName;
		}

		public void setAggregatorName(String aggregatorName) {
			this.aggregatorName = aggregatorName;
		}

		public Integer getNonCompliantResourceCnt() {
			return this.nonCompliantResourceCnt;
		}

		public void setNonCompliantResourceCnt(Integer nonCompliantResourceCnt) {
			this.nonCompliantResourceCnt = nonCompliantResourceCnt;
		}

		public Integer getTotalResourceCnt() {
			return this.totalResourceCnt;
		}

		public void setTotalResourceCnt(Integer totalResourceCnt) {
			this.totalResourceCnt = totalResourceCnt;
		}

		public Integer getNonCompliantRuleCnt() {
			return this.nonCompliantRuleCnt;
		}

		public void setNonCompliantRuleCnt(Integer nonCompliantRuleCnt) {
			this.nonCompliantRuleCnt = nonCompliantRuleCnt;
		}

		public Integer getTotalRuleCnt() {
			return this.totalRuleCnt;
		}

		public void setTotalRuleCnt(Integer totalRuleCnt) {
			this.totalRuleCnt = totalRuleCnt;
		}

		public Long getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(Long gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getNonCompliantRuleDetail() {
			return this.nonCompliantRuleDetail;
		}

		public void setNonCompliantRuleDetail(String nonCompliantRuleDetail) {
			this.nonCompliantRuleDetail = nonCompliantRuleDetail;
		}

		public String getStatisticDate() {
			return this.statisticDate;
		}

		public void setStatisticDate(String statisticDate) {
			this.statisticDate = statisticDate;
		}
	}

	@Override
	public ListAggregateConfigRuleEvaluationStatisticsResponse getInstance(UnmarshallerContext context) {
		return	ListAggregateConfigRuleEvaluationStatisticsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
