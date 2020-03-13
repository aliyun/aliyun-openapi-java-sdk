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
import com.aliyuncs.sofa.transform.v20190815.QueryTSJobsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryTSJobsResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private Long pageNum;

	private Long pageSize;

	private Long totalCount;

	private List<ListItem> list;

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

	public Long getPageNum() {
		return this.pageNum;
	}

	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public List<ListItem> getList() {
		return this.list;
	}

	public void setList(List<ListItem> list) {
		this.list = list;
	}

	public static class ListItem {

		private String app;

		private String countOfActiveZone;

		private String countOfClient;

		private String cron;

		private String des;

		private Boolean exclusive;

		private String failHandleStrategy;

		private String gmtCreate;

		private String groupId;

		private String groupName;

		private Long id;

		private String instanceId;

		private String invokeType;

		private Long jobId;

		private Long jobItemId;

		private String jobZone;

		private String maxExecutingChunks;

		private String maxExecutingChunksPerClient;

		private String misfireStrategy;

		private String name;

		private String operator;

		private String permitsPerSecond;

		private String priority;

		private String routeStrategy;

		private String shardingCount;

		private Long sleepTime;

		private String status;

		private Long timeout;

		private String timeoutStrategy;

		private String timeUnit;

		private String timeZone;

		private String tolerateProcessFailedCount;

		private String totalZone;

		private String triggerMode;

		private String triggerType;

		private String type;

		private List<String> handlers;

		private CustomParams customParams;

		public String getApp() {
			return this.app;
		}

		public void setApp(String app) {
			this.app = app;
		}

		public String getCountOfActiveZone() {
			return this.countOfActiveZone;
		}

		public void setCountOfActiveZone(String countOfActiveZone) {
			this.countOfActiveZone = countOfActiveZone;
		}

		public String getCountOfClient() {
			return this.countOfClient;
		}

		public void setCountOfClient(String countOfClient) {
			this.countOfClient = countOfClient;
		}

		public String getCron() {
			return this.cron;
		}

		public void setCron(String cron) {
			this.cron = cron;
		}

		public String getDes() {
			return this.des;
		}

		public void setDes(String des) {
			this.des = des;
		}

		public Boolean getExclusive() {
			return this.exclusive;
		}

		public void setExclusive(Boolean exclusive) {
			this.exclusive = exclusive;
		}

		public String getFailHandleStrategy() {
			return this.failHandleStrategy;
		}

		public void setFailHandleStrategy(String failHandleStrategy) {
			this.failHandleStrategy = failHandleStrategy;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getGroupId() {
			return this.groupId;
		}

		public void setGroupId(String groupId) {
			this.groupId = groupId;
		}

		public String getGroupName() {
			return this.groupName;
		}

		public void setGroupName(String groupName) {
			this.groupName = groupName;
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

		public String getInvokeType() {
			return this.invokeType;
		}

		public void setInvokeType(String invokeType) {
			this.invokeType = invokeType;
		}

		public Long getJobId() {
			return this.jobId;
		}

		public void setJobId(Long jobId) {
			this.jobId = jobId;
		}

		public Long getJobItemId() {
			return this.jobItemId;
		}

		public void setJobItemId(Long jobItemId) {
			this.jobItemId = jobItemId;
		}

		public String getJobZone() {
			return this.jobZone;
		}

		public void setJobZone(String jobZone) {
			this.jobZone = jobZone;
		}

		public String getMaxExecutingChunks() {
			return this.maxExecutingChunks;
		}

		public void setMaxExecutingChunks(String maxExecutingChunks) {
			this.maxExecutingChunks = maxExecutingChunks;
		}

		public String getMaxExecutingChunksPerClient() {
			return this.maxExecutingChunksPerClient;
		}

		public void setMaxExecutingChunksPerClient(String maxExecutingChunksPerClient) {
			this.maxExecutingChunksPerClient = maxExecutingChunksPerClient;
		}

		public String getMisfireStrategy() {
			return this.misfireStrategy;
		}

		public void setMisfireStrategy(String misfireStrategy) {
			this.misfireStrategy = misfireStrategy;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getOperator() {
			return this.operator;
		}

		public void setOperator(String operator) {
			this.operator = operator;
		}

		public String getPermitsPerSecond() {
			return this.permitsPerSecond;
		}

		public void setPermitsPerSecond(String permitsPerSecond) {
			this.permitsPerSecond = permitsPerSecond;
		}

		public String getPriority() {
			return this.priority;
		}

		public void setPriority(String priority) {
			this.priority = priority;
		}

		public String getRouteStrategy() {
			return this.routeStrategy;
		}

		public void setRouteStrategy(String routeStrategy) {
			this.routeStrategy = routeStrategy;
		}

		public String getShardingCount() {
			return this.shardingCount;
		}

		public void setShardingCount(String shardingCount) {
			this.shardingCount = shardingCount;
		}

		public Long getSleepTime() {
			return this.sleepTime;
		}

		public void setSleepTime(Long sleepTime) {
			this.sleepTime = sleepTime;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Long getTimeout() {
			return this.timeout;
		}

		public void setTimeout(Long timeout) {
			this.timeout = timeout;
		}

		public String getTimeoutStrategy() {
			return this.timeoutStrategy;
		}

		public void setTimeoutStrategy(String timeoutStrategy) {
			this.timeoutStrategy = timeoutStrategy;
		}

		public String getTimeUnit() {
			return this.timeUnit;
		}

		public void setTimeUnit(String timeUnit) {
			this.timeUnit = timeUnit;
		}

		public String getTimeZone() {
			return this.timeZone;
		}

		public void setTimeZone(String timeZone) {
			this.timeZone = timeZone;
		}

		public String getTolerateProcessFailedCount() {
			return this.tolerateProcessFailedCount;
		}

		public void setTolerateProcessFailedCount(String tolerateProcessFailedCount) {
			this.tolerateProcessFailedCount = tolerateProcessFailedCount;
		}

		public String getTotalZone() {
			return this.totalZone;
		}

		public void setTotalZone(String totalZone) {
			this.totalZone = totalZone;
		}

		public String getTriggerMode() {
			return this.triggerMode;
		}

		public void setTriggerMode(String triggerMode) {
			this.triggerMode = triggerMode;
		}

		public String getTriggerType() {
			return this.triggerType;
		}

		public void setTriggerType(String triggerType) {
			this.triggerType = triggerType;
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

		public CustomParams getCustomParams() {
			return this.customParams;
		}

		public void setCustomParams(CustomParams customParams) {
			this.customParams = customParams;
		}

		public static class CustomParams {

			private String paramKey;

			private String paramType;

			private String paramValue;

			public String getParamKey() {
				return this.paramKey;
			}

			public void setParamKey(String paramKey) {
				this.paramKey = paramKey;
			}

			public String getParamType() {
				return this.paramType;
			}

			public void setParamType(String paramType) {
				this.paramType = paramType;
			}

			public String getParamValue() {
				return this.paramValue;
			}

			public void setParamValue(String paramValue) {
				this.paramValue = paramValue;
			}
		}
	}

	@Override
	public QueryTSJobsResponse getInstance(UnmarshallerContext context) {
		return	QueryTSJobsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
