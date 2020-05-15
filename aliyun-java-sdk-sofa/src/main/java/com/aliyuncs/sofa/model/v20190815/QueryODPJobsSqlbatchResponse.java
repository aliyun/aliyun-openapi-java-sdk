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

package com.aliyuncs.sofa.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.QueryODPJobsSqlbatchResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryODPJobsSqlbatchResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String content;

		private String description;

		private String errorMsg;

		private String finishedExecutions;

		private String gmtCreate;

		private String gmtModified;

		private Long id;

		private String instanceId;

		private String lastEndTime;

		private String lastStartTime;

		private String name;

		private String schemaName;

		private String sqlJobMode;

		private String status;

		private String totalExecutions;

		private String type;

		private String userName;

		private String zdalproxyInstanceId;

		private List<SqlJobsItem> sqlJobs;

		public String getContent() {
			return this.content;
		}

		public void setContent(String content) {
			this.content = content;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getErrorMsg() {
			return this.errorMsg;
		}

		public void setErrorMsg(String errorMsg) {
			this.errorMsg = errorMsg;
		}

		public String getFinishedExecutions() {
			return this.finishedExecutions;
		}

		public void setFinishedExecutions(String finishedExecutions) {
			this.finishedExecutions = finishedExecutions;
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

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getLastEndTime() {
			return this.lastEndTime;
		}

		public void setLastEndTime(String lastEndTime) {
			this.lastEndTime = lastEndTime;
		}

		public String getLastStartTime() {
			return this.lastStartTime;
		}

		public void setLastStartTime(String lastStartTime) {
			this.lastStartTime = lastStartTime;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getSchemaName() {
			return this.schemaName;
		}

		public void setSchemaName(String schemaName) {
			this.schemaName = schemaName;
		}

		public String getSqlJobMode() {
			return this.sqlJobMode;
		}

		public void setSqlJobMode(String sqlJobMode) {
			this.sqlJobMode = sqlJobMode;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getTotalExecutions() {
			return this.totalExecutions;
		}

		public void setTotalExecutions(String totalExecutions) {
			this.totalExecutions = totalExecutions;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getUserName() {
			return this.userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getZdalproxyInstanceId() {
			return this.zdalproxyInstanceId;
		}

		public void setZdalproxyInstanceId(String zdalproxyInstanceId) {
			this.zdalproxyInstanceId = zdalproxyInstanceId;
		}

		public List<SqlJobsItem> getSqlJobs() {
			return this.sqlJobs;
		}

		public void setSqlJobs(List<SqlJobsItem> sqlJobs) {
			this.sqlJobs = sqlJobs;
		}

		public static class SqlJobsItem {

			private String cloudInstanceId;

			private String content;

			private String errorMsg;

			private String gmtCreate;

			private String gmtModified;

			private Long id;

			private String lastEndTime;

			private String lastStartTime;

			private Long sqlBatchJobId;

			private String status;

			private String type;

			private String variables;

			public String getCloudInstanceId() {
				return this.cloudInstanceId;
			}

			public void setCloudInstanceId(String cloudInstanceId) {
				this.cloudInstanceId = cloudInstanceId;
			}

			public String getContent() {
				return this.content;
			}

			public void setContent(String content) {
				this.content = content;
			}

			public String getErrorMsg() {
				return this.errorMsg;
			}

			public void setErrorMsg(String errorMsg) {
				this.errorMsg = errorMsg;
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

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getLastEndTime() {
				return this.lastEndTime;
			}

			public void setLastEndTime(String lastEndTime) {
				this.lastEndTime = lastEndTime;
			}

			public String getLastStartTime() {
				return this.lastStartTime;
			}

			public void setLastStartTime(String lastStartTime) {
				this.lastStartTime = lastStartTime;
			}

			public Long getSqlBatchJobId() {
				return this.sqlBatchJobId;
			}

			public void setSqlBatchJobId(Long sqlBatchJobId) {
				this.sqlBatchJobId = sqlBatchJobId;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getVariables() {
				return this.variables;
			}

			public void setVariables(String variables) {
				this.variables = variables;
			}
		}
	}

	@Override
	public QueryODPJobsSqlbatchResponse getInstance(UnmarshallerContext context) {
		return	QueryODPJobsSqlbatchResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
