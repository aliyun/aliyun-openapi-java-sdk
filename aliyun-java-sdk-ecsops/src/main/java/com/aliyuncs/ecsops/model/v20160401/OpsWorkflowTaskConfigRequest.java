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
import com.aliyuncs.ecsops.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class OpsWorkflowTaskConfigRequest extends RpcAcsRequest<OpsWorkflowTaskConfigResponse> {
	   

	private List<ScheduleConfig> scheduleConfigs;

	private String taskName;

	private Long concurrentSize;

	private Long maxSize;

	private String auditParamStr;
	public OpsWorkflowTaskConfigRequest() {
		super("Ecsops", "2016-04-01", "OpsWorkflowTaskConfig", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<ScheduleConfig> getScheduleConfigs() {
		return this.scheduleConfigs;
	}

	public void setScheduleConfigs(List<ScheduleConfig> scheduleConfigs) {
		this.scheduleConfigs = scheduleConfigs;	
		if (scheduleConfigs != null) {
			for (int depth1 = 0; depth1 < scheduleConfigs.size(); depth1++) {
				putQueryParameter("ScheduleConfig." + (depth1 + 1) + ".ConcurrentSize" , scheduleConfigs.get(depth1).getConcurrentSize());
				putQueryParameter("ScheduleConfig." + (depth1 + 1) + ".ScheduleFactor" , scheduleConfigs.get(depth1).getScheduleFactor());
				putQueryParameter("ScheduleConfig." + (depth1 + 1) + ".MaxSize" , scheduleConfigs.get(depth1).getMaxSize());
			}
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

	public Long getConcurrentSize() {
		return this.concurrentSize;
	}

	public void setConcurrentSize(Long concurrentSize) {
		this.concurrentSize = concurrentSize;
		if(concurrentSize != null){
			putQueryParameter("ConcurrentSize", concurrentSize.toString());
		}
	}

	public Long getMaxSize() {
		return this.maxSize;
	}

	public void setMaxSize(Long maxSize) {
		this.maxSize = maxSize;
		if(maxSize != null){
			putQueryParameter("MaxSize", maxSize.toString());
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

	public static class ScheduleConfig {

		private Integer concurrentSize;

		private String scheduleFactor;

		private Long maxSize;

		public Integer getConcurrentSize() {
			return this.concurrentSize;
		}

		public void setConcurrentSize(Integer concurrentSize) {
			this.concurrentSize = concurrentSize;
		}

		public String getScheduleFactor() {
			return this.scheduleFactor;
		}

		public void setScheduleFactor(String scheduleFactor) {
			this.scheduleFactor = scheduleFactor;
		}

		public Long getMaxSize() {
			return this.maxSize;
		}

		public void setMaxSize(Long maxSize) {
			this.maxSize = maxSize;
		}
	}

	@Override
	public Class<OpsWorkflowTaskConfigResponse> getResponseClass() {
		return OpsWorkflowTaskConfigResponse.class;
	}

}
