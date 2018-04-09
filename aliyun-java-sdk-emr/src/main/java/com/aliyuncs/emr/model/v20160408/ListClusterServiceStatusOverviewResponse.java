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

package com.aliyuncs.emr.model.v20160408;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.emr.transform.v20160408.ListClusterServiceStatusOverviewResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListClusterServiceStatusOverviewResponse extends AcsResponse {

	private String requestId;

	private List<ClusterServiceStatusOverview> clusterServiceStatusList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ClusterServiceStatusOverview> getClusterServiceStatusList() {
		return this.clusterServiceStatusList;
	}

	public void setClusterServiceStatusList(List<ClusterServiceStatusOverview> clusterServiceStatusList) {
		this.clusterServiceStatusList = clusterServiceStatusList;
	}

	public static class ClusterServiceStatusOverview {

		private String clusterId;

		private String serviceName;

		private String status;

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}

		public String getServiceName() {
			return this.serviceName;
		}

		public void setServiceName(String serviceName) {
			this.serviceName = serviceName;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
	}

	@Override
	public ListClusterServiceStatusOverviewResponse getInstance(UnmarshallerContext context) {
		return	ListClusterServiceStatusOverviewResponseUnmarshaller.unmarshall(this, context);
	}
}
