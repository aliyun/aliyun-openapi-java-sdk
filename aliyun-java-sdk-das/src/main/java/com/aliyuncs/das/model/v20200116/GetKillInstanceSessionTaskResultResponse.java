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
import com.aliyuncs.das.transform.v20200116.GetKillInstanceSessionTaskResultResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetKillInstanceSessionTaskResultResponse extends AcsResponse {

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

		private String taskId;

		private String userId;

		private String instanceId;

		private String nodeId;

		private String taskState;

		private Long killSuccessCount;

		private Long killFailCount;

		private Long ignoredUserSessionCount;

		private List<ResultItem> result;

		private List<Long> sessions;

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getNodeId() {
			return this.nodeId;
		}

		public void setNodeId(String nodeId) {
			this.nodeId = nodeId;
		}

		public String getTaskState() {
			return this.taskState;
		}

		public void setTaskState(String taskState) {
			this.taskState = taskState;
		}

		public Long getKillSuccessCount() {
			return this.killSuccessCount;
		}

		public void setKillSuccessCount(Long killSuccessCount) {
			this.killSuccessCount = killSuccessCount;
		}

		public Long getKillFailCount() {
			return this.killFailCount;
		}

		public void setKillFailCount(Long killFailCount) {
			this.killFailCount = killFailCount;
		}

		public Long getIgnoredUserSessionCount() {
			return this.ignoredUserSessionCount;
		}

		public void setIgnoredUserSessionCount(Long ignoredUserSessionCount) {
			this.ignoredUserSessionCount = ignoredUserSessionCount;
		}

		public List<ResultItem> getResult() {
			return this.result;
		}

		public void setResult(List<ResultItem> result) {
			this.result = result;
		}

		public List<Long> getSessions() {
			return this.sessions;
		}

		public void setSessions(List<Long> sessions) {
			this.sessions = sessions;
		}

		public static class ResultItem {

			private Long id;

			private String user;

			private String host;

			private String db;

			private String command;

			private Long time;

			private String state;

			private String info;

			private Boolean active;

			private String taskId;

			private String reason;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getUser() {
				return this.user;
			}

			public void setUser(String user) {
				this.user = user;
			}

			public String getHost() {
				return this.host;
			}

			public void setHost(String host) {
				this.host = host;
			}

			public String getDb() {
				return this.db;
			}

			public void setDb(String db) {
				this.db = db;
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

			public String getInfo() {
				return this.info;
			}

			public void setInfo(String info) {
				this.info = info;
			}

			public Boolean getActive() {
				return this.active;
			}

			public void setActive(Boolean active) {
				this.active = active;
			}

			public String getTaskId() {
				return this.taskId;
			}

			public void setTaskId(String taskId) {
				this.taskId = taskId;
			}

			public String getReason() {
				return this.reason;
			}

			public void setReason(String reason) {
				this.reason = reason;
			}
		}
	}

	@Override
	public GetKillInstanceSessionTaskResultResponse getInstance(UnmarshallerContext context) {
		return	GetKillInstanceSessionTaskResultResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
