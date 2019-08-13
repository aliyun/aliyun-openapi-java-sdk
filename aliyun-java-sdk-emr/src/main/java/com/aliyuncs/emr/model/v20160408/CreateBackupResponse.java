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

package com.aliyuncs.emr.model.v20160408;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.emr.transform.v20160408.CreateBackupResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateBackupResponse extends AcsResponse {

	private String requestId;

	private String bizId;

	private Long dataSourceId;

	private String taskType;

	private String taskStatus;

	private Long startTime;

	private Long endTime;

	private String taskDetail;

	private String taskResultDetail;

	private Integer taskProcess;

	private String triggerUser;

	private String triggerType;

	private Long gmtCreate;

	private Long gmtModified;

	private String clusterBizId;

	private String hostName;

	private Long ecmTaskId;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getBizId() {
		return this.bizId;
	}

	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public Long getDataSourceId() {
		return this.dataSourceId;
	}

	public void setDataSourceId(Long dataSourceId) {
		this.dataSourceId = dataSourceId;
	}

	public String getTaskType() {
		return this.taskType;
	}

	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}

	public String getTaskStatus() {
		return this.taskStatus;
	}

	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}

	public Long getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Long startTime) {
		this.startTime = startTime;
	}

	public Long getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
	}

	public String getTaskDetail() {
		return this.taskDetail;
	}

	public void setTaskDetail(String taskDetail) {
		this.taskDetail = taskDetail;
	}

	public String getTaskResultDetail() {
		return this.taskResultDetail;
	}

	public void setTaskResultDetail(String taskResultDetail) {
		this.taskResultDetail = taskResultDetail;
	}

	public Integer getTaskProcess() {
		return this.taskProcess;
	}

	public void setTaskProcess(Integer taskProcess) {
		this.taskProcess = taskProcess;
	}

	public String getTriggerUser() {
		return this.triggerUser;
	}

	public void setTriggerUser(String triggerUser) {
		this.triggerUser = triggerUser;
	}

	public String getTriggerType() {
		return this.triggerType;
	}

	public void setTriggerType(String triggerType) {
		this.triggerType = triggerType;
	}

	public Long getGmtCreate() {
		return this.gmtCreate;
	}

	public void setGmtCreate(Long gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Long getGmtModified() {
		return this.gmtModified;
	}

	public void setGmtModified(Long gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getClusterBizId() {
		return this.clusterBizId;
	}

	public void setClusterBizId(String clusterBizId) {
		this.clusterBizId = clusterBizId;
	}

	public String getHostName() {
		return this.hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
	}

	public Long getEcmTaskId() {
		return this.ecmTaskId;
	}

	public void setEcmTaskId(Long ecmTaskId) {
		this.ecmTaskId = ecmTaskId;
	}

	@Override
	public CreateBackupResponse getInstance(UnmarshallerContext context) {
		return	CreateBackupResponseUnmarshaller.unmarshall(this, context);
	}
}
