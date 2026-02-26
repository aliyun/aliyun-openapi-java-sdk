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

package com.aliyuncs.cloud_siem.model.v20220616;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloud_siem.transform.v20220616.ListDataSourceLogsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDataSourceLogsResponse extends AcsResponse {

	private String requestId;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long subUserId;

		private String dataSourceInstanceId;

		private String dataSourceInstanceName;

		private String dataSourceInstanceRemark;

		private String accountId;

		private String cloudCode;

		private List<DataSourceInstanceLog> dataSourceInstanceLogs;

		public Long getSubUserId() {
			return this.subUserId;
		}

		public void setSubUserId(Long subUserId) {
			this.subUserId = subUserId;
		}

		public String getDataSourceInstanceId() {
			return this.dataSourceInstanceId;
		}

		public void setDataSourceInstanceId(String dataSourceInstanceId) {
			this.dataSourceInstanceId = dataSourceInstanceId;
		}

		public String getDataSourceInstanceName() {
			return this.dataSourceInstanceName;
		}

		public void setDataSourceInstanceName(String dataSourceInstanceName) {
			this.dataSourceInstanceName = dataSourceInstanceName;
		}

		public String getDataSourceInstanceRemark() {
			return this.dataSourceInstanceRemark;
		}

		public void setDataSourceInstanceRemark(String dataSourceInstanceRemark) {
			this.dataSourceInstanceRemark = dataSourceInstanceRemark;
		}

		public String getAccountId() {
			return this.accountId;
		}

		public void setAccountId(String accountId) {
			this.accountId = accountId;
		}

		public String getCloudCode() {
			return this.cloudCode;
		}

		public void setCloudCode(String cloudCode) {
			this.cloudCode = cloudCode;
		}

		public List<DataSourceInstanceLog> getDataSourceInstanceLogs() {
			return this.dataSourceInstanceLogs;
		}

		public void setDataSourceInstanceLogs(List<DataSourceInstanceLog> dataSourceInstanceLogs) {
			this.dataSourceInstanceLogs = dataSourceInstanceLogs;
		}

		public static class DataSourceInstanceLog {

			private String logInstanceId;

			private String logCode;

			private String logMdsCode;

			private Integer taskStatus;

			private List<LogParam> logParams;

			public String getLogInstanceId() {
				return this.logInstanceId;
			}

			public void setLogInstanceId(String logInstanceId) {
				this.logInstanceId = logInstanceId;
			}

			public String getLogCode() {
				return this.logCode;
			}

			public void setLogCode(String logCode) {
				this.logCode = logCode;
			}

			public String getLogMdsCode() {
				return this.logMdsCode;
			}

			public void setLogMdsCode(String logMdsCode) {
				this.logMdsCode = logMdsCode;
			}

			public Integer getTaskStatus() {
				return this.taskStatus;
			}

			public void setTaskStatus(Integer taskStatus) {
				this.taskStatus = taskStatus;
			}

			public List<LogParam> getLogParams() {
				return this.logParams;
			}

			public void setLogParams(List<LogParam> logParams) {
				this.logParams = logParams;
			}

			public static class LogParam {

				private String paraCode;

				private String paraValue;

				public String getParaCode() {
					return this.paraCode;
				}

				public void setParaCode(String paraCode) {
					this.paraCode = paraCode;
				}

				public String getParaValue() {
					return this.paraValue;
				}

				public void setParaValue(String paraValue) {
					this.paraValue = paraValue;
				}
			}
		}
	}

	@Override
	public ListDataSourceLogsResponse getInstance(UnmarshallerContext context) {
		return	ListDataSourceLogsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
