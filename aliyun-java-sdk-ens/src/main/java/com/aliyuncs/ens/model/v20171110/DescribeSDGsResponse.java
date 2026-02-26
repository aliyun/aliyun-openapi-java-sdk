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

package com.aliyuncs.ens.model.v20171110;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ens.transform.v20171110.DescribeSDGsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSDGsResponse extends AcsResponse {

	private String requestId;

	private List<SDGsItem> sDGs;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<SDGsItem> getSDGs() {
		return this.sDGs;
	}

	public void setSDGs(List<SDGsItem> sDGs) {
		this.sDGs = sDGs;
	}

	public static class SDGsItem {

		private String creationInstanceId;

		private String creationRegionId;

		private String creationTime;

		private String description;

		private String parentSDGId;

		private String sDGId;

		private Long size;

		private String status;

		private String updateTime;

		private List<AvaliableRegionIdsItem> avaliableRegionIds;

		private List<DeployedInstanceIdsItem> deployedInstanceIds;

		public String getCreationInstanceId() {
			return this.creationInstanceId;
		}

		public void setCreationInstanceId(String creationInstanceId) {
			this.creationInstanceId = creationInstanceId;
		}

		public String getCreationRegionId() {
			return this.creationRegionId;
		}

		public void setCreationRegionId(String creationRegionId) {
			this.creationRegionId = creationRegionId;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getParentSDGId() {
			return this.parentSDGId;
		}

		public void setParentSDGId(String parentSDGId) {
			this.parentSDGId = parentSDGId;
		}

		public String getSDGId() {
			return this.sDGId;
		}

		public void setSDGId(String sDGId) {
			this.sDGId = sDGId;
		}

		public Long getSize() {
			return this.size;
		}

		public void setSize(Long size) {
			this.size = size;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}

		public List<AvaliableRegionIdsItem> getAvaliableRegionIds() {
			return this.avaliableRegionIds;
		}

		public void setAvaliableRegionIds(List<AvaliableRegionIdsItem> avaliableRegionIds) {
			this.avaliableRegionIds = avaliableRegionIds;
		}

		public List<DeployedInstanceIdsItem> getDeployedInstanceIds() {
			return this.deployedInstanceIds;
		}

		public void setDeployedInstanceIds(List<DeployedInstanceIdsItem> deployedInstanceIds) {
			this.deployedInstanceIds = deployedInstanceIds;
		}

		public static class AvaliableRegionIdsItem {

			private String creationTime;

			private String regionId;

			private String snapshotId;

			private String status;

			public String getCreationTime() {
				return this.creationTime;
			}

			public void setCreationTime(String creationTime) {
				this.creationTime = creationTime;
			}

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}

			public String getSnapshotId() {
				return this.snapshotId;
			}

			public void setSnapshotId(String snapshotId) {
				this.snapshotId = snapshotId;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}
		}

		public static class DeployedInstanceIdsItem {

			private String creationTime;

			private String instanceId;

			private String status;

			private String deploymentType;

			public String getCreationTime() {
				return this.creationTime;
			}

			public void setCreationTime(String creationTime) {
				this.creationTime = creationTime;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getDeploymentType() {
				return this.deploymentType;
			}

			public void setDeploymentType(String deploymentType) {
				this.deploymentType = deploymentType;
			}
		}
	}

	@Override
	public DescribeSDGsResponse getInstance(UnmarshallerContext context) {
		return	DescribeSDGsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
