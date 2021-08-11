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

package com.aliyuncs.ros.model.v20190910;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ros.transform.v20190910.ListStacksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListStacksResponse extends AcsResponse {

	private Integer totalCount;

	private String requestId;

	private Integer pageSize;

	private Integer pageNumber;

	private List<Stack> stacks;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public List<Stack> getStacks() {
		return this.stacks;
	}

	public void setStacks(List<Stack> stacks) {
		this.stacks = stacks;
	}

	public static class Stack {

		private String status;

		private String resourceGroupId;

		private String parentStackId;

		private String statusReason;

		private String createTime;

		private String stackType;

		private String updateTime;

		private String driftDetectionTime;

		private String regionId;

		private String stackDriftStatus;

		private String stackName;

		private Boolean disableRollback;

		private String stackId;

		private Integer timeoutInMinutes;

		private List<Tag> tags;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public String getParentStackId() {
			return this.parentStackId;
		}

		public void setParentStackId(String parentStackId) {
			this.parentStackId = parentStackId;
		}

		public String getStatusReason() {
			return this.statusReason;
		}

		public void setStatusReason(String statusReason) {
			this.statusReason = statusReason;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getStackType() {
			return this.stackType;
		}

		public void setStackType(String stackType) {
			this.stackType = stackType;
		}

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}

		public String getDriftDetectionTime() {
			return this.driftDetectionTime;
		}

		public void setDriftDetectionTime(String driftDetectionTime) {
			this.driftDetectionTime = driftDetectionTime;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getStackDriftStatus() {
			return this.stackDriftStatus;
		}

		public void setStackDriftStatus(String stackDriftStatus) {
			this.stackDriftStatus = stackDriftStatus;
		}

		public String getStackName() {
			return this.stackName;
		}

		public void setStackName(String stackName) {
			this.stackName = stackName;
		}

		public Boolean getDisableRollback() {
			return this.disableRollback;
		}

		public void setDisableRollback(Boolean disableRollback) {
			this.disableRollback = disableRollback;
		}

		public String getStackId() {
			return this.stackId;
		}

		public void setStackId(String stackId) {
			this.stackId = stackId;
		}

		public Integer getTimeoutInMinutes() {
			return this.timeoutInMinutes;
		}

		public void setTimeoutInMinutes(Integer timeoutInMinutes) {
			this.timeoutInMinutes = timeoutInMinutes;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public static class Tag {

			private String value;

			private String key;

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}
		}
	}

	@Override
	public ListStacksResponse getInstance(UnmarshallerContext context) {
		return	ListStacksResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
