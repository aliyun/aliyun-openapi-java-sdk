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
import com.aliyuncs.emr.transform.v20160408.ListFlowJobHistoryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListFlowJobHistoryResponse extends AcsResponse {

	private String requestId;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer total;

	private List<NodeInstance> nodeInstances;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public List<NodeInstance> getNodeInstances() {
		return this.nodeInstances;
	}

	public void setNodeInstances(List<NodeInstance> nodeInstances) {
		this.nodeInstances = nodeInstances;
	}

	public static class NodeInstance {

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

		private Integer maxRetry;

		private Long retryInterval;

		private String nodeName;

		private String clusterId;

		private String hostName;

		private String projectId;

		private Long startTime;

		private Long endTime;

		private Boolean pending;

		private Integer retries;

		private String externalId;

		private String externalStatus;

		private String externalInfo;

		private String paramConf;

		private String envConf;

		private String runConf;

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

		public Integer getMaxRetry() {
			return this.maxRetry;
		}

		public void setMaxRetry(Integer maxRetry) {
			this.maxRetry = maxRetry;
		}

		public Long getRetryInterval() {
			return this.retryInterval;
		}

		public void setRetryInterval(Long retryInterval) {
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

		public Boolean getPending() {
			return this.pending;
		}

		public void setPending(Boolean pending) {
			this.pending = pending;
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
	}

	@Override
	public ListFlowJobHistoryResponse getInstance(UnmarshallerContext context) {
		return	ListFlowJobHistoryResponseUnmarshaller.unmarshall(this, context);
	}
}
