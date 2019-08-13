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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.emr.transform.v20160408.ListApmApplicationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListApmApplicationResponse extends AcsResponse {

	private String requestId;

	private Integer total;

	private Integer pageSize;

	private Integer pageNumber;

	private List<ApmAppInfo> apmAppInfoList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<ApmAppInfo> getApmAppInfoList() {
		return this.apmAppInfoList;
	}

	public void setApmAppInfoList(List<ApmAppInfo> apmAppInfoList) {
		this.apmAppInfoList = apmAppInfoList;
	}

	public static class ApmAppInfo {

		private String applicationId;

		private String clusterBizId;

		private String applicationType;

		private String name;

		private String state;

		private String finalStatus;

		private String queue;

		private String user;

		private Long allocatedVcore;

		private Long allocatedMemory;

		private Float progress;

		private Long vcoreSeconds;

		private Long memorySeconds;

		private Long startTime;

		private Long submitTime;

		private Long finishedTime;

		private Integer duration;

		private String diagnostics;

		private Float clusterUsagePercent;

		private Float queueUsagePercent;

		private Integer runningContainers;

		private Integer runningDuration;

		private String resourceRequests;

		private String diagnoseResult;

		private String diagnoseCode;

		public String getApplicationId() {
			return this.applicationId;
		}

		public void setApplicationId(String applicationId) {
			this.applicationId = applicationId;
		}

		public String getClusterBizId() {
			return this.clusterBizId;
		}

		public void setClusterBizId(String clusterBizId) {
			this.clusterBizId = clusterBizId;
		}

		public String getApplicationType() {
			return this.applicationType;
		}

		public void setApplicationType(String applicationType) {
			this.applicationType = applicationType;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getFinalStatus() {
			return this.finalStatus;
		}

		public void setFinalStatus(String finalStatus) {
			this.finalStatus = finalStatus;
		}

		public String getQueue() {
			return this.queue;
		}

		public void setQueue(String queue) {
			this.queue = queue;
		}

		public String getUser() {
			return this.user;
		}

		public void setUser(String user) {
			this.user = user;
		}

		public Long getAllocatedVcore() {
			return this.allocatedVcore;
		}

		public void setAllocatedVcore(Long allocatedVcore) {
			this.allocatedVcore = allocatedVcore;
		}

		public Long getAllocatedMemory() {
			return this.allocatedMemory;
		}

		public void setAllocatedMemory(Long allocatedMemory) {
			this.allocatedMemory = allocatedMemory;
		}

		public Float getProgress() {
			return this.progress;
		}

		public void setProgress(Float progress) {
			this.progress = progress;
		}

		public Long getVcoreSeconds() {
			return this.vcoreSeconds;
		}

		public void setVcoreSeconds(Long vcoreSeconds) {
			this.vcoreSeconds = vcoreSeconds;
		}

		public Long getMemorySeconds() {
			return this.memorySeconds;
		}

		public void setMemorySeconds(Long memorySeconds) {
			this.memorySeconds = memorySeconds;
		}

		public Long getStartTime() {
			return this.startTime;
		}

		public void setStartTime(Long startTime) {
			this.startTime = startTime;
		}

		public Long getSubmitTime() {
			return this.submitTime;
		}

		public void setSubmitTime(Long submitTime) {
			this.submitTime = submitTime;
		}

		public Long getFinishedTime() {
			return this.finishedTime;
		}

		public void setFinishedTime(Long finishedTime) {
			this.finishedTime = finishedTime;
		}

		public Integer getDuration() {
			return this.duration;
		}

		public void setDuration(Integer duration) {
			this.duration = duration;
		}

		public String getDiagnostics() {
			return this.diagnostics;
		}

		public void setDiagnostics(String diagnostics) {
			this.diagnostics = diagnostics;
		}

		public Float getClusterUsagePercent() {
			return this.clusterUsagePercent;
		}

		public void setClusterUsagePercent(Float clusterUsagePercent) {
			this.clusterUsagePercent = clusterUsagePercent;
		}

		public Float getQueueUsagePercent() {
			return this.queueUsagePercent;
		}

		public void setQueueUsagePercent(Float queueUsagePercent) {
			this.queueUsagePercent = queueUsagePercent;
		}

		public Integer getRunningContainers() {
			return this.runningContainers;
		}

		public void setRunningContainers(Integer runningContainers) {
			this.runningContainers = runningContainers;
		}

		public Integer getRunningDuration() {
			return this.runningDuration;
		}

		public void setRunningDuration(Integer runningDuration) {
			this.runningDuration = runningDuration;
		}

		public String getResourceRequests() {
			return this.resourceRequests;
		}

		public void setResourceRequests(String resourceRequests) {
			this.resourceRequests = resourceRequests;
		}

		public String getDiagnoseResult() {
			return this.diagnoseResult;
		}

		public void setDiagnoseResult(String diagnoseResult) {
			this.diagnoseResult = diagnoseResult;
		}

		public String getDiagnoseCode() {
			return this.diagnoseCode;
		}

		public void setDiagnoseCode(String diagnoseCode) {
			this.diagnoseCode = diagnoseCode;
		}
	}

	@Override
	public ListApmApplicationResponse getInstance(UnmarshallerContext context) {
		return	ListApmApplicationResponseUnmarshaller.unmarshall(this, context);
	}
}
