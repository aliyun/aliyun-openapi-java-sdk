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
import com.aliyuncs.emr.transform.v20160408.DescribeLibraryInstallTaskDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLibraryInstallTaskDetailResponse extends AcsResponse {

	private String requestId;

	private String libraryBizId;

	private String taskGroupId;

	private String taskId;

	private String taskStatus;

	private Long startTime;

	private Long endTime;

	private Long executeTime;

	private Integer taskProcess;

	private String taskType;

	private String detail;

	private String clusterBizId;

	private String hostname;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getLibraryBizId() {
		return this.libraryBizId;
	}

	public void setLibraryBizId(String libraryBizId) {
		this.libraryBizId = libraryBizId;
	}

	public String getTaskGroupId() {
		return this.taskGroupId;
	}

	public void setTaskGroupId(String taskGroupId) {
		this.taskGroupId = taskGroupId;
	}

	public String getTaskId() {
		return this.taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
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

	public Long getExecuteTime() {
		return this.executeTime;
	}

	public void setExecuteTime(Long executeTime) {
		this.executeTime = executeTime;
	}

	public Integer getTaskProcess() {
		return this.taskProcess;
	}

	public void setTaskProcess(Integer taskProcess) {
		this.taskProcess = taskProcess;
	}

	public String getTaskType() {
		return this.taskType;
	}

	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}

	public String getDetail() {
		return this.detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getClusterBizId() {
		return this.clusterBizId;
	}

	public void setClusterBizId(String clusterBizId) {
		this.clusterBizId = clusterBizId;
	}

	public String getHostname() {
		return this.hostname;
	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	@Override
	public DescribeLibraryInstallTaskDetailResponse getInstance(UnmarshallerContext context) {
		return	DescribeLibraryInstallTaskDetailResponseUnmarshaller.unmarshall(this, context);
	}
}
