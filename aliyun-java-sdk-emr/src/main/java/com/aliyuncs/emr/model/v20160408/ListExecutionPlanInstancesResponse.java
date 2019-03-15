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
import com.aliyuncs.emr.transform.v20160408.ListExecutionPlanInstancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListExecutionPlanInstancesResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<ExecutionPlanInstance> executionPlanInstances;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
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

	public List<ExecutionPlanInstance> getExecutionPlanInstances() {
		return this.executionPlanInstances;
	}

	public void setExecutionPlanInstances(List<ExecutionPlanInstance> executionPlanInstances) {
		this.executionPlanInstances = executionPlanInstances;
	}

	public static class ExecutionPlanInstance {

		private String id;

		private String executionPlanId;

		private String executionPlanName;

		private Long startTime;

		private Integer runTime;

		private String clusterId;

		private String clusterName;

		private String clusterType;

		private String status;

		private Boolean logEnable;

		private String logPath;

		private String workflowApp;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getExecutionPlanId() {
			return this.executionPlanId;
		}

		public void setExecutionPlanId(String executionPlanId) {
			this.executionPlanId = executionPlanId;
		}

		public String getExecutionPlanName() {
			return this.executionPlanName;
		}

		public void setExecutionPlanName(String executionPlanName) {
			this.executionPlanName = executionPlanName;
		}

		public Long getStartTime() {
			return this.startTime;
		}

		public void setStartTime(Long startTime) {
			this.startTime = startTime;
		}

		public Integer getRunTime() {
			return this.runTime;
		}

		public void setRunTime(Integer runTime) {
			this.runTime = runTime;
		}

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}

		public String getClusterName() {
			return this.clusterName;
		}

		public void setClusterName(String clusterName) {
			this.clusterName = clusterName;
		}

		public String getClusterType() {
			return this.clusterType;
		}

		public void setClusterType(String clusterType) {
			this.clusterType = clusterType;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Boolean getLogEnable() {
			return this.logEnable;
		}

		public void setLogEnable(Boolean logEnable) {
			this.logEnable = logEnable;
		}

		public String getLogPath() {
			return this.logPath;
		}

		public void setLogPath(String logPath) {
			this.logPath = logPath;
		}

		public String getWorkflowApp() {
			return this.workflowApp;
		}

		public void setWorkflowApp(String workflowApp) {
			this.workflowApp = workflowApp;
		}
	}

	@Override
	public ListExecutionPlanInstancesResponse getInstance(UnmarshallerContext context) {
		return	ListExecutionPlanInstancesResponseUnmarshaller.unmarshall(this, context);
	}
}
