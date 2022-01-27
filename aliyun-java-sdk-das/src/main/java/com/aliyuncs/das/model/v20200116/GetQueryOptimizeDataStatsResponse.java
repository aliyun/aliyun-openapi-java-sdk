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

package com.aliyuncs.das.model.v20200116;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.das.transform.v20200116.GetQueryOptimizeDataStatsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetQueryOptimizeDataStatsResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private String success;

	private Data data;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long total;

		private Integer pageNo;

		private Integer pageSize;

		private String extra;

		private List<QueryOptimizeDataStats> list;

		public Long getTotal() {
			return this.total;
		}

		public void setTotal(Long total) {
			this.total = total;
		}

		public Integer getPageNo() {
			return this.pageNo;
		}

		public void setPageNo(Integer pageNo) {
			this.pageNo = pageNo;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public String getExtra() {
			return this.extra;
		}

		public void setExtra(String extra) {
			this.extra = extra;
		}

		public List<QueryOptimizeDataStats> getList() {
			return this.list;
		}

		public void setList(List<QueryOptimizeDataStats> list) {
			this.list = list;
		}

		public static class QueryOptimizeDataStats {

			private String instanceId;

			private String dbname;

			private String sqlId;

			private String sqlType;

			private String psql;

			private String sqlSample;

			private Integer count;

			private Double maxQueryTime;

			private Double avgQueryTime;

			private Double maxLockTime;

			private Double avgLockTime;

			private Long maxRowsExamined;

			private Double avgRowsExamined;

			private Long maxRowsSent;

			private Double avgRowsSent;

			private Long maxRowsAffected;

			private Double avgRowsAffected;

			private List<Rules> ruleList;

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getDbname() {
				return this.dbname;
			}

			public void setDbname(String dbname) {
				this.dbname = dbname;
			}

			public String getSqlId() {
				return this.sqlId;
			}

			public void setSqlId(String sqlId) {
				this.sqlId = sqlId;
			}

			public String getSqlType() {
				return this.sqlType;
			}

			public void setSqlType(String sqlType) {
				this.sqlType = sqlType;
			}

			public String getPsql() {
				return this.psql;
			}

			public void setPsql(String psql) {
				this.psql = psql;
			}

			public String getSqlSample() {
				return this.sqlSample;
			}

			public void setSqlSample(String sqlSample) {
				this.sqlSample = sqlSample;
			}

			public Integer getCount() {
				return this.count;
			}

			public void setCount(Integer count) {
				this.count = count;
			}

			public Double getMaxQueryTime() {
				return this.maxQueryTime;
			}

			public void setMaxQueryTime(Double maxQueryTime) {
				this.maxQueryTime = maxQueryTime;
			}

			public Double getAvgQueryTime() {
				return this.avgQueryTime;
			}

			public void setAvgQueryTime(Double avgQueryTime) {
				this.avgQueryTime = avgQueryTime;
			}

			public Double getMaxLockTime() {
				return this.maxLockTime;
			}

			public void setMaxLockTime(Double maxLockTime) {
				this.maxLockTime = maxLockTime;
			}

			public Double getAvgLockTime() {
				return this.avgLockTime;
			}

			public void setAvgLockTime(Double avgLockTime) {
				this.avgLockTime = avgLockTime;
			}

			public Long getMaxRowsExamined() {
				return this.maxRowsExamined;
			}

			public void setMaxRowsExamined(Long maxRowsExamined) {
				this.maxRowsExamined = maxRowsExamined;
			}

			public Double getAvgRowsExamined() {
				return this.avgRowsExamined;
			}

			public void setAvgRowsExamined(Double avgRowsExamined) {
				this.avgRowsExamined = avgRowsExamined;
			}

			public Long getMaxRowsSent() {
				return this.maxRowsSent;
			}

			public void setMaxRowsSent(Long maxRowsSent) {
				this.maxRowsSent = maxRowsSent;
			}

			public Double getAvgRowsSent() {
				return this.avgRowsSent;
			}

			public void setAvgRowsSent(Double avgRowsSent) {
				this.avgRowsSent = avgRowsSent;
			}

			public Long getMaxRowsAffected() {
				return this.maxRowsAffected;
			}

			public void setMaxRowsAffected(Long maxRowsAffected) {
				this.maxRowsAffected = maxRowsAffected;
			}

			public Double getAvgRowsAffected() {
				return this.avgRowsAffected;
			}

			public void setAvgRowsAffected(Double avgRowsAffected) {
				this.avgRowsAffected = avgRowsAffected;
			}

			public List<Rules> getRuleList() {
				return this.ruleList;
			}

			public void setRuleList(List<Rules> ruleList) {
				this.ruleList = ruleList;
			}

			public static class Rules {

				private String name;

				private String type;

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}
			}
		}
	}

	@Override
	public GetQueryOptimizeDataStatsResponse getInstance(UnmarshallerContext context) {
		return	GetQueryOptimizeDataStatsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
