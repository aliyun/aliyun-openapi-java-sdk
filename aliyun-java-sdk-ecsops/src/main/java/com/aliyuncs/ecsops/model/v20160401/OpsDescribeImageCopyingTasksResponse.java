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

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<ImageTask> imageTasks;

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

	public List<ImageTask> getImageTasks() {
		return this.imageTasks;
	}

	public void setImageTasks(List<ImageTask> imageTasks) {
		this.imageTasks = imageTasks;
	}

	public static class ImageTask {

		private Long resourceOwnerId;

		private String taskId;

		private String taskType;

		private String status;

		private Integer copiedBlock;

		private Integer totalBlock;

		private String srcRegionId;

		private String srcInfo;

		private String dstRegionId;

		private String dstInfo;

		private Long createdTime;

		private Long modifiedTime;

		public Long getResourceOwnerId() {
			return this.resourceOwnerId;
		}

		public void setResourceOwnerId(Long resourceOwnerId) {
			this.resourceOwnerId = resourceOwnerId;
		}

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}

		public String getTaskType() {
			return this.taskType;
		}

		public void setTaskType(String taskType) {
			this.taskType = taskType;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Integer getCopiedBlock() {
			return this.copiedBlock;
		}

		public void setCopiedBlock(Integer copiedBlock) {
			this.copiedBlock = copiedBlock;
		}

		public Integer getTotalBlock() {
			return this.totalBlock;
		}

		public void setTotalBlock(Integer totalBlock) {
			this.totalBlock = totalBlock;
		}

		public String getSrcRegionId() {
			return this.srcRegionId;
		}

		public void setSrcRegionId(String srcRegionId) {
			this.srcRegionId = srcRegionId;
		}

		public String getSrcInfo() {
			return this.srcInfo;
		}

		public void setSrcInfo(String srcInfo) {
			this.srcInfo = srcInfo;
		}

		public String getDstRegionId() {
			return this.dstRegionId;
		}

		public void setDstRegionId(String dstRegionId) {
			this.dstRegionId = dstRegionId;
		}

		public String getDstInfo() {
			return this.dstInfo;
		}

		public void setDstInfo(String dstInfo) {
			this.dstInfo = dstInfo;
		}

		public Long getCreatedTime() {
			return this.createdTime;
		}

		public void setCreatedTime(Long createdTime) {
			this.createdTime = createdTime;
		}

		public Long getModifiedTime() {
			return this.modifiedTime;
		}

		public void setModifiedTime(Long modifiedTime) {
			this.modifiedTime = modifiedTime;
		}
	}

	@Override
	public OpsDescribeImageCopyingTasksResponse getInstance(UnmarshallerContext context) {
		return	OpsDescribeImageCopyingTasksResponseUnmarshaller.unmarshall(this, context);
	}
}
