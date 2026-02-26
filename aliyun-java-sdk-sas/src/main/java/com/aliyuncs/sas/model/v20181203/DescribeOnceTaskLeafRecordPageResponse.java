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

package com.aliyuncs.sas.model.v20181203;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.DescribeOnceTaskLeafRecordPageResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeOnceTaskLeafRecordPageResponse extends AcsResponse {

	private String requestId;

	private List<OnceTasksItem> onceTasks;

	private PageInfo pageInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<OnceTasksItem> getOnceTasks() {
		return this.onceTasks;
	}

	public void setOnceTasks(List<OnceTasksItem> onceTasks) {
		this.onceTasks = onceTasks;
	}

	public PageInfo getPageInfo() {
		return this.pageInfo;
	}

	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}

	public static class OnceTasksItem {

		private String status;

		private String statusText;

		private Long progress;

		private Long realRunTime;

		private String taskName;

		private Integer finish;

		private String totalCount;

		private Long endTime;

		private String taskType;

		private Long startTime;

		private String resultInfo;

		private String target;

		private String taskId;

		private String finishCount;

		private String targetType;

		private TaskImageInfo taskImageInfo;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getStatusText() {
			return this.statusText;
		}

		public void setStatusText(String statusText) {
			this.statusText = statusText;
		}

		public Long getProgress() {
			return this.progress;
		}

		public void setProgress(Long progress) {
			this.progress = progress;
		}

		public Long getRealRunTime() {
			return this.realRunTime;
		}

		public void setRealRunTime(Long realRunTime) {
			this.realRunTime = realRunTime;
		}

		public String getTaskName() {
			return this.taskName;
		}

		public void setTaskName(String taskName) {
			this.taskName = taskName;
		}

		public Integer getFinish() {
			return this.finish;
		}

		public void setFinish(Integer finish) {
			this.finish = finish;
		}

		public String getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(String totalCount) {
			this.totalCount = totalCount;
		}

		public Long getEndTime() {
			return this.endTime;
		}

		public void setEndTime(Long endTime) {
			this.endTime = endTime;
		}

		public String getTaskType() {
			return this.taskType;
		}

		public void setTaskType(String taskType) {
			this.taskType = taskType;
		}

		public Long getStartTime() {
			return this.startTime;
		}

		public void setStartTime(Long startTime) {
			this.startTime = startTime;
		}

		public String getResultInfo() {
			return this.resultInfo;
		}

		public void setResultInfo(String resultInfo) {
			this.resultInfo = resultInfo;
		}

		public String getTarget() {
			return this.target;
		}

		public void setTarget(String target) {
			this.target = target;
		}

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}

		public String getFinishCount() {
			return this.finishCount;
		}

		public void setFinishCount(String finishCount) {
			this.finishCount = finishCount;
		}

		public String getTargetType() {
			return this.targetType;
		}

		public void setTargetType(String targetType) {
			this.targetType = targetType;
		}

		public TaskImageInfo getTaskImageInfo() {
			return this.taskImageInfo;
		}

		public void setTaskImageInfo(TaskImageInfo taskImageInfo) {
			this.taskImageInfo = taskImageInfo;
		}

		public static class TaskImageInfo {

			private String repoId;

			private String digest;

			private String tag;

			private String repoRegionId;

			private String repoName;

			private String repoNamespace;

			private String regionId;

			private String image;

			private String pod;

			private String appName;

			private String nodeName;

			private String nodeIp;

			private String nodeInstanceId;

			private String clusterId;

			private String clusterName;

			public String getRepoId() {
				return this.repoId;
			}

			public void setRepoId(String repoId) {
				this.repoId = repoId;
			}

			public String getDigest() {
				return this.digest;
			}

			public void setDigest(String digest) {
				this.digest = digest;
			}

			public String getTag() {
				return this.tag;
			}

			public void setTag(String tag) {
				this.tag = tag;
			}

			public String getRepoRegionId() {
				return this.repoRegionId;
			}

			public void setRepoRegionId(String repoRegionId) {
				this.repoRegionId = repoRegionId;
			}

			public String getRepoName() {
				return this.repoName;
			}

			public void setRepoName(String repoName) {
				this.repoName = repoName;
			}

			public String getRepoNamespace() {
				return this.repoNamespace;
			}

			public void setRepoNamespace(String repoNamespace) {
				this.repoNamespace = repoNamespace;
			}

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}

			public String getImage() {
				return this.image;
			}

			public void setImage(String image) {
				this.image = image;
			}

			public String getPod() {
				return this.pod;
			}

			public void setPod(String pod) {
				this.pod = pod;
			}

			public String getAppName() {
				return this.appName;
			}

			public void setAppName(String appName) {
				this.appName = appName;
			}

			public String getNodeName() {
				return this.nodeName;
			}

			public void setNodeName(String nodeName) {
				this.nodeName = nodeName;
			}

			public String getNodeIp() {
				return this.nodeIp;
			}

			public void setNodeIp(String nodeIp) {
				this.nodeIp = nodeIp;
			}

			public String getNodeInstanceId() {
				return this.nodeInstanceId;
			}

			public void setNodeInstanceId(String nodeInstanceId) {
				this.nodeInstanceId = nodeInstanceId;
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
		}
	}

	public static class PageInfo {

		private Integer currentPage;

		private Integer pageSize;

		private Integer totalCount;

		private Integer count;

		public Integer getCurrentPage() {
			return this.currentPage;
		}

		public void setCurrentPage(Integer currentPage) {
			this.currentPage = currentPage;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public Integer getCount() {
			return this.count;
		}

		public void setCount(Integer count) {
			this.count = count;
		}
	}

	@Override
	public DescribeOnceTaskLeafRecordPageResponse getInstance(UnmarshallerContext context) {
		return	DescribeOnceTaskLeafRecordPageResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
