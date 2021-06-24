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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsDescribeImageCopyingTasksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeImageCopyingTasksResponse extends AcsResponse {

	private Integer totalCount;

	private Integer pageSize;

	private String requestId;

	private Integer pageNumber;

	private List<ImageTask> imageTasks;

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

	public List<ImageTask> getImageTasks() {
		return this.imageTasks;
	}

	public void setImageTasks(List<ImageTask> imageTasks) {
		this.imageTasks = imageTasks;
	}

	public static class ImageTask {

		private String status;

		private String dstInfo;

		private String srcRegionId;

		private Integer totalBlock;

		private String taskType;

		private String dstRegionId;

		private Long resourceOwnerId;

		private Long modifiedTime;

		private String srcInfo;

		private Integer copiedBlock;

		private Long createdTime;

		private String taskId;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getDstInfo() {
			return this.dstInfo;
		}

		public void setDstInfo(String dstInfo) {
			this.dstInfo = dstInfo;
		}

		public String getSrcRegionId() {
			return this.srcRegionId;
		}

		public void setSrcRegionId(String srcRegionId) {
			this.srcRegionId = srcRegionId;
		}

		public Integer getTotalBlock() {
			return this.totalBlock;
		}

		public void setTotalBlock(Integer totalBlock) {
			this.totalBlock = totalBlock;
		}

		public String getTaskType() {
			return this.taskType;
		}

		public void setTaskType(String taskType) {
			this.taskType = taskType;
		}

		public String getDstRegionId() {
			return this.dstRegionId;
		}

		public void setDstRegionId(String dstRegionId) {
			this.dstRegionId = dstRegionId;
		}

		public Long getResourceOwnerId() {
			return this.resourceOwnerId;
		}

		public void setResourceOwnerId(Long resourceOwnerId) {
			this.resourceOwnerId = resourceOwnerId;
		}

		public Long getModifiedTime() {
			return this.modifiedTime;
		}

		public void setModifiedTime(Long modifiedTime) {
			this.modifiedTime = modifiedTime;
		}

		public String getSrcInfo() {
			return this.srcInfo;
		}

		public void setSrcInfo(String srcInfo) {
			this.srcInfo = srcInfo;
		}

		public Integer getCopiedBlock() {
			return this.copiedBlock;
		}

		public void setCopiedBlock(Integer copiedBlock) {
			this.copiedBlock = copiedBlock;
		}

		public Long getCreatedTime() {
			return this.createdTime;
		}

		public void setCreatedTime(Long createdTime) {
			this.createdTime = createdTime;
		}

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}
	}

	@Override
	public OpsDescribeImageCopyingTasksResponse getInstance(UnmarshallerContext context) {
		return	OpsDescribeImageCopyingTasksResponseUnmarshaller.unmarshall(this, context);
	}
}
