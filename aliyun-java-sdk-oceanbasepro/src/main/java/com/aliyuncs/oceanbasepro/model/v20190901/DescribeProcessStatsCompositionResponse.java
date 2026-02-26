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
import com.aliyuncs.oceanbasepro.transform.v20190901.DescribeProcessStatsCompositionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeProcessStatsCompositionResponse extends AcsResponse {

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

		private Long totalSessionCount;

		private Long activeSessionCount;

		private Long idleSessionCount;

		private String obVersion;

		private List<AllProcessListItem> allProcessList;

		private SessionStatistics sessionStatistics;

		public Long getTotalSessionCount() {
			return this.totalSessionCount;
		}

		public void setTotalSessionCount(Long totalSessionCount) {
			this.totalSessionCount = totalSessionCount;
		}

		public Long getActiveSessionCount() {
			return this.activeSessionCount;
		}

		public void setActiveSessionCount(Long activeSessionCount) {
			this.activeSessionCount = activeSessionCount;
		}

		public Long getIdleSessionCount() {
			return this.idleSessionCount;
		}

		public void setIdleSessionCount(Long idleSessionCount) {
			this.idleSessionCount = idleSessionCount;
		}

		public String getObVersion() {
			return this.obVersion;
		}

		public void setObVersion(String obVersion) {
			this.obVersion = obVersion;
		}

		public List<AllProcessListItem> getAllProcessList() {
			return this.allProcessList;
		}

		public void setAllProcessList(List<AllProcessListItem> allProcessList) {
			this.allProcessList = allProcessList;
		}

		public SessionStatistics getSessionStatistics() {
			return this.sessionStatistics;
		}

		public void setSessionStatistics(SessionStatistics sessionStatistics) {
			this.sessionStatistics = sessionStatistics;
		}

		public static class AllProcessListItem {

			private String sqlText;

			private String tenantId;

			private String database;

			private String user;

			private Long executeTime;

			private Long cpuTime;

			private String serverIp;

			private String clientIp;

			private Long sessionId;

			private String proxySessId;

			private String command;

			private String status;

			private String sqlId;

			private String traceId;

			private Long planId;

			private Boolean dynamicSql;

			private String serverSn;

			private List<ProcessSqlListsItem> processSqlLists;

			public String getSqlText() {
				return this.sqlText;
			}

			public void setSqlText(String sqlText) {
				this.sqlText = sqlText;
			}

			public String getTenantId() {
				return this.tenantId;
			}

			public void setTenantId(String tenantId) {
				this.tenantId = tenantId;
			}

			public String getDatabase() {
				return this.database;
			}

			public void setDatabase(String database) {
				this.database = database;
			}

			public String getUser() {
				return this.user;
			}

			public void setUser(String user) {
				this.user = user;
			}

			public Long getExecuteTime() {
				return this.executeTime;
			}

			public void setExecuteTime(Long executeTime) {
				this.executeTime = executeTime;
			}

			public Long getCpuTime() {
				return this.cpuTime;
			}

			public void setCpuTime(Long cpuTime) {
				this.cpuTime = cpuTime;
			}

			public String getServerIp() {
				return this.serverIp;
			}

			public void setServerIp(String serverIp) {
				this.serverIp = serverIp;
			}

			public String getClientIp() {
				return this.clientIp;
			}

			public void setClientIp(String clientIp) {
				this.clientIp = clientIp;
			}

			public Long getSessionId() {
				return this.sessionId;
			}

			public void setSessionId(Long sessionId) {
				this.sessionId = sessionId;
			}

			public String getProxySessId() {
				return this.proxySessId;
			}

			public void setProxySessId(String proxySessId) {
				this.proxySessId = proxySessId;
			}

			public String getCommand() {
				return this.command;
			}

			public void setCommand(String command) {
				this.command = command;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getSqlId() {
				return this.sqlId;
			}

			public void setSqlId(String sqlId) {
				this.sqlId = sqlId;
			}

			public String getTraceId() {
				return this.traceId;
			}

			public void setTraceId(String traceId) {
				this.traceId = traceId;
			}

			public Long getPlanId() {
				return this.planId;
			}

			public void setPlanId(Long planId) {
				this.planId = planId;
			}

			public Boolean getDynamicSql() {
				return this.dynamicSql;
			}

			public void setDynamicSql(Boolean dynamicSql) {
				this.dynamicSql = dynamicSql;
			}

			public String getServerSn() {
				return this.serverSn;
			}

			public void setServerSn(String serverSn) {
				this.serverSn = serverSn;
			}

			public List<ProcessSqlListsItem> getProcessSqlLists() {
				return this.processSqlLists;
			}

			public void setProcessSqlLists(List<ProcessSqlListsItem> processSqlLists) {
				this.processSqlLists = processSqlLists;
			}

			public static class ProcessSqlListsItem {

				private String sqlText;

				private String tenantId;

				private String database;

				private String user;

				private Long executeTime;

				private Long cpuTime;

				private String serverIp;

				private String clientIp;

				private Long sessionId;

				private String proxySessId;

				private String command;

				private String status;

				private String sqlId;

				private String traceId;

				private Long planId;

				private Boolean dynamicSql;

				private List<ProcessSqlListItem> processSqlList;

				public String getSqlText() {
					return this.sqlText;
				}

				public void setSqlText(String sqlText) {
					this.sqlText = sqlText;
				}

				public String getTenantId() {
					return this.tenantId;
				}

				public void setTenantId(String tenantId) {
					this.tenantId = tenantId;
				}

				public String getDatabase() {
					return this.database;
				}

				public void setDatabase(String database) {
					this.database = database;
				}

				public String getUser() {
					return this.user;
				}

				public void setUser(String user) {
					this.user = user;
				}

				public Long getExecuteTime() {
					return this.executeTime;
				}

				public void setExecuteTime(Long executeTime) {
					this.executeTime = executeTime;
				}

				public Long getCpuTime() {
					return this.cpuTime;
				}

				public void setCpuTime(Long cpuTime) {
					this.cpuTime = cpuTime;
				}

				public String getServerIp() {
					return this.serverIp;
				}

				public void setServerIp(String serverIp) {
					this.serverIp = serverIp;
				}

				public String getClientIp() {
					return this.clientIp;
				}

				public void setClientIp(String clientIp) {
					this.clientIp = clientIp;
				}

				public Long getSessionId() {
					return this.sessionId;
				}

				public void setSessionId(Long sessionId) {
					this.sessionId = sessionId;
				}

				public String getProxySessId() {
					return this.proxySessId;
				}

				public void setProxySessId(String proxySessId) {
					this.proxySessId = proxySessId;
				}

				public String getCommand() {
					return this.command;
				}

				public void setCommand(String command) {
					this.command = command;
				}

				public String getStatus() {
					return this.status;
				}

				public void setStatus(String status) {
					this.status = status;
				}

				public String getSqlId() {
					return this.sqlId;
				}

				public void setSqlId(String sqlId) {
					this.sqlId = sqlId;
				}

				public String getTraceId() {
					return this.traceId;
				}

				public void setTraceId(String traceId) {
					this.traceId = traceId;
				}

				public Long getPlanId() {
					return this.planId;
				}

				public void setPlanId(Long planId) {
					this.planId = planId;
				}

				public Boolean getDynamicSql() {
					return this.dynamicSql;
				}

				public void setDynamicSql(Boolean dynamicSql) {
					this.dynamicSql = dynamicSql;
				}

				public List<ProcessSqlListItem> getProcessSqlList() {
					return this.processSqlList;
				}

				public void setProcessSqlList(List<ProcessSqlListItem> processSqlList) {
					this.processSqlList = processSqlList;
				}

				public static class ProcessSqlListItem {

					private String sqlText;

					private String tenantId;

					private String database;

					private String user;

					private Long executeTime;

					private Long cpuTime;

					private String serverIp;

					private String clientIp;

					private Long sessionId;

					private String proxySessId;

					private String command;

					private String status;

					private String sqlId;

					private String traceId;

					private Long planId;

					private Boolean dynamicSql;

					public String getSqlText() {
						return this.sqlText;
					}

					public void setSqlText(String sqlText) {
						this.sqlText = sqlText;
					}

					public String getTenantId() {
						return this.tenantId;
					}

					public void setTenantId(String tenantId) {
						this.tenantId = tenantId;
					}

					public String getDatabase() {
						return this.database;
					}

					public void setDatabase(String database) {
						this.database = database;
					}

					public String getUser() {
						return this.user;
					}

					public void setUser(String user) {
						this.user = user;
					}

					public Long getExecuteTime() {
						return this.executeTime;
					}

					public void setExecuteTime(Long executeTime) {
						this.executeTime = executeTime;
					}

					public Long getCpuTime() {
						return this.cpuTime;
					}

					public void setCpuTime(Long cpuTime) {
						this.cpuTime = cpuTime;
					}

					public String getServerIp() {
						return this.serverIp;
					}

					public void setServerIp(String serverIp) {
						this.serverIp = serverIp;
					}

					public String getClientIp() {
						return this.clientIp;
					}

					public void setClientIp(String clientIp) {
						this.clientIp = clientIp;
					}

					public Long getSessionId() {
						return this.sessionId;
					}

					public void setSessionId(Long sessionId) {
						this.sessionId = sessionId;
					}

					public String getProxySessId() {
						return this.proxySessId;
					}

					public void setProxySessId(String proxySessId) {
						this.proxySessId = proxySessId;
					}

					public String getCommand() {
						return this.command;
					}

					public void setCommand(String command) {
						this.command = command;
					}

					public String getStatus() {
						return this.status;
					}

					public void setStatus(String status) {
						this.status = status;
					}

					public String getSqlId() {
						return this.sqlId;
					}

					public void setSqlId(String sqlId) {
						this.sqlId = sqlId;
					}

					public String getTraceId() {
						return this.traceId;
					}

					public void setTraceId(String traceId) {
						this.traceId = traceId;
					}

					public Long getPlanId() {
						return this.planId;
					}

					public void setPlanId(Long planId) {
						this.planId = planId;
					}

					public Boolean getDynamicSql() {
						return this.dynamicSql;
					}

					public void setDynamicSql(Boolean dynamicSql) {
						this.dynamicSql = dynamicSql;
					}
				}
			}
		}

		public static class SessionStatistics {

			private List<UserStatisticsItem> userStatistics;

			private List<SourceStatisticsItem> sourceStatistics;

			private List<DataBaseStatisticsItem> dataBaseStatistics;

			public List<UserStatisticsItem> getUserStatistics() {
				return this.userStatistics;
			}

			public void setUserStatistics(List<UserStatisticsItem> userStatistics) {
				this.userStatistics = userStatistics;
			}

			public List<SourceStatisticsItem> getSourceStatistics() {
				return this.sourceStatistics;
			}

			public void setSourceStatistics(List<SourceStatisticsItem> sourceStatistics) {
				this.sourceStatistics = sourceStatistics;
			}

			public List<DataBaseStatisticsItem> getDataBaseStatistics() {
				return this.dataBaseStatistics;
			}

			public void setDataBaseStatistics(List<DataBaseStatisticsItem> dataBaseStatistics) {
				this.dataBaseStatistics = dataBaseStatistics;
			}

			public static class UserStatisticsItem {

				private String metricValue;

				private Long activeCount;

				private Long totalCount;

				private String type;

				public String getMetricValue() {
					return this.metricValue;
				}

				public void setMetricValue(String metricValue) {
					this.metricValue = metricValue;
				}

				public Long getActiveCount() {
					return this.activeCount;
				}

				public void setActiveCount(Long activeCount) {
					this.activeCount = activeCount;
				}

				public Long getTotalCount() {
					return this.totalCount;
				}

				public void setTotalCount(Long totalCount) {
					this.totalCount = totalCount;
				}

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}
			}

			public static class SourceStatisticsItem {

				private String metricValue;

				private Long activeCount;

				private Long totalCount;

				private String type;

				public String getMetricValue() {
					return this.metricValue;
				}

				public void setMetricValue(String metricValue) {
					this.metricValue = metricValue;
				}

				public Long getActiveCount() {
					return this.activeCount;
				}

				public void setActiveCount(Long activeCount) {
					this.activeCount = activeCount;
				}

				public Long getTotalCount() {
					return this.totalCount;
				}

				public void setTotalCount(Long totalCount) {
					this.totalCount = totalCount;
				}

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}
			}

			public static class DataBaseStatisticsItem {

				private String metricValue;

				private Long activeCount;

				private Long totalCount;

				private String type;

				public String getMetricValue() {
					return this.metricValue;
				}

				public void setMetricValue(String metricValue) {
					this.metricValue = metricValue;
				}

				public Long getActiveCount() {
					return this.activeCount;
				}

				public void setActiveCount(Long activeCount) {
					this.activeCount = activeCount;
				}

				public Long getTotalCount() {
					return this.totalCount;
				}

				public void setTotalCount(Long totalCount) {
					this.totalCount = totalCount;
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
	public DescribeProcessStatsCompositionResponse getInstance(UnmarshallerContext context) {
		return	DescribeProcessStatsCompositionResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
