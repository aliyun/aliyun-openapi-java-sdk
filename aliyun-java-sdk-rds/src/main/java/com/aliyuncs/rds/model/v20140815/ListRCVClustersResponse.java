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

package com.aliyuncs.rds.model.v20140815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.ListRCVClustersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListRCVClustersResponse extends AcsResponse {

	private String requestId;

	private List<VCluster> vClusters;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<VCluster> getVClusters() {
		return this.vClusters;
	}

	public void setVClusters(List<VCluster> vClusters) {
		this.vClusters = vClusters;
	}

	public static class VCluster {

		private Long instanceCount;

		private String vpcId;

		private String clusterId;

		private String regionId;

		private List<String> supportDiskPerformanceLevel;

		public Long getInstanceCount() {
			return this.instanceCount;
		}

		public void setInstanceCount(Long instanceCount) {
			this.instanceCount = instanceCount;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public List<String> getSupportDiskPerformanceLevel() {
			return this.supportDiskPerformanceLevel;
		}

		public void setSupportDiskPerformanceLevel(List<String> supportDiskPerformanceLevel) {
			this.supportDiskPerformanceLevel = supportDiskPerformanceLevel;
		}
	}

	@Override
	public ListRCVClustersResponse getInstance(UnmarshallerContext context) {
		return	ListRCVClustersResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
