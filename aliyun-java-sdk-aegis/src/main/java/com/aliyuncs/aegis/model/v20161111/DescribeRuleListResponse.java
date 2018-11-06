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
import com.aliyuncs.aegis.transform.v20161111.DescribeRuleListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRuleListResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private List<RulesItem> rules;

	private PageInfo pageInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<RulesItem> getRules() {
		return this.rules;
	}

	public void setRules(List<RulesItem> rules) {
		this.rules = rules;
	}

	public PageInfo getPageInfo() {
		return this.pageInfo;
	}

	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}

	public static class RulesItem {

		private String warnLevel;

		private Long modified;

		private Long create;

		private String ruleName;

		private String description;

		private Integer id;

		private Integer dataSourceId;

		private String expressions;

		private List<RuleGroup> ruleGroups;

		public String getWarnLevel() {
			return this.warnLevel;
		}

		public void setWarnLevel(String warnLevel) {
			this.warnLevel = warnLevel;
		}

		public Long getModified() {
			return this.modified;
		}

		public void setModified(Long modified) {
			this.modified = modified;
		}

		public Long getCreate() {
			return this.create;
		}

		public void setCreate(Long create) {
			this.create = create;
		}

		public String getRuleName() {
			return this.ruleName;
		}

		public void setRuleName(String ruleName) {
			this.ruleName = ruleName;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Integer getId() {
			return this.id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public Integer getDataSourceId() {
			return this.dataSourceId;
		}

		public void setDataSourceId(Integer dataSourceId) {
			this.dataSourceId = dataSourceId;
		}

		public String getExpressions() {
			return this.expressions;
		}

		public void setExpressions(String expressions) {
			this.expressions = expressions;
		}

		public List<RuleGroup> getRuleGroups() {
			return this.ruleGroups;
		}

		public void setRuleGroups(List<RuleGroup> ruleGroups) {
			this.ruleGroups = ruleGroups;
		}

		public static class RuleGroup {

			private String groupName;

			private Integer ruleNum;

			private Long modified;

			private Long create;

			private String description;

			private Integer id;

			private Integer aliUid;

			public String getGroupName() {
				return this.groupName;
			}

			public void setGroupName(String groupName) {
				this.groupName = groupName;
			}

			public Integer getRuleNum() {
				return this.ruleNum;
			}

			public void setRuleNum(Integer ruleNum) {
				this.ruleNum = ruleNum;
			}

			public Long getModified() {
				return this.modified;
			}

			public void setModified(Long modified) {
				this.modified = modified;
			}

			public Long getCreate() {
				return this.create;
			}

			public void setCreate(Long create) {
				this.create = create;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public Integer getId() {
				return this.id;
			}

			public void setId(Integer id) {
				this.id = id;
			}

			public Integer getAliUid() {
				return this.aliUid;
			}

			public void setAliUid(Integer aliUid) {
				this.aliUid = aliUid;
			}
		}
	}

	public static class PageInfo {

		private Integer pageSize;

		private Integer currentPage;

		private Integer totalCount;

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
	public DescribeRuleListResponse getInstance(UnmarshallerContext context) {
		return	DescribeRuleListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
