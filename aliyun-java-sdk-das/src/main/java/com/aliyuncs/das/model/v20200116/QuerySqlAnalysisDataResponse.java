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
import com.aliyuncs.das.transform.v20200116.QuerySqlAnalysisDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QuerySqlAnalysisDataResponse extends AcsResponse {

	private String message;

	private String requestId;

	private Long code;

	private Boolean success;

	private Data data;

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

	public Long getCode() {
		return this.code;
	}

	public void setCode(Long code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
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

		private List<ListItem> list;

		public Long getTotal() {
			return this.total;
		}

		public void setTotal(Long total) {
			this.total = total;
		}

		public List<ListItem> getList() {
			return this.list;
		}

		public void setList(List<ListItem> list) {
			this.list = list;
		}

		public static class ListItem {

			private Long avgRowsExamined;

			private Double avgRt;

			private Long cnt;

			private Long currentEndTime;

			private String dbName;

			private Long errorCnt;

			private Long firstTime;

			private String instanceId;

			private Long maxRowsExamined;

			private String sql;

			private String sqlId;

			private String sqlTextFeature;

			private String sqlType;

			private Double sumRt;

			private String tableList;

			private String taskId;

			private String type;

			private String userId;

			public Long getAvgRowsExamined() {
				return this.avgRowsExamined;
			}

			public void setAvgRowsExamined(Long avgRowsExamined) {
				this.avgRowsExamined = avgRowsExamined;
			}

			public Double getAvgRt() {
				return this.avgRt;
			}

			public void setAvgRt(Double avgRt) {
				this.avgRt = avgRt;
			}

			public Long getCnt() {
				return this.cnt;
			}

			public void setCnt(Long cnt) {
				this.cnt = cnt;
			}

			public Long getCurrentEndTime() {
				return this.currentEndTime;
			}

			public void setCurrentEndTime(Long currentEndTime) {
				this.currentEndTime = currentEndTime;
			}

			public String getDbName() {
				return this.dbName;
			}

			public void setDbName(String dbName) {
				this.dbName = dbName;
			}

			public Long getErrorCnt() {
				return this.errorCnt;
			}

			public void setErrorCnt(Long errorCnt) {
				this.errorCnt = errorCnt;
			}

			public Long getFirstTime() {
				return this.firstTime;
			}

			public void setFirstTime(Long firstTime) {
				this.firstTime = firstTime;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public Long getMaxRowsExamined() {
				return this.maxRowsExamined;
			}

			public void setMaxRowsExamined(Long maxRowsExamined) {
				this.maxRowsExamined = maxRowsExamined;
			}

			public String getSql() {
				return this.sql;
			}

			public void setSql(String sql) {
				this.sql = sql;
			}

			public String getSqlId() {
				return this.sqlId;
			}

			public void setSqlId(String sqlId) {
				this.sqlId = sqlId;
			}

			public String getSqlTextFeature() {
				return this.sqlTextFeature;
			}

			public void setSqlTextFeature(String sqlTextFeature) {
				this.sqlTextFeature = sqlTextFeature;
			}

			public String getSqlType() {
				return this.sqlType;
			}

			public void setSqlType(String sqlType) {
				this.sqlType = sqlType;
			}

			public Double getSumRt() {
				return this.sumRt;
			}

			public void setSumRt(Double sumRt) {
				this.sumRt = sumRt;
			}

			public String getTableList() {
				return this.tableList;
			}

			public void setTableList(String tableList) {
				this.tableList = tableList;
			}

			public String getTaskId() {
				return this.taskId;
			}

			public void setTaskId(String taskId) {
				this.taskId = taskId;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}
		}
	}

	@Override
	public QuerySqlAnalysisDataResponse getInstance(UnmarshallerContext context) {
		return	QuerySqlAnalysisDataResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
