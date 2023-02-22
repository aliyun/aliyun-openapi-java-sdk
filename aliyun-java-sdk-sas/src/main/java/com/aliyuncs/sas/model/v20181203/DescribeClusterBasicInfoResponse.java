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

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.DescribeClusterBasicInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeClusterBasicInfoResponse extends AcsResponse {

	private String requestId;

	private ClusterInfo clusterInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public ClusterInfo getClusterInfo() {
		return this.clusterInfo;
	}

	public void setClusterInfo(ClusterInfo clusterInfo) {
		this.clusterInfo = clusterInfo;
	}

	public static class ClusterInfo {

		private Integer instanceCount;

		private String clusterType;

		private String state;

		private Long createTime;

		private String clusterName;

		private String currentVersion;

		private Boolean targetResult;

		private String regionId;

		private String clusterId;

		public Integer getInstanceCount() {
			return this.instanceCount;
		}

		public void setInstanceCount(Integer instanceCount) {
			this.instanceCount = instanceCount;
		}

		public String getClusterType() {
			return this.clusterType;
		}

		public void setClusterType(String clusterType) {
			this.clusterType = clusterType;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public String getClusterName() {
			return this.clusterName;
		}

		public void setClusterName(String clusterName) {
			this.clusterName = clusterName;
		}

		public String getCurrentVersion() {
			return this.currentVersion;
		}

		public void setCurrentVersion(String currentVersion) {
			this.currentVersion = currentVersion;
		}

		public Boolean getTargetResult() {
			return this.targetResult;
		}

		public void setTargetResult(Boolean targetResult) {
			this.targetResult = targetResult;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}
	}

	@Override
	public DescribeClusterBasicInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeClusterBasicInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
