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
import com.aliyuncs.emr.transform.v20160408.ListJobExecutionPlanHierarchyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListJobExecutionPlanHierarchyResponse extends AcsResponse {

	private String requestId;

	private String success;

	private String errCode;

	private String errMsg;

	private Integer totalCount;

	private Integer pageSize;

	private Integer pageNumber;

	private List<HierarchyInfo> hierarchyInfos;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public String getErrCode() {
		return this.errCode;
	}

	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}

	public String getErrMsg() {
		return this.errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
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

	public List<HierarchyInfo> getHierarchyInfos() {
		return this.hierarchyInfos;
	}

	public void setHierarchyInfos(List<HierarchyInfo> hierarchyInfos) {
		this.hierarchyInfos = hierarchyInfos;
	}

	public static class HierarchyInfo {

		private Long id;

		private String nodeBizType;

		private String nodeType;

		private String relateId;

		private String name;

		private String parentId;

		private String resourceOwnerId;

		private Long utcCreateTimestamp;

		private Long utcModifiedTimestamp;

		private Integer nodeStatus;

		private ExecutionPlan executionPlan;

		private Job job;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getNodeBizType() {
			return this.nodeBizType;
		}

		public void setNodeBizType(String nodeBizType) {
			this.nodeBizType = nodeBizType;
		}

		public String getNodeType() {
			return this.nodeType;
		}

		public void setNodeType(String nodeType) {
			this.nodeType = nodeType;
		}

		public String getRelateId() {
			return this.relateId;
		}

		public void setRelateId(String relateId) {
			this.relateId = relateId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getParentId() {
			return this.parentId;
		}

		public void setParentId(String parentId) {
			this.parentId = parentId;
		}

		public String getResourceOwnerId() {
			return this.resourceOwnerId;
		}

		public void setResourceOwnerId(String resourceOwnerId) {
			this.resourceOwnerId = resourceOwnerId;
		}

		public Long getUtcCreateTimestamp() {
			return this.utcCreateTimestamp;
		}

		public void setUtcCreateTimestamp(Long utcCreateTimestamp) {
			this.utcCreateTimestamp = utcCreateTimestamp;
		}

		public Long getUtcModifiedTimestamp() {
			return this.utcModifiedTimestamp;
		}

		public void setUtcModifiedTimestamp(Long utcModifiedTimestamp) {
			this.utcModifiedTimestamp = utcModifiedTimestamp;
		}

		public Integer getNodeStatus() {
			return this.nodeStatus;
		}

		public void setNodeStatus(Integer nodeStatus) {
			this.nodeStatus = nodeStatus;
		}

		public ExecutionPlan getExecutionPlan() {
			return this.executionPlan;
		}

		public void setExecutionPlan(ExecutionPlan executionPlan) {
			this.executionPlan = executionPlan;
		}

		public Job getJob() {
			return this.job;
		}

		public void setJob(Job job) {
			this.job = job;
		}

		public static class ExecutionPlan {

			private String bizId;

			private String name;

			private Integer status;

			private Integer lastExeStatus;

			private Boolean isCreateCluster;

			private Boolean isInterruptWhenError;

			private Boolean isCycle;

			private String scheduleCycle;

			private String regionId;

			private String cronExpr;

			private Long utcCreateTimestamp;

			private Long utcModifiedTimestamp;

			private String version;

			private String clusterTemplateId;

			public String getBizId() {
				return this.bizId;
			}

			public void setBizId(String bizId) {
				this.bizId = bizId;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public Integer getStatus() {
				return this.status;
			}

			public void setStatus(Integer status) {
				this.status = status;
			}

			public Integer getLastExeStatus() {
				return this.lastExeStatus;
			}

			public void setLastExeStatus(Integer lastExeStatus) {
				this.lastExeStatus = lastExeStatus;
			}

			public Boolean getIsCreateCluster() {
				return this.isCreateCluster;
			}

			public void setIsCreateCluster(Boolean isCreateCluster) {
				this.isCreateCluster = isCreateCluster;
			}

			public Boolean getIsInterruptWhenError() {
				return this.isInterruptWhenError;
			}

			public void setIsInterruptWhenError(Boolean isInterruptWhenError) {
				this.isInterruptWhenError = isInterruptWhenError;
			}

			public Boolean getIsCycle() {
				return this.isCycle;
			}

			public void setIsCycle(Boolean isCycle) {
				this.isCycle = isCycle;
			}

			public String getScheduleCycle() {
				return this.scheduleCycle;
			}

			public void setScheduleCycle(String scheduleCycle) {
				this.scheduleCycle = scheduleCycle;
			}

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}

			public String getCronExpr() {
				return this.cronExpr;
			}

			public void setCronExpr(String cronExpr) {
				this.cronExpr = cronExpr;
			}

			public Long getUtcCreateTimestamp() {
				return this.utcCreateTimestamp;
			}

			public void setUtcCreateTimestamp(Long utcCreateTimestamp) {
				this.utcCreateTimestamp = utcCreateTimestamp;
			}

			public Long getUtcModifiedTimestamp() {
				return this.utcModifiedTimestamp;
			}

			public void setUtcModifiedTimestamp(Long utcModifiedTimestamp) {
				this.utcModifiedTimestamp = utcModifiedTimestamp;
			}

			public String getVersion() {
				return this.version;
			}

			public void setVersion(String version) {
				this.version = version;
			}

			public String getClusterTemplateId() {
				return this.clusterTemplateId;
			}

			public void setClusterTemplateId(String clusterTemplateId) {
				this.clusterTemplateId = clusterTemplateId;
			}
		}

		public static class Job {

			private String bizId;

			private String name;

			private Integer jobFailAct;

			private Integer jobType;

			private String envParam;

			private Integer maxRetry;

			private Integer retryInterval;

			public String getBizId() {
				return this.bizId;
			}

			public void setBizId(String bizId) {
				this.bizId = bizId;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public Integer getJobFailAct() {
				return this.jobFailAct;
			}

			public void setJobFailAct(Integer jobFailAct) {
				this.jobFailAct = jobFailAct;
			}

			public Integer getJobType() {
				return this.jobType;
			}

			public void setJobType(Integer jobType) {
				this.jobType = jobType;
			}

			public String getEnvParam() {
				return this.envParam;
			}

			public void setEnvParam(String envParam) {
				this.envParam = envParam;
			}

			public Integer getMaxRetry() {
				return this.maxRetry;
			}

			public void setMaxRetry(Integer maxRetry) {
				this.maxRetry = maxRetry;
			}

			public Integer getRetryInterval() {
				return this.retryInterval;
			}

			public void setRetryInterval(Integer retryInterval) {
				this.retryInterval = retryInterval;
			}
		}
	}

	@Override
	public ListJobExecutionPlanHierarchyResponse getInstance(UnmarshallerContext context) {
		return	ListJobExecutionPlanHierarchyResponseUnmarshaller.unmarshall(this, context);
	}
}
