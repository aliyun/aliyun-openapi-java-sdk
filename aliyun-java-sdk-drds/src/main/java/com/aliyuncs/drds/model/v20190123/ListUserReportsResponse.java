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
import com.aliyuncs.drds.transform.v20190123.ListUserReportsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListUserReportsResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private SqlComparisonReport sqlComparisonReport;

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

	public SqlComparisonReport getSqlComparisonReport() {
		return this.sqlComparisonReport;
	}

	public void setSqlComparisonReport(SqlComparisonReport sqlComparisonReport) {
		this.sqlComparisonReport = sqlComparisonReport;
	}

	public static class SqlComparisonReport {

		private Long sqlPassFailNum;

		private String sqlPassRate;

		private Long sqlPassSuccNum;

		private String version;

		private List<ExecuteDetail> executeDetailList;

		public Long getSqlPassFailNum() {
			return this.sqlPassFailNum;
		}

		public void setSqlPassFailNum(Long sqlPassFailNum) {
			this.sqlPassFailNum = sqlPassFailNum;
		}

		public String getSqlPassRate() {
			return this.sqlPassRate;
		}

		public void setSqlPassRate(String sqlPassRate) {
			this.sqlPassRate = sqlPassRate;
		}

		public Long getSqlPassSuccNum() {
			return this.sqlPassSuccNum;
		}

		public void setSqlPassSuccNum(Long sqlPassSuccNum) {
			this.sqlPassSuccNum = sqlPassSuccNum;
		}

		public String getVersion() {
			return this.version;
		}

		public void setVersion(String version) {
			this.version = version;
		}

		public List<ExecuteDetail> getExecuteDetailList() {
			return this.executeDetailList;
		}

		public void setExecuteDetailList(List<ExecuteDetail> executeDetailList) {
			this.executeDetailList = executeDetailList;
		}

		public static class ExecuteDetail {

			private String execDetailMsg;

			private String execute;

			private String sqlContent;

			private String dbName;

			public String getExecDetailMsg() {
				return this.execDetailMsg;
			}

			public void setExecDetailMsg(String execDetailMsg) {
				this.execDetailMsg = execDetailMsg;
			}

			public String getExecute() {
				return this.execute;
			}

			public void setExecute(String execute) {
				this.execute = execute;
			}

			public String getSqlContent() {
				return this.sqlContent;
			}

			public void setSqlContent(String sqlContent) {
				this.sqlContent = sqlContent;
			}

			public String getDbName() {
				return this.dbName;
			}

			public void setDbName(String dbName) {
				this.dbName = dbName;
			}
		}
	}

	@Override
	public ListUserReportsResponse getInstance(UnmarshallerContext context) {
		return	ListUserReportsResponseUnmarshaller.unmarshall(this, context);
	}
}
