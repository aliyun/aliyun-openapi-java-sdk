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

package com.aliyuncs.aegis.model.v20161111;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.aegis.transform.v20161111.DescribeJoinRuleListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeJoinRuleListResponse extends AcsResponse {

	private String requestId;

	private List<JoinRuleListItem> joinRuleList;

	private PageInfo pageInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<JoinRuleListItem> getJoinRuleList() {
		return this.joinRuleList;
	}

	public void setJoinRuleList(List<JoinRuleListItem> joinRuleList) {
		this.joinRuleList = joinRuleList;
	}

	public PageInfo getPageInfo() {
		return this.pageInfo;
	}

	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}

	public static class JoinRuleListItem {

		private Integer timeWindow;

		private String warnLevel;

		private Integer dataSourceId1;

		private String description;

		private String ruleName;

		private String joinRelation;

		private Integer dataSourceId2;

		private String expression2;

		private Integer ruleId;

		private String expression1;

		private String actions;

		private String statisticsRules;

		private Boolean needGroup;

		private String statusCode;

		public Integer getTimeWindow() {
			return this.timeWindow;
		}

		public void setTimeWindow(Integer timeWindow) {
			this.timeWindow = timeWindow;
		}

		public String getWarnLevel() {
			return this.warnLevel;
		}

		public void setWarnLevel(String warnLevel) {
			this.warnLevel = warnLevel;
		}

		public Integer getDataSourceId1() {
			return this.dataSourceId1;
		}

		public void setDataSourceId1(Integer dataSourceId1) {
			this.dataSourceId1 = dataSourceId1;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getRuleName() {
			return this.ruleName;
		}

		public void setRuleName(String ruleName) {
			this.ruleName = ruleName;
		}

		public String getJoinRelation() {
			return this.joinRelation;
		}

		public void setJoinRelation(String joinRelation) {
			this.joinRelation = joinRelation;
		}

		public Integer getDataSourceId2() {
			return this.dataSourceId2;
		}

		public void setDataSourceId2(Integer dataSourceId2) {
			this.dataSourceId2 = dataSourceId2;
		}

		public String getExpression2() {
			return this.expression2;
		}

		public void setExpression2(String expression2) {
			this.expression2 = expression2;
		}

		public Integer getRuleId() {
			return this.ruleId;
		}

		public void setRuleId(Integer ruleId) {
			this.ruleId = ruleId;
		}

		public String getExpression1() {
			return this.expression1;
		}

		public void setExpression1(String expression1) {
			this.expression1 = expression1;
		}

		public String getActions() {
			return this.actions;
		}

		public void setActions(String actions) {
			this.actions = actions;
		}

		public String getStatisticsRules() {
			return this.statisticsRules;
		}

		public void setStatisticsRules(String statisticsRules) {
			this.statisticsRules = statisticsRules;
		}

		public Boolean getNeedGroup() {
			return this.needGroup;
		}

		public void setNeedGroup(Boolean needGroup) {
			this.needGroup = needGroup;
		}

		public String getStatusCode() {
			return this.statusCode;
		}

		public void setStatusCode(String statusCode) {
			this.statusCode = statusCode;
		}
	}

	public static class PageInfo {

		private Integer count;

		private Integer pageSize;

		private Integer currentPage;

		private Integer totalCount;

		public Integer getCount() {
			return this.count;
		}

		public void setCount(Integer count) {
			this.count = count;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getCurrentPage() {
			return this.currentPage;
		}

		public void setCurrentPage(Integer currentPage) {
			this.currentPage = currentPage;
		}

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}
	}

	@Override
	public DescribeJoinRuleListResponse getInstance(UnmarshallerContext context) {
		return	DescribeJoinRuleListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
