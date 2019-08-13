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
import com.aliyuncs.emr.transform.v20160408.DescribeFlowInstanceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeFlowInstanceResponse extends AcsResponse {

	private String requestId;

	private String id;

	private Long gmtCreate;

	private Long gmtModified;

	private String flowId;

	private String flowName;

	private String projectId;

	private String status;

	private String clusterId;

	private Long startTime;

	private Long endTime;

	private Long duration;

	private Long scheduleTime;

	private String graph;

	private String cronExpression;

	private Boolean hasNodeFailed;

	private List<ParentFlow> dependencyFlowList;

	private List<NodeInstanceItem> nodeInstance;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getFlowId() {
		return this.flowId;
	}

	public void setFlowId(String flowId) {
		this.flowId = flowId;
	}

	public String getFlowName() {
		return this.flowName;
	}

	public void setFlowName(String flowName) {
		this.flowName = flowName;
	}

	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
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

	public Long getDuration() {
		return this.duration;
	}

	public void setDuration(Long duration) {
		this.duration = duration;
	}

	public Long getScheduleTime() {
		return this.scheduleTime;
	}

	public void setScheduleTime(Long scheduleTime) {
		this.scheduleTime = scheduleTime;
	}

	public String getGraph() {
		return this.graph;
	}

	public void setGraph(String graph) {
		this.graph = graph;
	}

	public String getCronExpression() {
		return this.cronExpression;
	}

	public void setCronExpression(String cronExpression) {
		this.cronExpression = cronExpression;
	}

	public Boolean getHasNodeFailed() {
		return this.hasNodeFailed;
	}

	public void setHasNodeFailed(Boolean hasNodeFailed) {
		this.hasNodeFailed = hasNodeFailed;
	}

	public List<ParentFlow> getDependencyFlowList() {
		return this.dependencyFlowList;
	}

	public void setDependencyFlowList(List<ParentFlow> dependencyFlowList) {
		this.dependencyFlowList = dependencyFlowList;
	}

	public List<NodeInstanceItem> getNodeInstance() {
		return this.nodeInstance;
	}

	public void setNodeInstance(List<NodeInstanceItem> nodeInstance) {
		this.nodeInstance = nodeInstance;
	}

	public static class ParentFlow {

		private String projectId;

		private String flowId;

		private String dependencyFlowId;

		private String flowInstanceId;

		private String dependencyInstanceId;

		private String scheduleKey;

		private Long bizDate;

		public String getProjectId() {
			return this.projectId;
		}

		public void setProjectId(String projectId) {
			this.projectId = projectId;
		}

		public String getFlowId() {
			return this.flowId;
		}

		public void setFlowId(String flowId) {
			this.flowId = flowId;
		}

		public String getDependencyFlowId() {
			return this.dependencyFlowId;
		}

		public void setDependencyFlowId(String dependencyFlowId) {
			this.dependencyFlowId = dependencyFlowId;
		}

		public String getFlowInstanceId() {
			return this.flowInstanceId;
		}

		public void setFlowInstanceId(String flowInstanceId) {
			this.flowInstanceId = flowInstanceId;
		}

		public String getDependencyInstanceId() {
			return this.dependencyInstanceId;
		}

		public void setDependencyInstanceId(String dependencyInstanceId) {
			this.dependencyInstanceId = dependencyInstanceId;
		}

		public String getScheduleKey() {
			return this.scheduleKey;
		}

		public void setScheduleKey(String scheduleKey) {
			this.scheduleKey = scheduleKey;
		}

		public Long getBizDate() {
			return this.bizDate;
		}

		public void setBizDate(Long bizDate) {
			this.bizDate = bizDate;
		}
	}

	public static class NodeInstanceItem {

		private String id;

		private Long gmtCreate;

		private Long gmtModified;

		private String type;

		private String status;

		private String jobId;

		private String jobName;

		private String jobType;

		private String failAct;

		private String maxRetry;

		private String retryInterval;

		private String nodeName;

		private String clusterId;

		private String hostName;

		private String projectId;

		private Boolean pending;

		private Long startTime;

		private Long endTime;

		private Long duration;

		private Integer retries;

		private String externalId;

		private String externalStatus;

		private String externalInfo;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
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

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getJobId() {
			return this.jobId;
		}

		public void setJobId(String jobId) {
			this.jobId = jobId;
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

		public String getFailAct() {
			return this.failAct;
		}

		public void setFailAct(String failAct) {
			this.failAct = failAct;
		}

		public String getMaxRetry() {
			return this.maxRetry;
		}

		public void setMaxRetry(String maxRetry) {
			this.maxRetry = maxRetry;
		}

		public String getRetryInterval() {
			return this.retryInterval;
		}

		public void setRetryInterval(String retryInterval) {
			this.retryInterval = retryInterval;
		}

		public String getNodeName() {
			return this.nodeName;
		}

		public void setNodeName(String nodeName) {
			this.nodeName = nodeName;
		}

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}

		public String getHostName() {
			return this.hostName;
		}

		public void setHostName(String hostName) {
			this.hostName = hostName;
		}

		public String getProjectId() {
			return this.projectId;
		}

		public void setProjectId(String projectId) {
			this.projectId = projectId;
		}

		public Boolean getPending() {
			return this.pending;
		}

		public void setPending(Boolean pending) {
			this.pending = pending;
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

		public Long getDuration() {
			return this.duration;
		}

		public void setDuration(Long duration) {
			this.duration = duration;
		}

		public Integer getRetries() {
			return this.retries;
		}

		public void setRetries(Integer retries) {
			this.retries = retries;
		}

		public String getExternalId() {
			return this.externalId;
		}

		public void setExternalId(String externalId) {
			this.externalId = externalId;
		}

		public String getExternalStatus() {
			return this.externalStatus;
		}

		public void setExternalStatus(String externalStatus) {
			this.externalStatus = externalStatus;
		}

		public String getExternalInfo() {
			return this.externalInfo;
		}

		public void setExternalInfo(String externalInfo) {
			this.externalInfo = externalInfo;
		}
	}

	@Override
	public DescribeFlowInstanceResponse getInstance(UnmarshallerContext context) {
		return	DescribeFlowInstanceResponseUnmarshaller.unmarshall(this, context);
	}
}
