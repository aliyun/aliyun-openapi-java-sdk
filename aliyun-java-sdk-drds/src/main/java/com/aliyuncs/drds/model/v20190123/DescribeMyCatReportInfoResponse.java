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
import com.aliyuncs.drds.transform.v20190123.DescribeMyCatReportInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeMyCatReportInfoResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private EvaluateReportInfo evaluateReportInfo;

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

	public EvaluateReportInfo getEvaluateReportInfo() {
		return this.evaluateReportInfo;
	}

	public void setEvaluateReportInfo(EvaluateReportInfo evaluateReportInfo) {
		this.evaluateReportInfo = evaluateReportInfo;
	}

	public static class EvaluateReportInfo {

		private Integer errorSqlCount;

		private String drdsSpecs;

		private Integer drdsNodeCount;

		private String rdsSpecs;

		private Integer rdsCount;

		private String rdsDiskCapacity;

		private DbInfo dbInfo;

		public Integer getErrorSqlCount() {
			return this.errorSqlCount;
		}

		public void setErrorSqlCount(Integer errorSqlCount) {
			this.errorSqlCount = errorSqlCount;
		}

		public String getDrdsSpecs() {
			return this.drdsSpecs;
		}

		public void setDrdsSpecs(String drdsSpecs) {
			this.drdsSpecs = drdsSpecs;
		}

		public Integer getDrdsNodeCount() {
			return this.drdsNodeCount;
		}

		public void setDrdsNodeCount(Integer drdsNodeCount) {
			this.drdsNodeCount = drdsNodeCount;
		}

		public String getRdsSpecs() {
			return this.rdsSpecs;
		}

		public void setRdsSpecs(String rdsSpecs) {
			this.rdsSpecs = rdsSpecs;
		}

		public Integer getRdsCount() {
			return this.rdsCount;
		}

		public void setRdsCount(Integer rdsCount) {
			this.rdsCount = rdsCount;
		}

		public String getRdsDiskCapacity() {
			return this.rdsDiskCapacity;
		}

		public void setRdsDiskCapacity(String rdsDiskCapacity) {
			this.rdsDiskCapacity = rdsDiskCapacity;
		}

		public DbInfo getDbInfo() {
			return this.dbInfo;
		}

		public void setDbInfo(DbInfo dbInfo) {
			this.dbInfo = dbInfo;
		}

		public static class DbInfo {

			private String dbName;

			private List<TableInfo> tableInfoList;

			public String getDbName() {
				return this.dbName;
			}

			public void setDbName(String dbName) {
				this.dbName = dbName;
			}

			public List<TableInfo> getTableInfoList() {
				return this.tableInfoList;
			}

			public void setTableInfoList(List<TableInfo> tableInfoList) {
				this.tableInfoList = tableInfoList;
			}

			public static class TableInfo {

				private String tableName;

				private String mycatShardAlgorithm;

				private String dbShardColumn;

				private String dbShardAlgorithm;

				private String tbShardColumn;

				private String tbShardAlgorithm;

				private Integer tbShardNum;

				private Boolean shard;

				private Boolean broadcast;

				private String createTableSql;

				public String getTableName() {
					return this.tableName;
				}

				public void setTableName(String tableName) {
					this.tableName = tableName;
				}

				public String getMycatShardAlgorithm() {
					return this.mycatShardAlgorithm;
				}

				public void setMycatShardAlgorithm(String mycatShardAlgorithm) {
					this.mycatShardAlgorithm = mycatShardAlgorithm;
				}

				public String getDbShardColumn() {
					return this.dbShardColumn;
				}

				public void setDbShardColumn(String dbShardColumn) {
					this.dbShardColumn = dbShardColumn;
				}

				public String getDbShardAlgorithm() {
					return this.dbShardAlgorithm;
				}

				public void setDbShardAlgorithm(String dbShardAlgorithm) {
					this.dbShardAlgorithm = dbShardAlgorithm;
				}

				public String getTbShardColumn() {
					return this.tbShardColumn;
				}

				public void setTbShardColumn(String tbShardColumn) {
					this.tbShardColumn = tbShardColumn;
				}

				public String getTbShardAlgorithm() {
					return this.tbShardAlgorithm;
				}

				public void setTbShardAlgorithm(String tbShardAlgorithm) {
					this.tbShardAlgorithm = tbShardAlgorithm;
				}

				public Integer getTbShardNum() {
					return this.tbShardNum;
				}

				public void setTbShardNum(Integer tbShardNum) {
					this.tbShardNum = tbShardNum;
				}

				public Boolean getShard() {
					return this.shard;
				}

				public void setShard(Boolean shard) {
					this.shard = shard;
				}

				public Boolean getBroadcast() {
					return this.broadcast;
				}

				public void setBroadcast(Boolean broadcast) {
					this.broadcast = broadcast;
				}

				public String getCreateTableSql() {
					return this.createTableSql;
				}

				public void setCreateTableSql(String createTableSql) {
					this.createTableSql = createTableSql;
				}
			}
		}
	}

	@Override
	public DescribeMyCatReportInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeMyCatReportInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
