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
import com.aliyuncs.ros.transform.v20190910.ListStackResourcesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListStackResourcesResponse extends AcsResponse {

	private String requestId;

	private List<Resource> resources;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Resource> getResources() {
		return this.resources;
	}

	public void setResources(List<Resource> resources) {
		this.resources = resources;
	}

	public static class Resource {

		private String status;

		private String logicalResourceId;

		private String updateTime;

		private String stackId;

		private String physicalResourceId;

		private String driftDetectionTime;

		private String resourceType;

		private String resourceDriftStatus;

		private String statusReason;

		private String createTime;

		private String stackName;

		private ModuleInfo moduleInfo;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getLogicalResourceId() {
			return this.logicalResourceId;
		}

		public void setLogicalResourceId(String logicalResourceId) {
			this.logicalResourceId = logicalResourceId;
		}

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}

		public String getStackId() {
			return this.stackId;
		}

		public void setStackId(String stackId) {
			this.stackId = stackId;
		}

		public String getPhysicalResourceId() {
			return this.physicalResourceId;
		}

		public void setPhysicalResourceId(String physicalResourceId) {
			this.physicalResourceId = physicalResourceId;
		}

		public String getDriftDetectionTime() {
			return this.driftDetectionTime;
		}

		public void setDriftDetectionTime(String driftDetectionTime) {
			this.driftDetectionTime = driftDetectionTime;
		}

		public String getResourceType() {
			return this.resourceType;
		}

		public void setResourceType(String resourceType) {
			this.resourceType = resourceType;
		}

		public String getResourceDriftStatus() {
			return this.resourceDriftStatus;
		}

		public void setResourceDriftStatus(String resourceDriftStatus) {
			this.resourceDriftStatus = resourceDriftStatus;
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

		public String getStackName() {
			return this.stackName;
		}

		public void setStackName(String stackName) {
			this.stackName = stackName;
		}

		public ModuleInfo getModuleInfo() {
			return this.moduleInfo;
		}

		public void setModuleInfo(ModuleInfo moduleInfo) {
			this.moduleInfo = moduleInfo;
		}

		public static class ModuleInfo {

			private String logicalIdHierarchy;

			private String typeHierarchy;

			public String getLogicalIdHierarchy() {
				return this.logicalIdHierarchy;
			}

			public void setLogicalIdHierarchy(String logicalIdHierarchy) {
				this.logicalIdHierarchy = logicalIdHierarchy;
			}

			public String getTypeHierarchy() {
				return this.typeHierarchy;
			}

			public void setTypeHierarchy(String typeHierarchy) {
				this.typeHierarchy = typeHierarchy;
			}
		}
	}

	@Override
	public ListStackResourcesResponse getInstance(UnmarshallerContext context) {
		return	ListStackResourcesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
