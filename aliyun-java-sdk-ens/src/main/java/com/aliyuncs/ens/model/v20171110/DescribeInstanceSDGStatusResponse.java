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
import com.aliyuncs.ens.transform.v20171110.DescribeInstanceSDGStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeInstanceSDGStatusResponse extends AcsResponse {

	private String requestId;

	private Long pageNumber;

	private String pageSize;

	private String totalCount;

	private List<DeploymentStatusItem> deploymentStatus;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}

	public List<DeploymentStatusItem> getDeploymentStatus() {
		return this.deploymentStatus;
	}

	public void setDeploymentStatus(List<DeploymentStatusItem> deploymentStatus) {
		this.deploymentStatus = deploymentStatus;
	}

	public static class DeploymentStatusItem {

		private String instanceId;

		private String sDGId;

		private String mountType;

		private String ensRegionId;

		private String status;

		private String phase;

		private String updateTime;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getSDGId() {
			return this.sDGId;
		}

		public void setSDGId(String sDGId) {
			this.sDGId = sDGId;
		}

		public String getMountType() {
			return this.mountType;
		}

		public void setMountType(String mountType) {
			this.mountType = mountType;
		}

		public String getEnsRegionId() {
			return this.ensRegionId;
		}

		public void setEnsRegionId(String ensRegionId) {
			this.ensRegionId = ensRegionId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getPhase() {
			return this.phase;
		}

		public void setPhase(String phase) {
			this.phase = phase;
		}

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}
	}

	@Override
	public DescribeInstanceSDGStatusResponse getInstance(UnmarshallerContext context) {
		return	DescribeInstanceSDGStatusResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
