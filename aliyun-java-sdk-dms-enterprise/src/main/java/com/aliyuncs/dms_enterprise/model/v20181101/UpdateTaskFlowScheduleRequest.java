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

package com.aliyuncs.dms_enterprise.model.v20181101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dms_enterprise.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateTaskFlowScheduleRequest extends RpcAcsRequest<UpdateTaskFlowScheduleResponse> {
	   

	private String cronType;

	private String cronStr;

	private String triggerType;

	private Long dagId;

	private Long tid;

	private String timeZoneId;

	private String cronBeginDate;

	private Boolean scheduleSwitch;

	private String cronEndDate;

	private String scheduleParam;
	public UpdateTaskFlowScheduleRequest() {
		super("dms-enterprise", "2018-11-01", "UpdateTaskFlowSchedule", "dms-enterprise");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCronType() {
		return this.cronType;
	}

	public void setCronType(String cronType) {
		this.cronType = cronType;
		if(cronType != null){
			putQueryParameter("CronType", cronType);
		}
	}

	public String getCronStr() {
		return this.cronStr;
	}

	public void setCronStr(String cronStr) {
		this.cronStr = cronStr;
		if(cronStr != null){
			putQueryParameter("CronStr", cronStr);
		}
	}

	public String getTriggerType() {
		return this.triggerType;
	}

	public void setTriggerType(String triggerType) {
		this.triggerType = triggerType;
		if(triggerType != null){
			putQueryParameter("TriggerType", triggerType);
		}
	}

	public Long getDagId() {
		return this.dagId;
	}

	public void setDagId(Long dagId) {
		this.dagId = dagId;
		if(dagId != null){
			putQueryParameter("DagId", dagId.toString());
		}
	}

	public Long getTid() {
		return this.tid;
	}

	public void setTid(Long tid) {
		this.tid = tid;
		if(tid != null){
			putQueryParameter("Tid", tid.toString());
		}
	}

	public String getTimeZoneId() {
		return this.timeZoneId;
	}

	public void setTimeZoneId(String timeZoneId) {
		this.timeZoneId = timeZoneId;
		if(timeZoneId != null){
			putQueryParameter("TimeZoneId", timeZoneId);
		}
	}

	public String getCronBeginDate() {
		return this.cronBeginDate;
	}

	public void setCronBeginDate(String cronBeginDate) {
		this.cronBeginDate = cronBeginDate;
		if(cronBeginDate != null){
			putQueryParameter("CronBeginDate", cronBeginDate);
		}
	}

	public Boolean getScheduleSwitch() {
		return this.scheduleSwitch;
	}

	public void setScheduleSwitch(Boolean scheduleSwitch) {
		this.scheduleSwitch = scheduleSwitch;
		if(scheduleSwitch != null){
			putQueryParameter("ScheduleSwitch", scheduleSwitch.toString());
		}
	}

	public String getCronEndDate() {
		return this.cronEndDate;
	}

	public void setCronEndDate(String cronEndDate) {
		this.cronEndDate = cronEndDate;
		if(cronEndDate != null){
			putQueryParameter("CronEndDate", cronEndDate);
		}
	}

	public String getScheduleParam() {
		return this.scheduleParam;
	}

	public void setScheduleParam(String scheduleParam) {
		this.scheduleParam = scheduleParam;
		if(scheduleParam != null){
			putQueryParameter("ScheduleParam", scheduleParam);
		}
	}

	@Override
	public Class<UpdateTaskFlowScheduleResponse> getResponseClass() {
		return UpdateTaskFlowScheduleResponse.class;
	}

}
