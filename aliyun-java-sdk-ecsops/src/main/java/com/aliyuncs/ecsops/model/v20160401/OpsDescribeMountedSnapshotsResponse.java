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
import com.aliyuncs.ecsops.transform.v20160401.OpsDescribeMountedSnapshotsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeMountedSnapshotsResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<Snapshot> mountedSnapshots;

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

	public List<Snapshot> getMountedSnapshots() {
		return this.mountedSnapshots;
	}

	public void setMountedSnapshots(List<Snapshot> mountedSnapshots) {
		this.mountedSnapshots = mountedSnapshots;
	}

	public static class Snapshot {

		private String resourceOwnerId;

		private String snapshotId;

		private String instanceId;

		private String lastAttachedTime;

		private String status;

		private String device;

		public String getResourceOwnerId() {
			return this.resourceOwnerId;
		}

		public void setResourceOwnerId(String resourceOwnerId) {
			this.resourceOwnerId = resourceOwnerId;
		}

		public String getSnapshotId() {
			return this.snapshotId;
		}

		public void setSnapshotId(String snapshotId) {
			this.snapshotId = snapshotId;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getLastAttachedTime() {
			return this.lastAttachedTime;
		}

		public void setLastAttachedTime(String lastAttachedTime) {
			this.lastAttachedTime = lastAttachedTime;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getDevice() {
			return this.device;
		}

		public void setDevice(String device) {
			this.device = device;
		}
	}

	@Override
	public OpsDescribeMountedSnapshotsResponse getInstance(UnmarshallerContext context) {
		return	OpsDescribeMountedSnapshotsResponseUnmarshaller.unmarshall(this, context);
	}
}
