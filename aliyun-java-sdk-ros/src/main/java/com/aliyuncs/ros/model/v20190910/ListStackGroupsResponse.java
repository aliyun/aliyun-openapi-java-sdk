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
import com.aliyuncs.ros.transform.v20190910.ListStackGroupsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListStackGroupsResponse extends AcsResponse {

	private Integer totalCount;

	private String requestId;

	private Integer pageSize;

	private Integer pageNumber;

	private List<StackGroup> stackGroups;

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

	public List<StackGroup> getStackGroups() {
		return this.stackGroups;
	}

	public void setStackGroups(List<StackGroup> stackGroups) {
		this.stackGroups = stackGroups;
	}

	public static class StackGroup {

		private String stackGroupId;

		private String status;

		private String driftDetectionTime;

		private String description;

		private String stackGroupDriftStatus;

		private String stackGroupName;

		private String resourceGroupId;

		private String permissionModel;

		private List<TagsItem> tags;

		private AutoDeployment autoDeployment;

		public String getStackGroupId() {
			return this.stackGroupId;
		}

		public void setStackGroupId(String stackGroupId) {
			this.stackGroupId = stackGroupId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getDriftDetectionTime() {
			return this.driftDetectionTime;
		}

		public void setDriftDetectionTime(String driftDetectionTime) {
			this.driftDetectionTime = driftDetectionTime;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getStackGroupDriftStatus() {
			return this.stackGroupDriftStatus;
		}

		public void setStackGroupDriftStatus(String stackGroupDriftStatus) {
			this.stackGroupDriftStatus = stackGroupDriftStatus;
		}

		public String getStackGroupName() {
			return this.stackGroupName;
		}

		public void setStackGroupName(String stackGroupName) {
			this.stackGroupName = stackGroupName;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public String getPermissionModel() {
			return this.permissionModel;
		}

		public void setPermissionModel(String permissionModel) {
			this.permissionModel = permissionModel;
		}

		public List<TagsItem> getTags() {
			return this.tags;
		}

		public void setTags(List<TagsItem> tags) {
			this.tags = tags;
		}

		public AutoDeployment getAutoDeployment() {
			return this.autoDeployment;
		}

		public void setAutoDeployment(AutoDeployment autoDeployment) {
			this.autoDeployment = autoDeployment;
		}

		public static class TagsItem {

			private String key;

			private String value;

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}
		}

		public static class AutoDeployment {

			private Boolean enabled;

			private Boolean retainStacksOnAccountRemoval;

			public Boolean getEnabled() {
				return this.enabled;
			}

			public void setEnabled(Boolean enabled) {
				this.enabled = enabled;
			}

			public Boolean getRetainStacksOnAccountRemoval() {
				return this.retainStacksOnAccountRemoval;
			}

			public void setRetainStacksOnAccountRemoval(Boolean retainStacksOnAccountRemoval) {
				this.retainStacksOnAccountRemoval = retainStacksOnAccountRemoval;
			}
		}
	}

	@Override
	public ListStackGroupsResponse getInstance(UnmarshallerContext context) {
		return	ListStackGroupsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
