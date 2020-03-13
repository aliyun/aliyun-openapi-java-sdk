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
import com.aliyuncs.sofa.transform.v20190815.QueryTSTriggerInstanceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryTSTriggerInstanceResponse extends AcsResponse {

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

		private String activityInstanceId;

		private Long consume;

		private String context;

		private String gmtEnd;

		private String gmtExpectTrigger;

		private String gmtModify;

		private String gmtTrigger;

		private Long id;

		private Long jobItemId;

		private String jobName;

		private String jobType;

		private String jobZone;

		private String msg;

		private String operator;

		private String requestId;

		private Long shardingCount;

		private String status;

		private String type;

		private List<String> handlers;

		private RuntimeConfig runtimeConfig;

		public String getActivityInstanceId() {
			return this.activityInstanceId;
		}

		public void setActivityInstanceId(String activityInstanceId) {
			this.activityInstanceId = activityInstanceId;
		}

		public Long getConsume() {
			return this.consume;
		}

		public void setConsume(Long consume) {
			this.consume = consume;
		}

		public String getContext() {
			return this.context;
		}

		public void setContext(String context) {
			this.context = context;
		}

		public String getGmtEnd() {
			return this.gmtEnd;
		}

		public void setGmtEnd(String gmtEnd) {
			this.gmtEnd = gmtEnd;
		}

		public String getGmtExpectTrigger() {
			return this.gmtExpectTrigger;
		}

		public void setGmtExpectTrigger(String gmtExpectTrigger) {
			this.gmtExpectTrigger = gmtExpectTrigger;
		}

		public String getGmtModify() {
			return this.gmtModify;
		}

		public void setGmtModify(String gmtModify) {
			this.gmtModify = gmtModify;
		}

		public String getGmtTrigger() {
			return this.gmtTrigger;
		}

		public void setGmtTrigger(String gmtTrigger) {
			this.gmtTrigger = gmtTrigger;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Long getJobItemId() {
			return this.jobItemId;
		}

		public void setJobItemId(Long jobItemId) {
			this.jobItemId = jobItemId;
		}

		public String getJobName() {
			return this.jobName;
		}

		public void setJobName(String jobName) {
			this.jobName = jobName;
		}

		public String getJobType() {
			return this.jobType;
		}

		public void setJobType(String jobType) {
			this.jobType = jobType;
		}

		public String getJobZone() {
			return this.jobZone;
		}

		public void setJobZone(String jobZone) {
			this.jobZone = jobZone;
		}

		public String getMsg() {
			return this.msg;
		}

		public void setMsg(String msg) {
			this.msg = msg;
		}

		public String getOperator() {
			return this.operator;
		}

		public void setOperator(String operator) {
			this.operator = operator;
		}

		public String getRequestId() {
			return this.requestId;
		}

		public void setRequestId(String requestId) {
			this.requestId = requestId;
		}

		public Long getShardingCount() {
			return this.shardingCount;
		}

		public void setShardingCount(Long shardingCount) {
			this.shardingCount = shardingCount;
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

		public List<String> getHandlers() {
			return this.handlers;
		}

		public void setHandlers(List<String> handlers) {
			this.handlers = handlers;
		}

		public RuntimeConfig getRuntimeConfig() {
			return this.runtimeConfig;
		}

		public void setRuntimeConfig(RuntimeConfig runtimeConfig) {
			this.runtimeConfig = runtimeConfig;
		}

		public static class RuntimeConfig {

			private String maxExecutingChunks;

			private Long maxExecutingChunksPerClient;

			private Long permitsPerSecond;

			private Long tolerateProcessFailedCount;

			public String getMaxExecutingChunks() {
				return this.maxExecutingChunks;
			}

			public void setMaxExecutingChunks(String maxExecutingChunks) {
				this.maxExecutingChunks = maxExecutingChunks;
			}

			public Long getMaxExecutingChunksPerClient() {
				return this.maxExecutingChunksPerClient;
			}

			public void setMaxExecutingChunksPerClient(Long maxExecutingChunksPerClient) {
				this.maxExecutingChunksPerClient = maxExecutingChunksPerClient;
			}

			public Long getPermitsPerSecond() {
				return this.permitsPerSecond;
			}

			public void setPermitsPerSecond(Long permitsPerSecond) {
				this.permitsPerSecond = permitsPerSecond;
			}

			public Long getTolerateProcessFailedCount() {
				return this.tolerateProcessFailedCount;
			}

			public void setTolerateProcessFailedCount(Long tolerateProcessFailedCount) {
				this.tolerateProcessFailedCount = tolerateProcessFailedCount;
			}
		}
	}

	@Override
	public QueryTSTriggerInstanceResponse getInstance(UnmarshallerContext context) {
		return	QueryTSTriggerInstanceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
