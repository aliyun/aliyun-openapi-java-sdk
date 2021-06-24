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

package com.aliyuncs.ecsops.model.v20160401;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class OpsAddScheduledTaskRequest extends RpcAcsRequest<OpsAddScheduledTaskResponse> {
	   

	private Integer taskPendingTimeout;

	private String taskName;

	private Integer concurrentHandleCount;

	private Long aliUid;

	private Integer taskExecuteTimeout;

	private Integer size;

	private List<ScheduleFactory> scheduleFactorys;

	private String auditParamStr;
	public OpsAddScheduledTaskRequest() {
		super("Ecsops", "2016-04-01", "OpsAddScheduledTask", "ecsops");
		setMethod(MethodType.POST);
	}

	public Integer getTaskPendingTimeout() {
		return this.taskPendingTimeout;
	}

	public void setTaskPendingTimeout(Integer taskPendingTimeout) {
		this.taskPendingTimeout = taskPendingTimeout;
		if(taskPendingTimeout != null){
			putQueryParameter("TaskPendingTimeout", taskPendingTimeout.toString());
		}
	}

	public String getTaskName() {
		return this.taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
		if(taskName != null){
			putQueryParameter("TaskName", taskName);
		}
	}

	public Integer getConcurrentHandleCount() {
		return this.concurrentHandleCount;
	}

	public void setConcurrentHandleCount(Integer concurrentHandleCount) {
		this.concurrentHandleCount = concurrentHandleCount;
		if(concurrentHandleCount != null){
			putQueryParameter("ConcurrentHandleCount", concurrentHandleCount.toString());
		}
	}

	public Long getAliUid() {
		return this.aliUid;
	}

	public void setAliUid(Long aliUid) {
		this.aliUid = aliUid;
		if(aliUid != null){
			putQueryParameter("AliUid", aliUid.toString());
		}
	}

	public Integer getTaskExecuteTimeout() {
		return this.taskExecuteTimeout;
	}

	public void setTaskExecuteTimeout(Integer taskExecuteTimeout) {
		this.taskExecuteTimeout = taskExecuteTimeout;
		if(taskExecuteTimeout != null){
			putQueryParameter("TaskExecuteTimeout", taskExecuteTimeout.toString());
		}
	}

	public Integer getSize() {
		return this.size;
	}

	public void setSize(Integer size) {
		this.size = size;
		if(size != null){
			putQueryParameter("Size", size.toString());
		}
	}

	public List<ScheduleFactory> getScheduleFactorys() {
		return this.scheduleFactorys;
	}

	public void setScheduleFactorys(List<ScheduleFactory> scheduleFactorys) {
		this.scheduleFactorys = scheduleFactorys;	
		if (scheduleFactorys != null) {
			for (int depth1 = 0; depth1 < scheduleFactorys.size(); depth1++) {
				putQueryParameter("ScheduleFactory." + (depth1 + 1) + ".MaxSize" , scheduleFactorys.get(depth1).getMaxSize());
				putQueryParameter("ScheduleFactory." + (depth1 + 1) + ".TaskName" , scheduleFactorys.get(depth1).getTaskName());
				putQueryParameter("ScheduleFactory." + (depth1 + 1) + ".ConcurrentSize" , scheduleFactorys.get(depth1).getConcurrentSize());
				if (scheduleFactorys.get(depth1).getScheduleConfigs() != null) {
					for (int depth2 = 0; depth2 < scheduleFactorys.get(depth1).getScheduleConfigs().size(); depth2++) {
						putQueryParameter("ScheduleFactory." + (depth1 + 1) + ".ScheduleConfig." + (depth2 + 1) + ".MaxSize" , scheduleFactorys.get(depth1).getScheduleConfigs().get(depth2).getMaxSize());
						putQueryParameter("ScheduleFactory." + (depth1 + 1) + ".ScheduleConfig." + (depth2 + 1) + ".ScheduleFactor" , scheduleFactorys.get(depth1).getScheduleConfigs().get(depth2).getScheduleFactor());
						putQueryParameter("ScheduleFactory." + (depth1 + 1) + ".ScheduleConfig." + (depth2 + 1) + ".ConcurrentSize" , scheduleFactorys.get(depth1).getScheduleConfigs().get(depth2).getConcurrentSize());
					}
				}
			}
		}	
	}

	public String getAuditParamStr() {
		return this.auditParamStr;
	}

	public void setAuditParamStr(String auditParamStr) {
		this.auditParamStr = auditParamStr;
		if(auditParamStr != null){
			putQueryParameter("AuditParamStr", auditParamStr);
		}
	}

	public static class ScheduleFactory {

		private Long maxSize;

		private String taskName;

		private Long concurrentSize;

		private List<ScheduleConfig> scheduleConfigs;

		public Long getMaxSize() {
			return this.maxSize;
		}

		public void setMaxSize(Long maxSize) {
			this.maxSize = maxSize;
		}

		public String getTaskName() {
			return this.taskName;
		}

		public void setTaskName(String taskName) {
			this.taskName = taskName;
		}

		public Long getConcurrentSize() {
			return this.concurrentSize;
		}

		public void setConcurrentSize(Long concurrentSize) {
			this.concurrentSize = concurrentSize;
		}

		public List<ScheduleConfig> getScheduleConfigs() {
			return this.scheduleConfigs;
		}

		public void setScheduleConfigs(List<ScheduleConfig> scheduleConfigs) {
			this.scheduleConfigs = scheduleConfigs;
		}

		public static class ScheduleConfig {

			private Long maxSize;

			private String scheduleFactor;

			private Long concurrentSize;

			public Long getMaxSize() {
				return this.maxSize;
			}

			public void setMaxSize(Long maxSize) {
				this.maxSize = maxSize;
			}

			public String getScheduleFactor() {
				return this.scheduleFactor;
			}

			public void setScheduleFactor(String scheduleFactor) {
				this.scheduleFactor = scheduleFactor;
			}

			public Long getConcurrentSize() {
				return this.concurrentSize;
			}

			public void setConcurrentSize(Long concurrentSize) {
				this.concurrentSize = concurrentSize;
			}
		}
	}

	@Override
	public Class<OpsAddScheduledTaskResponse> getResponseClass() {
		return OpsAddScheduledTaskResponse.class;
	}

}
