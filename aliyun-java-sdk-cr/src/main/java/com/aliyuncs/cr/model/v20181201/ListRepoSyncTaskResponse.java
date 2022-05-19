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

package com.aliyuncs.cr.model.v20181201;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cr.transform.v20181201.ListRepoSyncTaskResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListRepoSyncTaskResponse extends AcsResponse {

	private String requestId;

	private String code;

	private Integer pageNo;

	private Boolean isSuccess;

	private Integer pageSize;

	private String totalCount;

	private List<SyncTasksItem> syncTasks;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getPageNo() {
		return this.pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public Boolean getIsSuccess() {
		return this.isSuccess;
	}

	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}

	public List<SyncTasksItem> getSyncTasks() {
		return this.syncTasks;
	}

	public void setSyncTasks(List<SyncTasksItem> syncTasks) {
		this.syncTasks = syncTasks;
	}

	public static class SyncTasksItem {

		private Long modifedTime;

		private String syncRuleId;

		private String syncTaskId;

		private String taskStatus;

		private Long createTime;

		private String syncBatchTaskId;

		private Boolean crossUser;

		private Boolean syncTransAccelerate;

		private String taskTrigger;

		private Boolean customLink;

		private ImageFrom imageFrom;

		private ImageTo imageTo;

		public Long getModifedTime() {
			return this.modifedTime;
		}

		public void setModifedTime(Long modifedTime) {
			this.modifedTime = modifedTime;
		}

		public String getSyncRuleId() {
			return this.syncRuleId;
		}

		public void setSyncRuleId(String syncRuleId) {
			this.syncRuleId = syncRuleId;
		}

		public String getSyncTaskId() {
			return this.syncTaskId;
		}

		public void setSyncTaskId(String syncTaskId) {
			this.syncTaskId = syncTaskId;
		}

		public String getTaskStatus() {
			return this.taskStatus;
		}

		public void setTaskStatus(String taskStatus) {
			this.taskStatus = taskStatus;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public String getSyncBatchTaskId() {
			return this.syncBatchTaskId;
		}

		public void setSyncBatchTaskId(String syncBatchTaskId) {
			this.syncBatchTaskId = syncBatchTaskId;
		}

		public Boolean getCrossUser() {
			return this.crossUser;
		}

		public void setCrossUser(Boolean crossUser) {
			this.crossUser = crossUser;
		}

		public Boolean getSyncTransAccelerate() {
			return this.syncTransAccelerate;
		}

		public void setSyncTransAccelerate(Boolean syncTransAccelerate) {
			this.syncTransAccelerate = syncTransAccelerate;
		}

		public String getTaskTrigger() {
			return this.taskTrigger;
		}

		public void setTaskTrigger(String taskTrigger) {
			this.taskTrigger = taskTrigger;
		}

		public Boolean getCustomLink() {
			return this.customLink;
		}

		public void setCustomLink(Boolean customLink) {
			this.customLink = customLink;
		}

		public ImageFrom getImageFrom() {
			return this.imageFrom;
		}

		public void setImageFrom(ImageFrom imageFrom) {
			this.imageFrom = imageFrom;
		}

		public ImageTo getImageTo() {
			return this.imageTo;
		}

		public void setImageTo(ImageTo imageTo) {
			this.imageTo = imageTo;
		}

		public static class ImageFrom {

			private String repoNamespaceName;

			private String instanceId;

			private String imageTag;

			private String repoName;

			private String regionId;

			public String getRepoNamespaceName() {
				return this.repoNamespaceName;
			}

			public void setRepoNamespaceName(String repoNamespaceName) {
				this.repoNamespaceName = repoNamespaceName;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getImageTag() {
				return this.imageTag;
			}

			public void setImageTag(String imageTag) {
				this.imageTag = imageTag;
			}

			public String getRepoName() {
				return this.repoName;
			}

			public void setRepoName(String repoName) {
				this.repoName = repoName;
			}

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}
		}

		public static class ImageTo {

			private String repoNamespaceName;

			private String instanceId;

			private String imageTag;

			private String repoName;

			private String regionId;

			public String getRepoNamespaceName() {
				return this.repoNamespaceName;
			}

			public void setRepoNamespaceName(String repoNamespaceName) {
				this.repoNamespaceName = repoNamespaceName;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getImageTag() {
				return this.imageTag;
			}

			public void setImageTag(String imageTag) {
				this.imageTag = imageTag;
			}

			public String getRepoName() {
				return this.repoName;
			}

			public void setRepoName(String repoName) {
				this.repoName = repoName;
			}

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}
		}
	}

	@Override
	public ListRepoSyncTaskResponse getInstance(UnmarshallerContext context) {
		return	ListRepoSyncTaskResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
