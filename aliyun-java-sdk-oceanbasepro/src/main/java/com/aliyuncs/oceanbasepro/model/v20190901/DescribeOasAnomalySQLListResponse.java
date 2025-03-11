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

package com.aliyuncs.oceanbasepro.model.v20190901;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.oceanbasepro.transform.v20190901.DescribeOasAnomalySQLListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeOasAnomalySQLListResponse extends AcsResponse {

	private String requestId;

	private Long totalCount;

	private List<DataItem> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private Double avgCpuTime;

		private Double avgElapsedTime;

		private Double avgGetPlanTime;

		private Double cpuTime;

		private String dbName;

		private String diagnosis;

		private Double executions;

		private Double lastExecutedTime;

		private String riskLevel;

		private String sqlId;

		private String sqlTextShort;

		private String suggestion;

		private String sumElapsedTime;

		private String userName;

		private Boolean dynamicSql;

		private Double avgDbTime;

		private Double sumDbTime;

		private Float avgRetryCount;

		private Float sumRetryCount;

		private Float avgLogicalReads;

		private List<SqlListItem> sqlList;

		private List<String> diagTypes;

		public Double getAvgCpuTime() {
			return this.avgCpuTime;
		}

		public void setAvgCpuTime(Double avgCpuTime) {
			this.avgCpuTime = avgCpuTime;
		}

		public Double getAvgElapsedTime() {
			return this.avgElapsedTime;
		}

		public void setAvgElapsedTime(Double avgElapsedTime) {
			this.avgElapsedTime = avgElapsedTime;
		}

		public Double getAvgGetPlanTime() {
			return this.avgGetPlanTime;
		}

		public void setAvgGetPlanTime(Double avgGetPlanTime) {
			this.avgGetPlanTime = avgGetPlanTime;
		}

		public Double getCpuTime() {
			return this.cpuTime;
		}

		public void setCpuTime(Double cpuTime) {
			this.cpuTime = cpuTime;
		}

		public String getDbName() {
			return this.dbName;
		}

		public void setDbName(String dbName) {
			this.dbName = dbName;
		}

		public String getDiagnosis() {
			return this.diagnosis;
		}

		public void setDiagnosis(String diagnosis) {
			this.diagnosis = diagnosis;
		}

		public Double getExecutions() {
			return this.executions;
		}

		public void setExecutions(Double executions) {
			this.executions = executions;
		}

		public Double getLastExecutedTime() {
			return this.lastExecutedTime;
		}

		public void setLastExecutedTime(Double lastExecutedTime) {
			this.lastExecutedTime = lastExecutedTime;
		}

		public String getRiskLevel() {
			return this.riskLevel;
		}

		public void setRiskLevel(String riskLevel) {
			this.riskLevel = riskLevel;
		}

		public String getSqlId() {
			return this.sqlId;
		}

		public void setSqlId(String sqlId) {
			this.sqlId = sqlId;
		}

		public String getSqlTextShort() {
			return this.sqlTextShort;
		}

		public void setSqlTextShort(String sqlTextShort) {
			this.sqlTextShort = sqlTextShort;
		}

		public String getSuggestion() {
			return this.suggestion;
		}

		public void setSuggestion(String suggestion) {
			this.suggestion = suggestion;
		}

		public String getSumElapsedTime() {
			return this.sumElapsedTime;
		}

		public void setSumElapsedTime(String sumElapsedTime) {
			this.sumElapsedTime = sumElapsedTime;
		}

		public String getUserName() {
			return this.userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public Boolean getDynamicSql() {
			return this.dynamicSql;
		}

		public void setDynamicSql(Boolean dynamicSql) {
			this.dynamicSql = dynamicSql;
		}

		public Double getAvgDbTime() {
			return this.avgDbTime;
		}

		public void setAvgDbTime(Double avgDbTime) {
			this.avgDbTime = avgDbTime;
		}

		public Double getSumDbTime() {
			return this.sumDbTime;
		}

		public void setSumDbTime(Double sumDbTime) {
			this.sumDbTime = sumDbTime;
		}

		public Float getAvgRetryCount() {
			return this.avgRetryCount;
		}

		public void setAvgRetryCount(Float avgRetryCount) {
			this.avgRetryCount = avgRetryCount;
		}

		public Float getSumRetryCount() {
			return this.sumRetryCount;
		}

		public void setSumRetryCount(Float sumRetryCount) {
			this.sumRetryCount = sumRetryCount;
		}

		public Float getAvgLogicalReads() {
			return this.avgLogicalReads;
		}

		public void setAvgLogicalReads(Float avgLogicalReads) {
			this.avgLogicalReads = avgLogicalReads;
		}

		public List<SqlListItem> getSqlList() {
			return this.sqlList;
		}

		public void setSqlList(List<SqlListItem> sqlList) {
			this.sqlList = sqlList;
		}

		public List<String> getDiagTypes() {
			return this.diagTypes;
		}

		public void setDiagTypes(List<String> diagTypes) {
			this.diagTypes = diagTypes;
		}

		public static class SqlListItem {

			private Double avgCpuTime;

			private Double avgElapsedTime;

			private Double avgGetPlanTime;

			private Double cpuTime;

			private String dbName;

			private String diagnosis;

			private Double executions;

			private String lastExecutedTime;

			private String riskLevel;

			private String sqlId;

			private String sqlTextShort;

			private String suggestion;

			private String sumElapsedTime;

			private String userName;

			private Double avgDbTime;

			private Double sumDbTime;

			private Float avgRetryCount;

			private Float sumRetryCount;

			private Float avgLogicalReads;

			private List<String> diagTypes1;

			public Double getAvgCpuTime() {
				return this.avgCpuTime;
			}

			public void setAvgCpuTime(Double avgCpuTime) {
				this.avgCpuTime = avgCpuTime;
			}

			public Double getAvgElapsedTime() {
				return this.avgElapsedTime;
			}

			public void setAvgElapsedTime(Double avgElapsedTime) {
				this.avgElapsedTime = avgElapsedTime;
			}

			public Double getAvgGetPlanTime() {
				return this.avgGetPlanTime;
			}

			public void setAvgGetPlanTime(Double avgGetPlanTime) {
				this.avgGetPlanTime = avgGetPlanTime;
			}

			public Double getCpuTime() {
				return this.cpuTime;
			}

			public void setCpuTime(Double cpuTime) {
				this.cpuTime = cpuTime;
			}

			public String getDbName() {
				return this.dbName;
			}

			public void setDbName(String dbName) {
				this.dbName = dbName;
			}

			public String getDiagnosis() {
				return this.diagnosis;
			}

			public void setDiagnosis(String diagnosis) {
				this.diagnosis = diagnosis;
			}

			public Double getExecutions() {
				return this.executions;
			}

			public void setExecutions(Double executions) {
				this.executions = executions;
			}

			public String getLastExecutedTime() {
				return this.lastExecutedTime;
			}

			public void setLastExecutedTime(String lastExecutedTime) {
				this.lastExecutedTime = lastExecutedTime;
			}

			public String getRiskLevel() {
				return this.riskLevel;
			}

			public void setRiskLevel(String riskLevel) {
				this.riskLevel = riskLevel;
			}

			public String getSqlId() {
				return this.sqlId;
			}

			public void setSqlId(String sqlId) {
				this.sqlId = sqlId;
			}

			public String getSqlTextShort() {
				return this.sqlTextShort;
			}

			public void setSqlTextShort(String sqlTextShort) {
				this.sqlTextShort = sqlTextShort;
			}

			public String getSuggestion() {
				return this.suggestion;
			}

			public void setSuggestion(String suggestion) {
				this.suggestion = suggestion;
			}

			public String getSumElapsedTime() {
				return this.sumElapsedTime;
			}

			public void setSumElapsedTime(String sumElapsedTime) {
				this.sumElapsedTime = sumElapsedTime;
			}

			public String getUserName() {
				return this.userName;
			}

			public void setUserName(String userName) {
				this.userName = userName;
			}

			public Double getAvgDbTime() {
				return this.avgDbTime;
			}

			public void setAvgDbTime(Double avgDbTime) {
				this.avgDbTime = avgDbTime;
			}

			public Double getSumDbTime() {
				return this.sumDbTime;
			}

			public void setSumDbTime(Double sumDbTime) {
				this.sumDbTime = sumDbTime;
			}

			public Float getAvgRetryCount() {
				return this.avgRetryCount;
			}

			public void setAvgRetryCount(Float avgRetryCount) {
				this.avgRetryCount = avgRetryCount;
			}

			public Float getSumRetryCount() {
				return this.sumRetryCount;
			}

			public void setSumRetryCount(Float sumRetryCount) {
				this.sumRetryCount = sumRetryCount;
			}

			public Float getAvgLogicalReads() {
				return this.avgLogicalReads;
			}

			public void setAvgLogicalReads(Float avgLogicalReads) {
				this.avgLogicalReads = avgLogicalReads;
			}

			public List<String> getDiagTypes1() {
				return this.diagTypes1;
			}

			public void setDiagTypes1(List<String> diagTypes1) {
				this.diagTypes1 = diagTypes1;
			}
		}
	}

	@Override
	public DescribeOasAnomalySQLListResponse getInstance(UnmarshallerContext context) {
		return	DescribeOasAnomalySQLListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
