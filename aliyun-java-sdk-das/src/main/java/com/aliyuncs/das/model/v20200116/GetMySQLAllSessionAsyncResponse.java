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
import com.aliyuncs.das.transform.v20200116.GetMySQLAllSessionAsyncResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetMySQLAllSessionAsyncResponse extends AcsResponse {

	private Long code;

	private String message;

	private String requestId;

	private Boolean success;

	private Data data;

	public Long getCode() {
		return this.code;
	}

	public void setCode(Long code) {
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

		private Boolean fail;

		private String resultId;

		private Boolean isFinish;

		private String state;

		private Boolean complete;

		private Long timestamp;

		private SessionData sessionData;

		public Boolean getFail() {
			return this.fail;
		}

		public void setFail(Boolean fail) {
			this.fail = fail;
		}

		public String getResultId() {
			return this.resultId;
		}

		public void setResultId(String resultId) {
			this.resultId = resultId;
		}

		public Boolean getIsFinish() {
			return this.isFinish;
		}

		public void setIsFinish(Boolean isFinish) {
			this.isFinish = isFinish;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public Boolean getComplete() {
			return this.complete;
		}

		public void setComplete(Boolean complete) {
			this.complete = complete;
		}

		public Long getTimestamp() {
			return this.timestamp;
		}

		public void setTimestamp(Long timestamp) {
			this.timestamp = timestamp;
		}

		public SessionData getSessionData() {
			return this.sessionData;
		}

		public void setSessionData(SessionData sessionData) {
			this.sessionData = sessionData;
		}

		public static class SessionData {

			private Long totalSessionCount;

			private Long activeSessionCount;

			private Long maxActiveTime;

			private Long timeStamp;

			private List<SessionListItem> sessionList;

			private List<UserStatsItem> userStats;

			private List<ClientStatsItem> clientStats;

			private List<DbStatsItem> dbStats;

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

			public Long getMaxActiveTime() {
				return this.maxActiveTime;
			}

			public void setMaxActiveTime(Long maxActiveTime) {
				this.maxActiveTime = maxActiveTime;
			}

			public Long getTimeStamp() {
				return this.timeStamp;
			}

			public void setTimeStamp(Long timeStamp) {
				this.timeStamp = timeStamp;
			}

			public List<SessionListItem> getSessionList() {
				return this.sessionList;
			}

			public void setSessionList(List<SessionListItem> sessionList) {
				this.sessionList = sessionList;
			}

			public List<UserStatsItem> getUserStats() {
				return this.userStats;
			}

			public void setUserStats(List<UserStatsItem> userStats) {
				this.userStats = userStats;
			}

			public List<ClientStatsItem> getClientStats() {
				return this.clientStats;
			}

			public void setClientStats(List<ClientStatsItem> clientStats) {
				this.clientStats = clientStats;
			}

			public List<DbStatsItem> getDbStats() {
				return this.dbStats;
			}

			public void setDbStats(List<DbStatsItem> dbStats) {
				this.dbStats = dbStats;
			}

			public static class SessionListItem {

				private Long sessionId;

				private String user;

				private String client;

				private String dbName;

				private String command;

				private Long time;

				private String state;

				private String sqlText;

				private String userClientAlias;

				private String trxId;

				private Long trxDuration;

				public Long getSessionId() {
					return this.sessionId;
				}

				public void setSessionId(Long sessionId) {
					this.sessionId = sessionId;
				}

				public String getUser() {
					return this.user;
				}

				public void setUser(String user) {
					this.user = user;
				}

				public String getClient() {
					return this.client;
				}

				public void setClient(String client) {
					this.client = client;
				}

				public String getDbName() {
					return this.dbName;
				}

				public void setDbName(String dbName) {
					this.dbName = dbName;
				}

				public String getCommand() {
					return this.command;
				}

				public void setCommand(String command) {
					this.command = command;
				}

				public Long getTime() {
					return this.time;
				}

				public void setTime(Long time) {
					this.time = time;
				}

				public String getState() {
					return this.state;
				}

				public void setState(String state) {
					this.state = state;
				}

				public String getSqlText() {
					return this.sqlText;
				}

				public void setSqlText(String sqlText) {
					this.sqlText = sqlText;
				}

				public String getUserClientAlias() {
					return this.userClientAlias;
				}

				public void setUserClientAlias(String userClientAlias) {
					this.userClientAlias = userClientAlias;
				}

				public String getTrxId() {
					return this.trxId;
				}

				public void setTrxId(String trxId) {
					this.trxId = trxId;
				}

				public Long getTrxDuration() {
					return this.trxDuration;
				}

				public void setTrxDuration(Long trxDuration) {
					this.trxDuration = trxDuration;
				}
			}

			public static class UserStatsItem {

				private String key;

				private Long totalCount;

				private Long activeCount;

				private List<Long> threadIdList;

				private List<String> userList;

				public String getKey() {
					return this.key;
				}

				public void setKey(String key) {
					this.key = key;
				}

				public Long getTotalCount() {
					return this.totalCount;
				}

				public void setTotalCount(Long totalCount) {
					this.totalCount = totalCount;
				}

				public Long getActiveCount() {
					return this.activeCount;
				}

				public void setActiveCount(Long activeCount) {
					this.activeCount = activeCount;
				}

				public List<Long> getThreadIdList() {
					return this.threadIdList;
				}

				public void setThreadIdList(List<Long> threadIdList) {
					this.threadIdList = threadIdList;
				}

				public List<String> getUserList() {
					return this.userList;
				}

				public void setUserList(List<String> userList) {
					this.userList = userList;
				}
			}

			public static class ClientStatsItem {

				private String key;

				private Long totalCount;

				private Long activeCount;

				private List<Long> threadIdList1;

				private List<String> userList2;

				public String getKey() {
					return this.key;
				}

				public void setKey(String key) {
					this.key = key;
				}

				public Long getTotalCount() {
					return this.totalCount;
				}

				public void setTotalCount(Long totalCount) {
					this.totalCount = totalCount;
				}

				public Long getActiveCount() {
					return this.activeCount;
				}

				public void setActiveCount(Long activeCount) {
					this.activeCount = activeCount;
				}

				public List<Long> getThreadIdList1() {
					return this.threadIdList1;
				}

				public void setThreadIdList1(List<Long> threadIdList1) {
					this.threadIdList1 = threadIdList1;
				}

				public List<String> getUserList2() {
					return this.userList2;
				}

				public void setUserList2(List<String> userList2) {
					this.userList2 = userList2;
				}
			}

			public static class DbStatsItem {

				private String key;

				private Long totalCount;

				private Long activeCount;

				private List<Long> threadIdList3;

				private List<String> userList4;

				public String getKey() {
					return this.key;
				}

				public void setKey(String key) {
					this.key = key;
				}

				public Long getTotalCount() {
					return this.totalCount;
				}

				public void setTotalCount(Long totalCount) {
					this.totalCount = totalCount;
				}

				public Long getActiveCount() {
					return this.activeCount;
				}

				public void setActiveCount(Long activeCount) {
					this.activeCount = activeCount;
				}

				public List<Long> getThreadIdList3() {
					return this.threadIdList3;
				}

				public void setThreadIdList3(List<Long> threadIdList3) {
					this.threadIdList3 = threadIdList3;
				}

				public List<String> getUserList4() {
					return this.userList4;
				}

				public void setUserList4(List<String> userList4) {
					this.userList4 = userList4;
				}
			}
		}
	}

	@Override
	public GetMySQLAllSessionAsyncResponse getInstance(UnmarshallerContext context) {
		return	GetMySQLAllSessionAsyncResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
