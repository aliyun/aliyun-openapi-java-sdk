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

	private String requestId;

	private Integer totalItemNum;

	private Integer currentPageNum;

	private Integer pageSize;

	private Integer totalPageNum;

	private Boolean prePage;

	private Boolean nextPage;

	private List<TmMonitorRule> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalPageNum() {
		return this.totalPageNum;
	}

	public void setTotalPageNum(Integer totalPageNum) {
		this.totalPageNum = totalPageNum;
	}

	public Boolean getPrePage() {
		return this.prePage;
	}

	public void setPrePage(Boolean prePage) {
		this.prePage = prePage;
	}

	public Boolean getNextPage() {
		return this.nextPage;
	}

	public void setNextPage(Boolean nextPage) {
		this.nextPage = nextPage;
	}

	public List<TmMonitorRule> getData() {
		return this.data;
	}

	public void setData(List<TmMonitorRule> data) {
		this.data = data;
	}

	public static class TmMonitorRule {

		private String id;

		private String userId;

		private String ruleStatus;

		private String ruleSource;

		private String ruleName;

		private Integer ruleType;

		private String ruleKeyword;

		private String ruleDetail;

		private Integer notifyUpdate;

		private Integer version;

		private String startTime;

		private String endTime;

		private String lastRunTime;

		private String lastFinishTime;

		private String lastUpdateTime;

		private String env;

		private String ruleExtend;

		private String createTime;

		private String updateTime;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getRuleStatus() {
			return this.ruleStatus;
		}

		public void setRuleStatus(String ruleStatus) {
			this.ruleStatus = ruleStatus;
		}

		public String getRuleSource() {
			return this.ruleSource;
		}

		public void setRuleSource(String ruleSource) {
			this.ruleSource = ruleSource;
		}

		public String getRuleName() {
			return this.ruleName;
		}

		public void setRuleName(String ruleName) {
			this.ruleName = ruleName;
		}

		public Integer getRuleType() {
			return this.ruleType;
		}

		public void setRuleType(Integer ruleType) {
			this.ruleType = ruleType;
		}

		public String getRuleKeyword() {
			return this.ruleKeyword;
		}

		public void setRuleKeyword(String ruleKeyword) {
			this.ruleKeyword = ruleKeyword;
		}

		public String getRuleDetail() {
			return this.ruleDetail;
		}

		public void setRuleDetail(String ruleDetail) {
			this.ruleDetail = ruleDetail;
		}

		public Integer getNotifyUpdate() {
			return this.notifyUpdate;
		}

		public void setNotifyUpdate(Integer notifyUpdate) {
			this.notifyUpdate = notifyUpdate;
		}

		public Integer getBizVersion() {
			return this.version;
		}

		public void setBizVersion(Integer version) {
			this.version = version;
		}

		/**
		 * @deprecated use getBizVersion instead of this.
		 */
		@Deprecated
		public Integer getVersion() {
			return this.version;
		}

		/**
		 * @deprecated use setBizVersion instead of this.
		 */
		@Deprecated
		public void setVersion(Integer version) {
			this.version = version;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public String getLastRunTime() {
			return this.lastRunTime;
		}

		public void setLastRunTime(String lastRunTime) {
			this.lastRunTime = lastRunTime;
		}

		public String getLastFinishTime() {
			return this.lastFinishTime;
		}

		public void setLastFinishTime(String lastFinishTime) {
			this.lastFinishTime = lastFinishTime;
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

		public String getRuleExtend() {
			return this.ruleExtend;
		}

		public void setRuleExtend(String ruleExtend) {
			this.ruleExtend = ruleExtend;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}
	}

	@Override
	public QueryTrademarkMonitorRulesResponse getInstance(UnmarshallerContext context) {
		return	QueryTrademarkMonitorRulesResponseUnmarshaller.unmarshall(this, context);
	}
}
