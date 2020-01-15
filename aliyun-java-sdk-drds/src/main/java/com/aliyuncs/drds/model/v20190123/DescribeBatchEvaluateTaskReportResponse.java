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

package com.aliyuncs.drds.model.v20190123;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.drds.transform.v20190123.DescribeBatchEvaluateTaskReportResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeBatchEvaluateTaskReportResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private List<EvaluateResults> data;

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

	public List<EvaluateResults> getData() {
		return this.data;
	}

	public void setData(List<EvaluateResults> data) {
		this.data = data;
	}

	public static class EvaluateResults {

		private Integer taskId;

		private String taskName;

		private Integer instId;

		private String dbName;

		private String taskStatus;

		private String gmtCreate;

		private String gmtModified;

		private String rdsType;

		private Integer rdsCount;

		private String rdsTotalSpace;

		private String drdsType;

		private Integer drdsCount;

		private Integer allSqlCount;

		private Integer slowSqlCount;

		private List<TableShardResultsItem> tableShardResults;

		private List<RdsInstInfosItem> rdsInstInfos;

		public Integer getTaskId() {
			return this.taskId;
		}

		public void setTaskId(Integer taskId) {
			this.taskId = taskId;
		}

		public String getTaskName() {
			return this.taskName;
		}

		public void setTaskName(String taskName) {
			this.taskName = taskName;
		}

		public Integer getInstId() {
			return this.instId;
		}

		public void setInstId(Integer instId) {
			this.instId = instId;
		}

		public String getDbName() {
			return this.dbName;
		}

		public void setDbName(String dbName) {
			this.dbName = dbName;
		}

		public String getTaskStatus() {
			return this.taskStatus;
		}

		public void setTaskStatus(String taskStatus) {
			this.taskStatus = taskStatus;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getRdsType() {
			return this.rdsType;
		}

		public void setRdsType(String rdsType) {
			this.rdsType = rdsType;
		}

		public Integer getRdsCount() {
			return this.rdsCount;
		}

		public void setRdsCount(Integer rdsCount) {
			this.rdsCount = rdsCount;
		}

		public String getRdsTotalSpace() {
			return this.rdsTotalSpace;
		}

		public void setRdsTotalSpace(String rdsTotalSpace) {
			this.rdsTotalSpace = rdsTotalSpace;
		}

		public String getDrdsType() {
			return this.drdsType;
		}

		public void setDrdsType(String drdsType) {
			this.drdsType = drdsType;
		}

		public Integer getDrdsCount() {
			return this.drdsCount;
		}

		public void setDrdsCount(Integer drdsCount) {
			this.drdsCount = drdsCount;
		}

		public Integer getAllSqlCount() {
			return this.allSqlCount;
		}

		public void setAllSqlCount(Integer allSqlCount) {
			this.allSqlCount = allSqlCount;
		}

		public Integer getSlowSqlCount() {
			return this.slowSqlCount;
		}

		public void setSlowSqlCount(Integer slowSqlCount) {
			this.slowSqlCount = slowSqlCount;
		}

		public List<TableShardResultsItem> getTableShardResults() {
			return this.tableShardResults;
		}

		public void setTableShardResults(List<TableShardResultsItem> tableShardResults) {
			this.tableShardResults = tableShardResults;
		}

		public List<RdsInstInfosItem> getRdsInstInfos() {
			return this.rdsInstInfos;
		}

		public void setRdsInstInfos(List<RdsInstInfosItem> rdsInstInfos) {
			this.rdsInstInfos = rdsInstInfos;
		}

		public static class TableShardResultsItem {

			private String table;

			private String shardType;

			private String dbShardKey;

			private String tbShardKey;

			private Integer tbpartitions;

			private Integer dbpartitions;

			private String createTableSql;

			private Integer rowCount;

			private Integer sqlCount;

			private String shardKeyType;

			public String getTable() {
				return this.table;
			}

			public void setTable(String table) {
				this.table = table;
			}

			public String getShardType() {
				return this.shardType;
			}

			public void setShardType(String shardType) {
				this.shardType = shardType;
			}

			public String getDbShardKey() {
				return this.dbShardKey;
			}

			public void setDbShardKey(String dbShardKey) {
				this.dbShardKey = dbShardKey;
			}

			public String getTbShardKey() {
				return this.tbShardKey;
			}

			public void setTbShardKey(String tbShardKey) {
				this.tbShardKey = tbShardKey;
			}

			public Integer getTbpartitions() {
				return this.tbpartitions;
			}

			public void setTbpartitions(Integer tbpartitions) {
				this.tbpartitions = tbpartitions;
			}

			public Integer getDbpartitions() {
				return this.dbpartitions;
			}

			public void setDbpartitions(Integer dbpartitions) {
				this.dbpartitions = dbpartitions;
			}

			public String getCreateTableSql() {
				return this.createTableSql;
			}

			public void setCreateTableSql(String createTableSql) {
				this.createTableSql = createTableSql;
			}

			public Integer getRowCount() {
				return this.rowCount;
			}

			public void setRowCount(Integer rowCount) {
				this.rowCount = rowCount;
			}

			public Integer getSqlCount() {
				return this.sqlCount;
			}

			public void setSqlCount(Integer sqlCount) {
				this.sqlCount = sqlCount;
			}

			public String getShardKeyType() {
				return this.shardKeyType;
			}

			public void setShardKeyType(String shardKeyType) {
				this.shardKeyType = shardKeyType;
			}
		}

		public static class RdsInstInfosItem {

			private String instId;

			private Integer rdsUsedSpace;

			private Integer rdsPeakIopsWeekly;

			private Integer rdsPeakQpsWeekly;

			private Integer rdsPeakSessionsWeekly;

			private Integer dataGrowthScale;

			private Integer avgQpsGrowthScale;

			public String getInstId() {
				return this.instId;
			}

			public void setInstId(String instId) {
				this.instId = instId;
			}

			public Integer getRdsUsedSpace() {
				return this.rdsUsedSpace;
			}

			public void setRdsUsedSpace(Integer rdsUsedSpace) {
				this.rdsUsedSpace = rdsUsedSpace;
			}

			public Integer getRdsPeakIopsWeekly() {
				return this.rdsPeakIopsWeekly;
			}

			public void setRdsPeakIopsWeekly(Integer rdsPeakIopsWeekly) {
				this.rdsPeakIopsWeekly = rdsPeakIopsWeekly;
			}

			public Integer getRdsPeakQpsWeekly() {
				return this.rdsPeakQpsWeekly;
			}

			public void setRdsPeakQpsWeekly(Integer rdsPeakQpsWeekly) {
				this.rdsPeakQpsWeekly = rdsPeakQpsWeekly;
			}

			public Integer getRdsPeakSessionsWeekly() {
				return this.rdsPeakSessionsWeekly;
			}

			public void setRdsPeakSessionsWeekly(Integer rdsPeakSessionsWeekly) {
				this.rdsPeakSessionsWeekly = rdsPeakSessionsWeekly;
			}

			public Integer getDataGrowthScale() {
				return this.dataGrowthScale;
			}

			public void setDataGrowthScale(Integer dataGrowthScale) {
				this.dataGrowthScale = dataGrowthScale;
			}

			public Integer getAvgQpsGrowthScale() {
				return this.avgQpsGrowthScale;
			}

			public void setAvgQpsGrowthScale(Integer avgQpsGrowthScale) {
				this.avgQpsGrowthScale = avgQpsGrowthScale;
			}
		}
	}

	@Override
	public DescribeBatchEvaluateTaskReportResponse getInstance(UnmarshallerContext context) {
		return	DescribeBatchEvaluateTaskReportResponseUnmarshaller.unmarshall(this, context);
	}
}
