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
import com.aliyuncs.sas.transform.v20181203.DescribeAntiBruteForceRulesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAntiBruteForceRulesResponse extends AcsResponse {

	private String requestId;

	private List<AntiBruteForceRule> rules;

	private PageInfo pageInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<AntiBruteForceRule> getRules() {
		return this.rules;
	}

	public void setRules(List<AntiBruteForceRule> rules) {
		this.rules = rules;
	}

	public PageInfo getPageInfo() {
		return this.pageInfo;
	}

	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}

	public static class AntiBruteForceRule {

		private Long id;

		private Boolean defaultRule;

		private String name;

		private Integer span;

		private Integer failCount;

		private Integer forbiddenTime;

		private Boolean enableSmartRule;

		private Integer machineCount;

		private List<String> uuidList;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Boolean getDefaultRule() {
			return this.defaultRule;
		}

		public void setDefaultRule(Boolean defaultRule) {
			this.defaultRule = defaultRule;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getSpan() {
			return this.span;
		}

		public void setSpan(Integer span) {
			this.span = span;
		}

		public Integer getFailCount() {
			return this.failCount;
		}

		public void setFailCount(Integer failCount) {
			this.failCount = failCount;
		}

		public Integer getForbiddenTime() {
			return this.forbiddenTime;
		}

		public void setForbiddenTime(Integer forbiddenTime) {
			this.forbiddenTime = forbiddenTime;
		}

		public Boolean getEnableSmartRule() {
			return this.enableSmartRule;
		}

		public void setEnableSmartRule(Boolean enableSmartRule) {
			this.enableSmartRule = enableSmartRule;
		}

		public Integer getMachineCount() {
			return this.machineCount;
		}

		public void setMachineCount(Integer machineCount) {
			this.machineCount = machineCount;
		}

		public List<String> getUuidList() {
			return this.uuidList;
		}

		public void setUuidList(List<String> uuidList) {
			this.uuidList = uuidList;
		}
	}

	public static class PageInfo {

		private Integer count;

		private Integer pageSize;

		private Integer totalCount;

		private Integer currentPage;

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

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public Integer getCurrentPage() {
			return this.currentPage;
		}

		public void setCurrentPage(Integer currentPage) {
			this.currentPage = currentPage;
		}
	}

	@Override
	public DescribeAntiBruteForceRulesResponse getInstance(UnmarshallerContext context) {
		return	DescribeAntiBruteForceRulesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
