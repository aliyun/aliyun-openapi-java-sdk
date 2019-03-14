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
import com.aliyuncs.emr.transform.v20160408.DescribeFlowNodeInstanceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeFlowNodeInstanceResponse extends AcsResponse {

	private String requestId;

	private String id;

	private Long gmtCreate;

	private Long gmtModified;

	private String type;

	private String status;

	private String jobId;

	private String jobName;

	private String jobType;

	private String jobParams;

	private String failAct;

	private String maxRetry;

	private String retryInterval;

	private String nodeName;

	private String flowId;

	private String flowInstanceId;

	private String clusterId;

	private String hostName;

	private String projectId;

	private Boolean pending;

	private Long startTime;

	private Long endTime;

	private Long duration;

	private Integer retries;

	private String externalId;

	private String externalSubId;

	private String externalChildIds;

	private String externalStatus;

	private String externalInfo;

	private String paramConf;

	private String envConf;

	private String runConf;

	private Boolean adhoc;

	private String monitorConf;

	private String mode;

	private String clusterName;

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

	public String getJobParams() {
		return this.jobParams;
	}

	public void setJobParams(String jobParams) {
		this.jobParams = jobParams;
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

	public String getFlowId() {
		return this.flowId;
	}

	public void setFlowId(String flowId) {
		this.flowId = flowId;
	}

	public String getFlowInstanceId() {
		return this.flowInstanceId;
	}

	public void setFlowInstanceId(String flowInstanceId) {
		this.flowInstanceId = flowInstanceId;
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

	public String getExternalSubId() {
		return this.externalSubId;
	}

	public void setExternalSubId(String externalSubId) {
		this.externalSubId = externalSubId;
	}

	public String getExternalChildIds() {
		return this.externalChildIds;
	}

	public void setExternalChildIds(String externalChildIds) {
		this.externalChildIds = externalChildIds;
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

	public String getParamConf() {
		return this.paramConf;
	}

	public void setParamConf(String paramConf) {
		this.paramConf = paramConf;
	}

	public String getEnvConf() {
		return this.envConf;
	}

	public void setEnvConf(String envConf) {
		this.envConf = envConf;
	}

	public String getRunConf() {
		return this.runConf;
	}

	public void setRunConf(String runConf) {
		this.runConf = runConf;
	}

	public Boolean getAdhoc() {
		return this.adhoc;
	}

	public void setAdhoc(Boolean adhoc) {
		this.adhoc = adhoc;
	}

	public String getMonitorConf() {
		return this.monitorConf;
	}

	public void setMonitorConf(String monitorConf) {
		this.monitorConf = monitorConf;
	}

	public String getMode() {
		return this.mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getClusterName() {
		return this.clusterName;
	}

	public void setClusterName(String clusterName) {
		this.clusterName = clusterName;
	}

	@Override
	public DescribeFlowNodeInstanceResponse getInstance(UnmarshallerContext context) {
		return	DescribeFlowNodeInstanceResponseUnmarshaller.unmarshall(this, context);
	}
}
