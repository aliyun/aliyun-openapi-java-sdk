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

package com.aliyuncs.schedulerx3.model.v20240624;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListAlarmEventRequest extends RpcAcsRequest<ListAlarmEventResponse> {
	   

	private Long startTime;

	private String pageNum;

	private String alarmChannel;

	private String appName;

	private String pageSize;

	private String jobName;

	private String alarmType;

	private Long endTime;

	private String clusterId;

	private Boolean reverse;

	private String alarmStatus;
	public ListAlarmEventRequest() {
		super("SchedulerX3", "2024-06-24", "ListAlarmEvent");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.GET);
	}

	public Long getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Long startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime.toString());
		}
	}

	public String getPageNum() {
		return this.pageNum;
	}

	public void setPageNum(String pageNum) {
		this.pageNum = pageNum;
		if(pageNum != null){
			putQueryParameter("PageNum", pageNum);
		}
	}

	public String getAlarmChannel() {
		return this.alarmChannel;
	}

	public void setAlarmChannel(String alarmChannel) {
		this.alarmChannel = alarmChannel;
		if(alarmChannel != null){
			putQueryParameter("AlarmChannel", alarmChannel);
		}
	}

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
		if(appName != null){
			putQueryParameter("AppName", appName);
		}
	}

	public String getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize);
		}
	}

	public String getJobName() {
		return this.jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
		if(jobName != null){
			putQueryParameter("JobName", jobName);
		}
	}

	public String getAlarmType() {
		return this.alarmType;
	}

	public void setAlarmType(String alarmType) {
		this.alarmType = alarmType;
		if(alarmType != null){
			putQueryParameter("AlarmType", alarmType);
		}
	}

	public Long getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("EndTime", endTime.toString());
		}
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putQueryParameter("ClusterId", clusterId);
		}
	}

	public Boolean getReverse() {
		return this.reverse;
	}

	public void setReverse(Boolean reverse) {
		this.reverse = reverse;
		if(reverse != null){
			putQueryParameter("Reverse", reverse.toString());
		}
	}

	public String getAlarmStatus() {
		return this.alarmStatus;
	}

	public void setAlarmStatus(String alarmStatus) {
		this.alarmStatus = alarmStatus;
		if(alarmStatus != null){
			putQueryParameter("AlarmStatus", alarmStatus);
		}
	}

	@Override
	public Class<ListAlarmEventResponse> getResponseClass() {
		return ListAlarmEventResponse.class;
	}

}
