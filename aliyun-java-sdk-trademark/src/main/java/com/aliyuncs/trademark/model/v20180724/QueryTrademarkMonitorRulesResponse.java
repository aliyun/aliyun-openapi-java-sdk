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

package com.aliyuncs.trademark.model.v20180724;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.trademark.transform.v20180724.QueryTrademarkMonitorRulesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryTrademarkMonitorRulesResponse extends AcsResponse {

	private Boolean nextPage;

	private String requestId;

	private Boolean prePage;

	private Integer totalItemNum;

	private Integer currentPageNum;

	private Integer totalPageNum;

	private Integer pageSize;

	private List<TmMonitorRule> data;

	public Boolean getNextPage() {
		return this.nextPage;
	}

	public void setNextPage(Boolean nextPage) {
		this.nextPage = nextPage;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getPrePage() {
		return this.prePage;
	}

	public void setPrePage(Boolean prePage) {
		this.prePage = prePage;
	}

	public Integer getTotalItemNum() {
		return this.totalItemNum;
	}

	public void setTotalItemNum(Integer totalItemNum) {
		this.totalItemNum = totalItemNum;
	}

	public Integer getCurrentPageNum() {
		return this.currentPageNum;
	}

	public void setCurrentPageNum(Integer currentPageNum) {
		this.currentPageNum = currentPageNum;
	}

	public Integer getTotalPageNum() {
		return this.totalPageNum;
	}

	public void setTotalPageNum(Integer totalPageNum) {
		this.totalPageNum = totalPageNum;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<TmMonitorRule> getData() {
		return this.data;
	}

	public void setData(List<TmMonitorRule> data) {
		this.data = data;
	}

	public static class TmMonitorRule {

		private String ruleStatus;

		private String lastFinishTime;

		private String updateTime;

		private Integer ruleType;

		private String createTime;

		private String userId;

		private String ruleExtend;

		private String ruleName;

		private String endTime;

		private String startTime;

		private String ruleKeyword;

		private String lastRunTime;

		private Integer version;

		private String ruleSource;

		private String lastUpdateTime;

		private String env;

		private Integer notifyUpdate;

		private String ruleDetail;

		private String id;

		public String getRuleStatus() {
			return this.ruleStatus;
		}

		public void setRuleStatus(String ruleStatus) {
			this.ruleStatus = ruleStatus;
		}

		public String getLastFinishTime() {
			return this.lastFinishTime;
		}

		public void setLastFinishTime(String lastFinishTime) {
			this.lastFinishTime = lastFinishTime;
		}

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}

		public Integer getRuleType() {
			return this.ruleType;
		}

		public void setRuleType(Integer ruleType) {
			this.ruleType = ruleType;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getRuleExtend() {
			return this.ruleExtend;
		}

		public void setRuleExtend(String ruleExtend) {
			this.ruleExtend = ruleExtend;
		}

		public String getRuleName() {
			return this.ruleName;
		}

		public void setRuleName(String ruleName) {
			this.ruleName = ruleName;
		}

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getRuleKeyword() {
			return this.ruleKeyword;
		}

		public void setRuleKeyword(String ruleKeyword) {
			this.ruleKeyword = ruleKeyword;
		}

		public String getLastRunTime() {
			return this.lastRunTime;
		}

		public void setLastRunTime(String lastRunTime) {
			this.lastRunTime = lastRunTime;
		}

		public Integer getVersion() {
			return this.version;
		}

		public void setVersion(Integer version) {
			this.version = version;
		}

		public String getRuleSource() {
			return this.ruleSource;
		}

		public void setRuleSource(String ruleSource) {
			this.ruleSource = ruleSource;
		}

		public String getLastUpdateTime() {
			return this.lastUpdateTime;
		}

		public void setLastUpdateTime(String lastUpdateTime) {
			this.lastUpdateTime = lastUpdateTime;
		}

		public String getEnv() {
			return this.env;
		}

		public void setEnv(String env) {
			this.env = env;
		}

		public Integer getNotifyUpdate() {
			return this.notifyUpdate;
		}

		public void setNotifyUpdate(Integer notifyUpdate) {
			this.notifyUpdate = notifyUpdate;
		}

		public String getRuleDetail() {
			return this.ruleDetail;
		}

		public void setRuleDetail(String ruleDetail) {
			this.ruleDetail = ruleDetail;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}
	}

	@Override
	public QueryTrademarkMonitorRulesResponse getInstance(UnmarshallerContext context) {
		return	QueryTrademarkMonitorRulesResponseUnmarshaller.unmarshall(this, context);
	}
}
