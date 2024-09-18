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

package com.aliyuncs.quickbi_public.model.v20220101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.quickbi_public.transform.v20220101.QueryComponentPerformanceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryComponentPerformanceResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private List<Data> result;

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

	public List<Data> getResult() {
		return this.result;
	}

	public void setResult(List<Data> result) {
		this.result = result;
	}

	public static class Data {

		private Double cacheCostTimeAvg;

		private Integer cacheQueryCount;

		private String componentId;

		private String componentName;

		private Double costTimeAvg;

		private Integer queryCount;

		private Double queryCountAvg;

		private Double queryOverFivePercentNum;

		private String queryOverFiveSecPercent;

		private String queryOverTenSecPercent;

		private Double queryOverTenSecPercentNum;

		private Integer queryTimeoutCount;

		private Double queryTimeoutCountPercent;

		private Double quickIndexCostTimeAvg;

		private Integer quickIndexQueryCount;

		private String repeatQueryPercent;

		private Double repeatQueryPercentNum;

		private Integer repeatSqlQueryCount;

		private String repeatSqlQueryPercent;

		private String reportId;

		private String reportName;

		private String reportType;

		private String workspaceId;

		private String workspaceName;

		public Double getCacheCostTimeAvg() {
			return this.cacheCostTimeAvg;
		}

		public void setCacheCostTimeAvg(Double cacheCostTimeAvg) {
			this.cacheCostTimeAvg = cacheCostTimeAvg;
		}

		public Integer getCacheQueryCount() {
			return this.cacheQueryCount;
		}

		public void setCacheQueryCount(Integer cacheQueryCount) {
			this.cacheQueryCount = cacheQueryCount;
		}

		public String getComponentId() {
			return this.componentId;
		}

		public void setComponentId(String componentId) {
			this.componentId = componentId;
		}

		public String getComponentName() {
			return this.componentName;
		}

		public void setComponentName(String componentName) {
			this.componentName = componentName;
		}

		public Double getCostTimeAvg() {
			return this.costTimeAvg;
		}

		public void setCostTimeAvg(Double costTimeAvg) {
			this.costTimeAvg = costTimeAvg;
		}

		public Integer getQueryCount() {
			return this.queryCount;
		}

		public void setQueryCount(Integer queryCount) {
			this.queryCount = queryCount;
		}

		public Double getQueryCountAvg() {
			return this.queryCountAvg;
		}

		public void setQueryCountAvg(Double queryCountAvg) {
			this.queryCountAvg = queryCountAvg;
		}

		public Double getQueryOverFivePercentNum() {
			return this.queryOverFivePercentNum;
		}

		public void setQueryOverFivePercentNum(Double queryOverFivePercentNum) {
			this.queryOverFivePercentNum = queryOverFivePercentNum;
		}

		public String getQueryOverFiveSecPercent() {
			return this.queryOverFiveSecPercent;
		}

		public void setQueryOverFiveSecPercent(String queryOverFiveSecPercent) {
			this.queryOverFiveSecPercent = queryOverFiveSecPercent;
		}

		public String getQueryOverTenSecPercent() {
			return this.queryOverTenSecPercent;
		}

		public void setQueryOverTenSecPercent(String queryOverTenSecPercent) {
			this.queryOverTenSecPercent = queryOverTenSecPercent;
		}

		public Double getQueryOverTenSecPercentNum() {
			return this.queryOverTenSecPercentNum;
		}

		public void setQueryOverTenSecPercentNum(Double queryOverTenSecPercentNum) {
			this.queryOverTenSecPercentNum = queryOverTenSecPercentNum;
		}

		public Integer getQueryTimeoutCount() {
			return this.queryTimeoutCount;
		}

		public void setQueryTimeoutCount(Integer queryTimeoutCount) {
			this.queryTimeoutCount = queryTimeoutCount;
		}

		public Double getQueryTimeoutCountPercent() {
			return this.queryTimeoutCountPercent;
		}

		public void setQueryTimeoutCountPercent(Double queryTimeoutCountPercent) {
			this.queryTimeoutCountPercent = queryTimeoutCountPercent;
		}

		public Double getQuickIndexCostTimeAvg() {
			return this.quickIndexCostTimeAvg;
		}

		public void setQuickIndexCostTimeAvg(Double quickIndexCostTimeAvg) {
			this.quickIndexCostTimeAvg = quickIndexCostTimeAvg;
		}

		public Integer getQuickIndexQueryCount() {
			return this.quickIndexQueryCount;
		}

		public void setQuickIndexQueryCount(Integer quickIndexQueryCount) {
			this.quickIndexQueryCount = quickIndexQueryCount;
		}

		public String getRepeatQueryPercent() {
			return this.repeatQueryPercent;
		}

		public void setRepeatQueryPercent(String repeatQueryPercent) {
			this.repeatQueryPercent = repeatQueryPercent;
		}

		public Double getRepeatQueryPercentNum() {
			return this.repeatQueryPercentNum;
		}

		public void setRepeatQueryPercentNum(Double repeatQueryPercentNum) {
			this.repeatQueryPercentNum = repeatQueryPercentNum;
		}

		public Integer getRepeatSqlQueryCount() {
			return this.repeatSqlQueryCount;
		}

		public void setRepeatSqlQueryCount(Integer repeatSqlQueryCount) {
			this.repeatSqlQueryCount = repeatSqlQueryCount;
		}

		public String getRepeatSqlQueryPercent() {
			return this.repeatSqlQueryPercent;
		}

		public void setRepeatSqlQueryPercent(String repeatSqlQueryPercent) {
			this.repeatSqlQueryPercent = repeatSqlQueryPercent;
		}

		public String getReportId() {
			return this.reportId;
		}

		public void setReportId(String reportId) {
			this.reportId = reportId;
		}

		public String getReportName() {
			return this.reportName;
		}

		public void setReportName(String reportName) {
			this.reportName = reportName;
		}

		public String getReportType() {
			return this.reportType;
		}

		public void setReportType(String reportType) {
			this.reportType = reportType;
		}

		public String getWorkspaceId() {
			return this.workspaceId;
		}

		public void setWorkspaceId(String workspaceId) {
			this.workspaceId = workspaceId;
		}

		public String getWorkspaceName() {
			return this.workspaceName;
		}

		public void setWorkspaceName(String workspaceName) {
			this.workspaceName = workspaceName;
		}
	}

	@Override
	public QueryComponentPerformanceResponse getInstance(UnmarshallerContext context) {
		return	QueryComponentPerformanceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
