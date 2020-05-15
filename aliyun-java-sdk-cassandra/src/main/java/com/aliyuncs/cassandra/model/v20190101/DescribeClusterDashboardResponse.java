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

package com.aliyuncs.cassandra.model.v20190101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cassandra.transform.v20190101.DescribeClusterDashboardResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeClusterDashboardResponse extends AcsResponse {

	private String requestId;

	private Dashboard dashboard;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Dashboard getDashboard() {
		return this.dashboard;
	}

	public void setDashboard(Dashboard dashboard) {
		this.dashboard = dashboard;
	}

	public static class Dashboard {

		private String clusterId;

		private List<DataCenter> dataCenters;

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}

		public List<DataCenter> getDataCenters() {
			return this.dataCenters;
		}

		public void setDataCenters(List<DataCenter> dataCenters) {
			this.dataCenters = dataCenters;
		}

		public static class DataCenter {

			private String dataCenterId;

			private List<Node> nodes;

			public String getDataCenterId() {
				return this.dataCenterId;
			}

			public void setDataCenterId(String dataCenterId) {
				this.dataCenterId = dataCenterId;
			}

			public List<Node> getNodes() {
				return this.nodes;
			}

			public void setNodes(List<Node> nodes) {
				this.nodes = nodes;
			}

			public static class Node {

				private String address;

				private String status;

				private String load;

				public String getAddress() {
					return this.address;
				}

				public void setAddress(String address) {
					this.address = address;
				}

				public String getStatus() {
					return this.status;
				}

				public void setStatus(String status) {
					this.status = status;
				}

				public String getLoad() {
					return this.load;
				}

				public void setLoad(String load) {
					this.load = load;
				}
			}
		}
	}

	@Override
	public DescribeClusterDashboardResponse getInstance(UnmarshallerContext context) {
		return	DescribeClusterDashboardResponseUnmarshaller.unmarshall(this, context);
	}
}
