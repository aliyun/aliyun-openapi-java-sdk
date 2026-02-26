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

package com.aliyuncs.dfs.model.v20180620;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dfs.transform.v20180620.DescribeVscMountPointsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeVscMountPointsResponse extends AcsResponse {

	private Integer totalCount;

	private String requestId;

	private List<MountPoint> mountPoints;

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

	public List<MountPoint> getMountPoints() {
		return this.mountPoints;
	}

	public void setMountPoints(List<MountPoint> mountPoints) {
		this.mountPoints = mountPoints;
	}

	public static class MountPoint {

		private String mountPointId;

		private String description;

		private Integer instanceTotalCount;

		private String mountPointAlias;

		private List<Instance> instances;

		public String getMountPointId() {
			return this.mountPointId;
		}

		public void setMountPointId(String mountPointId) {
			this.mountPointId = mountPointId;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Integer getInstanceTotalCount() {
			return this.instanceTotalCount;
		}

		public void setInstanceTotalCount(Integer instanceTotalCount) {
			this.instanceTotalCount = instanceTotalCount;
		}

		public String getMountPointAlias() {
			return this.mountPointAlias;
		}

		public void setMountPointAlias(String mountPointAlias) {
			this.mountPointAlias = mountPointAlias;
		}

		public List<Instance> getInstances() {
			return this.instances;
		}

		public void setInstances(List<Instance> instances) {
			this.instances = instances;
		}

		public static class Instance {

			private String status;

			private String instanceId;

			private List<Vsc> vscs;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public List<Vsc> getVscs() {
				return this.vscs;
			}

			public void setVscs(List<Vsc> vscs) {
				this.vscs = vscs;
			}

			public static class Vsc {

				private String vscId;

				private String vscType;

				private String vscStatus;

				public String getVscId() {
					return this.vscId;
				}

				public void setVscId(String vscId) {
					this.vscId = vscId;
				}

				public String getVscType() {
					return this.vscType;
				}

				public void setVscType(String vscType) {
					this.vscType = vscType;
				}

				public String getVscStatus() {
					return this.vscStatus;
				}

				public void setVscStatus(String vscStatus) {
					this.vscStatus = vscStatus;
				}
			}
		}
	}

	@Override
	public DescribeVscMountPointsResponse getInstance(UnmarshallerContext context) {
		return	DescribeVscMountPointsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
