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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsDescribeRuleMatchedStatisticInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeRuleMatchedStatisticInfoResponse extends AcsResponse {

	private Integer totalCount;

	private Integer pageSize;

	private String requestId;

	private Integer page;

	private Integer count;

	private List<RuleMatchedStatisticsInfo> ruleMatchedStatisticsInfos;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPage() {
		return this.page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public List<RuleMatchedStatisticsInfo> getRuleMatchedStatisticsInfos() {
		return this.ruleMatchedStatisticsInfos;
	}

	public void setRuleMatchedStatisticsInfos(List<RuleMatchedStatisticsInfo> ruleMatchedStatisticsInfos) {
		this.ruleMatchedStatisticsInfos = ruleMatchedStatisticsInfos;
	}

	public static class RuleMatchedStatisticsInfo {

		private String groupedDateTime;

		private Integer distinctResourceCount;

		private String ruleName;

		public String getGroupedDateTime() {
			return this.groupedDateTime;
		}

		public void setGroupedDateTime(String groupedDateTime) {
			this.groupedDateTime = groupedDateTime;
		}

		public Integer getDistinctResourceCount() {
			return this.distinctResourceCount;
		}

		public void setDistinctResourceCount(Integer distinctResourceCount) {
			this.distinctResourceCount = distinctResourceCount;
		}

		public String getRuleName() {
			return this.ruleName;
		}

		public void setRuleName(String ruleName) {
			this.ruleName = ruleName;
		}
	}

	@Override
	public OpsDescribeRuleMatchedStatisticInfoResponse getInstance(UnmarshallerContext context) {
		return	OpsDescribeRuleMatchedStatisticInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
